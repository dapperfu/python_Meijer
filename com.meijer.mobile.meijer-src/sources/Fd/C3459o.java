package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3459o extends AbstractC15707a {
    public static final Parcelable.Creator<C3459o> CREATOR = new C3470p();

    /* renamed from: a, reason: collision with root package name */
    public int f10226a;

    /* renamed from: b, reason: collision with root package name */
    public int f10227b;

    /* renamed from: c, reason: collision with root package name */
    public int f10228c;

    /* renamed from: d, reason: collision with root package name */
    public long f10229d;

    /* renamed from: e, reason: collision with root package name */
    public int f10230e;

    public C3459o(int i10, int i11, int i12, long j10, int i13) {
        this.f10226a = i10;
        this.f10227b = i11;
        this.f10228c = i12;
        this.f10229d = j10;
        this.f10230e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f10226a);
        C15708b.n(parcel, 3, this.f10227b);
        C15708b.n(parcel, 4, this.f10228c);
        C15708b.s(parcel, 5, this.f10229d);
        C15708b.n(parcel, 6, this.f10230e);
        C15708b.b(parcel, iA);
    }
}
