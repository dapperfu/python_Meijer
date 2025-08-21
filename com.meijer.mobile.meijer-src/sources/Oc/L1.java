package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class L1 extends AbstractC15707a {
    public static final Parcelable.Creator<L1> CREATOR = new M1();

    /* renamed from: a, reason: collision with root package name */
    public final int f23336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23337b;

    public L1(int i10, int i11) {
        this.f23336a = i10;
        this.f23337b = i11;
    }

    public L1(Gc.o oVar) {
        this.f23336a = oVar.c();
        this.f23337b = oVar.d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23336a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f23337b);
        C15708b.b(parcel, iA);
    }
}
