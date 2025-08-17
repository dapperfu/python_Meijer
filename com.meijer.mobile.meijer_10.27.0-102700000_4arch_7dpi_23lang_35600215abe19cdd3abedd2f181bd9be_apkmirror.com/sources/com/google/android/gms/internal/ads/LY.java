package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes6.dex */
public final class LY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f68381a;

    private LY(Integer num) {
        this.f68381a = num;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    static /* bridge */ /* synthetic */ LY a(Qc.a aVar) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue()) {
            return new LY(null);
        }
        Lc.v.t();
        int extensionVersion = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76218X9)).booleanValue()) {
                    if (aVar.f29931c >= ((Integer) Mc.A.c().a(C8659lf.f76204W9)).intValue() && i10 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e10) {
            Lc.v.s().x(e10, "AdUtil.getAdServicesExtensionVersion");
        }
        return new LY(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.f68381a;
        AB ab2 = (AB) obj;
        if (num != null) {
            ab2.f65088a.putInt("aos", num.intValue());
        }
    }
}
