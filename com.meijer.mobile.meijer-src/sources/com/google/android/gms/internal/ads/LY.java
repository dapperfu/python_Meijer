package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes6.dex */
public final class LY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f69221a;

    private LY(Integer num) {
        this.f69221a = num;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    static /* bridge */ /* synthetic */ LY a(Sc.a aVar) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue()) {
            return new LY(null);
        }
        Nc.v.t();
        int extensionVersion = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77058X9)).booleanValue()) {
                    if (aVar.f34481c >= ((Integer) Oc.A.c().a(C8784lf.f77044W9)).intValue() && i10 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e10) {
            Nc.v.s().x(e10, "AdUtil.getAdServicesExtensionVersion");
        }
        return new LY(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.f69221a;
        AB ab2 = (AB) obj;
        if (num != null) {
            ab2.f65928a.putInt("aos", num.intValue());
        }
    }
}
