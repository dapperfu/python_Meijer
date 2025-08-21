package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15376x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145636a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145637b;

    public C15376x(String str, String str2) {
        this.f145636a = str;
        this.f145637b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.x(this.f145636a, this.f145637b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
