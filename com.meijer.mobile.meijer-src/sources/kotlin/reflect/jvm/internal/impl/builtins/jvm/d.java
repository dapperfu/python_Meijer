package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f144473a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144474b;

    public d(ModuleDescriptor moduleDescriptor, boolean z10) {
        this.f144473a = moduleDescriptor;
        this.f144474b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.O0(this.f144473a, this.f144474b);
    }
}
