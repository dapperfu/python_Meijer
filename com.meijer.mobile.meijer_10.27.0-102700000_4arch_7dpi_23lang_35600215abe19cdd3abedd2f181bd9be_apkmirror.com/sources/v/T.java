package v;

import C.AbstractC2973p;
import F.AbstractC3611h;
import F.InterfaceC3627y;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.view.AbstractC5985A;
import androidx.view.C5986B;
import androidx.view.InterfaceC5989E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class T implements InterfaceC3627y {

    /* renamed from: a, reason: collision with root package name */
    private final String f163863a;

    /* renamed from: b, reason: collision with root package name */
    private final w.B f163864b;

    /* renamed from: c, reason: collision with root package name */
    private final B.h f163865c;

    /* renamed from: e, reason: collision with root package name */
    private C17418u f163867e;

    /* renamed from: h, reason: collision with root package name */
    private final a<AbstractC2973p> f163870h;

    /* renamed from: j, reason: collision with root package name */
    private final F.l0 f163872j;

    /* renamed from: k, reason: collision with root package name */
    private final F.N f163873k;

    /* renamed from: l, reason: collision with root package name */
    private final w.O f163874l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f163866d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a<Integer> f163868f = null;

    /* renamed from: g, reason: collision with root package name */
    private a<C.s0> f163869g = null;

    /* renamed from: i, reason: collision with root package name */
    private List<Pair<AbstractC3611h, Executor>> f163871i = null;

    static class a<T> extends C5986B<T> {

        /* renamed from: m, reason: collision with root package name */
        private AbstractC5985A<T> f163875m;

        /* renamed from: n, reason: collision with root package name */
        private final T f163876n;

        @Override // androidx.view.AbstractC5985A
        public T e() {
            AbstractC5985A<T> abstractC5985A = this.f163875m;
            return abstractC5985A == null ? this.f163876n : abstractC5985A.e();
        }

        @Override // androidx.view.C5986B
        public <S> void p(AbstractC5985A<S> abstractC5985A, InterfaceC5989E<? super S> interfaceC5989E) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void r(AbstractC5985A<T> abstractC5985A) {
            AbstractC5985A<T> abstractC5985A2 = this.f163875m;
            if (abstractC5985A2 != null) {
                super.q(abstractC5985A2);
            }
            this.f163875m = abstractC5985A;
            super.p(abstractC5985A, new InterfaceC5989E() { // from class: v.S
                @Override // androidx.view.InterfaceC5989E
                public final void onChanged(Object obj) {
                    this.f163857a.o(obj);
                }
            });
        }

        a(T t10) {
            this.f163876n = t10;
        }
    }

    @Override // C.InterfaceC2971n
    public int a() {
        return h(0);
    }

    @Override // F.InterfaceC3627y
    public String b() {
        return this.f163863a;
    }

    @Override // F.InterfaceC3627y
    public List<Size> c(int i10) {
        Size[] sizeArrA = this.f163864b.b().a(i10);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // F.InterfaceC3627y
    public F.l0 d() {
        return this.f163872j;
    }

    @Override // F.InterfaceC3627y
    public List<Size> e(int i10) {
        Size[] sizeArrC = this.f163864b.b().c(i10);
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // F.InterfaceC3627y
    public void f(AbstractC3611h abstractC3611h) {
        synchronized (this.f163866d) {
            try {
                C17418u c17418u = this.f163867e;
                if (c17418u != null) {
                    c17418u.R(abstractC3611h);
                    return;
                }
                List<Pair<AbstractC3611h, Executor>> list = this.f163871i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC3611h, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC3611h) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.InterfaceC2971n
    public int getLensFacing() {
        Integer num = (Integer) this.f163864b.a(CameraCharacteristics.LENS_FACING);
        o2.i.b(num != null, "Unable to get the lens facing of the camera.");
        return C17423v1.a(num.intValue());
    }

    @Override // F.InterfaceC3627y
    public void i(Executor executor, AbstractC3611h abstractC3611h) {
        synchronized (this.f163866d) {
            try {
                C17418u c17418u = this.f163867e;
                if (c17418u != null) {
                    c17418u.u(executor, abstractC3611h);
                    return;
                }
                if (this.f163871i == null) {
                    this.f163871i = new ArrayList();
                }
                this.f163871i.add(new Pair<>(abstractC3611h, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public B.h j() {
        return this.f163865c;
    }

    public w.B k() {
        return this.f163864b;
    }

    int l() {
        Integer num = (Integer) this.f163864b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        o2.i.g(num);
        return num.intValue();
    }

    int m() {
        Integer num = (Integer) this.f163864b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        o2.i.g(num);
        return num.intValue();
    }

    void n(C17418u c17418u) {
        synchronized (this.f163866d) {
            try {
                this.f163867e = c17418u;
                a<C.s0> aVar = this.f163869g;
                if (aVar != null) {
                    aVar.r(c17418u.I().d());
                }
                a<Integer> aVar2 = this.f163868f;
                if (aVar2 != null) {
                    aVar2.r(this.f163867e.G().c());
                }
                List<Pair<AbstractC3611h, Executor>> list = this.f163871i;
                if (list != null) {
                    for (Pair<AbstractC3611h, Executor> pair : list) {
                        this.f163867e.u((Executor) pair.second, (AbstractC3611h) pair.first);
                    }
                    this.f163871i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o();
    }

    void q(AbstractC5985A<AbstractC2973p> abstractC5985A) {
        this.f163870h.r(abstractC5985A);
    }

    public T(String str, w.O o10) throws CameraAccessExceptionCompat {
        String str2 = (String) o2.i.g(str);
        this.f163863a = str2;
        this.f163874l = o10;
        w.B bC = o10.c(str2);
        this.f163864b = bC;
        this.f163865c = new B.h(this);
        F.l0 l0VarA = androidx.camera.camera2.internal.compat.quirk.a.a(str, bC);
        this.f163872j = l0VarA;
        this.f163873k = new G0(str, l0VarA);
        this.f163870h = new a<>(AbstractC2973p.a(AbstractC2973p.b.CLOSED));
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

    @Override // C.InterfaceC2971n
    public String g() {
        if (m() == 2) {
            return "androidx.camera.camera2.legacy";
        }
        return "androidx.camera.camera2";
    }

    @Override // C.InterfaceC2971n
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
