package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Oc.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4384c1 extends AbstractC15707a {
    public static final Parcelable.Creator<C4384c1> CREATOR = new C4387d1();

    /* renamed from: a, reason: collision with root package name */
    public final int f23398a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23398a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C15708b.b(parcel, iA);
    }

    public C4384c1(int i10) {
        this.f23398a = i10;
    }
}
