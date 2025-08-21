package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "", "", "y", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "x", "(Ljava/lang/Iterable;I)I", "", "z", "(Ljava/lang/Iterable;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class j extends i {
    @PublishedApi
    public static <T> int x(Iterable<? extends T> iterable, int i10) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @PublishedApi
    public static final <T> Integer y(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> z(Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            n.C(arrayList, it.next());
        }
        return arrayList;
    }
}
