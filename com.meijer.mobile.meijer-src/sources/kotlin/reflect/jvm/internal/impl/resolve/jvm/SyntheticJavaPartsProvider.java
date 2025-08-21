package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public interface SyntheticJavaPartsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f147151a = Companion.f147152a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f147152a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final CompositeSyntheticJavaPartsProvider f147153b = new CompositeSyntheticJavaPartsProvider(CollectionsKt.m());

        public final CompositeSyntheticJavaPartsProvider a() {
            return f147153b;
        }

        private Companion() {
        }
    }

    List<Name> a(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> b(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    void c(ClassDescriptor classDescriptor, List<ClassConstructorDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);

    void d(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    void e(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    PropertyDescriptorImpl f(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptorImpl, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> g(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    void h(ClassDescriptor classDescriptor, Name name, List<ClassDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);
}
