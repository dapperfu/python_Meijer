package kotlin.ranges;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/ranges/OpenEndRange;", "", "start", "endExclusive", "<init>", "(DD)V", "value", "", "a", "(D)Z", "b", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "_start", "_endExclusive", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class b implements OpenEndRange<Double> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double _start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double _endExclusive;

    public boolean a(double value) {
        return value >= this._start && value < this._endExclusive;
    }

    public boolean b() {
        return this._start >= this._endExclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    public boolean equals(Object other) {
        if (!(other instanceof b)) {
            return false;
        }
        if (b() && ((b) other).b()) {
            return true;
        }
        b bVar = (b) other;
        return this._start == bVar._start && this._endExclusive == bVar._endExclusive;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }

    public b(double d10, double d11) {
        this._start = d10;
        this._endExclusive = d11;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endExclusive);
    }
}
