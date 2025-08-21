package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6828Ep extends AbstractC15707a {
    public static final Parcelable.Creator<C6828Ep> CREATOR = new C6862Fp();

    /* renamed from: a, reason: collision with root package name */
    public final String f67356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67357b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67359d;

    /* renamed from: e, reason: collision with root package name */
    public final List f67360e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67361f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67362g;

    /* renamed from: h, reason: collision with root package name */
    public final List f67363h;

    public static C6828Ep B(JSONObject jSONObject) throws JSONException {
        return new C6828Ep(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), Rc.U.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), Rc.U.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f67356a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.w(parcel, 3, this.f67357b, false);
        C15708b.c(parcel, 4, this.f67358c);
        C15708b.c(parcel, 5, this.f67359d);
        C15708b.y(parcel, 6, this.f67360e, false);
        C15708b.c(parcel, 7, this.f67361f);
        C15708b.c(parcel, 8, this.f67362g);
        C15708b.y(parcel, 9, this.f67363h, false);
        C15708b.b(parcel, iA);
    }

    public C6828Ep(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.f67356a = str;
        this.f67357b = str2;
        this.f67358c = z10;
        this.f67359d = z11;
        this.f67360e = list;
        this.f67361f = z12;
        this.f67362g = z13;
        this.f67363h = list2 == null ? new ArrayList() : list2;
    }
}
