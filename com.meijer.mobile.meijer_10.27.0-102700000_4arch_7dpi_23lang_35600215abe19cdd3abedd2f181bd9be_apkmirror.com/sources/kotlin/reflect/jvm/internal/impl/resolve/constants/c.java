package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f146199a = new c();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntegerLiteralTypeConstructor.p((KotlinType) obj);
    }
}
