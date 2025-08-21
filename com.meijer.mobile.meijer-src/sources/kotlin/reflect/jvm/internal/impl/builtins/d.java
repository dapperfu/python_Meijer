package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveType f144355a;

    public d(PrimitiveType primitiveType) {
        this.f144355a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.l(this.f144355a);
    }
}
