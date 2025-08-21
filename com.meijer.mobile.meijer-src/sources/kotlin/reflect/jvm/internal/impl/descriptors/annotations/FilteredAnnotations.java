package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FilteredAnnotations implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final Annotations f144606a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144607b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<FqName, Boolean> f144608c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(Annotations delegate, boolean z10, Function1<? super FqName, Boolean> fqNameFilter) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(fqNameFilter, "fqNameFilter");
        this.f144606a = delegate;
        this.f144607b = z10;
        this.f144608c = fqNameFilter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        if (this.f144608c.invoke(fqName).booleanValue()) {
            return this.f144606a.i(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z10;
        Annotations annotations = this.f144606a;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            z10 = false;
        } else {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                if (a(it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f144607b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.f144606a;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (a(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        if (this.f144608c.invoke(fqName).booleanValue()) {
            return this.f144606a.p3(fqName);
        }
        return false;
    }

    private final boolean a(AnnotationDescriptor annotationDescriptor) {
        FqName fqNameE = annotationDescriptor.e();
        if (fqNameE != null && this.f144608c.invoke(fqNameE).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(Annotations delegate, Function1<? super FqName, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(fqNameFilter, "fqNameFilter");
    }
}
