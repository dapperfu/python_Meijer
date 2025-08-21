package com.scandit.datacapture.core.time;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/time/TimeInterval;", "", "", "asSeconds", "()F", "", "asMillis", "()J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class TimeInterval {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f126894a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/time/TimeInterval$Companion;", "", "", "duration", "Lcom/scandit/datacapture/core/time/TimeInterval;", "millis", "(J)Lcom/scandit/datacapture/core/time/TimeInterval;", "", "seconds", "(F)Lcom/scandit/datacapture/core/time/TimeInterval;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final TimeInterval millis(long duration) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeInterval(DurationKt.t(duration, DurationUnit.f148416d), null);
        }

        @JvmStatic
        public final TimeInterval seconds(float duration) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeInterval(DurationKt.t((long) (duration * 1000.0f), DurationUnit.f148416d), null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final TimeInterval millis(long j10) {
        return INSTANCE.millis(j10);
    }

    @JvmStatic
    public static final TimeInterval seconds(float f10) {
        return INSTANCE.seconds(f10);
    }

    public final long asMillis() {
        return Duration.F(this.f126894a);
    }

    public final float asSeconds() {
        return (float) Duration.X(this.f126894a, DurationUnit.f148417e);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TimeInterval) {
            return Duration.z(this.f126894a, ((TimeInterval) other).f126894a);
        }
        return false;
    }

    public int hashCode() {
        return Duration.O(this.f126894a);
    }

    public String toString() {
        return "TimeInterval{duration=" + ((Object) Duration.a0(this.f126894a)) + '}';
    }

    public TimeInterval(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f126894a = j10;
    }
}
