package lu;

import com.squareup.wire.ProtoAdapter;
import fsimpl.C14045dq;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\bJ\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\fJ)\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R\u0018\u00105\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00108¨\u0006:"}, d2 = {"Llu/n;", "", "Lkw/g;", "source", "<init>", "(Lkw/g;)V", "", "f", "()I", "expectedEndTag", "", "r", "(I)V", "g", "fieldEncoding", "b", "", "c", "()J", "d", "token", "Lkw/h;", "e", "(J)Lkw/h;", "h", "Llu/d;", "i", "()Llu/d;", "q", "()V", "j", "()Lkw/h;", "", "m", "()Ljava/lang/String;", "o", "p", "k", "l", "tag", "n", "value", "a", "(ILlu/d;Ljava/lang/Object;)V", "Lkw/g;", "J", "pos", "limit", "I", "recursionDepth", "state", "pushedLimit", "Llu/d;", "nextFieldEncoding", "", "Lkw/e;", "Ljava/util/List;", "bufferStack", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long pos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int recursionDepth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int tag;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long pushedLimit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d nextFieldEncoding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<C15328e> bufferStack;

    public n(InterfaceC15330g source) {
        Intrinsics.j(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void b(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j10 = this.pos;
        long j11 = this.limit;
        if (j10 > j11) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j10 != j11) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long c() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j10 = this.limit - this.pos;
        this.source.B1(j10);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j10;
    }

    private final int f() throws IOException {
        this.nextFieldEncoding = d.f149408e;
        this.state = 2;
        int iG = g();
        if (iG < 0) {
            throw new ProtocolException("Negative length: " + iG);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        long j10 = this.limit;
        this.pushedLimit = j10;
        long j11 = this.pos + iG;
        this.limit = j11;
        if (j11 <= j10) {
            return iG;
        }
        throw new EOFException();
    }

    private final int g() throws IOException {
        int i10;
        this.source.B1(1L);
        this.pos++;
        byte b10 = this.source.readByte();
        if (b10 >= 0) {
            return b10;
        }
        int i11 = b10 & Byte.MAX_VALUE;
        this.source.B1(1L);
        this.pos++;
        byte b11 = this.source.readByte();
        if (b11 >= 0) {
            i10 = b11 << 7;
        } else {
            i11 |= (b11 & Byte.MAX_VALUE) << 7;
            this.source.B1(1L);
            this.pos++;
            byte b12 = this.source.readByte();
            if (b12 >= 0) {
                i10 = b12 << C14045dq.LIGHTEN;
            } else {
                i11 |= (b12 & Byte.MAX_VALUE) << 14;
                this.source.B1(1L);
                this.pos++;
                byte b13 = this.source.readByte();
                if (b13 < 0) {
                    int i12 = i11 | ((b13 & Byte.MAX_VALUE) << 21);
                    this.source.B1(1L);
                    this.pos++;
                    byte b14 = this.source.readByte();
                    int i13 = i12 | (b14 << 28);
                    if (b14 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            this.source.B1(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i13;
                }
                i10 = b13 << 21;
            }
        }
        return i11 | i10;
    }

    private final void r(int expectedEndTag) throws IOException {
        while (this.pos < this.limit && !this.source.j2()) {
            int iG = g();
            if (iG == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i10 = iG >> 3;
            int i11 = iG & 7;
            if (i11 == 0) {
                this.state = 0;
                p();
            } else if (i11 == 1) {
                this.state = 1;
                l();
            } else if (i11 == 2) {
                long jG = g();
                this.pos += jG;
                this.source.skip(jG);
            } else {
                if (i11 == 3) {
                    int i12 = this.recursionDepth + 1;
                    this.recursionDepth = i12;
                    if (i12 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        r(i10);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i11 == 4) {
                    if (i10 != expectedEndTag) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i11 != 5) {
                        throw new ProtocolException("Unexpected field encoding: " + i11);
                    }
                    this.state = 5;
                    k();
                }
            }
        }
        throw new EOFException();
    }

    public void a(int tag, d fieldEncoding, Object value) throws IOException {
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        o oVar = new o(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterE = fieldEncoding.e();
        Intrinsics.h(protoAdapterE, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterE.f(oVar, tag, value);
    }

    public long d() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i10 = this.recursionDepth + 1;
        this.recursionDepth = i10;
        if (i10 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i10 > this.bufferStack.size()) {
            this.bufferStack.add(new C15328e());
        }
        long j10 = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j10;
    }

    public C15331h e(long token) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i10 = this.recursionDepth - 1;
        this.recursionDepth = i10;
        if (i10 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i10 == 0) {
            this.limit = token;
            C15328e c15328e = this.bufferStack.get(i10);
            return c15328e.getSize() > 0 ? c15328e.Q2() : C15331h.f148095e;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public int h() throws IOException {
        int i10 = this.state;
        if (i10 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.j2()) {
            int iG = g();
            if (iG == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iG >> 3;
            this.tag = i11;
            int i12 = iG & 7;
            if (i12 == 0) {
                this.nextFieldEncoding = d.f149406c;
                this.state = 0;
                return i11;
            }
            if (i12 == 1) {
                this.nextFieldEncoding = d.f149407d;
                this.state = 1;
                return i11;
            }
            if (i12 == 2) {
                f();
                return this.tag;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 == 5) {
                    this.nextFieldEncoding = d.f149409f;
                    this.state = 5;
                    return i11;
                }
                throw new ProtocolException("Unexpected field encoding: " + i12);
            }
            r(i11);
        }
        return -1;
    }

    /* renamed from: i, reason: from getter */
    public d getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public int k() throws IOException {
        int i10 = this.state;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.B1(4L);
        this.pos += 4;
        int iF3 = this.source.f3();
        b(5);
        return iF3;
    }

    public long l() throws IOException {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.B1(8L);
        this.pos += 8;
        long jS1 = this.source.s1();
        b(1);
        return jS1;
    }

    public int o() throws IOException {
        int i10 = this.state;
        if (i10 == 0 || i10 == 2) {
            int iG = g();
            b(0);
            return iG;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public long p() throws IOException {
        int i10 = this.state;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.source.B1(1L);
            this.pos++;
            j10 |= (r4 & Byte.MAX_VALUE) << i11;
            if ((this.source.readByte() & 128) == 0) {
                b(0);
                return j10;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void q() throws IOException {
        int i10 = this.state;
        if (i10 == 0) {
            p();
            return;
        }
        if (i10 == 1) {
            l();
            return;
        }
        if (i10 == 2) {
            this.source.skip(c());
        } else {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            k();
        }
    }

    public C15331h j() throws IOException {
        long jC = c();
        this.source.B1(jC);
        return this.source.O1(jC);
    }

    public String m() throws IOException {
        long jC = c();
        this.source.B1(jC);
        return this.source.K1(jC);
    }

    public void n(int tag) throws IOException {
        d nextFieldEncoding = getNextFieldEncoding();
        Intrinsics.g(nextFieldEncoding);
        a(tag, nextFieldEncoding, nextFieldEncoding.e().d(this));
    }
}
