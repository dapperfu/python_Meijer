package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "nextLong", "()J", "a", "J", "getStep", "b", "finalElement", "c", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long finalElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long next;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j10 = this.next;
        if (j10 != this.finalElement) {
            this.next = this.step + j10;
            return j10;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return j10;
    }

    public LongProgressionIterator(long j10, long j11, long j12) {
        this.step = j12;
        this.finalElement = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.hasNext = z10;
        this.next = z10 ? j10 : j11;
    }
}
