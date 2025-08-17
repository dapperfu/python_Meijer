package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15251a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f144694a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractSignatureParts.a f144695b;

    public C15251a(AbstractSignatureParts abstractSignatureParts, AbstractSignatureParts.a aVar) {
        this.f144694a = abstractSignatureParts;
        this.f144695b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractSignatureParts.i(this.f144694a, this.f144695b, obj));
    }
}
