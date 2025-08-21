package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
public final class ResolutionAnchorProviderKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<ResolutionAnchorProvider> f147065a = new ModuleCapability<>("ResolutionAnchorProvider");

    public static final ModuleDescriptor a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.E0(f147065a);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.a(moduleDescriptor);
        }
        return null;
    }
}
