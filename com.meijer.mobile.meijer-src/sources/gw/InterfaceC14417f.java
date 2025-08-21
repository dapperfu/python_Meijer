package gw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0000H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0000H&¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0001\u000237ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Lgw/f;", "Lgw/J;", "Ljava/nio/channels/WritableByteChannel;", "Lgw/h;", "byteString", "g1", "(Lgw/h;)Lgw/f;", "", "source", "write", "([B)Lgw/f;", "", "offset", "byteCount", "([BII)Lgw/f;", "Lgw/K;", "", "t2", "(Lgw/K;)J", "", "string", "G0", "(Ljava/lang/String;)Lgw/f;", "beginIndex", "endIndex", "N0", "(Ljava/lang/String;II)Lgw/f;", "codePoint", "Z", "(I)Lgw/f;", "b", "writeByte", "s", "writeShort", "i", "writeInt", "h2", "v", "f0", "(J)Lgw/f;", "G1", "M2", "", "flush", "()V", "X", "()Lgw/f;", "t0", "Ljava/io/OutputStream;", "Q3", "()Ljava/io/OutputStream;", "Lgw/e;", "e", "()Lgw/e;", "buffer", "Lgw/E;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: gw.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC14417f extends J, WritableByteChannel {
    InterfaceC14417f G0(String string) throws IOException;

    InterfaceC14417f G1(long v10) throws IOException;

    InterfaceC14417f M2(long v10) throws IOException;

    InterfaceC14417f N0(String string, int beginIndex, int endIndex) throws IOException;

    OutputStream Q3();

    InterfaceC14417f X() throws IOException;

    InterfaceC14417f Z(int codePoint) throws IOException;

    C14416e e();

    InterfaceC14417f f0(long v10) throws IOException;

    @Override // gw.J, java.io.Flushable
    void flush() throws IOException;

    InterfaceC14417f g1(C14419h byteString) throws IOException;

    InterfaceC14417f h2(int i10) throws IOException;

    InterfaceC14417f t0() throws IOException;

    long t2(K source) throws IOException;

    InterfaceC14417f write(byte[] source) throws IOException;

    InterfaceC14417f write(byte[] source, int offset, int byteCount) throws IOException;

    InterfaceC14417f writeByte(int b10) throws IOException;

    InterfaceC14417f writeInt(int i10) throws IOException;

    InterfaceC14417f writeShort(int s10) throws IOException;
}
