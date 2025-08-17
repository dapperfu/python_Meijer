package I8;

import H8.e;
import H8.f;
import K8.d;
import android.view.MotionEvent;
import g8.C14217B;
import g8.x;

/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f13717f = x.f133195a + "TapMonitor";

    /* renamed from: a, reason: collision with root package name */
    private final H8.b f13718a;

    /* renamed from: b, reason: collision with root package name */
    private final I8.a f13719b;

    /* renamed from: c, reason: collision with root package name */
    private final C14217B f13720c;

    /* renamed from: d, reason: collision with root package name */
    private a f13721d = a.NO_TAP;

    /* renamed from: e, reason: collision with root package name */
    private f f13722e;

    enum a {
        NO_TAP,
        TAP_DOWN,
        INVALID_TAP_STATE
    }

    public b(H8.b bVar, I8.a aVar, C14217B c14217b) {
        this.f13718a = bVar;
        this.f13719b = aVar;
        this.f13720c = c14217b;
    }

    @Override // K8.d
    public void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 5 && actionMasked != 6) {
                        if (x.f133196b) {
                            x8.f.u(f13717f, "unexpected event type detected: " + motionEvent.toString());
                            return;
                        }
                        return;
                    }
                    if (this.f13721d == a.TAP_DOWN) {
                        if (x.f133196b) {
                            x8.f.u(f13717f, "multi-touch tap detected");
                        }
                        this.f13718a.a();
                    }
                    this.f13721d = a.INVALID_TAP_STATE;
                    this.f13722e = null;
                    return;
                }
                return;
            }
            if (this.f13721d == a.TAP_DOWN) {
                this.f13718a.d(new e(this.f13722e, this.f13719b.a(motionEvent, this.f13720c.c())));
            }
            this.f13721d = a.NO_TAP;
            this.f13722e = null;
            return;
        }
        this.f13722e = this.f13719b.a(motionEvent, this.f13720c.c());
        this.f13721d = a.TAP_DOWN;
    }
}
