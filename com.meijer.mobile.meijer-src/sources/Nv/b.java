package Nv;

import gw.C14416e;
import gw.InterfaceC14418g;
import gw.K;
import gw.L;
import gw.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LNv/b;", "Lokhttp3/ResponseBody;", "Lgw/K;", "Lokhttp3/j;", "mediaType", "", "contentLength", "<init>", "(Lokhttp3/j;J)V", "contentType", "()Lokhttp3/j;", "()J", "Lgw/g;", "source", "()Lgw/g;", "Lgw/e;", "sink", "byteCount", "read", "(Lgw/e;J)J", "Lgw/L;", "timeout", "()Lgw/L;", "", "close", "()V", "a", "Lokhttp3/j;", "b", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends ResponseBody implements K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.j mediaType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable, gw.K
    public void close() {
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType, reason: from getter */
    public okhttp3.j getMediaType() {
        return this.mediaType;
    }

    @Override // gw.K
    public long read(C14416e sink, long byteCount) {
        Intrinsics.j(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // gw.K
    /* renamed from: timeout */
    public L getTimeout() {
        return L.f134518e;
    }

    public b(okhttp3.j jVar, long j10) {
        this.mediaType = jVar;
        this.contentLength = j10;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public InterfaceC14418g getSource() {
        return w.c(this);
    }
}
