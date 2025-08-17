package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f144606a;

    /* renamed from: b, reason: collision with root package name */
    private final RawSubstitution f144607b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f144608c;

    /* renamed from: d, reason: collision with root package name */
    private final JavaTypeAttributes f144609d;

    public b(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        this.f144606a = classDescriptor;
        this.f144607b = rawSubstitution;
        this.f144608c = simpleType;
        this.f144609d = javaTypeAttributes;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return RawSubstitution.k(this.f144606a, this.f144607b, this.f144608c, this.f144609d, (KotlinTypeRefiner) obj);
    }
}
