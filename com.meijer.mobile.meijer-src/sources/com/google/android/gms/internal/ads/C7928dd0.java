package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.dd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7928dd0 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC8248gd0 f74278a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f74279b;

    private C7928dd0(InterfaceC8248gd0 interfaceC8248gd0) {
        this.f74278a = interfaceC8248gd0;
        this.f74279b = interfaceC8248gd0 != null;
    }

    public final C7715bd0 a(byte[] bArr) {
        return new C7715bd0(this, bArr, null);
    }

    public static C7928dd0 b(Context context, String str, String str2) throws zzfom {
        InterfaceC8248gd0 c8034ed0;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f65836b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        c8034ed0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c8034ed0 = iInterfaceQueryLocalInterface instanceof InterfaceC8248gd0 ? (InterfaceC8248gd0) iInterfaceQueryLocalInterface : new C8034ed0(iBinderD);
                    }
                    c8034ed0.zze(com.google.android.gms.dynamic.d.I2(context), str, null);
                    com.fullstory.FS.log_i("GASS", "GassClearcutLogger Initialized.");
                    return new C7928dd0(c8034ed0);
                } catch (Exception e10) {
                    throw new zzfom(e10);
                }
            } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
                com.fullstory.FS.log_d("GASS", "Cannot dynamite load clearcut");
                return new C7928dd0(new BinderC8355hd0());
            }
        } catch (Exception e11) {
            throw new zzfom(e11);
        }
    }

    public static C7928dd0 c() {
        BinderC8355hd0 binderC8355hd0 = new BinderC8355hd0();
        com.fullstory.FS.log_d("GASS", "Clearcut logging disabled");
        return new C7928dd0(binderC8355hd0);
    }
}
