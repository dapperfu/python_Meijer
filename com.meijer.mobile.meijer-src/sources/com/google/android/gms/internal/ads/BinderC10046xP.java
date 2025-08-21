package com.google.android.gms.internal.ads;

import ad.AbstractC5683c;
import ad.InterfaceC5682b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import bd.AbstractC6355a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC10046xP extends Oc.P0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f80619a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f80620b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f80621c;

    /* renamed from: d, reason: collision with root package name */
    private final C8763lP f80622d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f80623e;

    /* renamed from: f, reason: collision with root package name */
    private ZO f80624f;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void L9(String str, String str2) {
        try {
            Mj0.r(this.f80624f.c(str), new C9832vP(this, str2), this.f80623e);
        } catch (NullPointerException e10) {
            Nc.v.s().x(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.f80622d.f(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            Mj0.r(this.f80624f.c(str), new C9939wP(this, str2), this.f80623e);
        } catch (NullPointerException e10) {
            Nc.v.s().x(e10, "OutOfContextTester.setAdAsShown");
            this.f80622d.f(str2);
        }
    }

    public final void E9(ZO zo2) {
        this.f80624f = zo2;
    }

    protected final synchronized void F9(String str, Object obj, String str2) {
        this.f80619a.put(str, obj);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC10046xP.G9(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void H9(String str, String str2) {
        Object obj;
        try {
            Activity activityB = this.f80622d.b();
            if (activityB != null && (obj = this.f80619a.get(str)) != null) {
                AbstractC7718bf abstractC7718bf = C8784lf.f77281n9;
                if (!((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() || (obj instanceof Ic.a) || (obj instanceof Tc.a) || (obj instanceof AbstractC5683c) || (obj instanceof AbstractC6355a)) {
                    this.f80619a.remove(str);
                }
                zzn(K9(obj), str2);
                if (obj instanceof Ic.a) {
                    ((Ic.a) obj).c(activityB);
                    return;
                }
                if (obj instanceof Tc.a) {
                    ((Tc.a) obj).e(activityB);
                    return;
                }
                if (obj instanceof AbstractC5683c) {
                    ((AbstractC5683c) obj).c(activityB, new Gc.k() { // from class: com.google.android.gms.internal.ads.nP
                        @Override // Gc.k
                        public final void a(InterfaceC5682b interfaceC5682b) {
                        }
                    });
                    return;
                }
                if (obj instanceof AbstractC6355a) {
                    ((AbstractC6355a) obj).c(activityB, new Gc.k() { // from class: com.google.android.gms.internal.ads.oP
                        @Override // Gc.k
                        public final void a(InterfaceC5682b interfaceC5682b) {
                        }
                    });
                    return;
                }
                if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextI9 = I9();
                    intent.setClassName(contextI9, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    Nc.v.t();
                    Rc.D0.t(contextI9, intent);
                }
            }
        } finally {
        }
    }

    private final Context I9() {
        Context context = (Context) this.f80621c.get();
        return context == null ? this.f80620b : context;
    }

    private static com.google.android.gms.ads.c J9() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new c.a().b(AdMobAdapter.class, bundle).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String K9(Object obj) {
        Gc.p pVarC;
        Oc.U0 u0F;
        if (obj instanceof Gc.h) {
            pVarC = ((Gc.h) obj).f();
        } else if (obj instanceof Ic.a) {
            pVarC = ((Ic.a) obj).a();
        } else if (obj instanceof Tc.a) {
            pVarC = ((Tc.a) obj).a();
        } else if (obj instanceof AbstractC5683c) {
            pVarC = ((AbstractC5683c) obj).a();
        } else if (obj instanceof AbstractC6355a) {
            pVarC = ((AbstractC6355a) obj).a();
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

    BinderC10046xP(Context context, WeakReference weakReference, C8763lP c8763lP, C10153yP c10153yP, Xj0 xj0) {
        this.f80620b = context;
        this.f80621c = weakReference;
        this.f80622d = c8763lP;
        this.f80623e = xj0;
    }

    @Override // Oc.Q0
    public final void a4(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
        ViewGroup viewGroup = (ViewGroup) com.google.android.gms.dynamic.d.c2(bVar2);
        if (context != null && viewGroup != null) {
            Object obj = this.f80619a.get(str);
            if (obj != null) {
                this.f80619a.remove(str);
            }
            if (obj instanceof AdView) {
                C10153yP.a(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                C10153yP.b(context, viewGroup, (NativeAd) obj);
            }
        }
    }
}
