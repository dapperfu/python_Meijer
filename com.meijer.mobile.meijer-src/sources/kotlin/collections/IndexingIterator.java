package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "a", "()Lkotlin/collections/IndexedValue;", "Ljava/util/Iterator;", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Iterator<T> iterator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(Iterator<? extends T> iterator) {
        Intrinsics.j(iterator, "iterator");
        this.iterator = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i10 = this.index;
        this.index = i10 + 1;
        if (i10 < 0) {
            i.w();
        }
        return new IndexedValue<>(i10, this.iterator.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }
}
