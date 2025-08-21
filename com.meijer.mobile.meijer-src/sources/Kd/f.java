package Kd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class f extends AbstractC15707a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f16563a;

    f() {
        this.f16563a = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f16563a;
        int iA = C15708b.a(parcel);
        C15708b.g(parcel, 2, bArr, false);
        C15708b.b(parcel, iA);
    }

    public f(byte[] bArr) {
        this.f16563a = bArr;
    }
}
