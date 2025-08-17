package Gv;

import Dv.h;
import Gv.d;
import Gv.f;
import Hv.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0017¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001f¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\"¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020%¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020(¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@JA\u0010E\u001a\u00020\t\"\n\b\u0000\u0010B*\u0004\u0018\u00010A2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\bE\u0010FJA\u0010G\u001a\u00020\t\"\b\b\u0000\u0010B*\u00020A2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bG\u0010F¨\u0006H"}, d2 = {"LGv/b;", "LGv/f;", "LGv/d;", "<init>", "()V", "LFv/f;", "descriptor", "c", "(LFv/f;)LGv/d;", "", "a", "(LFv/f;)V", "", "index", "", "F", "(LFv/f;I)Z", "value", "t", "(Z)V", "", "h", "(B)V", "", "s", "(S)V", "A", "(I)V", "", "q", "(J)V", "", "u", "(F)V", "", "g", "(D)V", "", "w", "(C)V", "", "E", "(Ljava/lang/String;)V", "D", "(LFv/f;)LGv/f;", "i", "(LFv/f;IZ)V", "l", "(LFv/f;IB)V", "B", "(LFv/f;IS)V", "f", "(LFv/f;II)V", "e", "(LFv/f;IJ)V", "j", "(LFv/f;IF)V", "C", "(LFv/f;ID)V", "k", "(LFv/f;IC)V", "v", "(LFv/f;ILjava/lang/String;)V", "n", "(LFv/f;I)LGv/f;", "", "T", "LDv/h;", "serializer", "z", "(LFv/f;ILDv/h;Ljava/lang/Object;)V", "o", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class b implements f, d {
    @Override // Gv.f
    public abstract void A(int value);

    @Override // Gv.f
    public f D(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Gv.f
    public abstract void E(String value);

    public boolean F(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return true;
    }

    @Override // Gv.d
    public void a(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    @Override // Gv.f
    public d c(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return this;
    }

    @Override // Gv.f
    public abstract void g(double value);

    @Override // Gv.f
    public abstract void h(byte value);

    @Override // Gv.f
    public abstract void q(long value);

    @Override // Gv.f
    public abstract void s(short value);

    @Override // Gv.f
    public abstract void t(boolean value);

    @Override // Gv.f
    public abstract void u(float value);

    @Override // Gv.f
    public abstract void w(char value);

    @Override // Gv.d
    public final void B(Fv.f descriptor, int index, short value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            s(value);
        }
    }

    @Override // Gv.d
    public final void C(Fv.f descriptor, int index, double value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            g(value);
        }
    }

    @Override // Gv.d
    public final void e(Fv.f descriptor, int index, long value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            q(value);
        }
    }

    @Override // Gv.d
    public final void f(Fv.f descriptor, int index, int value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            A(value);
        }
    }

    @Override // Gv.d
    public final void i(Fv.f descriptor, int index, boolean value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            t(value);
        }
    }

    @Override // Gv.d
    public final void j(Fv.f descriptor, int index, float value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            u(value);
        }
    }

    @Override // Gv.d
    public final void k(Fv.f descriptor, int index, char value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            w(value);
        }
    }

    @Override // Gv.d
    public final void l(Fv.f descriptor, int index, byte value) {
        Intrinsics.j(descriptor, "descriptor");
        if (F(descriptor, index)) {
            h(value);
        }
    }

    @Override // Gv.d
    public final f n(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return F(descriptor, index) ? D(descriptor.l(index)) : P.f13294a;
    }

    @Override // Gv.d
    public <T> void o(Fv.f descriptor, int index, h<? super T> serializer, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(serializer, "serializer");
        if (F(descriptor, index)) {
            G(serializer, value);
        }
    }

    @Override // Gv.d
    public final void v(Fv.f descriptor, int index, String value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(value, "value");
        if (F(descriptor, index)) {
            E(value);
        }
    }

    @Override // Gv.d
    public <T> void z(Fv.f descriptor, int index, h<? super T> serializer, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(serializer, "serializer");
        if (F(descriptor, index)) {
            p(serializer, value);
        }
    }

    public <T> void G(h<? super T> hVar, T t10) {
        f.a.c(this, hVar, t10);
    }

    @Override // Gv.d
    public boolean m(Fv.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }

    @Override // Gv.f
    public <T> void p(h<? super T> hVar, T t10) {
        f.a.d(this, hVar, t10);
    }

    @Override // Gv.f
    public d x(Fv.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // Gv.f
    public void y() {
        f.a.b(this);
    }
}
