package Z;

import a0.C5640d;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"LZ/f;", "", "", "minCapacity", "<init>", "(I)V", "", "c", "()V", "element", "a", "e", "()I", "b", "", "d", "()Z", "", "[I", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5608f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] elements;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    @JvmOverloads
    public C5608f() {
        this(0, 1, null);
    }

    @JvmOverloads
    public C5608f(int i10) {
        if (!(i10 >= 1)) {
            C5640d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            C5640d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.capacityBitmask = i10 - 1;
        this.elements = new int[i10];
    }

    private final void c() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i10 = this.head;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        ArraysKt.m(iArr, iArr2, 0, i10, length);
        ArraysKt.m(this.elements, iArr2, i11, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i12 - 1;
    }

    public final void a(int element) {
        int[] iArr = this.elements;
        int i10 = this.tail;
        iArr[i10] = element;
        int i11 = this.capacityBitmask & (i10 + 1);
        this.tail = i11;
        if (i11 == this.head) {
            c();
        }
    }

    public final void b() {
        this.tail = this.head;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final int e() {
        int i10 = this.head;
        if (i10 == this.tail) {
            C5609g c5609g = C5609g.f43448a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.elements[i10];
        this.head = (i10 + 1) & this.capacityBitmask;
        return i11;
    }

    public /* synthetic */ C5608f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
