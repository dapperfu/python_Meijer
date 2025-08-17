package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaTypeResolver f144601a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterDescriptor f144602b;

    /* renamed from: c, reason: collision with root package name */
    private final JavaTypeAttributes f144603c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeConstructor f144604d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaClassifierType f144605e;

    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f144601a = javaTypeResolver;
        this.f144602b = typeParameterDescriptor;
        this.f144603c = javaTypeAttributes;
        this.f144604d = typeConstructor;
        this.f144605e = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTypeResolver.e(this.f144601a, this.f144602b, this.f144603c, this.f144604d, this.f144605e);
    }
}
