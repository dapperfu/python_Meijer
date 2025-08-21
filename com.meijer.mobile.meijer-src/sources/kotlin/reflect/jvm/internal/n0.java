package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class n0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl f148109a;

    public n0(KPropertyImpl kPropertyImpl) {
        this.f148109a = kPropertyImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Y(this.f148109a);
    }
}
