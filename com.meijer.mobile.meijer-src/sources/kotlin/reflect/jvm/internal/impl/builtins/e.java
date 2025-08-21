package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f144356a;

    public e(ModuleDescriptor moduleDescriptor) {
        this.f144356a = moduleDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ReflectionTypes.f(this.f144356a);
    }
}
