package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaTypeResolver f145508a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterDescriptor f145509b;

    /* renamed from: c, reason: collision with root package name */
    private final JavaTypeAttributes f145510c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeConstructor f145511d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaClassifierType f145512e;

    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f145508a = javaTypeResolver;
        this.f145509b = typeParameterDescriptor;
        this.f145510c = javaTypeAttributes;
        this.f145511d = typeConstructor;
        this.f145512e = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTypeResolver.e(this.f145508a, this.f145509b, this.f145510c, this.f145511d, this.f145512e);
    }
}
