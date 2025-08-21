package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7335Tn;

/* loaded from: classes4.dex */
public final class W1 extends RemoteCreator {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7335Tn f23351a;

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

    public final V a(Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        C8784lf.a(context);
        if (((Boolean) A.c().a(C8784lf.f76751Ba)).booleanValue()) {
            try {
                IBinder iBinderZ3 = ((W) Sc.s.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new Sc.r() { // from class: Oc.V1
                    @Override // Sc.r
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new W(iBinder);
                    }
                })).Z3(com.google.android.gms.dynamic.d.I2(context), d2Var, str, interfaceC6756Cl, 244410000, i10);
                if (iBinderZ3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (iInterfaceQueryLocalInterface instanceof V) {
                    return (V) iInterfaceQueryLocalInterface;
                }
                return new T(iBinderZ3);
            } catch (RemoteException e10) {
                e = e10;
                Throwable th2 = e;
                InterfaceC7335Tn interfaceC7335TnC = C7267Rn.c(context);
                this.f23351a = interfaceC7335TnC;
                interfaceC7335TnC.b(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Sc.p.i("#007 Could not call remote method.", th2);
                return null;
            } catch (zzr e11) {
                e = e11;
                Throwable th22 = e;
                InterfaceC7335Tn interfaceC7335TnC2 = C7267Rn.c(context);
                this.f23351a = interfaceC7335TnC2;
                interfaceC7335TnC2.b(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Sc.p.i("#007 Could not call remote method.", th22);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Throwable th222 = e;
                InterfaceC7335Tn interfaceC7335TnC22 = C7267Rn.c(context);
                this.f23351a = interfaceC7335TnC22;
                interfaceC7335TnC22.b(th222, "AdManagerCreator.newAdManagerByDynamiteLoader");
                Sc.p.i("#007 Could not call remote method.", th222);
                return null;
            }
        }
        try {
            IBinder iBinderZ32 = ((W) getRemoteCreatorInstance(context)).Z3(com.google.android.gms.dynamic.d.I2(context), d2Var, str, interfaceC6756Cl, 244410000, i10);
            if (iBinderZ32 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZ32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface2 instanceof V) {
                return (V) iInterfaceQueryLocalInterface2;
            }
            return new T(iBinderZ32);
        } catch (RemoteException e13) {
            e = e13;
            Sc.p.c("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e14) {
            e = e14;
            Sc.p.c("Could not create remote AdManager.", e);
            return null;
        }
    }
}
