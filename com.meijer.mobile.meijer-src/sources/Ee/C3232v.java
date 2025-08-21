package Ee;

import Ee.L;
import Ee.N;
import Ee.O;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: Ee.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3232v {

    /* renamed from: a, reason: collision with root package name */
    private static final Collector<Object, ?, L<Object>> f7431a = Collector.of(new Supplier() { // from class: Ee.j
        @Override // java.util.function.Supplier
        public final Object get() {
            return L.p();
        }
    }, new BiConsumer() { // from class: Ee.o
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((L.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: Ee.p
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((L.a) obj).l((L.a) obj2);
        }
    }, new Function() { // from class: Ee.q
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((L.a) obj).k();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: b, reason: collision with root package name */
    private static final Collector<Object, ?, O<Object>> f7432b = Collector.of(new Supplier() { // from class: Ee.r
        @Override // java.util.function.Supplier
        public final Object get() {
            return O.p();
        }
    }, new BiConsumer() { // from class: Ee.s
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((O.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: Ee.t
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((O.a) obj).m((O.a) obj2);
        }
    }, new Function() { // from class: Ee.u
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((O.a) obj).l();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: c, reason: collision with root package name */
    private static final Collector<j0<Comparable<?>>, ?, N<Comparable<?>>> f7433c = Collector.of(new Supplier() { // from class: Ee.k
        @Override // java.util.function.Supplier
        public final Object get() {
            return N.d();
        }
    }, new BiConsumer() { // from class: Ee.l
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((N.a) obj).a((j0) obj2);
        }
    }, new BinaryOperator() { // from class: Ee.m
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((N.a) obj).d((N.a) obj2);
        }
    }, new Function() { // from class: Ee.n
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((N.a) obj).c();
        }
    }, new Collector.Characteristics[0]);

    static <E> Collector<E, ?, L<E>> a() {
        return (Collector<E, ?, L<E>>) f7431a;
    }
}
