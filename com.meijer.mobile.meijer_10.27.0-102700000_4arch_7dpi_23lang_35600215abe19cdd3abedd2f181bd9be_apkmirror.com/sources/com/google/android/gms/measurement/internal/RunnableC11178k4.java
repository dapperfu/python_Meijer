package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11178k4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f85655a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f85656b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85657c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f85658d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11185l4 f85659e;

    RunnableC11178k4(C11185l4 c11185l4, boolean z10, Uri uri, String str, String str2) {
        this.f85655a = z10;
        this.f85656b = uri;
        this.f85657c = str;
        this.f85658d = str2;
        Objects.requireNonNull(c11185l4);
        this.f85659e = c11185l4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleQ0;
        Bundle bundleQ02;
        C11185l4 c11185l4 = this.f85659e;
        C11268x4 c11268x4 = c11185l4.f85672a;
        c11268x4.f();
        String str = this.f85658d;
        Uri uri = this.f85656b;
        try {
            X2 x22 = c11268x4.f84868a;
            z6 z6VarA = x22.A();
            if (TextUtils.isEmpty(str)) {
                bundleQ0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleQ0 = z6VarA.q0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleQ0 != null) {
                    bundleQ0.putString("_cis", "referrer");
                }
            } else {
                z6VarA.f84868a.a().t().a("Activity created with data 'referrer' without required params");
                bundleQ0 = null;
            }
            String str2 = this.f85657c;
            if (this.f85655a && (bundleQ02 = x22.A().q0(uri)) != null) {
                bundleQ02.putString("_cis", "intent");
                if (!bundleQ02.containsKey("gclid") && bundleQ0 != null && bundleQ0.containsKey("gclid")) {
                    bundleQ02.putString("_cer", String.format("gclid=%s", bundleQ0.getString("gclid")));
                }
                c11268x4.r(str2, "_cmp", bundleQ02);
                c11268x4.f86021r.b(str2, bundleQ02);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            x22.a().t().b("Activity created with referrer", str);
            if (x22.u().F(null, C11120d2.f85413H0)) {
                if (bundleQ0 != null) {
                    c11268x4.r(str2, "_cmp", bundleQ0);
                    c11268x4.f86021r.b(str2, bundleQ0);
                } else {
                    x22.a().t().b("Referrer does not contain valid parameters", str);
                }
                c11268x4.w(CameraSettings.FOCUS_STRATEGY_AUTO, "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                x22.a().t().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c11268x4.w(CameraSettings.FOCUS_STRATEGY_AUTO, "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            c11185l4.f85672a.f84868a.a().m().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
