package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9232pp {
    public static final InterfaceC7844cp a(Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        try {
            IBinder iBinderZ3 = ((C8271gp) Sc.s.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new Sc.r() { // from class: com.google.android.gms.internal.ads.op
                @Override // Sc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof C8271gp ? (C8271gp) iInterfaceQueryLocalInterface : new C8271gp(iBinder);
                }
            })).Z3(com.google.android.gms.dynamic.d.I2(context), str, interfaceC6756Cl, 244410000);
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC7844cp) {
                return (InterfaceC7844cp) iInterfaceQueryLocalInterface;
            }
            return new C7631ap(iBinderZ3);
        } catch (RemoteException e10) {
            e = e10;
            Sc.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (zzr e11) {
            e = e11;
            Sc.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
