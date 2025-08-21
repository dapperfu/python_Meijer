package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@SourceDebugExtension
/* loaded from: classes14.dex */
public class ErasureTypeAttributes {

    /* renamed from: a, reason: collision with root package name */
    private final TypeUsage f147603a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<TypeParameterDescriptor> f147604b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f147605c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        Intrinsics.j(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f147603a = howThisTypeIsUsed;
        this.f147604b = set;
        this.f147605c = simpleType;
    }

    public SimpleType a() {
        return this.f147605c;
    }

    public TypeUsage b() {
        return this.f147603a;
    }

    public Set<TypeParameterDescriptor> c() {
        return this.f147604b;
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
