package k6;

import java.util.Collections;
import w6.C17845a;
import w6.C17847c;

/* loaded from: classes4.dex */
public class q<K, A> extends AbstractC15093a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f141688i;

    public q(C17847c<A> c17847c) {
        this(c17847c, null);
    }

    public q(C17847c<A> c17847c, A a10) {
        super(Collections.EMPTY_LIST);
        o(c17847c);
        this.f141688i = a10;
    }

    @Override // k6.AbstractC15093a
    float c() {
        return 1.0f;
    }

    @Override // k6.AbstractC15093a
    public A h() {
        C17847c<A> c17847c = this.f141625e;
        A a10 = this.f141688i;
        return c17847c.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // k6.AbstractC15093a
    public void l() {
        if (this.f141625e != null) {
            super.l();
        }
    }

    @Override // k6.AbstractC15093a
    public void n(float f10) {
        this.f141624d = f10;
    }

    @Override // k6.AbstractC15093a
    A i(C17845a<K> c17845a, float f10) {
        return h();
    }
}
