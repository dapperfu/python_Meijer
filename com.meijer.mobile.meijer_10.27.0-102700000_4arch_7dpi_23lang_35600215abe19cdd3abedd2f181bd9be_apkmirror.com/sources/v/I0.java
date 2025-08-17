package v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v.C17367c1;

/* loaded from: classes.dex */
public class I0 implements F.m0 {

    /* renamed from: b, reason: collision with root package name */
    private C17367c1 f163691b;

    /* renamed from: c, reason: collision with root package name */
    private List<F.s0> f163692c;

    /* renamed from: e, reason: collision with root package name */
    private volatile androidx.camera.core.impl.w f163694e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f163690a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f163693d = false;

    public void a() {
        synchronized (this.f163690a) {
            this.f163693d = true;
            this.f163691b = null;
            this.f163694e = null;
            this.f163692c = null;
        }
    }

    public void b(androidx.camera.core.impl.w wVar) {
        synchronized (this.f163690a) {
            this.f163694e = wVar;
        }
    }

    public I0(C17367c1 c17367c1, List<F.s0> list) {
        o2.i.b(c17367c1.f163986i == C17367c1.c.OPENED, "CaptureSession state must be OPENED. Current state:" + c17367c1.f163986i);
        this.f163691b = c17367c1;
        this.f163692c = Collections.unmodifiableList(new ArrayList(list));
    }
}
