package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class f extends AbstractC15136a {
    public static final Parcelable.Creator<f> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    long f42617a;

    /* renamed from: b, reason: collision with root package name */
    long f42618b;

    f() {
    }

    public f(long j10, long j11) {
        this.f42617a = j10;
        this.f42618b = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 2, this.f42617a);
        C15137b.s(parcel, 3, this.f42618b);
        C15137b.b(parcel, iA);
    }
}
