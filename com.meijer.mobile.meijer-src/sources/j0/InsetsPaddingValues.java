package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lj0/u;", "Lj0/C;", "Lj0/O;", "insets", "LH1/d;", "density", "<init>", "(Lj0/O;LH1/d;)V", "LH1/t;", "layoutDirection", "LH1/h;", "b", "(LH1/t;)F", "d", "()F", "c", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lj0/O;", "getInsets", "()Lj0/O;", "LH1/d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.u, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final class InsetsPaddingValues implements InterfaceC14882C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC14894O insets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final H1.d density;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return Intrinsics.e(this.insets, insetsPaddingValues.insets) && Intrinsics.e(this.density, insetsPaddingValues.density);
    }

    @Override // j0.InterfaceC14882C
    /* renamed from: a */
    public float getBottom() {
        H1.d dVar = this.density;
        return dVar.K(this.insets.d(dVar));
    }

    @Override // j0.InterfaceC14882C
    public float b(H1.t layoutDirection) {
        H1.d dVar = this.density;
        return dVar.K(this.insets.c(dVar, layoutDirection));
    }

    @Override // j0.InterfaceC14882C
    public float c(H1.t layoutDirection) {
        H1.d dVar = this.density;
        return dVar.K(this.insets.a(dVar, layoutDirection));
    }

    @Override // j0.InterfaceC14882C
    /* renamed from: d */
    public float getTop() {
        H1.d dVar = this.density;
        return dVar.K(this.insets.b(dVar));
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }

    public InsetsPaddingValues(InterfaceC14894O interfaceC14894O, H1.d dVar) {
        this.insets = interfaceC14894O;
        this.density = dVar;
    }
}
