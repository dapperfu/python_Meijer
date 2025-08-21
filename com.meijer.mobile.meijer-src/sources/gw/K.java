package gw;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lgw/K;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "Lgw/L;", "timeout", "()Lgw/L;", "", "close", "()V", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface K extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(C14416e sink, long byteCount) throws IOException;

    /* renamed from: timeout */
    L getF134544a();
}
