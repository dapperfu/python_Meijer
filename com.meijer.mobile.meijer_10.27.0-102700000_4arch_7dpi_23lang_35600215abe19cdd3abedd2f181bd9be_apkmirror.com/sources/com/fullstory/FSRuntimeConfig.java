package com.fullstory;

import com.fullstory.FSRuntimeConfigEditor;

/* loaded from: classes.dex */
public class FSRuntimeConfig {
    private FSRuntimeConfig() {
    }

    public static boolean edit(FSRuntimeConfigEditor.Applier applier) {
        return FS.__reconfigure(applier);
    }

    public static boolean isPreviewMode() {
        return FS.__isPreviewMode();
    }
}
