package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeRegistry f148067a;

    public i(TypeRegistry typeRegistry) {
        this.f148067a = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeRegistry.g(this.f148067a, (String) obj));
    }
}
