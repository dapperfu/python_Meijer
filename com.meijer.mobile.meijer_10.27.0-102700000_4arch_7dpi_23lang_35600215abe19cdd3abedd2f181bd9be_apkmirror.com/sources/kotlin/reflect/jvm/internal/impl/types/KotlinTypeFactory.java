package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class KotlinTypeFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final KotlinTypeFactory f146714a = new KotlinTypeFactory();

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<KotlinTypeRefiner, SimpleType> f146715b = a.f146716a;

    static final class a implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f146716a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.j(kotlinTypeRefiner, "<unused var>");
            return null;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SimpleType f146717a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeConstructor f146718b;

        public final SimpleType a() {
            return this.f146717a;
        }

        public final TypeConstructor b() {
            return this.f146718b;
        }

        public b(SimpleType simpleType, TypeConstructor typeConstructor) {
            this.f146717a = simpleType;
            this.f146718b = typeConstructor;
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final SimpleType i(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(arguments, "arguments");
        return k(attributes, constructor, arguments, z10, null, 16, null);
    }

    @JvmStatic
    public static final SimpleType c(TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
        Intrinsics.j(typeAliasDescriptor, "<this>");
        Intrinsics.j(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.f146739a, false).i(TypeAliasExpansion.f146734e.a(null, typeAliasDescriptor, arguments), TypeAttributes.f146740b.k());
    }

    @JvmStatic
    public static final UnwrappedType e(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.j(lowerBound, "lowerBound");
        Intrinsics.j(upperBound, "upperBound");
        return Intrinsics.e(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @JvmStatic
    public static final SimpleType f(TypeAttributes attributes, IntegerLiteralTypeConstructor constructor, boolean z10) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(constructor, "constructor");
        return m(attributes, constructor, CollectionsKt.m(), z10, ErrorUtils.a(ErrorScopeKind.f146881c, true, "unknown integer literal type"));
    }

    @JvmStatic
    public static final SimpleType h(TypeAttributes attributes, ClassDescriptor descriptor, List<? extends TypeProjection> arguments) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(arguments, "arguments");
        TypeConstructor typeConstructorI = descriptor.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return k(attributes, typeConstructorI, arguments, false, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final SimpleType j(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.d() == null) {
            return n(attributes, constructor, arguments, z10, f146714a.d(constructor, arguments, kotlinTypeRefiner), new n(constructor, arguments, attributes, z10));
        }
        ClassifierDescriptor classifierDescriptorD = constructor.d();
        Intrinsics.g(classifierDescriptorD);
        SimpleType simpleTypeO = classifierDescriptorD.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    public static /* synthetic */ SimpleType k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return j(typeAttributes, typeConstructor, list, z10, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType l(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, KotlinTypeRefiner refiner) {
        Intrinsics.j(refiner, "refiner");
        b bVarG = f146714a.g(typeConstructor, refiner, list);
        if (bVarG == null) {
            return null;
        }
        SimpleType simpleTypeA = bVarG.a();
        if (simpleTypeA != null) {
            return simpleTypeA;
        }
        TypeConstructor typeConstructorB = bVarG.b();
        Intrinsics.g(typeConstructorB);
        return j(typeAttributes, typeConstructorB, list, z10, refiner);
    }

    @JvmStatic
    public static final SimpleType m(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10, MemberScope memberScope) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(memberScope, "memberScope");
        s sVar = new s(constructor, arguments, z10, memberScope, new o(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? sVar : new t(sVar, attributes);
    }

    @JvmStatic
    public static final SimpleType n(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10, MemberScope memberScope, Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.j(attributes, "attributes");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(memberScope, "memberScope");
        Intrinsics.j(refinedTypeFactory, "refinedTypeFactory");
        s sVar = new s(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? sVar : new t(sVar, attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, MemberScope memberScope, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarG = f146714a.g(typeConstructor, kotlinTypeRefiner, list);
        if (bVarG == null) {
            return null;
        }
        SimpleType simpleTypeA = bVarG.a();
        if (simpleTypeA != null) {
            return simpleTypeA;
        }
        TypeConstructor typeConstructorB = bVarG.b();
        Intrinsics.g(typeConstructorB);
        return m(typeAttributes, typeConstructorB, list, z10, memberScope);
    }

    private KotlinTypeFactory() {
    }

    private final MemberScope d(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorD = typeConstructor.d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorD).o().n();
        }
        if (classifierDescriptorD instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.r(DescriptorUtilsKt.s(classifierDescriptorD));
            }
            if (list.isEmpty()) {
                return ModuleAwareClassDescriptorKt.b((ClassDescriptor) classifierDescriptorD, kotlinTypeRefiner);
            }
            return ModuleAwareClassDescriptorKt.a((ClassDescriptor) classifierDescriptorD, TypeConstructorSubstitution.f146762c.b(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorD instanceof TypeAliasDescriptor) {
            return ErrorUtils.a(ErrorScopeKind.f146883e, true, ((TypeAliasDescriptor) classifierDescriptorD).getName().toString());
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).i();
        }
        throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorD + " for constructor: " + typeConstructor);
    }

    private final b g(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorF;
        ClassifierDescriptor classifierDescriptorD = typeConstructor.d();
        if (classifierDescriptorD == null || (classifierDescriptorF = kotlinTypeRefiner.f(classifierDescriptorD)) == null) {
            return null;
        }
        if (classifierDescriptorF instanceof TypeAliasDescriptor) {
            return new b(c((TypeAliasDescriptor) classifierDescriptorF, list), null);
        }
        TypeConstructor typeConstructorB = classifierDescriptorF.i().b(kotlinTypeRefiner);
        Intrinsics.i(typeConstructorB, "refine(...)");
        return new b(null, typeConstructorB);
    }
}
