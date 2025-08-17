package Ad;

import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import hd.C14409j;

/* loaded from: classes6.dex */
final class O extends Jd.J {

    /* renamed from: a, reason: collision with root package name */
    private final K f207a;

    final /* synthetic */ K F2() {
        return this.f207a;
    }

    @Override // Jd.K
    public final void F5(LocationResult locationResult) throws RemoteException {
        this.f207a.zza().c(new L(this, locationResult));
    }

    final O b2(C14409j c14409j) {
        this.f207a.a(c14409j);
        return this;
    }

    @Override // Jd.K
    public final void h2(LocationAvailability locationAvailability) throws RemoteException {
        this.f207a.zza().c(new M(this, locationAvailability));
    }

    @Override // Jd.K
    public final void zzf() {
        this.f207a.zza().c(new N(this));
    }

    final void zzg() {
        this.f207a.zza().a();
    }

    O(K k10) {
        this.f207a = k10;
    }
}
