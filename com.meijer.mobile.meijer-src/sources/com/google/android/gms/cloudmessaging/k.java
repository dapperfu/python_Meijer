package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes4.dex */
final class k extends j {
    @Override // com.google.android.gms.cloudmessaging.j
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    k(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }
}
