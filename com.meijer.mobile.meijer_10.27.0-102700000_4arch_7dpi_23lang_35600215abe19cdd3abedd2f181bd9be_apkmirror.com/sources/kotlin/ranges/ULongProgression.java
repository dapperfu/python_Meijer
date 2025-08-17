package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "f", "()J", "first", "b", "h", "last", "c", "getStep", "d", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes6.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long first;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long last;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long step;

    public /* synthetic */ ULongProgression(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    private ULongProgression(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j10;
        this.last = UProgressionUtilKt.c(j10, j11, j12);
        this.step = j12;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ULongProgression)) {
            return false;
        }
        if (isEmpty() && ((ULongProgression) other).isEmpty()) {
            return true;
        }
        ULongProgression uLongProgression = (ULongProgression) other;
        return this.first == uLongProgression.first && this.last == uLongProgression.last && this.step == uLongProgression.step;
    }

    /* renamed from: f, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* renamed from: h, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    public boolean isEmpty() {
        long j10 = this.step;
        long j11 = this.first;
        long j12 = this.last;
        return j10 > 0 ? Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 : Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new f(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.o(this.first));
            sb2.append("..");
            sb2.append((Object) ULong.o(this.last));
            sb2.append(" step ");
            j10 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.o(this.first));
            sb2.append(" downTo ");
            sb2.append((Object) ULong.o(this.last));
            sb2.append(" step ");
            j10 = -this.step;
        }
        sb2.append(j10);
        return sb2.toString();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.first;
        int iB = ((int) ULong.b(j10 ^ ULong.b(j10 >>> 32))) * 31;
        long j11 = this.last;
        int iB2 = (iB + ((int) ULong.b(j11 ^ ULong.b(j11 >>> 32)))) * 31;
        long j12 = this.step;
        return iB2 + ((int) ((j12 >>> 32) ^ j12));
    }
}
