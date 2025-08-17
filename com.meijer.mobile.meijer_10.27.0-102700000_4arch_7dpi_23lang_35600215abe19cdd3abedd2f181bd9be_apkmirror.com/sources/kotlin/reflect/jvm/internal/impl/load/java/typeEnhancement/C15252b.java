package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15252b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeEnhancementInfo f144697a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaTypeQualifiers[] f144698b;

    public C15252b(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.f144697a = typeEnhancementInfo;
        this.f144698b = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.e(this.f144697a, this.f144698b, ((Number) obj).intValue());
    }
}
