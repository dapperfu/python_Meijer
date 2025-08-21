package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public final class KClassValue extends ConstantValue<Value> {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f147100b = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConstantValue<?> a(KotlinType argumentType) {
            Intrinsics.j(argumentType, "argumentType");
            if (KotlinTypeKt.a(argumentType)) {
                return null;
            }
            KotlinType type = argumentType;
            int i10 = 0;
            while (KotlinBuiltIns.d0(type)) {
                type = ((TypeProjection) CollectionsKt.U0(type.I0())).getType();
                Intrinsics.i(type, "getType(...)");
                i10++;
            }
            ClassifierDescriptor classifierDescriptorD = type.K0().d();
            if (classifierDescriptorD instanceof ClassDescriptor) {
                ClassId classIdN = DescriptorUtilsKt.n(classifierDescriptorD);
                return classIdN == null ? new KClassValue(new Value.LocalClass(argumentType)) : new KClassValue(classIdN, i10);
            }
            if (classifierDescriptorD instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.f146581d.c(StandardNames.FqNames.f144277b.m()), 0);
            }
            return null;
        }
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* renamed from: a, reason: collision with root package name */
            private final KotlinType f147101a;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.e(this.f147101a, ((LocalClass) obj).f147101a);
            }

            public int hashCode() {
                return this.f147101a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f147101a + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(KotlinType type) {
                super(null);
                Intrinsics.j(type, "type");
                this.f147101a = type;
            }

            public final KotlinType a() {
                return this.f147101a;
            }
        }

        public static final class NormalClass extends Value {

            /* renamed from: a, reason: collision with root package name */
            private final ClassLiteralValue f147102a;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.e(this.f147102a, ((NormalClass) obj).f147102a);
            }

            public int hashCode() {
                return this.f147102a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f147102a + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(ClassLiteralValue value) {
                super(null);
                Intrinsics.j(value, "value");
                this.f147102a = value;
            }

            public final int a() {
                return this.f147102a.c();
            }

            public final ClassId b() {
                return this.f147102a.d();
            }

            public final ClassLiteralValue c() {
                return this.f147102a;
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(Value value) {
        super(value);
        Intrinsics.j(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassLiteralValue value) {
        this(new Value.NormalClass(value));
        Intrinsics.j(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        TypeAttributes typeAttributesK = TypeAttributes.f147647b.k();
        ClassDescriptor classDescriptorF = module.l().F();
        Intrinsics.i(classDescriptorF, "getKClass(...)");
        return KotlinTypeFactory.h(typeAttributesK, classDescriptorF, CollectionsKt.e(new TypeProjectionImpl(c(module))));
    }

    public final KotlinType c(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        Value valueB = b();
        if (valueB instanceof Value.LocalClass) {
            return ((Value.LocalClass) b()).a();
        }
        if (!(valueB instanceof Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassLiteralValue classLiteralValueC = ((Value.NormalClass) b()).c();
        ClassId classIdA = classLiteralValueC.a();
        int iB = classLiteralValueC.b();
        ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, classIdA);
        if (classDescriptorB == null) {
            return ErrorUtils.d(ErrorTypeKind.f147857h, classIdA.toString(), String.valueOf(iB));
        }
        SimpleType simpleTypeO = classDescriptorB.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        KotlinType kotlinTypeD = TypeUtilsKt.D(simpleTypeO);
        for (int i10 = 0; i10 < iB; i10++) {
            kotlinTypeD = module.l().m(Variance.f147703e, kotlinTypeD);
            Intrinsics.i(kotlinTypeD, "getArrayType(...)");
        }
        return kotlinTypeD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassId classId, int i10) {
        this(new ClassLiteralValue(classId, i10));
        Intrinsics.j(classId, "classId");
    }
}
