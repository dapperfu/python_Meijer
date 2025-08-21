package Yd;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class a extends AbstractC15707a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final PointF[] f43043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43044b;

    public a(PointF[] pointFArr, int i10) {
        this.f43043a = pointFArr;
        this.f43044b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.z(parcel, 2, this.f43043a, i10, false);
        C15708b.n(parcel, 3, this.f43044b);
        C15708b.b(parcel, iA);
    }
}
