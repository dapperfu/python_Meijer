package Id;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class h extends AbstractC15136a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f13818a;

    h() {
        this.f13818a = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f13818a;
        int iA = C15137b.a(parcel);
        C15137b.g(parcel, 2, bArr, false);
        C15137b.b(parcel, iA);
    }

    public h(byte[] bArr) {
        this.f13818a = bArr;
    }
}
