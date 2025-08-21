package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class DescriptorEquivalenceForOverrides {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorEquivalenceForOverrides f147023a = new DescriptorEquivalenceForOverrides();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    @JvmOverloads
    public final boolean m(TypeParameterDescriptor a10, TypeParameterDescriptor b10, boolean z10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public static /* synthetic */ boolean f(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return descriptorEquivalenceForOverrides.e(callableDescriptor, callableDescriptor2, z10, z13, z12, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, TypeConstructor c12, TypeConstructor c22) {
        Intrinsics.j(c12, "c1");
        Intrinsics.j(c22, "c2");
        if (Intrinsics.e(c12, c22)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorD = c12.d();
        ClassifierDescriptor classifierDescriptorD2 = c22.d();
        if ((classifierDescriptorD instanceof TypeParameterDescriptor) && (classifierDescriptorD2 instanceof TypeParameterDescriptor)) {
            return f147023a.n((TypeParameterDescriptor) classifierDescriptorD, (TypeParameterDescriptor) classifierDescriptorD2, z10, new e(callableDescriptor, callableDescriptor2));
        }
        return false;
    }

    public static /* synthetic */ boolean l(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return descriptorEquivalenceForOverrides.k(declarationDescriptor, declarationDescriptor2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = b.f147068a;
        }
        return descriptorEquivalenceForOverrides.n(typeParameterDescriptor, typeParameterDescriptor2, z10, function2);
    }

    private final SourceElement r(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
            Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.V0(collectionD);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.g();
    }

    public final boolean e(CallableDescriptor a10, CallableDescriptor b10, boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.e(a10, b10)) {
            return true;
        }
        if (!Intrinsics.e(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof MemberDescriptor) && (b10 instanceof MemberDescriptor) && ((MemberDescriptor) a10).h0() != ((MemberDescriptor) b10).h0()) {
            return false;
        }
        if ((Intrinsics.e(a10.b(), b10.b()) && (!z10 || !Intrinsics.e(r(a10), r(b10)))) || DescriptorUtils.E(a10) || DescriptorUtils.E(b10) || !q(a10, b10, c.f147069a, z10)) {
            return false;
        }
        OverridingUtil overridingUtilI = OverridingUtil.i(kotlinTypeRefiner, new d(z10, a10, b10));
        Intrinsics.i(overridingUtilI, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = overridingUtilI.E(a10, b10, null, !z12).c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultC == result && overridingUtilI.E(b10, a10, null, z12 ^ true).c() == result;
    }

    public final boolean k(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? j((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? o(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z10, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? f(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z10, z11, false, KotlinTypeRefiner.Default.f147725a, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.e(((PackageFragmentDescriptor) declarationDescriptor).e(), ((PackageFragmentDescriptor) declarationDescriptor2).e()) : Intrinsics.e(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    public final boolean n(TypeParameterDescriptor a10, TypeParameterDescriptor b10, boolean z10, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        Intrinsics.j(equivalentCallables, "equivalentCallables");
        if (Intrinsics.e(a10, b10)) {
            return true;
        }
        return !Intrinsics.e(a10.b(), b10.b()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }

    private DescriptorEquivalenceForOverrides() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (Intrinsics.e(declarationDescriptor, callableDescriptor) && Intrinsics.e(declarationDescriptor2, callableDescriptor2)) {
            return true;
        }
        return false;
    }

    private final boolean j(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.e(classDescriptor.i(), classDescriptor2.i());
    }

    private final boolean q(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z10) {
        DeclarationDescriptor declarationDescriptorB = declarationDescriptor.b();
        DeclarationDescriptor declarationDescriptorB2 = declarationDescriptor2.b();
        if (!(declarationDescriptorB instanceof CallableMemberDescriptor) && !(declarationDescriptorB2 instanceof CallableMemberDescriptor)) {
            return l(this, declarationDescriptorB, declarationDescriptorB2, z10, false, 8, null);
        }
        return function2.invoke(declarationDescriptorB, declarationDescriptorB2).booleanValue();
    }
}
