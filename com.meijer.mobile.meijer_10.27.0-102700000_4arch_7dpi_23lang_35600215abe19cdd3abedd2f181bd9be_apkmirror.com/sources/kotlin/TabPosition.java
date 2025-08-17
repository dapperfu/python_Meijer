package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lx0/B1;", "", "LH1/h;", "left", "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "()F", "b", "c", "right", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.B1, reason: from toString */
/* loaded from: classes.dex */
public final class TabPosition {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    public /* synthetic */ TabPosition(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) other;
        return H1.h.u(this.left, tabPosition.left) && H1.h.u(this.width, tabPosition.width);
    }

    private TabPosition(float f10, float f11) {
        this.left = f10;
        this.width = f11;
    }

    /* renamed from: a, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float b() {
        return H1.h.p(this.left + this.width);
    }

    /* renamed from: c, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (H1.h.w(this.left) * 31) + H1.h.w(this.width);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) H1.h.z(this.left)) + ", right=" + ((Object) H1.h.z(b())) + ", width=" + ((Object) H1.h.z(this.width)) + ')';
    }
}
