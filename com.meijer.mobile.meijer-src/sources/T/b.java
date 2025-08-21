package T;

import C.InterfaceC3024i;
import C.InterfaceC3029n;
import C.p0;
import android.annotation.SuppressLint;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class b implements InterfaceC6171r, InterfaceC3024i {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6172s f35840b;

    /* renamed from: c, reason: collision with root package name */
    private final CameraUseCaseAdapter f35841c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f35839a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f35842d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35843e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35844f = false;

    @Override // C.InterfaceC3024i
    public InterfaceC3029n a() {
        return this.f35841c.a();
    }

    void b(Collection<p0> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f35839a) {
            this.f35841c.j(collection);
        }
    }

    public CameraUseCaseAdapter e() {
        return this.f35841c;
    }

    public InterfaceC6172s j() {
        InterfaceC6172s interfaceC6172s;
        synchronized (this.f35839a) {
            interfaceC6172s = this.f35840b;
        }
        return interfaceC6172s;
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_DESTROY)
    public void onDestroy(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35839a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f35841c;
            cameraUseCaseAdapter.W(cameraUseCaseAdapter.I());
        }
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_PAUSE)
    public void onPause(InterfaceC6172s interfaceC6172s) {
        this.f35841c.f(false);
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_RESUME)
    public void onResume(InterfaceC6172s interfaceC6172s) {
        this.f35841c.f(true);
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_START)
    public void onStart(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35839a) {
            try {
                if (!this.f35843e && !this.f35844f) {
                    this.f35841c.l();
                    this.f35842d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_STOP)
    public void onStop(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35839a) {
            try {
                if (!this.f35843e && !this.f35844f) {
                    this.f35841c.z();
                    this.f35842d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    InterfaceC3029n q() {
        return this.f35841c.F();
    }

    public List<p0> r() {
        List<p0> listUnmodifiableList;
        synchronized (this.f35839a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f35841c.I());
        }
        return listUnmodifiableList;
    }

    public boolean s(p0 p0Var) {
        boolean zContains;
        synchronized (this.f35839a) {
            zContains = this.f35841c.I().contains(p0Var);
        }
        return zContains;
    }

    public void t() {
        synchronized (this.f35839a) {
            try {
                if (this.f35843e) {
                    return;
                }
                onStop(this.f35840b);
                this.f35843e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u() {
        synchronized (this.f35839a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f35841c;
            cameraUseCaseAdapter.W(cameraUseCaseAdapter.I());
        }
    }

    public void v() {
        synchronized (this.f35839a) {
            try {
                if (this.f35843e) {
                    this.f35843e = false;
                    if (this.f35840b.getLifecycle().getState().b(AbstractC6165l.b.f55502d)) {
                        onStart(this.f35840b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(InterfaceC6172s interfaceC6172s, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f35840b = interfaceC6172s;
        this.f35841c = cameraUseCaseAdapter;
        if (interfaceC6172s.getLifecycle().getState().b(AbstractC6165l.b.f55502d)) {
            cameraUseCaseAdapter.l();
        } else {
            cameraUseCaseAdapter.z();
        }
        interfaceC6172s.getLifecycle().a(this);
    }
}
