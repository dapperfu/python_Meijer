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
/* loaded from: classes14.dex */
public final class ReflectionTypes {

    /* renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f144180a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f144181b;

    /* renamed from: c, reason: collision with root package name */
    private final a f144182c;

    /* renamed from: d, reason: collision with root package name */
    private final a f144183d;

    /* renamed from: e, reason: collision with root package name */
    private final a f144184e;

    /* renamed from: f, reason: collision with root package name */
    private final a f144185f;

    /* renamed from: g, reason: collision with root package name */
    private final a f144186g;

    /* renamed from: h, reason: collision with root package name */
    private final a f144187h;

    /* renamed from: i, reason: collision with root package name */
    private final a f144188i;

    /* renamed from: j, reason: collision with root package name */
    private final a f144189j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144179l = {Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f144178k = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KotlinType a(ModuleDescriptor module) {
            Intrinsics.j(module, "module");
            ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, StandardNames.FqNames.f144320w0);
            if (classDescriptorB == null) {
                return null;
            }
            TypeAttributes typeAttributesK = TypeAttributes.f147647b.k();
            List<TypeParameterDescriptor> parameters = classDescriptorB.i().getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            Object objU0 = CollectionsKt.U0(parameters);
            Intrinsics.i(objU0, "single(...)");
            return KotlinTypeFactory.h(typeAttributesK, classDescriptorB, CollectionsKt.e(new StarProjectionImpl((TypeParameterDescriptor) objU0)));
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f144190a;

        public final ClassDescriptor a(ReflectionTypes types, KProperty<?> property) {
            Intrinsics.j(types, "types");
            Intrinsics.j(property, "property");
            return types.c(CapitalizeDecapitalizeKt.a(property.getName()), this.f144190a);
        }

        public a(int i10) {
            this.f144190a = i10;
        }
    }

    public ReflectionTypes(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        this.f144180a = notFoundClasses;
        this.f144181b = LazyKt.a(LazyThreadSafetyMode.f143287b, new e(module));
        this.f144182c = new a(1);
        this.f144183d = new a(1);
        this.f144184e = new a(1);
        this.f144185f = new a(2);
        this.f144186g = new a(3);
        this.f144187h = new a(1);
        this.f144188i = new a(2);
        this.f144189j = new a(3);
    }

    private final MemberScope e() {
        return (MemberScope) this.f144181b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope f(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.i0(StandardNames.f144224x).n();
    }

    public final ClassDescriptor d() {
        return this.f144182c.a(this, f144179l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor c(String str, int i10) {
        ClassDescriptor classDescriptor;
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        ClassifierDescriptor classifierDescriptorF = e().f(nameO, NoLookupLocation.f145029h);
        if (classifierDescriptorF instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorF;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return this.f144180a.d(new ClassId(StandardNames.f144224x, nameO), CollectionsKt.e(Integer.valueOf(i10)));
        }
        return classDescriptor;
    }
}
