package yt;

import com.medallia.digital.mobilesdk.l8;
import java.util.LinkedList;
import java.util.List;
import ut.C17315a;
import ut.InterfaceC17316b;
import ut.InterfaceC17329o;
import xt.InterfaceC18093a;

/* loaded from: classes11.dex */
public final class c implements InterfaceC17316b, InterfaceC17329o {

    /* renamed from: a, reason: collision with root package name */
    private final Za.e f171305a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList<C17315a> f171306b;

    /* renamed from: c, reason: collision with root package name */
    private final C17315a f171307c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18093a f171308d;

    @Override // ut.InterfaceC17316b
    public final void a(C17315a c17315a) {
        if (c17315a != null) {
            this.f171306b.add(c17315a);
            g();
        }
    }

    private void g() {
        while (this.f171306b.size() > 1 && this.f171306b.getFirst().f163455e < this.f171305a.a() - l8.b.f92526c) {
            this.f171306b.removeFirst();
        }
    }

    private C17315a h() {
        return this.f171306b.getLast();
    }

    public final long b() {
        return this.f171305a.a() - h().f163455e;
    }

    public final float d() {
        int size = this.f171306b.size();
        C17315a c17315a = size > 1 ? this.f171306b.get(size - 2) : null;
        if (c17315a == null) {
            return Float.MAX_VALUE;
        }
        return this.f171308d.a(h(), c17315a);
    }

    public c(Za.e eVar, InterfaceC18093a interfaceC18093a) {
        this.f171305a = eVar;
        this.f171308d = interfaceC18093a;
        LinkedList<C17315a> linkedList = new LinkedList<>();
        this.f171306b = linkedList;
        C17315a c17315a = new C17315a(0.0d, 0.0d, 0.0f, "x-dummy", 0L);
        this.f171307c = c17315a;
        linkedList.add(c17315a);
    }

    @Override // ut.InterfaceC17329o
    public final void a() {
        LinkedList<C17315a> linkedList = this.f171306b;
        C17315a c17315aH = h();
        linkedList.add(new C17315a(c17315aH.f163451a, c17315aH.f163452b, c17315aH.f163454d, "x-wifi", this.f171305a.a()));
    }

    public final List<C17315a> c() {
        g();
        return this.f171306b;
    }
}
