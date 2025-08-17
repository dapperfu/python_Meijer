package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class ModuleAwareClassDescriptorKt {
    public static final MemberScope a(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(classDescriptor, "<this>");
        Intrinsics.j(typeSubstitution, "typeSubstitution");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.f143918a.a(classDescriptor, typeSubstitution, kotlinTypeRefiner);
    }

    public static final MemberScope b(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(classDescriptor, "<this>");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.f143918a.b(classDescriptor, kotlinTypeRefiner);
    }
}
