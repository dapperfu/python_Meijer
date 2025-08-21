package Oc;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.BinderC10186yl;
import com.google.android.gms.internal.ads.BinderC7011Kb;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Oc.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4402i1 {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC10186yl f23465a;

    /* renamed from: b, reason: collision with root package name */
    private final c2 f23466b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f23467c;

    /* renamed from: d, reason: collision with root package name */
    private final Gc.r f23468d;

    /* renamed from: e, reason: collision with root package name */
    final C4450z f23469e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4376a f23470f;

    /* renamed from: g, reason: collision with root package name */
    private Gc.c f23471g;

    /* renamed from: h, reason: collision with root package name */
    private Gc.e[] f23472h;

    /* renamed from: i, reason: collision with root package name */
    private Hc.c f23473i;

    /* renamed from: j, reason: collision with root package name */
    private V f23474j;

    /* renamed from: k, reason: collision with root package name */
    private Gc.s f23475k;

    /* renamed from: l, reason: collision with root package name */
    private String f23476l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f23477m;

    /* renamed from: n, reason: collision with root package name */
    private int f23478n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23479o;

    public C4402i1(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, c2.f23399a, null, i10);
    }

    private static boolean d(int i10) {
        return i10 == 1;
    }

    public final Gc.j g() {
        return null;
    }

    public final Gc.p h() {
        U0 u0Zzk = null;
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                u0Zzk = v10.zzk();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        return Gc.p.d(u0Zzk);
    }

    C4402i1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, c2 c2Var, V v10, int i10) {
        d2 d2Var;
        this.f23465a = new BinderC10186yl();
        this.f23468d = new Gc.r();
        this.f23469e = new C4399h1(this);
        this.f23477m = viewGroup;
        this.f23466b = c2Var;
        this.f23474j = null;
        this.f23467c = new AtomicBoolean(false);
        this.f23478n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C4379b c4379b = new C4379b(context, attributeSet);
                this.f23472h = c4379b.b(z10);
                this.f23476l = c4379b.a();
                if (viewGroup.isInEditMode()) {
                    Sc.g gVarB = C4447y.b();
                    Gc.e eVar = this.f23472h[0];
                    int i11 = this.f23478n;
                    if (eVar.equals(Gc.e.f11326q)) {
                        d2Var = new d2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        d2Var = new d2(context, eVar);
                        d2Var.f23409j = d(i11);
                    }
                    gVarB.o(viewGroup, d2Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                C4447y.b().n(viewGroup, new d2(context, Gc.e.f11318i), e10.getMessage(), e10.getMessage());
            }
        }
    }

    private static d2 c(Context context, Gc.e[] eVarArr, int i10) {
        for (Gc.e eVar : eVarArr) {
            if (eVar.equals(Gc.e.f11326q)) {
                return new d2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        d2 d2Var = new d2(context, eVarArr);
        d2Var.f23409j = d(i10);
        return d2Var;
    }

    public final void A(Gc.j jVar) {
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.D3(new I1(jVar));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void B(Gc.s sVar) {
        this.f23475k = sVar;
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.B5(sVar == null ? null : new R1(sVar));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final boolean a() {
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                return v10.r0();
            }
            return false;
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final Gc.e[] b() {
        return this.f23472h;
    }

    public final Gc.c e() {
        return this.f23471g;
    }

    public final Gc.e f() {
        d2 d2VarZzg;
        try {
            V v10 = this.f23474j;
            if (v10 != null && (d2VarZzg = v10.zzg()) != null) {
                return Gc.t.c(d2VarZzg.f23404e, d2VarZzg.f23401b, d2VarZzg.f23400a);
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        Gc.e[] eVarArr = this.f23472h;
        if (eVarArr != null) {
            return eVarArr[0];
        }
        return null;
    }

    public final Gc.r j() {
        return this.f23468d;
    }

    public final Gc.s k() {
        return this.f23475k;
    }

    public final Hc.c l() {
        return this.f23473i;
    }

    public final Y0 m() {
        V v10 = this.f23474j;
        if (v10 != null) {
            try {
                return v10.zzl();
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String n() {
        V v10;
        if (this.f23476l == null && (v10 = this.f23474j) != null) {
            try {
                this.f23476l = v10.zzr();
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
        return this.f23476l;
    }

    public final void o() {
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.zzx();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: RemoteException -> 0x00d4, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d4, blocks: (B:27:0x00a3, B:29:0x00a9, B:31:0x00b7, B:33:0x00c9, B:36:0x00d6), top: B:52:0x00a3, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(Oc.C4393f1 r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.C4402i1.q(Oc.f1):void");
    }

    public final void r() {
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.j();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void s() {
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.r();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void t(InterfaceC4376a interfaceC4376a) {
        try {
            this.f23470f = interfaceC4376a;
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.J2(interfaceC4376a != null ? new BinderC4438v(interfaceC4376a) : null);
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void u(Gc.c cVar) {
        this.f23471g = cVar;
        this.f23469e.Z(cVar);
    }

    public final void v(Gc.e... eVarArr) {
        if (this.f23472h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        w(eVarArr);
    }

    public final void w(Gc.e... eVarArr) {
        this.f23472h = eVarArr;
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.u1(c(this.f23477m.getContext(), this.f23472h, this.f23478n));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        this.f23477m.requestLayout();
    }

    public final void x(String str) {
        if (this.f23476l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f23476l = str;
    }

    public final void y(Hc.c cVar) {
        try {
            this.f23473i = cVar;
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.o9(cVar != null ? new BinderC7011Kb(cVar) : null);
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void z(boolean z10) {
        this.f23479o = z10;
        try {
            V v10 = this.f23474j;
            if (v10 != null) {
                v10.v9(z10);
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    final /* synthetic */ void p(com.google.android.gms.dynamic.b bVar) {
        this.f23477m.addView((View) com.google.android.gms.dynamic.d.c2(bVar));
    }
}
