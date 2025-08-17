package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeProjection f146170a;

    public a(TypeProjection typeProjection) {
        this.f146170a = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return CapturedTypeConstructorKt.d(this.f146170a);
    }
}
