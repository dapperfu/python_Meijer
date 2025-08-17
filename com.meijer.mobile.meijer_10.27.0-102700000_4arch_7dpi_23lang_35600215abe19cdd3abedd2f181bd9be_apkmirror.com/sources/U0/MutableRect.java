package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\bJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b!\u0010\u001cR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LU0/d;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "LU0/f;", "offset", "", "m", "(J)V", "translateX", "translateY", "l", "(FF)V", "e", "g", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "i", "(F)V", "d", "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: U0.d, reason: from toString */
/* loaded from: classes.dex */
public final class MutableRect {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: c, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: d, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void e(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean f() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final void g(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void h(float f10) {
        this.bottom = f10;
    }

    public final void i(float f10) {
        this.left = f10;
    }

    public final void j(float f10) {
        this.right = f10;
    }

    public final void k(float f10) {
        this.top = f10;
    }

    public final void l(float translateX, float translateY) {
        this.left += translateX;
        this.top += translateY;
        this.right += translateX;
        this.bottom += translateY;
    }

    public final void m(long offset) {
        l(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1) + ')';
    }

    public MutableRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }
}
