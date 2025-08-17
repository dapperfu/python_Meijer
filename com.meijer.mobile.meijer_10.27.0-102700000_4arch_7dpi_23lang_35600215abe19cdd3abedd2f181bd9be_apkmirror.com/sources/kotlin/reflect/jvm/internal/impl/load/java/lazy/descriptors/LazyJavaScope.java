package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144515m = {Reflection.j(new PropertyReference1Impl(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), Reflection.j(new PropertyReference1Impl(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), Reflection.j(new PropertyReference1Impl(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f144516b;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaScope f144517c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> f144518d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue<DeclaredMemberIndex> f144519e;

    /* renamed from: f, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f144520f;

    /* renamed from: g, reason: collision with root package name */
    private final MemoizedFunctionToNullable<Name, PropertyDescriptor> f144521g;

    /* renamed from: h, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f144522h;

    /* renamed from: i, reason: collision with root package name */
    private final NotNullLazyValue f144523i;

    /* renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue f144524j;

    /* renamed from: k, reason: collision with root package name */
    private final NotNullLazyValue f144525k;

    /* renamed from: l, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f144526l;

    protected static final class MethodSignatureData {

        /* renamed from: a, reason: collision with root package name */
        private final KotlinType f144527a;

        /* renamed from: b, reason: collision with root package name */
        private final KotlinType f144528b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f144529c;

        /* renamed from: d, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f144530d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f144531e;

        /* renamed from: f, reason: collision with root package name */
        private final List<String> f144532f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.e(this.f144527a, methodSignatureData.f144527a) && Intrinsics.e(this.f144528b, methodSignatureData.f144528b) && Intrinsics.e(this.f144529c, methodSignatureData.f144529c) && Intrinsics.e(this.f144530d, methodSignatureData.f144530d) && this.f144531e == methodSignatureData.f144531e && Intrinsics.e(this.f144532f, methodSignatureData.f144532f);
        }

        public int hashCode() {
            int iHashCode = this.f144527a.hashCode() * 31;
            KotlinType kotlinType = this.f144528b;
            return ((((((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.f144529c.hashCode()) * 31) + this.f144530d.hashCode()) * 31) + Boolean.hashCode(this.f144531e)) * 31) + this.f144532f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f144527a + ", receiverType=" + this.f144528b + ", valueParameters=" + this.f144529c + ", typeParameters=" + this.f144530d + ", hasStableParameterNames=" + this.f144531e + ", errors=" + this.f144532f + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(KotlinType returnType, KotlinType kotlinType, List<? extends ValueParameterDescriptor> valueParameters, List<? extends TypeParameterDescriptor> typeParameters, boolean z10, List<String> errors) {
            Intrinsics.j(returnType, "returnType");
            Intrinsics.j(valueParameters, "valueParameters");
            Intrinsics.j(typeParameters, "typeParameters");
            Intrinsics.j(errors, "errors");
            this.f144527a = returnType;
            this.f144528b = kotlinType;
            this.f144529c = valueParameters;
            this.f144530d = typeParameters;
            this.f144531e = z10;
            this.f144532f = errors;
        }

        public final List<String> a() {
            return this.f144532f;
        }

        public final boolean b() {
            return this.f144531e;
        }

        public final KotlinType c() {
            return this.f144528b;
        }

        public final KotlinType d() {
            return this.f144527a;
        }

        public final List<TypeParameterDescriptor> e() {
            return this.f144530d;
        }

        public final List<ValueParameterDescriptor> f() {
            return this.f144529c;
        }
    }

    protected static final class ResolvedValueParameters {

        /* renamed from: a, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f144533a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f144534b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> descriptors, boolean z10) {
            Intrinsics.j(descriptors, "descriptors");
            this.f144533a = descriptors;
            this.f144534b = z10;
        }

        public final List<ValueParameterDescriptor> a() {
            return this.f144533a;
        }

        public final boolean b() {
            return this.f144534b;
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    private final void e0(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = MethodSignatureMappingKt.c((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> collectionB = OverridingUtilsKt.b(list2, J.f144452a);
                set.removeAll(list2);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor f0(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
        Intrinsics.j(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    protected abstract void B(Collection<SimpleFunctionDescriptor> collection, Name name);

    protected abstract void C(Name name, Collection<PropertyDescriptor> collection);

    protected abstract Set<Name> D(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    protected abstract ReceiverParameterDescriptor O();

    protected abstract DeclarationDescriptor R();

    protected boolean V(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.j(javaMethodDescriptor, "<this>");
        return true;
    }

    protected abstract MethodSignatureData Y(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2);

    protected abstract Set<Name> v(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    protected abstract Set<Name> x(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    protected void y(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
    }

    protected abstract DeclaredMemberIndex z();

    public LazyJavaScope(LazyJavaResolverContext c10, LazyJavaScope lazyJavaScope) {
        Intrinsics.j(c10, "c");
        this.f144516b = c10;
        this.f144517c = lazyJavaScope;
        this.f144518d = c10.e().b(new y(this), CollectionsKt.m());
        this.f144519e = c10.e().c(new B(this));
        this.f144520f = c10.e().i(new C(this));
        this.f144521g = c10.e().g(new D(this));
        this.f144522h = c10.e().i(new E(this));
        this.f144523i = c10.e().c(new F(this));
        this.f144524j = c10.e().c(new G(this));
        this.f144525k = c10.e().c(new H(this));
        this.f144526l = c10.e().i(new I(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor F(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.j(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f144517c;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f144521g.invoke(name);
        }
        JavaField javaFieldF = lazyJavaScope.f144519e.invoke().f(name);
        if (javaFieldF == null || javaFieldF.J()) {
            return null;
        }
        return lazyJavaScope.a0(javaFieldF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.j(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f144517c;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f144520f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : lazyJavaScope.f144519e.invoke().d(name)) {
            JavaMethodDescriptor javaMethodDescriptorZ = lazyJavaScope.Z(javaMethod);
            if (lazyJavaScope.V(javaMethodDescriptorZ)) {
                lazyJavaScope.f144516b.a().h().c(javaMethod, javaMethodDescriptorZ);
                arrayList.add(javaMethodDescriptorZ);
            }
        }
        lazyJavaScope.y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.x(DescriptorKindFilter.f146274v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.j(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(lazyJavaScope.f144520f.invoke(name));
        lazyJavaScope.e0(linkedHashSet);
        lazyJavaScope.B(linkedHashSet, name);
        return CollectionsKt.j1(lazyJavaScope.f144516b.a().r().p(lazyJavaScope.f144516b, linkedHashSet));
    }

    private final Set<Name> M() {
        return (Set) StorageKt.a(this.f144525k, this, f144515m[2]);
    }

    private final Set<Name> P() {
        return (Set) StorageKt.a(this.f144523i, this, f144515m[0]);
    }

    private final Set<Name> S() {
        return (Set) StorageKt.a(this.f144524j, this, f144515m[1]);
    }

    private final KotlinType T(JavaField javaField) {
        KotlinType kotlinTypeP = this.f144516b.g().p(javaField.getType(), JavaTypeAttributesKt.b(TypeUsage.f146788b, false, false, null, 7, null));
        if ((!KotlinBuiltIns.t0(kotlinTypeP) && !KotlinBuiltIns.w0(kotlinTypeP)) || !U(javaField) || !javaField.O()) {
            return kotlinTypeP;
        }
        KotlinType kotlinTypeN = TypeUtils.n(kotlinTypeP);
        Intrinsics.i(kotlinTypeN, "makeNotNullable(...)");
        return kotlinTypeN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.j(name, "name");
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, lazyJavaScope.f144521g.invoke(name));
        lazyJavaScope.C(name, arrayList);
        return DescriptorUtils.t(lazyJavaScope.R()) ? CollectionsKt.j1(arrayList) : CollectionsKt.j1(lazyJavaScope.f144516b.a().r().p(lazyJavaScope.f144516b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.D(DescriptorKindFilter.f146275w, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    private final PropertyDescriptor a0(JavaField javaField) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E10 = E(javaField);
        objectRef.f142835a = E10;
        E10.T0(null, null, null, null);
        ((PropertyDescriptorImpl) objectRef.f142835a).Z0(T(javaField), CollectionsKt.m(), O(), null, CollectionsKt.m());
        DeclarationDescriptor declarationDescriptorR = R();
        ClassDescriptor classDescriptor = declarationDescriptorR instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorR : null;
        if (classDescriptor != null) {
            objectRef.f142835a = this.f144516b.a().w().f(classDescriptor, (PropertyDescriptorImpl) objectRef.f142835a, this.f144516b);
        }
        T t10 = objectRef.f142835a;
        if (DescriptorUtils.K((VariableDescriptor) t10, ((PropertyDescriptorImpl) t10).getType())) {
            ((PropertyDescriptorImpl) objectRef.f142835a).J0(new z(this, javaField, objectRef));
        }
        this.f144516b.a().h().b(javaField, (PropertyDescriptor) objectRef.f142835a);
        return (PropertyDescriptor) objectRef.f142835a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue b0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f144516b.e().e(new A(lazyJavaScope, javaField, objectRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue c0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f144516b.a().g().a(javaField, (PropertyDescriptor) objectRef.f142835a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.w(DescriptorKindFilter.f146267o, MemberScope.f146290a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.v(DescriptorKindFilter.f146272t, null);
    }

    protected final KotlinType A(JavaMethod method, LazyJavaResolverContext c10) {
        Intrinsics.j(method, "method");
        Intrinsics.j(c10, "c");
        return c10.g().p(method.getReturnType(), JavaTypeAttributesKt.b(TypeUsage.f146788b, method.P().o(), false, null, 6, null));
    }

    protected final NotNullLazyValue<Collection<DeclarationDescriptor>> K() {
        return this.f144518d;
    }

    protected final LazyJavaResolverContext L() {
        return this.f144516b;
    }

    protected final NotNullLazyValue<DeclaredMemberIndex> N() {
        return this.f144519e;
    }

    protected final LazyJavaScope Q() {
        return this.f144517c;
    }

    protected final JavaMethodDescriptor Z(JavaMethod method) {
        Intrinsics.j(method, "method");
        JavaMethodDescriptor javaMethodDescriptorM1 = JavaMethodDescriptor.m1(R(), LazyJavaAnnotationsKt.a(this.f144516b, method), method.getName(), this.f144516b.a().t().a(method), this.f144519e.invoke().e(method.getName()) != null && method.h().isEmpty());
        Intrinsics.i(javaMethodDescriptorM1, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextI = ContextKt.i(this.f144516b, javaMethodDescriptorM1, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt.x(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContextI.f().a((JavaTypeParameter) it.next());
            Intrinsics.g(typeParameterDescriptorA);
            arrayList.add(typeParameterDescriptorA);
        }
        ResolvedValueParameters resolvedValueParametersD0 = d0(lazyJavaResolverContextI, javaMethodDescriptorM1, method.h());
        MethodSignatureData methodSignatureDataY = Y(method, arrayList, A(method, lazyJavaResolverContextI), resolvedValueParametersD0.a());
        KotlinType kotlinTypeC = methodSignatureDataY.c();
        javaMethodDescriptorM1.l1(kotlinTypeC != null ? DescriptorFactory.i(javaMethodDescriptorM1, kotlinTypeC, Annotations.f143689s3.b()) : null, O(), CollectionsKt.m(), methodSignatureDataY.e(), methodSignatureDataY.f(), methodSignatureDataY.d(), Modality.f143618a.a(false, method.isAbstract(), !method.isFinal()), UtilsKt.d(method.getVisibility()), methodSignatureDataY.c() != null ? MapsKt.g(TuplesKt.a(JavaMethodDescriptor.f144363G, CollectionsKt.s0(resolvedValueParametersD0.a()))) : MapsKt.k());
        javaMethodDescriptorM1.p1(methodSignatureDataY.b(), resolvedValueParametersD0.b());
        if (!methodSignatureDataY.a().isEmpty()) {
            lazyJavaResolverContextI.a().s().b(javaMethodDescriptorM1, methodSignatureDataY.a());
        }
        return javaMethodDescriptorM1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return !a().contains(name) ? CollectionsKt.m() : this.f144522h.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return !d().contains(name) ? CollectionsKt.m() : this.f144526l.invoke(name);
    }

    protected final ResolvedValueParameters d0(LazyJavaResolverContext c10, FunctionDescriptor functionDescriptor, List<? extends JavaValueParameter> jValueParameters) {
        Pair pairA;
        Name name;
        Intrinsics.j(c10, "c");
        FunctionDescriptor function = functionDescriptor;
        Intrinsics.j(function, "function");
        Intrinsics.j(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableS1 = CollectionsKt.s1(jValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterableS1, 10));
        boolean z10 = false;
        for (IndexedValue indexedValue : iterableS1) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.b();
            Annotations annotationsA = LazyJavaAnnotationsKt.a(c10, javaValueParameter);
            JavaTypeAttributes javaTypeAttributesB = JavaTypeAttributesKt.b(TypeUsage.f146788b, false, false, null, 7, null);
            if (javaValueParameter.b()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeL = c10.g().l(javaArrayType, javaTypeAttributesB, true);
                pairA = TuplesKt.a(kotlinTypeL, c10.d().l().k(kotlinTypeL));
            } else {
                pairA = TuplesKt.a(c10.g().p(javaValueParameter.getType(), javaTypeAttributesB), null);
            }
            KotlinType kotlinType = (KotlinType) pairA.a();
            KotlinType kotlinType2 = (KotlinType) pairA.b();
            if (Intrinsics.e(function.getName().b(), "equals") && jValueParameters.size() == 1 && Intrinsics.e(c10.d().l().J(), kotlinType)) {
                name = Name.o("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = Name.o(sb2.toString());
                    Intrinsics.i(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            Intrinsics.g(name);
            arrayList.add(new ValueParameterDescriptorImpl(function, null, index, annotationsA, name, kotlinType, false, false, false, kotlinType2, c10.a().t().a(javaValueParameter)));
            function = functionDescriptor;
            z10 = z11;
        }
        return new ResolvedValueParameters(CollectionsKt.j1(arrayList), z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        return this.f144518d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected final List<DeclarationDescriptor> w(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.f144127m;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(DescriptorKindFilter.f146255c.c())) {
            for (Name name : v(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(linkedHashSet, f(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(DescriptorKindFilter.f146255c.d()) && !kindFilter.l().contains(DescriptorKindExclude.NonExtensions.f146252a)) {
            for (Name name2 : x(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(b(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(DescriptorKindFilter.f146255c.i()) && !kindFilter.l().contains(DescriptorKindExclude.NonExtensions.f146252a)) {
            for (Name name3 : D(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(c(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.j1(linkedHashSet);
    }

    private final PropertyDescriptorImpl E(JavaField javaField) {
        JavaPropertyDescriptor javaPropertyDescriptorD1 = JavaPropertyDescriptor.d1(R(), LazyJavaAnnotationsKt.a(this.f144516b, javaField), Modality.f143619b, UtilsKt.d(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f144516b.a().t().a(javaField), U(javaField));
        Intrinsics.i(javaPropertyDescriptorD1, "create(...)");
        return javaPropertyDescriptorD1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclaredMemberIndex H(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.z();
    }

    private final boolean U(JavaField javaField) {
        if (javaField.isFinal() && javaField.g()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        return P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        return S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return M();
    }
}
