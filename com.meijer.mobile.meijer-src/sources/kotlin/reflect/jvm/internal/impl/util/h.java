package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;

/* loaded from: classes14.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f148066a = new h();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReturnsCheck.ReturnsUnit.c((KotlinBuiltIns) obj);
    }
}
