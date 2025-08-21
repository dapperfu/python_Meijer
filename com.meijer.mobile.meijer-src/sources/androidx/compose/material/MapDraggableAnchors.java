package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC17986a0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010\"\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"Landroidx/compose/material/c;", "T", "Lx0/a0;", "", "", "anchors", "<init>", "(Ljava/util/Map;)V", "value", "c", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "b", "(F)Ljava/lang/Object;", "searchUpwards", "a", "(FZ)Ljava/lang/Object;", "e", "()F", "f", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getSize", "size", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.c, reason: from toString */
/* loaded from: classes.dex */
public final class MapDraggableAnchors<T> implements InterfaceC17986a0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<T, Float> anchors;

    @Override // kotlin.InterfaceC17986a0
    public T a(float position, boolean searchUpwards) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f10 = searchUpwards ? fFloatValue - position : position - fFloatValue;
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f11 = searchUpwards ? fFloatValue2 - position : position - fFloatValue2;
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // kotlin.InterfaceC17986a0
    public T b(float position) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(position - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(position - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // kotlin.InterfaceC17986a0
    public float c(T value) {
        Float f10 = this.anchors.get(value);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.InterfaceC17986a0
    public boolean d(T value) {
        return this.anchors.containsKey(value);
    }

    @Override // kotlin.InterfaceC17986a0
    public float e() {
        Float fK0 = CollectionsKt.K0(this.anchors.values());
        if (fK0 != null) {
            return fK0.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MapDraggableAnchors) {
            return Intrinsics.e(this.anchors, ((MapDraggableAnchors) other).anchors);
        }
        return false;
    }

    @Override // kotlin.InterfaceC17986a0
    public float f() {
        Float fI0 = CollectionsKt.I0(this.anchors.values());
        if (fI0 != null) {
            return fI0.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.InterfaceC17986a0
    public int getSize() {
        return this.anchors.size();
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    public MapDraggableAnchors(Map<T, Float> map) {
        this.anchors = map;
    }
}
