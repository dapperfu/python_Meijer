package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* renamed from: b, reason: collision with root package name */
    private final WildcardType f144106b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<JavaAnnotation> f144107c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f144108d;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        Intrinsics.j(reflectType, "reflectType");
        this.f144106b = reflectType;
        this.f144107c = CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return this.f144108d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public WildcardType Q() {
        return this.f144106b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f144107c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean M() {
        Intrinsics.i(Q().getUpperBounds(), "getUpperBounds(...)");
        return !Intrinsics.e(ArraysKt.g0(r0), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType x() {
        Type[] upperBounds = Q().getUpperBounds();
        Type[] lowerBounds = Q().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                ReflectJavaType.Factory factory = ReflectJavaType.f144100a;
                Intrinsics.g(lowerBounds);
                Object objR0 = ArraysKt.R0(lowerBounds);
                Intrinsics.i(objR0, "single(...)");
                return factory.a((Type) objR0);
            }
            if (upperBounds.length == 1) {
                Intrinsics.g(upperBounds);
                Type type = (Type) ArraysKt.R0(upperBounds);
                if (!Intrinsics.e(type, Object.class)) {
                    ReflectJavaType.Factory factory2 = ReflectJavaType.f144100a;
                    Intrinsics.g(type);
                    return factory2.a(type);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + Q());
    }
}
