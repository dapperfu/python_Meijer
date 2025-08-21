package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* loaded from: classes14.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f147949a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinType f147950b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinType f147951c;

    public b(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.j(typeParameter, "typeParameter");
        Intrinsics.j(inProjection, "inProjection");
        Intrinsics.j(outProjection, "outProjection");
        this.f147949a = typeParameter;
        this.f147950b = inProjection;
        this.f147951c = outProjection;
    }

    public final KotlinType a() {
        return this.f147950b;
    }

    public final KotlinType b() {
        return this.f147951c;
    }

    public final TypeParameterDescriptor c() {
        return this.f147949a;
    }

    public final boolean d() {
        return KotlinTypeChecker.f147723a.d(this.f147950b, this.f147951c);
    }
}
