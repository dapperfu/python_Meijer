package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* loaded from: classes14.dex */
public interface PlatformDependentDeclarationFilter {

    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        /* renamed from: a, reason: collision with root package name */
        public static final NoPlatformDependent f144687a = new NoPlatformDependent();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean b(ClassDescriptor classDescriptor, SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().p3(PlatformDependentDeclarationFilterKt.a());
        }

        private NoPlatformDependent() {
        }
    }

    boolean b(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor);

    public static final class All implements PlatformDependentDeclarationFilter {

        /* renamed from: a, reason: collision with root package name */
        public static final All f144686a = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean b(ClassDescriptor classDescriptor, SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return true;
        }

        private All() {
        }
    }
}
