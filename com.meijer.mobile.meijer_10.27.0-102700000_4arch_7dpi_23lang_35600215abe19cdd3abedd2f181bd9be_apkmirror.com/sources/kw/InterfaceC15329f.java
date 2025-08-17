package kw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH&¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010H&¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0000H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0000H&¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0001\u000237ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Lkw/f;", "Lkw/I;", "Ljava/nio/channels/WritableByteChannel;", "Lkw/h;", "byteString", "Z2", "(Lkw/h;)Lkw/f;", "", "source", "write", "([B)Lkw/f;", "", "offset", "byteCount", "([BII)Lkw/f;", "Lkw/J;", "", "G0", "(Lkw/J;)J", "", "string", "I0", "(Ljava/lang/String;)Lkw/f;", "beginIndex", "endIndex", "Q0", "(Ljava/lang/String;II)Lkw/f;", "codePoint", "a0", "(I)Lkw/f;", "b", "writeByte", "s", "writeShort", "i", "writeInt", "i2", "v", "f0", "(J)Lkw/f;", "E1", "N2", "", "flush", "()V", "X", "()Lkw/f;", "s0", "Ljava/io/OutputStream;", "Q3", "()Ljava/io/OutputStream;", "Lkw/e;", "e", "()Lkw/e;", "buffer", "Lkw/D;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kw.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC15329f extends I, WritableByteChannel {
    InterfaceC15329f E1(long v10) throws IOException;

    long G0(J source) throws IOException;

    InterfaceC15329f I0(String string) throws IOException;

    InterfaceC15329f N2(long v10) throws IOException;

    InterfaceC15329f Q0(String string, int beginIndex, int endIndex) throws IOException;

    OutputStream Q3();

    InterfaceC15329f X() throws IOException;

    InterfaceC15329f Z2(C15331h byteString) throws IOException;

    InterfaceC15329f a0(int codePoint) throws IOException;

    C15328e e();

    InterfaceC15329f f0(long v10) throws IOException;

    @Override // kw.I, java.io.Flushable
    void flush() throws IOException;

    InterfaceC15329f i2(int i10) throws IOException;

    InterfaceC15329f s0() throws IOException;

    InterfaceC15329f write(byte[] source) throws IOException;

    InterfaceC15329f write(byte[] source, int offset, int byteCount) throws IOException;

    InterfaceC15329f writeByte(int b10) throws IOException;

    InterfaceC15329f writeInt(int i10) throws IOException;

    InterfaceC15329f writeShort(int s10) throws IOException;
}
