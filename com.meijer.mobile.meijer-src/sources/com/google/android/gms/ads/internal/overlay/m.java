package com.google.android.gms.ads.internal.overlay;

import Rc.p0;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class m extends h {
    @Override // com.google.android.gms.ads.internal.overlay.h, com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void G3(Bundle bundle) {
        p0.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f65463v = 4;
        this.f65442a.finish();
    }

    public m(Activity activity) {
        super(activity);
    }
}
