package com.scandit.datacapture.core.internal.sdk;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/OcrBackendGuard;", "", "Lcom/scandit/datacapture/core/internal/sdk/OcrBackend;", "backend", "", "setBackend", "(Lcom/scandit/datacapture/core/internal/sdk/OcrBackend;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class OcrBackendGuard {
    public static final OcrBackendGuard INSTANCE = new OcrBackendGuard();

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference f126295a = new WeakReference(null);

    public final void setBackend(OcrBackend backend) {
        Intrinsics.j(backend, "backend");
        OcrBackend ocrBackend = (OcrBackend) f126295a.get();
        if (ocrBackend != null) {
            ocrBackend.deinitialize();
        }
        f126295a = new WeakReference(backend);
    }

    private OcrBackendGuard() {
    }
}
