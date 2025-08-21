package gw;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lgw/J;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "Lgw/L;", "timeout", "()Lgw/L;", "close", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface J extends Closeable, Flushable {
    void E1(C14416e source, long byteCount) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    L timeout();
}
