package com.radiusnetworks.flybuy.sdk.util;

import android.location.Location;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/location/Location;", "j$/time/Instant", "getTimeInstant", "(Landroid/location/Location;)Lj$/time/Instant;", "timeInstant", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationExtensionsKt {
    public static final Instant getTimeInstant(Location location) {
        Intrinsics.j(location, "<this>");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(location.getTime());
        Intrinsics.i(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }
}
