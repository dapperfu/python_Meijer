package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CompositeAnnotations implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final List<Annotations> f144605a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends Annotations> delegates) {
        Intrinsics.j(delegates, "delegates");
        this.f144605a = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor h(FqName fqName, Annotations it) {
        Intrinsics.j(it, "it");
        return it.i(fqName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence k(Annotations it) {
        Intrinsics.j(it, "it");
        return CollectionsKt.f0(it);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt.F(SequencesKt.N(CollectionsKt.f0(this.f144605a), new c(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.f144605a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt.G(CollectionsKt.f0(this.f144605a), d.f144681a).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        Iterator it = CollectionsKt.f0(this.f144605a).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).p3(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(Annotations... delegates) {
        this((List<? extends Annotations>) ArraysKt.h1(delegates));
        Intrinsics.j(delegates, "delegates");
    }
}
