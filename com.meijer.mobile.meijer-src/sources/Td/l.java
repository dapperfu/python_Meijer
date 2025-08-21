package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.O;
import id.C14719b;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class l extends AbstractC15707a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f36129a;

    /* renamed from: b, reason: collision with root package name */
    private final C14719b f36130b;

    /* renamed from: c, reason: collision with root package name */
    private final O f36131c;

    public final C14719b B() {
        return this.f36130b;
    }

    public final O T() {
        return this.f36131c;
    }

    l(int i10, C14719b c14719b, O o10) {
        this.f36129a = i10;
        this.f36130b = c14719b;
        this.f36131c = o10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f36129a);
        C15708b.u(parcel, 2, this.f36130b, i10, false);
        C15708b.u(parcel, 3, this.f36131c, i10, false);
        C15708b.b(parcel, iA);
    }
}
