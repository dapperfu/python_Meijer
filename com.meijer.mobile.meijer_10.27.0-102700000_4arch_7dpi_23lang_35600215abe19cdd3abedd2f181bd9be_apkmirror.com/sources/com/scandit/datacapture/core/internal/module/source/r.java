package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class r extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125114a;

    public r(C13369s parent) {
        Intrinsics.j(parent, "parent");
        this.f125114a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData cameraFrameData) {
        Intrinsics.j(cameraFrameData, "frameData");
        C13369s c13369s = (C13369s) this.f125114a.get();
        if (c13369s != null) {
            Intrinsics.j(cameraFrameData, "cameraFrame");
            byte[] bArrTakeBuffer = cameraFrameData.takeBuffer();
            HandlerC13368q handlerC13368q = c13369s.f125121g;
            handlerC13368q.sendMessage(handlerC13368q.obtainMessage(0, bArrTakeBuffer));
            J j10 = c13369s.f125122h;
            j10.getClass();
            Intrinsics.j(cameraFrameData, "cameraFrameData");
            if (j10.f124785b.size() < j10.f124784a) {
                j10.f124785b.push(cameraFrameData);
            }
        }
    }
}
