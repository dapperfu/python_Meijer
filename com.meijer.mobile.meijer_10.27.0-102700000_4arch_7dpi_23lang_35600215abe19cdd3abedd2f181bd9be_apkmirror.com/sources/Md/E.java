package Md;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class E extends AbstractC15136a {
    public static final Parcelable.Creator<E> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    public final int f19390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19391b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19392c;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19390a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C15137b.n(parcel, 3, this.f19391b);
        C15137b.g(parcel, 4, this.f19392c, false);
        C15137b.b(parcel, iA);
    }

    public E(int i10, int i11, byte[] bArr) {
        this.f19390a = i10;
        this.f19391b = i11;
        this.f19392c = bArr;
    }
}
