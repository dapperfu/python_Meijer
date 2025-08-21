package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes14.dex */
class I implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145535a;

    public I(String str) {
        this.f145535a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.H(this.f145535a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
