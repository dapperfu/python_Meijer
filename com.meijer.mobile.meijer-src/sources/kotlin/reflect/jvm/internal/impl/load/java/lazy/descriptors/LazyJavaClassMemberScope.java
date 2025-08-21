package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* renamed from: n, reason: collision with root package name */
    private final ClassDescriptor f145396n;

    /* renamed from: o, reason: collision with root package name */
    private final JavaClass f145397o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f145398p;

    /* renamed from: q, reason: collision with root package name */
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> f145399q;

    /* renamed from: r, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f145400r;

    /* renamed from: s, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f145401s;

    /* renamed from: t, reason: collision with root package name */
    private final NotNullLazyValue<Map<Name, JavaField>> f145402t;

    /* renamed from: u, reason: collision with root package name */
    private final MemoizedFunctionToNullable<Name, ClassDescriptor> f145403u;

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        a(Object obj) {
            super(1, obj, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(Name p02) {
            Intrinsics.j(p02, "p0");
            return ((LazyJavaClassMemberScope) this.receiver).q1(p02);
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        b(Object obj) {
            super(1, obj, LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(Name p02) {
            Intrinsics.j(p02, "p0");
            return ((LazyJavaClassMemberScope) this.receiver).r1(p02);
        }
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z10, (i10 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    private final boolean e1(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strC = MethodSignatureMappingKt.c(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor functionDescriptorA = functionDescriptor.a();
        Intrinsics.i(functionDescriptorA, "getOriginal(...)");
        return Intrinsics.e(strC, MethodSignatureMappingKt.c(functionDescriptorA, false, false, 2, null)) && !Q0(simpleFunctionDescriptor, functionDescriptor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(LazyJavaResolverContext c10, ClassDescriptor ownerDescriptor, JavaClass jClass, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c10, lazyJavaClassMemberScope);
        Intrinsics.j(c10, "c");
        Intrinsics.j(ownerDescriptor, "ownerDescriptor");
        Intrinsics.j(jClass, "jClass");
        this.f145396n = ownerDescriptor;
        this.f145397o = jClass;
        this.f145398p = z10;
        this.f145399q = c10.e().c(new C15348j(this, c10));
        this.f145400r = c10.e().c(new C15349k(this));
        this.f145401s = c10.e().c(new C15350l(c10, this));
        this.f145402t = c10.e().c(new C15351m(this));
        this.f145403u = c10.e().g(new C15352n(this, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name it) {
        Intrinsics.j(it, "it");
        return lazyJavaClassMemberScope.q1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name it) {
        Intrinsics.j(it, "it");
        return lazyJavaClassMemberScope.r1(it);
    }

    private final Collection<KotlinType> C0() {
        if (!this.f145398p) {
            return L().a().k().c().g(R());
        }
        Collection<KotlinType> collectionA = R().i().a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    public static final List D0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        Collection<JavaConstructor> collectionJ = lazyJavaClassMemberScope.f145397o.j();
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Iterator<JavaConstructor> it = collectionJ.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.o1(it.next()));
        }
        if (lazyJavaClassMemberScope.f145397o.q()) {
            ClassConstructorDescriptor classConstructorDescriptorG0 = lazyJavaClassMemberScope.G0();
            String strC = MethodSignatureMappingKt.c(classConstructorDescriptorG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(classConstructorDescriptorG0);
                lazyJavaResolverContext.a().h().a(lazyJavaClassMemberScope.f145397o, classConstructorDescriptorG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.e(MethodSignatureMappingKt.c((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(classConstructorDescriptorG0);
                lazyJavaResolverContext.a().h().a(lazyJavaClassMemberScope.f145397o, classConstructorDescriptorG0);
            }
        }
        lazyJavaResolverContext.a().w().c(lazyJavaClassMemberScope.R(), arrayList, lazyJavaResolverContext);
        SignatureEnhancement signatureEnhancementR = lazyJavaResolverContext.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayListQ = arrayList;
        if (zIsEmpty) {
            arrayListQ = CollectionsKt.q(lazyJavaClassMemberScope.F0());
        }
        return CollectionsKt.j1(signatureEnhancementR.p(lazyJavaResolverContext, arrayListQ));
    }

    private final List<ValueParameterDescriptor> E0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl2;
        Pair pair;
        Collection<JavaMethod> collectionC = this.f145397o.C();
        ArrayList arrayList = new ArrayList(collectionC.size());
        JavaTypeAttributes javaTypeAttributesB = JavaTypeAttributesKt.b(TypeUsage.f147695b, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionC) {
            if (Intrinsics.e(((JavaMethod) obj).getName(), JvmAnnotationNames.f145130c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<JavaMethod> list2 = (List) pair2.b();
        list.size();
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.u0(list);
        if (javaMethod != null) {
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair = new Pair(L().g().l(javaArrayType, javaTypeAttributesB, true), L().g().p(javaArrayType.n(), javaTypeAttributesB));
            } else {
                pair = new Pair(L().g().p(returnType, javaTypeAttributesB), null);
            }
            KotlinType kotlinType = (KotlinType) pair.a();
            KotlinType kotlinType2 = (KotlinType) pair.b();
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
            s0(arrayList, classConstructorDescriptorImpl2, 0, javaMethod, kotlinType, kotlinType2);
        } else {
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
        }
        int i10 = 0;
        int i11 = javaMethod == null ? 0 : 1;
        for (JavaMethod javaMethod2 : list2) {
            s0(arrayList, classConstructorDescriptorImpl2, i10 + i11, javaMethod2, L().g().p(javaMethod2.getReturnType(), javaTypeAttributesB), null);
            i10++;
        }
        return arrayList;
    }

    private final ClassConstructorDescriptor F0() {
        boolean zO = this.f145397o.o();
        if ((this.f145397o.K() || !this.f145397o.r()) && !zO) {
            return null;
        }
        ClassDescriptor classDescriptorR = R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorQ1 = JavaClassConstructorDescriptor.q1(classDescriptorR, Annotations.f144596s3.b(), true, L().a().t().a(this.f145397o));
        Intrinsics.i(javaClassConstructorDescriptorQ1, "createJavaConstructor(...)");
        List<ValueParameterDescriptor> listE0 = zO ? E0(javaClassConstructorDescriptorQ1) : Collections.EMPTY_LIST;
        javaClassConstructorDescriptorQ1.W0(false);
        javaClassConstructorDescriptorQ1.n1(listE0, Z0(classDescriptorR));
        javaClassConstructorDescriptorQ1.V0(true);
        javaClassConstructorDescriptorQ1.d1(classDescriptorR.o());
        L().a().h().a(this.f145397o, javaClassConstructorDescriptorQ1);
        return javaClassConstructorDescriptorQ1;
    }

    private final SimpleFunctionDescriptor H0(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!Intrinsics.e(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.p0() == null && Q0(simpleFunctionDescriptor2, callableDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.t().i().build();
                Intrinsics.g(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    private final JavaPropertyDescriptor K0(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        JavaPropertyDescriptor javaPropertyDescriptor;
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        KotlinType kotlinTypeA;
        JavaPropertyDescriptor javaPropertyDescriptorD1 = JavaPropertyDescriptor.d1(R(), LazyJavaAnnotationsKt.a(L(), javaMethod), modality, UtilsKt.d(javaMethod.getVisibility()), false, javaMethod.getName(), L().a().t().a(javaMethod), false);
        Intrinsics.i(javaPropertyDescriptorD1, "create(...)");
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplD = DescriptorFactory.d(javaPropertyDescriptorD1, Annotations.f144596s3.b());
        Intrinsics.i(propertyGetterDescriptorImplD, "createDefaultGetter(...)");
        javaPropertyDescriptorD1.S0(propertyGetterDescriptorImplD, null);
        if (kotlinType == null) {
            LazyJavaResolverContext lazyJavaResolverContextI = ContextKt.i(L(), javaPropertyDescriptorD1, javaMethod, 0, 4, null);
            javaPropertyDescriptor = javaPropertyDescriptorD1;
            lazyJavaClassMemberScope = this;
            kotlinTypeA = lazyJavaClassMemberScope.A(javaMethod, lazyJavaResolverContextI);
        } else {
            javaPropertyDescriptor = javaPropertyDescriptorD1;
            lazyJavaClassMemberScope = this;
            kotlinTypeA = kotlinType;
        }
        javaPropertyDescriptor.Z0(kotlinTypeA, CollectionsKt.m(), lazyJavaClassMemberScope.O(), null, CollectionsKt.m());
        propertyGetterDescriptorImplD.N0(kotlinTypeA);
        return javaPropertyDescriptor;
    }

    static /* synthetic */ JavaPropertyDescriptor L0(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.K0(javaMethod, kotlinType, modality);
    }

    private final List<ValueParameterDescriptor> M0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection<JavaRecordComponent> collectionM = this.f145397o.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        JavaTypeAttributes javaTypeAttributesB = JavaTypeAttributesKt.b(TypeUsage.f147695b, false, false, null, 6, null);
        Iterator<T> it = collectionM.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            JavaRecordComponent javaRecordComponent = (JavaRecordComponent) it.next();
            KotlinType kotlinTypeP = L().g().p(javaRecordComponent.getType(), javaTypeAttributesB);
            arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i11, Annotations.f144596s3.b(), javaRecordComponent.getName(), kotlinTypeP, false, false, false, javaRecordComponent.b() ? L().a().m().l().k(kotlinTypeP) : null, L().a().t().a(javaRecordComponent)));
        }
    }

    private final boolean Q0(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f147039f.F(callableDescriptor2, callableDescriptor, true).c();
        Intrinsics.i(resultC, "getResult(...)");
        return resultC == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.f145097a.a(callableDescriptor2, callableDescriptor);
    }

    private final boolean R0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.f145189a;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        Name nameB = companion.b(name);
        if (nameB == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setB1 = b1(nameB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (SpecialBuiltinMembers.d((SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorN0 = N0(simpleFunctionDescriptor, nameB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((SimpleFunctionDescriptor) it.next(), simpleFunctionDescriptorN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.f145068o.m(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.a();
        }
        Intrinsics.g(functionDescriptor);
        return Q0(functionDescriptor, simpleFunctionDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Collection<JavaField> collectionY = lazyJavaClassMemberScope.f145397o.y();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionY) {
            if (((JavaField) obj).J()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope, Name accessorName) {
        Intrinsics.j(accessorName, "accessorName");
        return Intrinsics.e(simpleFunctionDescriptor.getName(), accessorName) ? CollectionsKt.e(simpleFunctionDescriptor) : CollectionsKt.P0(lazyJavaClassMemberScope.q1(accessorName), lazyJavaClassMemberScope.r1(accessorName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.o1(lazyJavaClassMemberScope.f145397o.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor i1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext, Name name) {
        Intrinsics.j(name, "name");
        if (lazyJavaClassMemberScope.f145400r.invoke().contains(name)) {
            JavaClassFinder javaClassFinderD = lazyJavaResolverContext.a().d();
            ClassId classIdN = DescriptorUtilsKt.n(lazyJavaClassMemberScope.R());
            Intrinsics.g(classIdN);
            JavaClass javaClassA = javaClassFinderD.a(new JavaClassFinder.Request(classIdN.d(name), null, lazyJavaClassMemberScope.f145397o, 2, null));
            if (javaClassA == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.R(), javaClassA, null, 8, null);
            lazyJavaResolverContext.a().e().a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!lazyJavaClassMemberScope.f145401s.invoke().contains(name)) {
            JavaField javaField = lazyJavaClassMemberScope.f145402t.invoke().get(name);
            if (javaField == null) {
                return null;
            }
            return EnumEntrySyntheticClassDescriptor.I0(lazyJavaResolverContext.e(), lazyJavaClassMemberScope.R(), name, lazyJavaResolverContext.e().c(new s(lazyJavaClassMemberScope)), LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaField), lazyJavaResolverContext.a().t().a(javaField));
        }
        List<ClassDescriptor> listC = CollectionsKt.c();
        lazyJavaResolverContext.a().w().h(lazyJavaClassMemberScope.R(), name, listC, lazyJavaResolverContext);
        List listA = CollectionsKt.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (ClassDescriptor) CollectionsKt.U0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    private final JavaMethodDescriptor p1(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor javaMethodDescriptorM1 = JavaMethodDescriptor.m1(R(), LazyJavaAnnotationsKt.a(L(), javaRecordComponent), javaRecordComponent.getName(), L().a().t().a(javaRecordComponent), true);
        Intrinsics.i(javaMethodDescriptorM1, "createJavaMethod(...)");
        javaMethodDescriptorM1.l1(null, O(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), L().g().p(javaRecordComponent.getType(), JavaTypeAttributesKt.b(TypeUsage.f147695b, false, false, null, 6, null)), Modality.f144525a.a(false, false, true), DescriptorVisibilities.f144507e, null);
        javaMethodDescriptorM1.p1(false, false);
        L().a().h().c(javaRecordComponent, javaMethodDescriptorM1);
        return javaMethodDescriptorM1;
    }

    private final void s0(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i10, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations annotationsB = Annotations.f144596s3.b();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeN = TypeUtils.n(kotlinType);
        Intrinsics.i(kotlinTypeN, "makeNotNullable(...)");
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i10, annotationsB, name, kotlinTypeN, javaMethod.N(), false, false, kotlinType2 != null ? TypeUtils.n(kotlinType2) : null, L().a().t().a(javaMethod)));
    }

    private final boolean s1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f145069o;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        if (!builtinMethodsWithSpecialGenericSignature.n(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.i(name2, "getName(...)");
        Set<SimpleFunctionDescriptor> setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB1.iterator();
        while (it.hasNext()) {
            FunctionDescriptor functionDescriptorL = BuiltinMethodsWithSpecialGenericSignature.l((SimpleFunctionDescriptor) it.next());
            if (functionDescriptorL != null) {
                arrayList.add(functionDescriptorL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(JavaMember it) {
        Intrinsics.j(it, "it");
        return !it.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void B(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
        Set<SimpleFunctionDescriptor> setB1 = b1(name);
        if (!SpecialGenericSignatures.f145189a.k(name) && !BuiltinMethodsWithSpecialGenericSignature.f145069o.n(name)) {
            Set<SimpleFunctionDescriptor> set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((FunctionDescriptor) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(result, name, arrayList, false);
            return;
        }
        SmartSet smartSetA = SmartSet.f148085c.a();
        Collection<? extends SimpleFunctionDescriptor> collectionD = DescriptorResolverUtils.d(name, setB1, CollectionsKt.m(), R(), ErrorReporter.f147318a, L().a().k().a());
        Intrinsics.i(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(name, result, collectionD, result, new a(this));
        u0(name, result, collectionD, smartSetA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(result, name, CollectionsKt.P0(arrayList2, smartSetA), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void C(Name name, Collection<PropertyDescriptor> result) {
        Intrinsics.j(name, "name");
        Intrinsics.j(result, "result");
        if (this.f145397o.o()) {
            w0(name, result);
        }
        Set<PropertyDescriptor> setD1 = d1(name);
        if (setD1.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.f148085c;
        SmartSet smartSetA = companion.a();
        SmartSet smartSetA2 = companion.a();
        v0(setD1, result, smartSetA, new q(this));
        v0(SetsKt.j(setD1, smartSetA), smartSetA2, null, new r(this));
        Collection<? extends PropertyDescriptor> collectionD = DescriptorResolverUtils.d(name, SetsKt.l(setD1, smartSetA2), result, R(), L().a().c(), L().a().k().a());
        Intrinsics.i(collectionD, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> D(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        if (this.f145397o.o()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(N().invoke().c());
        Collection<KotlinType> collectionA = R().i().a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(linkedHashSet, ((KotlinType) it.next()).n().d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected boolean V(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.j(javaMethodDescriptor, "<this>");
        if (this.f145397o.o()) {
            return false;
        }
        return f1(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected LazyJavaScope.MethodSignatureData Y(JavaMethod method, List<? extends TypeParameterDescriptor> methodTypeParameters, KotlinType returnType, List<? extends ValueParameterDescriptor> valueParameters) {
        Intrinsics.j(method, "method");
        Intrinsics.j(methodTypeParameters, "methodTypeParameters");
        Intrinsics.j(returnType, "returnType");
        Intrinsics.j(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureA = L().a().s().a(method, R(), returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.i(propagatedSignatureA, "resolvePropagatedSignature(...)");
        KotlinType kotlinTypeD = propagatedSignatureA.d();
        Intrinsics.i(kotlinTypeD, "getReturnType(...)");
        KotlinType kotlinTypeC = propagatedSignatureA.c();
        List<ValueParameterDescriptor> listF = propagatedSignatureA.f();
        Intrinsics.i(listF, "getValueParameters(...)");
        List<TypeParameterDescriptor> listE = propagatedSignatureA.e();
        Intrinsics.i(listE, "getTypeParameters(...)");
        boolean zG = propagatedSignatureA.g();
        List<String> listB = propagatedSignatureA.b();
        Intrinsics.i(listB, "getErrors(...)");
        return new LazyJavaScope.MethodSignatureData(kotlinTypeD, kotlinTypeC, listF, listE, zG, listB);
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> a1() {
        return this.f145399q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        n1(name, location);
        return super.b(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        n1(name, location);
        return super.c(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor R() {
        return this.f145396n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor classDescriptorInvoke;
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        n1(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) Q();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f145403u) == null || (classDescriptorInvoke = memoizedFunctionToNullable.invoke(name)) == null) ? this.f145403u.invoke(name) : classDescriptorInvoke;
    }

    public void n1(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.a(L().a().l(), location, R(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.f145397o.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> v(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        return SetsKt.l(this.f145400r.invoke(), this.f145402t.invoke().keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<Name> x(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        Collection<KotlinType> collectionA = R().i().a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(linkedHashSet, ((KotlinType) it.next()).n().a());
        }
        linkedHashSet.addAll(N().invoke().a());
        linkedHashSet.addAll(N().invoke().b());
        linkedHashSet.addAll(v(kindFilter, function1));
        linkedHashSet.addAll(L().a().w().b(R(), L()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void y(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
        if (this.f145397o.q() && N().invoke().e(name) != null) {
            Collection<SimpleFunctionDescriptor> collection = result;
            if (collection.isEmpty()) {
                JavaRecordComponent javaRecordComponentE = N().invoke().e(name);
                Intrinsics.g(javaRecordComponentE);
                result.add(p1(javaRecordComponentE));
            } else {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((SimpleFunctionDescriptor) it.next()).h().isEmpty()) {
                        break;
                    }
                }
                JavaRecordComponent javaRecordComponentE2 = N().invoke().e(name);
                Intrinsics.g(javaRecordComponentE2);
                result.add(p1(javaRecordComponentE2));
            }
        }
        L().a().w().e(R(), name, result, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex z() {
        return new ClassDeclaredMemberIndex(this.f145397o, C15353o.f145469a);
    }

    private final ClassConstructorDescriptor G0() {
        ClassDescriptor classDescriptorR = R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorQ1 = JavaClassConstructorDescriptor.q1(classDescriptorR, Annotations.f144596s3.b(), true, L().a().t().a(this.f145397o));
        Intrinsics.i(javaClassConstructorDescriptorQ1, "createJavaConstructor(...)");
        List<ValueParameterDescriptor> listM0 = M0(javaClassConstructorDescriptorQ1);
        javaClassConstructorDescriptorQ1.W0(false);
        javaClassConstructorDescriptorQ1.n1(listM0, Z0(classDescriptorR));
        javaClassConstructorDescriptorQ1.V0(false);
        javaClassConstructorDescriptorQ1.d1(classDescriptorR.o());
        return javaClassConstructorDescriptorQ1;
    }

    private final SimpleFunctionDescriptor I0(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object next;
        Name name = functionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (e1((SimpleFunctionDescriptor) next, functionDescriptor)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderT = simpleFunctionDescriptor.t();
        List<ValueParameterDescriptor> listH = functionDescriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = listH;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
        }
        List<ValueParameterDescriptor> listH2 = simpleFunctionDescriptor.h();
        Intrinsics.i(listH2, "getValueParameters(...)");
        copyBuilderT.b(UtilKt.a(arrayList, listH2, functionDescriptor));
        copyBuilderT.t();
        copyBuilderT.l();
        copyBuilderT.g(JavaMethodDescriptor.f145271H, Boolean.TRUE);
        return (SimpleFunctionDescriptor) copyBuilderT.build();
    }

    private final JavaPropertyDescriptor J0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorX0;
        PropertySetterDescriptorImpl propertySetterDescriptorImplM = null;
        if (!P0(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorW0 = W0(propertyDescriptor, function1);
        Intrinsics.g(simpleFunctionDescriptorW0);
        if (propertyDescriptor.L()) {
            simpleFunctionDescriptorX0 = X0(propertyDescriptor, function1);
            Intrinsics.g(simpleFunctionDescriptorX0);
        } else {
            simpleFunctionDescriptorX0 = null;
        }
        if (simpleFunctionDescriptorX0 != null) {
            simpleFunctionDescriptorX0.q();
            simpleFunctionDescriptorW0.q();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(R(), simpleFunctionDescriptorW0, simpleFunctionDescriptorX0, propertyDescriptor);
        KotlinType returnType = simpleFunctionDescriptorW0.getReturnType();
        Intrinsics.g(returnType);
        javaForKotlinOverridePropertyDescriptor.Z0(returnType, CollectionsKt.m(), O(), null, CollectionsKt.m());
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplK = DescriptorFactory.k(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorW0.getAnnotations(), false, false, false, simpleFunctionDescriptorW0.g());
        propertyGetterDescriptorImplK.K0(simpleFunctionDescriptorW0);
        propertyGetterDescriptorImplK.N0(javaForKotlinOverridePropertyDescriptor.getType());
        Intrinsics.i(propertyGetterDescriptorImplK, "apply(...)");
        if (simpleFunctionDescriptorX0 != null) {
            List<ValueParameterDescriptor> listH = simpleFunctionDescriptorX0.h();
            Intrinsics.i(listH, "getValueParameters(...)");
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.u0(listH);
            if (valueParameterDescriptor != null) {
                propertySetterDescriptorImplM = DescriptorFactory.m(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorX0.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorX0.getVisibility(), simpleFunctionDescriptorX0.g());
                propertySetterDescriptorImplM.K0(simpleFunctionDescriptorX0);
            } else {
                throw new AssertionError("No parameter found for " + simpleFunctionDescriptorX0);
            }
        }
        javaForKotlinOverridePropertyDescriptor.S0(propertyGetterDescriptorImplK, propertySetterDescriptorImplM);
        return javaForKotlinOverridePropertyDescriptor;
    }

    private final SimpleFunctionDescriptor N0(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderT = simpleFunctionDescriptor.t();
        copyBuilderT.j(name);
        copyBuilderT.t();
        copyBuilderT.l();
        FunctionDescriptor functionDescriptorBuild = copyBuilderT.build();
        Intrinsics.g(functionDescriptorBuild);
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor O0(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.F0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.K0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.d()
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.m()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.f144222v
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r6.t()
            java.util.List r6 = r6.h()
            kotlin.jvm.internal.Intrinsics.i(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.CollectionsKt.k0(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r2.b(r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.I0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r6.m(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 == 0) goto L7c
            r0.e1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.O0(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    private final boolean P0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorW0 = W0(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorX0 = X0(propertyDescriptor, function1);
        if (simpleFunctionDescriptorW0 == null) {
            return false;
        }
        if (!propertyDescriptor.L()) {
            return true;
        }
        if (simpleFunctionDescriptorX0 == null || simpleFunctionDescriptorX0.q() != simpleFunctionDescriptorW0.q()) {
            return false;
        }
        return true;
    }

    private final boolean T0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptorO0 = O0(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorO0 == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        Set<SimpleFunctionDescriptor> setB1 = b1(name);
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : setB1) {
            if (simpleFunctionDescriptor2.isSuspend() && Q0(simpleFunctionDescriptorO0, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    private final SimpleFunctionDescriptor V0(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        boolean zD;
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        Iterator<T> it = function1.invoke(nameO).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.h().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f147723a;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null) {
                    zD = false;
                } else {
                    zD = kotlinTypeChecker.d(returnType, propertyDescriptor.getType());
                }
                if (zD) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor W0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor propertyGetterDescriptor;
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        String strB = null;
        if (getter != null) {
            propertyGetterDescriptor = (PropertyGetterDescriptor) SpecialBuiltinMembers.g(getter);
        } else {
            propertyGetterDescriptor = null;
        }
        if (propertyGetterDescriptor != null) {
            strB = ClassicBuiltinSpecialProperties.f145076a.b(propertyGetterDescriptor);
        }
        if (strB != null && !SpecialBuiltinMembers.l(R(), propertyGetterDescriptor)) {
            return V0(propertyDescriptor, strB, function1);
        }
        String strB2 = propertyDescriptor.getName().b();
        Intrinsics.i(strB2, "asString(...)");
        return V0(propertyDescriptor, JvmAbi.b(strB2), function1);
    }

    private final SimpleFunctionDescriptor X0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strB = propertyDescriptor.getName().b();
        Intrinsics.i(strB, "asString(...)");
        Name nameO = Name.o(JvmAbi.e(strB));
        Intrinsics.i(nameO, "identifier(...)");
        Iterator<T> it = function1.invoke(nameO).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.h().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.D0(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f147723a;
                List<ValueParameterDescriptor> listH = simpleFunctionDescriptor2.h();
                Intrinsics.i(listH, "getValueParameters(...)");
                if (kotlinTypeChecker.b(((ValueParameterDescriptor) CollectionsKt.U0(listH)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.o1(lazyJavaResolverContext.a().w().a(lazyJavaClassMemberScope.R(), lazyJavaResolverContext));
    }

    private final DescriptorVisibility Z0(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        Intrinsics.i(visibility, "getVisibility(...)");
        if (Intrinsics.e(visibility, JavaDescriptorVisibilities.f145094b)) {
            DescriptorVisibility PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.f145095c;
            Intrinsics.i(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            return PROTECTED_AND_PACKAGE;
        }
        return visibility;
    }

    private final Set<SimpleFunctionDescriptor> b1(Name name) {
        Collection<KotlinType> collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(linkedHashSet, ((KotlinType) it.next()).n().b(name, NoLookupLocation.f145036o));
        }
        return linkedHashSet;
    }

    private final Set<PropertyDescriptor> d1(Name name) {
        Collection<KotlinType> collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> collectionC = ((KotlinType) it.next()).n().c(name, NoLookupLocation.f145036o);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(collectionC, 10));
            Iterator<T> it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.C(arrayList, arrayList2);
        }
        return CollectionsKt.o1(arrayList);
    }

    private final boolean f1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        List<Name> listA = PropertiesConventionUtilKt.a(name);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setD1 = d1((Name) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setD1) {
                        if (P0(propertyDescriptor, new p(simpleFunctionDescriptor, this))) {
                            if (!propertyDescriptor.L()) {
                                String strB = simpleFunctionDescriptor.getName().b();
                                Intrinsics.i(strB, "asString(...)");
                                if (!JvmAbi.d(strB)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        if (R0(simpleFunctionDescriptor) || s1(simpleFunctionDescriptor) || T0(simpleFunctionDescriptor)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return SetsKt.l(lazyJavaClassMemberScope.a(), lazyJavaClassMemberScope.d());
    }

    private final SimpleFunctionDescriptor k1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptorI0;
        FunctionDescriptor functionDescriptorL = BuiltinMethodsWithSpecialGenericSignature.l(simpleFunctionDescriptor);
        if (functionDescriptorL != null && (simpleFunctionDescriptorI0 = I0(functionDescriptorL, function1)) != null) {
            if (!f1(simpleFunctionDescriptorI0)) {
                simpleFunctionDescriptorI0 = null;
            }
            if (simpleFunctionDescriptorI0 != null) {
                return H0(simpleFunctionDescriptorI0, functionDescriptorL, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor l1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.g(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String strE = SpecialBuiltinMembers.e(simpleFunctionDescriptor2);
        Intrinsics.g(strE);
        Name nameO = Name.o(strE);
        Intrinsics.i(nameO, "identifier(...)");
        Iterator<? extends SimpleFunctionDescriptor> it = function1.invoke(nameO).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorN0 = N0(it.next(), name);
            if (S0(simpleFunctionDescriptor2, simpleFunctionDescriptorN0)) {
                return H0(simpleFunctionDescriptorN0, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor m1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorO0 = O0((SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptorO0 == null || !Q0(simpleFunctionDescriptorO0, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorO0 = null;
            }
            if (simpleFunctionDescriptorO0 != null) {
                return simpleFunctionDescriptorO0;
            }
        }
        return null;
    }

    private final JavaClassConstructorDescriptor o1(JavaConstructor javaConstructor) {
        ClassDescriptor classDescriptorR = R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorQ1 = JavaClassConstructorDescriptor.q1(classDescriptorR, LazyJavaAnnotationsKt.a(L(), javaConstructor), false, L().a().t().a(javaConstructor));
        Intrinsics.i(javaClassConstructorDescriptorQ1, "createJavaConstructor(...)");
        LazyJavaResolverContext lazyJavaResolverContextH = ContextKt.h(L(), javaClassConstructorDescriptorQ1, javaConstructor, classDescriptorR.p().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersD0 = d0(lazyJavaResolverContextH, javaClassConstructorDescriptorQ1, javaConstructor.h());
        List<TypeParameterDescriptor> listP = classDescriptorR.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> list = listP;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContextH.f().a((JavaTypeParameter) it.next());
            Intrinsics.g(typeParameterDescriptorA);
            arrayList.add(typeParameterDescriptorA);
        }
        javaClassConstructorDescriptorQ1.o1(resolvedValueParametersD0.a(), UtilsKt.d(javaConstructor.getVisibility()), CollectionsKt.P0(list, arrayList));
        javaClassConstructorDescriptorQ1.V0(false);
        javaClassConstructorDescriptorQ1.W0(resolvedValueParametersD0.b());
        javaClassConstructorDescriptorQ1.d1(classDescriptorR.o());
        lazyJavaResolverContextH.a().h().a(javaConstructor, javaClassConstructorDescriptorQ1);
        return javaClassConstructorDescriptorQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> q1(Name name) {
        Collection<JavaMethod> collectionD = N().invoke().d(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionD, 10));
        Iterator<T> it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> r1(Name name) {
        Set<SimpleFunctionDescriptor> setB1 = b1(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.d(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.l(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void t0(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z10) {
        Collection<? extends SimpleFunctionDescriptor> collectionD = DescriptorResolverUtils.d(name, collection2, collection, R(), L().a().c(), L().a().k().a());
        Intrinsics.i(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = collectionD;
        List listP0 = CollectionsKt.P0(collection, collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection3, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorH0 : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.j(simpleFunctionDescriptorH0);
            if (simpleFunctionDescriptor == null) {
                Intrinsics.g(simpleFunctionDescriptorH0);
            } else {
                Intrinsics.g(simpleFunctionDescriptorH0);
                simpleFunctionDescriptorH0 = H0(simpleFunctionDescriptorH0, simpleFunctionDescriptor, listP0);
            }
            arrayList.add(simpleFunctionDescriptorH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(collection3, l1(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(collection3, k1(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(collection3, m1(simpleFunctionDescriptor, function1));
        }
    }

    private final void v0(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptorJ0 = J0(propertyDescriptor, function1);
            if (javaPropertyDescriptorJ0 != null) {
                collection.add(javaPropertyDescriptorJ0);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.V0(N().invoke().d(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(L0(this, javaMethod, null, Modality.f144526b, 2, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected ReceiverParameterDescriptor O() {
        return DescriptorUtils.l(R());
    }
}
