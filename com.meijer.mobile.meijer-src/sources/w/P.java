package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class P extends T {
    P(Context context) {
        super(context, null);
    }

    static P i(Context context) {
        return new P(context);
    }

    private boolean j(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && k(th2);
    }

    private void l(Throwable th2) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    @Override // w.T, w.O.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f166389a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // w.T, w.O.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            this.f166389a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (j(e13)) {
                l(e13);
            }
            throw e13;
        }
    }

    @Override // w.T, w.O.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f166389a.unregisterAvailabilityCallback(availabilityCallback);
    }

    private static boolean k(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // w.T, w.O.b
    public CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return super.b(str);
        } catch (RuntimeException e10) {
            if (j(e10)) {
                l(e10);
            }
            throw e10;
        }
    }
}
