package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchService f139203a;

    public /* synthetic */ M(WatchService watchService) {
        this.f139203a = watchService;
    }

    public static /* synthetic */ M a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new M(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f139203a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.f139203a;
        if (obj instanceof M) {
            obj = ((M) obj).f139203a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139203a.hashCode();
    }
}
