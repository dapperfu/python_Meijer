package androidx.compose.ui.text;

import V0.AbstractC5467i0;
import V0.D1;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u000e\u0010\"R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b\u0019\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LV0/D1;", "a", "LV0/D1;", "e", "()LV0/D1;", "shape", "LH1/v;", "b", "J", "f", "()J", "size", "c", "d", "padding", "LV0/i0;", "LV0/i0;", "()LV0/i0;", "brush", "", "F", "()F", "alpha", "LX0/g;", "LX0/g;", "()LX0/g;", "drawStyle", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.d, reason: from toString */
/* loaded from: classes.dex */
public final class Bullet implements AnnotatedString.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final D1 shape;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long padding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5467i0 brush;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final X0.g drawStyle;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Bullet)) {
            Bullet bullet = (Bullet) other;
            return Intrinsics.e(this.shape, bullet.shape) && H1.v.e(this.size, bullet.size) && H1.v.e(this.padding, bullet.padding) && Intrinsics.e(this.brush, bullet.brush) && this.alpha == bullet.alpha && Intrinsics.e(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    /* renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5467i0 getBrush() {
        return this.brush;
    }

    /* renamed from: c, reason: from getter */
    public final X0.g getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: d, reason: from getter */
    public final long getPadding() {
        return this.padding;
    }

    /* renamed from: e, reason: from getter */
    public final D1 getShape() {
        return this.shape;
    }

    /* renamed from: f, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((this.shape.hashCode() * 31) + H1.v.i(this.size)) * 31) + H1.v.i(this.padding)) * 31;
        AbstractC5467i0 abstractC5467i0 = this.brush;
        return ((((iHashCode + (abstractC5467i0 != null ? abstractC5467i0.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) H1.v.j(this.size)) + ", padding=" + ((Object) H1.v.j(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }
}
