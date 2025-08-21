package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/P;", "", "<init>", "()V", "", "i", "()[I", "", "value", "", "h", "(I)V", "g", "()I", "default", "f", "(I)I", "c", "e", "index", "d", "a", "b", "[I", "slots", "I", "tos", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int[] slots = new int[10];

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int tos;

    public final void a() {
        this.tos = 0;
    }

    private final int[] i() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.i(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int b(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i10 = 0; i10 < iMin; i10++) {
            if (iArr[i10] == value) {
                return i10;
            }
        }
        return -1;
    }

    public final int c() {
        return this.slots[this.tos - 1];
    }

    public final int d(int index) {
        return this.slots[index];
    }

    public final int e() {
        return this.slots[this.tos - 2];
    }

    public final int f(int i10) {
        int i11 = this.tos - 1;
        return i11 >= 0 ? this.slots[i11] : i10;
    }

    public final int g() {
        int[] iArr = this.slots;
        int i10 = this.tos - 1;
        this.tos = i10;
        return iArr[i10];
    }

    public final void h(int value) {
        int[] iArrI = this.slots;
        if (this.tos >= iArrI.length) {
            iArrI = i();
        }
        int i10 = this.tos;
        this.tos = i10 + 1;
        iArrI[i10] = value;
    }
}
