package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class r extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f126066a;

    public r(C13502s parent) {
        Intrinsics.j(parent, "parent");
        this.f126066a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData cameraFrameData) {
        Intrinsics.j(cameraFrameData, "frameData");
        C13502s c13502s = (C13502s) this.f126066a.get();
        if (c13502s != null) {
            Intrinsics.j(cameraFrameData, "cameraFrame");
            byte[] bArrTakeBuffer = cameraFrameData.takeBuffer();
            HandlerC13501q handlerC13501q = c13502s.f126073g;
            handlerC13501q.sendMessage(handlerC13501q.obtainMessage(0, bArrTakeBuffer));
            J j10 = c13502s.f126074h;
            j10.getClass();
            Intrinsics.j(cameraFrameData, "cameraFrameData");
            if (j10.f125737b.size() < j10.f125736a) {
                j10.f125737b.push(cameraFrameData);
            }
        }
    }
}
