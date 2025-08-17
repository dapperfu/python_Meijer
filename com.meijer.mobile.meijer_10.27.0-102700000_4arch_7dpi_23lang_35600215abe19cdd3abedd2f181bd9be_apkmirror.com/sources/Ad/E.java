package Ad;

import Jd.AbstractC3777k;
import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import hd.C14410k;

/* loaded from: classes6.dex */
final class E extends AbstractC3777k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f194a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f195b;

    E(P p10, C5233k c5233k) {
        this.f194a = c5233k;
        this.f195b = p10;
    }

    @Override // Jd.AbstractC3777k
    public final void b(LocationResult locationResult) {
        this.f194a.e(locationResult.B());
        try {
            this.f195b.k(C14410k.c(this, "GetCurrentLocation"), false, new C5233k());
        } catch (RemoteException unused) {
        }
    }
}
