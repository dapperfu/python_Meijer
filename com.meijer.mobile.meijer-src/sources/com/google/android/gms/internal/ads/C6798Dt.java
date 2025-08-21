package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.Dt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6798Dt {
    public static final InterfaceC9133ot a(final Context context, final C8493iu c8493iu, final String str, final boolean z10, final boolean z11, final M9 m92, final C7290Sf c7290Sf, final Sc.a aVar, C6679Af c6679Af, final Nc.n nVar, final Nc.a aVar2, final C7517Zc c7517Zc, final Z50 z50, final C7773c60 c7773c60, final GS gs2, final C10123y60 c10123y60) throws zzcfj {
        C8784lf.a(context);
        try {
            final C6679Af c6679Af2 = null;
            InterfaceC7425Wf0 interfaceC7425Wf0 = new InterfaceC7425Wf0(context, c8493iu, str, z10, z11, m92, c7290Sf, aVar, c6679Af2, nVar, aVar2, c7517Zc, z50, c7773c60, c10123y60, gs2) { // from class: com.google.android.gms.internal.ads.At

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Context f66056a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C8493iu f66057b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f66058c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f66059d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f66060e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ M9 f66061f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C7290Sf f66062g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Sc.a f66063h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Nc.n f66064i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Nc.a f66065j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ C7517Zc f66066k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Z50 f66067l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C7773c60 f66068m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C10123y60 f66069n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ GS f66070o;

                @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
                public final Object zza() {
                    C8493iu c8493iu2 = this.f66057b;
                    String str2 = this.f66058c;
                    boolean z12 = this.f66059d;
                    C7517Zc c7517Zc2 = this.f66066k;
                    boolean z13 = this.f66060e;
                    M9 m93 = this.f66061f;
                    Z50 z502 = this.f66067l;
                    C7290Sf c7290Sf2 = this.f66062g;
                    Nc.n nVar2 = this.f66064i;
                    C7773c60 c7773c602 = this.f66068m;
                    Context context2 = this.f66056a;
                    Sc.a aVar3 = this.f66063h;
                    Nc.a aVar4 = this.f66065j;
                    C10123y60 c10123y602 = this.f66069n;
                    GS gs3 = this.f66070o;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcfw.f81485b0;
                        zzcfp zzcfpVar = new zzcfp(new zzcfw(new C8388hu(context2), c8493iu2, str2, z12, z13, m93, c7290Sf2, aVar3, null, nVar2, aVar4, c7517Zc2, z502, c7773c602, c10123y602));
                        zzcfpVar.setWebViewClient(Nc.v.u().c(zzcfpVar, c7517Zc2, z13, gs3));
                        zzcfpVar.setWebChromeClient(new C9026nt(zzcfpVar));
                        return zzcfpVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }

                {
                    this.f66064i = nVar;
                    this.f66065j = aVar2;
                    this.f66066k = c7517Zc;
                    this.f66067l = z50;
                    this.f66068m = c7773c60;
                    this.f66069n = c10123y60;
                    this.f66070o = gs2;
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = interfaceC7425Wf0.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC9133ot) objZza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzcfj("Webview initialization failed.", th3);
        }
    }
}
