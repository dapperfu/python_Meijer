package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Av0 implements InterfaceC8924mv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9245pv0 f66202a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66203b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f66204c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66205d;

    final String a() {
        return this.f66203b;
    }

    final Object[] b() {
        return this.f66204c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8924mv0
    public final InterfaceC9245pv0 zza() {
        return this.f66202a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8924mv0
    public final boolean zzb() {
        return (this.f66205d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8924mv0
    public final int zzc() {
        int i10 = this.f66205d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    Av0(InterfaceC9245pv0 interfaceC9245pv0, String str, Object[] objArr) {
        this.f66202a = interfaceC9245pv0;
        this.f66203b = str;
        this.f66204c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f66205d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.f66205d = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
