package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\n\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u0006\u001a-\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u0006\u001a1\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0014\u0010\u0013\u001a;\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001a\u001a!\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001a\u001a1\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"T", "", "", "elements", "", "C", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "", "D", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "E", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "I", "P", "", "Lkotlin/Function1;", "predicate", "H", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "O", "predicateResultToRemove", "F", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "", "K", "(Ljava/util/List;)Ljava/lang/Object;", "L", "M", "N", "J", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "G", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes4.dex */
public class n extends m {
    public static <T> boolean C(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean D(Collection<? super T> collection, T[] elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        return collection.addAll(ArraysKt___ArraysJvmKt.g(elements));
    }

    public static <T> Collection<T> E(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt___CollectionsKt.j1(iterable);
    }

    private static final <T> boolean G(List<T> list, Function1<? super T, Boolean> function1, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.h(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(TypeIntrinsics.b(list), function1, z10);
        }
        int iO = i.o(list);
        if (iO >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (function1.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iO2 = i.o(list);
        if (i10 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i10) {
                return true;
            }
            iO2--;
        }
    }

    public static <T> boolean H(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(predicate, "predicate");
        return F(iterable, predicate, true);
    }

    public static final <T> boolean I(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        return collection.removeAll(E(elements));
    }

    public static <T> boolean J(List<T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(predicate, "predicate");
        return G(list, predicate, true);
    }

    @SinceKotlin
    public static <T> T K(List<T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @SinceKotlin
    public static <T> T L(List<T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @SinceKotlin
    public static <T> T M(List<T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(i.o(list));
    }

    @SinceKotlin
    public static <T> T N(List<T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(i.o(list));
    }

    public static <T> boolean O(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(predicate, "predicate");
        return F(iterable, predicate, false);
    }

    public static final <T> boolean P(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        return collection.retainAll(E(elements));
    }

    private static final <T> boolean F(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }
}
