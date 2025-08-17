package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes4.dex */
final class i extends j {
    @Override // com.google.android.gms.cloudmessaging.j
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    i(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }
}
