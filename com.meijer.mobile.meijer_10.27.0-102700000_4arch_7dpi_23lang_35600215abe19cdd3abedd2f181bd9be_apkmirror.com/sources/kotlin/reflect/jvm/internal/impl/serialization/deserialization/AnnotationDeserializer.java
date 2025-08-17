package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AnnotationDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f146356a;

    /* renamed from: b, reason: collision with root package name */
    private final NotFoundClasses f146357b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        this.f146356a = module;
        this.f146357b = notFoundClasses;
    }

    private final KotlinBuiltIns c() {
        return this.f146356a.l();
    }

    private final ClassDescriptor e(ClassId classId) {
        return FindClassInModuleKt.d(this.f146356a, classId, this.f146357b);
    }

    public final AnnotationDescriptor a(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        ClassDescriptor classDescriptorE = e(NameResolverUtilKt.a(nameResolver, proto.B()));
        Map mapK = MapsKt.k();
        if (proto.y() != 0 && !ErrorUtils.m(classDescriptorE) && DescriptorUtils.t(classDescriptorE)) {
            Collection<ClassConstructorDescriptor> collectionJ = classDescriptorE.j();
            Intrinsics.i(collectionJ, "getConstructors(...)");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.V0(collectionJ);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> listH = classConstructorDescriptor.h();
                Intrinsics.i(listH, "getValueParameters(...)");
                List<ValueParameterDescriptor> list = listH;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> listZ = proto.z();
                Intrinsics.i(listZ, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : listZ) {
                    Intrinsics.g(argument);
                    Pair<Name, ConstantValue<?>> pairD = d(argument, linkedHashMap, nameResolver);
                    if (pairD != null) {
                        arrayList.add(pairD);
                    }
                }
                mapK = MapsKt.y(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorE.o(), mapK, SourceElement.f143647a);
    }

    public final ConstantValue<?> f(KotlinType expectedType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        Intrinsics.j(expectedType, "expectedType");
        Intrinsics.j(value, "value");
        Intrinsics.j(nameResolver, "nameResolver");
        Boolean boolD = Flags.f145512P.d(value.P());
        Intrinsics.i(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type typeT = value.T();
        switch (typeT == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeT.ordinal()]) {
            case 1:
                byte bR = (byte) value.R();
                return zBooleanValue ? new UByteValue(bR) : new ByteValue(bR);
            case 2:
                return new CharValue((char) value.R());
            case 3:
                short sR = (short) value.R();
                return zBooleanValue ? new UShortValue(sR) : new ShortValue(sR);
            case 4:
                int iR = (int) value.R();
                return zBooleanValue ? new UIntValue(iR) : new IntValue(iR);
            case 5:
                long jR = value.R();
                return zBooleanValue ? new ULongValue(jR) : new LongValue(jR);
            case 6:
                return new FloatValue(value.Q());
            case 7:
                return new DoubleValue(value.N());
            case 8:
                return new BooleanValue(value.R() != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.S()));
            case 10:
                return new KClassValue(NameResolverUtilKt.a(nameResolver, value.L()), value.H());
            case 11:
                return new EnumValue(NameResolverUtilKt.a(nameResolver, value.L()), NameResolverUtilKt.b(nameResolver, value.O()));
            case 12:
                ProtoBuf.Annotation annotationG = value.G();
                Intrinsics.i(annotationG, "getAnnotation(...)");
                return new AnnotationValue(a(annotationG, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.f146175a;
                List<ProtoBuf.Annotation.Argument.Value> listK = value.K();
                Intrinsics.i(listK, "getArrayElementList(...)");
                List<ProtoBuf.Annotation.Argument.Value> list = listK;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType simpleTypeI = c().i();
                    Intrinsics.i(simpleTypeI, "getAnyType(...)");
                    Intrinsics.g(value2);
                    arrayList.add(f(simpleTypeI, value2, nameResolver));
                }
                return constantValueFactory.c(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.T() + " (expected " + expectedType + ')').toString());
        }
    }

    private final boolean b(ConstantValue<?> constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        int i10;
        ClassDescriptor classDescriptor;
        ProtoBuf.Annotation.Argument.Value.Type typeT = value.T();
        if (typeT == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[typeT.ordinal()];
        }
        if (i10 != 10) {
            if (i10 != 13) {
                return Intrinsics.e(constantValue.a(this.f146356a), kotlinType);
            }
            if ((constantValue instanceof ArrayValue) && ((ArrayValue) constantValue).b().size() == value.K().size()) {
                KotlinType kotlinTypeL = c().l(kotlinType);
                if (kotlinTypeL == null) {
                    return false;
                }
                ArrayValue arrayValue = (ArrayValue) constantValue;
                Iterable iterableN = CollectionsKt.n(arrayValue.b());
                if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
                    return true;
                }
                Iterator it = iterableN.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    ConstantValue<?> constantValue2 = arrayValue.b().get(iNextInt);
                    ProtoBuf.Annotation.Argument.Value valueI = value.I(iNextInt);
                    Intrinsics.i(valueI, "getArrayElement(...)");
                    if (!b(constantValue2, kotlinTypeL, valueI)) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue).toString());
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorD;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null || KotlinBuiltIns.m0(classDescriptor)) {
            return true;
        }
        return false;
    }

    private final Pair<Name, ConstantValue<?>> d(ProtoBuf.Annotation.Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = map.get(NameResolverUtilKt.b(nameResolver, argument.x()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name nameB = NameResolverUtilKt.b(nameResolver, argument.x());
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.i(type, "getType(...)");
        ProtoBuf.Annotation.Argument.Value valueY = argument.y();
        Intrinsics.i(valueY, "getValue(...)");
        return new Pair<>(nameB, g(type, valueY, nameResolver));
    }

    private final ConstantValue<?> g(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        ConstantValue<?> constantValueF = f(kotlinType, value, nameResolver);
        if (!b(constantValueF, kotlinType, value)) {
            constantValueF = null;
        }
        if (constantValueF == null) {
            return ErrorValue.f146178b.a("Unexpected argument value: actual type " + value.T() + " != expected type " + kotlinType);
        }
        return constantValueF;
    }
}
