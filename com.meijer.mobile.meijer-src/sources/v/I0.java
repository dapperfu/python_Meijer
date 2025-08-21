package v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v.C17506c1;

/* loaded from: classes.dex */
public class I0 implements F.m0 {

    /* renamed from: b, reason: collision with root package name */
    private C17506c1 f164725b;

    /* renamed from: c, reason: collision with root package name */
    private List<F.s0> f164726c;

    /* renamed from: e, reason: collision with root package name */
    private volatile androidx.camera.core.impl.w f164728e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f164724a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f164727d = false;

    public void a() {
        synchronized (this.f164724a) {
            this.f164727d = true;
            this.f164725b = null;
            this.f164728e = null;
            this.f164726c = null;
        }
    }

    public void b(androidx.camera.core.impl.w wVar) {
        synchronized (this.f164724a) {
            this.f164728e = wVar;
        }
    }

    public I0(C17506c1 c17506c1, List<F.s0> list) {
        o2.i.b(c17506c1.f165020i == C17506c1.c.OPENED, "CaptureSession state must be OPENED. Current state:" + c17506c1.f165020i);
        this.f164725b = c17506c1;
        this.f164726c = Collections.unmodifiableList(new ArrayList(list));
    }
}
