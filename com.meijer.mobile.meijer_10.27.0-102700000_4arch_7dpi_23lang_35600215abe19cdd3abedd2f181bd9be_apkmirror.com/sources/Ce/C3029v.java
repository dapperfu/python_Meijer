package Ce;

import Ce.L;
import Ce.N;
import Ce.O;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: Ce.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3029v {

    /* renamed from: a, reason: collision with root package name */
    private static final Collector<Object, ?, L<Object>> f4119a = Collector.of(new Supplier() { // from class: Ce.j
        @Override // java.util.function.Supplier
        public final Object get() {
            return L.p();
        }
    }, new BiConsumer() { // from class: Ce.o
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((L.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: Ce.p
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((L.a) obj).l((L.a) obj2);
        }
    }, new Function() { // from class: Ce.q
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((L.a) obj).k();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: b, reason: collision with root package name */
    private static final Collector<Object, ?, O<Object>> f4120b = Collector.of(new Supplier() { // from class: Ce.r
        @Override // java.util.function.Supplier
        public final Object get() {
            return O.p();
        }
    }, new BiConsumer() { // from class: Ce.s
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((O.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: Ce.t
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((O.a) obj).m((O.a) obj2);
        }
    }, new Function() { // from class: Ce.u
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((O.a) obj).l();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: c, reason: collision with root package name */
    private static final Collector<j0<Comparable<?>>, ?, N<Comparable<?>>> f4121c = Collector.of(new Supplier() { // from class: Ce.k
        @Override // java.util.function.Supplier
        public final Object get() {
            return N.d();
        }
    }, new BiConsumer() { // from class: Ce.l
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((N.a) obj).a((j0) obj2);
        }
    }, new BinaryOperator() { // from class: Ce.m
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((N.a) obj).d((N.a) obj2);
        }
    }, new Function() { // from class: Ce.n
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((N.a) obj).c();
        }
    }, new Collector.Characteristics[0]);

    static <E> Collector<E, ?, L<E>> a() {
        return (Collector<E, ?, L<E>>) f4119a;
    }
}
