package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;

/* renamed from: kotlin.reflect.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15234h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C15234h f143225a = new C15234h();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmFunctionSignature.JavaConstructor.c((Class) obj);
    }
}
