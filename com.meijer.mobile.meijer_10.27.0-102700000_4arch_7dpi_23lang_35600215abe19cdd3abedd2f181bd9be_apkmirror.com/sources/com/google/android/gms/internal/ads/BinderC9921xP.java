package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9921xP extends Mc.P0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f79779a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f79780b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f79781c;

    /* renamed from: d, reason: collision with root package name */
    private final C8638lP f79782d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f79783e;

    /* renamed from: f, reason: collision with root package name */
    private ZO f79784f;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void L9(String str, String str2) {
        try {
            Mj0.r(this.f79784f.c(str), new C9707vP(this, str2), this.f79783e);
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.f79782d.f(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            Mj0.r(this.f79784f.c(str), new C9814wP(this, str2), this.f79783e);
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "OutOfContextTester.setAdAsShown");
            this.f79782d.f(str2);
        }
    }

    public final void E9(ZO zo2) {
        this.f79784f = zo2;
    }

    protected final synchronized void F9(String str, Object obj, String str2) {
        this.f79779a.put(str, obj);
        L9(K9(obj), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void G9(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC9921xP.G9(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void H9(String str, String str2) {
        Object obj;
        try {
            Activity activityB = this.f79782d.b();
            if (activityB != null && (obj = this.f79779a.get(str)) != null) {
                AbstractC7593bf abstractC7593bf = C8659lf.f76441n9;
                if (!((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() || (obj instanceof Gc.a) || (obj instanceof Rc.a) || (obj instanceof Yc.c) || (obj instanceof Zc.a)) {
                    this.f79779a.remove(str);
                }
                zzn(K9(obj), str2);
                if (obj instanceof Gc.a) {
                    ((Gc.a) obj).c(activityB);
                    return;
                }
                if (obj instanceof Rc.a) {
                    ((Rc.a) obj).e(activityB);
                    return;
                }
                if (obj instanceof Yc.c) {
                    ((Yc.c) obj).c(activityB, new Ec.k() { // from class: com.google.android.gms.internal.ads.nP
                        @Override // Ec.k
                        public final void a(Yc.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof Zc.a) {
                    ((Zc.a) obj).c(activityB, new Ec.k() { // from class: com.google.android.gms.internal.ads.oP
                        @Override // Ec.k
                        public final void a(Yc.b bVar) {
                        }
                    });
                    return;
                }
                if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextI9 = I9();
                    intent.setClassName(contextI9, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    Lc.v.t();
                    Pc.D0.t(contextI9, intent);
                }
            }
        } finally {
        }
    }

    private final Context I9() {
        Context context = (Context) this.f79781c.get();
        return context == null ? this.f79780b : context;
    }

    private static com.google.android.gms.ads.c J9() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new c.a().b(AdMobAdapter.class, bundle).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String K9(Object obj) {
        Ec.p pVarC;
        Mc.U0 u0F;
        if (obj instanceof Ec.h) {
            pVarC = ((Ec.h) obj).f();
        } else if (obj instanceof Gc.a) {
            pVarC = ((Gc.a) obj).a();
        } else if (obj instanceof Rc.a) {
            pVarC = ((Rc.a) obj).a();
        } else if (obj instanceof Yc.c) {
            pVarC = ((Yc.c) obj).a();
        } else if (obj instanceof Zc.a) {
            pVarC = ((Zc.a) obj).a();
        } else if (obj instanceof AdView) {
            pVarC = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            pVarC = ((NativeAd) obj).c();
        }
        if (pVarC == null || (u0F = pVarC.f()) == null) {
            return "";
        }
        try {
            return u0F.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    BinderC9921xP(Context context, WeakReference weakReference, C8638lP c8638lP, C10028yP c10028yP, Xj0 xj0) {
        this.f79780b = context;
        this.f79781c = weakReference;
        this.f79782d = c8638lP;
        this.f79783e = xj0;
    }

    @Override // Mc.Q0
    public final void O3(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
        ViewGroup viewGroup = (ViewGroup) com.google.android.gms.dynamic.d.b2(bVar2);
        if (context != null && viewGroup != null) {
            Object obj = this.f79779a.get(str);
            if (obj != null) {
                this.f79779a.remove(str);
            }
            if (obj instanceof AdView) {
                C10028yP.a(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                C10028yP.b(context, viewGroup, (NativeAd) obj);
            }
        }
    }
}
