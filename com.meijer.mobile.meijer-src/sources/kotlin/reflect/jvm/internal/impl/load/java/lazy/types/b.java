package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f145513a;

    /* renamed from: b, reason: collision with root package name */
    private final RawSubstitution f145514b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f145515c;

    /* renamed from: d, reason: collision with root package name */
    private final JavaTypeAttributes f145516d;

    public b(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        this.f145513a = classDescriptor;
        this.f145514b = rawSubstitution;
        this.f145515c = simpleType;
        this.f145516d = javaTypeAttributes;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return RawSubstitution.k(this.f145513a, this.f145514b, this.f145515c, this.f145516d, (KotlinTypeRefiner) obj);
    }
}
