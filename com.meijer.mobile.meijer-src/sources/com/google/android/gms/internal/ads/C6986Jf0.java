package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6986Jf0 extends AbstractC7257Rf0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9106of0 f68790f;

    @Override // com.google.android.gms.internal.ads.AbstractC7257Rf0
    final int d(int i10) {
        return i10 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6986Jf0(C7020Kf0 c7020Kf0, C7325Tf0 c7325Tf0, CharSequence charSequence, AbstractC9106of0 abstractC9106of0) {
        super(c7325Tf0, charSequence);
        this.f68790f = abstractC9106of0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7257Rf0
    final int e(int i10) {
        CharSequence charSequence = this.f70755c;
        int length = charSequence.length();
        C6782Df0.b(i10, length, "index");
        while (i10 < length) {
            if (this.f68790f.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
