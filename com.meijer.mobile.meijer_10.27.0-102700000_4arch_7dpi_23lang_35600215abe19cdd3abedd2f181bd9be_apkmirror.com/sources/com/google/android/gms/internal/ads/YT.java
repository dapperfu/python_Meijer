package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class YT implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71554a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8522kH f71555b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f71556c;

    /* renamed from: d, reason: collision with root package name */
    private final Y50 f71557d;

    /* renamed from: e, reason: collision with root package name */
    private final C9812wN f71558e;

    public YT(Context context, Executor executor, AbstractC8522kH abstractC8522kH, Y50 y50, C9812wN c9812wN) {
        this.f71554a = context;
        this.f71555b = abstractC8522kH;
        this.f71556c = executor;
        this.f71557d = y50;
        this.f71558e = c9812wN;
    }

    private static String e(Z50 z50) {
        try {
            return z50.f72063v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        Context context = this.f71554a;
        return (context instanceof Activity) && C6961Mf.g(context) && !TextUtils.isEmpty(e(z50));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76179Uc)).booleanValue()) {
            C9705vN c9705vNA = this.f71558e.a();
            c9705vNA.b("action", "cstm_tbs_rndr");
            c9705vNA.g();
        }
        String strE = e(z50);
        final Uri uri = strE != null ? Uri.parse(strE) : null;
        final C7648c60 c7648c60 = c8608l60.f75749b.f75337b;
        return Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.WT
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71090a.c(uri, c8608l60, z50, c7648c60, obj);
            }
        }, this.f71556c);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(Uri uri, C8608l60 c8608l60, Z50 z50, C7648c60 c7648c60, Object obj) throws Exception {
        try {
            androidx.browser.customtabs.d dVarA = new d.C0965d().a();
            dVarA.f47181a.setData(uri);
            Oc.l lVar = new Oc.l(dVarA.f47181a, null);
            final C7145Rq c7145Rq = new C7145Rq();
            GG ggC = this.f71555b.c(new C7154Rz(c8608l60, z50, null), new JG(new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.XT
                @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
                public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
                    this.f71326a.d(c7145Rq, z10, context, c8833nC);
                }
            }, null));
            c7145Rq.b(new AdOverlayInfoParcel(lVar, null, ggC.h(), null, new Qc.a(0, 0, false), null, null, c7648c60.f73103b));
            this.f71557d.a();
            return Mj0.h(ggC.i());
        } catch (Throwable th2) {
            Qc.p.e("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    final /* synthetic */ void d(C7145Rq c7145Rq, boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
        try {
            Lc.v.m();
            Oc.o.a(context, (AdOverlayInfoParcel) c7145Rq.get(), true, this.f71558e);
        } catch (Exception unused) {
        }
    }
}
