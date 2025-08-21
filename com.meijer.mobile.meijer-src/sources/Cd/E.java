package Cd;

import Ld.AbstractC4021k;
import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import jd.C14988k;

/* loaded from: classes6.dex */
final class E extends AbstractC4021k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f4190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f4191b;

    E(P p10, C5517k c5517k) {
        this.f4190a = c5517k;
        this.f4191b = p10;
    }

    @Override // Ld.AbstractC4021k
    public final void b(LocationResult locationResult) {
        this.f4190a.e(locationResult.B());
        try {
            this.f4191b.k(C14988k.c(this, "GetCurrentLocation"), false, new C5517k());
        } catch (RemoteException unused) {
        }
    }
}
