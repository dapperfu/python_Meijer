package com.scandit.datacapture.core.init;

import com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/init/DataCaptureCoreLibrary;", "", "Lcom/scandit/datacapture/core/init/InitializationState;", "getInitializationState", "()Lcom/scandit/datacapture/core/init/InitializationState;", "getInitializationState$annotations", "()V", "initializationState", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DataCaptureCoreLibrary {
    public static final DataCaptureCoreLibrary INSTANCE = new DataCaptureCoreLibrary();

    @JvmStatic
    public static /* synthetic */ void getInitializationState$annotations() {
    }

    public static final InitializationState getInitializationState() {
        LibraryLoaderInternal instance$scandit_capture_core = LibraryLoaderInternal.INSTANCE.getInstance$scandit_capture_core();
        Boolean boolValueOf = instance$scandit_capture_core != null ? Boolean.valueOf(instance$scandit_capture_core.getLoadingFailed()) : null;
        if (Intrinsics.e(boolValueOf, Boolean.TRUE)) {
            return InitializationState.ERROR_INITIALIZING;
        }
        if (Intrinsics.e(boolValueOf, Boolean.FALSE)) {
            return InitializationState.INITIALIZED;
        }
        if (boolValueOf == null) {
            return InitializationState.NOT_YET_INITIALIZED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private DataCaptureCoreLibrary() {
    }
}
