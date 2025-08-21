package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class MX implements S10 {

    /* renamed from: a, reason: collision with root package name */
    final C9695u60 f69500a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69501b;

    public MX(C9695u60 c9695u60, long j10) {
        this.f69500a = c9695u60;
        this.f69501b = j10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65929b;
        C9695u60 c9695u60 = this.f69500a;
        bundle.putString("slotname", c9695u60.f79580f);
        Oc.Y1 y12 = c9695u60.f79578d;
        if (y12.f23359f) {
            bundle.putBoolean("test_request", true);
        }
        int i10 = y12.f23360g;
        H60.e(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (y12.f23354a >= 8) {
            int i11 = y12.f23373t;
            H60.e(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
        }
        H60.c(bundle, "url", y12.f23365l);
        H60.d(bundle, "neighboring_content_urls", y12.f23375v);
        Bundle bundle2 = (Bundle) y12.f23356c.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) Oc.A.c().a(C8784lf.f77349s7)).split(",", -1)));
        for (String str : y12.f23356c.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        H60.b(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        Oc.Y1 y12 = this.f69500a.f79578d;
        bundle.putInt("http_timeout_millis", y12.f23376w);
        bundle.putString("slotname", this.f69500a.f79580f);
        int i10 = this.f69500a.f79589o.f75082a;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f69501b);
        H60.g(bundle, "is_sdk_preload", true, y12.T());
        H60.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(y12.f23355b)), y12.f23355b != -1);
        H60.b(bundle, "extras", y12.f23356c);
        int i12 = y12.f23357d;
        H60.e(bundle, "cust_gender", i12, i12 != -1);
        H60.d(bundle, "kw", y12.f23358e);
        int i13 = y12.f23360g;
        H60.e(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (y12.f23359f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", y12.f23378y);
        H60.e(bundle, "d_imp_hdr", 1, y12.f23354a >= 2 && y12.f23361h);
        String str = y12.f23362i;
        H60.f(bundle, "ppid", str, y12.f23354a >= 2 && !TextUtils.isEmpty(str));
        Location location = y12.f23364k;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        H60.c(bundle, "url", y12.f23365l);
        H60.d(bundle, "neighboring_content_urls", y12.f23375v);
        H60.b(bundle, "custom_targeting", y12.f23367n);
        H60.d(bundle, "category_exclusions", y12.f23368o);
        H60.c(bundle, "request_agent", y12.f23369p);
        H60.c(bundle, "request_pkg", y12.f23370q);
        H60.g(bundle, "is_designed_for_families", y12.f23371r, y12.f23354a >= 7);
        if (y12.f23354a >= 8) {
            int i14 = y12.f23373t;
            H60.e(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
            H60.c(bundle, "max_ad_content_rating", y12.f23374u);
        }
    }
}
