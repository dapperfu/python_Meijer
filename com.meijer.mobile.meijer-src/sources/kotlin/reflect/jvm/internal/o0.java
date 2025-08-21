package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class o0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl f148111a;

    public o0(KPropertyImpl kPropertyImpl) {
        this.f148111a = kPropertyImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.X(this.f148111a);
    }
}
