package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.InterfaceC13926o;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u001a\u0010+\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010#¨\u0006,"}, d2 = {"Landroidx/compose/foundation/gestures/c;", "T", "Lf0/o;", "", "keys", "", "anchors", "<init>", "(Ljava/util/List;[F)V", "anchor", "", "c", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "b", "(F)Ljava/lang/Object;", "searchUpwards", "a", "(FZ)Ljava/lang/Object;", "e", "()F", "f", "", "index", "g", "(I)Ljava/lang/Object;", "i", "(I)F", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "[F", "I", "h", "size", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c<T> implements InterfaceC13926o<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> keys;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] anchors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.e(this.keys, cVar.keys) && Arrays.equals(this.anchors, cVar.anchors) && getSize() == cVar.getSize();
    }

    @Override // kotlin.InterfaceC13926o
    public T a(float position, boolean searchUpwards) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i10 = -1;
        int i11 = 0;
        float f10 = Float.POSITIVE_INFINITY;
        int i12 = 0;
        while (i11 < length) {
            float f11 = fArr[i11];
            int i13 = i12 + 1;
            float f12 = searchUpwards ? f11 - position : position - f11;
            if (f12 < 0.0f) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if (f12 <= f10) {
                i10 = i12;
                f10 = f12;
            }
            i11++;
            i12 = i13;
        }
        return this.keys.get(i10);
    }

    @Override // kotlin.InterfaceC13926o
    public T b(float position) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i10 = -1;
        float f10 = Float.POSITIVE_INFINITY;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            float fAbs = Math.abs(position - fArr[i11]);
            if (fAbs <= f10) {
                i10 = i12;
                f10 = fAbs;
            }
            i11++;
            i12 = i13;
        }
        return this.keys.get(i10);
    }

    @Override // kotlin.InterfaceC13926o
    public float c(T anchor) {
        int iIndexOf = this.keys.indexOf(anchor);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf > ArraysKt.j0(fArr)) ? ((Number) a.f48356b.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    @Override // kotlin.InterfaceC13926o
    public boolean d(T anchor) {
        return this.keys.indexOf(anchor) != -1;
    }

    @Override // kotlin.InterfaceC13926o
    public float e() {
        Float fO0 = ArraysKt.O0(this.anchors);
        if (fO0 != null) {
            return fO0.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.InterfaceC13926o
    public float f() {
        Float fM0 = ArraysKt.M0(this.anchors);
        if (fM0 != null) {
            return fM0.floatValue();
        }
        return Float.NaN;
    }

    public T g(int index) {
        return (T) CollectionsKt.v0(this.keys, index);
    }

    /* renamed from: h, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    public float i(int index) {
        float[] fArr = this.anchors;
        return (index < 0 || index > ArraysKt.j0(fArr)) ? ((Number) a.f48356b.invoke(Integer.valueOf(index))).floatValue() : fArr[index];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(g(i10));
            sb3.append('=');
            sb3.append(i(i10));
            sb2.append(sb3.toString());
            if (i10 < getSize() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("})");
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends T> list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        list.size();
        int length = fArr.length;
        this.size = fArr.length;
    }
}
