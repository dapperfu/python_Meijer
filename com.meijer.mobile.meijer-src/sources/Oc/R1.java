package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class R1 extends AbstractC15707a {
    public static final Parcelable.Creator<R1> CREATOR = new S1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23341a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23342b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23343c;

    public R1(Gc.s sVar) {
        this(sVar.c(), sVar.b(), sVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f23341a;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 2, z10);
        C15708b.c(parcel, 3, this.f23342b);
        C15708b.c(parcel, 4, this.f23343c);
        C15708b.b(parcel, iA);
    }

    public R1(boolean z10, boolean z11, boolean z12) {
        this.f23341a = z10;
        this.f23342b = z11;
        this.f23343c = z12;
    }
}
