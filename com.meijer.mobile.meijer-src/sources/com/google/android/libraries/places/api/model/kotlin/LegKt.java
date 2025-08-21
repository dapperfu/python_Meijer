package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Leg;
import j$.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"j$/time/Duration", "duration", "", "distanceMeters", "Lcom/google/android/libraries/places/api/model/Leg;", "leg", "(Lj$/time/Duration;I)Lcom/google/android/libraries/places/api/model/Leg;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegKt {
    public static final Leg leg(@RecentlyNonNull Duration duration, int i10) {
        Intrinsics.j(duration, "duration");
        Leg legNewInstance = Leg.newInstance(duration, i10);
        Intrinsics.i(legNewInstance, "newInstance(...)");
        return legNewInstance;
    }
}
