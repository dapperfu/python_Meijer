package K8;

import J8.e;
import J8.f;
import M8.d;
import android.view.MotionEvent;
import i8.C14693B;
import i8.x;

/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f16463f = x.f137411a + "TapMonitor";

    /* renamed from: a, reason: collision with root package name */
    private final J8.b f16464a;

    /* renamed from: b, reason: collision with root package name */
    private final K8.a f16465b;

    /* renamed from: c, reason: collision with root package name */
    private final C14693B f16466c;

    /* renamed from: d, reason: collision with root package name */
    private a f16467d = a.NO_TAP;

    /* renamed from: e, reason: collision with root package name */
    private f f16468e;

    enum a {
        NO_TAP,
        TAP_DOWN,
        INVALID_TAP_STATE
    }

    public b(J8.b bVar, K8.a aVar, C14693B c14693b) {
        this.f16464a = bVar;
        this.f16465b = aVar;
        this.f16466c = c14693b;
    }

    @Override // M8.d
    public void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 5 && actionMasked != 6) {
                        if (x.f137412b) {
                            z8.f.u(f16463f, "unexpected event type detected: " + motionEvent.toString());
                            return;
                        }
                        return;
                    }
                    if (this.f16467d == a.TAP_DOWN) {
                        if (x.f137412b) {
                            z8.f.u(f16463f, "multi-touch tap detected");
                        }
                        this.f16464a.a();
                    }
                    this.f16467d = a.INVALID_TAP_STATE;
                    this.f16468e = null;
                    return;
                }
                return;
            }
            if (this.f16467d == a.TAP_DOWN) {
                this.f16464a.d(new e(this.f16468e, this.f16465b.a(motionEvent, this.f16466c.c())));
            }
            this.f16467d = a.NO_TAP;
            this.f16468e = null;
            return;
        }
        this.f16468e = this.f16465b.a(motionEvent, this.f16466c.c());
        this.f16467d = a.TAP_DOWN;
    }
}
