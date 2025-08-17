package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10850q1 implements InterfaceC10640d1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10690g1 f83284a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83285b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f83286c;

    /* renamed from: d, reason: collision with root package name */
    private final int f83287d;

    final String a() {
        return this.f83285b;
    }

    final Object[] b() {
        return this.f83286c;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10640d1
    public final InterfaceC10690g1 zza() {
        return this.f83284a;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10640d1
    public final boolean zzb() {
        return (this.f83287d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10640d1
    public final int zzc() {
        return (this.f83287d & 1) == 1 ? 1 : 2;
    }

    C10850q1(InterfaceC10690g1 interfaceC10690g1, String str, Object[] objArr) {
        this.f83284a = interfaceC10690g1;
        this.f83285b = str;
        this.f83286c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f83287d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f83287d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
