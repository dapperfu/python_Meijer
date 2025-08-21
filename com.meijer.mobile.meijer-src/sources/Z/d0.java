package Z;

import a0.C5640d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "index", "", "d", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "e", "(Ljava/util/List;II)V", "E", "LZ/c0;", "f", "()LZ/c0;", "element1", "i", "(Ljava/lang/Object;)LZ/c0;", "LZ/T;", "g", "(Ljava/lang/Object;)LZ/T;", "element2", "h", "(Ljava/lang/Object;Ljava/lang/Object;)LZ/T;", "", "", "a", "[Ljava/lang/Object;", "EmptyArray", "b", "LZ/c0;", "EmptyObjectList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f43429a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private static final c0<Object> f43430b = new T(0);

    public static final <E> c0<E> f() {
        c0<E> c0Var = (c0<E>) f43430b;
        Intrinsics.h(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return c0Var;
    }

    public static final <E> T<E> g(E e10) {
        T<E> t10 = new T<>(1);
        t10.n(e10);
        return t10;
    }

    public static final <E> T<E> h(E e10, E e11) {
        T<E> t10 = new T<>(2);
        t10.n(e10);
        t10.n(e11);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i10) {
        int size = list.size();
        if (i10 >= 0 && i10 < size) {
            return;
        }
        C5640d.c("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            C5640d.a("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            C5640d.c("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 > size) {
            C5640d.c("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> c0<E> i(E e10) {
        return g(e10);
    }
}
