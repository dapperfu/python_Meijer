package dd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13656d extends AbstractC15707a {
    public static final Parcelable.Creator<C13656d> CREATOR = new C13657e();

    /* renamed from: a, reason: collision with root package name */
    private final String f128344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128345b;

    public C13656d(String str, String str2) {
        this.f128344a = str;
        this.f128345b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, this.f128344a, false);
        C15708b.w(parcel, 2, this.f128345b, false);
        C15708b.b(parcel, iA);
    }
}
