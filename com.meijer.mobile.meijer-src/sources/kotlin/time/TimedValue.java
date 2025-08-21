package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/time/Duration;", "b", "J", "getDuration-UwyO8pc", "()J", "duration", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public final /* data */ class TimedValue<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.e(this.value, timedValue.value) && Duration.z(this.duration, timedValue.duration);
    }

    public int hashCode() {
        T t10 = this.value;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + Duration.O(this.duration);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.a0(this.duration)) + ')';
    }
}
