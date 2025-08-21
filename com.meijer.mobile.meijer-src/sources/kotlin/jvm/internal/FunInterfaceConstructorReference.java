package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KFunction;

@SinceKotlin
/* loaded from: classes4.dex */
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Class f143730b;

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.f143730b.equals(((FunInterfaceConstructorReference) obj).f143730b);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.f143730b.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.f143730b.getName();
    }
}
