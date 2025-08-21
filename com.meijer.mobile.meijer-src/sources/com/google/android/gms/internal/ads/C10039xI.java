package com.google.android.gms.internal.ads;

import Oc.BinderC4426q1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10039xI {

    /* renamed from: a, reason: collision with root package name */
    private int f80583a;

    /* renamed from: b, reason: collision with root package name */
    private Oc.Y0 f80584b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7224Qg f80585c;

    /* renamed from: d, reason: collision with root package name */
    private View f80586d;

    /* renamed from: e, reason: collision with root package name */
    private List f80587e;

    /* renamed from: g, reason: collision with root package name */
    private BinderC4426q1 f80589g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f80590h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC9133ot f80591i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9133ot f80592j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC9133ot f80593k;

    /* renamed from: l, reason: collision with root package name */
    private C7914dT f80594l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.q f80595m;

    /* renamed from: n, reason: collision with root package name */
    private C7270Rq f80596n;

    /* renamed from: o, reason: collision with root package name */
    private View f80597o;

    /* renamed from: p, reason: collision with root package name */
    private View f80598p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f80599q;

    /* renamed from: r, reason: collision with root package name */
    private double f80600r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC7459Xg f80601s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC7459Xg f80602t;

    /* renamed from: u, reason: collision with root package name */
    private String f80603u;

    /* renamed from: x, reason: collision with root package name */
    private float f80606x;

    /* renamed from: y, reason: collision with root package name */
    private String f80607y;

    /* renamed from: v, reason: collision with root package name */
    private final Z.n0 f80604v = new Z.n0();

    /* renamed from: w, reason: collision with root package name */
    private final Z.n0 f80605w = new Z.n0();

    /* renamed from: f, reason: collision with root package name */
    private List f80588f = Collections.EMPTY_LIST;

    public static C10039xI H(C7095Ml c7095Ml) {
        C10039xI c10039xI;
        try {
            BinderC9932wI binderC9932wIL = L(c7095Ml.Z3(), null);
            InterfaceC7224Qg interfaceC7224QgM6 = c7095Ml.m6();
            View view = (View) N(c7095Ml.o7());
            String strZzo = c7095Ml.zzo();
            List listB9 = c7095Ml.B9();
            String strZzm = c7095Ml.zzm();
            Bundle bundleZzf = c7095Ml.zzf();
            String strZzn = c7095Ml.zzn();
            View view2 = (View) N(c7095Ml.A9());
            com.google.android.gms.dynamic.b bVarZzl = c7095Ml.zzl();
            String strZzq = c7095Ml.zzq();
            String strZzp = c7095Ml.zzp();
            double dZze = c7095Ml.zze();
            InterfaceC7459Xg interfaceC7459XgT6 = c7095Ml.t6();
            c10039xI = null;
            try {
                C10039xI c10039xI2 = new C10039xI();
                c10039xI2.f80583a = 2;
                c10039xI2.f80584b = binderC9932wIL;
                c10039xI2.f80585c = interfaceC7224QgM6;
                c10039xI2.f80586d = view;
                c10039xI2.z("headline", strZzo);
                c10039xI2.f80587e = listB9;
                c10039xI2.z("body", strZzm);
                c10039xI2.f80590h = bundleZzf;
                c10039xI2.z("call_to_action", strZzn);
                c10039xI2.f80597o = view2;
                c10039xI2.f80599q = bVarZzl;
                c10039xI2.z(PlaceTypes.STORE, strZzq);
                c10039xI2.z("price", strZzp);
                c10039xI2.f80600r = dZze;
                c10039xI2.f80601s = interfaceC7459XgT6;
                return c10039xI2;
            } catch (RemoteException e10) {
                e = e10;
                Sc.p.h("Failed to get native ad from app install ad mapper", e);
                return c10039xI;
            }
        } catch (RemoteException e11) {
            e = e11;
            c10039xI = null;
        }
    }

    public static C10039xI I(C7129Nl c7129Nl) {
        try {
            BinderC9932wI binderC9932wIL = L(c7129Nl.Z3(), null);
            InterfaceC7224Qg interfaceC7224QgM6 = c7129Nl.m6();
            View view = (View) N(c7129Nl.zzi());
            String strZzo = c7129Nl.zzo();
            List listB9 = c7129Nl.B9();
            String strZzm = c7129Nl.zzm();
            Bundle bundleZze = c7129Nl.zze();
            String strZzn = c7129Nl.zzn();
            View view2 = (View) N(c7129Nl.o7());
            com.google.android.gms.dynamic.b bVarA9 = c7129Nl.A9();
            String strZzl = c7129Nl.zzl();
            InterfaceC7459Xg interfaceC7459XgT6 = c7129Nl.t6();
            C10039xI c10039xI = new C10039xI();
            c10039xI.f80583a = 1;
            c10039xI.f80584b = binderC9932wIL;
            c10039xI.f80585c = interfaceC7224QgM6;
            c10039xI.f80586d = view;
            c10039xI.z("headline", strZzo);
            c10039xI.f80587e = listB9;
            c10039xI.z("body", strZzm);
            c10039xI.f80590h = bundleZze;
            c10039xI.z("call_to_action", strZzn);
            c10039xI.f80597o = view2;
            c10039xI.f80599q = bVarA9;
            c10039xI.z("advertiser", strZzl);
            c10039xI.f80602t = interfaceC7459XgT6;
            return c10039xI;
        } catch (RemoteException e10) {
            Sc.p.h("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static C10039xI J(C7095Ml c7095Ml) {
        try {
            return M(L(c7095Ml.Z3(), null), c7095Ml.m6(), (View) N(c7095Ml.o7()), c7095Ml.zzo(), c7095Ml.B9(), c7095Ml.zzm(), c7095Ml.zzf(), c7095Ml.zzn(), (View) N(c7095Ml.A9()), c7095Ml.zzl(), c7095Ml.zzq(), c7095Ml.zzp(), c7095Ml.zze(), c7095Ml.t6(), null, 0.0f);
        } catch (RemoteException e10) {
            Sc.p.h("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static C10039xI K(C7129Nl c7129Nl) {
        try {
            return M(L(c7129Nl.Z3(), null), c7129Nl.m6(), (View) N(c7129Nl.zzi()), c7129Nl.zzo(), c7129Nl.B9(), c7129Nl.zzm(), c7129Nl.zze(), c7129Nl.zzn(), (View) N(c7129Nl.o7()), c7129Nl.A9(), null, null, -1.0d, c7129Nl.t6(), c7129Nl.zzl(), 0.0f);
        } catch (RemoteException e10) {
            Sc.p.h("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f80600r;
    }

    public final synchronized void B(int i10) {
        this.f80583a = i10;
    }

    public final synchronized void C(Oc.Y0 y02) {
        this.f80584b = y02;
    }

    public final synchronized void D(View view) {
        this.f80597o = view;
    }

    public final synchronized void E(InterfaceC9133ot interfaceC9133ot) {
        this.f80591i = interfaceC9133ot;
    }

    public final synchronized void F(View view) {
        this.f80598p = view;
    }

    public final synchronized boolean G() {
        return this.f80592j != null;
    }

    public final synchronized float O() {
        return this.f80606x;
    }

    public final synchronized int P() {
        return this.f80583a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.f80590h == null) {
                this.f80590h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f80590h;
    }

    public final synchronized View R() {
        return this.f80586d;
    }

    public final synchronized View S() {
        return this.f80597o;
    }

    public final synchronized View T() {
        return this.f80598p;
    }

    public final synchronized Z.n0 U() {
        return this.f80604v;
    }

    public final synchronized Z.n0 V() {
        return this.f80605w;
    }

    public final synchronized Oc.Y0 W() {
        return this.f80584b;
    }

    public final synchronized BinderC4426q1 X() {
        return this.f80589g;
    }

    public final synchronized InterfaceC7224Qg Y() {
        return this.f80585c;
    }

    public final synchronized String a() {
        return this.f80603u;
    }

    public final synchronized InterfaceC7459Xg a0() {
        return this.f80601s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized InterfaceC7459Xg b0() {
        return this.f80602t;
    }

    public final synchronized String c() {
        return this.f80607y;
    }

    public final synchronized C7270Rq c0() {
        return this.f80596n;
    }

    public final synchronized String d() {
        return f("price");
    }

    public final synchronized InterfaceC9133ot d0() {
        return this.f80592j;
    }

    public final synchronized String e() {
        return f(PlaceTypes.STORE);
    }

    public final synchronized InterfaceC9133ot e0() {
        return this.f80593k;
    }

    public final synchronized String f(String str) {
        return (String) this.f80605w.get(str);
    }

    public final synchronized InterfaceC9133ot f0() {
        return this.f80591i;
    }

    public final synchronized List g() {
        return this.f80587e;
    }

    public final synchronized List h() {
        return this.f80588f;
    }

    public final synchronized C7914dT h0() {
        return this.f80594l;
    }

    public final synchronized void i() {
        try {
            InterfaceC9133ot interfaceC9133ot = this.f80591i;
            if (interfaceC9133ot != null) {
                interfaceC9133ot.destroy();
                this.f80591i = null;
            }
            InterfaceC9133ot interfaceC9133ot2 = this.f80592j;
            if (interfaceC9133ot2 != null) {
                interfaceC9133ot2.destroy();
                this.f80592j = null;
            }
            InterfaceC9133ot interfaceC9133ot3 = this.f80593k;
            if (interfaceC9133ot3 != null) {
                interfaceC9133ot3.destroy();
                this.f80593k = null;
            }
            com.google.common.util.concurrent.q qVar = this.f80595m;
            if (qVar != null) {
                qVar.cancel(false);
                this.f80595m = null;
            }
            C7270Rq c7270Rq = this.f80596n;
            if (c7270Rq != null) {
                c7270Rq.cancel(false);
                this.f80596n = null;
            }
            this.f80594l = null;
            this.f80604v.clear();
            this.f80605w.clear();
            this.f80584b = null;
            this.f80585c = null;
            this.f80586d = null;
            this.f80587e = null;
            this.f80590h = null;
            this.f80597o = null;
            this.f80598p = null;
            this.f80599q = null;
            this.f80601s = null;
            this.f80602t = null;
            this.f80603u = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized com.google.android.gms.dynamic.b i0() {
        return this.f80599q;
    }

    public final synchronized void j(InterfaceC7224Qg interfaceC7224Qg) {
        this.f80585c = interfaceC7224Qg;
    }

    public final synchronized com.google.common.util.concurrent.q j0() {
        return this.f80595m;
    }

    public final synchronized void k(String str) {
        this.f80603u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(BinderC4426q1 binderC4426q1) {
        this.f80589g = binderC4426q1;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(InterfaceC7459Xg interfaceC7459Xg) {
        this.f80601s = interfaceC7459Xg;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, BinderC7021Kg binderC7021Kg) {
        if (binderC7021Kg == null) {
            this.f80604v.remove(str);
        } else {
            this.f80604v.put(str, binderC7021Kg);
        }
    }

    public final synchronized void o(InterfaceC9133ot interfaceC9133ot) {
        this.f80592j = interfaceC9133ot;
    }

    public final synchronized void p(List list) {
        this.f80587e = list;
    }

    public final synchronized void q(InterfaceC7459Xg interfaceC7459Xg) {
        this.f80602t = interfaceC7459Xg;
    }

    public final synchronized void r(float f10) {
        this.f80606x = f10;
    }

    public final synchronized void s(List list) {
        this.f80588f = list;
    }

    public final synchronized void t(InterfaceC9133ot interfaceC9133ot) {
        this.f80593k = interfaceC9133ot;
    }

    public final synchronized void u(com.google.common.util.concurrent.q qVar) {
        this.f80595m = qVar;
    }

    public final synchronized void v(String str) {
        this.f80607y = str;
    }

    public final synchronized void w(C7914dT c7914dT) {
        this.f80594l = c7914dT;
    }

    public final synchronized void x(C7270Rq c7270Rq) {
        this.f80596n = c7270Rq;
    }

    public final synchronized void y(double d10) {
        this.f80600r = d10;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.f80605w.remove(str);
        } else {
            this.f80605w.put(str, str2);
        }
    }

    private static BinderC9932wI L(Oc.Y0 y02, InterfaceC7231Ql interfaceC7231Ql) {
        if (y02 == null) {
            return null;
        }
        return new BinderC9932wI(y02, interfaceC7231Ql);
    }

    private static C10039xI M(Oc.Y0 y02, InterfaceC7224Qg interfaceC7224Qg, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, com.google.android.gms.dynamic.b bVar, String str4, String str5, double d10, InterfaceC7459Xg interfaceC7459Xg, String str6, float f10) {
        C10039xI c10039xI = new C10039xI();
        c10039xI.f80583a = 6;
        c10039xI.f80584b = y02;
        c10039xI.f80585c = interfaceC7224Qg;
        c10039xI.f80586d = view;
        c10039xI.z("headline", str);
        c10039xI.f80587e = list;
        c10039xI.z("body", str2);
        c10039xI.f80590h = bundle;
        c10039xI.z("call_to_action", str3);
        c10039xI.f80597o = view2;
        c10039xI.f80599q = bVar;
        c10039xI.z(PlaceTypes.STORE, str4);
        c10039xI.z("price", str5);
        c10039xI.f80600r = d10;
        c10039xI.f80601s = interfaceC7459Xg;
        c10039xI.z("advertiser", str6);
        c10039xI.r(f10);
        return c10039xI;
    }

    private static Object N(com.google.android.gms.dynamic.b bVar) {
        if (bVar == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.c2(bVar);
    }

    public final InterfaceC7459Xg Z() {
        List list = this.f80587e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f80587e.get(0);
        if (obj instanceof IBinder) {
            return AbstractBinderC7426Wg.B9((IBinder) obj);
        }
        return null;
    }

    public static C10039xI g0(InterfaceC7231Ql interfaceC7231Ql) {
        try {
            return M(L(interfaceC7231Ql.zzj(), interfaceC7231Ql), interfaceC7231Ql.zzk(), (View) N(interfaceC7231Ql.zzm()), interfaceC7231Ql.zzs(), interfaceC7231Ql.zzv(), interfaceC7231Ql.zzq(), interfaceC7231Ql.zzi(), interfaceC7231Ql.zzr(), (View) N(interfaceC7231Ql.zzn()), interfaceC7231Ql.zzo(), interfaceC7231Ql.zzu(), interfaceC7231Ql.zzt(), interfaceC7231Ql.zze(), interfaceC7231Ql.zzl(), interfaceC7231Ql.zzp(), interfaceC7231Ql.zzf());
        } catch (RemoteException e10) {
            Sc.p.h("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }
}
