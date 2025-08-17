package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "", "element", "k", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "j", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "m", "l", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
@SourceDebugExtension
/* loaded from: classes4.dex */
public class E extends D {
    public static <T> Set<T> j(Set<? extends T> set, Iterable<? extends T> elements) {
        Intrinsics.j(set, "<this>");
        Intrinsics.j(elements, "elements");
        Collection<?> collectionE = n.E(elements);
        if (collectionE.isEmpty()) {
            return CollectionsKt___CollectionsKt.o1(set);
        }
        if (!(collectionE instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionE);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!((Set) collectionE).contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> k(Set<? extends T> set, T t10) {
        Intrinsics.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.f(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && Intrinsics.e(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> l(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        Intrinsics.j(set, "<this>");
        Intrinsics.j(elements, "elements");
        Integer numY = j.y(elements);
        if (numY != null) {
            size = set.size() + numY.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.f(size));
        linkedHashSet.addAll(set);
        n.C(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> m(Set<? extends T> set, T t10) {
        Intrinsics.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
