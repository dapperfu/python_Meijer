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
/* loaded from: classes14.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    /* renamed from: y, reason: collision with root package name */
    public static final Companion f145376y = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    private static final Set<String> f145377z = SetsKt.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i, reason: collision with root package name */
    private final LazyJavaResolverContext f145378i;

    /* renamed from: j, reason: collision with root package name */
    private final JavaClass f145379j;

    /* renamed from: k, reason: collision with root package name */
    private final ClassDescriptor f145380k;

    /* renamed from: l, reason: collision with root package name */
    private final LazyJavaResolverContext f145381l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f145382m;

    /* renamed from: n, reason: collision with root package name */
    private final ClassKind f145383n;

    /* renamed from: o, reason: collision with root package name */
    private final Modality f145384o;

    /* renamed from: p, reason: collision with root package name */
    private final Visibility f145385p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f145386q;

    /* renamed from: r, reason: collision with root package name */
    private final a f145387r;

    /* renamed from: s, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145388s;

    /* renamed from: t, reason: collision with root package name */
    private final ScopesHolderForClass<LazyJavaClassMemberScope> f145389t;

    /* renamed from: u, reason: collision with root package name */
    private final InnerClassesScopeWrapper f145390u;

    /* renamed from: v, reason: collision with root package name */
    private final LazyJavaStaticClassScope f145391v;

    /* renamed from: w, reason: collision with root package name */
    private final Annotations f145392w;

    /* renamed from: x, reason: collision with root package name */
    private final NotNullLazyValue<List<TypeParameterDescriptor>> f145393x;

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
        private final NotNullLazyValue<List<TypeParameterDescriptor>> f145394d;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return true;
        }

        public a() {
            super(LazyJavaClassDescriptor.this.f145381l.e());
            this.f145394d = LazyJavaClassDescriptor.this.f145381l.e().c(new C15347i(LazyJavaClassDescriptor.this));
        }

        private final FqName L() {
            String strB;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.f145145r;
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
            return this.f145394d.invoke();
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
                KotlinType kotlinTypeQ = LazyJavaClassDescriptor.this.f145381l.a().r().q(LazyJavaClassDescriptor.this.f145381l.g().p(next, JavaTypeAttributesKt.b(TypeUsage.f147694a, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f145381l);
                if (kotlinTypeQ.K0().d() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.e(kotlinTypeQ.K0(), kotlinTypeK != null ? kotlinTypeK.K0() : null) && !KotlinBuiltIns.c0(kotlinTypeQ)) {
                    arrayList.add(kotlinTypeQ);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.f145380k;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, classDescriptor != null ? MappingUtilKt.a(classDescriptor, LazyJavaClassDescriptor.this).c().p(classDescriptor.o(), Variance.f147703e) : null);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, kotlinTypeK);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterC = LazyJavaClassDescriptor.this.f145381l.a().c();
                ClassDescriptor classDescriptorD = d();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
                for (JavaType javaType : arrayList2) {
                    Intrinsics.h(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((JavaClassifierType) javaType).F());
                }
                errorReporterC.b(classDescriptorD, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.j1(arrayList) : CollectionsKt.e(LazyJavaClassDescriptor.this.f145381l.d().l().i());
        }

        public String toString() {
            String strB = LazyJavaClassDescriptor.this.getName().b();
            Intrinsics.i(strB, "asString(...)");
            return strB;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker v() {
            return LazyJavaClassDescriptor.this.f145381l.a().v();
        }

        private final KotlinType K() {
            FqName fqNameB;
            ArrayList arrayList;
            FqName fqNameL = L();
            if (fqNameL == null || fqNameL.c() || !fqNameL.h(StandardNames.f144226z)) {
                fqNameL = null;
            }
            if (fqNameL == null) {
                fqNameB = FakePureImplementationsProvider.f145078a.b(DescriptorUtilsKt.o(LazyJavaClassDescriptor.this));
                if (fqNameB == null) {
                    return null;
                }
            } else {
                fqNameB = fqNameL;
            }
            ClassDescriptor classDescriptorB = DescriptorUtilsKt.B(LazyJavaClassDescriptor.this.f145381l.d(), fqNameB, NoLookupLocation.f145040s);
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
                    arrayList.add(new TypeProjectionImpl(Variance.f147703e, ((TypeParameterDescriptor) it.next()).o()));
                }
            } else {
                if (size2 != 1 || size <= 1 || fqNameL != null) {
                    return null;
                }
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.f147703e, ((TypeParameterDescriptor) CollectionsKt.U0(parameters)).o());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(intRange, 10));
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(typeProjectionImpl);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.h(TypeAttributes.f147647b.k(), classDescriptorB, arrayList);
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
        this.f145378i = outerContext;
        this.f145379j = jClass;
        this.f145380k = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextF = ContextKt.f(outerContext, this, jClass, 0, 4, null);
        this.f145381l = lazyJavaResolverContextF;
        lazyJavaResolverContextF.a().h().e(jClass, this);
        jClass.L();
        this.f145382m = LazyKt.b(new C15344f(this));
        this.f145383n = jClass.o() ? ClassKind.f144496f : jClass.K() ? ClassKind.f144493c : jClass.w() ? ClassKind.f144494d : ClassKind.f144492b;
        if (jClass.o() || jClass.w()) {
            modalityA = Modality.f144526b;
        } else {
            modalityA = Modality.f144525a.a(jClass.z(), jClass.z() || jClass.isAbstract() || jClass.K(), !jClass.isFinal());
        }
        this.f145384o = modalityA;
        this.f145385p = jClass.getVisibility();
        this.f145386q = (jClass.l() == null || jClass.g()) ? false : true;
        this.f145387r = new a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextF, this, jClass, classDescriptor != null, null, 16, null);
        this.f145388s = lazyJavaClassMemberScope;
        this.f145389t = ScopesHolderForClass.f144548e.a(this, lazyJavaResolverContextF.e(), lazyJavaResolverContextF.a().k().c(), new C15345g(this));
        this.f145390u = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f145391v = new LazyJavaStaticClassScope(lazyJavaResolverContextF, jClass, this);
        this.f145392w = LazyJavaAnnotationsKt.a(lazyJavaResolverContextF, jClass);
        this.f145393x = lazyJavaResolverContextF.e().c(new C15346h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f145379j.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaClassDescriptor.f145381l.f().a(javaTypeParameter);
            if (typeParameterDescriptorA == null) {
                throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.f145379j + ", so it must be resolved");
            }
            arrayList.add(typeParameterDescriptorA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaClassMemberScope U0(LazyJavaClassDescriptor lazyJavaClassDescriptor, KotlinTypeRefiner it) {
        Intrinsics.j(it, "it");
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f145381l, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f145379j, lazyJavaClassDescriptor.f145380k != null, lazyJavaClassDescriptor.f145388s);
    }

    public final LazyJavaClassDescriptor M0(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f145381l;
        LazyJavaResolverContext lazyJavaResolverContextM = ContextKt.m(lazyJavaResolverContext, lazyJavaResolverContext.a().x(javaResolverCache));
        DeclarationDescriptor declarationDescriptorB = b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(lazyJavaResolverContextM, declarationDescriptorB, this.f145379j, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> j() {
        return this.f145388s.a1().invoke();
    }

    public final JavaClass P0() {
        return this.f145379j;
    }

    public final List<JavaAnnotation> Q0() {
        return (List) this.f145382m.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope R() {
        return this.f145390u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f145389t.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        return this.f145383n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f145392w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        if (!Intrinsics.e(this.f145385p, DescriptorVisibilities.f144503a) || this.f145379j.l() != null) {
            return UtilsKt.d(this.f145385p);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f145093a;
        Intrinsics.g(descriptorVisibility);
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        return this.f145387r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope j0() {
        return this.f145391v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        return this.f145393x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        return this.f145384o;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> w() {
        if (this.f145384o != Modality.f144527c) {
            return CollectionsKt.m();
        }
        JavaTypeAttributes javaTypeAttributesB = JavaTypeAttributesKt.b(TypeUsage.f147695b, false, false, null, 7, null);
        Sequence<JavaClassifierType> sequenceD = this.f145379j.D();
        ArrayList arrayList = new ArrayList();
        Iterator<JavaClassifierType> it = sequenceD.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorD = this.f145381l.g().p(it.next(), javaTypeAttributesB).K0().d();
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
        return this.f145386q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        ClassId classIdN = DescriptorUtilsKt.n(lazyJavaClassDescriptor);
        if (classIdN != null) {
            return lazyJavaClassDescriptor.f145378i.a().f().a(classIdN);
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
