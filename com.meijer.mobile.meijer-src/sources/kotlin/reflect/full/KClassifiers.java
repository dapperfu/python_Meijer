package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/KClassifier;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "b", "(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;)Lkotlin/reflect/KType;", "Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "a", "(Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KClassifiers {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f143858a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f143859b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f143860c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    public static final KType b(KClassifier kClassifier, List<KTypeProjection> arguments, boolean z10, List<? extends Annotation> annotations) {
        ClassifierDescriptor classifierDescriptorA;
        Intrinsics.j(kClassifier, "<this>");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(annotations, "annotations");
        Function0 function0 = null;
        Object[] objArr = 0;
        KClassifierImpl kClassifierImpl = kClassifier instanceof KClassifierImpl ? (KClassifierImpl) kClassifier : null;
        if (kClassifierImpl == null || (classifierDescriptorA = kClassifierImpl.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + kClassifier + " (" + kClassifier.getClass() + ')');
        }
        TypeConstructor typeConstructorI = classifierDescriptorA.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = typeConstructorI.getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new KTypeImpl(a(annotations.isEmpty() ? TypeAttributes.f147647b.k() : TypeAttributes.f147647b.k(), typeConstructorI, arguments, z10), function0, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    private static final SimpleType a(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<KTypeProjection> list, boolean z10) {
        KotlinType kotlinTypeW;
        int i10;
        TypeProjectionBase starProjectionImpl;
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        List<KTypeProjection> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.c();
            if (kTypeImpl != null) {
                kotlinTypeW = kTypeImpl.getType();
            } else {
                kotlinTypeW = null;
            }
            KVariance kVarianceD = kTypeProjection.d();
            if (kVarianceD == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[kVarianceD.ordinal()];
            }
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            Variance variance = Variance.f147705g;
                            Intrinsics.g(kotlinTypeW);
                            starProjectionImpl = new TypeProjectionImpl(variance, kotlinTypeW);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        Variance variance2 = Variance.f147704f;
                        Intrinsics.g(kotlinTypeW);
                        starProjectionImpl = new TypeProjectionImpl(variance2, kotlinTypeW);
                    }
                } else {
                    Variance variance3 = Variance.f147703e;
                    Intrinsics.g(kotlinTypeW);
                    starProjectionImpl = new TypeProjectionImpl(variance3, kotlinTypeW);
                }
            } else {
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i11);
                Intrinsics.i(typeParameterDescriptor, "get(...)");
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            }
            arrayList.add(starProjectionImpl);
            i11 = i12;
        }
        return KotlinTypeFactory.k(typeAttributes, typeConstructor, arrayList, z10, null, 16, null);
    }
}
