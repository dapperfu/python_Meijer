package e5;

import gw.AbstractC14425n;
import gw.C14416e;
import gw.J;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Le5/d;", "Lgw/n;", "Lgw/J;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "", "onException", "<init>", "(Lgw/J;Lkotlin/jvm/functions/Function1;)V", "Lgw/e;", "source", "", "byteCount", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "b", "Lkotlin/jvm/functions/Function1;", "", "c", "Z", "hasErrors", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC14425n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<IOException, Unit> onException;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasErrors;

    @Override // gw.AbstractC14425n, gw.J
    public void E1(C14416e source, long byteCount) throws EOFException {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.E1(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(J j10, Function1<? super IOException, Unit> function1) {
        super(j10);
        this.onException = function1;
    }

    @Override // gw.AbstractC14425n, gw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // gw.AbstractC14425n, gw.J, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
