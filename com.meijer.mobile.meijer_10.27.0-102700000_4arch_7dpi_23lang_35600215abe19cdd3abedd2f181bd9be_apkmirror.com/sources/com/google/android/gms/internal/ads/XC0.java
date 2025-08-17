package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class XC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71277a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71279c;

    /* renamed from: f, reason: collision with root package name */
    private ZC0 f71282f;

    /* renamed from: g, reason: collision with root package name */
    private OC0 f71283g;

    /* renamed from: b, reason: collision with root package name */
    private final C8194hC0 f71278b = C8194hC0.f74633c;

    /* renamed from: d, reason: collision with root package name */
    private final UC0 f71280d = UC0.f70563a;

    /* renamed from: e, reason: collision with root package name */
    private final VC0 f71281e = VC0.f70824a;

    public final C8408jD0 d() {
        C8086gC.f(!this.f71279c);
        this.f71279c = true;
        if (this.f71282f == null) {
            this.f71282f = new ZC0(new InterfaceC9330ru[0]);
        }
        if (this.f71283g == null) {
            this.f71283g = new OC0(this.f71277a);
        }
        return new C8408jD0(this, null);
    }

    public XC0(Context context) {
        this.f71277a = context;
    }
}
