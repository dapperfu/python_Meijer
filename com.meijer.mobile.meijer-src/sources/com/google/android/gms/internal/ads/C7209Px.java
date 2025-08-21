package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Px, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7209Px implements InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9133ot f70287a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f70288b;

    /* renamed from: c, reason: collision with root package name */
    private final C6734Bx f70289c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f70290d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70291e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70292f = false;

    /* renamed from: g, reason: collision with root package name */
    private final C6836Ex f70293g = new C6836Ex();

    public C7209Px(Executor executor, C6734Bx c6734Bx, com.google.android.gms.common.util.f fVar) {
        this.f70288b = executor;
        this.f70289c = c6734Bx;
        this.f70290d = fVar;
    }

    public final void a() {
        this.f70291e = false;
    }

    public final void i() {
        this.f70291e = true;
        s();
    }

    public final void p(boolean z10) {
        this.f70292f = z10;
    }

    public final void q(InterfaceC9133ot interfaceC9133ot) {
        this.f70287a = interfaceC9133ot;
    }

    private final void s() {
        try {
            final JSONObject jSONObjectZzb = this.f70289c.zzb(this.f70293g);
            if (this.f70287a != null) {
                this.f70288b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ox
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70046a.j(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            Rc.p0.l("Failed to call video active view js", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        boolean z10 = this.f70292f ? false : c9845vb.f79930j;
        C6836Ex c6836Ex = this.f70293g;
        c6836Ex.f67520a = z10;
        c6836Ex.f67523d = this.f70290d.c();
        this.f70293g.f67525f = c9845vb;
        if (this.f70291e) {
            s();
        }
    }

    final /* synthetic */ void j(JSONObject jSONObject) {
        this.f70287a.R0("AFMA_updateActiveView", jSONObject);
    }
}
