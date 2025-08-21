package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
public enum Y1 implements InterfaceC10427i0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);


    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC10430j0<Y1> f82153g = new InterfaceC10430j0<Y1>() { // from class: com.google.android.gms.internal.clearcut.c2
        @Override // com.google.android.gms.internal.clearcut.InterfaceC10430j0
        public final /* synthetic */ InterfaceC10427i0 zzb(int i10) {
            return Y1.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f82155a;

    Y1(int i10) {
        this.f82155a = i10;
    }

    public static Y1 a(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10427i0
    public final int zzc() {
        return this.f82155a;
    }
}
