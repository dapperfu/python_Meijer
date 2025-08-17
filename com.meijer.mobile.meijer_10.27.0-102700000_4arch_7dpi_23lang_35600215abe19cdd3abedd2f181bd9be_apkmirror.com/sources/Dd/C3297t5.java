package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3297t5 extends AbstractC15136a {
    public static final Parcelable.Creator<C3297t5> CREATOR = new C3093c();

    /* renamed from: a, reason: collision with root package name */
    public double f6279a;

    /* renamed from: b, reason: collision with root package name */
    public double f6280b;

    public C3297t5() {
    }

    public C3297t5(double d10, double d11) {
        this.f6279a = d10;
        this.f6280b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.i(parcel, 2, this.f6279a);
        C15137b.i(parcel, 3, this.f6280b);
        C15137b.b(parcel, iA);
    }
}
