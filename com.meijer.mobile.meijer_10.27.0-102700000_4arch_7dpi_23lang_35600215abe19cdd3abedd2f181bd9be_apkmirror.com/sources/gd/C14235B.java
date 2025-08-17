package gd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: gd.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14235B extends AbstractC15136a {
    public static final Parcelable.Creator<C14235B> CREATOR = new C14236C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f133289a;

    /* renamed from: b, reason: collision with root package name */
    private final String f133290b;

    /* renamed from: c, reason: collision with root package name */
    private final int f133291c;

    /* renamed from: d, reason: collision with root package name */
    private final int f133292d;

    public final boolean B() {
        return this.f133289a;
    }

    public final int T() {
        return o.a(this.f133292d);
    }

    public final int c0() {
        return I.a(this.f133291c);
    }

    public final String zza() {
        return this.f133290b;
    }

    C14235B(boolean z10, String str, int i10, int i11) {
        this.f133289a = z10;
        this.f133290b = str;
        this.f133291c = I.a(i10) - 1;
        this.f133292d = o.a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, this.f133289a);
        C15137b.w(parcel, 2, this.f133290b, false);
        C15137b.n(parcel, 3, this.f133291c);
        C15137b.n(parcel, 4, this.f133292d);
        C15137b.b(parcel, iA);
    }
}
