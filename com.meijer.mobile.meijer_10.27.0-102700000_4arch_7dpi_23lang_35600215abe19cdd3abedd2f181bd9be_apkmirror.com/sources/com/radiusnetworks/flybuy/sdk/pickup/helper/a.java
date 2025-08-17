package com.radiusnetworks.flybuy.sdk.pickup.helper;

import android.location.Location;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes11.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f120011a;

    public a(Location location) {
        this.f120011a = location;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Location location = ((Site) obj).getLocation();
        Float fValueOf = location != null ? Float.valueOf(location.distanceTo(this.f120011a)) : null;
        Location location2 = ((Site) obj2).getLocation();
        return ComparisonsKt.d(fValueOf, location2 != null ? Float.valueOf(location2.distanceTo(this.f120011a)) : null);
    }
}
