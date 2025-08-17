package lw;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kw.C15326c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llw/m;", "Lkw/c;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "B", "()V", "o", "Ljava/net/Socket;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends C15326c {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    public m(Socket socket) {
        Intrinsics.j(socket, "socket");
        this.socket = socket;
    }

    @Override // kw.C15326c
    protected void B() throws IOException {
        try {
            this.socket.close();
        } catch (AssertionError e10) {
            if (!s.b(e10)) {
                throw e10;
            }
            s.f149499a.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e10);
        } catch (Exception e11) {
            s.f149499a.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e11);
        }
    }

    @Override // kw.C15326c
    protected IOException x(IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }
}
