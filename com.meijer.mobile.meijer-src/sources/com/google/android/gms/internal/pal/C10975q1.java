package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10975q1 implements InterfaceC10765d1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10815g1 f84124a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84125b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f84126c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84127d;

    final String a() {
        return this.f84125b;
    }

    final Object[] b() {
        return this.f84126c;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10765d1
    public final InterfaceC10815g1 zza() {
        return this.f84124a;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10765d1
    public final boolean zzb() {
        return (this.f84127d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10765d1
    public final int zzc() {
        return (this.f84127d & 1) == 1 ? 1 : 2;
    }

    C10975q1(InterfaceC10815g1 interfaceC10815g1, String str, Object[] objArr) {
        this.f84124a = interfaceC10815g1;
        this.f84125b = str;
        this.f84126c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f84127d = cCharAt;
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
                this.f84127d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
