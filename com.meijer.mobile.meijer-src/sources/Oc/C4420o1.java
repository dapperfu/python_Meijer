package Oc;

import Gc.o;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C6958Ij;
import com.google.android.gms.internal.ads.C7229Qj;
import com.google.android.gms.internal.ads.C7263Rj;
import com.google.android.gms.internal.ads.C9651tl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Oc.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4420o1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Set f23508i = new HashSet(Arrays.asList(Gc.b.APP_OPEN_AD, Gc.b.INTERSTITIAL, Gc.b.REWARDED));

    /* renamed from: j, reason: collision with root package name */
    private static C4420o1 f23509j;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC4439v0 f23516g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f23510a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f23511b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f23513d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23514e = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f23515f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private Gc.o f23517h = new o.a().a();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f23512c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static Mc.b a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6958Ij c6958Ij = (C6958Ij) it.next();
            map.put(c6958Ij.f68512a, new C7229Qj(c6958Ij.f68513b ? Mc.a.READY : Mc.a.NOT_READY, c6958Ij.f68515d, c6958Ij.f68514c));
        }
        return new C7263Rj(map);
    }

    private final void c(Context context) {
        if (this.f23516g == null) {
            this.f23516g = (InterfaceC4439v0) new C4429s(C4447y.a(), context).d(context, false);
        }
    }

    private final void d(Gc.o oVar) {
        try {
            this.f23516g.N3(new L1(oVar));
        } catch (RemoteException e10) {
            Sc.p.e("Unable to set request configuration parcel.", e10);
        }
    }

    public static C4420o1 h() {
        C4420o1 c4420o1;
        synchronized (C4420o1.class) {
            try {
                if (f23509j == null) {
                    f23509j = new C4420o1();
                }
                c4420o1 = f23509j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4420o1;
    }

    public final Gc.o e() {
        return this.f23517h;
    }

    public final Mc.b g() {
        Mc.b bVarA;
        synchronized (this.f23515f) {
            try {
                com.google.android.gms.common.internal.r.q(this.f23516g != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    bVarA = a(this.f23516g.zzg());
                } catch (RemoteException unused) {
                    Sc.p.d("Unable to get Initialization status.");
                    return new Mc.b() { // from class: Oc.j1
                    };
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(final android.content.Context r3, java.lang.String r4, Mc.c r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.C4420o1.m(android.content.Context, java.lang.String, Mc.c):void");
    }

    final /* synthetic */ void n(Context context, String str) {
        synchronized (this.f23515f) {
            b(context, null);
        }
    }

    final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f23515f) {
            b(context, null);
        }
    }

    public final void p(String str) {
        synchronized (this.f23515f) {
            com.google.android.gms.common.internal.r.q(this.f23516g != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f23516g.x5(str);
            } catch (RemoteException e10) {
                Sc.p.e("Unable to set plugin.", e10);
            }
        }
    }

    private C4420o1() {
    }

    private final void b(Context context, String str) {
        try {
            C9651tl.a().b(context, null);
            this.f23516g.zzk();
            this.f23516g.t3(null, com.google.android.gms.dynamic.d.I2(null));
        } catch (RemoteException e10) {
            Sc.p.h("MobileAdsSettingManager initialization failed", e10);
        }
    }
}
