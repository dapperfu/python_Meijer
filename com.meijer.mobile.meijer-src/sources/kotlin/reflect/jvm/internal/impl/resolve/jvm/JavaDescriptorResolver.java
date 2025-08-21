package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
public final class JavaDescriptorResolver {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragmentProvider f147129a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaResolverCache f147130b;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider packageFragmentProvider, JavaResolverCache javaResolverCache) {
        Intrinsics.j(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        this.f147129a = packageFragmentProvider;
        this.f147130b = javaResolverCache;
    }

    public final LazyJavaPackageFragmentProvider a() {
        return this.f147129a;
    }

    public final ClassDescriptor b(JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        Intrinsics.j(javaClass, "javaClass");
        FqName fqNameE = javaClass.e();
        if (fqNameE != null && javaClass.L() == LightClassOriginKind.f145518a) {
            return this.f147130b.d(fqNameE);
        }
        JavaClass javaClassL = javaClass.l();
        if (javaClassL == null) {
            if (fqNameE == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.u0(this.f147129a.a(fqNameE.d()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.K0(javaClass);
        }
        ClassDescriptor classDescriptorB = b(javaClassL);
        MemberScope memberScopeR = classDescriptorB != null ? classDescriptorB.R() : null;
        ClassifierDescriptor classifierDescriptorF = memberScopeR != null ? memberScopeR.f(javaClass.getName(), NoLookupLocation.f145040s) : null;
        if (classifierDescriptorF instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorF;
        }
        return null;
    }
}
