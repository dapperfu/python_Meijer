package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes13.dex */
class F implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144625b;

    public F(String str, String str2) {
        this.f144624a = str;
        this.f144625b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.E(this.f144624a, this.f144625b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
