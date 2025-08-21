package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes14.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f145003b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<JavaAnnotation> f145004c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f145005d;

    public ReflectJavaPrimitiveType(Class<?> reflectType) {
        Intrinsics.j(reflectType, "reflectType");
        this.f145003b = reflectType;
        this.f145004c = CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return this.f145005d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Class<?> Q() {
        return this.f145003b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f145004c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public PrimitiveType getType() {
        if (Intrinsics.e(Q(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.b(Q().getName()).o();
    }
}
