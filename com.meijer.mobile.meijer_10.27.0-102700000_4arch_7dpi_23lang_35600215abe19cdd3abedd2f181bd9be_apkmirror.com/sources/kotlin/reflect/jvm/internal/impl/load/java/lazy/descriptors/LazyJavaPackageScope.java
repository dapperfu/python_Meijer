package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* renamed from: n, reason: collision with root package name */
    private final JavaPackage f144506n;

    /* renamed from: o, reason: collision with root package name */
    private final LazyJavaPackageFragment f144507o;

    /* renamed from: p, reason: collision with root package name */
    private final NullableLazyValue<Set<String>> f144508p;

    /* renamed from: q, reason: collision with root package name */
    private final MemoizedFunctionToNullable<a, ClassDescriptor> f144509q;

    private static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            private final ClassDescriptor f144510a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(ClassDescriptor descriptor) {
                super(null);
                Intrinsics.j(descriptor, "descriptor");
                this.f144510a = descriptor;
            }

            public final ClassDescriptor a() {
                return this.f144510a;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            public static final NotFound f144511a = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            public static final SyntheticClass f144512a = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private KotlinClassLookupResult() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Name f144513a;

        /* renamed from: b, reason: collision with root package name */
        private final JavaClass f144514b;

        public a(Name name, JavaClass javaClass) {
            Intrinsics.j(name, "name");
            this.f144513a = name;
            this.f144514b = javaClass;
        }

        public final JavaClass a() {
            return this.f144514b;
        }

        public final Name b() {
            return this.f144513a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.e(this.f144513a, ((a) obj).f144513a);
        }

        public int hashCode() {
            return this.f144513a.hashCode();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void B(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(LazyJavaResolverContext c10, JavaPackage jPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(c10);
        Intrinsics.j(c10, "c");
        Intrinsics.j(jPackage, "jPackage");
        Intrinsics.j(ownerDescriptor, "ownerDescriptor");
        this.f144506n = jPackage;
        this.f144507o = ownerDescriptor;
        this.f144508p = c10.e().e(new w(c10, this));
        this.f144509q = c10.e().g(new x(this, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor i0(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext, a request) {
        Intrinsics.j(request, "request");
        ClassId classId = new ClassId(lazyJavaPackageScope.R().e(), request.b());
        KotlinClassFinder.Result resultC = request.a() != null ? lazyJavaResolverContext.a().j().c(request.a(), lazyJavaPackageScope.m0()) : lazyJavaResolverContext.a().j().a(classId, lazyJavaPackageScope.m0());
        KotlinJvmBinaryClass kotlinJvmBinaryClassA = resultC != null ? resultC.a() : null;
        ClassId classIdF = kotlinJvmBinaryClassA != null ? kotlinJvmBinaryClassA.f() : null;
        if (classIdF != null && (classIdF.j() || classIdF.i())) {
            return null;
        }
        KotlinClassLookupResult kotlinClassLookupResultP0 = lazyJavaPackageScope.p0(kotlinJvmBinaryClassA);
        if (kotlinClassLookupResultP0 instanceof KotlinClassLookupResult.Found) {
            return ((KotlinClassLookupResult.Found) kotlinClassLookupResultP0).a();
        }
        if (kotlinClassLookupResultP0 instanceof KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(kotlinClassLookupResultP0 instanceof KotlinClassLookupResult.NotFound)) {
            throw new NoWhenBranchMatchedException();
        }
        JavaClass javaClassA = request.a();
        if (javaClassA == null) {
            JavaClassFinder javaClassFinderD = lazyJavaResolverContext.a().d();
            KotlinClassFinder.Result.ClassFileContent classFileContent = resultC instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultC : null;
            javaClassA = javaClassFinderD.a(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.b() : null, null, 4, null));
        }
        JavaClass javaClass = javaClassA;
        if ((javaClass != null ? javaClass.L() : null) != LightClassOriginKind.f144612b) {
            FqName fqNameE = javaClass != null ? javaClass.e() : null;
            if (fqNameE == null || fqNameE.c() || !Intrinsics.e(fqNameE.d(), lazyJavaPackageScope.R().e())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.R(), javaClass, null, 8, null);
            lazyJavaResolverContext.a().e().a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.a(lazyJavaResolverContext.a().j(), javaClass, lazyJavaPackageScope.m0()) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.b(lazyJavaResolverContext.a().j(), classId, lazyJavaPackageScope.m0()) + '\n');
    }

    private final ClassDescriptor j0(Name name, JavaClass javaClass) {
        if (!SpecialNames.f145694a.a(name)) {
            return null;
        }
        Set<String> setInvoke = this.f144508p.invoke();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.b())) {
            return this.f144509q.invoke(new a(name, javaClass));
        }
        return null;
    }

    private final KotlinClassLookupResult p0(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.f144511a;
        }
        if (kotlinJvmBinaryClass.b().c() != KotlinClassHeader.Kind.f144868e) {
            return KotlinClassLookupResult.SyntheticClass.f144512a;
        }
        ClassDescriptor classDescriptorN = L().a().b().n(kotlinJvmBinaryClass);
        return classDescriptorN != null ? new KotlinClassLookupResult.Found(classDescriptorN) : KotlinClassLookupResult.NotFound.f144511a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> D(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f146255c;
        if (!kindFilter.a(companion.e() | companion.c())) {
            return CollectionsKt.m();
        }
        Collection<DeclarationDescriptor> collectionInvoke = K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                Intrinsics.i(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final ClassDescriptor k0(JavaClass javaClass) {
        Intrinsics.j(javaClass, "javaClass");
        return j0(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return j0(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment R() {
        return this.f144507o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> v(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        if (!kindFilter.a(DescriptorKindFilter.f146255c.e())) {
            return SetsKt.e();
        }
        Set<String> setInvoke = this.f144508p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.o((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.f144506n;
        if (function1 == null) {
            function1 = FunctionsKt.k();
        }
        Collection<JavaClass> collectionG = javaPackage.G(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : collectionG) {
            Name name = javaClass.L() == LightClassOriginKind.f144611a ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> x(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected DeclaredMemberIndex z() {
        return DeclaredMemberIndex.Empty.f144446a;
    }

    private final MetadataVersion m0() {
        return L().a().b().f().g().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        return lazyJavaResolverContext.a().d().c(lazyJavaPackageScope.R().e());
    }
}
