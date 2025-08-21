package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.M;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class j extends AbstractC15707a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f36127a;

    /* renamed from: b, reason: collision with root package name */
    final M f36128b;

    j(int i10, M m10) {
        this.f36127a = i10;
        this.f36128b = m10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f36127a);
        C15708b.u(parcel, 2, this.f36128b, i10, false);
        C15708b.b(parcel, iA);
    }
}
