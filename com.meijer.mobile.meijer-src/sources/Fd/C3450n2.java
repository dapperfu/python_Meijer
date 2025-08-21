package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3450n2 extends AbstractC15707a {
    public static final Parcelable.Creator<C3450n2> CREATOR = new M1();

    /* renamed from: a, reason: collision with root package name */
    public int f10219a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f10220b;

    public C3450n2() {
    }

    public C3450n2(int i10, String[] strArr) {
        this.f10219a = i10;
        this.f10220b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f10219a);
        C15708b.x(parcel, 3, this.f10220b, false);
        C15708b.b(parcel, iA);
    }
}
