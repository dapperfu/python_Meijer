package com.google.android.gms.internal.ads;

import Mc.AbstractBinderC4108d0;
import Mc.InterfaceC4105c0;
import java.util.List;

/* loaded from: classes6.dex */
public final class Z90 extends AbstractBinderC4108d0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8650la0 f72091a;

    @Override // Mc.InterfaceC4111e0
    public final boolean S(String str) {
        return this.f72091a.k(str);
    }

    @Override // Mc.InterfaceC4111e0
    public final void S7(List list, InterfaceC4105c0 interfaceC4105c0) {
        this.f72091a.j(list, interfaceC4105c0);
    }

    @Override // Mc.InterfaceC4111e0
    public final boolean W(String str) {
        return this.f72091a.l(str);
    }

    @Override // Mc.InterfaceC4111e0
    public final void Z4(InterfaceC6631Cl interfaceC6631Cl) {
        this.f72091a.i(interfaceC6631Cl);
        this.f72091a.h();
    }

    @Override // Mc.InterfaceC4111e0
    public final InterfaceC9401sc a(String str) {
        return this.f72091a.a(str);
    }

    @Override // Mc.InterfaceC4111e0
    public final Mc.V i(String str) {
        return this.f72091a.b(str);
    }

    @Override // Mc.InterfaceC4111e0
    public final InterfaceC7719cp s(String str) {
        return this.f72091a.c(str);
    }

    @Override // Mc.InterfaceC4111e0
    public final boolean x(String str) {
        return this.f72091a.m(str);
    }

    Z90(C8650la0 c8650la0) {
        this.f72091a = c8650la0;
    }
}
