package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* loaded from: classes13.dex */
final class a implements StdlibClassFinder {

    /* renamed from: a, reason: collision with root package name */
    public static final a f146160a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public ClassDescriptor a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        return FindClassInModuleKt.b(moduleDescriptor, StandardClassIds.f145756a.i());
    }

    private a() {
    }
}
