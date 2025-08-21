package Kd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class l extends AbstractC15707a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final PendingIntent f16566a;

    public l(PendingIntent pendingIntent) {
        this.f16566a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f16566a, i10, false);
        C15708b.b(parcel, iA);
    }
}
