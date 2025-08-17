package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final IntersectionTypeConstructor f147007a;

    public m(IntersectionTypeConstructor intersectionTypeConstructor) {
        this.f147007a = intersectionTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.k(this.f147007a, (KotlinTypeRefiner) obj);
    }
}
