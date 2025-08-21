package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10378s extends AbstractC10384u {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10381t f81875g;

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10384u
    final int d(int i10) {
        return i10 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10378s(C10381t c10381t, C10387v c10387v, CharSequence charSequence) {
        super(c10387v, charSequence);
        this.f81875g = c10381t;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10384u
    final int e(int i10) {
        CharSequence charSequence = this.f81900c;
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
