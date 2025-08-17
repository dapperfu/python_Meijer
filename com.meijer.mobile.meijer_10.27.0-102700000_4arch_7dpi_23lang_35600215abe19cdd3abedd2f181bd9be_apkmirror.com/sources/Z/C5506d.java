package Z;

import a0.C5554a;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "LZ/b;", "", "hash", "b", "(LZ/b;I)I", "", "key", "c", "(LZ/b;Ljava/lang/Object;I)I", "d", "(LZ/b;)I", "size", "", "a", "(LZ/b;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5506d {
    public static final <E> void a(C5504b<E> c5504b, int i10) {
        Intrinsics.j(c5504b, "<this>");
        c5504b.q(new int[i10]);
        c5504b.p(new Object[i10]);
    }

    public static final <E> int b(C5504b<E> c5504b, int i10) {
        Intrinsics.j(c5504b, "<this>");
        try {
            return C5554a.a(c5504b.getHashes(), c5504b.n(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(C5504b<E> c5504b, Object obj, int i10) {
        Intrinsics.j(c5504b, "<this>");
        int iN = c5504b.n();
        if (iN == 0) {
            return -1;
        }
        int iB = b(c5504b, i10);
        if (iB < 0 || Intrinsics.e(obj, c5504b.getArray()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iN && c5504b.getHashes()[i11] == i10) {
            if (Intrinsics.e(obj, c5504b.getArray()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && c5504b.getHashes()[i12] == i10; i12--) {
            if (Intrinsics.e(obj, c5504b.getArray()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final <E> int d(C5504b<E> c5504b) {
        Intrinsics.j(c5504b, "<this>");
        return c(c5504b, null, 0);
    }
}
