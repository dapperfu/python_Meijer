package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class XC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72117a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f72119c;

    /* renamed from: f, reason: collision with root package name */
    private ZC0 f72122f;

    /* renamed from: g, reason: collision with root package name */
    private OC0 f72123g;

    /* renamed from: b, reason: collision with root package name */
    private final C8319hC0 f72118b = C8319hC0.f75473c;

    /* renamed from: d, reason: collision with root package name */
    private final UC0 f72120d = UC0.f71403a;

    /* renamed from: e, reason: collision with root package name */
    private final VC0 f72121e = VC0.f71664a;

    public final C8533jD0 d() {
        C8211gC.f(!this.f72119c);
        this.f72119c = true;
        if (this.f72122f == null) {
            this.f72122f = new ZC0(new InterfaceC9455ru[0]);
        }
        if (this.f72123g == null) {
            this.f72123g = new OC0(this.f72117a);
        }
        return new C8533jD0(this, null);
    }

    public XC0(Context context) {
        this.f72117a = context;
    }
}
