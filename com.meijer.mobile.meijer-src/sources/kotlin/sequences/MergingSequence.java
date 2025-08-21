package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/Sequence;", "sequence1", "b", "sequence2", "Lkotlin/Function2;", "c", "Lkotlin/jvm/functions/Function2;", "transform", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Sequence<T1> sequence1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Sequence<T2> sequence2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<T1, T2, V> transform;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator1", "()Ljava/util/Iterator;", "iterator1", "b", "getIterator2", "iterator2", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<V>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T1> iterator1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T2> iterator2;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MergingSequence<T1, T2, V> f148178c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(MergingSequence<T1, T2, V> mergingSequence) {
            this.f148178c = mergingSequence;
            this.iterator1 = ((MergingSequence) mergingSequence).sequence1.iterator();
            this.iterator2 = ((MergingSequence) mergingSequence).sequence2.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((MergingSequence) this.f148178c).transform.invoke(this.iterator1.next(), this.iterator2.next());
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }
}
