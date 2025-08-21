package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class ua extends AbstractC15707a {
    public static final Parcelable.Creator<ua> CREATOR = new va();

    /* renamed from: a, reason: collision with root package name */
    private final int f10337a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10338b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10337a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.c(parcel, 2, this.f10338b);
        C15708b.b(parcel, iA);
    }

    public ua(int i10, boolean z10) {
        this.f10337a = i10;
        this.f10338b = z10;
    }
}
