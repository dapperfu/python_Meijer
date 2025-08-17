package w;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final b f165172a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, B> f165173b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f165174a;

        /* renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f165175b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f165176c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private boolean f165177d = false;

        void d() {
            synchronized (this.f165176c) {
                this.f165177d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f165176c) {
                try {
                    if (!this.f165177d) {
                        this.f165174a.execute(new Runnable() { // from class: w.M
                            @Override // java.lang.Runnable
                            public final void run() {
                                C17676g.a(this.f165169a.f165175b);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f165176c) {
                try {
                    if (!this.f165177d) {
                        this.f165174a.execute(new Runnable() { // from class: w.L
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f165167a.f165175b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f165176c) {
                try {
                    if (!this.f165177d) {
                        this.f165174a.execute(new Runnable() { // from class: w.N
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f165170a.f165175b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f165174a = executor;
            this.f165175b = availabilityCallback;
        }
    }

    public interface b {
        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics b(String str) throws CameraAccessExceptionCompat;

        Set<Set<String>> c() throws CameraAccessExceptionCompat;

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        String[] e() throws CameraAccessExceptionCompat;

        void f(CameraManager.AvailabilityCallback availabilityCallback);

        static b g(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new S(context) : i10 >= 29 ? new Q(context) : i10 >= 28 ? P.i(context) : T.h(context, handler);
        }
    }

    public static O b(Context context, Handler handler) {
        return new O(b.g(context, handler));
    }

    public B c(String str) throws CameraAccessExceptionCompat {
        B bE;
        synchronized (this.f165173b) {
            bE = this.f165173b.get(str);
            if (bE == null) {
                try {
                    bE = B.e(this.f165172a.b(str), str);
                    this.f165173b.put(str, bE);
                } catch (AssertionError e10) {
                    throw new CameraAccessExceptionCompat(10002, e10.getMessage(), e10);
                }
            }
        }
        return bE;
    }

    public String[] d() throws CameraAccessExceptionCompat {
        return this.f165172a.e();
    }

    public Set<Set<String>> e() throws CameraAccessExceptionCompat {
        return this.f165172a.c();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.f165172a.d(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f165172a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f165172a.f(availabilityCallback);
    }

    private O(b bVar) {
        this.f165172a = bVar;
    }

    public static O a(Context context) {
        return b(context, G.l.a());
    }
}
