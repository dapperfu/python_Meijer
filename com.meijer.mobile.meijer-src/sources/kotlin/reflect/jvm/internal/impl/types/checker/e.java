package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f147762a;

    /* renamed from: b, reason: collision with root package name */
    private final e f147763b;

    public e(KotlinType type, e eVar) {
        Intrinsics.j(type, "type");
        this.f147762a = type;
        this.f147763b = eVar;
    }

    public final e a() {
        return this.f147763b;
    }

    public final KotlinType b() {
        return this.f147762a;
    }
}
