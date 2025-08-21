package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* loaded from: classes4.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2() {
    }

    @SinceKotlin
    public PropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.k(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return n(obj, obj2);
    }
}
