package xk;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a1\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"K", "V", "", "", "index", "", "b", "(Ljava/util/Map;I)Z", "E", "", "a", "(Ljava/util/List;I)Z", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18063a {
    public static final <E> boolean a(List<? extends E> list, int i10) {
        Intrinsics.j(list, "<this>");
        return i10 < CollectionsKt.o(list);
    }

    public static final <K, V> boolean b(Map<K, V> map, int i10) {
        Intrinsics.j(map, "<this>");
        return i10 < map.size() - 1;
    }
}
