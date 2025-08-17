package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;

/* loaded from: classes6.dex */
public final class KM implements InterfaceC10118zD, PC, InterfaceC7659cC, InterfaceC9581uC, InterfaceC4098a, PE {

    /* renamed from: a, reason: collision with root package name */
    private final C7392Zc f68082a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68083b = false;

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void q(boolean z10) {
        this.f68082a.c(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void s0(boolean z10) {
        this.f68082a.c(true != z10 ? 1108 : 1107);
    }

    @Override // Mc.InterfaceC4098a
    public final synchronized void v() {
        if (this.f68083b) {
            this.f68082a.c(8);
        } else {
            this.f68082a.c(7);
            this.f68083b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final synchronized void zzr() {
        this.f68082a.c(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(final C8608l60 c8608l60) {
        this.f68082a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.GM
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                C8336id c8336idH = c6824Ie.E().H();
                C9833we c9833weH = c6824Ie.E().d0().H();
                c9833weH.u(c8608l60.f75749b.f75337b.f73103b);
                c8336idH.v(c9833weH);
                c6824Ie.u(c8336idH);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(Mc.W0 w02) {
        switch (w02.f19159a) {
            case 1:
                this.f68082a.c(101);
                break;
            case 2:
                this.f68082a.c(102);
                break;
            case 3:
                this.f68082a.c(5);
                break;
            case 4:
                this.f68082a.c(103);
                break;
            case 5:
                this.f68082a.c(104);
                break;
            case 6:
                this.f68082a.c(105);
                break;
            case 7:
                this.f68082a.c(106);
                break;
            default:
                this.f68082a.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void j(final C7804de c7804de) {
        this.f68082a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.IM
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                c6824Ie.v(c7804de);
            }
        });
        this.f68082a.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void s(final C7804de c7804de) {
        this.f68082a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.HM
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                c6824Ie.v(c7804de);
            }
        });
        this.f68082a.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void x0(final C7804de c7804de) {
        this.f68082a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.JM
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                c6824Ie.v(c7804de);
            }
        });
        this.f68082a.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void zzh() {
        this.f68082a.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        this.f68082a.c(3);
    }

    public KM(C7392Zc c7392Zc, R40 r40) {
        this.f68082a = c7392Zc;
        c7392Zc.c(2);
        if (r40 != null) {
            c7392Zc.c(1101);
        }
    }
}
