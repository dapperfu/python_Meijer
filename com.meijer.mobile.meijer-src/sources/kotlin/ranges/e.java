package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/e;", "", "Lkotlin/UInt;", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "a", "()I", "I", "finalElement", "b", "Z", "c", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e implements Iterator<UInt>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int next;

    public /* synthetic */ e(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private e(int i10, int i11, int i12) {
        this.finalElement = i11;
        boolean z10 = false;
        int iCompare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        if (i12 <= 0 ? iCompare >= 0 : iCompare <= 0) {
            z10 = true;
        }
        this.hasNext = z10;
        this.step = UInt.b(i12);
        this.next = this.hasNext ? i10 : i11;
    }

    public int a() {
        int i10 = this.next;
        if (i10 != this.finalElement) {
            this.next = UInt.b(this.step + i10);
            return i10;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.a(a());
    }
}
