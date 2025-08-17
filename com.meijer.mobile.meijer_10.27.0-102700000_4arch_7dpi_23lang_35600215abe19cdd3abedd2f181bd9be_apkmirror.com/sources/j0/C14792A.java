package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lj0/A;", "Lj0/O;", "insets", "Lj0/U;", "sides", "<init>", "(Lj0/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lj0/O;", "getInsets", "()Lj0/O;", "I", "getSides-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14792A implements InterfaceC14806O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O insets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    public /* synthetic */ C14792A(InterfaceC14806O interfaceC14806O, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14806O, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14792A)) {
            return false;
        }
        C14792A c14792a = (C14792A) other;
        return Intrinsics.e(this.insets, c14792a.insets) && U.h(this.sides, c14792a.sides);
    }

    private C14792A(InterfaceC14806O interfaceC14806O, int i10) {
        this.insets = interfaceC14806O;
        this.sides = i10;
    }

    @Override // j0.InterfaceC14806O
    public int a(H1.d density, H1.t layoutDirection) {
        if (U.i(this.sides, layoutDirection == H1.t.f12006a ? U.INSTANCE.c() : U.INSTANCE.d())) {
            return this.insets.a(density, layoutDirection);
        }
        return 0;
    }

    @Override // j0.InterfaceC14806O
    public int b(H1.d density) {
        if (U.i(this.sides, U.INSTANCE.f())) {
            return this.insets.b(density);
        }
        return 0;
    }

    @Override // j0.InterfaceC14806O
    public int c(H1.d density, H1.t layoutDirection) {
        if (U.i(this.sides, layoutDirection == H1.t.f12006a ? U.INSTANCE.a() : U.INSTANCE.b())) {
            return this.insets.c(density, layoutDirection);
        }
        return 0;
    }

    @Override // j0.InterfaceC14806O
    public int d(H1.d density) {
        if (U.i(this.sides, U.INSTANCE.e())) {
            return this.insets.d(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + U.j(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) U.l(this.sides)) + ')';
    }
}
