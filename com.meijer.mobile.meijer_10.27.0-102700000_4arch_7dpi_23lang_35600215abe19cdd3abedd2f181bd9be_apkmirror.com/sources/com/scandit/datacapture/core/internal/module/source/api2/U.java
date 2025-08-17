package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class U implements S {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f124859a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f124860b;

    public U(CameraManager cameraManager) {
        Intrinsics.j(cameraManager, "cameraManager");
        this.f124859a = cameraManager;
        this.f124860b = new WeakReference(null);
    }

    public final void a(Handler handler, String cameraId, C13335h callback) {
        Intrinsics.j(handler, "handler");
        Intrinsics.j(cameraId, "cameraId");
        Intrinsics.j(callback, "callback");
        try {
            Q q10 = (Q) this.f124860b.get();
            if (q10 != null) {
                ((C13335h) q10).f124903a = false;
            }
            this.f124860b = new WeakReference(callback);
            this.f124859a.openCamera(cameraId, new T(callback), handler);
        } catch (CameraAccessException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            callback.a();
        } catch (IllegalArgumentException e11) {
            Intrinsics.j(e11, "e");
            e11.printStackTrace();
            callback.a();
        } catch (SecurityException e12) {
            Intrinsics.j(e12, "e");
            e12.printStackTrace();
            callback.a();
        }
    }
}
