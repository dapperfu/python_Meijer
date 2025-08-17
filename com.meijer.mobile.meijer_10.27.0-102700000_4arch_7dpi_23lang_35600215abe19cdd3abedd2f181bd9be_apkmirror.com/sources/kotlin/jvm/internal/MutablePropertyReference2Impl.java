package kotlin.jvm.internal;

/* loaded from: classes7.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    @Override // kotlin.reflect.KProperty2
    public Object n(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
