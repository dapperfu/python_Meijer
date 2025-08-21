package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;

    @SinceKotlin
    private final int flags;

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.e(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.e(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @SinceKotlin
    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    @SinceKotlin
    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    protected KCallable computeReflected() {
        return Reflection.a(this);
    }

    public int hashCode() {
        int iHashCode;
        if (getOwner() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getOwner().hashCode() * 31;
        }
        return ((iHashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
