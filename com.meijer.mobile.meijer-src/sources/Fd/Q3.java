package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class Q3 extends AbstractC15707a {
    public static final Parcelable.Creator<Q3> CREATOR = new qa();

    /* renamed from: a, reason: collision with root package name */
    public U5 f9520a;

    /* renamed from: b, reason: collision with root package name */
    public String f9521b;

    /* renamed from: c, reason: collision with root package name */
    public String f9522c;

    /* renamed from: d, reason: collision with root package name */
    public C3542v6[] f9523d;

    /* renamed from: e, reason: collision with root package name */
    public S4[] f9524e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f9525f;

    /* renamed from: g, reason: collision with root package name */
    public C3450n2[] f9526g;

    public Q3() {
    }

    public Q3(U5 u52, String str, String str2, C3542v6[] c3542v6Arr, S4[] s4Arr, String[] strArr, C3450n2[] c3450n2Arr) {
        this.f9520a = u52;
        this.f9521b = str;
        this.f9522c = str2;
        this.f9523d = c3542v6Arr;
        this.f9524e = s4Arr;
        this.f9525f = strArr;
        this.f9526g = c3450n2Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f9520a, i10, false);
        C15708b.w(parcel, 3, this.f9521b, false);
        C15708b.w(parcel, 4, this.f9522c, false);
        C15708b.z(parcel, 5, this.f9523d, i10, false);
        C15708b.z(parcel, 6, this.f9524e, i10, false);
        C15708b.x(parcel, 7, this.f9525f, false);
        C15708b.z(parcel, 8, this.f9526g, i10, false);
        C15708b.b(parcel, iA);
    }
}
