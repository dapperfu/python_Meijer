package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "e", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "f", "()Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes8.dex */
public class b {
    private static final <T> int e(T t10, T t11, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iD = d(function1.invoke(t10), function1.invoke(t11));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    public static <T> Comparator<T> b(final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.j(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static <T extends Comparable<?>> int d(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static <T extends Comparable<? super T>> Comparator<T> f() {
        e eVar = e.f143534a;
        Intrinsics.h(eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(Function1[] function1Arr, Object obj, Object obj2) {
        return e(obj, obj2, function1Arr);
    }
}
