package yt;

import com.medallia.digital.mobilesdk.l8;
import java.util.LinkedList;
import java.util.List;
import ut.C17467a;
import ut.InterfaceC17468b;
import ut.InterfaceC17481o;
import xt.InterfaceC18221a;

/* loaded from: classes12.dex */
public final class c implements InterfaceC17468b, InterfaceC17481o {

    /* renamed from: a, reason: collision with root package name */
    private final bb.e f172080a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList<C17467a> f172081b;

    /* renamed from: c, reason: collision with root package name */
    private final C17467a f172082c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18221a f172083d;

    @Override // ut.InterfaceC17468b
    public final void a(C17467a c17467a) {
        if (c17467a != null) {
            this.f172081b.add(c17467a);
            g();
        }
    }

    private void g() {
        while (this.f172081b.size() > 1 && this.f172081b.getFirst().f164533e < this.f172080a.a() - l8.b.f93365c) {
            this.f172081b.removeFirst();
        }
    }

    private C17467a h() {
        return this.f172081b.getLast();
    }

    public final long b() {
        return this.f172080a.a() - h().f164533e;
    }

    public final float d() {
        int size = this.f172081b.size();
        C17467a c17467a = size > 1 ? this.f172081b.get(size - 2) : null;
        if (c17467a == null) {
            return Float.MAX_VALUE;
        }
        return this.f172083d.a(h(), c17467a);
    }

    public c(bb.e eVar, InterfaceC18221a interfaceC18221a) {
        this.f172080a = eVar;
        this.f172083d = interfaceC18221a;
        LinkedList<C17467a> linkedList = new LinkedList<>();
        this.f172081b = linkedList;
        C17467a c17467a = new C17467a(0.0d, 0.0d, 0.0f, "x-dummy", 0L);
        this.f172082c = c17467a;
        linkedList.add(c17467a);
    }

    @Override // ut.InterfaceC17481o
    public final void a() {
        LinkedList<C17467a> linkedList = this.f172081b;
        C17467a c17467aH = h();
        linkedList.add(new C17467a(c17467aH.f164529a, c17467aH.f164530b, c17467aH.f164532d, "x-wifi", this.f172080a.a()));
    }

    public final List<C17467a> c() {
        g();
        return this.f172081b;
    }
}
