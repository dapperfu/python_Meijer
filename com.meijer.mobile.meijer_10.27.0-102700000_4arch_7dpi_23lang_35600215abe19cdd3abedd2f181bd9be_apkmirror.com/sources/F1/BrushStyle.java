package F1;

import V0.AbstractC5324i0;
import V0.C5346q0;
import V0.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"LF1/c;", "LF1/n;", "LV0/z1;", "value", "", "alpha", "<init>", "(LV0/z1;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LV0/z1;", "e", "()LV0/z1;", "c", "F", "a", "()F", "LV0/q0;", "()J", "color", "LV0/i0;", "getBrush", "()LV0/i0;", "brush", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: F1.c, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class BrushStyle implements n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final z1 value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return Intrinsics.e(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // F1.n
    /* renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // F1.n
    /* renamed from: b */
    public long getValue() {
        return C5346q0.INSTANCE.j();
    }

    /* renamed from: e, reason: from getter */
    public final z1 getValue() {
        return this.value;
    }

    @Override // F1.n
    public AbstractC5324i0 getBrush() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }

    public BrushStyle(z1 z1Var, float f10) {
        this.value = z1Var;
        this.alpha = f10;
    }
}
