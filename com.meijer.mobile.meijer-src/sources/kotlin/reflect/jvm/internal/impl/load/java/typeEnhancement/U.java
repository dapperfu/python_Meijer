package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes14.dex */
class U implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145595a;

    public U(String str) {
        this.f145595a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.f(this.f145595a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
