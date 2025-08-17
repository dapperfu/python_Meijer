package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class ua extends AbstractC15136a {
    public static final Parcelable.Creator<ua> CREATOR = new va();

    /* renamed from: a, reason: collision with root package name */
    private final int f6304a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6305b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f6304a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.c(parcel, 2, this.f6305b);
        C15137b.b(parcel, iA);
    }

    public ua(int i10, boolean z10) {
        this.f6304a = i10;
        this.f6305b = z10;
    }
}
