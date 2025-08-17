package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13346t extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124991a;

    public C13346t(C13348v parent) {
        Intrinsics.j(parent, "parent");
        this.f124991a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData cameraFrameData) {
        Intrinsics.j(cameraFrameData, "frameData");
        C13348v c13348v = (C13348v) this.f124991a.get();
        if (c13348v != null) {
            com.scandit.datacapture.core.internal.module.source.J j10 = c13348v.f125000a;
            j10.getClass();
            Intrinsics.j(cameraFrameData, "cameraFrameData");
            if (j10.f124785b.size() < j10.f124784a) {
                j10.f124785b.push(cameraFrameData);
            }
        }
    }
}
