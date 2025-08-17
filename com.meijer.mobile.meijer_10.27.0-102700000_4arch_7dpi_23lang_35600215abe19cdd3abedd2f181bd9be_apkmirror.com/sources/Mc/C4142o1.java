package Mc;

import Ec.o;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C6833Ij;
import com.google.android.gms.internal.ads.C7104Qj;
import com.google.android.gms.internal.ads.C7138Rj;
import com.google.android.gms.internal.ads.C9526tl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Mc.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4142o1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Set f19321i = new HashSet(Arrays.asList(Ec.b.APP_OPEN_AD, Ec.b.INTERSTITIAL, Ec.b.REWARDED));

    /* renamed from: j, reason: collision with root package name */
    private static C4142o1 f19322j;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC4161v0 f19329g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f19323a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f19324b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f19326d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19327e = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f19328f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private Ec.o f19330h = new o.a().a();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f19325c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static Kc.b a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6833Ij c6833Ij = (C6833Ij) it.next();
            map.put(c6833Ij.f67672a, new C7104Qj(c6833Ij.f67673b ? Kc.a.READY : Kc.a.NOT_READY, c6833Ij.f67675d, c6833Ij.f67674c));
        }
        return new C7138Rj(map);
    }

    private final void c(Context context) {
        if (this.f19329g == null) {
            this.f19329g = (InterfaceC4161v0) new C4151s(C4169y.a(), context).d(context, false);
        }
    }

    private final void d(Ec.o oVar) {
        try {
            this.f19329g.u1(new L1(oVar));
        } catch (RemoteException e10) {
            Qc.p.e("Unable to set request configuration parcel.", e10);
        }
    }

    public static C4142o1 h() {
        C4142o1 c4142o1;
        synchronized (C4142o1.class) {
            try {
                if (f19322j == null) {
                    f19322j = new C4142o1();
                }
                c4142o1 = f19322j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4142o1;
    }

    public final Ec.o e() {
        return this.f19330h;
    }

    public final Kc.b g() {
        Kc.b bVarA;
        synchronized (this.f19328f) {
            try {
                com.google.android.gms.common.internal.r.q(this.f19329g != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    bVarA = a(this.f19329g.zzg());
                } catch (RemoteException unused) {
                    Qc.p.d("Unable to get Initialization status.");
                    return new Kc.b() { // from class: Mc.j1
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
    public final void m(final android.content.Context r3, java.lang.String r4, Kc.c r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.C4142o1.m(android.content.Context, java.lang.String, Kc.c):void");
    }

    final /* synthetic */ void n(Context context, String str) {
        synchronized (this.f19328f) {
            b(context, null);
        }
    }

    final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f19328f) {
            b(context, null);
        }
    }

    public final void p(String str) {
        synchronized (this.f19328f) {
            com.google.android.gms.common.internal.r.q(this.f19329g != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f19329g.p5(str);
            } catch (RemoteException e10) {
                Qc.p.e("Unable to set plugin.", e10);
            }
        }
    }

    private C4142o1() {
    }

    private final void b(Context context, String str) {
        try {
            C9526tl.a().b(context, null);
            this.f19329g.zzk();
            this.f19329g.l3(null, com.google.android.gms.dynamic.d.F2(null));
        } catch (RemoteException e10) {
            Qc.p.h("MobileAdsSettingManager initialization failed", e10);
        }
    }
}
