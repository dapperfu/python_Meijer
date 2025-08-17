package Gv;

import Gv.c;
import Gv.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J5\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010JJ=\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bK\u0010LJC\u0010M\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u00152\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bM\u0010L¨\u0006N"}, d2 = {"LGv/a;", "LGv/e;", "LGv/c;", "<init>", "()V", "", "I", "()Ljava/lang/Object;", "", "B", "()Z", "", "i", "()Ljava/lang/Void;", "s", "", "E", "()B", "", "o", "()S", "", "h", "()I", "", "k", "()J", "", "p", "()F", "", "q", "()D", "", "t", "()C", "", "A", "()Ljava/lang/String;", "LFv/f;", "descriptor", "f", "(LFv/f;)LGv/e;", "T", "LDv/a;", "deserializer", "previousValue", "H", "(LDv/a;Ljava/lang/Object;)Ljava/lang/Object;", "c", "(LFv/f;)LGv/c;", "", "a", "(LFv/f;)V", "index", "w", "(LFv/f;I)Z", "D", "(LFv/f;I)B", "j", "(LFv/f;I)S", "F", "(LFv/f;I)I", "y", "(LFv/f;I)J", "x", "(LFv/f;I)F", "e", "(LFv/f;I)D", "z", "(LFv/f;I)C", "r", "(LFv/f;I)Ljava/lang/String;", "u", "(LFv/f;I)LGv/e;", "m", "(LFv/f;ILDv/a;Ljava/lang/Object;)Ljava/lang/Object;", "l", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class a implements e, c {
    @Override // Gv.e
    public boolean B() {
        return true;
    }

    @Override // Gv.e
    public abstract byte E();

    @Override // Gv.c
    public void a(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    @Override // Gv.e
    public c c(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Gv.e
    public e f(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Gv.e
    public abstract int h();

    @Override // Gv.e
    public Void i() {
        return null;
    }

    @Override // Gv.e
    public abstract long k();

    @Override // Gv.e
    public abstract short o();

    @Override // Gv.c
    public final byte D(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return E();
    }

    @Override // Gv.c
    public final int F(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return h();
    }

    public <T> T H(Dv.a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(deserializer, "deserializer");
        return (T) G(deserializer);
    }

    public Object I() {
        throw new SerializationException(Reflection.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // Gv.c
    public final double e(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return q();
    }

    @Override // Gv.c
    public final short j(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return o();
    }

    @Override // Gv.c
    public final <T> T l(Fv.f descriptor, int index, Dv.a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (deserializer.getDescriptor().g() || B()) ? (T) H(deserializer, previousValue) : (T) i();
    }

    @Override // Gv.c
    public <T> T m(Fv.f descriptor, int index, Dv.a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) H(deserializer, previousValue);
    }

    @Override // Gv.c
    public final String r(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return A();
    }

    @Override // Gv.c
    public e u(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return f(descriptor.l(index));
    }

    @Override // Gv.c
    public final boolean w(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return s();
    }

    @Override // Gv.c
    public final float x(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return p();
    }

    @Override // Gv.c
    public final long y(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return k();
    }

    @Override // Gv.c
    public final char z(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return t();
    }

    @Override // Gv.e
    public String A() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.String");
        return (String) objI;
    }

    @Override // Gv.c
    public int C(Fv.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // Gv.e
    public <T> T G(Dv.a<? extends T> aVar) {
        return (T) e.a.a(this, aVar);
    }

    @Override // Gv.c
    public boolean n() {
        return c.a.b(this);
    }

    @Override // Gv.e
    public float p() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objI).floatValue();
    }

    @Override // Gv.e
    public double q() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objI).doubleValue();
    }

    @Override // Gv.e
    public boolean s() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objI).booleanValue();
    }

    @Override // Gv.e
    public char t() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objI).charValue();
    }
}
