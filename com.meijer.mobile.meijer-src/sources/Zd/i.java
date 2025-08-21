package Zd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class i extends AbstractC15707a {
    public static final Parcelable.Creator<i> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    PendingIntent f43733a;

    i() {
    }

    i(PendingIntent pendingIntent) {
        this.f43733a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f43733a, i10, false);
        C15708b.b(parcel, iA);
    }
}
