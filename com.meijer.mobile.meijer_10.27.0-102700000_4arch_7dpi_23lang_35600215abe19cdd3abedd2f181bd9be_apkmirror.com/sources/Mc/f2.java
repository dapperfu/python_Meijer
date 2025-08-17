package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f2 extends AbstractC15136a {
    public static final Parcelable.Creator<f2> CREATOR = new g2();

    /* renamed from: a, reason: collision with root package name */
    public final int f19259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19260b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19261c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19262d;

    public static f2 B(JSONObject jSONObject) throws JSONException {
        return new f2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19259a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f19260b);
        C15137b.w(parcel, 3, this.f19261c, false);
        C15137b.s(parcel, 4, this.f19262d);
        C15137b.b(parcel, iA);
    }

    public f2(int i10, int i11, String str, long j10) {
        this.f19259a = i10;
        this.f19260b = i11;
        this.f19261c = str;
        this.f19262d = j10;
    }
}
