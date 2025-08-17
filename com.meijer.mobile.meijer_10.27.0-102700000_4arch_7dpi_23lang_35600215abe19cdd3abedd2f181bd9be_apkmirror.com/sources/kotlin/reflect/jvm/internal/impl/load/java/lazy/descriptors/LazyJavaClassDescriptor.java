package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.sequences.Sequence;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    /* renamed from: y, reason: collision with root package name */
    public static final Companion f144469y = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    private static final Set<String> f144470z = SetsKt.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i, reason: collision with root package name */
    private final LazyJavaResolverContext f144471i;

    /* renamed from: j, reason: collision with root package name */
    private final JavaClass f144472j;

    /* renamed from: k, reason: collision with root package name */
    private final ClassDescriptor f144473k;

    /* renamed from: l, reason: collision with root package name */
    private final LazyJavaResolverContext f144474l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f144475m;

    /* renamed from: n, reason: collision with root package name */
    private final ClassKind f144476n;

    /* renamed from: o, reason: collision with root package name */
    private final Modality f144477o;

    /* renamed from: p, reason: collision with root package name */
    private final Visibility f144478p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f144479q;

    /* renamed from: r, reason: collision with root package name */
    private final a f144480r;

    /* renamed from: s, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144481s;

    /* renamed from: t, reason: collision with root package name */
    private final ScopesHolderForClass<LazyJavaClassMemberScope> f144482t;

    /* renamed from: u, reason: collision with root package name */
    private final InnerClassesScopeWrapper f144483u;

    /* renamed from: v, reason: collision with root package name */
    private final LazyJavaStaticClassScope f144484v;

    /* renamed from: w, reason: collision with root package name */
    private final Annotations f144485w;

    /* renamed from: x, reason: collision with root package name */
    private final NotNullLazyValue<List<TypeParameterDescriptor>> f144486x;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class a extends AbstractClassTypeConstructor {

        /* renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue<List<TypeParameterDescriptor>> f144487d;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return true;
        }

        public a() {
            super(LazyJavaClassDescriptor.this.f144474l.e());
            this.f144487d = LazyJavaClassDescriptor.this.f144474l.e().c(new C15244i(LazyJavaClassDescriptor.this));
        }

        private final FqName L() {
            String strB;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.f144238r;
            Intrinsics.i(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor annotationDescriptorI = annotations.i(PURELY_IMPLEMENTS_ANNOTATION);
            if (annotationDescriptorI == null) {
                return null;
            }
            Object objV0 = CollectionsKt.V0(annotationDescriptorI.a().values());
            StringValue stringValue = objV0 instanceof StringValue ? (StringValue) objV0 : null;
            if (stringValue == null || (strB = stringValue.b()) == null || !FqNamesUtilKt.e(strB)) {
                return null;
            }
            return new FqName(strB);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: I */
        public ClassDescriptor d() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return this.f144487d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> r() {
            Collection<JavaClassifierType> collectionA = LazyJavaClassDescriptor.this.P0().a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            ArrayList<JavaType> arrayList2 = new ArrayList(0);
            KotlinType kotlinTypeK = K();
            Iterator<JavaClassifierType> it = collectionA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType kotlinTypeQ = LazyJavaClassDescriptor.this.f144474l.a().r().q(LazyJavaClassDescriptor.this.f144474l.g().p(next, JavaTypeAttributesKt.b(TypeUsage.f146787a, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f144474l);
                if (kotlinTypeQ.K0().d() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.e(kotlinTypeQ.K0(), kotlinTypeK != null ? kotlinTypeK.K0() : null) && !KotlinBuiltIns.c0(kotlinTypeQ)) {
                    arrayList.add(kotlinTypeQ);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.f144473k;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, classDescriptor != null ? MappingUtilKt.a(classDescriptor, LazyJavaClassDescriptor.this).c().p(classDescriptor.o(), Variance.f146796e) : null);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, kotlinTypeK);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterC = LazyJavaClassDescriptor.this.f144474l.a().c();
                ClassDescriptor classDescriptorD = d();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
                for (JavaType javaType : arrayList2) {
                    Intrinsics.h(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((JavaClassifierType) javaType).F());
                }
                errorReporterC.b(classDescriptorD, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.j1(arrayList) : CollectionsKt.e(LazyJavaClassDescriptor.this.f144474l.d().l().i());
        }

        public String toString() {
            String strB = LazyJavaClassDescriptor.this.getName().b();
            Intrinsics.i(strB, "asString(...)");
            return strB;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker v() {
            return LazyJavaClassDescriptor.this.f144474l.a().v();
        }

        private final KotlinType K() {
            FqName fqNameB;
            ArrayList arrayList;
            FqName fqNameL = L();
            if (fqNameL == null || fqNameL.c() || !fqNameL.h(StandardNames.f143319z)) {
                fqNameL = null;
            }
            if (fqNameL == null) {
                fqNameB = FakePureImplementationsProvider.f144171a.b(DescriptorUtilsKt.o(LazyJavaClassDescriptor.this));
                if (fqNameB == null) {
                    return null;
                }
            } else {
                fqNameB = fqNameL;
            }
            ClassDescriptor classDescriptorB = DescriptorUtilsKt.B(LazyJavaClassDescriptor.this.f144474l.d(), fqNameB, NoLookupLocation.f144133s);
            if (classDescriptorB == null) {
                return null;
            }
            int size = classDescriptorB.i().getParameters().size();
            List<TypeParameterDescriptor> parameters = LazyJavaClassDescriptor.this.i().getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<TypeParameterDescriptor> list = parameters;
                arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(Variance.f146796e, ((TypeParameterDescriptor) it.next()).o()));
                }
            } else {
                if (size2 != 1 || size <= 1 || fqNameL != null) {
                    return null;
                }
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.f146796e, ((TypeParameterDescriptor) CollectionsKt.U0(parameters)).o());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(intRange, 10));
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(typeProjectionImpl);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.h(TypeAttributes.f146740b.k(), classDescriptorB, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            return TypeParameterUtilsKt.g(lazyJavaClassDescriptor);
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i10 & 8) != 0 ? null : classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor C() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean F0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean b0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor k0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean r() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        Modality modalityA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        Intrinsics.j(outerContext, "outerContext");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(jClass, "jClass");
        this.f144471i = outerContext;
        this.f144472j = jClass;
        this.f144473k = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextF = ContextKt.f(outerContext, this, jClass, 0, 4, null);
        this.f144474l = lazyJavaResolverContextF;
        lazyJavaResolverContextF.a().h().e(jClass, this);
        jClass.L();
        this.f144475m = LazyKt.b(new C15241f(this));
        this.f144476n = jClass.o() ? ClassKind.f143589f : jClass.K() ? ClassKind.f143586c : jClass.w() ? ClassKind.f143587d : ClassKind.f143585b;
        if (jClass.o() || jClass.w()) {
            modalityA = Modality.f143619b;
        } else {
            modalityA = Modality.f143618a.a(jClass.z(), jClass.z() || jClass.isAbstract() || jClass.K(), !jClass.isFinal());
        }
        this.f144477o = modalityA;
        this.f144478p = jClass.getVisibility();
        this.f144479q = (jClass.l() == null || jClass.g()) ? false : true;
        this.f144480r = new a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextF, this, jClass, classDescriptor != null, null, 16, null);
        this.f144481s = lazyJavaClassMemberScope;
        this.f144482t = ScopesHolderForClass.f143641e.a(this, lazyJavaResolverContextF.e(), lazyJavaResolverContextF.a().k().c(), new C15242g(this));
        this.f144483u = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f144484v = new LazyJavaStaticClassScope(lazyJavaResolverContextF, jClass, this);
        this.f144485w = LazyJavaAnnotationsKt.a(lazyJavaResolverContextF, jClass);
        this.f144486x = lazyJavaResolverContextF.e().c(new C15243h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f144472j.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaClassDescriptor.f144474l.f().a(javaTypeParameter);
            if (typeParameterDescriptorA == null) {
                throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.f144472j + ", so it must be resolved");
            }
            arrayList.add(typeParameterDescriptorA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaClassMemberScope U0(LazyJavaClassDescriptor lazyJavaClassDescriptor, KotlinTypeRefiner it) {
        Intrinsics.j(it, "it");
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f144474l, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f144472j, lazyJavaClassDescriptor.f144473k != null, lazyJavaClassDescriptor.f144481s);
    }

    public final LazyJavaClassDescriptor M0(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f144474l;
        LazyJavaResolverContext lazyJavaResolverContextM = ContextKt.m(lazyJavaResolverContext, lazyJavaResolverContext.a().x(javaResolverCache));
        DeclarationDescriptor declarationDescriptorB = b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(lazyJavaResolverContextM, declarationDescriptorB, this.f144472j, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> j() {
        return this.f144481s.a1().invoke();
    }

    public final JavaClass P0() {
        return this.f144472j;
    }

    public final List<JavaAnnotation> Q0() {
        return (List) this.f144475m.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope R() {
        return this.f144483u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f144482t.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        return this.f144476n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f144485w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        if (!Intrinsics.e(this.f144478p, DescriptorVisibilities.f143596a) || this.f144472j.l() != null) {
            return UtilsKt.d(this.f144478p);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f144186a;
        Intrinsics.g(descriptorVisibility);
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        return this.f144480r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope j0() {
        return this.f144484v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        return this.f144486x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        return this.f144477o;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> w() {
        if (this.f144477o != Modality.f143620c) {
            return CollectionsKt.m();
        }
        JavaTypeAttributes javaTypeAttributesB = JavaTypeAttributesKt.b(TypeUsage.f146788b, false, false, null, 7, null);
        Sequence<JavaClassifierType> sequenceD = this.f144472j.D();
        ArrayList arrayList = new ArrayList();
        Iterator<JavaClassifierType> it = sequenceD.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorD = this.f144474l.g().p(it.next(), javaTypeAttributesB).K0().d();
            ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return CollectionsKt.Z0(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(DescriptorUtilsKt.o((ClassDescriptor) t10).a(), DescriptorUtilsKt.o((ClassDescriptor) t11).a());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        return this.f144479q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        ClassId classIdN = DescriptorUtilsKt.n(lazyJavaClassDescriptor);
        if (classIdN != null) {
            return lazyJavaClassDescriptor.f144471i.a().f().a(classIdN);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope U() {
        MemberScope memberScopeU = super.U();
        Intrinsics.h(memberScopeU, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) memberScopeU;
    }
}
