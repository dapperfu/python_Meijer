package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

@Deprecated
@Deprecated
/* loaded from: classes7.dex */
public abstract class FunctionImpl implements Function, Serializable, Function0, Function1, Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21, Function22 {
    public abstract int getArity();

    @Override // kotlin.jvm.functions.Function6
    public Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a(6);
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        a(0);
        return b(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function5
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a(5);
        return b(obj, obj2, obj3, obj4, obj5);
    }

    private void c(int i10) {
        throw new IllegalStateException("Wrong function arity, expected: " + i10 + ", actual: " + getArity());
    }

    public Object b(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    private void a(int i10) {
        if (getArity() != i10) {
            c(i10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        a(1);
        return b(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        a(2);
        return b(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        a(3);
        return b(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        a(4);
        return b(obj, obj2, obj3, obj4);
    }
}
