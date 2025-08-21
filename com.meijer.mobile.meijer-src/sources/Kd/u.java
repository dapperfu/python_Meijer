package Kd;

import Vd.C5517k;
import Zd.C5629b;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* loaded from: classes6.dex */
final class u extends t {

    /* renamed from: a, reason: collision with root package name */
    private final C5517k f16571a;

    @Override // Kd.t, Kd.r
    public final void o4(int i10, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        com.google.android.gms.wallet.a.f((pendingIntent == null || i10 != 6) ? new Status(i10) : new Status(6, "Need to resolve PendingIntent", pendingIntent), new C5629b(), this.f16571a);
    }

    public u(C5517k c5517k) {
        this.f16571a = c5517k;
    }
}
