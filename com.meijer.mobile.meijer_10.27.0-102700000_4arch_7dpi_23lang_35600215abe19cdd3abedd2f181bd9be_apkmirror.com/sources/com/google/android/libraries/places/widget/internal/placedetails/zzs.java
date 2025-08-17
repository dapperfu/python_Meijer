package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzs {
    public static final String zza(List list, Context context, Instant instant) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(context, "context");
        if (instant == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Instant availabilityLastUpdateTime = ((ConnectorAggregation) it.next()).getAvailabilityLastUpdateTime();
            if (availabilityLastUpdateTime != null) {
                arrayList.add(availabilityLastUpdateTime);
            }
        }
        Instant instant2 = (Instant) CollectionsKt.H0(arrayList);
        if (instant2 == null) {
            return null;
        }
        Duration durationBetween = Duration.between(instant2, instant);
        Intrinsics.i(durationBetween, "between(...)");
        if (durationBetween.toDays() > 0) {
            return context.getString(R.string.places_ev_charging_last_updated_days, Long.valueOf(durationBetween.toDays()));
        }
        if (durationBetween.toHours() > 0) {
            return context.getString(R.string.places_ev_charging_last_updated_hours, Long.valueOf(durationBetween.toHours()));
        }
        if (durationBetween.toMinutes() > 0) {
            return context.getString(R.string.places_ev_charging_last_updated_minutes, Long.valueOf(durationBetween.toMinutes()));
        }
        if (durationBetween.toSeconds() < 0) {
            return null;
        }
        return context.getString(R.string.places_ev_charging_last_updated_now);
    }
}
