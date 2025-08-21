package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13479t extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125943a;

    public C13479t(C13481v parent) {
        Intrinsics.j(parent, "parent");
        this.f125943a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData cameraFrameData) {
        Intrinsics.j(cameraFrameData, "frameData");
        C13481v c13481v = (C13481v) this.f125943a.get();
        if (c13481v != null) {
            com.scandit.datacapture.core.internal.module.source.J j10 = c13481v.f125952a;
            j10.getClass();
            Intrinsics.j(cameraFrameData, "cameraFrameData");
            if (j10.f125737b.size() < j10.f125736a) {
                j10.f125737b.push(cameraFrameData);
            }
        }
    }
}
