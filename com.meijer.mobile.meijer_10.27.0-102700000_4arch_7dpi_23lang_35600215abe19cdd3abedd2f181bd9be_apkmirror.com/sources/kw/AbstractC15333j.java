package kw;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H$¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0013H$¢\u0006\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010-\u001a\u00060'j\u0002`(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lkw/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lkw/e;", "sink", "byteCount", "l", "(JLkw/e;J)J", "size", "()J", "Lkw/J;", "m", "(J)Lkw/J;", "", "close", "()V", "", "array", "", "arrayOffset", "i", "(J[BII)I", "j", "h", "a", "Z", "getReadWrite", "()Z", "b", "closed", "c", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "g", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC15333j implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean readWrite;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int openStreamCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = N.b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lkw/j$a;", "Lkw/J;", "Lkw/j;", "fileHandle", "", "position", "<init>", "(Lkw/j;J)V", "Lkw/e;", "sink", "byteCount", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "", "close", "()V", "a", "Lkw/j;", "getFileHandle", "()Lkw/j;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.j$a */
    private static final class a implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC15333j fileHandle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long position;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a(AbstractC15333j fileHandle, long j10) {
            Intrinsics.j(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j10;
        }

        @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                AbstractC15333j abstractC15333j = this.fileHandle;
                abstractC15333j.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.f142422a;
                    lock.unlock();
                    this.fileHandle.h();
                }
            } finally {
                lock.unlock();
            }
        }

        @Override // kw.J
        public long read(C15328e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long jL = this.fileHandle.l(this.position, sink, byteCount);
            if (jL != -1) {
                this.position += jL;
            }
            return jL;
        }

        @Override // kw.J
        public K timeout() {
            return K.f148056e;
        }
    }

    protected abstract void h() throws IOException;

    protected abstract int i(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException;

    protected abstract long j() throws IOException;

    /* JADX INFO: Access modifiers changed from: private */
    public final long l(long fileOffset, C15328e sink, long byteCount) throws IOException {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j10 = byteCount + fileOffset;
        long j11 = fileOffset;
        while (true) {
            if (j11 >= j10) {
                break;
            }
            F fZ = sink.Z(1);
            int i10 = i(j11, fZ.data, fZ.limit, (int) Math.min(j10 - j11, 8192 - r7));
            if (i10 == -1) {
                if (fZ.pos == fZ.limit) {
                    sink.head = fZ.b();
                    G.b(fZ);
                }
                if (fileOffset == j11) {
                    return -1L;
                }
            } else {
                fZ.limit += i10;
                long j12 = i10;
                j11 += j12;
                sink.K(sink.getSize() + j12);
            }
        }
        return j11 - fileOffset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
            h();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final J m(long fileOffset) throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
            return j();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public AbstractC15333j(boolean z10) {
        this.readWrite = z10;
    }
}
