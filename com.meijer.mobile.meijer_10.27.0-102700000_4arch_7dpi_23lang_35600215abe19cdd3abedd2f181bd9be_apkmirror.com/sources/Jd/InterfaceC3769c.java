package Jd;

import Td.AbstractC5223a;
import Td.AbstractC5232j;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* renamed from: Jd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC3769c {
    AbstractC5232j<Void> d(LocationRequest locationRequest, PendingIntent pendingIntent);

    AbstractC5232j<Location> e(int i10, AbstractC5223a abstractC5223a);

    AbstractC5232j<Void> h(AbstractC3777k abstractC3777k);

    AbstractC5232j<Location> j(C3767a c3767a, AbstractC5223a abstractC5223a);

    AbstractC5232j<Location> l();

    AbstractC5232j<Void> m(LocationRequest locationRequest, AbstractC3777k abstractC3777k, Looper looper);

    AbstractC5232j<LocationAvailability> o();
}
