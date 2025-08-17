package Xd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class i extends AbstractC15136a {
    public static final Parcelable.Creator<i> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    PendingIntent f39255a;

    i() {
    }

    i(PendingIntent pendingIntent) {
        this.f39255a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f39255a, i10, false);
        C15137b.b(parcel, iA);
    }
}
