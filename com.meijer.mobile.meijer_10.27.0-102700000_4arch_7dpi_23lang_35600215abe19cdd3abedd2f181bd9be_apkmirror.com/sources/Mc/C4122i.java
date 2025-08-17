package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC8574kq;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC8681lq;

/* renamed from: Mc.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4122i extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19276b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19277c;

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    C4122i(C4163w c4163w, Context context, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19276b = context;
        this.f19277c = interfaceC6631Cl;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.L5(com.google.android.gms.dynamic.d.F2(this.f19276b), this.f19277c, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((InterfaceC8681lq) Qc.s.b(this.f19276b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new Qc.r() { // from class: Mc.h
                @Override // Qc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC8574kq.B9((IBinder) obj);
                }
            })).g0(com.google.android.gms.dynamic.d.F2(this.f19276b), this.f19277c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
