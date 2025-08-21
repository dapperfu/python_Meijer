package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f147107a;

    public d(KotlinType kotlinType) {
        this.f147107a = kotlinType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypedArrayValue.c(this.f147107a, (ModuleDescriptor) obj);
    }
}
