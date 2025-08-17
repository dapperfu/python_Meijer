package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class La extends AbstractC15136a {
    public static final Parcelable.Creator<La> CREATOR = new Ma();

    /* renamed from: a, reason: collision with root package name */
    private final int f5417a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5418b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5419c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5420d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5421e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5417a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f5418b);
        C15137b.n(parcel, 3, this.f5419c);
        C15137b.n(parcel, 4, this.f5420d);
        C15137b.s(parcel, 5, this.f5421e);
        C15137b.b(parcel, iA);
    }

    public La(int i10, int i11, int i12, int i13, long j10) {
        this.f5417a = i10;
        this.f5418b = i11;
        this.f5419c = i12;
        this.f5420d = i13;
        this.f5421e = j10;
    }
}
