package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.dd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7803dd0 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC8123gd0 f73438a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f73439b;

    private C7803dd0(InterfaceC8123gd0 interfaceC8123gd0) {
        this.f73438a = interfaceC8123gd0;
        this.f73439b = interfaceC8123gd0 != null;
    }

    public final C7590bd0 a(byte[] bArr) {
        return new C7590bd0(this, bArr, null);
    }

    public static C7803dd0 b(Context context, String str, String str2) throws zzfom {
        InterfaceC8123gd0 c7909ed0;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f64996b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        c7909ed0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c7909ed0 = iInterfaceQueryLocalInterface instanceof InterfaceC8123gd0 ? (InterfaceC8123gd0) iInterfaceQueryLocalInterface : new C7909ed0(iBinderD);
                    }
                    c7909ed0.zze(com.google.android.gms.dynamic.d.F2(context), str, null);
                    com.fullstory.FS.log_i("GASS", "GassClearcutLogger Initialized.");
                    return new C7803dd0(c7909ed0);
                } catch (Exception e10) {
                    throw new zzfom(e10);
                }
            } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
                com.fullstory.FS.log_d("GASS", "Cannot dynamite load clearcut");
                return new C7803dd0(new BinderC8230hd0());
            }
        } catch (Exception e11) {
            throw new zzfom(e11);
        }
    }

    public static C7803dd0 c() {
        BinderC8230hd0 binderC8230hd0 = new BinderC8230hd0();
        com.fullstory.FS.log_d("GASS", "Clearcut logging disabled");
        return new C7803dd0(binderC8230hd0);
    }
}
