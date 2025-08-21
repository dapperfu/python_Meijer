package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes14.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedPackageFragmentImpl f147362a;

    public c(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.f147362a = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedPackageFragmentImpl.L0(this.f147362a, (ClassId) obj);
    }
}
