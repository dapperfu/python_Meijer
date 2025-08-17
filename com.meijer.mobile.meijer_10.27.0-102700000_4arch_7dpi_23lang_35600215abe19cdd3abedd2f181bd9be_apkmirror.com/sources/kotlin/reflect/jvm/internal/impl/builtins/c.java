package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveType f143447a;

    public c(PrimitiveType primitiveType) {
        this.f143447a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.u(this.f143447a);
    }
}
