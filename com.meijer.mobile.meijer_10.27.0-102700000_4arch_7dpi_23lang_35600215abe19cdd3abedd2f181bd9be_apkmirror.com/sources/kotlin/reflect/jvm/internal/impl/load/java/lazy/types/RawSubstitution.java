package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RawSubstitution extends TypeSubstitution {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f144596e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final JavaTypeAttributes f144597f;

    /* renamed from: g, reason: collision with root package name */
    private static final JavaTypeAttributes f144598g;

    /* renamed from: c, reason: collision with root package name */
    private final RawProjectionComputer f144599c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f144600d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean f() {
        return false;
    }

    static {
        TypeUsage typeUsage = TypeUsage.f146788b;
        f144597f = JavaTypeAttributesKt.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.f144588c);
        f144598g = JavaTypeAttributesKt.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.f144587b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f144599c = rawProjectionComputer;
        if (typeParameterUpperBoundEraser == null) {
            typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
        }
        this.f144600d = typeParameterUpperBoundEraser;
    }

    private final Pair<SimpleType, Boolean> j(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.K0().getParameters().isEmpty()) {
            return TuplesKt.a(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.d0(simpleType)) {
            TypeProjection typeProjection = simpleType.I0().get(0);
            Variance varianceC = typeProjection.c();
            KotlinType type = typeProjection.getType();
            Intrinsics.i(type, "getType(...)");
            return TuplesKt.a(KotlinTypeFactory.k(simpleType.J0(), simpleType.K0(), CollectionsKt.e(new TypeProjectionImpl(varianceC, l(type, javaTypeAttributes))), simpleType.L0(), null, 16, null), Boolean.FALSE);
        }
        if (KotlinTypeKt.a(simpleType)) {
            return TuplesKt.a(ErrorUtils.d(ErrorTypeKind.f146921J, simpleType.K0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeN0 = classDescriptor.n0(this);
        Intrinsics.i(memberScopeN0, "getMemberScope(...)");
        TypeAttributes typeAttributesJ0 = simpleType.J0();
        TypeConstructor typeConstructorI = classDescriptor.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = classDescriptor.i().getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            RawProjectionComputer rawProjectionComputer = this.f144599c;
            Intrinsics.g(typeParameterDescriptor);
            arrayList.add(ErasureProjectionComputer.b(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.f144600d, null, 8, null));
        }
        return TuplesKt.a(KotlinTypeFactory.n(typeAttributesJ0, typeConstructorI, arrayList, simpleType.L0(), memberScopeN0, new b(classDescriptor, this, simpleType, javaTypeAttributes)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType k(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassDescriptor classDescriptorB;
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassId classIdN = DescriptorUtilsKt.n(classDescriptor);
        if (classIdN == null || (classDescriptorB = kotlinTypeRefiner.b(classIdN)) == null || Intrinsics.e(classDescriptorB, classDescriptor)) {
            return null;
        }
        return rawSubstitution.j(simpleType, classDescriptorB, javaTypeAttributes).c();
    }

    static /* synthetic */ KotlinType m(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.f146788b, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.l(kotlinType, javaTypeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public TypeProjectionImpl e(KotlinType key) {
        Intrinsics.j(key, "key");
        return new TypeProjectionImpl(m(this, key, null, 2, null));
    }

    private final KotlinType l(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            return l(this.f144600d.e((TypeParameterDescriptor) classifierDescriptorD, javaTypeAttributes.j(true)), javaTypeAttributes);
        }
        if (classifierDescriptorD instanceof ClassDescriptor) {
            ClassifierDescriptor classifierDescriptorD2 = FlexibleTypesKt.d(kotlinType).K0().d();
            if (classifierDescriptorD2 instanceof ClassDescriptor) {
                Pair<SimpleType, Boolean> pairJ = j(FlexibleTypesKt.c(kotlinType), (ClassDescriptor) classifierDescriptorD, f144597f);
                SimpleType simpleTypeA = pairJ.a();
                boolean zBooleanValue = pairJ.b().booleanValue();
                Pair<SimpleType, Boolean> pairJ2 = j(FlexibleTypesKt.d(kotlinType), (ClassDescriptor) classifierDescriptorD2, f144598g);
                SimpleType simpleTypeA2 = pairJ2.a();
                boolean zBooleanValue2 = pairJ2.b().booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    return KotlinTypeFactory.e(simpleTypeA, simpleTypeA2);
                }
                return new RawTypeImpl(simpleTypeA, simpleTypeA2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorD2 + "\" while for lower it's \"" + classifierDescriptorD + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorD).toString());
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
