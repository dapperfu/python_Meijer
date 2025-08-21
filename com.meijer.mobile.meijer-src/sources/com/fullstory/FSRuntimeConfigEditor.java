package com.fullstory;

/* loaded from: classes.dex */
public interface FSRuntimeConfigEditor {

    @FunctionalInterface
    public interface Applier {
        void apply(FSRuntimeConfigEditor fSRuntimeConfigEditor);
    }

    FSRuntimeConfigEditor previewMode(boolean z10);

    FSRuntimeConfigEditor reset();
}
