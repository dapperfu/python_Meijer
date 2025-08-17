package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    /* renamed from: b, reason: collision with root package name */
    private final List<SyntheticJavaPartsProvider> f146221b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(List<? extends SyntheticJavaPartsProvider> inner) {
        Intrinsics.j(inner, "inner");
        this.f146221b = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> a(ClassDescriptor thisDescriptor, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(c10, "c");
        List<SyntheticJavaPartsProvider> list = this.f146221b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((SyntheticJavaPartsProvider) it.next()).a(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> b(ClassDescriptor thisDescriptor, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(c10, "c");
        List<SyntheticJavaPartsProvider> list = this.f146221b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((SyntheticJavaPartsProvider) it.next()).b(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void c(ClassDescriptor thisDescriptor, List<ClassConstructorDescriptor> result, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(result, "result");
        Intrinsics.j(c10, "c");
        Iterator<T> it = this.f146221b.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).c(thisDescriptor, result, c10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void d(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(name, "name");
        Intrinsics.j(result, "result");
        Intrinsics.j(c10, "c");
        Iterator<T> it = this.f146221b.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).d(thisDescriptor, name, result, c10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void e(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(name, "name");
        Intrinsics.j(result, "result");
        Intrinsics.j(c10, "c");
        Iterator<T> it = this.f146221b.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).e(thisDescriptor, name, result, c10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public PropertyDescriptorImpl f(ClassDescriptor thisDescriptor, PropertyDescriptorImpl propertyDescriptor, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(propertyDescriptor, "propertyDescriptor");
        Intrinsics.j(c10, "c");
        Iterator<T> it = this.f146221b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).f(thisDescriptor, propertyDescriptor, c10);
        }
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> g(ClassDescriptor thisDescriptor, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(c10, "c");
        List<SyntheticJavaPartsProvider> list = this.f146221b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((SyntheticJavaPartsProvider) it.next()).g(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void h(ClassDescriptor thisDescriptor, Name name, List<ClassDescriptor> result, LazyJavaResolverContext c10) {
        Intrinsics.j(thisDescriptor, "thisDescriptor");
        Intrinsics.j(name, "name");
        Intrinsics.j(result, "result");
        Intrinsics.j(c10, "c");
        Iterator<T> it = this.f146221b.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).h(thisDescriptor, name, result, c10);
        }
    }
}
