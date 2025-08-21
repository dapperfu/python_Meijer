package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes4.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).h(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @SinceKotlin
    public PropertyReference0Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @SinceKotlin
    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
