package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class L1 extends AbstractC15136a {
    public static final Parcelable.Creator<L1> CREATOR = new M1();

    /* renamed from: a, reason: collision with root package name */
    public final int f19149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19150b;

    public L1(int i10, int i11) {
        this.f19149a = i10;
        this.f19150b = i11;
    }

    public L1(Ec.o oVar) {
        this.f19149a = oVar.c();
        this.f19150b = oVar.d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19149a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f19150b);
        C15137b.b(parcel, iA);
    }
}
