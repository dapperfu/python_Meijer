package j$.nio.channels;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Channel {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsynchronousFileChannel f138594a;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f138594a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.f138594a;
        if (obj instanceof a) {
            obj = ((a) obj).f138594a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138594a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f138594a.isOpen();
    }

    public a(AsynchronousFileChannel asynchronousFileChannel) {
        this.f138594a = asynchronousFileChannel;
    }
}
