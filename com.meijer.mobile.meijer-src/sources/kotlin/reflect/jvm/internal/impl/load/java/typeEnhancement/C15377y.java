package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15377y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145638a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145639b;

    public C15377y(String str, String str2) {
        this.f145638a = str;
        this.f145639b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.y(this.f145638a, this.f145639b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
