package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import w.C;
import w.O;

/* loaded from: classes.dex */
class T implements O.b {

    /* renamed from: a, reason: collision with root package name */
    final CameraManager f165178a;

    /* renamed from: b, reason: collision with root package name */
    final Object f165179b;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<CameraManager.AvailabilityCallback, O.a> f165180a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Handler f165181b;

        a(Handler handler) {
            this.f165181b = handler;
        }
    }

    static T h(Context context, Handler handler) {
        return new T(context, new a(handler));
    }

    @Override // w.O.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f165179b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f165180a) {
                try {
                    aVar = aVar2.f165180a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new O.a(executor, availabilityCallback);
                        aVar2.f165180a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f165178a.registerAvailabilityCallback(aVar, aVar2.f165181b);
    }

    @Override // w.O.b
    public CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f165178a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    @Override // w.O.b
    public Set<Set<String>> c() throws CameraAccessExceptionCompat {
        return Collections.EMPTY_SET;
    }

    @Override // w.O.b
    public String[] e() throws CameraAccessExceptionCompat {
        try {
            return this.f165178a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    @Override // w.O.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f165179b;
            synchronized (aVar.f165180a) {
                aVarRemove = aVar.f165180a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            aVarRemove.d();
        }
        this.f165178a.unregisterAvailabilityCallback(aVarRemove);
    }

    T(Context context, Object obj) {
        this.f165178a = (CameraManager) context.getSystemService("camera");
        this.f165179b = obj;
    }

    @Override // w.O.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        o2.i.g(executor);
        o2.i.g(stateCallback);
        try {
            this.f165178a.openCamera(str, new C.b(executor, stateCallback), ((a) this.f165179b).f165181b);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }
}
