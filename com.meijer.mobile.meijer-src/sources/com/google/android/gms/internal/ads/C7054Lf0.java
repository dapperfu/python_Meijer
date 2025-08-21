package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7054Lf0 extends AbstractC7257Rf0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9213pf0 f69257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7054Lf0(C7087Mf0 c7087Mf0, C7325Tf0 c7325Tf0, CharSequence charSequence, C9213pf0 c9213pf0) {
        super(c7325Tf0, charSequence);
        this.f69257f = c9213pf0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7257Rf0
    public final int d(int i10) {
        return ((C9640tf0) this.f69257f).f79448a.end();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7257Rf0
    public final int e(int i10) {
        if (((C9640tf0) this.f69257f).f79448a.find(i10)) {
            return ((C9640tf0) this.f69257f).f79448a.start();
        }
        return -1;
    }
}
