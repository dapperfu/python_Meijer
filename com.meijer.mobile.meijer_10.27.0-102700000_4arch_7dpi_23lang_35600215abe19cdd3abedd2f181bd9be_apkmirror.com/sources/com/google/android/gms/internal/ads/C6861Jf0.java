package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6861Jf0 extends AbstractC7132Rf0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC8981of0 f67950f;

    @Override // com.google.android.gms.internal.ads.AbstractC7132Rf0
    final int d(int i10) {
        return i10 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6861Jf0(C6895Kf0 c6895Kf0, C7200Tf0 c7200Tf0, CharSequence charSequence, AbstractC8981of0 abstractC8981of0) {
        super(c7200Tf0, charSequence);
        this.f67950f = abstractC8981of0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7132Rf0
    final int e(int i10) {
        CharSequence charSequence = this.f69915c;
        int length = charSequence.length();
        C6657Df0.b(i10, length, "index");
        while (i10 < length) {
            if (this.f67950f.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
