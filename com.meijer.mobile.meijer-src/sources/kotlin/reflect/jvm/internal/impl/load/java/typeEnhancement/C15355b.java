package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15355b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeEnhancementInfo f145604a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaTypeQualifiers[] f145605b;

    public C15355b(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.f145604a = typeEnhancementInfo;
        this.f145605b = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.e(this.f145604a, this.f145605b, ((Number) obj).intValue());
    }
}
