package Cd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Cd.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3050e0 extends AbstractC15707a {
    public static final Parcelable.Creator<C3050e0> CREATOR = new C3052f0();

    /* renamed from: a, reason: collision with root package name */
    private final List f4245a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f4246b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4247c;

    public static C3050e0 B(List list) {
        com.google.android.gms.common.internal.r.m(list, "geofence can't be null.");
        com.google.android.gms.common.internal.r.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new C3050e0(list, null, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f4245a;
        int iA = C15708b.a(parcel);
        C15708b.y(parcel, 1, list, false);
        C15708b.u(parcel, 2, this.f4246b, i10, false);
        C15708b.w(parcel, 3, this.f4247c, false);
        C15708b.b(parcel, iA);
    }

    C3050e0(List list, PendingIntent pendingIntent, String str) {
        p0 p0VarP;
        if (list == null) {
            p0VarP = p0.o();
        } else {
            p0VarP = p0.p(list);
        }
        this.f4245a = p0VarP;
        this.f4246b = pendingIntent;
        this.f4247c = str;
    }
}
