package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11066vd extends C11101y0 implements InterfaceC10831h1 {
    private C11066vd() {
        super(C11082wd.zzb);
    }

    /* synthetic */ C11066vd(C11050ud c11050ud) {
        super(C11082wd.zzb);
    }

    public final C11066vd m(String str) {
        if (this.f85059c) {
            l();
            this.f85059c = false;
        }
        C11082wd.z((C11082wd) this.f85058b, str);
        return this;
    }

    public final C11066vd n(AbstractC10730b0 abstractC10730b0) {
        if (this.f85059c) {
            l();
            this.f85059c = false;
        }
        ((C11082wd) this.f85058b).zzf = abstractC10730b0;
        return this;
    }

    public final C11066vd o(int i10) {
        if (this.f85059c) {
            l();
            this.f85059c = false;
        }
        ((C11082wd) this.f85058b).zzg = Yd.a(i10);
        return this;
    }
}
