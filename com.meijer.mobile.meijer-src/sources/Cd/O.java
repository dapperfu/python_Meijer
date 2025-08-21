package Cd;

import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import jd.C14987j;

/* loaded from: classes6.dex */
final class O extends Ld.J {

    /* renamed from: a, reason: collision with root package name */
    private final K f4203a;

    final /* synthetic */ K I2() {
        return this.f4203a;
    }

    @Override // Ld.K
    public final void P5(LocationResult locationResult) throws RemoteException {
        this.f4203a.zza().c(new L(this, locationResult));
    }

    final O c2(C14987j c14987j) {
        this.f4203a.a(c14987j);
        return this;
    }

    @Override // Ld.K
    public final void j2(LocationAvailability locationAvailability) throws RemoteException {
        this.f4203a.zza().c(new M(this, locationAvailability));
    }

    @Override // Ld.K
    public final void zzf() {
        this.f4203a.zza().c(new N(this));
    }

    final void zzg() {
        this.f4203a.zza().a();
    }

    O(K k10) {
        this.f4203a = k10;
    }
}
