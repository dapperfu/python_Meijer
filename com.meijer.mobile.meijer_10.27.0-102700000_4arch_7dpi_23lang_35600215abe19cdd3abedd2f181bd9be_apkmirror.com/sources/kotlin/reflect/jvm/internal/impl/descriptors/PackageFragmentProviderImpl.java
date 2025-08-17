package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<PackageFragmentDescriptor> f143637a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(packageFragments, "packageFragments");
        this.f143637a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName f(PackageFragmentDescriptor it) {
        Intrinsics.j(it, "it");
        return it.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(FqName fqName, FqName it) {
        Intrinsics.j(it, "it");
        return !it.c() && Intrinsics.e(it.d(), fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<PackageFragmentDescriptor> a(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f143637a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.e(((PackageFragmentDescriptor) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void b(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        for (Object obj : this.f143637a) {
            if (Intrinsics.e(((PackageFragmentDescriptor) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean c(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f143637a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(((PackageFragmentDescriptor) it.next()).e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        return SequencesKt.W(SequencesKt.B(SequencesKt.M(CollectionsKt.f0(this.f143637a), e.f143782a), new f(fqName)));
    }
}
