package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.m00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8703m00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76690a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f76691b;

    C8703m00(Context context, Xj0 xj0) {
        this.f76690a = context;
        this.f76691b = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 18;
    }

    final /* synthetic */ C8489k00 a() throws Exception {
        Bundle bundle;
        Lc.v.t();
        String string = !((Boolean) Mc.A.c().a(C8659lf.f76172U5)).booleanValue() ? "" : this.f76690a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) Mc.A.c().a(C8659lf.f76200W5)).booleanValue() ? this.f76690a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        Lc.v.t();
        Context context = this.f76690a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76186V5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new C8489k00(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f76691b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.j00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75317a.a();
            }
        });
    }
}
