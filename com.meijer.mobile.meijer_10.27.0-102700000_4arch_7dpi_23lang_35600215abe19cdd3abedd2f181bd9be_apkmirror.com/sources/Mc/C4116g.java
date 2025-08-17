package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4116g extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19263b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19264c;

    C4116g(C4163w c4163w, Context context, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19263b = context;
        this.f19264c = interfaceC6631Cl;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19263b, "out_of_context_tester");
        return null;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        Context context = this.f19263b;
        com.google.android.gms.dynamic.b bVarF2 = com.google.android.gms.dynamic.d.F2(context);
        C8659lf.a(context);
        if (((Boolean) A.c().a(C8659lf.f76441n9)).booleanValue()) {
            return interfaceC4132l0.J1(bVarF2, this.f19264c, 244410000);
        }
        return null;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        Context context = this.f19263b;
        com.google.android.gms.dynamic.b bVarF2 = com.google.android.gms.dynamic.d.F2(context);
        C8659lf.a(context);
        if (((Boolean) A.c().a(C8659lf.f76441n9)).booleanValue()) {
            try {
                return ((R0) Qc.s.b(this.f19263b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new Qc.r() { // from class: Mc.f
                    @Override // Qc.r
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof R0 ? (R0) iInterfaceQueryLocalInterface : new R0(iBinder);
                    }
                })).N3(bVarF2, this.f19264c, 244410000);
            } catch (RemoteException | zzr | NullPointerException e10) {
                C7142Rn.c(this.f19263b).b(e10, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
