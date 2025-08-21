package Z;

import a0.C5640d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LZ/J;", "LZ/o;", "", "initialCapacity", "<init>", "(I)V", "element", "", "k", "(I)Z", "index", "", "j", "(II)V", "", "elements", "l", "(I[I)Z", "capacity", "m", "n", "o", "(I)I", "p", "(II)I", "q", "()V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J extends AbstractC5617o {
    public J(int i10) {
        super(i10, null);
    }

    public /* synthetic */ J(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void j(int index, int element) {
        if (index < 0 || index > this._size) {
            C5640d.c("Index must be between 0 and size");
        }
        m(this._size + 1);
        int[] iArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.m(iArr, iArr, index + 1, index, i10);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean k(int element) {
        m(this._size + 1);
        int[] iArr = this.content;
        int i10 = this._size;
        iArr[i10] = element;
        this._size = i10 + 1;
        return true;
    }

    public final boolean l(int index, int[] elements) {
        Intrinsics.j(elements, "elements");
        if (index < 0 || index > this._size) {
            C5640d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        m(this._size + elements.length);
        int[] iArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.m(iArr, iArr, elements.length + index, index, i10);
        }
        ArraysKt.r(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void m(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.i(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final int o(int index) {
        if (index < 0 || index >= this._size) {
            C5640d.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i10 = iArr[index];
        int i11 = this._size;
        if (index != i11 - 1) {
            ArraysKt.m(iArr, iArr, index, index + 1, i11);
        }
        this._size--;
        return i10;
    }

    public final int p(int index, int element) {
        if (index < 0 || index >= this._size) {
            C5640d.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i10 = iArr[index];
        iArr[index] = element;
        return i10;
    }

    public final void q() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        ArraysKt.M(this.content, 0, i10);
    }

    public final boolean n(int element) {
        int iF = f(element);
        if (iF >= 0) {
            o(iF);
            return true;
        }
        return false;
    }
}
