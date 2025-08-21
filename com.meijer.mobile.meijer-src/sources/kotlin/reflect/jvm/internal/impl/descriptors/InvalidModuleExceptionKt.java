package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class InvalidModuleExceptionKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<InvalidModuleNotifier> f144524a = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.E0(f144524a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.a(moduleDescriptor);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
