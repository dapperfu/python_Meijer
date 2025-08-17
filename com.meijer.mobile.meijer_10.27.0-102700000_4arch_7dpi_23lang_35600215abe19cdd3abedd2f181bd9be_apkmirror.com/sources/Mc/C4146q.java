package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4146q extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19331b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19332c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19333d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4163w f19334e;

    C4146q(C4163w c4163w, Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19331b = context;
        this.f19332c = str;
        this.f19333d = interfaceC6631Cl;
        this.f19334e = c4163w;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19331b, "native_ad");
        return new A1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.F7(com.google.android.gms.dynamic.d.F2(this.f19331b), this.f19332c, this.f19333d, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8659lf.a(this.f19331b);
        if (!((Boolean) A.c().a(C8659lf.f75911Ba)).booleanValue()) {
            return this.f19334e.f19353b.a(this.f19331b, this.f19332c, this.f19333d);
        }
        try {
            IBinder iBinderN3 = ((S) Qc.s.b(this.f19331b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new Qc.r() { // from class: Mc.p
                @Override // Qc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new S(iBinder);
                }
            })).N3(com.google.android.gms.dynamic.d.F2(this.f19331b), this.f19332c, this.f19333d, 244410000);
            if (iBinderN3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof Q ? (Q) iInterfaceQueryLocalInterface : new O(iBinderN3);
        } catch (RemoteException e10) {
            e = e10;
            this.f19334e.f19358g = C7142Rn.c(this.f19331b);
            this.f19334e.f19358g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzr e11) {
            e = e11;
            this.f19334e.f19358g = C7142Rn.c(this.f19331b);
            this.f19334e.f19358g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            this.f19334e.f19358g = C7142Rn.c(this.f19331b);
            this.f19334e.f19358g.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
