package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class S4 extends AbstractC15707a {
    public static final Parcelable.Creator<S4> CREATOR = new C3303b();

    /* renamed from: a, reason: collision with root package name */
    public int f9549a;

    /* renamed from: b, reason: collision with root package name */
    public String f9550b;

    /* renamed from: c, reason: collision with root package name */
    public String f9551c;

    /* renamed from: d, reason: collision with root package name */
    public String f9552d;

    public S4() {
    }

    public S4(int i10, String str, String str2, String str3) {
        this.f9549a = i10;
        this.f9550b = str;
        this.f9551c = str2;
        this.f9552d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f9549a);
        C15708b.w(parcel, 3, this.f9550b, false);
        C15708b.w(parcel, 4, this.f9551c, false);
        C15708b.w(parcel, 5, this.f9552d, false);
        C15708b.b(parcel, iA);
    }
}
