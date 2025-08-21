package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(StorageManager storageManager, FunctionClassDescriptor containingClass) {
        super(storageManager, containingClass);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected List<FunctionDescriptor> j() {
        ClassDescriptor classDescriptorM = m();
        Intrinsics.h(classDescriptorM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        FunctionTypeKind functionTypeKindR0 = ((FunctionClassDescriptor) classDescriptorM).R0();
        if (Intrinsics.e(functionTypeKindR0, FunctionTypeKind.Function.f144385f)) {
            return CollectionsKt.e(FunctionInvokeDescriptor.f144379E.a((FunctionClassDescriptor) m(), false));
        }
        if (Intrinsics.e(functionTypeKindR0, FunctionTypeKind.SuspendFunction.f144388f)) {
            return CollectionsKt.e(FunctionInvokeDescriptor.f144379E.a((FunctionClassDescriptor) m(), true));
        }
        return CollectionsKt.m();
    }
}
