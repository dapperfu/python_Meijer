package Kd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class j extends AbstractC15707a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f16565a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f16565a;
        int iA = C15708b.a(parcel);
        C15708b.g(parcel, 1, bArr, false);
        C15708b.b(parcel, iA);
    }

    public j(byte[] bArr) {
        this.f16565a = bArr;
    }
}
