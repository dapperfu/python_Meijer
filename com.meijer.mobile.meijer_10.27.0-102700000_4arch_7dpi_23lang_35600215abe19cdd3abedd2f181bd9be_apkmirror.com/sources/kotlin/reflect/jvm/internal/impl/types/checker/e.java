package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f146855a;

    /* renamed from: b, reason: collision with root package name */
    private final e f146856b;

    public e(KotlinType type, e eVar) {
        Intrinsics.j(type, "type");
        this.f146855a = type;
        this.f146856b = eVar;
    }

    public final e a() {
        return this.f146856b;
    }

    public final KotlinType b() {
        return this.f146855a;
    }
}
