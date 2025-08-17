package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;

/* loaded from: classes13.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinClassFinder f144792a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedDescriptorResolver f144793b;

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.j(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f144792a = kotlinClassFinder;
        this.f144793b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData a(ClassId classId) {
        Intrinsics.j(classId, "classId");
        KotlinJvmBinaryClass kotlinJvmBinaryClassB = KotlinClassFinderKt.b(this.f144792a, classId, this.f144793b.f().g().d());
        if (kotlinJvmBinaryClassB == null) {
            return null;
        }
        Intrinsics.e(kotlinJvmBinaryClassB.f(), classId);
        return this.f144793b.l(kotlinJvmBinaryClassB);
    }
}
