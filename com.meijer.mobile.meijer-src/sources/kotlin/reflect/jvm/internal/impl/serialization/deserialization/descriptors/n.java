package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f147487a;

    public n(Function0 function0) {
        this.f147487a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.k(this.f147487a);
    }
}
