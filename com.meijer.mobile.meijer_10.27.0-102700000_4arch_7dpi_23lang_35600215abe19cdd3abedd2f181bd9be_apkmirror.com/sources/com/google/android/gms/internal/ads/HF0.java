package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class HF0 implements ZE0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7100Qg0 f67413a;

    /* renamed from: b, reason: collision with root package name */
    private int f67414b;

    /* renamed from: c, reason: collision with root package name */
    private final GF0 f67415c;

    /* renamed from: d, reason: collision with root package name */
    private final C8416jH0 f67416d;

    public HF0(InterfaceC7100Qg0 interfaceC7100Qg0, GF0 gf0) {
        C8416jH0 c8416jH0 = new C8416jH0(-1);
        this.f67413a = interfaceC7100Qg0;
        this.f67415c = gf0;
        this.f67416d = c8416jH0;
        this.f67414b = 1048576;
    }

    public final HF0 a(int i10) {
        this.f67414b = i10;
        return this;
    }

    public final JF0 b(H7 h72) {
        h72.f67376b.getClass();
        return new JF0(h72, this.f67413a, this.f67415c, BD0.f65487a, this.f67416d, this.f67414b, false, null, null);
    }
}
