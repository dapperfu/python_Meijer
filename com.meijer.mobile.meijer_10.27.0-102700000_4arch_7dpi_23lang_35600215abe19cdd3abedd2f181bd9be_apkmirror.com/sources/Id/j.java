package Id;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class j extends AbstractC15136a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f13819a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f13819a;
        int iA = C15137b.a(parcel);
        C15137b.g(parcel, 1, bArr, false);
        C15137b.b(parcel, iA);
    }

    public j(byte[] bArr) {
        this.f13819a = bArr;
    }
}
