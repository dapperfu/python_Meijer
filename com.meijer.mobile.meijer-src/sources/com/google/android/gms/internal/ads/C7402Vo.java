package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7402Vo extends AbstractC15707a {
    public static final Parcelable.Creator<C7402Vo> CREATOR = new C7435Wo();

    /* renamed from: a, reason: collision with root package name */
    public final String f71768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71769b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7402Vo)) {
            C7402Vo c7402Vo = (C7402Vo) obj;
            if (C6660q.a(this.f71768a, c7402Vo.f71768a)) {
                if (C6660q.a(Integer.valueOf(this.f71769b), Integer.valueOf(c7402Vo.f71769b))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C7402Vo B(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C7402Vo(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final int hashCode() {
        return C6660q.b(this.f71768a, Integer.valueOf(this.f71769b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f71768a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.n(parcel, 3, this.f71769b);
        C15708b.b(parcel, iA);
    }

    public C7402Vo(String str, int i10) {
        this.f71768a = str;
        this.f71769b = i10;
    }
}
