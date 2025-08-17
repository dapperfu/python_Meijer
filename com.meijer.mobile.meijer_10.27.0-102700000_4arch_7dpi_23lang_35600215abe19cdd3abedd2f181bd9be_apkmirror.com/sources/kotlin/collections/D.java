package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "", "e", "()Ljava/util/Set;", "", "elements", "i", "([Ljava/lang/Object;)Ljava/util/Set;", "", "g", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "h", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes4.dex */
public class D extends C {
    public static <T> Set<T> e() {
        return EmptySet.f142508a;
    }

    public static <T> LinkedHashSet<T> f(T... elements) {
        Intrinsics.j(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.b1(elements, new LinkedHashSet(y.f(elements.length)));
    }

    public static <T> Set<T> g(T... elements) {
        Intrinsics.j(elements, "elements");
        return (Set) ArraysKt___ArraysKt.b1(elements, new LinkedHashSet(y.f(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> h(Set<? extends T> set) {
        Intrinsics.j(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C.d(set.iterator().next()) : e();
    }

    public static <T> Set<T> i(T... elements) {
        Intrinsics.j(elements, "elements");
        return ArraysKt___ArraysKt.u1(elements);
    }
}
