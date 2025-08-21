package od;

import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: od.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16110f {

    /* renamed from: a, reason: collision with root package name */
    private final List f153846a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16105a f153847b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f153848c;

    /* renamed from: od.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f153849a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC16105a f153850b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f153851c;

        public a a(com.google.android.gms.common.api.f fVar) {
            this.f153849a.add(fVar);
            return this;
        }

        public C16110f b() {
            return new C16110f(this.f153849a, this.f153850b, this.f153851c, true, null);
        }
    }

    public static a d() {
        return new a();
    }

    public List<com.google.android.gms.common.api.f> a() {
        return this.f153846a;
    }

    public InterfaceC16105a b() {
        return this.f153847b;
    }

    public Executor c() {
        return this.f153848c;
    }

    /* synthetic */ C16110f(List list, InterfaceC16105a interfaceC16105a, Executor executor, boolean z10, C16115k c16115k) {
        r.m(list, "APIs must not be null.");
        r.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            r.m(interfaceC16105a, "Listener must not be null when listener executor is set.");
        }
        this.f153846a = list;
        this.f153847b = interfaceC16105a;
        this.f153848c = executor;
    }
}
