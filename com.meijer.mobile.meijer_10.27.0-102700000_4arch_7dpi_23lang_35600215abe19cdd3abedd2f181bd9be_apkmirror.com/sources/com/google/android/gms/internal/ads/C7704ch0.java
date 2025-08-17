package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ch0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7704ch0 extends AbstractC7702cg0 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7917eh0 f73224c;

    @Override // com.google.android.gms.internal.ads.AbstractC7702cg0
    protected final Object a(int i10) {
        return this.f73224c.get(i10);
    }

    C7704ch0(AbstractC7917eh0 abstractC7917eh0, int i10) {
        super(abstractC7917eh0.size(), i10);
        this.f73224c = abstractC7917eh0;
    }
}
