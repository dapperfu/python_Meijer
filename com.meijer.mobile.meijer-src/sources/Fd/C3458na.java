package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3458na extends AbstractC15707a {
    public static final Parcelable.Creator<C3458na> CREATOR = new Ha();

    /* renamed from: a, reason: collision with root package name */
    private final int f10224a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10225b;

    public C3458na(int i10, String str) {
        this.f10224a = i10;
        this.f10225b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f10224a);
        C15708b.w(parcel, 2, this.f10225b, false);
        C15708b.b(parcel, iA);
    }
}
