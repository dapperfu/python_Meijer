package com.google.android.gms.ads.admanager;

import Gc.e;
import Gc.s;
import Oc.A;
import Sc.c;
import android.content.Context;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        r.m(context, "Context cannot be null");
    }

    public void f(final Hc.a aVar) {
        r.e("#008 Must be called on the main UI thread.");
        C8784lf.a(getContext());
        if (((Boolean) C8679kg.f76530f.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65388a.g(aVar);
                    }
                });
                return;
            }
        }
        this.f65385a.q(aVar.a());
    }

    final /* synthetic */ void g(Hc.a aVar) {
        try {
            this.f65385a.q(aVar.a());
        } catch (IllegalStateException e10) {
            C7267Rn.c(getContext()).b(e10, "AdManagerAdView.loadAd");
        }
    }

    public e[] getAdSizes() {
        return this.f65385a.b();
    }

    public Hc.c getAppEventListener() {
        return this.f65385a.l();
    }

    public Gc.r getVideoController() {
        return this.f65385a.j();
    }

    public s getVideoOptions() {
        return this.f65385a.k();
    }

    public void setAdSizes(e... eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f65385a.w(eVarArr);
    }

    public void setAppEventListener(Hc.c cVar) {
        this.f65385a.y(cVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f65385a.z(z10);
    }

    public void setVideoOptions(s sVar) {
        this.f65385a.B(sVar);
    }
}
