package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@SourceDebugExtension
/* loaded from: classes13.dex */
public class ErasureTypeAttributes {

    /* renamed from: a, reason: collision with root package name */
    private final TypeUsage f146696a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<TypeParameterDescriptor> f146697b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f146698c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        Intrinsics.j(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f146696a = howThisTypeIsUsed;
        this.f146697b = set;
        this.f146698c = simpleType;
    }

    public SimpleType a() {
        return this.f146698c;
    }

    public TypeUsage b() {
        return this.f146696a;
    }

    public Set<TypeParameterDescriptor> c() {
        return this.f146697b;
    }

    public ErasureTypeAttributes d(TypeParameterDescriptor typeParameter) {
        Set setD;
        Intrinsics.j(typeParameter, "typeParameter");
        TypeUsage typeUsageB = b();
        Set<TypeParameterDescriptor> setC = c();
        if (setC == null || (setD = SetsKt.m(setC, typeParameter)) == null) {
            setD = SetsKt.d(typeParameter);
        }
        return new ErasureTypeAttributes(typeUsageB, setD, a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.e(erasureTypeAttributes.a(), a()) && erasureTypeAttributes.b() == b();
    }

    public int hashCode() {
        int iHashCode;
        SimpleType simpleTypeA = a();
        if (simpleTypeA != null) {
            iHashCode = simpleTypeA.hashCode();
        } else {
            iHashCode = 0;
        }
        return iHashCode + (iHashCode * 31) + b().hashCode();
    }
}
