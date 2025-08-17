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
    final C9570u60 f68660a;

    /* renamed from: b, reason: collision with root package name */
    private final long f68661b;

    public MX(C9570u60 c9570u60, long j10) {
        this.f68660a = c9570u60;
        this.f68661b = j10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65089b;
        C9570u60 c9570u60 = this.f68660a;
        bundle.putString("slotname", c9570u60.f78740f);
        Mc.Y1 y12 = c9570u60.f78738d;
        if (y12.f19172f) {
            bundle.putBoolean("test_request", true);
        }
        int i10 = y12.f19173g;
        H60.e(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (y12.f19167a >= 8) {
            int i11 = y12.f19186t;
            H60.e(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
        }
        H60.c(bundle, "url", y12.f19178l);
        H60.d(bundle, "neighboring_content_urls", y12.f19188v);
        Bundle bundle2 = (Bundle) y12.f19169c.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) Mc.A.c().a(C8659lf.f76509s7)).split(",", -1)));
        for (String str : y12.f19169c.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        H60.b(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        Mc.Y1 y12 = this.f68660a.f78738d;
        bundle.putInt("http_timeout_millis", y12.f19189w);
        bundle.putString("slotname", this.f68660a.f78740f);
        int i10 = this.f68660a.f78749o.f74242a;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f68661b);
        H60.g(bundle, "is_sdk_preload", true, y12.T());
        H60.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(y12.f19168b)), y12.f19168b != -1);
        H60.b(bundle, "extras", y12.f19169c);
        int i12 = y12.f19170d;
        H60.e(bundle, "cust_gender", i12, i12 != -1);
        H60.d(bundle, "kw", y12.f19171e);
        int i13 = y12.f19173g;
        H60.e(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (y12.f19172f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", y12.f19191y);
        H60.e(bundle, "d_imp_hdr", 1, y12.f19167a >= 2 && y12.f19174h);
        String str = y12.f19175i;
        H60.f(bundle, "ppid", str, y12.f19167a >= 2 && !TextUtils.isEmpty(str));
        Location location = y12.f19177k;
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
        H60.c(bundle, "url", y12.f19178l);
        H60.d(bundle, "neighboring_content_urls", y12.f19188v);
        H60.b(bundle, "custom_targeting", y12.f19180n);
        H60.d(bundle, "category_exclusions", y12.f19181o);
        H60.c(bundle, "request_agent", y12.f19182p);
        H60.c(bundle, "request_pkg", y12.f19183q);
        H60.g(bundle, "is_designed_for_families", y12.f19184r, y12.f19167a >= 7);
        if (y12.f19167a >= 8) {
            int i14 = y12.f19186t;
            H60.e(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
            H60.c(bundle, "max_ad_content_rating", y12.f19187u);
        }
    }
}
