package hf;

import gf.C14359f;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/* loaded from: classes8.dex */
final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements Spliterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Spliterator.OfInt f135347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IntFunction f135348b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f135349c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Comparator f135350d;

        @Override // java.util.Spliterator
        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return this.f135350d;
            }
            throw new IllegalStateException();
        }

        a(Spliterator.OfInt ofInt, IntFunction intFunction, int i10, Comparator comparator) {
            this.f135348b = intFunction;
            this.f135349c = i10;
            this.f135350d = comparator;
            this.f135347a = ofInt;
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.f135349c | 16464;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.f135347a.estimateSize();
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(final Consumer<? super T> consumer) {
            Spliterator.OfInt ofInt = this.f135347a;
            final IntFunction intFunction = this.f135348b;
            ofInt.forEachRemaining(new IntConsumer() { // from class: hf.e
                @Override // java.util.function.IntConsumer
                public final void accept(int i10) {
                    consumer.accept(intFunction.apply(i10));
                }
            });
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(final Consumer<? super T> consumer) {
            Spliterator.OfInt ofInt = this.f135347a;
            final IntFunction intFunction = this.f135348b;
            return ofInt.tryAdvance(new IntConsumer() { // from class: hf.d
                @Override // java.util.function.IntConsumer
                public final void accept(int i10) {
                    consumer.accept(intFunction.apply(i10));
                }
            });
        }

        @Override // java.util.Spliterator
        public Spliterator<T> trySplit() {
            Spliterator.OfInt ofIntTrySplit = this.f135347a.trySplit();
            if (ofIntTrySplit == null) {
                return null;
            }
            return new a(ofIntTrySplit, this.f135348b, this.f135349c, this.f135350d);
        }
    }

    static <T> Spliterator<T> a(int i10, int i11, IntFunction<T> intFunction) {
        return b(i10, i11, intFunction, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Spliterator$OfInt] */
    static <T> Spliterator<T> b(int i10, int i11, IntFunction<T> intFunction, Comparator<? super T> comparator) {
        if (comparator != null) {
            C14359f.d((i11 & 4) != 0);
        }
        return new a(IntStream.range(0, i10).spliterator(), intFunction, i11, comparator);
    }
}
