package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: Oc.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4443w1 extends RemoteCreator {
    public final InterfaceC4439v0 a(Context context) {
        try {
            IBinder iBinderZ3 = ((C4445x0) getRemoteCreatorInstance(context)).Z3(com.google.android.gms.dynamic.d.I2(context), 244410000);
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC4439v0 ? (InterfaceC4439v0) iInterfaceQueryLocalInterface : new C4433t0(iBinderZ3);
        } catch (RemoteException e10) {
            e = e10;
            Sc.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Sc.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    public C4443w1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C4445x0 ? (C4445x0) iInterfaceQueryLocalInterface : new C4445x0(iBinder);
    }
}
