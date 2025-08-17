package Mc;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.BinderC6886Kb;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Mc.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4124i1 {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC10061yl f19278a;

    /* renamed from: b, reason: collision with root package name */
    private final c2 f19279b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f19280c;

    /* renamed from: d, reason: collision with root package name */
    private final Ec.r f19281d;

    /* renamed from: e, reason: collision with root package name */
    final C4172z f19282e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4098a f19283f;

    /* renamed from: g, reason: collision with root package name */
    private Ec.c f19284g;

    /* renamed from: h, reason: collision with root package name */
    private Ec.e[] f19285h;

    /* renamed from: i, reason: collision with root package name */
    private Fc.c f19286i;

    /* renamed from: j, reason: collision with root package name */
    private V f19287j;

    /* renamed from: k, reason: collision with root package name */
    private Ec.s f19288k;

    /* renamed from: l, reason: collision with root package name */
    private String f19289l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f19290m;

    /* renamed from: n, reason: collision with root package name */
    private int f19291n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19292o;

    public C4124i1(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, c2.f19212a, null, i10);
    }

    private static boolean d(int i10) {
        return i10 == 1;
    }

    public final Ec.j g() {
        return null;
    }

    public final Ec.p h() {
        U0 u0Zzk = null;
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                u0Zzk = v10.zzk();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        return Ec.p.d(u0Zzk);
    }

    C4124i1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, c2 c2Var, V v10, int i10) {
        d2 d2Var;
        this.f19278a = new BinderC10061yl();
        this.f19281d = new Ec.r();
        this.f19282e = new C4121h1(this);
        this.f19290m = viewGroup;
        this.f19279b = c2Var;
        this.f19287j = null;
        this.f19280c = new AtomicBoolean(false);
        this.f19291n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C4101b c4101b = new C4101b(context, attributeSet);
                this.f19285h = c4101b.b(z10);
                this.f19289l = c4101b.a();
                if (viewGroup.isInEditMode()) {
                    Qc.g gVarB = C4169y.b();
                    Ec.e eVar = this.f19285h[0];
                    int i11 = this.f19291n;
                    if (eVar.equals(Ec.e.f7774q)) {
                        d2Var = new d2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        d2Var = new d2(context, eVar);
                        d2Var.f19222j = d(i11);
                    }
                    gVarB.o(viewGroup, d2Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                C4169y.b().n(viewGroup, new d2(context, Ec.e.f7766i), e10.getMessage(), e10.getMessage());
            }
        }
    }

    private static d2 c(Context context, Ec.e[] eVarArr, int i10) {
        for (Ec.e eVar : eVarArr) {
            if (eVar.equals(Ec.e.f7774q)) {
                return new d2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        d2 d2Var = new d2(context, eVarArr);
        d2Var.f19222j = d(i10);
        return d2Var;
    }

    public final void A(Ec.j jVar) {
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.B4(new I1(jVar));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void B(Ec.s sVar) {
        this.f19288k = sVar;
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.L6(sVar == null ? null : new R1(sVar));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final boolean a() {
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                return v10.q0();
            }
            return false;
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final Ec.e[] b() {
        return this.f19285h;
    }

    public final Ec.c e() {
        return this.f19284g;
    }

    public final Ec.e f() {
        d2 d2VarZzg;
        try {
            V v10 = this.f19287j;
            if (v10 != null && (d2VarZzg = v10.zzg()) != null) {
                return Ec.t.c(d2VarZzg.f19217e, d2VarZzg.f19214b, d2VarZzg.f19213a);
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        Ec.e[] eVarArr = this.f19285h;
        if (eVarArr != null) {
            return eVarArr[0];
        }
        return null;
    }

    public final Ec.r j() {
        return this.f19281d;
    }

    public final Ec.s k() {
        return this.f19288k;
    }

    public final Fc.c l() {
        return this.f19286i;
    }

    public final Y0 m() {
        V v10 = this.f19287j;
        if (v10 != null) {
            try {
                return v10.zzl();
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String n() {
        V v10;
        if (this.f19289l == null && (v10 = this.f19287j) != null) {
            try {
                this.f19289l = v10.zzr();
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
        return this.f19289l;
    }

    public final void o() {
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.zzx();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: RemoteException -> 0x00d4, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d4, blocks: (B:27:0x00a3, B:29:0x00a9, B:31:0x00b7, B:33:0x00c9, B:36:0x00d6), top: B:52:0x00a3, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(Mc.C4115f1 r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.C4124i1.q(Mc.f1):void");
    }

    public final void r() {
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.j();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void s() {
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.r();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void t(InterfaceC4098a interfaceC4098a) {
        try {
            this.f19283f = interfaceC4098a;
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.N1(interfaceC4098a != null ? new BinderC4160v(interfaceC4098a) : null);
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void u(Ec.c cVar) {
        this.f19284g = cVar;
        this.f19282e.Z(cVar);
    }

    public final void v(Ec.e... eVarArr) {
        if (this.f19285h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        w(eVarArr);
    }

    public final void w(Ec.e... eVarArr) {
        this.f19285h = eVarArr;
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.O7(c(this.f19290m.getContext(), this.f19285h, this.f19291n));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        this.f19290m.requestLayout();
    }

    public final void x(String str) {
        if (this.f19289l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f19289l = str;
    }

    public final void y(Fc.c cVar) {
        try {
            this.f19286i = cVar;
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.G7(cVar != null ? new BinderC6886Kb(cVar) : null);
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void z(boolean z10) {
        this.f19292o = z10;
        try {
            V v10 = this.f19287j;
            if (v10 != null) {
                v10.w9(z10);
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    final /* synthetic */ void p(com.google.android.gms.dynamic.b bVar) {
        this.f19290m.addView((View) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
