package j$.nio.channels;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Channel {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsynchronousFileChannel f139183a;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f139183a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.f139183a;
        if (obj instanceof a) {
            obj = ((a) obj).f139183a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139183a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f139183a.isOpen();
    }

    public a(AsynchronousFileChannel asynchronousFileChannel) {
        this.f139183a = asynchronousFileChannel;
    }
}
