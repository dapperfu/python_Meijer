package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.M;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class j extends AbstractC15136a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f32127a;

    /* renamed from: b, reason: collision with root package name */
    final M f32128b;

    j(int i10, M m10) {
        this.f32127a = i10;
        this.f32128b = m10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f32127a);
        C15137b.u(parcel, 2, this.f32128b, i10, false);
        C15137b.b(parcel, iA);
    }
}
