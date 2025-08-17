package F0;

import androidx.compose.runtime.C5757z0;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010/R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010D¨\u0006F"}, d2 = {"LF0/e;", "E", "LE0/e;", "LF0/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "y", "()I", "filledTail", "newTail", "s", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)LF0/e;", "shift", "t", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "p", "([Ljava/lang/Object;ILjava/lang/Object;)LF0/e;", "index", "LF0/d;", "elementCarry", "o", "([Ljava/lang/Object;IILjava/lang/Object;LF0/d;)[Ljava/lang/Object;", "rootSize", "x", "([Ljava/lang/Object;III)LE0/e;", "r", "([Ljava/lang/Object;II)LE0/e;", "tailCarry", "q", "([Ljava/lang/Object;IILF0/d;)[Ljava/lang/Object;", "v", "k", "(I)[Ljava/lang/Object;", "e", "z", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)LE0/e;", "(ILjava/lang/Object;)LE0/e;", "v0", "(I)LE0/e;", "Lkotlin/Function1;", "", "predicate", "C2", "(Lkotlin/jvm/functions/Function1;)LE0/e;", "LF0/f;", "n", "()LF0/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "c", "d", "I", "f", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e<E> extends b<E> implements E0.e<E> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] root;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    @Override // java.util.Collection, java.util.List, E0.e
    public E0.e<E> add(E element) {
        int size = size() - y();
        if (size >= 32) {
            return s(this.root, this.tail, l.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = element;
        return new e(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    private final E0.e<E> r(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                Intrinsics.i(root, "copyOf(...)");
            }
            return new j(root);
        }
        d dVar = new d(null);
        Object[] objArrQ = q(root, shift, rootSize - 1, dVar);
        Intrinsics.g(objArrQ);
        Object value = dVar.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrQ[1] != null) {
            return new e(objArrQ, objArr, rootSize, shift);
        }
        Object obj = objArrQ[0];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr, rootSize, shift - 5);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // E0.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f<E> builder() {
        return new f<>(this, this.root, this.tail, this.rootShift);
    }

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        boolean z10;
        this.root = objArr;
        this.tail = objArr2;
        this.size = i10;
        this.rootShift = i11;
        if (size() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5757z0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        I0.a.a(size() - l.d(size()) <= RangesKt.k(objArr2.length, 32));
    }

    private final Object[] k(int index) {
        if (y() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i10)];
            Intrinsics.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] o(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.o(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.i(objArrCopyOf2, "copyOf(...)");
        int i10 = shift - 5;
        Object obj = root[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = o((Object[]) obj, i10, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj2 = root[iA];
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = o((Object[]) obj2, i10, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    private final e<E> p(Object[] root, int tailIndex, Object element) {
        int size = size() - y();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            ArraysKt.o(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new e<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.o(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return s(root, objArrCopyOf, l.c(obj));
    }

    private final Object[] q(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrQ;
        int iA = l.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrQ = null;
        } else {
            Object obj = root[iA];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ = q((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrQ == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrQ;
        return objArrCopyOf;
    }

    private final e<E> s(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            Object[] objArrC = l.c(root);
            int i11 = this.rootShift + 5;
            return new e<>(t(objArrC, i11, filledTail), newTail, size() + 1, i11);
        }
        return new e<>(t(root, i10, filledTail), newTail, size() + 1, this.rootShift);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] t(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = F0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.t(r2, r5, r6)
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.e.t(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] v(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        int iA2 = 31;
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.o(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        if (root[31] == null) {
            iA2 = l.a(y() - 1, shift);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.i(objArrCopyOf2, "copyOf(...)");
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = v((Object[]) obj, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = v((Object[]) obj2, i10, index, tailCarry);
        return objArrCopyOf2;
    }

    private final E0.e<E> x(Object[] root, int rootSize, int shift, int index) {
        boolean z10;
        int size = size() - rootSize;
        if (index < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        I0.a.a(z10);
        if (size == 1) {
            return r(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        int i10 = size - 1;
        if (index < i10) {
            ArraysKt.o(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i10] = null;
        return new e(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int y() {
        return l.d(size());
    }

    private final Object[] z(Object[] root, int shift, int index, Object e10) {
        int iA = l.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        if (shift == 0) {
            objArrCopyOf[iA] = e10;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = z((Object[]) obj, shift - 5, index, e10);
        return objArrCopyOf;
    }

    @Override // E0.e
    public E0.e<E> C2(Function1<? super E, Boolean> predicate) {
        f<E> fVarBuilder = builder();
        fVarBuilder.Q(predicate);
        return fVarBuilder.build();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        I0.d.a(index, size());
        return (E) k(index)[index & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        I0.d.b(index, size());
        return new g(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, E0.e
    public E0.e<E> set(int index, E element) {
        I0.d.a(index, size());
        if (y() <= index) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[index & 31] = element;
            return new e(this.root, objArrCopyOf, size(), this.rootShift);
        }
        return new e(z(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
    }

    @Override // E0.e
    public E0.e<E> v0(int index) {
        I0.d.a(index, size());
        int iY = y();
        if (index >= iY) {
            return x(this.root, iY, this.rootShift, index - iY);
        }
        return x(v(this.root, this.rootShift, index, new d(this.tail[0])), iY, this.rootShift, 0);
    }

    @Override // java.util.List, E0.e
    public E0.e<E> add(int index, E element) {
        I0.d.b(index, size());
        if (index == size()) {
            return add((e<E>) element);
        }
        int iY = y();
        if (index >= iY) {
            return p(this.root, index - iY, element);
        }
        d dVar = new d(null);
        return p(o(this.root, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }
}
