package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.j(superDescriptor, "superDescriptor");
        Intrinsics.j(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            Intrinsics.i(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoW = OverridingUtil.w(superDescriptor, subDescriptor);
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
                Object[] objArr = 0;
                if ((overrideCompatibilityInfoW != null ? overrideCompatibilityInfoW.c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> listH = javaMethodDescriptor.h();
                Intrinsics.i(listH, "getValueParameters(...)");
                Sequence sequenceM = SequencesKt.M(CollectionsKt.f0(listH), f.f144378a);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                Intrinsics.g(returnType);
                Sequence sequenceP = SequencesKt.P(sequenceM, returnType);
                ReceiverParameterDescriptor receiverParameterDescriptorN = javaMethodDescriptor.N();
                for (KotlinType kotlinType : SequencesKt.O(sequenceP, CollectionsKt.q(receiverParameterDescriptorN != null ? receiverParameterDescriptorN.getType() : null))) {
                    if (!kotlinType.I0().isEmpty() && !(kotlinType.N0() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor callableDescriptorC = superDescriptor.c(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0).c());
                if (callableDescriptorC == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (callableDescriptorC instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorC;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    Intrinsics.i(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        callableDescriptorC = simpleFunctionDescriptor.t().p(CollectionsKt.m()).build();
                        Intrinsics.g(callableDescriptorC);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f146132f.F(callableDescriptorC, subDescriptor, false).c();
                Intrinsics.i(resultC, "getResult(...)");
                return WhenMappings.$EnumSwitchMapping$0[resultC.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }
}
