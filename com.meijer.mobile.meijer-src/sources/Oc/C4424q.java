package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4424q extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f23519c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23520d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4441w f23521e;

    C4424q(C4441w c4441w, Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23518b = context;
        this.f23519c = str;
        this.f23520d = interfaceC6756Cl;
        this.f23521e = c4441w;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23518b, "native_ad");
        return new A1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.J7(com.google.android.gms.dynamic.d.I2(this.f23518b), this.f23519c, this.f23520d, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8784lf.a(this.f23518b);
        if (!((Boolean) A.c().a(C8784lf.f76751Ba)).booleanValue()) {
            return this.f23521e.f23540b.a(this.f23518b, this.f23519c, this.f23520d);
        }
        try {
            IBinder iBinderZ3 = ((S) Sc.s.b(this.f23518b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new Sc.r() { // from class: Oc.p
                @Override // Sc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new S(iBinder);
                }
            })).Z3(com.google.android.gms.dynamic.d.I2(this.f23518b), this.f23519c, this.f23520d, 244410000);
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof Q ? (Q) iInterfaceQueryLocalInterface : new O(iBinderZ3);
        } catch (RemoteException e10) {
            e = e10;
            this.f23521e.f23545g = C7267Rn.c(this.f23518b);
            this.f23521e.f23545g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzr e11) {
            e = e11;
            this.f23521e.f23545g = C7267Rn.c(this.f23518b);
            this.f23521e.f23545g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            this.f23521e.f23545g = C7267Rn.c(this.f23518b);
            this.f23521e.f23545g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
