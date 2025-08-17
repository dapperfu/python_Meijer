package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;

/* loaded from: classes13.dex */
class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f147158a = new g();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReturnsCheck.ReturnsInt.c((KotlinBuiltIns) obj);
    }
}
