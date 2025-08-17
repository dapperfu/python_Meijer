package kotlin.jvm.internal;

import kotlin.SinceKotlin;

/* loaded from: classes7.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    @SinceKotlin
    public PropertyReference2Impl(Class cls, String str, String str2, int i10) {
        super(cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty2
    public Object n(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
