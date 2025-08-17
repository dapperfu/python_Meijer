package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6703Ep extends AbstractC15136a {
    public static final Parcelable.Creator<C6703Ep> CREATOR = new C6737Fp();

    /* renamed from: a, reason: collision with root package name */
    public final String f66516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66517b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f66518c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f66519d;

    /* renamed from: e, reason: collision with root package name */
    public final List f66520e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f66522g;

    /* renamed from: h, reason: collision with root package name */
    public final List f66523h;

    public static C6703Ep B(JSONObject jSONObject) throws JSONException {
        return new C6703Ep(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), Pc.U.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), Pc.U.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f66516a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.w(parcel, 3, this.f66517b, false);
        C15137b.c(parcel, 4, this.f66518c);
        C15137b.c(parcel, 5, this.f66519d);
        C15137b.y(parcel, 6, this.f66520e, false);
        C15137b.c(parcel, 7, this.f66521f);
        C15137b.c(parcel, 8, this.f66522g);
        C15137b.y(parcel, 9, this.f66523h, false);
        C15137b.b(parcel, iA);
    }

    public C6703Ep(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.f66516a = str;
        this.f66517b = str2;
        this.f66518c = z10;
        this.f66519d = z11;
        this.f66520e = list;
        this.f66521f = z12;
        this.f66522g = z13;
        this.f66523h = list2 == null ? new ArrayList() : list2;
    }
}
