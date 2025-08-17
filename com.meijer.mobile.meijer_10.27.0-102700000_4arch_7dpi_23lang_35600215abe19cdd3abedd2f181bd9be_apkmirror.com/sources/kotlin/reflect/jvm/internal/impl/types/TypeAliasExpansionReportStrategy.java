package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* loaded from: classes13.dex */
public interface TypeAliasExpansionReportStrategy {
    void a(TypeSubstitutor typeSubstitutor, KotlinType kotlinType, KotlinType kotlinType2, TypeParameterDescriptor typeParameterDescriptor);

    void b(TypeAliasDescriptor typeAliasDescriptor);

    void c(AnnotationDescriptor annotationDescriptor);

    void d(TypeAliasDescriptor typeAliasDescriptor, TypeParameterDescriptor typeParameterDescriptor, KotlinType kotlinType);

    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final DO_NOTHING f146739a = new DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void a(TypeSubstitutor substitutor, KotlinType unsubstitutedArgument, KotlinType argument, TypeParameterDescriptor typeParameter) {
            Intrinsics.j(substitutor, "substitutor");
            Intrinsics.j(unsubstitutedArgument, "unsubstitutedArgument");
            Intrinsics.j(argument, "argument");
            Intrinsics.j(typeParameter, "typeParameter");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void b(TypeAliasDescriptor typeAlias) {
            Intrinsics.j(typeAlias, "typeAlias");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void c(AnnotationDescriptor annotation) {
            Intrinsics.j(annotation, "annotation");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void d(TypeAliasDescriptor typeAlias, TypeParameterDescriptor typeParameterDescriptor, KotlinType substitutedArgument) {
            Intrinsics.j(typeAlias, "typeAlias");
            Intrinsics.j(substitutedArgument, "substitutedArgument");
        }

        private DO_NOTHING() {
        }
    }
}
