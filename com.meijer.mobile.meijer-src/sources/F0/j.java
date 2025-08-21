package F0;

import E0.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"LF0/j;", "E", "LE0/c;", "LF0/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", "n", "(I)[Ljava/lang/Object;", "element", "LE0/e;", "add", "(Ljava/lang/Object;)LE0/e;", "", "elements", "addAll", "(Ljava/util/Collection;)LE0/e;", "Lkotlin/Function1;", "", "predicate", "B2", "(Lkotlin/jvm/functions/Function1;)LE0/e;", "index", "(ILjava/lang/Object;)LE0/e;", "v0", "(I)LE0/e;", "LE0/e$a;", "builder", "()LE0/e$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "f", "()I", "c", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j<E> extends b<E> implements E0.c<E> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f8869d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final j f8870e = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] buffer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LF0/j$a;", "", "<init>", "()V", "LF0/j;", "", "EMPTY", "LF0/j;", "a", "()LF0/j;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F0.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final j a() {
            return j.f8870e;
        }
    }

    @Override // java.util.Collection, java.util.List, E0.e
    public E0.e<E> add(E element) {
        if (size() >= 32) {
            return new e(this.buffer, l.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = element;
        return new j(objArrCopyOf);
    }

    private final Object[] n(int size) {
        return new Object[size];
    }

    @Override // E0.e
    public E0.e<E> B2(Function1<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.buffer[i10];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.i(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f8870e : new j(ArraysKt.w(objArrCopyOf, 0, size));
    }

    @Override // E0.e
    public e.a<E> builder() {
        return new f(this, null, this.buffer, 0);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object element) {
        return ArraysKt.t0(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        return ArraysKt.I0(this.buffer, element);
    }

    public j(Object[] objArr) {
        boolean z10;
        this.buffer = objArr;
        if (objArr.length <= 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        I0.a.a(z10);
    }

    @Override // F0.b, java.util.Collection, java.util.List, E0.e
    public E0.e<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            int size = size();
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new j(objArrCopyOf);
        }
        e.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(elements);
        return aVarBuilder.build();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        I0.d.a(index, size());
        return (E) this.buffer[index];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        I0.d.b(index, size());
        return new c(this.buffer, index, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List, E0.e
    public E0.e<E> set(int index, E element) {
        I0.d.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[index] = element;
        return new j(objArrCopyOf);
    }

    @Override // E0.e
    public E0.e<E> v0(int index) {
        I0.d.a(index, size());
        if (size() == 1) {
            return f8870e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        ArraysKt.o(this.buffer, objArrCopyOf, index, index + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // java.util.List, E0.e
    public E0.e<E> add(int index, E element) {
        I0.d.b(index, size());
        if (index == size()) {
            return add((j<E>) element);
        }
        if (size() < 32) {
            Object[] objArrN = n(size() + 1);
            ArraysKt.t(this.buffer, objArrN, 0, 0, index, 6, null);
            ArraysKt.o(this.buffer, objArrN, index + 1, index, size());
            objArrN[index] = element;
            return new j(objArrN);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        ArraysKt.o(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new e(objArrCopyOf, l.c(this.buffer[31]), size() + 1, 0);
    }
}
