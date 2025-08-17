package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureVersion;", "", "", "name", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "VERSION_STRING", "Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DataCaptureVersion {
    public static final DataCaptureVersion INSTANCE = new DataCaptureVersion();

    @JvmField
    public static final String VERSION_STRING;

    static {
        String version = NativeDataCaptureContext.getVersion();
        Intrinsics.i(version, "getVersion(...)");
        VERSION_STRING = version;
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        if (Intrinsics.e(name, "lowLevelVersionString")) {
            return NativeDataCaptureContext.getEngineVersionNumber();
        }
        if (Intrinsics.e(name, "lowLevelBuildString")) {
            return NativeDataCaptureContext.getEngineCommitHash();
        }
        return null;
    }

    private DataCaptureVersion() {
    }
}
