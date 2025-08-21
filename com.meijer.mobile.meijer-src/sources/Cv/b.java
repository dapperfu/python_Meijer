package Cv;

import Cv.d;
import Cv.f;
import Dv.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zv.h;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0017¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001f¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\"¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020%¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020(¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@JA\u0010E\u001a\u00020\t\"\n\b\u0000\u0010B*\u0004\u0018\u00010A2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\bE\u0010FJA\u0010G\u001a\u00020\t\"\b\b\u0000\u0010B*\u00020A2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bG\u0010F¨\u0006H"}, d2 = {"LCv/b;", "LCv/f;", "LCv/d;", "<init>", "()V", "LBv/f;", "descriptor", "b", "(LBv/f;)LCv/d;", "", "a", "(LBv/f;)V", "", "index", "", "F", "(LBv/f;I)Z", "value", "r", "(Z)V", "", "f", "(B)V", "", "q", "(S)V", "A", "(I)V", "", "m", "(J)V", "", "s", "(F)V", "", "e", "(D)V", "", "w", "(C)V", "", "E", "(Ljava/lang/String;)V", "x", "(LBv/f;)LCv/f;", "n", "(LBv/f;IZ)V", "B", "(LBv/f;IB)V", "v", "(LBv/f;IS)V", "C", "(LBv/f;II)V", "j", "(LBv/f;IJ)V", "g", "(LBv/f;IF)V", "i", "(LBv/f;ID)V", "k", "(LBv/f;IC)V", "o", "(LBv/f;ILjava/lang/String;)V", "u", "(LBv/f;I)LCv/f;", "", "T", "Lzv/h;", "serializer", "l", "(LBv/f;ILzv/h;Ljava/lang/Object;)V", "t", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b implements f, d {
    @Override // Cv.f
    public abstract void A(int value);

    @Override // Cv.f
    public abstract void E(String value);

    public boolean F(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return true;
    }

    @Override // Cv.d
    public void a(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    @Override // Cv.f
    public d b(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Cv.f
    public abstract void e(double value);

    @Override // Cv.f
    public abstract void f(byte value);

    @Override // Cv.f
    public abstract void m(long value);

    @Override // Cv.f
    public abstract void q(short value);

    @Override // Cv.f
    public abstract void r(boolean value);

    @Override // Cv.f
    public abstract void s(float value);

    @Override // Cv.f
    public abstract void w(char value);

    @Override // Cv.f
    public f x(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Cv.d
    public final void B(Bv.f descriptor, int index, byte value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            f(value);
        }
    }

    @Override // Cv.d
    public final void C(Bv.f descriptor, int index, int value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            A(value);
        }
    }

    @Override // Cv.d
    public final void g(Bv.f descriptor, int index, float value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            s(value);
        }
    }

    @Override // Cv.d
    public final void i(Bv.f descriptor, int index, double value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            e(value);
        }
    }

    @Override // Cv.d
    public final void j(Bv.f descriptor, int index, long value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            m(value);
        }
    }

    @Override // Cv.d
    public final void k(Bv.f descriptor, int index, char value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            w(value);
        }
    }

    @Override // Cv.d
    public <T> void l(Bv.f descriptor, int index, h<? super T> serializer, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(serializer, "serializer");
        if (F(descriptor, index)) {
            D(serializer, value);
        }
    }

    @Override // Cv.d
    public final void n(Bv.f descriptor, int index, boolean value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            r(value);
        }
    }

    @Override // Cv.d
    public final void o(Bv.f descriptor, int index, String value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(value, "value");
        if (F(descriptor, index)) {
            E(value);
        }
    }

    @Override // Cv.d
    public <T> void t(Bv.f descriptor, int index, h<? super T> serializer, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(serializer, "serializer");
        if (F(descriptor, index)) {
            G(serializer, value);
        }
    }

    @Override // Cv.d
    public final f u(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return F(descriptor, index) ? x(descriptor.l(index)) : P.f6716a;
    }

    @Override // Cv.d
    public final void v(Bv.f descriptor, int index, short value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            q(value);
        }
    }

    @Override // Cv.f
    public <T> void D(h<? super T> hVar, T t10) {
        f.a.d(this, hVar, t10);
    }

    public <T> void G(h<? super T> hVar, T t10) {
        f.a.c(this, hVar, t10);
    }

    @Override // Cv.f
    public d h(Bv.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // Cv.f
    public void y() {
        f.a.b(this);
    }

    @Override // Cv.d
    public boolean z(Bv.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }
}
