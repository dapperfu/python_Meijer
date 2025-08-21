package Uv;

import Uv.d;
import com.google.android.gms.common.api.a;
import gw.C14416e;
import gw.InterfaceC14417f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010\u0015J%\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b1\u00102J%\u00106\u001a\u00020\r2\u0006\u00103\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000b¢\u0006\u0004\b9\u0010\u000fJ-\u0010<\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010\u0011J+\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010E\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010DR\u0016\u0010G\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010FR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010CR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"LUv/v;", "Ljava/io/Closeable;", "", "Lgw/f;", "sink", "", "client", "<init>", "(Lgw/f;Z)V", "", "streamId", "", "byteCount", "", "z", "(IJ)V", "b", "()V", "LUv/y;", "peerSettings", "a", "(LUv/y;)V", "promisedStreamId", "", "LUv/c;", "requestHeaders", "m", "(IILjava/util/List;)V", "flush", "LUv/a;", "errorCode", "p", "(ILUv/a;)V", "j", "()I", "outFinished", "Lgw/e;", "source", "c", "(ZILgw/e;I)V", "flags", "buffer", "d", "(IILgw/e;I)V", "settings", "u", "ack", "payload1", "payload2", "l", "(ZII)V", "lastGoodStreamId", "", "debugData", "h", "(ILUv/a;[B)V", "windowSizeIncrement", "w", "length", "type", "g", "(IIII)V", "close", "headerBlock", "i", "(ZILjava/util/List;)V", "Lgw/f;", "Z", "Lgw/e;", "hpackBuffer", "I", "maxFrameSize", "e", "closed", "LUv/d$b;", "f", "LUv/d$b;", "getHpackWriter", "()LUv/d$b;", "hpackWriter", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class v implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f39219h = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14417f sink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14416e hpackBuffer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d.b hpackWriter;

    public final void b() throws IOException {
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    Logger logger = f39219h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Nv.k.j(">> CONNECTION " + e.CONNECTION_PREFACE.E(), new Object[0]));
                    }
                    this.sink.g1(e.CONNECTION_PREFACE);
                    this.sink.flush();
                    Unit unit = Unit.f143329a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean outFinished, int streamId, C14416e source, int byteCount) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            d(streamId, outFinished ? 1 : 0, source, byteCount);
            Unit unit = Unit.f143329a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            Unit unit = Unit.f143329a;
        }
    }

    public final void d(int streamId, int flags, C14416e buffer, int byteCount) throws IOException {
        g(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            InterfaceC14417f interfaceC14417f = this.sink;
            Intrinsics.g(buffer);
            interfaceC14417f.E1(buffer, byteCount);
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
            Unit unit = Unit.f143329a;
        }
    }

    public final void l(boolean ack, int payload1, int payload2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            g(0, 8, 6, ack ? 1 : 0);
            this.sink.writeInt(payload1);
            this.sink.writeInt(payload2);
            this.sink.flush();
            Unit unit = Unit.f143329a;
        }
    }

    public final void w(int streamId, long windowSizeIncrement) throws IOException {
        int i10;
        long j10;
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
                }
                Logger logger = f39219h;
                if (logger.isLoggable(Level.FINE)) {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                    logger.fine(e.f39087a.d(false, i10, 4, j10));
                } else {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                }
                g(i10, 4, 8, 0);
                this.sink.writeInt((int) j10);
                this.sink.flush();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v(InterfaceC14417f sink, boolean z10) {
        Intrinsics.j(sink, "sink");
        this.sink = sink;
        this.client = z10;
        C14416e c14416e = new C14416e();
        this.hpackBuffer = c14416e;
        this.maxFrameSize = 16384;
        this.hpackWriter = new d.b(0, false, c14416e, 3, null);
    }

    private final void z(int streamId, long byteCount) throws IOException {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            g(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.E1(this.hpackBuffer, jMin);
        }
    }

    public final void a(y peerSettings) throws IOException {
        Intrinsics.j(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.maxFrameSize = peerSettings.e(this.maxFrameSize);
                if (peerSettings.b() != -1) {
                    this.hpackWriter.e(peerSettings.b());
                }
                g(0, 0, 4, 1);
                this.sink.flush();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = Uv.v.f39219h
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            Uv.e r2 = Uv.e.f39087a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.c(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.maxFrameSize
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            gw.f r9 = r8.sink
            Nv.h.H(r9, r5)
            gw.f r9 = r8.sink
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            gw.f r9 = r8.sink
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            gw.f r9 = r8.sink
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "reserved bit set: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.append(r10)
            int r10 = r8.maxFrameSize
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Uv.v.g(int, int, int, int):void");
    }

    public final void h(int lastGoodStreamId, a errorCode, byte[] debugData) throws IOException {
        Intrinsics.j(errorCode, "errorCode");
        Intrinsics.j(debugData, "debugData");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.getHttpCode() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                g(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(lastGoodStreamId);
                this.sink.writeInt(errorCode.getHttpCode());
                if (!(debugData.length == 0)) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(boolean outFinished, int streamId, List<c> headerBlock) throws IOException {
        Intrinsics.j(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.g(headerBlock);
                long size = this.hpackBuffer.getSize();
                long jMin = Math.min(this.maxFrameSize, size);
                int i10 = size == jMin ? 4 : 0;
                if (outFinished) {
                    i10 |= 1;
                }
                g(streamId, (int) jMin, 1, i10);
                this.sink.E1(this.hpackBuffer, jMin);
                if (size > jMin) {
                    z(streamId, size - jMin);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void m(int streamId, int promisedStreamId, List<c> requestHeaders) throws IOException {
        Intrinsics.j(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.g(requestHeaders);
                long size = this.hpackBuffer.getSize();
                int iMin = (int) Math.min(this.maxFrameSize - 4, size);
                long j10 = iMin;
                g(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
                this.sink.writeInt(promisedStreamId & a.e.API_PRIORITY_OTHER);
                this.sink.E1(this.hpackBuffer, j10);
                if (size > j10) {
                    z(streamId, size - j10);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p(int streamId, a errorCode) throws IOException {
        Intrinsics.j(errorCode, "errorCode");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(streamId, 4, 3, 0);
            this.sink.writeInt(errorCode.getHttpCode());
            this.sink.flush();
            Unit unit = Unit.f143329a;
        }
    }

    public final void u(y settings) throws IOException {
        Intrinsics.j(settings, "settings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                g(0, settings.i() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.f(i10)) {
                        this.sink.writeShort(i10);
                        this.sink.writeInt(settings.a(i10));
                    }
                }
                this.sink.flush();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
