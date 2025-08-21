package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveType f147104a;

    public a(PrimitiveType primitiveType) {
        this.f147104a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ConstantValueFactory.d(this.f147104a, (ModuleDescriptor) obj);
    }
}
