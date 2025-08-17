package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class R1 extends AbstractC15136a {
    public static final Parcelable.Creator<R1> CREATOR = new S1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19154a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19156c;

    public R1(Ec.s sVar) {
        this(sVar.c(), sVar.b(), sVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f19154a;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 2, z10);
        C15137b.c(parcel, 3, this.f19155b);
        C15137b.c(parcel, 4, this.f19156c);
        C15137b.b(parcel, iA);
    }

    public R1(boolean z10, boolean z11, boolean z12) {
        this.f19154a = z10;
        this.f19155b = z11;
        this.f19156c = z12;
    }
}
