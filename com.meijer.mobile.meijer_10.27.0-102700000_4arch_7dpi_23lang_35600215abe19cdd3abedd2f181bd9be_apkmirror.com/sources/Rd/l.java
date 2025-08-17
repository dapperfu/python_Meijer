package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.O;
import gd.C14243b;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class l extends AbstractC15136a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f32129a;

    /* renamed from: b, reason: collision with root package name */
    private final C14243b f32130b;

    /* renamed from: c, reason: collision with root package name */
    private final O f32131c;

    public final C14243b B() {
        return this.f32130b;
    }

    public final O T() {
        return this.f32131c;
    }

    l(int i10, C14243b c14243b, O o10) {
        this.f32129a = i10;
        this.f32130b = c14243b;
        this.f32131c = o10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f32129a);
        C15137b.u(parcel, 2, this.f32130b, i10, false);
        C15137b.u(parcel, 3, this.f32131c, i10, false);
        C15137b.b(parcel, iA);
    }
}
