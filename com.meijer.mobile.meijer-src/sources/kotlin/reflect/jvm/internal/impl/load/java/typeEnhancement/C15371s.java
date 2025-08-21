package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15371s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145630a;

    public C15371s(String str) {
        this.f145630a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.s(this.f145630a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
