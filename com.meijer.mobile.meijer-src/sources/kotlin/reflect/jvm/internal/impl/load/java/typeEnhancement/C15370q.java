package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15370q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SignatureBuildingComponents f145628a;

    public C15370q(SignatureBuildingComponents signatureBuildingComponents) {
        this.f145628a = signatureBuildingComponents;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.q(this.f145628a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
