package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public interface AdditionalClassPartsProvider {

    public static final class None implements AdditionalClassPartsProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final None f144685a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<SimpleFunctionDescriptor> a(Name name, ClassDescriptor classDescriptor) {
            Intrinsics.j(name, "name");
            Intrinsics.j(classDescriptor, "classDescriptor");
            return CollectionsKt.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<ClassConstructorDescriptor> c(ClassDescriptor classDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            return CollectionsKt.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<KotlinType> d(ClassDescriptor classDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            return CollectionsKt.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<Name> e(ClassDescriptor classDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            return CollectionsKt.m();
        }

        private None() {
        }
    }

    Collection<SimpleFunctionDescriptor> a(Name name, ClassDescriptor classDescriptor);

    Collection<ClassConstructorDescriptor> c(ClassDescriptor classDescriptor);

    Collection<KotlinType> d(ClassDescriptor classDescriptor);

    Collection<Name> e(ClassDescriptor classDescriptor);
}
