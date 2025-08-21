package kotlin.sequences;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\r\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\b\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0013\u0010\r\u001a-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0011\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0016j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0017¢\u0006\u0004\b\u0000\u0010\u0019\u001a7\u0010\u001c\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010 \u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b$\u0010%\u001aE\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010&*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'0\tH\u0007¢\u0006\u0004\b)\u0010\r\u001aC\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010&*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\t¢\u0006\u0004\b*\u0010\r\u001a=\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010&*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b+\u0010\r\u001aC\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010&*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t¢\u0006\u0004\b,\u0010\r\u001a\u001d\u0010-\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b-\u0010.\u001a\u001d\u0010/\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b/\u00100\u001a=\u00101\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0016j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0017H\u0007¢\u0006\u0004\b1\u00102\u001a.\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00103\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b4\u00105\u001a4\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0086\u0002¢\u0006\u0004\b7\u00108\u001a4\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b&\u00109\u001a}\u0010C\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0007*\u00060:j\u0002`;*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010<\u001a\u00028\u00012\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010B\u001a\u00020=2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020=\u0018\u00010\t¢\u0006\u0004\bC\u0010D\u001ag\u0010F\u001a\u00020E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010B\u001a\u00020=2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020=\u0018\u00010\t¢\u0006\u0004\bF\u0010G\u001a#\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010I¨\u0006J"}, d2 = {"T", "Lkotlin/sequences/Sequence;", "F", "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "L", "", "n", "A", "(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;", "Lkotlin/Function1;", "", "predicate", "B", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "C", "", "D", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "U", "V", "", "S", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Lkotlin/sequences/Sequence;", "", "destination", "W", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "X", "(Lkotlin/sequences/Sequence;)Ljava/util/List;", "", "Y", "", "Z", "(Lkotlin/sequences/Sequence;)Ljava/util/Set;", "R", "", "transform", "H", "G", "M", "N", "x", "(Lkotlin/sequences/Sequence;)Z", "z", "(Lkotlin/sequences/Sequence;)I", "O", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", "element", "Q", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "elements", "P", "(Lkotlin/sequences/Sequence;Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "I", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "J", "(Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "y", "(Lkotlin/sequences/Sequence;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
public class SequencesKt___SequencesKt extends j {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f148183b = new a();

        a() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> p02) {
            Intrinsics.j(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f148184b = new b();

        b() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Sequence<? extends R> p02) {
            Intrinsics.j(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> A(Sequence<? extends T> sequence, int i10) {
        Intrinsics.j(sequence, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).a(i10) : new DropSequence(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> Sequence<T> B(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    public static <T> Sequence<T> C(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(predicate, "predicate");
        return new FilteringSequence(sequence, false, predicate);
    }

    public static <T> Sequence<T> D(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Sequence<T> sequenceC = C(sequence, new Function1() { // from class: kotlin.sequences.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt.E(obj));
            }
        });
        Intrinsics.h(sequenceC, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceC;
    }

    public static <T> T F(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T, R> Sequence<R> G(Sequence<? extends T> sequence, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(transform, "transform");
        return new FlatteningSequence(sequence, transform, b.f148184b);
    }

    @SinceKotlin
    @OverloadResolutionByLambdaReturnType
    @JvmName
    public static <T, R> Sequence<R> H(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(transform, "transform");
        return new FlatteningSequence(sequence, transform, a.f148183b);
    }

    public static final <T, A extends Appendable> A I(Sequence<? extends T> sequence, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(buffer, "buffer");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String J(Sequence<? extends T> sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        return ((StringBuilder) I(sequence, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String K(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return J(sequence, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static <T> T L(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T, R> Sequence<R> M(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    public static <T, R> Sequence<R> N(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(transform, "transform");
        return D(new TransformingSequence(sequence, transform));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    public static <T> T O(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static <T> Sequence<T> P(Sequence<? extends T> sequence, Iterable<? extends T> elements) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(elements, "elements");
        return SequencesKt__SequencesKt.k(SequencesKt__SequencesKt.v(sequence, CollectionsKt.f0(elements)));
    }

    public static <T> Sequence<T> Q(Sequence<? extends T> sequence, T t10) {
        Intrinsics.j(sequence, "<this>");
        return SequencesKt__SequencesKt.k(SequencesKt__SequencesKt.v(sequence, SequencesKt__SequencesKt.v(t10)));
    }

    public static <T> Sequence<T> R(Sequence<? extends T> sequence, Sequence<? extends T> elements) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(elements, "elements");
        return SequencesKt__SequencesKt.k(SequencesKt__SequencesKt.v(sequence, elements));
    }

    public static <T extends Comparable<? super T>> Sequence<T> S(final Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        return (Sequence<T>) new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sorted$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List listY = SequencesKt___SequencesKt.Y(sequence);
                CollectionsKt.A(listY);
                return listY.iterator();
            }
        };
    }

    public static <T> Sequence<T> T(final Sequence<? extends T> sequence, final Comparator<? super T> comparator) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(comparator, "comparator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List listY = SequencesKt___SequencesKt.Y(sequence);
                CollectionsKt.B(listY, comparator);
                return listY.iterator();
            }
        };
    }

    public static <T> Sequence<T> U(Sequence<? extends T> sequence, int i10) {
        Intrinsics.j(sequence, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? SequencesKt__SequencesKt.j() : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).b(i10) : new TakeSequence(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> Sequence<T> V(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(predicate, "predicate");
        return new TakeWhileSequence(sequence, predicate);
    }

    public static final <T, C extends Collection<? super T>> C W(Sequence<? extends T> sequence, C destination) {
        Intrinsics.j(sequence, "<this>");
        Intrinsics.j(destination, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> List<T> X(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.m();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> Y(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        return (List) W(sequence, new ArrayList());
    }

    public static <T> Set<T> Z(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return SetsKt.e();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return SetsKt.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> boolean x(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        return sequence.iterator().hasNext();
    }

    public static <T> Iterable<T> y(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    public static <T> int z(Sequence<? extends T> sequence) {
        Intrinsics.j(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt.v();
            }
        }
        return i10;
    }
}
