package kw;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0007R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0002\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkw/q;", "Lkw/J;", "source", "<init>", "(Lkw/J;)V", "", "b", "()V", "c", "Lkw/e;", "buffer", "", "offset", "byteCount", "d", "(Lkw/e;JJ)V", "", "name", "", "expected", "actual", "a", "(Ljava/lang/String;II)V", "sink", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "close", "", "B", "section", "Lkw/E;", "Lkw/E;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "Lkw/r;", "Lkw/r;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class q implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private byte section;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final buffer source;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r inflaterSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public q(J source) {
        Intrinsics.j(source, "source");
        buffer bufferVar = new buffer(source);
        this.source = bufferVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new r((InterfaceC15330g) bufferVar, inflater);
        this.crc = new CRC32();
    }

    private final void a(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        throw new IOException(name + ": actual 0x" + StringsKt.B0(C15325b.l(actual), 8, '0') + " != expected 0x" + StringsKt.B0(C15325b.l(expected), 8, '0'));
    }

    private final void b() throws IOException {
        this.source.B1(10L);
        byte bL = this.source.bufferField.l(3L);
        boolean z10 = ((bL >> 1) & 1) == 1;
        if (z10) {
            d(this.source.bufferField, 0L, 10L);
        }
        a("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bL >> 2) & 1) == 1) {
            this.source.B1(2L);
            if (z10) {
                d(this.source.bufferField, 0L, 2L);
            }
            long jN1 = this.source.bufferField.n1() & 65535;
            this.source.B1(jN1);
            if (z10) {
                d(this.source.bufferField, 0L, jN1);
            }
            this.source.skip(jN1);
        }
        if (((bL >> 3) & 1) == 1) {
            long jA = this.source.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.source.bufferField, 0L, jA + 1);
            }
            this.source.skip(jA + 1);
        }
        if (((bL >> 4) & 1) == 1) {
            long jA2 = this.source.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.source.bufferField, 0L, jA2 + 1);
            }
            this.source.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.source.n1(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void c() throws IOException {
        a("CRC", this.source.f3(), (int) this.crc.getValue());
        a("ISIZE", this.source.f3(), (int) this.inflater.getBytesWritten());
    }

    private final void d(C15328e buffer, long offset, long byteCount) {
        F f10 = buffer.head;
        Intrinsics.g(f10);
        while (true) {
            int i10 = f10.limit;
            int i11 = f10.pos;
            if (offset < i10 - i11) {
                break;
            }
            offset -= i10 - i11;
            f10 = f10.next;
            Intrinsics.g(f10);
        }
        while (byteCount > 0) {
            int iMin = (int) Math.min(f10.limit - r6, byteCount);
            this.crc.update(f10.data, (int) (f10.pos + offset), iMin);
            byteCount -= iMin;
            f10 = f10.next;
            Intrinsics.g(f10);
            offset = 0;
        }
    }

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // kw.J
    public long read(C15328e sink, long byteCount) throws DataFormatException, IOException {
        q qVar;
        Intrinsics.j(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            b();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long j10 = this.inflaterSource.read(sink, byteCount);
            if (j10 != -1) {
                d(sink, size, j10);
                return j10;
            }
            qVar = this;
            qVar.section = (byte) 2;
        } else {
            qVar = this;
        }
        if (qVar.section == 2) {
            c();
            qVar.section = (byte) 3;
            if (!qVar.source.j2()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getTimeout() {
        return this.source.getTimeout();
    }
}
