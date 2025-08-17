package kw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020*H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H&¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000205H&¢\u0006\u0004\b:\u00107J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\tH&¢\u0006\u0004\b<\u00109J\u000f\u0010=\u001a\u00020\u0017H&¢\u0006\u0004\b=\u0010\u0019J\u0017\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020>H&¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020!H&¢\u0006\u0004\bF\u0010DJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0000H&¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH&¢\u0006\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0005\u0082\u0001\u0002\u0003Qø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0001"}, d2 = {"Lkw/g;", "Lkw/J;", "Ljava/nio/channels/ReadableByteChannel;", "Lkw/e;", "P", "()Lkw/e;", "", "j2", "()Z", "", "byteCount", "", "B1", "(J)V", "t", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "n1", "", "readInt", "()I", "f3", "readLong", "()J", "s1", "r2", "R3", "skip", "Lkw/h;", "Q2", "()Lkw/h;", "O1", "(J)Lkw/h;", "Lkw/z;", "options", "U2", "(Lkw/z;)I", "", "e2", "()[B", "sink", "readFully", "([B)V", "z3", "(Lkw/e;J)V", "Lkw/I;", "Z1", "(Lkw/I;)J", "", "n3", "()Ljava/lang/String;", "K1", "(J)Ljava/lang/String;", "h1", "limit", "y0", "L2", "Ljava/nio/charset/Charset;", "charset", "H2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "x0", "(Lkw/h;)J", "targetBytes", "e3", "offset", "Y", "(JLkw/h;)Z", "peek", "()Lkw/g;", "Ljava/io/InputStream;", "T3", "()Ljava/io/InputStream;", "e", "buffer", "Lkw/E;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kw.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC15330g extends J, ReadableByteChannel {
    void B1(long byteCount) throws IOException;

    String H2(Charset charset) throws IOException;

    String K1(long byteCount) throws IOException;

    int L2() throws IOException;

    C15331h O1(long byteCount) throws IOException;

    @Deprecated
    C15328e P();

    C15331h Q2() throws IOException;

    long R3() throws IOException;

    InputStream T3();

    int U2(z options) throws IOException;

    boolean Y(long offset, C15331h bytes) throws IOException;

    long Z1(I sink) throws IOException;

    C15328e e();

    byte[] e2() throws IOException;

    long e3(C15331h targetBytes) throws IOException;

    int f3() throws IOException;

    String h1() throws IOException;

    boolean j2() throws IOException;

    short n1() throws IOException;

    String n3() throws IOException;

    InterfaceC15330g peek();

    long r2() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] sink) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    long s1() throws IOException;

    void skip(long byteCount) throws IOException;

    boolean t(long byteCount) throws IOException;

    long x0(C15331h bytes) throws IOException;

    String y0(long limit) throws IOException;

    void z3(C15328e sink, long byteCount) throws IOException;
}
