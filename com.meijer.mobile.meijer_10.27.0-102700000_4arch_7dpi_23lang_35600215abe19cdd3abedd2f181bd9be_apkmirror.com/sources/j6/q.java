package j6;

import java.util.Collections;
import v6.C17512a;
import v6.C17514c;

/* loaded from: classes4.dex */
public class q<K, A> extends AbstractC14861a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f139490i;

    public q(C17514c<A> c17514c) {
        this(c17514c, null);
    }

    public q(C17514c<A> c17514c, A a10) {
        super(Collections.EMPTY_LIST);
        o(c17514c);
        this.f139490i = a10;
    }

    @Override // j6.AbstractC14861a
    float c() {
        return 1.0f;
    }

    @Override // j6.AbstractC14861a
    public A h() {
        C17514c<A> c17514c = this.f139427e;
        A a10 = this.f139490i;
        return c17514c.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // j6.AbstractC14861a
    public void l() {
        if (this.f139427e != null) {
            super.l();
        }
    }

    @Override // j6.AbstractC14861a
    public void n(float f10) {
        this.f139426d = f10;
    }

    @Override // j6.AbstractC14861a
    A i(C17512a<K> c17512a, float f10) {
        return h();
    }
}
