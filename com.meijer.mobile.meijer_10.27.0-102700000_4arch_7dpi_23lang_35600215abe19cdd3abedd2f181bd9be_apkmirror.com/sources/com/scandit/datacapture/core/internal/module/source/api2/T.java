package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.fullstory.FS;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class T extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f124857a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f124858b;

    public T(C13335h c13335h) {
        this.f124858b = c13335h;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice camera) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        Intrinsics.j("CameraDevice disconnected", "message");
        FS.log_e("sdc-core", "CameraDevice disconnected");
        if (this.f124857a.compareAndSet(false, true)) {
            ((C13335h) this.f124858b).a();
            return;
        }
        C13335h c13335h = (C13335h) this.f124858b;
        if (c13335h.f124903a) {
            c13335h.f124904b.f124954c.invoke(FrameSourceState.OFF);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice camera, int i10) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        Intrinsics.j("Failed to open camera with camera API 2", "message");
        FS.log_e("sdc-core", "Failed to open camera with camera API 2");
        if (this.f124857a.compareAndSet(false, true)) {
            ((C13335h) this.f124858b).a();
            return;
        }
        C13335h c13335h = (C13335h) this.f124858b;
        if (c13335h.f124903a) {
            c13335h.f124904b.f124954c.invoke(FrameSourceState.OFF);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice camera) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        if (this.f124857a.compareAndSet(false, true)) {
            C13335h c13335h = (C13335h) this.f124858b;
            c13335h.getClass();
            Intrinsics.j(camera, "camera");
            if (c13335h.f124903a) {
                C13343p c13343p = c13335h.f124904b;
                c13343p.f124962k = camera;
                i0 i0Var = c13335h.f124905c;
                Function1 function1 = c13335h.f124906d;
                p0 p0Var = c13343p.f124961j;
                Handler handlerA = c13343p.a();
                if (camera == null || p0Var == null || handlerA == null) {
                    return;
                }
                InterfaceC13328b0 interfaceC13328b0 = c13343p.f124963l;
                if (interfaceC13328b0 != null) {
                    ((d0) interfaceC13328b0).b();
                }
                ((D) c13343p.f124957f).a(handlerA, camera, c13343p.f124952a, p0Var, i0Var, new C13340m(function1, c13343p, p0Var));
            }
        }
    }
}
