package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15274y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144731a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144732b;

    public C15274y(String str, String str2) {
        this.f144731a = str;
        this.f144732b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.y(this.f144731a, this.f144732b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
