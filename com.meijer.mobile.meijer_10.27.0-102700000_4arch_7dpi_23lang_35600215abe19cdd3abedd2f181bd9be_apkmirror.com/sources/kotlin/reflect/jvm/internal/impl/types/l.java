package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l f147006a = new l();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.p((KotlinType) obj);
    }
}
