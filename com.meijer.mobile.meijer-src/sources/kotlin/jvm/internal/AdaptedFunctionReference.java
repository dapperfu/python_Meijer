package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;

@SinceKotlin
/* loaded from: classes4.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f143708a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f143709b;

    /* renamed from: c, reason: collision with root package name */
    private final String f143710c;

    /* renamed from: d, reason: collision with root package name */
    private final String f143711d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f143712e;

    /* renamed from: f, reason: collision with root package name */
    private final int f143713f;

    /* renamed from: g, reason: collision with root package name */
    private final int f143714g;

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
        return this.f143712e == adaptedFunctionReference.f143712e && this.f143713f == adaptedFunctionReference.f143713f && this.f143714g == adaptedFunctionReference.f143714g && Intrinsics.e(this.f143708a, adaptedFunctionReference.f143708a) && Intrinsics.e(this.f143709b, adaptedFunctionReference.f143709b) && this.f143710c.equals(adaptedFunctionReference.f143710c) && this.f143711d.equals(adaptedFunctionReference.f143711d);
    }

    public AdaptedFunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f143708a = obj;
        this.f143709b = cls;
        this.f143710c = str;
        this.f143711d = str2;
        this.f143712e = (i11 & 1) == 1;
        this.f143713f = i10;
        this.f143714g = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f143713f;
    }

    public int hashCode() {
        Object obj = this.f143708a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f143709b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f143710c.hashCode()) * 31) + this.f143711d.hashCode()) * 31) + (this.f143712e ? 1231 : 1237)) * 31) + this.f143713f) * 31) + this.f143714g;
    }

    public String toString() {
        return Reflection.l(this);
    }
}
