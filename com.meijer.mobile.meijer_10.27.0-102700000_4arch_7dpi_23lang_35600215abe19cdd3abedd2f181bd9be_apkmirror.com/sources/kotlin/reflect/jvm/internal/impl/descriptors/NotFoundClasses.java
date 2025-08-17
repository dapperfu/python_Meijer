package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class NotFoundClasses {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f143628a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f143629b;

    /* renamed from: c, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f143630c;

    /* renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<a, ClassDescriptor> f143631d;

    @SourceDebugExtension
    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f143632i;

        /* renamed from: j, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f143633j;

        /* renamed from: k, reason: collision with root package name */
        private final ClassTypeConstructorImpl f143634k;

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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
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
        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor container, Name name, boolean z10, int i10) {
            super(storageManager, container, name, SourceElement.f143647a, false);
            Intrinsics.j(storageManager, "storageManager");
            Intrinsics.j(container, "container");
            Intrinsics.j(name, "name");
            this.f143632i = z10;
            IntRange intRangeX = RangesKt.x(0, i10);
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
            Iterator<Integer> it = intRangeX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Annotations annotationsB = Annotations.f143689s3.b();
                Variance variance = Variance.f146796e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(TypeParameterDescriptorImpl.O0(this, annotationsB, false, variance, Name.o(sb2.toString()), iNextInt, storageManager));
            }
            this.f143633j = arrayList;
            this.f143634k = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.g(this), SetsKt.d(DescriptorUtilsKt.s(this).l().i()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: H0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty j0() {
            return MemberScope.Empty.f146293b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        /* renamed from: I0, reason: merged with bridge method [inline-methods] */
        public ClassTypeConstructorImpl i() {
            return this.f143634k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty g0(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.f146293b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public ClassKind f() {
            return ClassKind.f143585b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public Annotations getAnnotations() {
            return Annotations.f143689s3.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
        public DescriptorVisibility getVisibility() {
            DescriptorVisibility PUBLIC = DescriptorVisibilities.f143600e;
            Intrinsics.i(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public List<TypeParameterDescriptor> p() {
            return this.f143633j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public Modality q() {
            return Modality.f143619b;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public boolean y() {
            return this.f143632i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassConstructorDescriptor> j() {
            return SetsKt.e();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassDescriptor> w() {
            return CollectionsKt.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ClassId f143635a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Integer> f143636b;

        public final ClassId a() {
            return this.f143635a;
        }

        public final List<Integer> b() {
            return this.f143636b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.e(this.f143635a, aVar.f143635a) && Intrinsics.e(this.f143636b, aVar.f143636b);
        }

        public int hashCode() {
            return (this.f143635a.hashCode() * 31) + this.f143636b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f143635a + ", typeParametersCount=" + this.f143636b + ')';
        }

        public a(ClassId classId, List<Integer> typeParametersCount) {
            Intrinsics.j(classId, "classId");
            Intrinsics.j(typeParametersCount, "typeParametersCount");
            this.f143635a = classId;
            this.f143636b = typeParametersCount;
        }
    }

    public NotFoundClasses(StorageManager storageManager, ModuleDescriptor module) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(module, "module");
        this.f143628a = storageManager;
        this.f143629b = module;
        this.f143630c = storageManager.i(new c(this));
        this.f143631d = storageManager.i(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor c(NotFoundClasses notFoundClasses, a aVar) {
        PackageFragmentDescriptor packageFragmentDescriptorInvoke;
        Intrinsics.j(aVar, "<destruct>");
        ClassId classIdA = aVar.a();
        List<Integer> listB = aVar.b();
        if (classIdA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classIdA);
        }
        ClassId classIdE = classIdA.e();
        if (classIdE == null || (packageFragmentDescriptorInvoke = notFoundClasses.d(classIdE, CollectionsKt.j0(listB, 1))) == null) {
            packageFragmentDescriptorInvoke = notFoundClasses.f143630c.invoke(classIdA.f());
        }
        DeclarationDescriptor declarationDescriptor = packageFragmentDescriptorInvoke;
        boolean zJ = classIdA.j();
        StorageManager storageManager = notFoundClasses.f143628a;
        Name nameH = classIdA.h();
        Integer num = (Integer) CollectionsKt.u0(listB);
        return new MockClassDescriptor(storageManager, declarationDescriptor, nameH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor e(NotFoundClasses notFoundClasses, FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return new EmptyPackageFragmentDescriptor(notFoundClasses.f143629b, fqName);
    }

    public final ClassDescriptor d(ClassId classId, List<Integer> typeParametersCount) {
        Intrinsics.j(classId, "classId");
        Intrinsics.j(typeParametersCount, "typeParametersCount");
        return this.f143631d.invoke(new a(classId, typeParametersCount));
    }
}
