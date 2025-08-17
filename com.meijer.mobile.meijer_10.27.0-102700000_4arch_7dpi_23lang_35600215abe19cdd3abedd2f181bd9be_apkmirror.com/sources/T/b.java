package T;

import C.InterfaceC2966i;
import C.InterfaceC2971n;
import C.p0;
import android.annotation.SuppressLint;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class b implements InterfaceC6029r, InterfaceC2966i {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6030s f34745b;

    /* renamed from: c, reason: collision with root package name */
    private final CameraUseCaseAdapter f34746c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f34744a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f34747d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34748e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34749f = false;

    @Override // C.InterfaceC2966i
    public InterfaceC2971n a() {
        return this.f34746c.a();
    }

    void b(Collection<p0> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f34744a) {
            this.f34746c.j(collection);
        }
    }

    public CameraUseCaseAdapter e() {
        return this.f34746c;
    }

    public InterfaceC6030s j() {
        InterfaceC6030s interfaceC6030s;
        synchronized (this.f34744a) {
            interfaceC6030s = this.f34745b;
        }
        return interfaceC6030s;
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_DESTROY)
    public void onDestroy(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34744a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f34746c;
            cameraUseCaseAdapter.W(cameraUseCaseAdapter.I());
        }
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_PAUSE)
    public void onPause(InterfaceC6030s interfaceC6030s) {
        this.f34746c.f(false);
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_RESUME)
    public void onResume(InterfaceC6030s interfaceC6030s) {
        this.f34746c.f(true);
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_START)
    public void onStart(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34744a) {
            try {
                if (!this.f34748e && !this.f34749f) {
                    this.f34746c.l();
                    this.f34747d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_STOP)
    public void onStop(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34744a) {
            try {
                if (!this.f34748e && !this.f34749f) {
                    this.f34746c.z();
                    this.f34747d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    InterfaceC2971n q() {
        return this.f34746c.F();
    }

    public List<p0> r() {
        List<p0> listUnmodifiableList;
        synchronized (this.f34744a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f34746c.I());
        }
        return listUnmodifiableList;
    }

    public boolean s(p0 p0Var) {
        boolean zContains;
        synchronized (this.f34744a) {
            zContains = this.f34746c.I().contains(p0Var);
        }
        return zContains;
    }

    public void t() {
        synchronized (this.f34744a) {
            try {
                if (this.f34748e) {
                    return;
                }
                onStop(this.f34745b);
                this.f34748e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u() {
        synchronized (this.f34744a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f34746c;
            cameraUseCaseAdapter.W(cameraUseCaseAdapter.I());
        }
    }

    public void v() {
        synchronized (this.f34744a) {
            try {
                if (this.f34748e) {
                    this.f34748e = false;
                    if (this.f34745b.getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
                        onStart(this.f34745b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(InterfaceC6030s interfaceC6030s, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f34745b = interfaceC6030s;
        this.f34746c = cameraUseCaseAdapter;
        if (interfaceC6030s.getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
            cameraUseCaseAdapter.l();
        } else {
            cameraUseCaseAdapter.z();
        }
        interfaceC6030s.getLifecycle().a(this);
    }
}
