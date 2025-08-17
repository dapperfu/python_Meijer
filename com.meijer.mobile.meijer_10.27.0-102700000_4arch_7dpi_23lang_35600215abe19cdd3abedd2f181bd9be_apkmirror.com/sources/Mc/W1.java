package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7210Tn;

/* loaded from: classes4.dex */
public final class W1 extends RemoteCreator {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7210Tn f19164a;

    public W1() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new W(iBinder);
    }

    public final V a(Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        C8659lf.a(context);
        if (((Boolean) A.c().a(C8659lf.f75911Ba)).booleanValue()) {
            try {
                IBinder iBinderN3 = ((W) Qc.s.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new Qc.r() { // from class: Mc.V1
                    @Override // Qc.r
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new W(iBinder);
                    }
                })).N3(com.google.android.gms.dynamic.d.F2(context), d2Var, str, interfaceC6631Cl, 244410000, i10);
                if (iBinderN3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (iInterfaceQueryLocalInterface instanceof V) {
                    return (V) iInterfaceQueryLocalInterface;
                }
                return new T(iBinderN3);
            } catch (RemoteException e10) {
                e = e10;
                Throwable th2 = e;
                InterfaceC7210Tn interfaceC7210TnC = C7142Rn.c(context);
                this.f19164a = interfaceC7210TnC;
                interfaceC7210TnC.b(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Qc.p.i("#007 Could not call remote method.", th2);
                return null;
            } catch (zzr e11) {
                e = e11;
                Throwable th22 = e;
                InterfaceC7210Tn interfaceC7210TnC2 = C7142Rn.c(context);
                this.f19164a = interfaceC7210TnC2;
                interfaceC7210TnC2.b(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Qc.p.i("#007 Could not call remote method.", th22);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Throwable th222 = e;
                InterfaceC7210Tn interfaceC7210TnC22 = C7142Rn.c(context);
                this.f19164a = interfaceC7210TnC22;
                interfaceC7210TnC22.b(th222, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Qc.p.i("#007 Could not call remote method.", th222);
                return null;
            }
        }
        try {
            IBinder iBinderN32 = ((W) getRemoteCreatorInstance(context)).N3(com.google.android.gms.dynamic.d.F2(context), d2Var, str, interfaceC6631Cl, 244410000, i10);
            if (iBinderN32 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderN32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface2 instanceof V) {
                return (V) iInterfaceQueryLocalInterface2;
            }
            return new T(iBinderN32);
        } catch (RemoteException e13) {
            e = e13;
            Qc.p.c("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e14) {
            e = e14;
            Qc.p.c("Could not create remote AdManager.", e);
            return null;
        }
    }
}
