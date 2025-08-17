package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;

/* renamed from: Mc.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4151s extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19337b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4163w f19338c;

    C4151s(C4163w c4163w, Context context) {
        this.f19337b = context;
        this.f19338c = c4163w;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19337b, "mobile_ads_settings");
        return new E1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.j4(com.google.android.gms.dynamic.d.F2(this.f19337b), 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8659lf.a(this.f19337b);
        if (!((Boolean) A.c().a(C8659lf.f75911Ba)).booleanValue()) {
            return this.f19338c.f19354c.a(this.f19337b);
        }
        try {
            IBinder iBinderN3 = ((C4167x0) Qc.s.b(this.f19337b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new Qc.r() { // from class: Mc.r
                @Override // Qc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof C4167x0 ? (C4167x0) iInterfaceQueryLocalInterface : new C4167x0(iBinder);
                }
            })).N3(com.google.android.gms.dynamic.d.F2(this.f19337b), 244410000);
            if (iBinderN3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC4161v0 ? (InterfaceC4161v0) iInterfaceQueryLocalInterface : new C4155t0(iBinderN3);
        } catch (RemoteException e10) {
            e = e10;
            this.f19338c.f19358g = C7142Rn.c(this.f19337b);
            this.f19338c.f19358g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzr e11) {
            e = e11;
            this.f19338c.f19358g = C7142Rn.c(this.f19337b);
            this.f19338c.f19358g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            this.f19338c.f19358g = C7142Rn.c(this.f19337b);
            this.f19338c.f19358g.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
