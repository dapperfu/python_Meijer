package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"", "", "index", "V", "(Ljava/util/List;I)I", "X", "W", "T", "(Ljava/util/List;)Ljava/util/List;", "", "U", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class o extends n {
    public static <T> List<T> T(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    @JvmName
    public static <T> List<T> U(List<T> list) {
        Intrinsics.j(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= i.o(list)) {
            return i.o(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new IntRange(0, i.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(List<?> list, int i10) {
        return i.o(list) - i10;
    }
}
