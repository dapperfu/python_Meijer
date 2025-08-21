package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;

/* renamed from: kotlin.reflect.jvm.internal.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15336g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C15336g f144130a = new C15336g();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmFunctionSignature.FakeJavaAnnotationConstructor.c((Method) obj);
    }
}
