package Mc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC7235Ug;
import com.google.android.gms.internal.ads.InterfaceC9198qh;

/* renamed from: Mc.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4162v1 implements Ec.i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7235Ug f19350a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9198qh f19351b;

    @Override // Ec.i
    public final boolean a() {
        try {
            return this.f19350a.zzl();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return false;
        }
    }

    public final InterfaceC7235Ug b() {
        return this.f19350a;
    }

    @Override // Ec.i
    public final InterfaceC9198qh zza() {
        return this.f19351b;
    }

    @Override // Ec.i
    public final boolean zzb() {
        try {
            return this.f19350a.zzk();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return false;
        }
    }
}
