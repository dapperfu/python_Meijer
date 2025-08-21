package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public final class TypedArrayValue extends ArrayValue {

    /* renamed from: c, reason: collision with root package name */
    private final KotlinType f147103c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType c(KotlinType kotlinType, ModuleDescriptor it) {
        Intrinsics.j(it, "it");
        return kotlinType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        super(value, new d(type));
        Intrinsics.j(value, "value");
        Intrinsics.j(type, "type");
        this.f147103c = type;
    }

    public final KotlinType e() {
        return this.f147103c;
    }
}
