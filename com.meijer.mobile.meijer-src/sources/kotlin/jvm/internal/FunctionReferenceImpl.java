package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes4.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i10, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i10, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).h(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @SinceKotlin
    public FunctionReferenceImpl(int i10, Class cls, String str, String str2, int i11) {
        super(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @SinceKotlin
    public FunctionReferenceImpl(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }
}
