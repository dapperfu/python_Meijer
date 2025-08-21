package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;

/* loaded from: classes6.dex */
public final class KM implements InterfaceC10243zD, PC, InterfaceC7784cC, InterfaceC9706uC, InterfaceC4376a, PE {

    /* renamed from: a, reason: collision with root package name */
    private final C7517Zc f68922a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68923b = false;

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void q(boolean z10) {
        this.f68922a.c(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void t0(boolean z10) {
        this.f68922a.c(true != z10 ? 1108 : 1107);
    }

    @Override // Oc.InterfaceC4376a
    public final synchronized void v() {
        if (this.f68923b) {
            this.f68922a.c(8);
        } else {
            this.f68922a.c(7);
            this.f68923b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final synchronized void zzr() {
        this.f68922a.c(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(Oc.W0 w02) {
        switch (w02.f23346a) {
            case 1:
                this.f68922a.c(101);
                break;
            case 2:
                this.f68922a.c(102);
                break;
            case 3:
                this.f68922a.c(5);
                break;
            case 4:
                this.f68922a.c(103);
                break;
            case 5:
                this.f68922a.c(104);
                break;
            case 6:
                this.f68922a.c(105);
                break;
            case 7:
                this.f68922a.c(106);
                break;
            default:
                this.f68922a.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void j(final C7929de c7929de) {
        this.f68922a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.IM
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                c6949Ie.v(c7929de);
            }
        });
        this.f68922a.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void s(final C7929de c7929de) {
        this.f68922a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.HM
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                c6949Ie.v(c7929de);
            }
        });
        this.f68922a.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void w0(final C7929de c7929de) {
        this.f68922a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.JM
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                c6949Ie.v(c7929de);
            }
        });
        this.f68922a.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(final C8733l60 c8733l60) {
        this.f68922a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.GM
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                C8461id c8461idH = c6949Ie.E().H();
                C9958we c9958weH = c6949Ie.E().d0().H();
                c9958weH.u(c8733l60.f76589b.f76177b.f73943b);
                c8461idH.v(c9958weH);
                c6949Ie.u(c8461idH);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void zzh() {
        this.f68922a.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        this.f68922a.c(3);
    }

    public KM(C7517Zc c7517Zc, R40 r40) {
        this.f68922a = c7517Zc;
        c7517Zc.c(2);
        if (r40 != null) {
            c7517Zc.c(1101);
        }
    }
}
