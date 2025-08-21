package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
public final class StdlibClassFinderKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<StdlibClassFinder> f147066a = new ModuleCapability<>("StdlibClassFinder");

    public static final StdlibClassFinder a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.E0(f147066a);
        return stdlibClassFinder == null ? a.f147067a : stdlibClassFinder;
    }
}
