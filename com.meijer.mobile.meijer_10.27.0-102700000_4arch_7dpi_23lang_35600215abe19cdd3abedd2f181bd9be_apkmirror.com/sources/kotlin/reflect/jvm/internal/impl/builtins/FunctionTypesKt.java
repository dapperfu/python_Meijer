package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FunctionTypesKt {
    public static final int a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorI = kotlinType.getAnnotations().i(StandardNames.FqNames.f143326D);
        if (annotationDescriptorI == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.l(annotationDescriptorI.a(), StandardNames.f143310q);
        Intrinsics.h(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((IntValue) constantValue).b().intValue();
    }

    @JvmOverloads
    public static final SimpleType b(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z10) {
        Intrinsics.j(builtIns, "builtIns");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.j(parameterTypes, "parameterTypes");
        Intrinsics.j(returnType, "returnType");
        List<TypeProjection> listG = g(kotlinType, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        ClassDescriptor classDescriptorF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (kotlinType == null ? 0 : 1), z10);
        if (kotlinType != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.h(TypeAttributesKt.b(annotations), classDescriptorF, listG);
    }

    public static final Name d(KotlinType kotlinType) {
        String strB;
        Intrinsics.j(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorI = kotlinType.getAnnotations().i(StandardNames.FqNames.f143328E);
        if (annotationDescriptorI == null) {
            return null;
        }
        Object objV0 = CollectionsKt.V0(annotationDescriptorI.a().values());
        StringValue stringValue = objV0 instanceof StringValue ? (StringValue) objV0 : null;
        if (stringValue != null && (strB = stringValue.b()) != null) {
            if (!Name.t(strB)) {
                strB = null;
            }
            if (strB != null) {
                return Name.o(strB);
            }
        }
        return null;
    }

    public static final List<KotlinType> e(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        p(kotlinType);
        int iA = a(kotlinType);
        if (iA == 0) {
            return CollectionsKt.m();
        }
        List<TypeProjection> listSubList = kotlinType.I0().subList(0, iA);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final ClassDescriptor f(KotlinBuiltIns builtIns, int i10, boolean z10) {
        Intrinsics.j(builtIns, "builtIns");
        ClassDescriptor classDescriptorY = z10 ? builtIns.Y(i10) : builtIns.D(i10);
        Intrinsics.g(classDescriptorY);
        return classDescriptorY;
    }

    public static final List<TypeProjection> g(KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, KotlinBuiltIns builtIns) {
        Name name;
        KotlinBuiltIns kotlinBuiltIns;
        Intrinsics.j(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.j(parameterTypes, "parameterTypes");
        Intrinsics.j(returnType, "returnType");
        Intrinsics.j(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (kotlinType != null ? 1 : 0) + 1);
        List<? extends KotlinType> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.d((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, kotlinType != null ? TypeUtilsKt.d(kotlinType) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            KotlinType kotlinTypeC = (KotlinType) obj;
            if (list == null || (name = list.get(i10)) == null || name.p()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.f143328E;
                Name name2 = StandardNames.f143306m;
                String strB = name.b();
                Intrinsics.i(strB, "asString(...)");
                Map mapG = MapsKt.g(TuplesKt.a(name2, new StringValue(strB)));
                kotlinBuiltIns = builtIns;
                kotlinTypeC = TypeUtilsKt.C(kotlinTypeC, Annotations.f143689s3.a(CollectionsKt.O0(kotlinTypeC.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, mapG, false, 8, null))));
            } else {
                kotlinBuiltIns = builtIns;
            }
            arrayList.add(TypeUtilsKt.d(kotlinTypeC));
            i10 = i11;
            builtIns = kotlinBuiltIns;
        }
        arrayList.add(TypeUtilsKt.d(returnType));
        return arrayList;
    }

    public static final FunctionTypeKind h(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.C0(declarationDescriptor)) {
            return i(DescriptorUtilsKt.p(declarationDescriptor));
        }
        return null;
    }

    public static final FunctionTypeKind j(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD != null) {
            return h(classifierDescriptorD);
        }
        return null;
    }

    public static final KotlinType k(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        p(kotlinType);
        if (!s(kotlinType)) {
            return null;
        }
        return kotlinType.I0().get(a(kotlinType)).getType();
    }

    public static final KotlinType l(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        p(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.D0(kotlinType.I0())).getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }

    public static final List<TypeProjection> m(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        p(kotlinType);
        return kotlinType.I0().subList(a(kotlinType) + (n(kotlinType) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return p(kotlinType) && s(kotlinType);
    }

    public static final boolean o(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        FunctionTypeKind functionTypeKindH = h(declarationDescriptor);
        return Intrinsics.e(functionTypeKindH, FunctionTypeKind.Function.f143478f) || Intrinsics.e(functionTypeKindH, FunctionTypeKind.SuspendFunction.f143481f);
    }

    public static final boolean p(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return classifierDescriptorD != null && o(classifierDescriptorD);
    }

    public static final boolean q(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return Intrinsics.e(j(kotlinType), FunctionTypeKind.Function.f143478f);
    }

    public static final boolean r(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return Intrinsics.e(j(kotlinType), FunctionTypeKind.SuspendFunction.f143481f);
    }

    public static final Annotations t(Annotations annotations, KotlinBuiltIns builtIns, int i10) {
        Intrinsics.j(annotations, "<this>");
        Intrinsics.j(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.f143326D;
        return annotations.p3(fqName) ? annotations : Annotations.f143689s3.a(CollectionsKt.O0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.g(TuplesKt.a(StandardNames.f143310q, new IntValue(i10))), false, 8, null)));
    }

    public static final Annotations u(Annotations annotations, KotlinBuiltIns builtIns) {
        Intrinsics.j(annotations, "<this>");
        Intrinsics.j(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.f143324C;
        return annotations.p3(fqName) ? annotations : Annotations.f143689s3.a(CollectionsKt.O0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.k(), false, 8, null)));
    }

    private static final FunctionTypeKind i(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.f() && !fqNameUnsafe.e()) {
            FunctionTypeKindExtractor functionTypeKindExtractorA = FunctionTypeKindExtractor.f143482c.a();
            FqName fqNameD = fqNameUnsafe.m().d();
            String strB = fqNameUnsafe.j().b();
            Intrinsics.i(strB, "asString(...)");
            return functionTypeKindExtractorA.b(fqNameD, strB);
        }
        return null;
    }

    private static final boolean s(KotlinType kotlinType) {
        if (kotlinType.getAnnotations().i(StandardNames.FqNames.f143324C) != null) {
            return true;
        }
        return false;
    }
}
