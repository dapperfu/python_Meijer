package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class La extends AbstractC15707a {
    public static final Parcelable.Creator<La> CREATOR = new Ma();

    /* renamed from: a, reason: collision with root package name */
    private final int f9450a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9451b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9452c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9453d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9454e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9450a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f9451b);
        C15708b.n(parcel, 3, this.f9452c);
        C15708b.n(parcel, 4, this.f9453d);
        C15708b.s(parcel, 5, this.f9454e);
        C15708b.b(parcel, iA);
    }

    public La(int i10, int i11, int i12, int i13, long j10) {
        this.f9450a = i10;
        this.f9451b = i11;
        this.f9452c = i12;
        this.f9453d = i13;
        this.f9454e = j10;
    }
}
