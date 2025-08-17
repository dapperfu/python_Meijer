package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.Dt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6673Dt {
    public static final InterfaceC9008ot a(final Context context, final C8368iu c8368iu, final String str, final boolean z10, final boolean z11, final M9 m92, final C7165Sf c7165Sf, final Qc.a aVar, C6554Af c6554Af, final Lc.n nVar, final Lc.a aVar2, final C7392Zc c7392Zc, final Z50 z50, final C7648c60 c7648c60, final GS gs2, final C9998y60 c9998y60) throws zzcfj {
        C8659lf.a(context);
        try {
            final C6554Af c6554Af2 = null;
            InterfaceC7300Wf0 interfaceC7300Wf0 = new InterfaceC7300Wf0(context, c8368iu, str, z10, z11, m92, c7165Sf, aVar, c6554Af2, nVar, aVar2, c7392Zc, z50, c7648c60, c9998y60, gs2) { // from class: com.google.android.gms.internal.ads.At

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Context f65216a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C8368iu f65217b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f65218c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f65219d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f65220e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ M9 f65221f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C7165Sf f65222g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Qc.a f65223h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Lc.n f65224i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Lc.a f65225j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ C7392Zc f65226k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Z50 f65227l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C7648c60 f65228m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C9998y60 f65229n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ GS f65230o;

                @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
                public final Object zza() {
                    C8368iu c8368iu2 = this.f65217b;
                    String str2 = this.f65218c;
                    boolean z12 = this.f65219d;
                    C7392Zc c7392Zc2 = this.f65226k;
                    boolean z13 = this.f65220e;
                    M9 m93 = this.f65221f;
                    Z50 z502 = this.f65227l;
                    C7165Sf c7165Sf2 = this.f65222g;
                    Lc.n nVar2 = this.f65224i;
                    C7648c60 c7648c602 = this.f65228m;
                    Context context2 = this.f65216a;
                    Qc.a aVar3 = this.f65223h;
                    Lc.a aVar4 = this.f65225j;
                    C9998y60 c9998y602 = this.f65229n;
                    GS gs3 = this.f65230o;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcfw.f80645b0;
                        zzcfp zzcfpVar = new zzcfp(new zzcfw(new C8263hu(context2), c8368iu2, str2, z12, z13, m93, c7165Sf2, aVar3, null, nVar2, aVar4, c7392Zc2, z502, c7648c602, c9998y602));
                        zzcfpVar.setWebViewClient(Lc.v.u().c(zzcfpVar, c7392Zc2, z13, gs3));
                        zzcfpVar.setWebChromeClient(new C8901nt(zzcfpVar));
                        return zzcfpVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }

                {
                    this.f65224i = nVar;
                    this.f65225j = aVar2;
                    this.f65226k = c7392Zc;
                    this.f65227l = z50;
                    this.f65228m = c7648c60;
                    this.f65229n = c9998y60;
                    this.f65230o = gs2;
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = interfaceC7300Wf0.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC9008ot) objZza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzcfj("Webview initialization failed.", th3);
        }
    }
}
