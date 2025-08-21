package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.pc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10970pc extends B0 implements InterfaceC10831h1 {
    private static final C10970pc zzb;

    public static C10970pc u() {
        return zzb;
    }

    static {
        C10970pc c10970pc = new C10970pc();
        zzb = c10970pc;
        B0.j(C10970pc.class, c10970pc);
    }

    public static C10970pc v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10970pc) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        C10938nc c10938nc = null;
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new C10970pc();
        }
        if (i11 == 4) {
            return new C10954oc(c10938nc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10970pc() {
    }
}
