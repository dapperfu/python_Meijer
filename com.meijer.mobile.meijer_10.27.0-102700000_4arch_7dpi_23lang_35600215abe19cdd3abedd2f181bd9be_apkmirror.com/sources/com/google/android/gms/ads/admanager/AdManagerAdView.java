package com.google.android.gms.ads.admanager;

import Ec.e;
import Ec.s;
import Mc.A;
import Qc.c;
import android.content.Context;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        r.m(context, "Context cannot be null");
    }

    public void f(final Fc.a aVar) {
        r.e("#008 Must be called on the main UI thread.");
        C8659lf.a(getContext());
        if (((Boolean) C8554kg.f75690f.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64548a.g(aVar);
                    }
                });
                return;
            }
        }
        this.f64545a.q(aVar.a());
    }

    final /* synthetic */ void g(Fc.a aVar) {
        try {
            this.f64545a.q(aVar.a());
        } catch (IllegalStateException e10) {
            C7142Rn.c(getContext()).b(e10, "AdManagerAdView.loadAd");
        }
    }

    public e[] getAdSizes() {
        return this.f64545a.b();
    }

    public Fc.c getAppEventListener() {
        return this.f64545a.l();
    }

    public Ec.r getVideoController() {
        return this.f64545a.j();
    }

    public s getVideoOptions() {
        return this.f64545a.k();
    }

    public void setAdSizes(e... eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f64545a.w(eVarArr);
    }

    public void setAppEventListener(Fc.c cVar) {
        this.f64545a.y(cVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f64545a.z(z10);
    }

    public void setVideoOptions(s sVar) {
        this.f64545a.B(sVar);
    }
}
