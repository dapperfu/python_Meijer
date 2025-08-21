package Ld;

import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* renamed from: Ld.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4013c {
    AbstractC5516j<Location> a(C4011a c4011a, AbstractC5507a abstractC5507a);

    AbstractC5516j<Void> d(LocationRequest locationRequest, PendingIntent pendingIntent);

    AbstractC5516j<Location> e(int i10, AbstractC5507a abstractC5507a);

    AbstractC5516j<Void> f(AbstractC4021k abstractC4021k);

    AbstractC5516j<Void> i(LocationRequest locationRequest, AbstractC4021k abstractC4021k, Looper looper);

    AbstractC5516j<Location> m();

    AbstractC5516j<LocationAvailability> o();
}
