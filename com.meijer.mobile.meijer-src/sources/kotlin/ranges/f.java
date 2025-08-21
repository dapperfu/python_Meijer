package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/f;", "", "Lkotlin/ULong;", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "a", "()J", "J", "finalElement", "b", "Z", "c", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f implements Iterator<ULong>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long finalElement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long next;

    public /* synthetic */ f(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private f(long j10, long j11, long j12) {
        this.finalElement = j11;
        boolean z10 = false;
        if (j12 <= 0 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 : Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
            z10 = true;
        }
        this.hasNext = z10;
        this.step = ULong.b(j12);
        this.next = this.hasNext ? j10 : j11;
    }

    public long a() {
        long j10 = this.next;
        if (j10 != this.finalElement) {
            this.next = ULong.b(this.step + j10);
            return j10;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.a(a());
    }
}
