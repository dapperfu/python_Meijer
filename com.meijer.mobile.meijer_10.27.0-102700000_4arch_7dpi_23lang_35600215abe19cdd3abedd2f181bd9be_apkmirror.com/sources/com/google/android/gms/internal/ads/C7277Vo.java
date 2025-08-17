package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7277Vo extends AbstractC15136a {
    public static final Parcelable.Creator<C7277Vo> CREATOR = new C7310Wo();

    /* renamed from: a, reason: collision with root package name */
    public final String f70928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70929b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7277Vo)) {
            C7277Vo c7277Vo = (C7277Vo) obj;
            if (C6535q.a(this.f70928a, c7277Vo.f70928a)) {
                if (C6535q.a(Integer.valueOf(this.f70929b), Integer.valueOf(c7277Vo.f70929b))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C7277Vo B(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C7277Vo(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final int hashCode() {
        return C6535q.b(this.f70928a, Integer.valueOf(this.f70929b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f70928a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.n(parcel, 3, this.f70929b);
        C15137b.b(parcel, iA);
    }

    public C7277Vo(String str, int i10) {
        this.f70928a = str;
        this.f70929b = i10;
    }
}
