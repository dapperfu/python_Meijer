package Oc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC7360Ug;
import com.google.android.gms.internal.ads.InterfaceC9323qh;

/* renamed from: Oc.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4440v1 implements Gc.i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7360Ug f23537a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9323qh f23538b;

    @Override // Gc.i
    public final boolean a() {
        try {
            return this.f23537a.zzl();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return false;
        }
    }

    public final InterfaceC7360Ug b() {
        return this.f23537a;
    }

    @Override // Gc.i
    public final InterfaceC9323qh zza() {
        return this.f23538b;
    }

    @Override // Gc.i
    public final boolean zzb() {
        try {
            return this.f23537a.zzk();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return false;
        }
    }
}
