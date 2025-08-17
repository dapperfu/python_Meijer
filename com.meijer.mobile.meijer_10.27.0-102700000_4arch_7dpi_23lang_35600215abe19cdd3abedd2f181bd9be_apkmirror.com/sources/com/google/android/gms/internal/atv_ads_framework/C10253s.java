package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10253s extends AbstractC10259u {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10256t f81035g;

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10259u
    final int d(int i10) {
        return i10 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10253s(C10256t c10256t, C10262v c10262v, CharSequence charSequence) {
        super(c10262v, charSequence);
        this.f81035g = c10256t;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10259u
    final int e(int i10) {
        CharSequence charSequence = this.f81060c;
        int length = charSequence.length();
        r.b(i10, length, "index");
        while (i10 < length) {
            if (charSequence.charAt(i10) == ':') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
