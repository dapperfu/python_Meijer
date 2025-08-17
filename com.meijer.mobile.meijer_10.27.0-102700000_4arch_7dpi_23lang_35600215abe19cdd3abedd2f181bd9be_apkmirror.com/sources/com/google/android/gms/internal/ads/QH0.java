package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public final class QH0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69548a;

    /* renamed from: b, reason: collision with root package name */
    private final C8808n f69549b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7077Pq f69550c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9629uj f69551d;

    /* renamed from: e, reason: collision with root package name */
    private final List f69552e = AbstractC7917eh0.t();

    /* renamed from: f, reason: collision with root package name */
    private HC f69553f = HC.f67408a;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69554g;

    public final QH0 d(HC hc2) {
        this.f69553f = hc2;
        return this;
    }

    public final C8380j e() {
        C8086gC.f(!this.f69554g);
        C8275i c8275i = null;
        if (this.f69551d == null) {
            if (this.f69550c == null) {
                this.f69550c = new C8061g(null);
            }
            this.f69551d = new C8168h(this.f69550c);
        }
        C8380j c8380j = new C8380j(this, c8275i);
        this.f69554g = true;
        return c8380j;
    }

    public QH0(Context context, C8808n c8808n) {
        this.f69548a = context.getApplicationContext();
        this.f69549b = c8808n;
    }
}
