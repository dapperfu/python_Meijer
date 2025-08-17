package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
public enum Y1 implements InterfaceC10302i0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);


    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC10305j0<Y1> f81313g = new InterfaceC10305j0<Y1>() { // from class: com.google.android.gms.internal.clearcut.c2
        @Override // com.google.android.gms.internal.clearcut.InterfaceC10305j0
        public final /* synthetic */ InterfaceC10302i0 zzb(int i10) {
            return Y1.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f81315a;

    Y1(int i10) {
        this.f81315a = i10;
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

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10302i0
    public final int zzc() {
        return this.f81315a;
    }
}
