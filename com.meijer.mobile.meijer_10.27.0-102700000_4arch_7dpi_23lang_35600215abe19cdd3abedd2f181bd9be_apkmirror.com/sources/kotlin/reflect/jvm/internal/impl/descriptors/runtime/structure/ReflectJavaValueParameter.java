package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* renamed from: a, reason: collision with root package name */
    private final ReflectJavaType f144102a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f144103b;

    /* renamed from: c, reason: collision with root package name */
    private final String f144104c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f144105d;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    public ReflectJavaValueParameter(ReflectJavaType type, Annotation[] reflectAnnotations, String str, boolean z10) {
        Intrinsics.j(type, "type");
        Intrinsics.j(reflectAnnotations, "reflectAnnotations");
        this.f144102a = type;
        this.f144103b = reflectAnnotations;
        this.f144104c = str;
        this.f144105d = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        return this.f144102a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean b() {
        return this.f144105d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.b(this.f144103b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public Name getName() {
        String str = this.f144104c;
        if (str != null) {
            return Name.m(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.a(this.f144103b, fqName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ReflectJavaValueParameter.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }
}
