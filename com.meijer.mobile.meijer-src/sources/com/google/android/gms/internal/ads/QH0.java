package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public final class QH0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70388a;

    /* renamed from: b, reason: collision with root package name */
    private final C8933n f70389b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7202Pq f70390c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9754uj f70391d;

    /* renamed from: e, reason: collision with root package name */
    private final List f70392e = AbstractC8042eh0.t();

    /* renamed from: f, reason: collision with root package name */
    private HC f70393f = HC.f68248a;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70394g;

    public final QH0 d(HC hc2) {
        this.f70393f = hc2;
        return this;
    }

    public final C8505j e() {
        C8211gC.f(!this.f70394g);
        C8400i c8400i = null;
        if (this.f70391d == null) {
            if (this.f70390c == null) {
                this.f70390c = new C8186g(null);
            }
            this.f70391d = new C8293h(this.f70390c);
        }
        C8505j c8505j = new C8505j(this, c8400i);
        this.f70394g = true;
        return c8505j;
    }

    public QH0(Context context, C8933n c8933n) {
        this.f70388a = context.getApplicationContext();
        this.f70389b = c8933n;
    }
}
