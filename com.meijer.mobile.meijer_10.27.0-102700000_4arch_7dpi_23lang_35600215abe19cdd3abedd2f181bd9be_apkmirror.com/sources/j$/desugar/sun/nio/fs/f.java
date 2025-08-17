package j$.desugar.sun.nio.fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes3.dex */
public final class f extends FileLock {

    /* renamed from: a, reason: collision with root package name */
    public final FileLock f138567a;

    public f(FileLock fileLock, e eVar) {
        super(eVar, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.f138567a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.f138567a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.f138567a.release();
    }
}
