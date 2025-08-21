package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;

/* renamed from: Oc.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4429s extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23524b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4441w f23525c;

    C4429s(C4441w c4441w, Context context) {
        this.f23524b = context;
        this.f23525c = c4441w;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23524b, "mobile_ads_settings");
        return new E1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.x4(com.google.android.gms.dynamic.d.I2(this.f23524b), 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8784lf.a(this.f23524b);
        if (!((Boolean) A.c().a(C8784lf.f76751Ba)).booleanValue()) {
            return this.f23525c.f23541c.a(this.f23524b);
        }
        try {
            IBinder iBinderZ3 = ((C4445x0) Sc.s.b(this.f23524b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new Sc.r() { // from class: Oc.r
                @Override // Sc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof C4445x0 ? (C4445x0) iInterfaceQueryLocalInterface : new C4445x0(iBinder);
                }
            })).Z3(com.google.android.gms.dynamic.d.I2(this.f23524b), 244410000);
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC4439v0 ? (InterfaceC4439v0) iInterfaceQueryLocalInterface : new C4433t0(iBinderZ3);
        } catch (RemoteException e10) {
            e = e10;
            this.f23525c.f23545g = C7267Rn.c(this.f23524b);
            this.f23525c.f23545g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzr e11) {
            e = e11;
            this.f23525c.f23545g = C7267Rn.c(this.f23524b);
            this.f23525c.f23545g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            this.f23525c.f23545g = C7267Rn.c(this.f23524b);
            this.f23525c.f23545g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
