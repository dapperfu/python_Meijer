package dw;

import com.medallia.digital.mobilesdk.l3;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Ldw/k;", "Ljava/io/Closeable;", "", "isClient", "Lgw/g;", "source", "Ldw/k$a;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLgw/g;Ldw/k$a;ZZ)V", "", "c", "()V", "b", "g", "h", "d", "a", "close", "Z", "Lgw/g;", "getSource", "()Lgw/g;", "Ldw/k$a;", "e", "f", "closed", "", "I", "opcode", "", "J", "frameLength", "i", "isFinalFrame", "j", "isControlFrame", "k", "readingCompressedMessage", "Lgw/e;", "l", "Lgw/e;", "controlFrameBuffer", "m", "messageFrameBuffer", "Ldw/c;", "n", "Ldw/c;", "messageInflater", "", "o", "[B", "maskKey", "Lgw/e$a;", "p", "Lgw/e$a;", "maskCursor", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class k implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a frameCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int opcode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long frameLength;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalFrame;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isControlFrame;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean readingCompressedMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C14416e controlFrameBuffer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C14416e messageFrameBuffer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private c messageInflater;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C14416e.a maskCursor;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Ldw/k$a;", "", "", "text", "", "e", "(Ljava/lang/String;)V", "Lgw/h;", "bytes", "d", "(Lgw/h;)V", "payload", "g", "c", "", "code", "reason", "h", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void c(C14419h payload);

        void d(C14419h bytes) throws IOException;

        void e(String text) throws IOException;

        void g(C14419h payload);

        void h(int code, String reason);
    }

    public k(boolean z10, InterfaceC14418g source, a frameCallback, boolean z11, boolean z12) {
        Intrinsics.j(source, "source");
        Intrinsics.j(frameCallback, "frameCallback");
        this.isClient = z10;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.controlFrameBuffer = new C14416e();
        this.messageFrameBuffer = new C14416e();
        this.maskKey = z10 ? null : new byte[4];
        this.maskCursor = z10 ? null : new C14416e.a();
    }

    private final void b() throws IOException {
        short s10;
        String strN3;
        long j10 = this.frameLength;
        if (j10 > 0) {
            this.source.Z1(this.controlFrameBuffer, j10);
            if (!this.isClient) {
                C14416e c14416e = this.controlFrameBuffer;
                C14416e.a aVar = this.maskCursor;
                Intrinsics.g(aVar);
                c14416e.A(aVar);
                this.maskCursor.d(0L);
                j jVar = j.f128943a;
                C14416e.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.g(bArr);
                jVar.b(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.getSize();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.controlFrameBuffer.readShort();
                    strN3 = this.controlFrameBuffer.n3();
                    String strA = j.f128943a.a(s10);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s10 = 1005;
                    strN3 = "";
                }
                this.frameCallback.h(s10, strN3);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.g(this.controlFrameBuffer.P2());
                return;
            case 10:
                this.frameCallback.c(this.controlFrameBuffer.P2());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Nv.k.t(this.opcode));
        }
    }

    private final void c() throws IOException {
        boolean z10;
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().b();
        try {
            int iB = Nv.h.b(this.source.readByte(), l3.f93323c);
            this.source.getTimeout().g(timeoutNanos, TimeUnit.NANOSECONDS);
            int i10 = iB & 15;
            this.opcode = i10;
            boolean z11 = (iB & 128) != 0;
            this.isFinalFrame = z11;
            boolean z12 = (iB & 8) != 0;
            this.isControlFrame = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iB & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.readingCompressedMessage = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iB & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iB & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iB2 = Nv.h.b(this.source.readByte(), l3.f93323c);
            boolean z14 = (iB2 & 128) != 0;
            if (z14 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iB2 & l3.f93324d;
            this.frameLength = j10;
            if (j10 == 126) {
                this.frameLength = Nv.h.c(this.source.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.source.readLong();
                this.frameLength = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + Nv.k.u(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                InterfaceC14418g interfaceC14418g = this.source;
                byte[] bArr = this.maskKey;
                Intrinsics.g(bArr);
                interfaceC14418g.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.source.getTimeout().g(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    private final void d() throws IOException {
        while (!this.closed) {
            long j10 = this.frameLength;
            if (j10 > 0) {
                this.source.Z1(this.messageFrameBuffer, j10);
                if (!this.isClient) {
                    C14416e c14416e = this.messageFrameBuffer;
                    C14416e.a aVar = this.maskCursor;
                    Intrinsics.g(aVar);
                    c14416e.A(aVar);
                    this.maskCursor.d(this.messageFrameBuffer.getSize() - this.frameLength);
                    j jVar = j.f128943a;
                    C14416e.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.g(bArr);
                    jVar.b(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            h();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Nv.k.t(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void g() throws DataFormatException, IOException {
        int i10 = this.opcode;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + Nv.k.t(i10));
        }
        d();
        if (this.readingCompressedMessage) {
            c cVar = this.messageInflater;
            if (cVar == null) {
                cVar = new c(this.noContextTakeover);
                this.messageInflater = cVar;
            }
            cVar.a(this.messageFrameBuffer);
        }
        if (i10 == 1) {
            this.frameCallback.e(this.messageFrameBuffer.n3());
        } else {
            this.frameCallback.d(this.messageFrameBuffer.P2());
        }
    }

    private final void h() throws IOException {
        while (!this.closed) {
            c();
            if (!this.isControlFrame) {
                return;
            } else {
                b();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.messageInflater;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void a() throws DataFormatException, IOException {
        c();
        if (this.isControlFrame) {
            b();
        } else {
            g();
        }
    }
}
