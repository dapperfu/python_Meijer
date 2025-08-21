package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3422ka extends AbstractC15707a {
    public static final Parcelable.Creator<C3422ka> CREATOR = new Aa();

    /* renamed from: a, reason: collision with root package name */
    private final int f10174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10175b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10176c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10177d;

    public C3422ka(int i10, String str, String str2, String str3) {
        this.f10174a = i10;
        this.f10175b = str;
        this.f10176c = str2;
        this.f10177d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f10174a);
        C15708b.w(parcel, 2, this.f10175b, false);
        C15708b.w(parcel, 3, this.f10176c, false);
        C15708b.w(parcel, 4, this.f10177d, false);
        C15708b.b(parcel, iA);
    }
}
