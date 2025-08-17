package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes13.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f147041a = new a();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return CapturedTypeApproximationKt.e((UnwrappedType) obj);
    }
}
