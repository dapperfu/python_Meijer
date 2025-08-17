package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f144095a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return null;
    }

    public ReflectJavaPackage(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f144095a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaClass> G(Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(nameFilter, "nameFilter");
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public FqName e() {
        return this.f144095a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.e(e(), ((ReflectJavaPackage) obj).e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<JavaAnnotation> getAnnotations() {
        return CollectionsKt.m();
    }

    public String toString() {
        return ReflectJavaPackage.class.getName() + ": " + e();
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaPackage> v() {
        return CollectionsKt.m();
    }
}
