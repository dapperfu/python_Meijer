package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15354a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f145601a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractSignatureParts.a f145602b;

    public C15354a(AbstractSignatureParts abstractSignatureParts, AbstractSignatureParts.a aVar) {
        this.f145601a = abstractSignatureParts;
        this.f145602b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractSignatureParts.i(this.f145601a, this.f145602b, obj));
    }
}
