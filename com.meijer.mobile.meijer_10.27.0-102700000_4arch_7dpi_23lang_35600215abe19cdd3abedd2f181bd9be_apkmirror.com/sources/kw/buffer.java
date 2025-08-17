package kw;

import com.google.android.gms.common.api.a;
import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\f\u001a\u00020 2\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b\f\u0010)J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020/2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u00020/2\u0006\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00103J\u000f\u0010;\u001a\u00020 H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010<J\u000f\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010<J\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\u0013J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010I\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010NJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bW\u0010QJ\u001f\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010SJ\u001f\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010[J/\u0010]\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0010J\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020/H\u0016¢\u0006\u0004\bj\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010kR\u0014\u0010m\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010lR\u0016\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u001b\u0010r\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010\b¨\u0006s"}, d2 = {"Lkw/E;", "Lkw/g;", "Lkw/J;", "source", "<init>", "(Lkw/J;)V", "Lkw/e;", "P", "()Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "", "j2", "()Z", "", "B1", "(J)V", "t", "(J)Z", "", "readByte", "()B", "Lkw/h;", "Q2", "()Lkw/h;", "O1", "(J)Lkw/h;", "Lkw/z;", "options", "", "U2", "(Lkw/z;)I", "", "e2", "()[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "z3", "(Lkw/e;J)V", "Lkw/I;", "Z1", "(Lkw/I;)J", "", "n3", "()Ljava/lang/String;", "K1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "H2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "h1", "limit", "y0", "L2", "()I", "", "readShort", "()S", "n1", "readInt", "f3", "readLong", "()J", "s1", "r2", "R3", "skip", "b", "a", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "x0", "(Lkw/h;)J", "c", "(Lkw/h;J)J", "d", "(Lkw/h;JJ)J", "targetBytes", "e3", "g", "offset", "Y", "(JLkw/h;)Z", "bytesOffset", "h", "(JLkw/h;II)Z", "peek", "()Lkw/g;", "Ljava/io/InputStream;", "T3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lkw/K;", "timeout", "()Lkw/K;", "toString", "Lkw/J;", "Lkw/e;", "bufferField", "Z", "closed", "e", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.E, reason: from toString */
/* loaded from: classes13.dex */
public final class buffer implements InterfaceC15330g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final J source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C15328e bufferField;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public boolean closed;

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"kw/E$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.E$a */
    public static final class a extends InputStream implements InputStreamRetargetInterface {
        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.read(bufferVar2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & 255;
        }

        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            buffer.this.close();
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public long transferTo(OutputStream out) throws IOException {
            Intrinsics.j(out, "out");
            if (buffer.this.closed) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                        return size;
                    }
                }
                size += buffer.this.bufferField.getSize();
                C15328e.R0(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            Intrinsics.j(data, "data");
            if (!buffer.this.closed) {
                C15325b.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }

    @Override // kw.J
    public long read(C15328e sink, long byteCount) {
        Intrinsics.j(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    public buffer(J source) {
        Intrinsics.j(source, "source");
        this.source = source;
        this.bufferField = new C15328e();
    }

    @Override // kw.InterfaceC15330g
    public String H2(Charset charset) throws IOException {
        Intrinsics.j(charset, "charset");
        this.bufferField.G0(this.source);
        return this.bufferField.H2(charset);
    }

    @Override // kw.InterfaceC15330g
    public int L2() throws EOFException {
        B1(1L);
        byte bL = this.bufferField.l(0L);
        if ((bL & 224) == 192) {
            B1(2L);
        } else if ((bL & 240) == 224) {
            B1(3L);
        } else if ((bL & 248) == 240) {
            B1(4L);
        }
        return this.bufferField.L2();
    }

    @Override // kw.InterfaceC15330g
    /* renamed from: P, reason: from getter */
    public C15328e getBufferField() {
        return this.bufferField;
    }

    @Override // kw.InterfaceC15330g
    public C15331h Q2() throws IOException {
        this.bufferField.G0(this.source);
        return this.bufferField.Q2();
    }

    @Override // kw.InterfaceC15330g
    public long R3() throws EOFException {
        byte bL;
        B1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!t(i11)) {
                break;
            }
            bL = this.bufferField.l(i10);
            if ((bL < 48 || bL > 57) && ((bL < 97 || bL > 102) && (bL < 65 || bL > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bL, CharsKt.a(16));
            Intrinsics.i(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.bufferField.R3();
    }

    @Override // kw.InterfaceC15330g
    public InputStream T3() {
        return new a();
    }

    @Override // kw.InterfaceC15330g
    public int U2(z options) throws EOFException {
        Intrinsics.j(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int i10 = lw.a.i(this.bufferField, options, true);
            if (i10 != -2) {
                if (i10 == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[i10].V());
                return i10;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // kw.InterfaceC15330g
    public boolean Y(long offset, C15331h bytes) {
        Intrinsics.j(bytes, "bytes");
        return h(offset, bytes, 0, bytes.V());
    }

    @Override // kw.InterfaceC15330g
    public long Z1(I sink) throws IOException {
        Intrinsics.j(sink, "sink");
        long j10 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jC = this.bufferField.c();
            if (jC > 0) {
                j10 += jC;
                sink.M1(this.bufferField, jC);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.getSize();
        C15328e c15328e = this.bufferField;
        sink.M1(c15328e, c15328e.getSize());
        return size;
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b11 = b10;
            long j10 = toIndex;
            long jM = this.bufferField.m(b11, jMax, j10);
            if (jM != -1) {
                return jM;
            }
            long size = this.bufferField.getSize();
            if (size >= j10 || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            toIndex = j10;
        }
        return -1L;
    }

    public long c(C15331h bytes, long fromIndex) {
        Intrinsics.j(bytes, "bytes");
        return d(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.a();
    }

    public long d(C15331h bytes, long fromIndex, long toIndex) {
        Intrinsics.j(bytes, "bytes");
        return lw.f.b(this, bytes, 0, 0, fromIndex, toIndex, 6, null);
    }

    @Override // kw.InterfaceC15330g
    public C15328e e() {
        return this.bufferField;
    }

    @Override // kw.InterfaceC15330g
    public byte[] e2() throws IOException {
        this.bufferField.G0(this.source);
        return this.bufferField.e2();
    }

    @Override // kw.InterfaceC15330g
    public long e3(C15331h targetBytes) {
        Intrinsics.j(targetBytes, "targetBytes");
        return g(targetBytes, 0L);
    }

    @Override // kw.InterfaceC15330g
    public int f3() throws EOFException {
        B1(4L);
        return this.bufferField.f3();
    }

    public long g(C15331h targetBytes, long fromIndex) {
        Intrinsics.j(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jW = this.bufferField.w(targetBytes, fromIndex);
            if (jW != -1) {
                return jW;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    public boolean h(long offset, C15331h bytes, int bytesOffset, int byteCount) {
        Intrinsics.j(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return byteCount >= 0 && offset >= 0 && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.V() && (byteCount == 0 || lw.f.a(this, bytes, bytesOffset, byteCount, offset, offset + 1) != -1);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // kw.InterfaceC15330g
    public boolean j2() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.j2() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // kw.InterfaceC15330g
    public short n1() throws EOFException {
        B1(2L);
        return this.bufferField.n1();
    }

    @Override // kw.InterfaceC15330g
    public String n3() throws IOException {
        this.bufferField.G0(this.source);
        return this.bufferField.n3();
    }

    @Override // kw.InterfaceC15330g
    public InterfaceC15330g peek() {
        return w.d(new C(this));
    }

    @Override // kw.InterfaceC15330g
    public long r2() throws EOFException {
        byte bL;
        B1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!t(j11)) {
                break;
            }
            bL = this.bufferField.l(j10);
            if ((bL < 48 || bL > 57) && !(j10 == 0 && bL == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bL, CharsKt.a(16));
            Intrinsics.i(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.bufferField.r2();
    }

    @Override // kw.InterfaceC15330g
    public byte readByte() throws EOFException {
        B1(1L);
        return this.bufferField.readByte();
    }

    @Override // kw.InterfaceC15330g
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.j(sink, "sink");
        try {
            B1(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.bufferField.getSize() > 0) {
                C15328e c15328e = this.bufferField;
                int i11 = c15328e.read(sink, i10, (int) c15328e.getSize());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // kw.InterfaceC15330g
    public int readInt() throws EOFException {
        B1(4L);
        return this.bufferField.readInt();
    }

    @Override // kw.InterfaceC15330g
    public long readLong() throws EOFException {
        B1(8L);
        return this.bufferField.readLong();
    }

    @Override // kw.InterfaceC15330g
    public short readShort() throws EOFException {
        B1(2L);
        return this.bufferField.readShort();
    }

    @Override // kw.InterfaceC15330g
    public long s1() throws EOFException {
        B1(8L);
        return this.bufferField.s1();
    }

    @Override // kw.InterfaceC15330g
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // kw.InterfaceC15330g
    public boolean t(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getTimeout() {
        return this.source.getTimeout();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // kw.InterfaceC15330g
    public long x0(C15331h bytes) {
        Intrinsics.j(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // kw.InterfaceC15330g
    public String y0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jB = b((byte) 10, 0L, j10);
        if (jB != -1) {
            return lw.a.h(this.bufferField, jB);
        }
        if (j10 < Long.MAX_VALUE && t(j10) && this.bufferField.l(j10 - 1) == 13 && t(j10 + 1) && this.bufferField.l(j10) == 10) {
            return lw.a.h(this.bufferField, j10);
        }
        C15328e c15328e = new C15328e();
        C15328e c15328e2 = this.bufferField;
        c15328e2.g(c15328e, 0L, Math.min(32, c15328e2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + c15328e.Q2().E() + (char) 8230);
    }

    @Override // kw.InterfaceC15330g
    public void z3(C15328e sink, long byteCount) throws IOException {
        Intrinsics.j(sink, "sink");
        try {
            B1(byteCount);
            this.bufferField.z3(sink, byteCount);
        } catch (EOFException e10) {
            sink.G0(this.bufferField);
            throw e10;
        }
    }

    @Override // kw.InterfaceC15330g
    public void B1(long byteCount) throws EOFException {
        if (t(byteCount)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // kw.InterfaceC15330g
    public String K1(long byteCount) throws EOFException {
        B1(byteCount);
        return this.bufferField.K1(byteCount);
    }

    @Override // kw.InterfaceC15330g
    public C15331h O1(long byteCount) throws EOFException {
        B1(byteCount);
        return this.bufferField.O1(byteCount);
    }

    @Override // kw.InterfaceC15330g
    public String h1() {
        return y0(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.j(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
