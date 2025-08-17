package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes13.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f143449a;

    public e(ModuleDescriptor moduleDescriptor) {
        this.f143449a = moduleDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ReflectionTypes.f(this.f143449a);
    }
}
