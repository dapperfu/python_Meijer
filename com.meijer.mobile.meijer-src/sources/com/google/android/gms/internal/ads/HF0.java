package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class HF0 implements ZE0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7225Qg0 f68253a;

    /* renamed from: b, reason: collision with root package name */
    private int f68254b;

    /* renamed from: c, reason: collision with root package name */
    private final GF0 f68255c;

    /* renamed from: d, reason: collision with root package name */
    private final C8541jH0 f68256d;

    public HF0(InterfaceC7225Qg0 interfaceC7225Qg0, GF0 gf0) {
        C8541jH0 c8541jH0 = new C8541jH0(-1);
        this.f68253a = interfaceC7225Qg0;
        this.f68255c = gf0;
        this.f68256d = c8541jH0;
        this.f68254b = 1048576;
    }

    public final HF0 a(int i10) {
        this.f68254b = i10;
        return this;
    }

    public final JF0 b(H7 h72) {
        h72.f68216b.getClass();
        return new JF0(h72, this.f68253a, this.f68255c, BD0.f66327a, this.f68256d, this.f68254b, false, null, null);
    }
}
