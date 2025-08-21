package hu;

import com.medallia.digital.mobilesdk.l3;
import gw.C14419h;
import gw.InterfaceC14417f;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhu/o;", "", "Lgw/f;", "sink", "<init>", "(Lgw/f;)V", "Lgw/h;", "value", "", "a", "(Lgw/h;)V", "", "e", "(Ljava/lang/String;)V", "", "fieldNumber", "Lhu/d;", "fieldEncoding", "f", "(ILhu/d;)V", "d", "(I)V", "g", "", "h", "(J)V", "b", "c", "Lgw/f;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14417f sink;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lhu/o$a;", "", "<init>", "()V", "", "fieldNumber", "Lhu/d;", "fieldEncoding", "f", "(ILhu/d;)I", "tag", "g", "(I)I", "value", "e", "h", "", "i", "(J)I", "n", "c", "a", "d", "(J)J", "b", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: hu.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long b(long n10) {
            return (-(n10 & 1)) ^ (n10 >>> 1);
        }

        public final long d(long n10) {
            return (n10 >> 63) ^ (n10 << 1);
        }

        private Companion() {
        }

        public final int a(int n10) {
            return (-(n10 & 1)) ^ (n10 >>> 1);
        }

        public final int c(int n10) {
            return (n10 >> 31) ^ (n10 << 1);
        }

        public final int e(int value) {
            if (value >= 0) {
                return h(value);
            }
            return 10;
        }

        public final int f(int fieldNumber, d fieldEncoding) {
            Intrinsics.j(fieldEncoding, "fieldEncoding");
            return (fieldNumber << 3) | fieldEncoding.getValue();
        }

        public final int g(int tag) {
            return h(f(tag, d.f136158c));
        }

        public final int h(int value) {
            if ((value & (-128)) == 0) {
                return 1;
            }
            if ((value & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            return (value & (-268435456)) == 0 ? 4 : 5;
        }

        public final int i(long value) {
            if (((-128) & value) == 0) {
                return 1;
            }
            if (((-16384) & value) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            if (((-268435456) & value) == 0) {
                return 4;
            }
            if (((-34359738368L) & value) == 0) {
                return 5;
            }
            if (((-4398046511104L) & value) == 0) {
                return 6;
            }
            if (((-562949953421312L) & value) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & value) == 0) {
                return 8;
            }
            return (value & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
    }

    public o(InterfaceC14417f sink) {
        Intrinsics.j(sink, "sink");
        this.sink = sink;
    }

    public final void a(C14419h value) throws IOException {
        Intrinsics.j(value, "value");
        this.sink.g1(value);
    }

    public final void b(int value) throws IOException {
        this.sink.h2(value);
    }

    public final void c(long value) throws IOException {
        this.sink.f0(value);
    }

    public final void d(int value) throws IOException {
        if (value >= 0) {
            g(value);
        } else {
            h(value);
        }
    }

    public final void e(String value) throws IOException {
        Intrinsics.j(value, "value");
        this.sink.G0(value);
    }

    public final void f(int fieldNumber, d fieldEncoding) throws IOException {
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        g(INSTANCE.f(fieldNumber, fieldEncoding));
    }

    public final void g(int value) throws IOException {
        while ((value & (-128)) != 0) {
            this.sink.writeByte((value & l3.f93324d) | 128);
            value >>>= 7;
        }
        this.sink.writeByte(value);
    }

    public final void h(long value) throws IOException {
        while (((-128) & value) != 0) {
            this.sink.writeByte((((int) value) & l3.f93324d) | 128);
            value >>>= 7;
        }
        this.sink.writeByte((int) value);
    }
}
