package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f143488e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Name f143489f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Name a() {
            return CloneableClassScope.f143489f;
        }
    }

    static {
        Name nameO = Name.o("clone");
        Intrinsics.i(nameO, "identifier(...)");
        f143489f = nameO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(StorageManager storageManager, ClassDescriptor containingClass) {
        super(storageManager, containingClass);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected List<FunctionDescriptor> j() {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplI1 = SimpleFunctionDescriptorImpl.i1(m(), Annotations.f143689s3.b(), f143489f, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f143647a);
        simpleFunctionDescriptorImplI1.O0(null, m().G0(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), DescriptorUtilsKt.m(m()).i(), Modality.f143621d, DescriptorVisibilities.f143598c);
        return CollectionsKt.e(simpleFunctionDescriptorImplI1);
    }
}
