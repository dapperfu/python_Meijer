package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9107pp {
    public static final InterfaceC7719cp a(Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        try {
            IBinder iBinderN3 = ((C8146gp) Qc.s.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new Qc.r() { // from class: com.google.android.gms.internal.ads.op
                @Override // Qc.r
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof C8146gp ? (C8146gp) iInterfaceQueryLocalInterface : new C8146gp(iBinder);
                }
            })).N3(com.google.android.gms.dynamic.d.F2(context), str, interfaceC6631Cl, 244410000);
            if (iBinderN3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC7719cp) {
                return (InterfaceC7719cp) iInterfaceQueryLocalInterface;
            }
            return new C7506ap(iBinderN3);
        } catch (RemoteException e10) {
            e = e10;
            Qc.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (zzr e11) {
            e = e11;
            Qc.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
