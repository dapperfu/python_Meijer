package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* renamed from: a, reason: collision with root package name */
    private final ReflectJavaType f145009a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f145010b;

    /* renamed from: c, reason: collision with root package name */
    private final String f145011c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f145012d;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    public ReflectJavaValueParameter(ReflectJavaType type, Annotation[] reflectAnnotations, String str, boolean z10) {
        Intrinsics.j(type, "type");
        Intrinsics.j(reflectAnnotations, "reflectAnnotations");
        this.f145009a = type;
        this.f145010b = reflectAnnotations;
        this.f145011c = str;
        this.f145012d = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        return this.f145009a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean b() {
        return this.f145012d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.b(this.f145010b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public Name getName() {
        String str = this.f145011c;
        if (str != null) {
            return Name.m(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.a(this.f145010b, fqName);
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
