package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC8889nn;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC9103pn;

/* renamed from: Mc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4128k extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19295b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19296c;

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    C4128k(C4163w c4163w, Context context, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19295b = context;
        this.f19296c = interfaceC6631Cl;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.k8(com.google.android.gms.dynamic.d.F2(this.f19295b), this.f19296c, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((InterfaceC9103pn) Qc.s.b(this.f19295b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new Qc.r() { // from class: Mc.j
                @Override // Qc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC8889nn.B9((IBinder) obj);
                }
            })).g0(com.google.android.gms.dynamic.d.F2(this.f19295b), this.f19296c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
