package aw;

import gw.C14419h;
import gw.InterfaceC14418g;
import gw.K;
import gw.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Law/b;", "Lokhttp3/internal/publicsuffix/a;", "<init>", "()V", "", "f", "g", "Lgw/K;", "e", "()Lgw/K;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Lgw/h;", "d", "Lgw/h;", "a", "()Lgw/h;", "h", "(Lgw/h;)V", "bytes", "i", "exceptionBytes", "", "()Ljava/lang/Object;", "path", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b implements okhttp3.internal.publicsuffix.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C14419h bytes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C14419h exceptionBytes;

    private final void g() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    c.INSTANCE.e().k("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: d */
    public abstract Object getPath();

    public abstract K e();

    @Override // okhttp3.internal.publicsuffix.a
    public C14419h a() {
        C14419h c14419h = this.bytes;
        if (c14419h != null) {
            return c14419h;
        }
        Intrinsics.x("bytes");
        return null;
    }

    @Override // okhttp3.internal.publicsuffix.a
    public void b() throws InterruptedException {
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (this.bytes != null) {
            return;
        }
        throw new IllegalStateException(("Unable to load " + getPath() + " resource.").toString());
    }

    @Override // okhttp3.internal.publicsuffix.a
    public C14419h c() {
        C14419h c14419h = this.exceptionBytes;
        if (c14419h != null) {
            return c14419h;
        }
        Intrinsics.x("exceptionBytes");
        return null;
    }

    public void h(C14419h c14419h) {
        Intrinsics.j(c14419h, "<set-?>");
        this.bytes = c14419h;
    }

    public void i(C14419h c14419h) {
        Intrinsics.j(c14419h, "<set-?>");
        this.exceptionBytes = c14419h;
    }

    private final void f() throws IOException {
        try {
            InterfaceC14418g interfaceC14418gC = w.c(e());
            try {
                C14419h c14419hO1 = interfaceC14418gC.O1(interfaceC14418gC.readInt());
                C14419h c14419hO12 = interfaceC14418gC.O1(interfaceC14418gC.readInt());
                Unit unit = Unit.f143329a;
                CloseableKt.a(interfaceC14418gC, null);
                synchronized (this) {
                    Intrinsics.g(c14419hO1);
                    h(c14419hO1);
                    Intrinsics.g(c14419hO12);
                    i(c14419hO12);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }
}
