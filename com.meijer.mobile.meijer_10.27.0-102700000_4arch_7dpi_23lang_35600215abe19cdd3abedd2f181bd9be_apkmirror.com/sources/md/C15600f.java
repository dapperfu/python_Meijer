package md;

import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: md.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15600f {

    /* renamed from: a, reason: collision with root package name */
    private final List f150059a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15595a f150060b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f150061c;

    /* renamed from: md.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f150062a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC15595a f150063b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f150064c;

        public a a(com.google.android.gms.common.api.f fVar) {
            this.f150062a.add(fVar);
            return this;
        }

        public C15600f b() {
            return new C15600f(this.f150062a, this.f150063b, this.f150064c, true, null);
        }
    }

    public static a d() {
        return new a();
    }

    public List<com.google.android.gms.common.api.f> a() {
        return this.f150059a;
    }

    public InterfaceC15595a b() {
        return this.f150060b;
    }

    public Executor c() {
        return this.f150061c;
    }

    /* synthetic */ C15600f(List list, InterfaceC15595a interfaceC15595a, Executor executor, boolean z10, C15605k c15605k) {
        r.m(list, "APIs must not be null.");
        r.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            r.m(interfaceC15595a, "Listener must not be null when listener executor is set.");
        }
        this.f150059a = list;
        this.f150060b = interfaceC15595a;
        this.f150061c = executor;
    }
}
