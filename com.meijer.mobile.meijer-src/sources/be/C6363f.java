package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6363f extends AbstractC15707a {
    public static final Parcelable.Creator<C6363f> CREATOR = new C6373p();

    /* renamed from: a, reason: collision with root package name */
    long f60284a;

    /* renamed from: b, reason: collision with root package name */
    long f60285b;

    C6363f() {
    }

    public C6363f(long j10, long j11) {
        this.f60284a = j10;
        this.f60285b = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 2, this.f60284a);
        C15708b.s(parcel, 3, this.f60285b);
        C15708b.b(parcel, iA);
    }
}
