package androidx.compose.ui.node;

import j1.C14832a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006."}, d2 = {"Landroidx/compose/ui/node/z;", "", "", "initialCapacity", "<init>", "(I)V", "", "stack", "j", "([I)[I", "start", "end", "elSize", "", "i", "(III)V", "e", "(III)I", "l", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "k", "()V", "[I", "I", "lastIndex", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5829z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    private final int[] j(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.i(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final boolean a(int a10, int b10) {
        int[] iArr = this.stack;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        return i10 < i11 || (i10 == i11 && iArr[a10 + 1] <= iArr[b10 + 1]);
    }

    private final int e(int start, int end, int elSize) {
        int i10 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i10 += elSize;
                l(i10, start);
            }
            start += elSize;
        }
        int i11 = i10 + elSize;
        l(i11, end);
        return i11;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int iE = e(start, end, elSize);
            i(start, iE - elSize, elSize);
            i(iE + elSize, end, elSize);
        }
    }

    private final void l(int i10, int j10) {
        int[] iArr = this.stack;
        C5802b0.i(iArr, i10, j10);
        C5802b0.i(iArr, i10 + 1, j10 + 1);
        C5802b0.i(iArr, i10 + 2, j10 + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void g(int x10, int y10, int size) {
        int i10 = this.lastIndex;
        int[] iArrJ = this.stack;
        int i11 = i10 + 3;
        if (i11 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i10] = x10 + size;
        iArrJ[i10 + 1] = y10 + size;
        iArrJ[i10 + 2] = size;
        this.lastIndex = i11;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i10 = this.lastIndex;
        int[] iArrJ = this.stack;
        int i11 = i10 + 4;
        if (i11 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i10] = oldStart;
        iArrJ[i10 + 1] = oldEnd;
        iArrJ[i10 + 2] = newStart;
        iArrJ[i10 + 3] = newEnd;
        this.lastIndex = i11;
    }

    public final void k() {
        int i10 = this.lastIndex;
        if (!(i10 % 3 == 0)) {
            C14832a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }

    public C5829z(int i10) {
        this.stack = new int[i10];
    }
}
