package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.fullstory.FS;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class T extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f125809a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f125810b;

    public T(C13468h c13468h) {
        this.f125810b = c13468h;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice camera) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        Intrinsics.j("CameraDevice disconnected", "message");
        FS.log_e("sdc-core", "CameraDevice disconnected");
        if (this.f125809a.compareAndSet(false, true)) {
            ((C13468h) this.f125810b).a();
            return;
        }
        C13468h c13468h = (C13468h) this.f125810b;
        if (c13468h.f125855a) {
            c13468h.f125856b.f125906c.invoke(FrameSourceState.OFF);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice camera, int i10) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        Intrinsics.j("Failed to open camera with camera API 2", "message");
        FS.log_e("sdc-core", "Failed to open camera with camera API 2");
        if (this.f125809a.compareAndSet(false, true)) {
            ((C13468h) this.f125810b).a();
            return;
        }
        C13468h c13468h = (C13468h) this.f125810b;
        if (c13468h.f125855a) {
            c13468h.f125856b.f125906c.invoke(FrameSourceState.OFF);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice camera) throws CameraAccessException {
        Intrinsics.j(camera, "camera");
        if (this.f125809a.compareAndSet(false, true)) {
            C13468h c13468h = (C13468h) this.f125810b;
            c13468h.getClass();
            Intrinsics.j(camera, "camera");
            if (c13468h.f125855a) {
                C13476p c13476p = c13468h.f125856b;
                c13476p.f125914k = camera;
                i0 i0Var = c13468h.f125857c;
                Function1 function1 = c13468h.f125858d;
                p0 p0Var = c13476p.f125913j;
                Handler handlerA = c13476p.a();
                if (camera == null || p0Var == null || handlerA == null) {
                    return;
                }
                InterfaceC13461b0 interfaceC13461b0 = c13476p.f125915l;
                if (interfaceC13461b0 != null) {
                    ((d0) interfaceC13461b0).b();
                }
                ((D) c13476p.f125909f).a(handlerA, camera, c13476p.f125904a, p0Var, i0Var, new C13473m(function1, c13476p, p0Var));
            }
        }
    }
}
