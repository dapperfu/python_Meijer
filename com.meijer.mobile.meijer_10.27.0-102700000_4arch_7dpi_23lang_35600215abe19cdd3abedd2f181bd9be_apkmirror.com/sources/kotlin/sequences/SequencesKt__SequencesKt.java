package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\f\u001aE\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\f\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"T", "", "Lkotlin/sequences/Sequence;", "h", "(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;", "", "elements", "v", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "j", "()Lkotlin/sequences/Sequence;", "k", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "", "p", "R", "Lkotlin/Function1;", "iterator", "l", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "i", "", "Lkotlin/Function0;", "nextFunction", "r", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "seed", "q", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "s", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes13.dex */
public class SequencesKt__SequencesKt extends d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u(Object obj) {
        return obj;
    }

    public static <T> Sequence<T> h(final Iterator<? extends T> it) {
        Intrinsics.j(it, "<this>");
        return i(new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return it;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> i(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    public static <T> Sequence<T> j() {
        return b.f147318a;
    }

    public static final <T> Sequence<T> k(Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.j(sequence, "<this>");
        return l(sequence, new Function1() { // from class: kotlin.sequences.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.m((Sequence) obj);
            }
        });
    }

    private static final <T, R> Sequence<R> l(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).e(function1) : new FlatteningSequence(sequence, new Function1() { // from class: kotlin.sequences.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.o(obj);
            }
        }, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator m(Sequence it) {
        Intrinsics.j(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator n(Iterable it) {
        Intrinsics.j(it, "it");
        return it.iterator();
    }

    @JvmName
    public static <T> Sequence<T> p(Sequence<? extends Iterable<? extends T>> sequence) {
        Intrinsics.j(sequence, "<this>");
        return l(sequence, new Function1() { // from class: kotlin.sequences.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.n((Iterable) obj);
            }
        });
    }

    @LowPriorityInOverloadResolution
    public static <T> Sequence<T> q(final T t10, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.j(nextFunction, "nextFunction");
        return t10 == null ? b.f147318a : new GeneratorSequence(new Function0() { // from class: kotlin.sequences.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SequencesKt__SequencesKt.u(t10);
            }
        }, nextFunction);
    }

    public static <T> Sequence<T> r(final Function0<? extends T> nextFunction) {
        Intrinsics.j(nextFunction, "nextFunction");
        return i(new GeneratorSequence(nextFunction, new Function1() { // from class: kotlin.sequences.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.t(nextFunction, obj);
            }
        }));
    }

    public static <T> Sequence<T> s(Function0<? extends T> seedFunction, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.j(seedFunction, "seedFunction");
        Intrinsics.j(nextFunction, "nextFunction");
        return new GeneratorSequence(seedFunction, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(Function0 function0, Object it) {
        Intrinsics.j(it, "it");
        return function0.invoke();
    }

    public static <T> Sequence<T> v(T... elements) {
        Intrinsics.j(elements, "elements");
        return ArraysKt.T(elements);
    }
}
