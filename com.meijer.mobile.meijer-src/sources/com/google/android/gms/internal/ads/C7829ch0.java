package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ch0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7829ch0 extends AbstractC7827cg0 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8042eh0 f74064c;

    @Override // com.google.android.gms.internal.ads.AbstractC7827cg0
    protected final Object a(int i10) {
        return this.f74064c.get(i10);
    }

    C7829ch0(AbstractC8042eh0 abstractC8042eh0, int i10) {
        super(abstractC8042eh0.size(), i10);
        this.f74064c = abstractC8042eh0;
    }
}
