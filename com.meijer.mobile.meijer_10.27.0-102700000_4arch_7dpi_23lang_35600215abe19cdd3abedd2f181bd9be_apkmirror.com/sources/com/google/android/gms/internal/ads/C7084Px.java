package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Px, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7084Px implements InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9008ot f69447a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f69448b;

    /* renamed from: c, reason: collision with root package name */
    private final C6609Bx f69449c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69450d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f69451e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f69452f = false;

    /* renamed from: g, reason: collision with root package name */
    private final C6711Ex f69453g = new C6711Ex();

    public C7084Px(Executor executor, C6609Bx c6609Bx, com.google.android.gms.common.util.f fVar) {
        this.f69448b = executor;
        this.f69449c = c6609Bx;
        this.f69450d = fVar;
    }

    public final void a() {
        this.f69451e = false;
    }

    public final void i() {
        this.f69451e = true;
        s();
    }

    public final void p(boolean z10) {
        this.f69452f = z10;
    }

    public final void q(InterfaceC9008ot interfaceC9008ot) {
        this.f69447a = interfaceC9008ot;
    }

    private final void s() {
        try {
            final JSONObject jSONObjectZzb = this.f69449c.zzb(this.f69453g);
            if (this.f69447a != null) {
                this.f69448b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ox
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69206a.j(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            Pc.p0.l("Failed to call video active view js", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        boolean z10 = this.f69452f ? false : c9720vb.f79090j;
        C6711Ex c6711Ex = this.f69453g;
        c6711Ex.f66680a = z10;
        c6711Ex.f66683d = this.f69450d.c();
        this.f69453g.f66685f = c9720vb;
        if (this.f69451e) {
            s();
        }
    }

    final /* synthetic */ void j(JSONObject jSONObject) {
        this.f69447a.R0("AFMA_updateActiveView", jSONObject);
    }
}
