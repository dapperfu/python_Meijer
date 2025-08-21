package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class u0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f148124a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f148125b;

    public u0(KTypeImpl kTypeImpl, Function0 function0) {
        this.f148124a = kTypeImpl;
        this.f148125b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.k(this.f148124a, this.f148125b);
    }
}
