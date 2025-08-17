package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f147046a;

    public v(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f147046a = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeParameterUpperBoundEraser.c(this.f147046a);
    }
}
