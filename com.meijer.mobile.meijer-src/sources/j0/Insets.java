package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lj0/m;", "Lj0/O;", "LH1/h;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "e", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.m, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final class Insets implements InterfaceC14894O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float right;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    public /* synthetic */ Insets(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) other;
        return H1.h.u(this.left, insets.left) && H1.h.u(this.top, insets.top) && H1.h.u(this.right, insets.right) && H1.h.u(this.bottom, insets.bottom);
    }

    private Insets(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    @Override // j0.InterfaceC14894O
    public int a(H1.d density, H1.t layoutDirection) {
        return density.E0(this.right);
    }

    @Override // j0.InterfaceC14894O
    public int b(H1.d density) {
        return density.E0(this.top);
    }

    @Override // j0.InterfaceC14894O
    public int c(H1.d density, H1.t layoutDirection) {
        return density.E0(this.left);
    }

    @Override // j0.InterfaceC14894O
    public int d(H1.d density) {
        return density.E0(this.bottom);
    }

    public int hashCode() {
        return (((((H1.h.w(this.left) * 31) + H1.h.w(this.top)) * 31) + H1.h.w(this.right)) * 31) + H1.h.w(this.bottom);
    }

    public String toString() {
        return "Insets(left=" + ((Object) H1.h.z(this.left)) + ", top=" + ((Object) H1.h.z(this.top)) + ", right=" + ((Object) H1.h.z(this.right)) + ", bottom=" + ((Object) H1.h.z(this.bottom)) + ')';
    }
}
