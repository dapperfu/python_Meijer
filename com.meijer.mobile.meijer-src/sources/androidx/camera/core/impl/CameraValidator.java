package androidx.camera.core.impl;

import C.C3030o;
import C.P;
import F.InterfaceC3290z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CameraValidator {

    /* renamed from: a, reason: collision with root package name */
    private static final C3030o f47541a = new C3030o.a().b(2).a();

    public static class CameraIdListIncorrectException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private int f47542a;

        public int a() {
            return this.f47542a;
        }

        public CameraIdListIncorrectException(String str, int i10, Throwable th2) {
            super(str, th2);
            this.f47542a = i10;
        }
    }

    private static class a {
        static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static void a(Context context, F.B b10, C3030o c3030o) throws CameraIdListIncorrectException {
        Integer numD;
        int i10 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<InterfaceC3290z> linkedHashSetA = b10.a();
            if (linkedHashSetA.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            P.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + linkedHashSetA.size() + " cameras. Skipping validation.");
            return;
        }
        if (c3030o != null) {
            try {
                numD = c3030o.d();
                if (numD == null) {
                    P.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                P.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            numD = null;
        }
        P.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c3030o == null || numD.intValue() == 1)) {
                C3030o.f3867d.e(b10.a());
                i10 = 1;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            P.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c3030o == null || numD.intValue() == 0)) {
                C3030o.f3866c.e(b10.a());
                i10++;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            P.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f47541a.e(b10.a());
            P.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        P.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + b10.a());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i10, illegalArgumentException);
    }
}
