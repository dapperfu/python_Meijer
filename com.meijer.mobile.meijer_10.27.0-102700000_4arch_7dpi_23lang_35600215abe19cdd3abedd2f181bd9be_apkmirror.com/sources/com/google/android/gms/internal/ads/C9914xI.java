package com.google.android.gms.internal.ads;

import Mc.BinderC4148q1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9914xI {

    /* renamed from: a, reason: collision with root package name */
    private int f79743a;

    /* renamed from: b, reason: collision with root package name */
    private Mc.Y0 f79744b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7099Qg f79745c;

    /* renamed from: d, reason: collision with root package name */
    private View f79746d;

    /* renamed from: e, reason: collision with root package name */
    private List f79747e;

    /* renamed from: g, reason: collision with root package name */
    private BinderC4148q1 f79749g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f79750h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC9008ot f79751i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9008ot f79752j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC9008ot f79753k;

    /* renamed from: l, reason: collision with root package name */
    private C7789dT f79754l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.q f79755m;

    /* renamed from: n, reason: collision with root package name */
    private C7145Rq f79756n;

    /* renamed from: o, reason: collision with root package name */
    private View f79757o;

    /* renamed from: p, reason: collision with root package name */
    private View f79758p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f79759q;

    /* renamed from: r, reason: collision with root package name */
    private double f79760r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC7334Xg f79761s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC7334Xg f79762t;

    /* renamed from: u, reason: collision with root package name */
    private String f79763u;

    /* renamed from: x, reason: collision with root package name */
    private float f79766x;

    /* renamed from: y, reason: collision with root package name */
    private String f79767y;

    /* renamed from: v, reason: collision with root package name */
    private final Z.n0 f79764v = new Z.n0();

    /* renamed from: w, reason: collision with root package name */
    private final Z.n0 f79765w = new Z.n0();

    /* renamed from: f, reason: collision with root package name */
    private List f79748f = Collections.EMPTY_LIST;

    public static C9914xI H(C6970Ml c6970Ml) {
        C9914xI c9914xI;
        try {
            BinderC9807wI binderC9807wIL = L(c6970Ml.N3(), null);
            InterfaceC7099Qg interfaceC7099QgW5 = c6970Ml.W5();
            View view = (View) N(c6970Ml.d7());
            String strZzo = c6970Ml.zzo();
            List listB9 = c6970Ml.B9();
            String strZzm = c6970Ml.zzm();
            Bundle bundleZzf = c6970Ml.zzf();
            String strZzn = c6970Ml.zzn();
            View view2 = (View) N(c6970Ml.A9());
            com.google.android.gms.dynamic.b bVarZzl = c6970Ml.zzl();
            String strZzq = c6970Ml.zzq();
            String strZzp = c6970Ml.zzp();
            double dZze = c6970Ml.zze();
            InterfaceC7334Xg interfaceC7334XgF6 = c6970Ml.f6();
            c9914xI = null;
            try {
                C9914xI c9914xI2 = new C9914xI();
                c9914xI2.f79743a = 2;
                c9914xI2.f79744b = binderC9807wIL;
                c9914xI2.f79745c = interfaceC7099QgW5;
                c9914xI2.f79746d = view;
                c9914xI2.z("headline", strZzo);
                c9914xI2.f79747e = listB9;
                c9914xI2.z("body", strZzm);
                c9914xI2.f79750h = bundleZzf;
                c9914xI2.z("call_to_action", strZzn);
                c9914xI2.f79757o = view2;
                c9914xI2.f79759q = bVarZzl;
                c9914xI2.z(PlaceTypes.STORE, strZzq);
                c9914xI2.z("price", strZzp);
                c9914xI2.f79760r = dZze;
                c9914xI2.f79761s = interfaceC7334XgF6;
                return c9914xI2;
            } catch (RemoteException e10) {
                e = e10;
                Qc.p.h("Failed to get native ad from app install ad mapper", e);
                return c9914xI;
            }
        } catch (RemoteException e11) {
            e = e11;
            c9914xI = null;
        }
    }

    public static C9914xI I(C7004Nl c7004Nl) {
        try {
            BinderC9807wI binderC9807wIL = L(c7004Nl.N3(), null);
            InterfaceC7099Qg interfaceC7099QgW5 = c7004Nl.W5();
            View view = (View) N(c7004Nl.zzi());
            String strZzo = c7004Nl.zzo();
            List listB9 = c7004Nl.B9();
            String strZzm = c7004Nl.zzm();
            Bundle bundleZze = c7004Nl.zze();
            String strZzn = c7004Nl.zzn();
            View view2 = (View) N(c7004Nl.d7());
            com.google.android.gms.dynamic.b bVarA9 = c7004Nl.A9();
            String strZzl = c7004Nl.zzl();
            InterfaceC7334Xg interfaceC7334XgF6 = c7004Nl.f6();
            C9914xI c9914xI = new C9914xI();
            c9914xI.f79743a = 1;
            c9914xI.f79744b = binderC9807wIL;
            c9914xI.f79745c = interfaceC7099QgW5;
            c9914xI.f79746d = view;
            c9914xI.z("headline", strZzo);
            c9914xI.f79747e = listB9;
            c9914xI.z("body", strZzm);
            c9914xI.f79750h = bundleZze;
            c9914xI.z("call_to_action", strZzn);
            c9914xI.f79757o = view2;
            c9914xI.f79759q = bVarA9;
            c9914xI.z("advertiser", strZzl);
            c9914xI.f79762t = interfaceC7334XgF6;
            return c9914xI;
        } catch (RemoteException e10) {
            Qc.p.h("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static C9914xI J(C6970Ml c6970Ml) {
        try {
            return M(L(c6970Ml.N3(), null), c6970Ml.W5(), (View) N(c6970Ml.d7()), c6970Ml.zzo(), c6970Ml.B9(), c6970Ml.zzm(), c6970Ml.zzf(), c6970Ml.zzn(), (View) N(c6970Ml.A9()), c6970Ml.zzl(), c6970Ml.zzq(), c6970Ml.zzp(), c6970Ml.zze(), c6970Ml.f6(), null, 0.0f);
        } catch (RemoteException e10) {
            Qc.p.h("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static C9914xI K(C7004Nl c7004Nl) {
        try {
            return M(L(c7004Nl.N3(), null), c7004Nl.W5(), (View) N(c7004Nl.zzi()), c7004Nl.zzo(), c7004Nl.B9(), c7004Nl.zzm(), c7004Nl.zze(), c7004Nl.zzn(), (View) N(c7004Nl.d7()), c7004Nl.A9(), null, null, -1.0d, c7004Nl.f6(), c7004Nl.zzl(), 0.0f);
        } catch (RemoteException e10) {
            Qc.p.h("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f79760r;
    }

    public final synchronized void B(int i10) {
        this.f79743a = i10;
    }

    public final synchronized void C(Mc.Y0 y02) {
        this.f79744b = y02;
    }

    public final synchronized void D(View view) {
        this.f79757o = view;
    }

    public final synchronized void E(InterfaceC9008ot interfaceC9008ot) {
        this.f79751i = interfaceC9008ot;
    }

    public final synchronized void F(View view) {
        this.f79758p = view;
    }

    public final synchronized boolean G() {
        return this.f79752j != null;
    }

    public final synchronized float O() {
        return this.f79766x;
    }

    public final synchronized int P() {
        return this.f79743a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.f79750h == null) {
                this.f79750h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f79750h;
    }

    public final synchronized View R() {
        return this.f79746d;
    }

    public final synchronized View S() {
        return this.f79757o;
    }

    public final synchronized View T() {
        return this.f79758p;
    }

    public final synchronized Z.n0 U() {
        return this.f79764v;
    }

    public final synchronized Z.n0 V() {
        return this.f79765w;
    }

    public final synchronized Mc.Y0 W() {
        return this.f79744b;
    }

    public final synchronized BinderC4148q1 X() {
        return this.f79749g;
    }

    public final synchronized InterfaceC7099Qg Y() {
        return this.f79745c;
    }

    public final synchronized String a() {
        return this.f79763u;
    }

    public final synchronized InterfaceC7334Xg a0() {
        return this.f79761s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized InterfaceC7334Xg b0() {
        return this.f79762t;
    }

    public final synchronized String c() {
        return this.f79767y;
    }

    public final synchronized C7145Rq c0() {
        return this.f79756n;
    }

    public final synchronized String d() {
        return f("price");
    }

    public final synchronized InterfaceC9008ot d0() {
        return this.f79752j;
    }

    public final synchronized String e() {
        return f(PlaceTypes.STORE);
    }

    public final synchronized InterfaceC9008ot e0() {
        return this.f79753k;
    }

    public final synchronized String f(String str) {
        return (String) this.f79765w.get(str);
    }

    public final synchronized InterfaceC9008ot f0() {
        return this.f79751i;
    }

    public final synchronized List g() {
        return this.f79747e;
    }

    public final synchronized List h() {
        return this.f79748f;
    }

    public final synchronized C7789dT h0() {
        return this.f79754l;
    }

    public final synchronized void i() {
        try {
            InterfaceC9008ot interfaceC9008ot = this.f79751i;
            if (interfaceC9008ot != null) {
                interfaceC9008ot.destroy();
                this.f79751i = null;
            }
            InterfaceC9008ot interfaceC9008ot2 = this.f79752j;
            if (interfaceC9008ot2 != null) {
                interfaceC9008ot2.destroy();
                this.f79752j = null;
            }
            InterfaceC9008ot interfaceC9008ot3 = this.f79753k;
            if (interfaceC9008ot3 != null) {
                interfaceC9008ot3.destroy();
                this.f79753k = null;
            }
            com.google.common.util.concurrent.q qVar = this.f79755m;
            if (qVar != null) {
                qVar.cancel(false);
                this.f79755m = null;
            }
            C7145Rq c7145Rq = this.f79756n;
            if (c7145Rq != null) {
                c7145Rq.cancel(false);
                this.f79756n = null;
            }
            this.f79754l = null;
            this.f79764v.clear();
            this.f79765w.clear();
            this.f79744b = null;
            this.f79745c = null;
            this.f79746d = null;
            this.f79747e = null;
            this.f79750h = null;
            this.f79757o = null;
            this.f79758p = null;
            this.f79759q = null;
            this.f79761s = null;
            this.f79762t = null;
            this.f79763u = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized com.google.android.gms.dynamic.b i0() {
        return this.f79759q;
    }

    public final synchronized void j(InterfaceC7099Qg interfaceC7099Qg) {
        this.f79745c = interfaceC7099Qg;
    }

    public final synchronized com.google.common.util.concurrent.q j0() {
        return this.f79755m;
    }

    public final synchronized void k(String str) {
        this.f79763u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(BinderC4148q1 binderC4148q1) {
        this.f79749g = binderC4148q1;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(InterfaceC7334Xg interfaceC7334Xg) {
        this.f79761s = interfaceC7334Xg;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, BinderC6896Kg binderC6896Kg) {
        if (binderC6896Kg == null) {
            this.f79764v.remove(str);
        } else {
            this.f79764v.put(str, binderC6896Kg);
        }
    }

    public final synchronized void o(InterfaceC9008ot interfaceC9008ot) {
        this.f79752j = interfaceC9008ot;
    }

    public final synchronized void p(List list) {
        this.f79747e = list;
    }

    public final synchronized void q(InterfaceC7334Xg interfaceC7334Xg) {
        this.f79762t = interfaceC7334Xg;
    }

    public final synchronized void r(float f10) {
        this.f79766x = f10;
    }

    public final synchronized void s(List list) {
        this.f79748f = list;
    }

    public final synchronized void t(InterfaceC9008ot interfaceC9008ot) {
        this.f79753k = interfaceC9008ot;
    }

    public final synchronized void u(com.google.common.util.concurrent.q qVar) {
        this.f79755m = qVar;
    }

    public final synchronized void v(String str) {
        this.f79767y = str;
    }

    public final synchronized void w(C7789dT c7789dT) {
        this.f79754l = c7789dT;
    }

    public final synchronized void x(C7145Rq c7145Rq) {
        this.f79756n = c7145Rq;
    }

    public final synchronized void y(double d10) {
        this.f79760r = d10;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.f79765w.remove(str);
        } else {
            this.f79765w.put(str, str2);
        }
    }

    private static BinderC9807wI L(Mc.Y0 y02, InterfaceC7106Ql interfaceC7106Ql) {
        if (y02 == null) {
            return null;
        }
        return new BinderC9807wI(y02, interfaceC7106Ql);
    }

    private static C9914xI M(Mc.Y0 y02, InterfaceC7099Qg interfaceC7099Qg, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, com.google.android.gms.dynamic.b bVar, String str4, String str5, double d10, InterfaceC7334Xg interfaceC7334Xg, String str6, float f10) {
        C9914xI c9914xI = new C9914xI();
        c9914xI.f79743a = 6;
        c9914xI.f79744b = y02;
        c9914xI.f79745c = interfaceC7099Qg;
        c9914xI.f79746d = view;
        c9914xI.z("headline", str);
        c9914xI.f79747e = list;
        c9914xI.z("body", str2);
        c9914xI.f79750h = bundle;
        c9914xI.z("call_to_action", str3);
        c9914xI.f79757o = view2;
        c9914xI.f79759q = bVar;
        c9914xI.z(PlaceTypes.STORE, str4);
        c9914xI.z("price", str5);
        c9914xI.f79760r = d10;
        c9914xI.f79761s = interfaceC7334Xg;
        c9914xI.z("advertiser", str6);
        c9914xI.r(f10);
        return c9914xI;
    }

    private static Object N(com.google.android.gms.dynamic.b bVar) {
        if (bVar == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.b2(bVar);
    }

    public final InterfaceC7334Xg Z() {
        List list = this.f79747e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f79747e.get(0);
        if (obj instanceof IBinder) {
            return AbstractBinderC7301Wg.B9((IBinder) obj);
        }
        return null;
    }

    public static C9914xI g0(InterfaceC7106Ql interfaceC7106Ql) {
        try {
            return M(L(interfaceC7106Ql.zzj(), interfaceC7106Ql), interfaceC7106Ql.zzk(), (View) N(interfaceC7106Ql.zzm()), interfaceC7106Ql.zzs(), interfaceC7106Ql.zzv(), interfaceC7106Ql.zzq(), interfaceC7106Ql.zzi(), interfaceC7106Ql.zzr(), (View) N(interfaceC7106Ql.zzn()), interfaceC7106Ql.zzo(), interfaceC7106Ql.zzu(), interfaceC7106Ql.zzt(), interfaceC7106Ql.zze(), interfaceC7106Ql.zzl(), interfaceC7106Ql.zzp(), interfaceC7106Ql.zzf());
        } catch (RemoteException e10) {
            Qc.p.h("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }
}
