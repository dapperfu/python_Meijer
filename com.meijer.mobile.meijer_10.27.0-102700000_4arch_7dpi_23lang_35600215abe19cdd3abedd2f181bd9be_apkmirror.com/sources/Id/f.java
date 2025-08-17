package Id;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class f extends AbstractC15136a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f13817a;

    f() {
        this.f13817a = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f13817a;
        int iA = C15137b.a(parcel);
        C15137b.g(parcel, 2, bArr, false);
        C15137b.b(parcel, iA);
    }

    public f(byte[] bArr) {
        this.f13817a = bArr;
    }
}
