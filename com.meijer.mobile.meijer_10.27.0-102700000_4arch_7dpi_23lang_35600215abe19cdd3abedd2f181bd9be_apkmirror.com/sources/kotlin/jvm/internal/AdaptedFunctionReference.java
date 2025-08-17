package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;

@SinceKotlin
/* loaded from: classes7.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f142801a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f142802b;

    /* renamed from: c, reason: collision with root package name */
    private final String f142803c;

    /* renamed from: d, reason: collision with root package name */
    private final String f142804d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f142805e;

    /* renamed from: f, reason: collision with root package name */
    private final int f142806f;

    /* renamed from: g, reason: collision with root package name */
    private final int f142807g;

    public AdaptedFunctionReference(int i10, Class cls, String str, String str2, int i11) {
        this(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f142805e == adaptedFunctionReference.f142805e && this.f142806f == adaptedFunctionReference.f142806f && this.f142807g == adaptedFunctionReference.f142807g && Intrinsics.e(this.f142801a, adaptedFunctionReference.f142801a) && Intrinsics.e(this.f142802b, adaptedFunctionReference.f142802b) && this.f142803c.equals(adaptedFunctionReference.f142803c) && this.f142804d.equals(adaptedFunctionReference.f142804d);
    }

    public AdaptedFunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f142801a = obj;
        this.f142802b = cls;
        this.f142803c = str;
        this.f142804d = str2;
        this.f142805e = (i11 & 1) == 1;
        this.f142806f = i10;
        this.f142807g = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f142806f;
    }

    public int hashCode() {
        Object obj = this.f142801a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f142802b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f142803c.hashCode()) * 31) + this.f142804d.hashCode()) * 31) + (this.f142805e ? 1231 : 1237)) * 31) + this.f142806f) * 31) + this.f142807g;
    }

    public String toString() {
        return Reflection.l(this);
    }
}
