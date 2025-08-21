package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f147953a;

    public v(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f147953a = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeParameterUpperBoundEraser.c(this.f147953a);
    }
}
