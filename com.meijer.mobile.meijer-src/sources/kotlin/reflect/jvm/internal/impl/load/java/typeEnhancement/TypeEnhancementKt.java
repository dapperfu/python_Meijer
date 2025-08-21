package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;

/* loaded from: classes14.dex */
public final class TypeEnhancementKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Annotations f145593a;

    /* renamed from: b, reason: collision with root package name */
    private static final C15358e f145594b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.f145559b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.f145560c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f145149v;
        Intrinsics.i(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f145593a = new C15358e(ENHANCED_NULLABILITY_ANNOTATION);
        FqName ENHANCED_MUTABILITY_ANNOTATION = JvmAnnotationNames.f145150w;
        Intrinsics.i(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f145594b = new C15358e(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor f(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.f144419a;
        if (!TypeComponentPositionKt.a(typeComponentPosition) || !(classifierDescriptor instanceof ClassDescriptor)) {
            return null;
        }
        if (javaTypeQualifiers.e() == MutabilityQualifier.f145552a && typeComponentPosition == TypeComponentPosition.f145587a) {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.c(classDescriptor)) {
                return javaToKotlinClassMapper.a(classDescriptor);
            }
        }
        if (javaTypeQualifiers.e() == MutabilityQualifier.f145553b && typeComponentPosition == TypeComponentPosition.f145588b) {
            ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.d(classDescriptor2)) {
                return javaToKotlinClassMapper.b(classDescriptor2);
            }
        }
        return null;
    }

    public static final Annotations g() {
        return f145593a;
    }

    public static final boolean i(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return TypeEnhancementUtilsKt.c(SimpleClassicTypeSystemContext.f147746a, kotlinType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations e(List<? extends Annotations> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new CompositeAnnotations((List<? extends Annotations>) CollectionsKt.j1(list));
            }
            return (Annotations) CollectionsKt.U0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        int i10;
        if (!TypeComponentPositionKt.a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierF = javaTypeQualifiers.f();
        if (nullabilityQualifierF == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[nullabilityQualifierF.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
