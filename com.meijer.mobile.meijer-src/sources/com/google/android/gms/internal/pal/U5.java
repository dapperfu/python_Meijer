package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes6.dex */
public final class U5 {

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final X5 f83741a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    final boolean f83742b;

    private U5(X5 x52) {
        this.f83741a = x52;
        this.f83742b = x52 != null;
    }

    public final T5 a(byte[] bArr) {
        return new T5(this, bArr, null);
    }

    public static U5 b(Context context, String str, String str2) throws zzhg {
        X5 v52;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f65836b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        v52 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        v52 = iInterfaceQueryLocalInterface instanceof X5 ? (X5) iInterfaceQueryLocalInterface : new V5(iBinderD);
                    }
                    v52.zze(com.google.android.gms.dynamic.d.I2(context), "ADSHIELD", null);
                    FS.log_i("GASS", "GassClearcutLogger Initialized.");
                    return new U5(v52);
                } catch (Exception e10) {
                    throw new zzhg(e10);
                }
            } catch (Exception e11) {
                throw new zzhg(e11);
            }
        } catch (RemoteException | zzhg | NullPointerException | SecurityException unused) {
            FS.log_d("GASS", "Cannot dynamite load clearcut");
            return new U5(new Y5());
        }
    }
}
