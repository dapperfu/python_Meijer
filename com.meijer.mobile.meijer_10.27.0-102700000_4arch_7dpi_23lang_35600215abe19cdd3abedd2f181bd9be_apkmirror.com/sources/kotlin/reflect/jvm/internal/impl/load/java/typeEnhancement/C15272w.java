package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15272w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144727a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144728b;

    public C15272w(String str, String str2) {
        this.f144727a = str;
        this.f144728b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.w(this.f144727a, this.f144728b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
