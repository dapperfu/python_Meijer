package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f143918a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MemberScope a(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeE0;
            Intrinsics.j(classDescriptor, "<this>");
            Intrinsics.j(typeSubstitution, "typeSubstitution");
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeE0 = moduleAwareClassDescriptor.e0(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScopeE0;
            }
            MemberScope memberScopeN0 = classDescriptor.n0(typeSubstitution);
            Intrinsics.i(memberScopeN0, "getMemberScope(...)");
            return memberScopeN0;
        }

        public final MemberScope b(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeG0;
            Intrinsics.j(classDescriptor, "<this>");
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeG0 = moduleAwareClassDescriptor.g0(kotlinTypeRefiner)) != null) {
                return memberScopeG0;
            }
            MemberScope memberScopeU = classDescriptor.U();
            Intrinsics.i(memberScopeU, "getUnsubstitutedMemberScope(...)");
            return memberScopeU;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ ClassifierDescriptor a() {
        return a();
    }

    protected abstract MemberScope e0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    protected abstract MemberScope g0(KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ DeclarationDescriptor a() {
        return a();
    }
}
