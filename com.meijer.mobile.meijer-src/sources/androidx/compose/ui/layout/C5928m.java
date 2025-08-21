package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/layout/m;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/r;", "measurable", "Landroidx/compose/ui/layout/t;", "minMax", "Landroidx/compose/ui/layout/u;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/r;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/u;)V", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "height", "d0", "(I)I", "j0", "width", "W", "A", "a", "Landroidx/compose/ui/layout/r;", "getMeasurable", "()Landroidx/compose/ui/layout/r;", "b", "Landroidx/compose/ui/layout/t;", "c", "Landroidx/compose/ui/layout/u;", "", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5928m implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r measurable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC5934t minMax;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC5935u widthHeight;

    @Override // androidx.compose.ui.layout.r
    public int A(int width) {
        return this.measurable.A(width);
    }

    @Override // androidx.compose.ui.layout.r
    public int W(int width) {
        return this.measurable.W(width);
    }

    @Override // androidx.compose.ui.layout.r
    public Object a() {
        return this.measurable.a();
    }

    @Override // androidx.compose.ui.layout.r
    public int d0(int height) {
        return this.measurable.d0(height);
    }

    @Override // androidx.compose.ui.layout.r
    public int j0(int height) {
        return this.measurable.j0(height);
    }

    @Override // androidx.compose.ui.layout.I
    public f0 k0(long constraints) {
        if (this.widthHeight == EnumC5935u.f51371a) {
            return new C5931p(this.minMax == EnumC5934t.f51368b ? this.measurable.j0(H1.b.k(constraints)) : this.measurable.d0(H1.b.k(constraints)), H1.b.g(constraints) ? H1.b.k(constraints) : 32767);
        }
        return new C5931p(H1.b.h(constraints) ? H1.b.l(constraints) : 32767, this.minMax == EnumC5934t.f51368b ? this.measurable.A(H1.b.l(constraints)) : this.measurable.W(H1.b.l(constraints)));
    }

    public C5928m(r rVar, EnumC5934t enumC5934t, EnumC5935u enumC5935u) {
        this.measurable = rVar;
        this.minMax = enumC5934t;
        this.widthHeight = enumC5935u;
    }
}
