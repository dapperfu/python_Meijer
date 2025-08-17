package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\n\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u001c\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010 \u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020#H\u0001¢\u0006\u0004\b(\u0010'\"\u0019\u0010,\u001a\u00020)*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010+\"!\u0010/\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"T", "", "", "h", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "m", "()Ljava/util/List;", "elements", "p", "([Ljava/lang/Object;)Ljava/util/List;", "", "s", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "q", "(Ljava/lang/Object;)Ljava/util/List;", "r", "t", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "j", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Lkotlin/Function1;", "comparison", "i", "(Ljava/util/List;IILkotlin/jvm/functions/Function1;)I", "size", "", "u", "(III)V", "w", "()V", "v", "Lkotlin/ranges/IntRange;", "n", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "o", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i extends h {
    public static <T> ArrayList<T> g(T... elements) {
        Intrinsics.j(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new C15209c(elements, true));
    }

    public static final <T> Collection<T> h(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return new C15209c(tArr, false);
    }

    public static final <T> int i(List<? extends T> list, int i10, int i11, Function1<? super T, Integer> comparison) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(comparison, "comparison");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = comparison.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int j(List<? extends T> list, T t10, int i10, int i11) {
        Intrinsics.j(list, "<this>");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = ComparisonsKt.d(list.get(i13), t10);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return i(list, i10, i11, function1);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    public static <T> List<T> m() {
        return EmptyList.f142507a;
    }

    public static IntRange n(Collection<?> collection) {
        Intrinsics.j(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int o(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> p(T... elements) {
        Intrinsics.j(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysJvmKt.g(elements) : m();
    }

    public static <T> List<T> q(T t10) {
        return t10 != null ? h.e(t10) : m();
    }

    public static <T> List<T> r(T... elements) {
        Intrinsics.j(elements, "elements");
        return ArraysKt___ArraysKt.c0(elements);
    }

    public static <T> List<T> s(T... elements) {
        Intrinsics.j(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C15209c(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> t(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : h.e(list.get(0)) : m();
    }

    private static final void u(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    @SinceKotlin
    @PublishedApi
    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin
    @PublishedApi
    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
