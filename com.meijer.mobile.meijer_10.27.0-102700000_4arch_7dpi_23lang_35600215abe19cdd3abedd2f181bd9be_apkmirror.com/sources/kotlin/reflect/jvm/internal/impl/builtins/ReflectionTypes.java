package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectionTypes {

    /* renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f143273a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f143274b;

    /* renamed from: c, reason: collision with root package name */
    private final a f143275c;

    /* renamed from: d, reason: collision with root package name */
    private final a f143276d;

    /* renamed from: e, reason: collision with root package name */
    private final a f143277e;

    /* renamed from: f, reason: collision with root package name */
    private final a f143278f;

    /* renamed from: g, reason: collision with root package name */
    private final a f143279g;

    /* renamed from: h, reason: collision with root package name */
    private final a f143280h;

    /* renamed from: i, reason: collision with root package name */
    private final a f143281i;

    /* renamed from: j, reason: collision with root package name */
    private final a f143282j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143272l = {Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f143271k = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KotlinType a(ModuleDescriptor module) {
            Intrinsics.j(module, "module");
            ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, StandardNames.FqNames.f143413w0);
            if (classDescriptorB == null) {
                return null;
            }
            TypeAttributes typeAttributesK = TypeAttributes.f146740b.k();
            List<TypeParameterDescriptor> parameters = classDescriptorB.i().getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            Object objU0 = CollectionsKt.U0(parameters);
            Intrinsics.i(objU0, "single(...)");
            return KotlinTypeFactory.h(typeAttributesK, classDescriptorB, CollectionsKt.e(new StarProjectionImpl((TypeParameterDescriptor) objU0)));
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f143283a;

        public final ClassDescriptor a(ReflectionTypes types, KProperty<?> property) {
            Intrinsics.j(types, "types");
            Intrinsics.j(property, "property");
            return types.c(CapitalizeDecapitalizeKt.a(property.getName()), this.f143283a);
        }

        public a(int i10) {
            this.f143283a = i10;
        }
    }

    public ReflectionTypes(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        this.f143273a = notFoundClasses;
        this.f143274b = LazyKt.a(LazyThreadSafetyMode.f142380b, new e(module));
        this.f143275c = new a(1);
        this.f143276d = new a(1);
        this.f143277e = new a(1);
        this.f143278f = new a(2);
        this.f143279g = new a(3);
        this.f143280h = new a(1);
        this.f143281i = new a(2);
        this.f143282j = new a(3);
    }

    private final MemberScope e() {
        return (MemberScope) this.f143274b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope f(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.i0(StandardNames.f143317x).n();
    }

    public final ClassDescriptor d() {
        return this.f143275c.a(this, f143272l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor c(String str, int i10) {
        ClassDescriptor classDescriptor;
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        ClassifierDescriptor classifierDescriptorF = e().f(nameO, NoLookupLocation.f144122h);
        if (classifierDescriptorF instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorF;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return this.f143273a.d(new ClassId(StandardNames.f143317x, nameO), CollectionsKt.e(Integer.valueOf(i10)));
        }
        return classDescriptor;
    }
}
