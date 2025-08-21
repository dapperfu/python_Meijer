package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* loaded from: classes14.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* renamed from: a, reason: collision with root package name */
    private final DeclarationDescriptor f145077a;

    public DeprecationCausedByFunctionNInfo(DeclarationDescriptor target) {
        Intrinsics.j(target, "target");
        this.f145077a = target;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public DeprecationLevelValue b() {
        return DeprecationLevelValue.f147112b;
    }
}
