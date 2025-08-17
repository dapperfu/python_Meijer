package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.util.Size;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class K implements InterfaceC13262o {

    /* renamed from: b, reason: collision with root package name */
    public int f123351b;

    /* renamed from: c, reason: collision with root package name */
    public int f123352c;

    /* renamed from: a, reason: collision with root package name */
    public EnumC13257j f123350a = EnumC13257j.f123397b;

    /* renamed from: d, reason: collision with root package name */
    public EnumC13263p f123353d = EnumC13263p.f123405a;

    /* renamed from: e, reason: collision with root package name */
    public Size f123354e = new Size(0, 0);

    public final L a(O indicatorData, P popoverSizes) {
        Function2 a10;
        Intrinsics.j(indicatorData, "indicatorData");
        Intrinsics.j(popoverSizes, "popoverSizes");
        int i10 = indicatorData.f123376b;
        Lazy lazy = O.f123373e;
        boolean z10 = i10 > popoverSizes.f123380b.getHeight() + (((Number) lazy.getValue()).intValue() + indicatorData.f123378d);
        boolean z11 = indicatorData.f123376b < this.f123354e.getHeight() - (popoverSizes.f123380b.getHeight() + (((Number) lazy.getValue()).intValue() + indicatorData.f123378d));
        boolean z12 = (indicatorData.f123375a > Q.b(popoverSizes.f123380b)) && (indicatorData.f123375a < this.f123354e.getWidth() - Q.b(popoverSizes.f123380b));
        boolean z13 = indicatorData.f123375a > (popoverSizes.f123379a.getWidth() + ((Number) lazy.getValue()).intValue()) + indicatorData.f123377c;
        boolean z14 = indicatorData.f123375a < this.f123354e.getWidth() - ((popoverSizes.f123379a.getWidth() + ((Number) lazy.getValue()).intValue()) + indicatorData.f123377c);
        boolean z15 = (indicatorData.f123376b > Q.a(popoverSizes.f123379a)) && (indicatorData.f123376b < this.f123354e.getHeight() - Q.a(popoverSizes.f123379a));
        boolean z16 = z10 && z12;
        boolean z17 = z11 && z12;
        boolean z18 = z13 && z15;
        boolean z19 = z14 && z15;
        int iOrdinal = this.f123353d.ordinal();
        if (iOrdinal == 0) {
            a10 = z17 ? new A(this) : z16 ? new C(this) : z19 ? new D(this) : z18 ? new E(this) : new F(this);
        } else if (iOrdinal == 1) {
            a10 = z16 ? new G(this) : z17 ? new H(this) : z19 ? new I(this) : z18 ? new J(this) : new C13264q(this);
        } else if (iOrdinal == 2) {
            a10 = z17 ? new r(this) : z16 ? new s(this) : z18 ? new t(this) : z19 ? new u(this) : new v(this);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a10 = z17 ? new w(this) : z16 ? new x(this) : z19 ? new y(this) : z18 ? new z(this) : new B(this);
        }
        a10.invoke(indicatorData, popoverSizes);
        EnumC13257j enumC13257j = this.f123350a;
        int i11 = this.f123351b;
        int i12 = this.f123352c;
        int i13 = indicatorData.f123375a;
        int i14 = indicatorData.f123376b;
        int i15 = indicatorData.f123377c;
        int i16 = indicatorData.f123378d;
        return new L(enumC13257j, i11, i12, i13 + i15 < 0 || i14 + i16 < 0 || i13 - i15 > this.f123354e.getWidth() || i14 - i16 > this.f123354e.getHeight());
    }

    public static final void b(K k10, O o10, P p10) {
        k10.getClass();
        k10.f123350a = EnumC13257j.f123396a;
        k10.f123351b = o10.f123375a + o10.f123377c;
        k10.f123352c = o10.f123376b - Q.a(p10.f123379a);
        k10.f123353d = EnumC13263p.f123408d;
    }

    public static final void c(K k10, O o10, P p10) {
        k10.getClass();
        k10.f123350a = EnumC13257j.f123397b;
        k10.f123351b = o10.f123375a - Q.b(p10.f123380b);
        k10.f123352c = (o10.f123376b - o10.f123378d) - p10.f123380b.getHeight();
        k10.f123353d = EnumC13263p.f123406b;
    }

    public static final void d(K k10, O o10, P p10) {
        k10.getClass();
        k10.f123350a = EnumC13257j.f123397b;
        k10.f123351b = o10.f123375a - Q.b(p10.f123380b);
        k10.f123352c = o10.f123376b + o10.f123378d;
        k10.f123353d = EnumC13263p.f123405a;
    }

    public static final void a(K k10, O o10, P p10) {
        k10.getClass();
        k10.f123350a = EnumC13257j.f123396a;
        k10.f123351b = (o10.f123375a - o10.f123377c) - p10.f123379a.getWidth();
        k10.f123352c = o10.f123376b - Q.a(p10.f123379a);
        k10.f123353d = EnumC13263p.f123407c;
    }
}
