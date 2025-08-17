package hw;

import com.medallia.digital.mobilesdk.l3;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15329f;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010 R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lhw/l;", "Ljava/io/Closeable;", "", "isClient", "Lkw/f;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLkw/f;Ljava/util/Random;ZZJ)V", "", "opcode", "Lkw/h;", "payload", "", "b", "(ILkw/h;)V", "d", "(Lkw/h;)V", "g", "code", "reason", "a", "formatOpcode", "data", "c", "close", "()V", "Z", "Lkw/f;", "getSink", "()Lkw/f;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "e", "f", "J", "Lkw/e;", "Lkw/e;", "messageBuffer", "h", "sinkBuffer", "i", "writerClosed", "Lhw/a;", "j", "Lhw/a;", "messageDeflater", "", "k", "[B", "maskKey", "Lkw/e$a;", "l", "Lkw/e$a;", "maskCursor", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class l implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15329f sink;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long minimumDeflateSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C15328e messageBuffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C15328e sinkBuffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean writerClosed;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a messageDeflater;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C15328e.a maskCursor;

    public l(boolean z10, InterfaceC15329f sink, Random random, boolean z11, boolean z12, long j10) {
        Intrinsics.j(sink, "sink");
        Intrinsics.j(random, "random");
        this.isClient = z10;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new C15328e();
        this.sinkBuffer = sink.getBufferField();
        this.maskKey = z10 ? new byte[4] : null;
        this.maskCursor = z10 ? new C15328e.a() : null;
    }

    private final void b(int opcode, C15331h payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iV = payload.V();
        if (iV > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.writeByte(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(iV | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.g(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (iV > 0) {
                long size = this.sinkBuffer.getSize();
                this.sinkBuffer.Z2(payload);
                C15328e c15328e = this.sinkBuffer;
                C15328e.a aVar = this.maskCursor;
                Intrinsics.g(aVar);
                c15328e.A(aVar);
                this.maskCursor.d(size);
                j.f136467a.b(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(iV);
            this.sinkBuffer.Z2(payload);
        }
        this.sink.flush();
    }

    public final void a(int code, C15331h reason) throws IOException {
        C15331h c15331hQ2 = C15331h.f148095e;
        if (code != 0 || reason != null) {
            if (code != 0) {
                j.f136467a.c(code);
            }
            C15328e c15328e = new C15328e();
            c15328e.writeShort(code);
            if (reason != null) {
                c15328e.Z2(reason);
            }
            c15331hQ2 = c15328e.Q2();
        }
        try {
            b(8, c15331hQ2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void c(int formatOpcode, C15331h data) throws IOException {
        Intrinsics.j(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.Z2(data);
        int i10 = formatOpcode | 128;
        if (this.perMessageDeflate && data.V() >= this.minimumDeflateSize) {
            a aVar = this.messageDeflater;
            if (aVar == null) {
                aVar = new a(this.noContextTakeover);
                this.messageDeflater = aVar;
            }
            aVar.a(this.messageBuffer);
            i10 = formatOpcode | 192;
        }
        long size = this.messageBuffer.getSize();
        this.sinkBuffer.writeByte(i10);
        int i11 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i11 | ((int) size));
        } else if (size <= 65535) {
            this.sinkBuffer.writeByte(i11 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i11 | l3.f92485d);
            this.sinkBuffer.v0(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.g(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                C15328e c15328e = this.messageBuffer;
                C15328e.a aVar2 = this.maskCursor;
                Intrinsics.g(aVar2);
                c15328e.A(aVar2);
                this.maskCursor.d(0L);
                j.f136467a.b(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.M1(this.messageBuffer, size);
        this.sink.X();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.messageDeflater;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(C15331h payload) throws IOException {
        Intrinsics.j(payload, "payload");
        b(9, payload);
    }

    public final void g(C15331h payload) throws IOException {
        Intrinsics.j(payload, "payload");
        b(10, payload);
    }
}
