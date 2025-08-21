package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\f2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "E", "e", "(Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "a", "Lkotlin/sequences/Sequence;", "b", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Sequence<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<T, R> transformer;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.sequences.TransformingSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<R>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TransformingSequence<T, R> f148221b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(TransformingSequence<T, R> transformingSequence) {
            this.f148221b = transformingSequence;
            this.iterator = ((TransformingSequence) transformingSequence).sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((TransformingSequence) this.f148221b).transformer.invoke(this.iterator.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer) {
        Intrinsics.j(sequence, "sequence");
        Intrinsics.j(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    public final <E> Sequence<E> e(Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.j(iterator, "iterator");
        return new FlatteningSequence(this.sequence, this.transformer, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> iterator() {
        return new AnonymousClass1(this);
    }
}
