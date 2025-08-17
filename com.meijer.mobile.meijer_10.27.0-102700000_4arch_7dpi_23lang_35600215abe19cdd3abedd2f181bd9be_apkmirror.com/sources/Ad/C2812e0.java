package Ad;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Ad.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2812e0 extends AbstractC15136a {
    public static final Parcelable.Creator<C2812e0> CREATOR = new C2814f0();

    /* renamed from: a, reason: collision with root package name */
    private final List f249a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f250b;

    /* renamed from: c, reason: collision with root package name */
    private final String f251c;

    public static C2812e0 B(List list) {
        com.google.android.gms.common.internal.r.m(list, "geofence can't be null.");
        com.google.android.gms.common.internal.r.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new C2812e0(list, null, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f249a;
        int iA = C15137b.a(parcel);
        C15137b.y(parcel, 1, list, false);
        C15137b.u(parcel, 2, this.f250b, i10, false);
        C15137b.w(parcel, 3, this.f251c, false);
        C15137b.b(parcel, iA);
    }

    C2812e0(List list, PendingIntent pendingIntent, String str) {
        p0 p0VarP;
        if (list == null) {
            p0VarP = p0.o();
        } else {
            p0VarP = p0.p(list);
        }
        this.f249a = p0VarP;
        this.f250b = pendingIntent;
        this.f251c = str;
    }
}
