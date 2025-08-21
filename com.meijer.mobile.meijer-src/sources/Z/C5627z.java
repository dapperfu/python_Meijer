package Z;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000f"}, d2 = {"V", "LZ/y;", "a", "()LZ/y;", "", "key1", "value1", "b", "(JLjava/lang/Object;)LZ/y;", "LZ/O;", "c", "()LZ/O;", "", "LZ/O;", "EmptyLongObjectMap", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5627z {

    /* renamed from: a, reason: collision with root package name */
    private static final O f43569a = new O(0);

    public static final <V> AbstractC5626y<V> a() {
        O o10 = f43569a;
        Intrinsics.h(o10, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return o10;
    }

    public static final <V> AbstractC5626y<V> b(long j10, V v10) {
        O o10 = new O(0, 1, null);
        o10.r(j10, v10);
        return o10;
    }

    public static final <V> O<V> c() {
        return new O<>(0, 1, null);
    }
}
