package Id;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class l extends AbstractC15136a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final PendingIntent f13820a;

    public l(PendingIntent pendingIntent) {
        this.f13820a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f13820a, i10, false);
        C15137b.b(parcel, iA);
    }
}
