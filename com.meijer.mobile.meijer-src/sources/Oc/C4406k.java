package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC9014nn;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC9228pn;

/* renamed from: Oc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4406k extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23483c;

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    C4406k(C4441w c4441w, Context context, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23482b = context;
        this.f23483c = interfaceC6756Cl;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.h8(com.google.android.gms.dynamic.d.I2(this.f23482b), this.f23483c, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((InterfaceC9228pn) Sc.s.b(this.f23482b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new Sc.r() { // from class: Oc.j
                @Override // Sc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC9014nn.B9((IBinder) obj);
                }
            })).i0(com.google.android.gms.dynamic.d.I2(this.f23482b), this.f23483c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
