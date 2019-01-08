package au.edu.unimelb.eresearch.netlogo.clawmodel.backend.domain;

import au.edu.unimelb.eresearch.netlogo.clawmodel.backend.services.ModelService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.nlogo.headless.HeadlessWorkspace;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class HeadlessWorkspaceWrapperFactory {
    @NonNull
    private final ModelService modelService;

    public HeadlessWorkspaceWrapper create() throws IOException {
        val workspace = HeadlessWorkspace.newInstance();

        workspace.open(modelService.getModelFilePath());

        return new HeadlessWorkspaceWrapper(workspace);
    }

    @PostConstruct
    private void init() throws FileNotFoundException {
        Assert.isTrue(
                ResourceUtils.getFile(modelService.getModelFilePath()).exists(),
                "file must exist at modelFilePath: " + modelService.getModelFilePath()
        );
    }
}
