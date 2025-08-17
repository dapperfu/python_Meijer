package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* loaded from: classes13.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f147042a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinType f147043b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinType f147044c;

    public b(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.j(typeParameter, "typeParameter");
        Intrinsics.j(inProjection, "inProjection");
        Intrinsics.j(outProjection, "outProjection");
        this.f147042a = typeParameter;
        this.f147043b = inProjection;
        this.f147044c = outProjection;
    }

    public final KotlinType a() {
        return this.f147043b;
    }

    public final KotlinType b() {
        return this.f147044c;
    }

    public final TypeParameterDescriptor c() {
        return this.f147042a;
    }

    public final boolean d() {
        return KotlinTypeChecker.f146816a.d(this.f147043b, this.f147044c);
    }
}
