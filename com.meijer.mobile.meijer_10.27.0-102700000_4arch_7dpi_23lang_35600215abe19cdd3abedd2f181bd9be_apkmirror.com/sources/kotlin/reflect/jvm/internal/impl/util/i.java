package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeRegistry f147160a;

    public i(TypeRegistry typeRegistry) {
        this.f147160a = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeRegistry.g(this.f147160a, (String) obj));
    }
}
