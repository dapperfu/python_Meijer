package com.google.android.gms.ads.internal.overlay;

import Pc.p0;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class m extends h {
    @Override // com.google.android.gms.ads.internal.overlay.h, com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void v3(Bundle bundle) {
        p0.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f64623v = 4;
        this.f64602a.finish();
    }

    public m(Activity activity) {
        super(activity);
    }
}
