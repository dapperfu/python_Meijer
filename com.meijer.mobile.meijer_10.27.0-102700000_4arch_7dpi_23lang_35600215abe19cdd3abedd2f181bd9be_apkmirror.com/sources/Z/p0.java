package Z;

import a0.C5554a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "LZ/o0;", "", "key", "c", "(LZ/o0;I)Ljava/lang/Object;", "", "d", "(LZ/o0;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f42196a = new Object();

    public static final <E> E c(o0<E> o0Var, int i10) {
        E e10;
        Intrinsics.j(o0Var, "<this>");
        int iA = C5554a.a(o0Var.keys, o0Var.size, i10);
        if (iA < 0 || (e10 = (E) o0Var.values[iA]) == f42196a) {
            return null;
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void d(o0<E> o0Var) {
        int i10 = o0Var.size;
        int[] iArr = o0Var.keys;
        Object[] objArr = o0Var.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f42196a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        o0Var.garbage = false;
        o0Var.size = i11;
    }
}
