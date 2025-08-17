package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3237o extends AbstractC15136a {
    public static final Parcelable.Creator<C3237o> CREATOR = new C3248p();

    /* renamed from: a, reason: collision with root package name */
    public int f6193a;

    /* renamed from: b, reason: collision with root package name */
    public int f6194b;

    /* renamed from: c, reason: collision with root package name */
    public int f6195c;

    /* renamed from: d, reason: collision with root package name */
    public long f6196d;

    /* renamed from: e, reason: collision with root package name */
    public int f6197e;

    public C3237o(int i10, int i11, int i12, long j10, int i13) {
        this.f6193a = i10;
        this.f6194b = i11;
        this.f6195c = i12;
        this.f6196d = j10;
        this.f6197e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f6193a);
        C15137b.n(parcel, 3, this.f6194b);
        C15137b.n(parcel, 4, this.f6195c);
        C15137b.s(parcel, 5, this.f6196d);
        C15137b.n(parcel, 6, this.f6197e);
        C15137b.b(parcel, iA);
    }
}
