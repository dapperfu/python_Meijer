package id;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: id.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14711B extends AbstractC15707a {
    public static final Parcelable.Creator<C14711B> CREATOR = new C14712C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f137505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f137506b;

    /* renamed from: c, reason: collision with root package name */
    private final int f137507c;

    /* renamed from: d, reason: collision with root package name */
    private final int f137508d;

    public final boolean B() {
        return this.f137505a;
    }

    public final int T() {
        return o.a(this.f137508d);
    }

    public final int b0() {
        return I.a(this.f137507c);
    }

    public final String zza() {
        return this.f137506b;
    }

    C14711B(boolean z10, String str, int i10, int i11) {
        this.f137505a = z10;
        this.f137506b = str;
        this.f137507c = I.a(i10) - 1;
        this.f137508d = o.a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, this.f137505a);
        C15708b.w(parcel, 2, this.f137506b, false);
        C15708b.n(parcel, 3, this.f137507c);
        C15708b.n(parcel, 4, this.f137508d);
        C15708b.b(parcel, iA);
    }
}
