package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f145367i = {Reflection.j(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), Reflection.j(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.j(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145368a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaAnnotation f145369b;

    /* renamed from: c, reason: collision with root package name */
    private final NullableLazyValue f145370c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f145371d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaSourceElement f145372e;

    /* renamed from: f, reason: collision with root package name */
    private final NotNullLazyValue f145373f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f145374g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f145375h;

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c10, JavaAnnotation javaAnnotation, boolean z10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(javaAnnotation, "javaAnnotation");
        this.f145368a = c10;
        this.f145369b = javaAnnotation;
        this.f145370c = c10.e().e(new C15341c(this));
        this.f145371d = c10.e().c(new C15342d(this));
        this.f145372e = c10.a().t().a(javaAnnotation);
        this.f145373f = c10.e().c(new C15343e(this));
        this.f145374g = javaAnnotation.k();
        this.f145375h = javaAnnotation.H() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        Collection<JavaAnnotationArgument> collectionD = lazyJavaAnnotationDescriptor.f145369b.d();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : collectionD) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.f145130c;
            }
            ConstantValue<?> constantValueN = lazyJavaAnnotationDescriptor.n(javaAnnotationArgument);
            Pair pairA = constantValueN != null ? TuplesKt.a(name, constantValueN) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return MapsKt.y(arrayList);
    }

    private final ClassDescriptor h(FqName fqName) {
        return FindClassInModuleKt.d(this.f145368a.d(), ClassId.f146581d.c(fqName), this.f145368a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName i(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        ClassId classIdF = lazyJavaAnnotationDescriptor.f145369b.f();
        if (classIdF != null) {
            return classIdF.a();
        }
        return null;
    }

    private final ConstantValue<?> n(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.f(ConstantValueFactory.f147082a, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return q(javaEnumValueAnnotationArgument.c(), javaEnumValueAnnotationArgument.d());
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return o(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).a());
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return r(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).b());
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.f145130c;
        }
        Intrinsics.g(name);
        return p(name, javaArrayAnnotationArgument.getElements());
    }

    private final ConstantValue<?> o(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f145368a, javaAnnotation, false, 4, null));
    }

    private final ConstantValue<?> q(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> r(JavaType javaType) {
        return KClassValue.f147100b.a(this.f145368a.g().p(javaType, JavaTypeAttributesKt.b(TypeUsage.f147695b, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        return (Map) StorageKt.a(this.f145373f, this, f145367i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName e() {
        return (FqName) StorageKt.b(this.f145370c, this, f145367i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public JavaSourceElement g() {
        return this.f145372e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean k() {
        return this.f145374g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.a(this.f145371d, this, f145367i[1]);
    }

    public final boolean m() {
        return this.f145375h;
    }

    public String toString() {
        return DescriptorRenderer.P(DescriptorRenderer.f146899h, this, null, 2, null);
    }

    private final ConstantValue<?> p(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType kotlinTypeM;
        if (KotlinTypeKt.a(getType())) {
            return null;
        }
        ClassDescriptor classDescriptorL = DescriptorUtilsKt.l(this);
        Intrinsics.g(classDescriptorL);
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, classDescriptorL);
        if (valueParameterDescriptorB == null || (kotlinTypeM = valueParameterDescriptorB.getType()) == null) {
            kotlinTypeM = this.f145368a.a().m().l().m(Variance.f147703e, ErrorUtils.d(ErrorTypeKind.f147817D0, new String[0]));
            Intrinsics.i(kotlinTypeM, "getArrayType(...)");
        }
        List<? extends JavaAnnotationArgument> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueN = n((JavaAnnotationArgument) it.next());
            if (constantValueN == null) {
                constantValueN = new NullValue();
            }
            arrayList.add(constantValueN);
        }
        return ConstantValueFactory.f147082a.c(arrayList, kotlinTypeM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType s(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        FqName fqNameE = lazyJavaAnnotationDescriptor.e();
        if (fqNameE == null) {
            return ErrorUtils.d(ErrorTypeKind.f147819E0, lazyJavaAnnotationDescriptor.f145369b.toString());
        }
        ClassDescriptor classDescriptorF = JavaToKotlinClassMapper.f(JavaToKotlinClassMapper.f144419a, fqNameE, lazyJavaAnnotationDescriptor.f145368a.d().l(), null, 4, null);
        if (classDescriptorF == null) {
            JavaClass javaClassU = lazyJavaAnnotationDescriptor.f145369b.u();
            if (javaClassU != null) {
                classDescriptorF = lazyJavaAnnotationDescriptor.f145368a.a().n().a(javaClassU);
            } else {
                classDescriptorF = null;
            }
            if (classDescriptorF == null) {
                classDescriptorF = lazyJavaAnnotationDescriptor.h(fqNameE);
            }
        }
        return classDescriptorF.o();
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i10 & 4) != 0 ? false : z10);
    }
}
