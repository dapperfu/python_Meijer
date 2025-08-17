package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes13.dex */
public final class StdlibClassFinderKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<StdlibClassFinder> f146159a = new ModuleCapability<>("StdlibClassFinder");

    public static final StdlibClassFinder a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.E0(f146159a);
        return stdlibClassFinder == null ? a.f146160a : stdlibClassFinder;
    }
}
