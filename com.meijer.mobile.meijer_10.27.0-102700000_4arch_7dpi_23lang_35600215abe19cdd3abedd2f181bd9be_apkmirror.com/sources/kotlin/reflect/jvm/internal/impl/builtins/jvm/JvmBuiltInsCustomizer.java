package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143532i = {Reflection.j(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), Reflection.j(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.j(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f143533a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaToKotlinClassMapper f143534b;

    /* renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f143535c;

    /* renamed from: d, reason: collision with root package name */
    private final KotlinType f143536d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f143537e;

    /* renamed from: f, reason: collision with root package name */
    private final CacheWithNotNullValues<FqName, ClassDescriptor> f143538f;

    /* renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f143539g;

    /* renamed from: h, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> f143540h;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f143541a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f143543c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f143544d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f143545e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f143542b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f143541a = new a("HIDDEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f143542b = new a("VISIBLE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f143543c = new a("DEPRECATED_LIST_METHODS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f143544d = new a("NOT_CONSIDERED", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f143545e = new a("DROP", 4);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f143546f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f143547g;

        private static final /* synthetic */ a[] a() {
            return new a[]{f143541a, f143542b, f143543c, f143544d, f143545e};
        }

        static {
            a[] aVarArrA = a();
            f143546f = aVarArrA;
            f143547g = EnumEntriesKt.a(aVarArrA);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f143546f.clone();
        }

        private a(String str, int i10) {
        }
    }

    public JvmBuiltInsCustomizer(ModuleDescriptor moduleDescriptor, StorageManager storageManager, Function0<JvmBuiltIns.Settings> settingsComputation) {
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(settingsComputation, "settingsComputation");
        this.f143533a = moduleDescriptor;
        this.f143534b = JavaToKotlinClassMapper.f143512a;
        this.f143535c = storageManager.c(settingsComputation);
        this.f143536d = q(storageManager);
        this.f143537e = storageManager.c(new f(this, storageManager));
        this.f143538f = storageManager.a();
        this.f143539g = storageManager.c(new g(this));
        this.f143540h = storageManager.i(new h(this));
    }

    private final Annotations C() {
        return (Annotations) StorageKt.a(this.f143539g, this, f143532i[2]);
    }

    private final JvmBuiltIns.Settings D() {
        return (JvmBuiltIns.Settings) StorageKt.a(this.f143535c, this, f143532i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations I(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        return Annotations.f143689s3.a(CollectionsKt.e(AnnotationUtilKt.c(jvmBuiltInsCustomizer.f143533a.l(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    private final KotlinType q(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.f143533a;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            /* renamed from: D0, reason: merged with bridge method [inline-methods] */
            public MemberScope.Empty n() {
                return MemberScope.Empty.f146293b;
            }
        }, Name.o("Serializable"), Modality.f143622e, ClassKind.f143586c, CollectionsKt.e(new LazyWrappedType(storageManager, new i(this))), SourceElement.f143647a, false, storageManager);
        classDescriptorImpl.H0(MemberScope.Empty.f146293b, SetsKt.e(), null);
        SimpleType simpleTypeO = classDescriptorImpl.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType r(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        SimpleType simpleTypeI = jvmBuiltInsCustomizer.f143533a.l().i();
        Intrinsics.i(simpleTypeI, "getAnyType(...)");
        return simpleTypeI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations s(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        String str = (String) pair.a();
        String str2 = (String) pair.b();
        return Annotations.f143689s3.a(CollectionsKt.e(AnnotationUtilKt.b(jvmBuiltInsCustomizer.f143533a.l(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor u(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        JavaResolverCache EMPTY = JavaResolverCache.f144339a;
        Intrinsics.i(EMPTY, "EMPTY");
        return lazyJavaClassDescriptor.M0(EMPTY, classDescriptor);
    }

    private final SimpleType v() {
        return (SimpleType) StorageKt.a(this.f143537e, this, f143532i[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(Name name, MemberScope it) {
        Intrinsics.j(it, "it");
        return it.b(name, NoLookupLocation.f144118d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<SimpleFunctionDescriptor> a(Name name, ClassDescriptor classDescriptor) {
        Annotations annotationsInvoke;
        Intrinsics.j(name, "name");
        Intrinsics.j(classDescriptor, "classDescriptor");
        if (Intrinsics.e(name, CloneableClassScope.f143488e.a()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.e0(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> listN0 = deserializedClassDescriptor.b1().N0();
            Intrinsics.i(listN0, "getFunctionList(...)");
            List<ProtoBuf.Function> list = listN0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.e(NameResolverUtilKt.b(deserializedClassDescriptor.a1().g(), ((ProtoBuf.Function) it.next()).i0()), CloneableClassScope.f143488e.a())) {
                        return CollectionsKt.m();
                    }
                }
            }
            return CollectionsKt.e(p(deserializedClassDescriptor, (SimpleFunctionDescriptor) CollectionsKt.T0(v().n().b(name, NoLookupLocation.f144118d))));
        }
        if (!D().b()) {
            return CollectionsKt.m();
        }
        Collection<SimpleFunctionDescriptor> collectionT = t(classDescriptor, new j(name));
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collectionT) {
            DeclarationDescriptor declarationDescriptorB = simpleFunctionDescriptor.b();
            Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorC = simpleFunctionDescriptor.c(MappingUtilKt.a((ClassDescriptor) declarationDescriptorB, classDescriptor).c());
            Intrinsics.h(functionDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderT = ((SimpleFunctionDescriptor) functionDescriptorC).t();
            copyBuilderT.q(classDescriptor);
            copyBuilderT.c(classDescriptor.G0());
            copyBuilderT.l();
            int i10 = WhenMappings.$EnumSwitchMapping$0[A(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    Name name2 = simpleFunctionDescriptor.getName();
                    if (Intrinsics.e(name2, JvmBuiltInsCustomizerKt.f143550a)) {
                        annotationsInvoke = this.f143540h.invoke(TuplesKt.a(simpleFunctionDescriptor.getName().b(), "first"));
                    } else {
                        if (!Intrinsics.e(name2, JvmBuiltInsCustomizerKt.f143551b)) {
                            throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor.getName()).toString());
                        }
                        annotationsInvoke = this.f143540h.invoke(TuplesKt.a(simpleFunctionDescriptor.getName().b(), "last"));
                    }
                    copyBuilderT.s(annotationsInvoke);
                } else if (i10 == 3) {
                    copyBuilderT.s(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Unit unit = Unit.f142422a;
                }
                FunctionDescriptor functionDescriptorBuild = copyBuilderT.build();
                Intrinsics.g(functionDescriptorBuild);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            } else if (!ModalityUtilsKt.a(classDescriptor)) {
                copyBuilderT.d();
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderT.build();
                Intrinsics.g(functionDescriptorBuild2);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            }
            if (simpleFunctionDescriptor2 != null) {
                arrayList.add(simpleFunctionDescriptor2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean b(ClassDescriptor classDescriptor, SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.j(classDescriptor, "classDescriptor");
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorZ = z(classDescriptor);
        if (lazyJavaClassDescriptorZ == null || !functionDescriptor.getAnnotations().p3(PlatformDependentDeclarationFilterKt.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = MethodSignatureMappingKt.c(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeR0 = lazyJavaClassDescriptorZ.U();
        Name name = functionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> collectionB = lazyJavaClassMemberScopeR0.b(name, NoLookupLocation.f144118d);
        if ((collectionB instanceof Collection) && collectionB.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(MethodSignatureMappingKt.c((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<ClassConstructorDescriptor> c(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "classDescriptor");
        if (classDescriptor.f() != ClassKind.f143585b || !D().b()) {
            return CollectionsKt.m();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorZ = z(classDescriptor);
        if (lazyJavaClassDescriptorZ == null) {
            return CollectionsKt.m();
        }
        ClassDescriptor classDescriptorF = JavaToKotlinClassMapper.f(this.f143534b, DescriptorUtilsKt.o(lazyJavaClassDescriptorZ), FallbackBuiltIns.f143490h.a(), null, 4, null);
        if (classDescriptorF == null) {
            return CollectionsKt.m();
        }
        TypeSubstitutor typeSubstitutorC = MappingUtilKt.a(classDescriptorF, lazyJavaClassDescriptorZ).c();
        List<ClassConstructorDescriptor> listO0 = lazyJavaClassDescriptorZ.j();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : listO0) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().d()) {
                Collection<ClassConstructorDescriptor> collectionJ = classDescriptorF.j();
                Intrinsics.i(collectionJ, "getConstructors(...)");
                Collection<ClassConstructorDescriptor> collection = collectionJ;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                        Intrinsics.g(classConstructorDescriptor2);
                        if (w(classConstructorDescriptor2, typeSubstitutorC, classConstructorDescriptor)) {
                            break;
                        }
                    }
                }
                if (!H(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.l0(classConstructorDescriptor) && !JvmBuiltInsSignatures.f143553a.e().contains(MethodSignatureBuildingUtilsKt.a(SignatureBuildingComponents.f144829a, lazyJavaClassDescriptorZ, MethodSignatureMappingKt.c(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderT = classConstructorDescriptor3.t();
            copyBuilderT.q(classDescriptor);
            copyBuilderT.m(classDescriptor.o());
            copyBuilderT.l();
            copyBuilderT.f(typeSubstitutorC.j());
            if (!JvmBuiltInsSignatures.f143553a.h().contains(MethodSignatureBuildingUtilsKt.a(SignatureBuildingComponents.f144829a, lazyJavaClassDescriptorZ, MethodSignatureMappingKt.c(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderT.s(C());
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderT.build();
            Intrinsics.h(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<KotlinType> d(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafeP = DescriptorUtilsKt.p(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.f143553a;
        return jvmBuiltInsSignatures.j(fqNameUnsafeP) ? CollectionsKt.p(v(), this.f143536d) : jvmBuiltInsSignatures.k(fqNameUnsafeP) ? CollectionsKt.e(this.f143536d) : CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<Name> e(ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScopeR0;
        Set<Name> setA;
        Intrinsics.j(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return SetsKt.e();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorZ = z(classDescriptor);
        return (lazyJavaClassDescriptorZ == null || (lazyJavaClassMemberScopeR0 = lazyJavaClassDescriptorZ.U()) == null || (setA = lazyJavaClassMemberScopeR0.a()) == null) ? SetsKt.e() : setA;
    }

    private final a A(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor declarationDescriptorB = functionDescriptor.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        final String strC = MethodSignatureMappingKt.c(functionDescriptor, false, false, 3, null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objB = DFS.b(CollectionsKt.e((ClassDescriptor) declarationDescriptorB), new n(this), new DFS.AbstractNodeHandler<ClassDescriptor, a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
            /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean c(ClassDescriptor javaClassDescriptor) {
                Intrinsics.j(javaClassDescriptor, "javaClassDescriptor");
                String strA = MethodSignatureBuildingUtilsKt.a(SignatureBuildingComponents.f144829a, javaClassDescriptor, strC);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.f143553a;
                if (jvmBuiltInsSignatures.f().contains(strA)) {
                    objectRef.f142835a = JvmBuiltInsCustomizer.a.f143541a;
                } else if (jvmBuiltInsSignatures.i().contains(strA)) {
                    objectRef.f142835a = JvmBuiltInsCustomizer.a.f143542b;
                } else if (jvmBuiltInsSignatures.c().contains(strA)) {
                    objectRef.f142835a = JvmBuiltInsCustomizer.a.f143543c;
                } else if (jvmBuiltInsSignatures.d().contains(strA)) {
                    objectRef.f142835a = JvmBuiltInsCustomizer.a.f143545e;
                }
                return objectRef.f142835a == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public JvmBuiltInsCustomizer.a a() {
                JvmBuiltInsCustomizer.a aVar = objectRef.f142835a;
                return aVar == null ? JvmBuiltInsCustomizer.a.f143544d : aVar;
            }
        });
        Intrinsics.i(objB, "dfs(...)");
        return (a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable B(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        ClassifierDescriptor classifierDescriptorA;
        ClassDescriptor classDescriptor2;
        Collection<KotlinType> collectionA = classDescriptor.i().a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorD = ((KotlinType) it.next()).K0().d();
            LazyJavaClassDescriptor lazyJavaClassDescriptorZ = null;
            if (classifierDescriptorD != null) {
                classifierDescriptorA = classifierDescriptorD.a();
            } else {
                classifierDescriptorA = null;
            }
            if (classifierDescriptorA instanceof ClassDescriptor) {
                classDescriptor2 = (ClassDescriptor) classifierDescriptorA;
            } else {
                classDescriptor2 = null;
            }
            if (classDescriptor2 != null && (lazyJavaClassDescriptorZ = jvmBuiltInsCustomizer.z(classDescriptor2)) == null) {
                lazyJavaClassDescriptorZ = classDescriptor2;
            }
            if (lazyJavaClassDescriptorZ != null) {
                arrayList.add(lazyJavaClassDescriptorZ);
            }
        }
        return arrayList;
    }

    private final boolean E(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z10) {
        DeclarationDescriptor declarationDescriptorB = simpleFunctionDescriptor.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = MethodSignatureMappingKt.c(simpleFunctionDescriptor, false, false, 3, null);
        if (z10 ^ JvmBuiltInsSignatures.f143553a.g().contains(MethodSignatureBuildingUtilsKt.a(SignatureBuildingComponents.f144829a, (ClassDescriptor) declarationDescriptorB, strC))) {
            return true;
        }
        Boolean boolE = DFS.e(CollectionsKt.e(simpleFunctionDescriptor), l.f143577a, new m(this));
        Intrinsics.i(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.a().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean G(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer r2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
        /*
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r3.f()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r0 != r1) goto L1d
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r2 = r2.f143534b
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r3.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.G(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor):java.lang.Boolean");
    }

    private final boolean H(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafeP;
        if (constructorDescriptor.h().size() == 1) {
            List<ValueParameterDescriptor> listH = constructorDescriptor.h();
            Intrinsics.i(listH, "getValueParameters(...)");
            ClassifierDescriptor classifierDescriptorD = ((ValueParameterDescriptor) CollectionsKt.U0(listH)).getType().K0().d();
            if (classifierDescriptorD != null) {
                fqNameUnsafeP = DescriptorUtilsKt.p(classifierDescriptorD);
            } else {
                fqNameUnsafeP = null;
            }
            if (Intrinsics.e(fqNameUnsafeP, DescriptorUtilsKt.p(classDescriptor))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType o(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        return FindClassInModuleKt.d(jvmBuiltInsCustomizer.D().a(), JvmBuiltInClassDescriptorFactory.f143513d.a(), new NotFoundClasses(storageManager, jvmBuiltInsCustomizer.D().a())).o();
    }

    private final SimpleFunctionDescriptor p(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderT = simpleFunctionDescriptor.t();
        copyBuilderT.q(deserializedClassDescriptor);
        copyBuilderT.h(DescriptorVisibilities.f143600e);
        copyBuilderT.m(deserializedClassDescriptor.o());
        copyBuilderT.c(deserializedClassDescriptor.G0());
        FunctionDescriptor functionDescriptorBuild = copyBuilderT.build();
        Intrinsics.g(functionDescriptorBuild);
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final Collection<SimpleFunctionDescriptor> t(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorZ = z(classDescriptor);
        if (lazyJavaClassDescriptorZ == null) {
            return CollectionsKt.m();
        }
        Collection<ClassDescriptor> collectionG = this.f143534b.g(DescriptorUtilsKt.o(lazyJavaClassDescriptorZ), FallbackBuiltIns.f143490h.a());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.E0(collectionG);
        if (classDescriptor2 == null) {
            return CollectionsKt.m();
        }
        SmartSet.Companion companion = SmartSet.f147178c;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionG, 10));
        Iterator<T> it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.o((ClassDescriptor) it.next()));
        }
        SmartSet smartSetB = companion.b(arrayList);
        boolean zC = this.f143534b.c(classDescriptor);
        MemberScope memberScopeU = this.f143538f.a(DescriptorUtilsKt.o(lazyJavaClassDescriptorZ), new k(lazyJavaClassDescriptorZ, classDescriptor2)).U();
        Intrinsics.i(memberScopeU, "getUnsubstitutedMemberScope(...)");
        Collection<? extends SimpleFunctionDescriptor> collectionInvoke = function1.invoke(memberScopeU);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.f() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().d() && !KotlinBuiltIns.l0(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> collectionD = simpleFunctionDescriptor.d();
                Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
                Collection<? extends FunctionDescriptor> collection = collectionD;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        DeclarationDescriptor declarationDescriptorB = ((FunctionDescriptor) it2.next()).b();
                        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
                        if (smartSetB.contains(DescriptorUtilsKt.o(declarationDescriptorB))) {
                            break;
                        }
                    }
                }
                if (!E(simpleFunctionDescriptor, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private static final boolean w(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        if (OverridingUtil.x(constructorDescriptor, constructorDescriptor2.c(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    private final LazyJavaClassDescriptor z(ClassDescriptor classDescriptor) {
        ClassId classIdN;
        FqName fqNameA;
        if (KotlinBuiltIns.b0(classDescriptor) || !KotlinBuiltIns.C0(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafeP = DescriptorUtilsKt.p(classDescriptor);
        if (fqNameUnsafeP.f() && (classIdN = JavaToKotlinClassMap.f143492a.n(fqNameUnsafeP)) != null && (fqNameA = classIdN.a()) != null) {
            ClassDescriptor classDescriptorD = DescriptorUtilKt.d(D().a(), fqNameA, NoLookupLocation.f144118d);
            if (classDescriptorD instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorD;
            }
        }
        return null;
    }
}
