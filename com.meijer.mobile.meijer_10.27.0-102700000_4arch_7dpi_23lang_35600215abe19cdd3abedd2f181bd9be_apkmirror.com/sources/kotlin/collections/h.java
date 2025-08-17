package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0011\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "element", "", "e", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "()Ljava/util/List;", "", "capacity", "d", "(I)Ljava/util/List;", "builder", "a", "(Ljava/util/List;)Ljava/util/List;", "collectionSize", "", "array", "f", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* loaded from: classes4.dex */
public class h {
    @SinceKotlin
    @PublishedApi
    public static <E> List<E> a(List<E> builder) {
        Intrinsics.j(builder, "builder");
        return ((ListBuilder) builder).y();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        Intrinsics.j(tArr, "<this>");
        if (z10 && Intrinsics.e(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @SinceKotlin
    @PublishedApi
    public static <E> List<E> c() {
        return new ListBuilder(0, 1, null);
    }

    @SinceKotlin
    @PublishedApi
    public static <E> List<E> d(int i10) {
        return new ListBuilder(i10);
    }

    public static <T> T[] f(int i10, T[] array) {
        Intrinsics.j(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    public static <T> List<T> e(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        Intrinsics.i(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
