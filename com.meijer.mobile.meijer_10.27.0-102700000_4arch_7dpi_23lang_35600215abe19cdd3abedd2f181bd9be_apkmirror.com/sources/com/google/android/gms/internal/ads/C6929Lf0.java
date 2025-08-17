package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6929Lf0 extends AbstractC7132Rf0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9088pf0 f68417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6929Lf0(C6962Mf0 c6962Mf0, C7200Tf0 c7200Tf0, CharSequence charSequence, C9088pf0 c9088pf0) {
        super(c7200Tf0, charSequence);
        this.f68417f = c9088pf0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7132Rf0
    public final int d(int i10) {
        return ((C9515tf0) this.f68417f).f78608a.end();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7132Rf0
    public final int e(int i10) {
        if (((C9515tf0) this.f68417f).f78608a.find(i10)) {
            return ((C9515tf0) this.f68417f).f78608a.start();
        }
        return -1;
    }
}
