package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3398ia extends AbstractC15707a {
    public static final Parcelable.Creator<C3398ia> CREATOR = new ya();

    /* renamed from: a, reason: collision with root package name */
    private final C3446ma f10127a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10128b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10129c;

    /* renamed from: d, reason: collision with root package name */
    private final C3458na[] f10130d;

    /* renamed from: e, reason: collision with root package name */
    private final C3422ka[] f10131e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f10132f;

    /* renamed from: g, reason: collision with root package name */
    private final C3362fa[] f10133g;

    public C3398ia(C3446ma c3446ma, String str, String str2, C3458na[] c3458naArr, C3422ka[] c3422kaArr, String[] strArr, C3362fa[] c3362faArr) {
        this.f10127a = c3446ma;
        this.f10128b = str;
        this.f10129c = str2;
        this.f10130d = c3458naArr;
        this.f10131e = c3422kaArr;
        this.f10132f = strArr;
        this.f10133g = c3362faArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f10127a, i10, false);
        C15708b.w(parcel, 2, this.f10128b, false);
        C15708b.w(parcel, 3, this.f10129c, false);
        C15708b.z(parcel, 4, this.f10130d, i10, false);
        C15708b.z(parcel, 5, this.f10131e, i10, false);
        C15708b.x(parcel, 6, this.f10132f, false);
        C15708b.z(parcel, 7, this.f10133g, i10, false);
        C15708b.b(parcel, iA);
    }
}
