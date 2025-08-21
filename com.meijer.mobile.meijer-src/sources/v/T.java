package v;

import C.AbstractC3031p;
import F.AbstractC3273h;
import F.InterfaceC3289y;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.view.AbstractC6127A;
import androidx.view.C6128B;
import androidx.view.InterfaceC6131E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class T implements InterfaceC3289y {

    /* renamed from: a, reason: collision with root package name */
    private final String f164897a;

    /* renamed from: b, reason: collision with root package name */
    private final w.B f164898b;

    /* renamed from: c, reason: collision with root package name */
    private final B.h f164899c;

    /* renamed from: e, reason: collision with root package name */
    private C17557u f164901e;

    /* renamed from: h, reason: collision with root package name */
    private final a<AbstractC3031p> f164904h;

    /* renamed from: j, reason: collision with root package name */
    private final F.l0 f164906j;

    /* renamed from: k, reason: collision with root package name */
    private final F.N f164907k;

    /* renamed from: l, reason: collision with root package name */
    private final w.O f164908l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f164900d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a<Integer> f164902f = null;

    /* renamed from: g, reason: collision with root package name */
    private a<C.s0> f164903g = null;

    /* renamed from: i, reason: collision with root package name */
    private List<Pair<AbstractC3273h, Executor>> f164905i = null;

    static class a<T> extends C6128B<T> {

        /* renamed from: m, reason: collision with root package name */
        private AbstractC6127A<T> f164909m;

        /* renamed from: n, reason: collision with root package name */
        private final T f164910n;

        @Override // androidx.view.AbstractC6127A
        public T e() {
            AbstractC6127A<T> abstractC6127A = this.f164909m;
            return abstractC6127A == null ? this.f164910n : abstractC6127A.e();
        }

        @Override // androidx.view.C6128B
        public <S> void p(AbstractC6127A<S> abstractC6127A, InterfaceC6131E<? super S> interfaceC6131E) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void r(AbstractC6127A<T> abstractC6127A) {
            AbstractC6127A<T> abstractC6127A2 = this.f164909m;
            if (abstractC6127A2 != null) {
                super.q(abstractC6127A2);
            }
            this.f164909m = abstractC6127A;
            super.p(abstractC6127A, new InterfaceC6131E() { // from class: v.S
                @Override // androidx.view.InterfaceC6131E
                public final void onChanged(Object obj) {
                    this.f164891a.o(obj);
                }
            });
        }

        a(T t10) {
            this.f164910n = t10;
        }
    }

    @Override // C.InterfaceC3029n
    public int a() {
        return h(0);
    }

    @Override // F.InterfaceC3289y
    public String b() {
        return this.f164897a;
    }

    @Override // F.InterfaceC3289y
    public List<Size> c(int i10) {
        Size[] sizeArrA = this.f164898b.b().a(i10);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // F.InterfaceC3289y
    public F.l0 d() {
        return this.f164906j;
    }

    @Override // F.InterfaceC3289y
    public List<Size> e(int i10) {
        Size[] sizeArrC = this.f164898b.b().c(i10);
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // F.InterfaceC3289y
    public void f(AbstractC3273h abstractC3273h) {
        synchronized (this.f164900d) {
            try {
                C17557u c17557u = this.f164901e;
                if (c17557u != null) {
                    c17557u.R(abstractC3273h);
                    return;
                }
                List<Pair<AbstractC3273h, Executor>> list = this.f164905i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC3273h, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC3273h) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.InterfaceC3029n
    public int getLensFacing() {
        Integer num = (Integer) this.f164898b.a(CameraCharacteristics.LENS_FACING);
        o2.i.b(num != null, "Unable to get the lens facing of the camera.");
        return C17562v1.a(num.intValue());
    }

    @Override // F.InterfaceC3289y
    public void i(Executor executor, AbstractC3273h abstractC3273h) {
        synchronized (this.f164900d) {
            try {
                C17557u c17557u = this.f164901e;
                if (c17557u != null) {
                    c17557u.u(executor, abstractC3273h);
                    return;
                }
                if (this.f164905i == null) {
                    this.f164905i = new ArrayList();
                }
                this.f164905i.add(new Pair<>(abstractC3273h, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public B.h j() {
        return this.f164899c;
    }

    public w.B k() {
        return this.f164898b;
    }

    int l() {
        Integer num = (Integer) this.f164898b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        o2.i.g(num);
        return num.intValue();
    }

    int m() {
        Integer num = (Integer) this.f164898b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        o2.i.g(num);
        return num.intValue();
    }

    void n(C17557u c17557u) {
        synchronized (this.f164900d) {
            try {
                this.f164901e = c17557u;
                a<C.s0> aVar = this.f164903g;
                if (aVar != null) {
                    aVar.r(c17557u.I().d());
                }
                a<Integer> aVar2 = this.f164902f;
                if (aVar2 != null) {
                    aVar2.r(this.f164901e.G().c());
                }
                List<Pair<AbstractC3273h, Executor>> list = this.f164905i;
                if (list != null) {
                    for (Pair<AbstractC3273h, Executor> pair : list) {
                        this.f164901e.u((Executor) pair.second, (AbstractC3273h) pair.first);
                    }
                    this.f164905i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o();
    }

    void q(AbstractC6127A<AbstractC3031p> abstractC6127A) {
        this.f164904h.r(abstractC6127A);
    }

    public T(String str, w.O o10) throws CameraAccessExceptionCompat {
        String str2 = (String) o2.i.g(str);
        this.f164897a = str2;
        this.f164908l = o10;
        w.B bC = o10.c(str2);
        this.f164898b = bC;
        this.f164899c = new B.h(this);
        F.l0 l0VarA = androidx.camera.camera2.internal.compat.quirk.a.a(str, bC);
        this.f164906j = l0VarA;
        this.f164907k = new G0(str, l0VarA);
        this.f164904h = new a<>(AbstractC3031p.a(AbstractC3031p.b.CLOSED));
    }

    private void o() {
        p();
    }

    private void p() {
        String str;
        int iM = m();
        if (iM != 0) {
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            str = "Unknown value: " + iM;
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        C.P.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // C.InterfaceC3029n
    public String g() {
        if (m() == 2) {
            return "androidx.camera.camera2.legacy";
        }
        return "androidx.camera.camera2";
    }

    @Override // C.InterfaceC3029n
    public int h(int i10) {
        int iL = l();
        int iB = G.c.b(i10);
        boolean z10 = true;
        if (1 != getLensFacing()) {
            z10 = false;
        }
        return G.c.a(iB, iL, z10);
    }
}
