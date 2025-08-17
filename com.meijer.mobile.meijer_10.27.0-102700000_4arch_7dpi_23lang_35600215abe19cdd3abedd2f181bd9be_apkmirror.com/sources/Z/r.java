package Z;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"V", "LZ/q;", "a", "()LZ/q;", "b", "LZ/K;", "c", "()LZ/K;", "", "key1", "value1", "key2", "value2", "key3", "value3", "d", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)LZ/K;", "", "LZ/K;", "EmptyIntObjectMap", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final K f42206a = new K(0);

    public static final <V> AbstractC5519q<V> a() {
        K k10 = f42206a;
        Intrinsics.h(k10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return k10;
    }

    public static final <V> AbstractC5519q<V> b() {
        K k10 = f42206a;
        Intrinsics.h(k10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return k10;
    }

    public static final <V> K<V> c() {
        return new K<>(0, 1, null);
    }

    public static final <V> K<V> d(int i10, V v10, int i11, V v11, int i12, V v12) {
        K<V> k10 = new K<>(0, 1, null);
        k10.r(i10, v10);
        k10.r(i11, v11);
        k10.r(i12, v12);
        return k10;
    }
}
