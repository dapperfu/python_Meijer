package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.pc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10845pc extends B0 implements InterfaceC10706h1 {
    private static final C10845pc zzb;

    public static C10845pc u() {
        return zzb;
    }

    static {
        C10845pc c10845pc = new C10845pc();
        zzb = c10845pc;
        B0.j(C10845pc.class, c10845pc);
    }

    public static C10845pc v(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10845pc) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        C10813nc c10813nc = null;
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new C10845pc();
        }
        if (i11 == 4) {
            return new C10829oc(c10813nc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10845pc() {
    }
}
