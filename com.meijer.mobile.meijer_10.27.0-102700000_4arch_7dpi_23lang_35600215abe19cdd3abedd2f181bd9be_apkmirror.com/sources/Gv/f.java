package Gv;

import Dv.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010+J1\u0010/\u001a\u00020\u0002\"\n\b\u0000\u0010,*\u0004\u0018\u00010\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LGv/f;", "", "", "y", "()V", "r", "", "value", "t", "(Z)V", "", "h", "(B)V", "", "s", "(S)V", "", "w", "(C)V", "", "A", "(I)V", "", "q", "(J)V", "", "u", "(F)V", "", "g", "(D)V", "", "E", "(Ljava/lang/String;)V", "LFv/f;", "descriptor", "D", "(LFv/f;)LGv/f;", "LGv/d;", "c", "(LFv/f;)LGv/d;", "collectionSize", "x", "(LFv/f;I)LGv/d;", "T", "LDv/h;", "serializer", "p", "(LDv/h;Ljava/lang/Object;)V", "LMv/c;", "b", "()LMv/c;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface f {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static void b(f fVar) {
        }

        public static d a(f fVar, Fv.f descriptor, int i10) {
            Intrinsics.j(descriptor, "descriptor");
            return fVar.c(descriptor);
        }

        public static <T> void c(f fVar, h<? super T> serializer, T t10) {
            Intrinsics.j(serializer, "serializer");
            if (serializer.a().g()) {
                fVar.p(serializer, t10);
            } else if (t10 == null) {
                fVar.r();
            } else {
                fVar.y();
                fVar.p(serializer, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, h<? super T> serializer, T t10) {
            Intrinsics.j(serializer, "serializer");
            serializer.b(fVar, t10);
        }
    }

    void A(int value);

    f D(Fv.f descriptor);

    void E(String value);

    Mv.c b();

    d c(Fv.f descriptor);

    void g(double value);

    void h(byte value);

    <T> void p(h<? super T> serializer, T value);

    void q(long value);

    void r();

    void s(short value);

    void t(boolean value);

    void u(float value);

    void w(char value);

    d x(Fv.f descriptor, int collectionSize);

    void y();
}
