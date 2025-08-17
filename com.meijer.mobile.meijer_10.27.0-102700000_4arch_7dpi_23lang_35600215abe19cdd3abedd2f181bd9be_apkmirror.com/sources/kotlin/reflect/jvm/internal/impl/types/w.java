package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* loaded from: classes13.dex */
class w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f147047a;

    public w(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f147047a = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeParameterUpperBoundEraser.f(this.f147047a, (TypeParameterUpperBoundEraser.a) obj);
    }
}
