package com.radiusnetworks.flybuy.sdk.data.room.domain;

import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "", "j$/time/Instant", "start", "end", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;)V", "dateTime", "(Lj$/time/Instant;)V", "Lj$/time/Instant;", "getStart", "()Lj$/time/Instant;", "getEnd", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PickupWindow {
    private final Instant end;
    private final Instant start;

    public PickupWindow(Instant start, Instant end) {
        Intrinsics.j(start, "start");
        Intrinsics.j(end, "end");
        this.start = start;
        this.end = end;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final Instant getStart() {
        return this.start;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickupWindow(Instant dateTime) {
        this(dateTime, dateTime);
        Intrinsics.j(dateTime, "dateTime");
    }
}
