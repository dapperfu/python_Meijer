package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public final class AnnotationsImpl implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final List<AnnotationDescriptor> f144599a;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsImpl(List<? extends AnnotationDescriptor> annotations) {
        Intrinsics.j(annotations, "annotations");
        this.f144599a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f144599a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return this.f144599a.iterator();
    }

    public String toString() {
        return this.f144599a.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        return Annotations.DefaultImpls.a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }
}
