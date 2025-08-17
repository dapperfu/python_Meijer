package h1;

import g1.C14167A;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011R$\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lh1/b;", "", "<init>", "()V", "", "minSize", "", "i", "(I)[J", "index", "Lg1/A;", "d", "(I)J", "", "pointerIdValue", "", "g", "(J)Z", "h", "(I)Z", "f", "()Z", "value", "a", "", "j", "(IJ)V", "b", "c", "<set-?>", "I", "e", "()I", "size", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14325b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] internalArray = new long[2];

    public final void b() {
        this.size = 0;
    }

    private final long[] i(int minSize) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        Intrinsics.i(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean c(long pointerIdValue) {
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.internalArray[i11] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final long d(int index) {
        return C14167A.a(this.internalArray[index]);
    }

    /* renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean f() {
        return this.size == 0;
    }

    public final boolean g(long pointerIdValue) {
        int i10 = this.size;
        int i11 = 0;
        while (i11 < i10) {
            if (pointerIdValue == this.internalArray[i11]) {
                int i12 = this.size - 1;
                while (i11 < i12) {
                    long[] jArr = this.internalArray;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.size--;
                return true;
            }
            i11++;
        }
        return false;
    }

    public final boolean h(int index) {
        int i10 = this.size;
        if (index >= i10) {
            return false;
        }
        int i11 = i10 - 1;
        while (index < i11) {
            long[] jArr = this.internalArray;
            int i12 = index + 1;
            jArr[index] = jArr[i12];
            index = i12;
        }
        this.size--;
        return true;
    }

    public final void j(int index, long value) {
        long[] jArrI = this.internalArray;
        if (index >= jArrI.length) {
            jArrI = i(index + 1);
        }
        jArrI[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    public final boolean a(long value) {
        if (!c(value)) {
            j(this.size, value);
            return true;
        }
        return false;
    }
}
