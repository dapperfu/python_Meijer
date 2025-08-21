package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.util.Size;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class K implements InterfaceC13395o {

    /* renamed from: b, reason: collision with root package name */
    public int f124303b;

    /* renamed from: c, reason: collision with root package name */
    public int f124304c;

    /* renamed from: a, reason: collision with root package name */
    public EnumC13390j f124302a = EnumC13390j.f124349b;

    /* renamed from: d, reason: collision with root package name */
    public EnumC13396p f124305d = EnumC13396p.f124357a;

    /* renamed from: e, reason: collision with root package name */
    public Size f124306e = new Size(0, 0);

    public final L a(O indicatorData, P popoverSizes) {
        Function2 a10;
        Intrinsics.j(indicatorData, "indicatorData");
        Intrinsics.j(popoverSizes, "popoverSizes");
        int i10 = indicatorData.f124328b;
        Lazy lazy = O.f124325e;
        boolean z10 = i10 > popoverSizes.f124332b.getHeight() + (((Number) lazy.getValue()).intValue() + indicatorData.f124330d);
        boolean z11 = indicatorData.f124328b < this.f124306e.getHeight() - (popoverSizes.f124332b.getHeight() + (((Number) lazy.getValue()).intValue() + indicatorData.f124330d));
        boolean z12 = (indicatorData.f124327a > Q.b(popoverSizes.f124332b)) && (indicatorData.f124327a < this.f124306e.getWidth() - Q.b(popoverSizes.f124332b));
        boolean z13 = indicatorData.f124327a > (popoverSizes.f124331a.getWidth() + ((Number) lazy.getValue()).intValue()) + indicatorData.f124329c;
        boolean z14 = indicatorData.f124327a < this.f124306e.getWidth() - ((popoverSizes.f124331a.getWidth() + ((Number) lazy.getValue()).intValue()) + indicatorData.f124329c);
        boolean z15 = (indicatorData.f124328b > Q.a(popoverSizes.f124331a)) && (indicatorData.f124328b < this.f124306e.getHeight() - Q.a(popoverSizes.f124331a));
        boolean z16 = z10 && z12;
        boolean z17 = z11 && z12;
        boolean z18 = z13 && z15;
        boolean z19 = z14 && z15;
        int iOrdinal = this.f124305d.ordinal();
        if (iOrdinal == 0) {
            a10 = z17 ? new A(this) : z16 ? new C(this) : z19 ? new D(this) : z18 ? new E(this) : new F(this);
        } else if (iOrdinal == 1) {
            a10 = z16 ? new G(this) : z17 ? new H(this) : z19 ? new I(this) : z18 ? new J(this) : new C13397q(this);
        } else if (iOrdinal == 2) {
            a10 = z17 ? new r(this) : z16 ? new s(this) : z18 ? new t(this) : z19 ? new u(this) : new v(this);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a10 = z17 ? new w(this) : z16 ? new x(this) : z19 ? new y(this) : z18 ? new z(this) : new B(this);
        }
        a10.invoke(indicatorData, popoverSizes);
        EnumC13390j enumC13390j = this.f124302a;
        int i11 = this.f124303b;
        int i12 = this.f124304c;
        int i13 = indicatorData.f124327a;
        int i14 = indicatorData.f124328b;
        int i15 = indicatorData.f124329c;
        int i16 = indicatorData.f124330d;
        return new L(enumC13390j, i11, i12, i13 + i15 < 0 || i14 + i16 < 0 || i13 - i15 > this.f124306e.getWidth() || i14 - i16 > this.f124306e.getHeight());
    }

    public static final void b(K k10, O o10, P p10) {
        k10.getClass();
        k10.f124302a = EnumC13390j.f124348a;
        k10.f124303b = o10.f124327a + o10.f124329c;
        k10.f124304c = o10.f124328b - Q.a(p10.f124331a);
        k10.f124305d = EnumC13396p.f124360d;
    }

    public static final void c(K k10, O o10, P p10) {
        k10.getClass();
        k10.f124302a = EnumC13390j.f124349b;
        k10.f124303b = o10.f124327a - Q.b(p10.f124332b);
        k10.f124304c = (o10.f124328b - o10.f124330d) - p10.f124332b.getHeight();
        k10.f124305d = EnumC13396p.f124358b;
    }

    public static final void d(K k10, O o10, P p10) {
        k10.getClass();
        k10.f124302a = EnumC13390j.f124349b;
        k10.f124303b = o10.f124327a - Q.b(p10.f124332b);
        k10.f124304c = o10.f124328b + o10.f124330d;
        k10.f124305d = EnumC13396p.f124357a;
    }

    public static final void a(K k10, O o10, P p10) {
        k10.getClass();
        k10.f124302a = EnumC13390j.f124348a;
        k10.f124303b = (o10.f124327a - o10.f124329c) - p10.f124331a.getWidth();
        k10.f124304c = o10.f124328b - Q.a(p10.f124331a);
        k10.f124305d = EnumC13396p.f124359c;
    }
}
