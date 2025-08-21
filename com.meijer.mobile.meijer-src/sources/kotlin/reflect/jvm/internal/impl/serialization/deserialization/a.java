package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractDeserializedPackageFragmentProvider f147356a;

    public a(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        this.f147356a = abstractDeserializedPackageFragmentProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractDeserializedPackageFragmentProvider.f(this.f147356a, (FqName) obj);
    }
}
