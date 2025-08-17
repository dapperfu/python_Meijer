package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import gd.C14248g;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzll extends RemoteCreator {
    private static final zzll zza = new zzll();

    private zzll() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return iInterfaceQueryLocalInterface instanceof zzlp ? (zzlp) iInterfaceQueryLocalInterface : new zzlp(iBinder);
    }

    public static zzlo zza(Context context, Executor executor, zzm zzmVar) {
        zzlo zzloVarZzb = null;
        if (zzmVar.zzk() && C14248g.f().h(context, 12800000) == 0) {
            zzloVarZzb = zza.zzb(context, executor, zzmVar);
        }
        if (zzloVarZzb == null) {
            return new zzlk(context, executor, zzmVar);
        }
        return zzloVarZzb;
    }

    private final zzlo zzb(Context context, Executor executor, zzm zzmVar) {
        try {
            IBinder iBinderZze = ((zzlp) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.d.F2(context), com.google.android.gms.dynamic.d.F2(executor), zzmVar.zzav());
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (iInterfaceQueryLocalInterface instanceof zzlo) {
                return (zzlo) iInterfaceQueryLocalInterface;
            }
            return new zzlm(iBinderZze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | IllegalArgumentException | LinkageError unused) {
            return null;
        }
    }
}
