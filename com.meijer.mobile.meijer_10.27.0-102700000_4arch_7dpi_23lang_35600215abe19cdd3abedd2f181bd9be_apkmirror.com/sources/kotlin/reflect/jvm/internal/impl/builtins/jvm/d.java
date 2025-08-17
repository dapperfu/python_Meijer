package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes13.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f143566a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f143567b;

    public d(ModuleDescriptor moduleDescriptor, boolean z10) {
        this.f143566a = moduleDescriptor;
        this.f143567b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.O0(this.f143566a, this.f143567b);
    }
}
