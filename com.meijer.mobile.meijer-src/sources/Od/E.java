package Od;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class E extends AbstractC15707a {
    public static final Parcelable.Creator<E> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    public final int f23577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23578b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f23579c;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23577a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C15708b.n(parcel, 3, this.f23578b);
        C15708b.g(parcel, 4, this.f23579c, false);
        C15708b.b(parcel, iA);
    }

    public E(int i10, int i11, byte[] bArr) {
        this.f23577a = i10;
        this.f23578b = i11;
        this.f23579c = bArr;
    }
}
