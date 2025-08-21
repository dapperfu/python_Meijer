package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4394g extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23451c;

    C4394g(C4441w c4441w, Context context, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23450b = context;
        this.f23451c = interfaceC6756Cl;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23450b, "out_of_context_tester");
        return null;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        Context context = this.f23450b;
        com.google.android.gms.dynamic.b bVarI2 = com.google.android.gms.dynamic.d.I2(context);
        C8784lf.a(context);
        if (((Boolean) A.c().a(C8784lf.f77281n9)).booleanValue()) {
            return interfaceC4410l0.Q1(bVarI2, this.f23451c, 244410000);
        }
        return null;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        Context context = this.f23450b;
        com.google.android.gms.dynamic.b bVarI2 = com.google.android.gms.dynamic.d.I2(context);
        C8784lf.a(context);
        if (((Boolean) A.c().a(C8784lf.f77281n9)).booleanValue()) {
            try {
                return ((R0) Sc.s.b(this.f23450b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new Sc.r() { // from class: Oc.f
                    @Override // Sc.r
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof R0 ? (R0) iInterfaceQueryLocalInterface : new R0(iBinder);
                    }
                })).Z3(bVarI2, this.f23451c, 244410000);
            } catch (RemoteException | zzr | NullPointerException e10) {
                C7267Rn.c(this.f23450b).b(e10, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
