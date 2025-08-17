package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001an\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u001d\u0010I\u001a\u0019\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F¢\u0006\u0002\bHH\u0000¢\u0006\u0004\bJ\u0010K\"\u001a\u0010P\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\bN\u0010O\"\u0018\u0010U\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0018\u0010W\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010T\"\u001a\u0010[\u001a\u0004\u0018\u00010X*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\\"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "", "packageName", "className", "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "p", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", "s", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "a", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "c", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "d", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", "l", "(Lkotlin/reflect/KType;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class UtilKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FqName f143143a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.f143257g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.f143258h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.f143259i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.f143260j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.f143261k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.f143262l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.f143263m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.f143264n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    private static final List<Annotation> t(List<? extends Annotation> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List listE;
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Intrinsics.e(JvmClassMappingKt.b(JvmClassMappingKt.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
                    if (!Intrinsics.e(clsB.getSimpleName(), "Container") || clsB.getAnnotation(RepeatableContainer.class) == null) {
                        listE = CollectionsKt.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = ArraysKt.g((Annotation[]) objInvoke);
                    }
                    CollectionsKt.C(list, listE);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(ArrayValue arrayValue, ClassLoader classLoader) throws NegativeArraySizeException {
        KotlinType kotlinTypeE;
        Class clsO;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue == null || (kotlinTypeE = typedArrayValue.e()) == null) {
            return null;
        }
        List<? extends ConstantValue<?>> listB = arrayValue.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(s((ConstantValue) it.next(), classLoader));
        }
        PrimitiveType primitiveTypeO = KotlinBuiltIns.O(kotlinTypeE);
        int i10 = 0;
        switch (primitiveTypeO == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveTypeO.ordinal()]) {
            case -1:
                if (!KotlinBuiltIns.d0(kotlinTypeE)) {
                    throw new IllegalStateException(("Not an array type: " + kotlinTypeE).toString());
                }
                KotlinType type = ((TypeProjection) CollectionsKt.U0(kotlinTypeE.I0())).getType();
                Intrinsics.i(type, "getType(...)");
                ClassifierDescriptor classifierDescriptorD = type.K0().d();
                ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
                if (classDescriptor == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (KotlinBuiltIns.w0(type)) {
                    int size = arrayValue.b().size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = obj;
                        i10++;
                    }
                    return strArr;
                }
                if (KotlinBuiltIns.m0(classDescriptor)) {
                    int size2 = arrayValue.b().size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        Intrinsics.h(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = obj2;
                        i10++;
                    }
                    return clsArr;
                }
                ClassId classIdN = DescriptorUtilsKt.n(classDescriptor);
                if (classIdN == null || (clsO = o(classLoader, classIdN, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, arrayValue.b().size());
                Intrinsics.h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = arrayValue.b().size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = arrayValue.b().size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    Intrinsics.h(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = arrayValue.b().size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    Intrinsics.h(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = arrayValue.b().size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    Intrinsics.h(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = arrayValue.b().size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    Intrinsics.h(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = arrayValue.b().size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    Intrinsics.h(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = arrayValue.b().size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    Intrinsics.h(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = arrayValue.b().size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    Intrinsics.h(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    public static final KCallableImpl<?> b(Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplC = c(obj);
        return kFunctionImplC != null ? kFunctionImplC : d(obj);
    }

    public static final KFunctionImpl c(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    public static final KPropertyImpl<?> d(Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    public static final List<Annotation> e(Annotated annotated) {
        Annotation annotationP;
        Intrinsics.j(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement sourceElementG = annotationDescriptor.g();
            if (sourceElementG instanceof ReflectAnnotationSource) {
                annotationP = ((ReflectAnnotationSource) sourceElementG).d();
            } else if (sourceElementG instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElementC = ((RuntimeSourceElementFactory.RuntimeSourceElement) sourceElementG).c();
                ReflectJavaAnnotation reflectJavaAnnotation = reflectJavaElementC instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) reflectJavaElementC : null;
                annotationP = reflectJavaAnnotation != null ? reflectJavaAnnotation.Q() : null;
            } else {
                annotationP = p(annotationDescriptor);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        Intrinsics.j(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Intrinsics.e(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.e(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.e(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.e(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.e(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.e(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.e(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.e(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.e(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends MessageLite, D extends CallableDescriptor> D h(Class<?> moduleAnchor, M proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, Function2<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> listS0;
        Intrinsics.j(moduleAnchor, "moduleAnchor");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(createDescriptor, "createDescriptor");
        RuntimeModuleData runtimeModuleDataA = ModuleByClassLoaderKt.a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            listS0 = ((ProtoBuf.Function) proto).r0();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listS0 = ((ProtoBuf.Property) proto).s0();
        }
        List<ProtoBuf.TypeParameter> list = listS0;
        DeserializationComponents deserializationComponentsA = runtimeModuleDataA.a();
        ModuleDescriptor moduleDescriptorB = runtimeModuleDataA.b();
        VersionRequirementTable versionRequirementTableB = VersionRequirementTable.f145550b.b();
        Intrinsics.g(list);
        return createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponentsA, nameResolver, moduleDescriptorB, typeTable, versionRequirementTableB, metadataVersion, null, null, list)), proto);
    }

    public static final ReceiverParameterDescriptor i(CallableDescriptor callableDescriptor) {
        Intrinsics.j(callableDescriptor, "<this>");
        if (callableDescriptor.J() == null) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorB = callableDescriptor.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) declarationDescriptorB).G0();
    }

    public static final FqName j() {
        return f143143a;
    }

    public static final boolean k(KType kType) {
        KotlinType kotlinTypeW;
        Intrinsics.j(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (kotlinTypeW = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.i(kotlinTypeW)) ? false : true;
    }

    public static final boolean l(KType kType) {
        KotlinType kotlinTypeW;
        Intrinsics.j(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (kotlinTypeW = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.c(kotlinTypeW)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class<?> m(ClassLoader classLoader, String str, String str2, int i10) {
        if (Intrinsics.e(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(StringsKt.P(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        return ReflectJavaClassFinderKt.a(classLoader, sb2.toString());
    }

    private static final Class<?> n(ClassLoader classLoader, ClassId classId, int i10) {
        ClassId classIdN = JavaToKotlinClassMap.f143492a.n(classId.a().i());
        if (classIdN != null) {
            classId = classIdN;
        }
        return m(classLoader, classId.f().a(), classId.g().a(), i10);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, ClassId classId, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return n(classLoader, classId, i10);
    }

    public static final Class<?> q(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        SourceElement sourceElementG = classDescriptor.g();
        Intrinsics.i(sourceElementG, "getSource(...)");
        if (sourceElementG instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass kotlinJvmBinaryClassD = ((KotlinJvmBinarySourceElement) sourceElementG).d();
            Intrinsics.h(kotlinJvmBinaryClassD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) kotlinJvmBinaryClassD).d();
        }
        if (sourceElementG instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElementC = ((RuntimeSourceElementFactory.RuntimeSourceElement) sourceElementG).c();
            Intrinsics.h(reflectJavaElementC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) reflectJavaElementC).s();
        }
        ClassId classIdN = DescriptorUtilsKt.n(classDescriptor);
        if (classIdN == null) {
            return null;
        }
        return n(ReflectClassUtilKt.j(classDescriptor.getClass()), classIdN, 0);
    }

    public static final KVisibility r(DescriptorVisibility descriptorVisibility) {
        Intrinsics.j(descriptorVisibility, "<this>");
        if (Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143600e)) {
            return KVisibility.f142956a;
        }
        if (Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143598c)) {
            return KVisibility.f142957b;
        }
        if (Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143599d)) {
            return KVisibility.f142958c;
        }
        if (Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143596a) || Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143597b)) {
            return KVisibility.f142959d;
        }
        return null;
    }

    private static final Object s(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return p(((AnnotationValue) constantValue).b());
        }
        if (constantValue instanceof ArrayValue) {
            return a((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> pairB = ((EnumValue) constantValue).b();
            ClassId classIdA = pairB.a();
            Name nameB = pairB.b();
            Class clsO = o(classLoader, classIdA, 0, 4, null);
            if (clsO != null) {
                return B0.a(clsO, nameB.b());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.b();
        }
        KClassValue.Value valueB = ((KClassValue) constantValue).b();
        if (valueB instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueB;
            return n(classLoader, normalClass.b(), normalClass.a());
        }
        if (!(valueB instanceof KClassValue.Value.LocalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassifierDescriptor classifierDescriptorD = ((KClassValue.Value.LocalClass) valueB).a().K0().d();
        ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
        if (classDescriptor != null) {
            return q(classDescriptor);
        }
        return null;
    }

    private static final Annotation p(AnnotationDescriptor annotationDescriptor) {
        Class<?> clsQ;
        Pair pairA;
        ClassDescriptor classDescriptorL = DescriptorUtilsKt.l(annotationDescriptor);
        if (classDescriptorL != null) {
            clsQ = q(classDescriptorL);
        } else {
            clsQ = null;
        }
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            Intrinsics.i(classLoader, "getClassLoader(...)");
            Object objS = s(constantValue, classLoader);
            if (objS != null) {
                pairA = TuplesKt.a(name.b(), objS);
            } else {
                pairA = null;
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.h(clsQ, MapsKt.y(arrayList), null, 4, null);
    }
}
