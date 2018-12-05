package com.netlogo.trustmodel.domain;

import lombok.val;
import org.nlogo.headless.HeadlessWorkspace;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class HeadlessWorkspaceWrapperFactory {
    @Value("${netlogo-wrapper.model-file-path}")
    private String modelFilePath;

    public HeadlessWorkspaceWrapper create() throws IOException {
        val workspace = HeadlessWorkspace.newInstance();

        workspace.open(modelFilePath);

        return new HeadlessWorkspaceWrapper(workspace);
    }

    @PostConstruct
    private void init() throws FileNotFoundException {
        Assert.isTrue(ResourceUtils.getFile(modelFilePath).exists(), "file must exist at modelFilePath: " + modelFilePath);
    }
}
