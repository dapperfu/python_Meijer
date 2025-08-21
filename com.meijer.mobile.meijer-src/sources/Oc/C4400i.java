package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC8699kq;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC8806lq;

/* renamed from: Oc.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4400i extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23463b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23464c;

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    C4400i(C4441w c4441w, Context context, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23463b = context;
        this.f23464c = interfaceC6756Cl;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.U5(com.google.android.gms.dynamic.d.I2(this.f23463b), this.f23464c, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((InterfaceC8806lq) Sc.s.b(this.f23463b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new Sc.r() { // from class: Oc.h
                @Override // Sc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC8699kq.B9((IBinder) obj);
                }
            })).i0(com.google.android.gms.dynamic.d.I2(this.f23463b), this.f23464c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
