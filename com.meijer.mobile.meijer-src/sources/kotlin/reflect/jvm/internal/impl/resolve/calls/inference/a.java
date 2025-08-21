package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeProjection f147077a;

    public a(TypeProjection typeProjection) {
        this.f147077a = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return CapturedTypeConstructorKt.d(this.f147077a);
    }
}
