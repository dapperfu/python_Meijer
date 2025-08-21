package Z;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u000e¨\u0006\u0010"}, d2 = {"LZ/o;", "a", "()LZ/o;", "", "element1", "b", "(I)LZ/o;", "", "elements", "c", "([I)LZ/o;", "LZ/J;", "d", "(I)LZ/J;", "LZ/o;", "EmptyIntList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5618p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5617o f43516a = new J(0);

    public static final AbstractC5617o a() {
        return f43516a;
    }

    public static final AbstractC5617o c(int... elements) {
        Intrinsics.j(elements, "elements");
        J j10 = new J(elements.length);
        j10.l(j10._size, elements);
        return j10;
    }

    public static final J d(int i10) {
        J j10 = new J(1);
        j10.k(i10);
        return j10;
    }

    public static final AbstractC5617o b(int i10) {
        return d(i10);
    }
}
