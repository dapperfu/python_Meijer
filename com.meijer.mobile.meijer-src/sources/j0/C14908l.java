package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj0/l;", "Lj0/O;", "included", "excluded", "<init>", "(Lj0/O;Lj0/O;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lj0/O;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14908l implements InterfaceC14894O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14894O included;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14894O excluded;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14908l)) {
            return false;
        }
        C14908l c14908l = (C14908l) other;
        return Intrinsics.e(c14908l.included, this.included) && Intrinsics.e(c14908l.excluded, this.excluded);
    }

    @Override // j0.InterfaceC14894O
    public int a(H1.d density, H1.t layoutDirection) {
        return RangesKt.f(this.included.a(density, layoutDirection) - this.excluded.a(density, layoutDirection), 0);
    }

    @Override // j0.InterfaceC14894O
    public int b(H1.d density) {
        return RangesKt.f(this.included.b(density) - this.excluded.b(density), 0);
    }

    @Override // j0.InterfaceC14894O
    public int c(H1.d density, H1.t layoutDirection) {
        return RangesKt.f(this.included.c(density, layoutDirection) - this.excluded.c(density, layoutDirection), 0);
    }

    @Override // j0.InterfaceC14894O
    public int d(H1.d density) {
        return RangesKt.f(this.included.d(density) - this.excluded.d(density), 0);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }

    public C14908l(InterfaceC14894O interfaceC14894O, InterfaceC14894O interfaceC14894O2) {
        this.included = interfaceC14894O;
        this.excluded = interfaceC14894O2;
    }
}
