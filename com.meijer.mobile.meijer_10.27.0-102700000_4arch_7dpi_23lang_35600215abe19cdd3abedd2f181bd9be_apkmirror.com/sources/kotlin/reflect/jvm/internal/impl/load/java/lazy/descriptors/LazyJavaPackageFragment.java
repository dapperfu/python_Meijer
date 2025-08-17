package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144497o = {Reflection.j(new PropertyReference1Impl(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), Reflection.j(new PropertyReference1Impl(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* renamed from: g, reason: collision with root package name */
    private final JavaPackage f144498g;

    /* renamed from: h, reason: collision with root package name */
    private final LazyJavaResolverContext f144499h;

    /* renamed from: i, reason: collision with root package name */
    private final MetadataVersion f144500i;

    /* renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue f144501j;

    /* renamed from: k, reason: collision with root package name */
    private final JvmPackageScope f144502k;

    /* renamed from: l, reason: collision with root package name */
    private final NotNullLazyValue<List<FqName>> f144503l;

    /* renamed from: m, reason: collision with root package name */
    private final Annotations f144504m;

    /* renamed from: n, reason: collision with root package name */
    private final NotNullLazyValue f144505n;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.f144872i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f144869f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(LazyJavaResolverContext outerContext, JavaPackage jPackage) {
        super(outerContext.d(), jPackage.e());
        Intrinsics.j(outerContext, "outerContext");
        Intrinsics.j(jPackage, "jPackage");
        this.f144498g = jPackage;
        LazyJavaResolverContext lazyJavaResolverContextF = ContextKt.f(outerContext, this, null, 0, 6, null);
        this.f144499h = lazyJavaResolverContextF;
        this.f144500i = outerContext.a().b().f().g().d();
        this.f144501j = lazyJavaResolverContextF.e().c(new t(this));
        this.f144502k = new JvmPackageScope(lazyJavaResolverContextF, jPackage, this);
        this.f144503l = lazyJavaResolverContextF.e().b(new u(this), CollectionsKt.m());
        this.f144504m = lazyJavaResolverContextF.a().i().b() ? Annotations.f143689s3.b() : LazyJavaAnnotationsKt.a(lazyJavaResolverContextF, jPackage);
        this.f144505n = lazyJavaResolverContextF.e().c(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map J0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        List<String> listA = lazyJavaPackageFragment.f144499h.a().o().a(lazyJavaPackageFragment.e().a());
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            ClassId.Companion companion = ClassId.f145674d;
            FqName fqNameE = JvmClassName.d(str).e();
            Intrinsics.i(fqNameE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            KotlinJvmBinaryClass kotlinJvmBinaryClassB = KotlinClassFinderKt.b(lazyJavaPackageFragment.f144499h.a().j(), companion.c(fqNameE), lazyJavaPackageFragment.f144500i);
            Pair pairA = kotlinJvmBinaryClassB != null ? TuplesKt.a(str, kotlinJvmBinaryClassB) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return MapsKt.y(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap O0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        HashMap map = new HashMap();
        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.L0().entrySet()) {
            String key = entry.getKey();
            KotlinJvmBinaryClass value = entry.getValue();
            JvmClassName jvmClassNameD = JvmClassName.d(key);
            Intrinsics.i(jvmClassNameD, "byInternalName(...)");
            KotlinClassHeader kotlinClassHeaderB = value.b();
            int i10 = WhenMappings.$EnumSwitchMapping$0[kotlinClassHeaderB.c().ordinal()];
            if (i10 == 1) {
                String strE = kotlinClassHeaderB.e();
                if (strE != null) {
                    map.put(jvmClassNameD, JvmClassName.d(strE));
                }
            } else if (i10 == 2) {
                map.put(jvmClassNameD, jvmClassNameD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List P0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        Collection<JavaPackage> collectionV = lazyJavaPackageFragment.f144498g.v();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionV, 10));
        Iterator<T> it = collectionV.iterator();
        while (it.hasNext()) {
            arrayList.add(((JavaPackage) it.next()).e());
        }
        return arrayList;
    }

    public final ClassDescriptor K0(JavaClass jClass) {
        Intrinsics.j(jClass, "jClass");
        return this.f144502k.i().k0(jClass);
    }

    public final Map<String, KotlinJvmBinaryClass> L0() {
        return (Map) StorageKt.a(this.f144501j, this, f144497o[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public JvmPackageScope n() {
        return this.f144502k;
    }

    public final List<FqName> N0() {
        return this.f144503l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f144504m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f144499h.a().m();
    }
}
