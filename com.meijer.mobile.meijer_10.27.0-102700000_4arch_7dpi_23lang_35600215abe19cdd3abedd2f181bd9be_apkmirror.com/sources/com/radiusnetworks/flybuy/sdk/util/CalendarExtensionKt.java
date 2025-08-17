package com.radiusnetworks.flybuy.sdk.util;

import androidx.annotation.Keep;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"j$/time/Instant", "j$/time/Clock", "clock", "", "isToday", "(Lj$/time/Instant;Lj$/time/Clock;)Z", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CalendarExtensionKt {
    @Keep
    public static final boolean isToday(Instant instant, Clock clock) {
        Intrinsics.j(instant, "<this>");
        Intrinsics.j(clock, "clock");
        LocalDateTime localDateTimeNow = LocalDateTime.now(clock);
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, clock.getZone());
        return localDateTimeNow.getYear() == localDateTimeOfInstant.getYear() && localDateTimeNow.getDayOfYear() == localDateTimeOfInstant.getDayOfYear();
    }
}
