package kotlin.ranges;

import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001dB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "<init>", "(JJ)V", "value", "", "n", "(J)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p", "()Ljava/lang/Long;", "o", "e", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {

    /* renamed from: f, reason: collision with root package name */
    private static final LongRange f143824f = new LongRange(1, 0);

    public LongRange(long j10, long j11) {
        super(j10, j11, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return n(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(Object other) {
        if (!(other instanceof LongRange)) {
            return false;
        }
        if (isEmpty() && ((LongRange) other).isEmpty()) {
            return true;
        }
        LongRange longRange = (LongRange) other;
        return getFirst() == longRange.getFirst() && getLast() == longRange.getLast();
    }

    @Override // kotlin.ranges.LongProgression
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (getFirst() > getLast()) {
            return true;
        }
        return false;
    }

    public boolean n(long value) {
        if (getFirst() <= value && value <= getLast()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(getFirst());
    }
}
