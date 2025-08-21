package M0;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u001b\u0010\u0016\u001a\u00020\u00132\f\b\u0002\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\n\u001a\u00020\u00042\n\u0010\u0018\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\n\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\"\u001a\u00060\u001fj\u0002` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\u0005\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006'"}, d2 = {"LM0/e;", "", "<init>", "()V", "", "index", "", "h", "(I)V", "g", "a", "b", "i", "(II)V", "atLeast", "c", "()I", "handle", "d", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "default", "e", "(J)J", "value", "(J)I", "f", "<set-?>", "I", "getSize", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "[J", "values", "", "[I", "handles", "firstFreeHandle", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] values = g.b(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] index = new int[16];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] handles;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            ArraysKt.r(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i13 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i13];
        return i13;
    }

    private final void c(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i10 = length * 2;
        long[] jArrB = g.b(i10);
        int[] iArr = new int[i10];
        ArraysKt.s(this.values, jArrB, 0, 0, 0, 12, null);
        ArraysKt.r(this.index, iArr, 0, 0, 0, 14, null);
        this.values = jArrB;
        this.index = iArr;
    }

    private final void d(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    private final void g(int index) {
        long[] jArr = this.values;
        int i10 = this.size >> 1;
        while (index < i10) {
            int i11 = (index + 1) << 1;
            int i12 = i11 - 1;
            if (i11 < this.size) {
                long j10 = jArr[i11];
                if (j10 < jArr[i12]) {
                    if (j10 >= jArr[index]) {
                        return;
                    }
                    i(i11, index);
                    index = i11;
                }
            }
            if (jArr[i12] >= jArr[index]) {
                return;
            }
            i(i12, index);
            index = i12;
        }
    }

    private final void h(int index) {
        long[] jArr = this.values;
        long j10 = jArr[index];
        while (index > 0) {
            int i10 = ((index + 1) >> 1) - 1;
            if (jArr[i10] <= j10) {
                return;
            }
            i(i10, index);
            index = i10;
        }
    }

    private final void i(int a10, int b10) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j10 = jArr[a10];
        jArr[a10] = jArr[b10];
        jArr[b10] = j10;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        iArr[a10] = i11;
        iArr[b10] = i10;
        iArr2[i11] = a10;
        iArr2[i10] = b10;
    }

    public final int a(long value) {
        c(this.size + 1);
        int i10 = this.size;
        this.size = i10 + 1;
        int iB = b();
        this.values[i10] = value;
        this.index[i10] = iB;
        this.handles[iB] = i10;
        h(i10);
        return iB;
    }

    public final long e(long j10) {
        return this.size > 0 ? this.values[0] : j10;
    }

    public final void f(int handle) {
        int i10 = this.handles[handle];
        i(i10, this.size - 1);
        this.size--;
        h(i10);
        g(i10);
        d(handle);
    }

    public e() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.handles = iArr;
    }
}
