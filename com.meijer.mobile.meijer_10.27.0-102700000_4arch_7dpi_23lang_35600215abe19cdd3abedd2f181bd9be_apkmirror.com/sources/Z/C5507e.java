package Z;

import a0.C5557d;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, d2 = {"LZ/e;", "E", "", "", "minCapacity", "<init>", "(I)V", "", "b", "()V", "element", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "index", "c", "(I)Ljava/lang/Object;", "f", "()I", "", "d", "()Z", "", "[Ljava/lang/Object;", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5507e<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E[] elements;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    private final void b() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i10 = this.head;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        ArraysKt.o(eArr, eArr2, 0, i10, length);
        ArraysKt.o(this.elements, eArr2, i11, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i12 - 1;
    }

    public final void a(E element) {
        E[] eArr = this.elements;
        int i10 = this.tail;
        eArr[i10] = element;
        int i11 = this.capacityBitmask & (i10 + 1);
        this.tail = i11;
        if (i11 == this.head) {
            b();
        }
    }

    public final E c(int index) {
        if (index < 0 || index >= f()) {
            C5509g c5509g = C5509g.f42127a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.elements[this.capacityBitmask & (this.head + index)];
        Intrinsics.g(e10);
        return e10;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final E e() {
        int i10 = this.head;
        if (i10 == this.tail) {
            C5509g c5509g = C5509g.f42127a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.head = (i10 + 1) & this.capacityBitmask;
        return e10;
    }

    public final int f() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    @JvmOverloads
    public C5507e(int i10) {
        boolean z10;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5557d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            C5557d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.capacityBitmask = i10 - 1;
        this.elements = (E[]) new Object[i10];
    }
}
