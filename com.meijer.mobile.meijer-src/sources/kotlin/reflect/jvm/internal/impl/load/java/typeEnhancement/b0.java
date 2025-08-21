package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes14.dex */
class b0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f145606a = new b0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(SignatureEnhancement.s((UnwrappedType) obj));
    }
}
