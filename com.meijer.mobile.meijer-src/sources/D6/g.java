package D6;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import z6.F;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0003\u001a\u00020\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0000H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H&¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"LD6/g;", "Ljava/io/Closeable;", "Lokio/Closeable;", "y", "()LD6/g;", "x", "s", "F", "", "name", "v1", "(Ljava/lang/String;)LD6/g;", "value", "e2", "C3", "", "C0", "(Z)LD6/g;", "", "c0", "(D)LD6/g;", "", "W", "(I)LD6/g;", "", "U", "(J)LD6/g;", "LD6/e;", "O0", "(LD6/e;)LD6/g;", "Lz6/F;", "i3", "(Lz6/F;)LD6/g;", "getPath", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g extends Closeable {
    g C0(boolean value) throws IOException;

    g C3() throws IOException;

    g F() throws IOException;

    g O0(e value) throws IOException;

    g U(long value) throws IOException;

    g W(int value) throws IOException;

    g c0(double value) throws IOException;

    g e2(String value) throws IOException;

    String getPath();

    g i3(F value) throws IOException;

    g s() throws IOException;

    g v1(String name) throws IOException;

    g x() throws IOException;

    g y() throws IOException;
}
