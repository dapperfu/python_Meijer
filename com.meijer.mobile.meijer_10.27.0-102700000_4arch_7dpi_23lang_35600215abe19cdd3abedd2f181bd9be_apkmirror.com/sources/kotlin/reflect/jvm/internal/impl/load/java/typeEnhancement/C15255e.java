package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C15255e implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f144709a;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    public C15255e(FqName fqNameToMatch) {
        Intrinsics.j(fqNameToMatch, "fqNameToMatch");
        this.f144709a = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C15254d i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        if (Intrinsics.e(fqName, this.f144709a)) {
            return C15254d.f144703a;
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return CollectionsKt.m().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }
}
