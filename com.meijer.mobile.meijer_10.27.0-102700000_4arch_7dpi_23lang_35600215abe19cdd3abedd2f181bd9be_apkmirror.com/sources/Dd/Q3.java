package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class Q3 extends AbstractC15136a {
    public static final Parcelable.Creator<Q3> CREATOR = new qa();

    /* renamed from: a, reason: collision with root package name */
    public U5 f5487a;

    /* renamed from: b, reason: collision with root package name */
    public String f5488b;

    /* renamed from: c, reason: collision with root package name */
    public String f5489c;

    /* renamed from: d, reason: collision with root package name */
    public C3320v6[] f5490d;

    /* renamed from: e, reason: collision with root package name */
    public S4[] f5491e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f5492f;

    /* renamed from: g, reason: collision with root package name */
    public C3228n2[] f5493g;

    public Q3() {
    }

    public Q3(U5 u52, String str, String str2, C3320v6[] c3320v6Arr, S4[] s4Arr, String[] strArr, C3228n2[] c3228n2Arr) {
        this.f5487a = u52;
        this.f5488b = str;
        this.f5489c = str2;
        this.f5490d = c3320v6Arr;
        this.f5491e = s4Arr;
        this.f5492f = strArr;
        this.f5493g = c3228n2Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f5487a, i10, false);
        C15137b.w(parcel, 3, this.f5488b, false);
        C15137b.w(parcel, 4, this.f5489c, false);
        C15137b.z(parcel, 5, this.f5490d, i10, false);
        C15137b.z(parcel, 6, this.f5491e, i10, false);
        C15137b.x(parcel, 7, this.f5492f, false);
        C15137b.z(parcel, 8, this.f5493g, i10, false);
        C15137b.b(parcel, iA);
    }
}
