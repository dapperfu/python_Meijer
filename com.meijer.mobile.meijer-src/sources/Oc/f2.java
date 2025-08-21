package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f2 extends AbstractC15707a {
    public static final Parcelable.Creator<f2> CREATOR = new g2();

    /* renamed from: a, reason: collision with root package name */
    public final int f23446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23447b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23448c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23449d;

    public static f2 B(JSONObject jSONObject) throws JSONException {
        return new f2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23446a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f23447b);
        C15708b.w(parcel, 3, this.f23448c, false);
        C15708b.s(parcel, 4, this.f23449d);
        C15708b.b(parcel, iA);
    }

    public f2(int i10, int i11, String str, long j10) {
        this.f23446a = i10;
        this.f23447b = i11;
        this.f23448c = str;
        this.f23449d = j10;
    }
}
