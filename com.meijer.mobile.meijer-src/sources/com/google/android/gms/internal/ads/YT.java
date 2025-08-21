package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class YT implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72394a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8647kH f72395b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f72396c;

    /* renamed from: d, reason: collision with root package name */
    private final Y50 f72397d;

    /* renamed from: e, reason: collision with root package name */
    private final C9937wN f72398e;

    public YT(Context context, Executor executor, AbstractC8647kH abstractC8647kH, Y50 y50, C9937wN c9937wN) {
        this.f72394a = context;
        this.f72395b = abstractC8647kH;
        this.f72396c = executor;
        this.f72397d = y50;
        this.f72398e = c9937wN;
    }

    private static String e(Z50 z50) {
        try {
            return z50.f72903v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        Context context = this.f72394a;
        return (context instanceof Activity) && C7086Mf.g(context) && !TextUtils.isEmpty(e(z50));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77019Uc)).booleanValue()) {
            C9830vN c9830vNA = this.f72398e.a();
            c9830vNA.b("action", "cstm_tbs_rndr");
            c9830vNA.g();
        }
        String strE = e(z50);
        final Uri uri = strE != null ? Uri.parse(strE) : null;
        final C7773c60 c7773c60 = c8733l60.f76589b.f76177b;
        return Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.WT
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71930a.c(uri, c8733l60, z50, c7773c60, obj);
            }
        }, this.f72396c);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(Uri uri, C8733l60 c8733l60, Z50 z50, C7773c60 c7773c60, Object obj) throws Exception {
        try {
            androidx.browser.customtabs.d dVarA = new d.C0978d().a();
            dVarA.f47405a.setData(uri);
            Qc.l lVar = new Qc.l(dVarA.f47405a, null);
            final C7270Rq c7270Rq = new C7270Rq();
            GG ggC = this.f72395b.c(new C7279Rz(c8733l60, z50, null), new JG(new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.XT
                @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
                public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
                    this.f72166a.d(c7270Rq, z10, context, c8958nC);
                }
            }, null));
            c7270Rq.b(new AdOverlayInfoParcel(lVar, null, ggC.h(), null, new Sc.a(0, 0, false), null, null, c7773c60.f73943b));
            this.f72397d.a();
            return Mj0.h(ggC.i());
        } catch (Throwable th2) {
            Sc.p.e("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    final /* synthetic */ void d(C7270Rq c7270Rq, boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
        try {
            Nc.v.m();
            Qc.o.a(context, (AdOverlayInfoParcel) c7270Rq.get(), true, this.f72398e);
        } catch (Exception unused) {
        }
    }
}
