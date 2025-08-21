package Cv;

import Cv.c;
import Cv.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J5\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010JJ=\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bK\u0010LJC\u0010M\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u00020\u00152\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bM\u0010L¨\u0006N"}, d2 = {"LCv/a;", "LCv/e;", "LCv/c;", "<init>", "()V", "", "I", "()Ljava/lang/Object;", "", "E", "()Z", "", "l", "()Ljava/lang/Void;", "v", "", "G", "()B", "", "r", "()S", "", "k", "()I", "", "n", "()J", "", "s", "()F", "", "t", "()D", "", "x", "()C", "", "B", "()Ljava/lang/String;", "LBv/f;", "descriptor", "y", "(LBv/f;)LCv/e;", "T", "Lzv/a;", "deserializer", "previousValue", "H", "(Lzv/a;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(LBv/f;)LCv/c;", "", "a", "(LBv/f;)V", "index", "h", "(LBv/f;I)Z", "F", "(LBv/f;I)B", "A", "(LBv/f;I)S", "w", "(LBv/f;I)I", "C", "(LBv/f;I)J", "g", "(LBv/f;I)F", "D", "(LBv/f;I)D", "i", "(LBv/f;I)C", "q", "(LBv/f;I)Ljava/lang/String;", "o", "(LBv/f;I)LCv/e;", "e", "(LBv/f;ILzv/a;Ljava/lang/Object;)Ljava/lang/Object;", "u", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class a implements e, c {
    @Override // Cv.e
    public boolean E() {
        return true;
    }

    @Override // Cv.e
    public abstract byte G();

    @Override // Cv.c
    public void a(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    @Override // Cv.e
    public c b(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Cv.e
    public abstract int k();

    @Override // Cv.e
    public Void l() {
        return null;
    }

    @Override // Cv.e
    public abstract long n();

    @Override // Cv.e
    public abstract short r();

    @Override // Cv.e
    public e y(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Cv.c
    public final short A(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return r();
    }

    @Override // Cv.c
    public final long C(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return n();
    }

    @Override // Cv.c
    public final double D(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return t();
    }

    @Override // Cv.c
    public final byte F(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return G();
    }

    public <T> T H(InterfaceC18555a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(deserializer, "deserializer");
        return (T) z(deserializer);
    }

    public Object I() {
        throw new SerializationException(Reflection.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // Cv.c
    public <T> T e(Bv.f descriptor, int index, InterfaceC18555a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) H(deserializer, previousValue);
    }

    @Override // Cv.c
    public final float g(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return s();
    }

    @Override // Cv.c
    public final boolean h(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return v();
    }

    @Override // Cv.c
    public final char i(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return x();
    }

    @Override // Cv.c
    public e o(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return y(descriptor.l(index));
    }

    @Override // Cv.c
    public final String q(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return B();
    }

    @Override // Cv.c
    public final <T> T u(Bv.f descriptor, int index, InterfaceC18555a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (deserializer.getDescriptor().g() || E()) ? (T) H(deserializer, previousValue) : (T) l();
    }

    @Override // Cv.c
    public final int w(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return k();
    }

    @Override // Cv.e
    public String B() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.String");
        return (String) objI;
    }

    @Override // Cv.c
    public int m(Bv.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // Cv.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // Cv.e
    public float s() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objI).floatValue();
    }

    @Override // Cv.e
    public double t() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objI).doubleValue();
    }

    @Override // Cv.e
    public boolean v() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objI).booleanValue();
    }

    @Override // Cv.e
    public char x() {
        Object objI = I();
        Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objI).charValue();
    }

    @Override // Cv.e
    public <T> T z(InterfaceC18555a<? extends T> interfaceC18555a) {
        return (T) e.a.a(this, interfaceC18555a);
    }
}
