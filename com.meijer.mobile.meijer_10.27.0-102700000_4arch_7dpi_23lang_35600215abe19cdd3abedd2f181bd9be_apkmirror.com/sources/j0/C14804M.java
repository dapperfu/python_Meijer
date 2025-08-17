package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj0/M;", "Lj0/O;", "first", "second", "<init>", "(Lj0/O;Lj0/O;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lj0/O;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14804M implements InterfaceC14806O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O second;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14804M)) {
            return false;
        }
        C14804M c14804m = (C14804M) other;
        return Intrinsics.e(c14804m.first, this.first) && Intrinsics.e(c14804m.second, this.second);
    }

    @Override // j0.InterfaceC14806O
    public int a(H1.d density, H1.t layoutDirection) {
        return Math.max(this.first.a(density, layoutDirection), this.second.a(density, layoutDirection));
    }

    @Override // j0.InterfaceC14806O
    public int b(H1.d density) {
        return Math.max(this.first.b(density), this.second.b(density));
    }

    @Override // j0.InterfaceC14806O
    public int c(H1.d density, H1.t layoutDirection) {
        return Math.max(this.first.c(density, layoutDirection), this.second.c(density, layoutDirection));
    }

    @Override // j0.InterfaceC14806O
    public int d(H1.d density) {
        return Math.max(this.first.d(density), this.second.d(density));
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.first + " ∪ " + this.second + ')';
    }

    public C14804M(InterfaceC14806O interfaceC14806O, InterfaceC14806O interfaceC14806O2) {
        this.first = interfaceC14806O;
        this.second = interfaceC14806O2;
    }
}
