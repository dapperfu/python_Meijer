package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes4.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).h(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @SinceKotlin
    public PropertyReference1Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }
}
