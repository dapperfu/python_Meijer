package Wd;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final PointF[] f38644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38645b;

    public a(PointF[] pointFArr, int i10) {
        this.f38644a = pointFArr;
        this.f38645b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.z(parcel, 2, this.f38644a, i10, false);
        C15137b.n(parcel, 3, this.f38645b);
        C15137b.b(parcel, iA);
    }
}
