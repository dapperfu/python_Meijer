package c5;

import c5.q;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.AbstractC15335l;
import kw.B;
import kw.InterfaceC15330g;
import kw.w;
import q5.C16458j;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010'¨\u0006)"}, d2 = {"Lc5/p;", "Lc5/q;", "Lkw/B;", "file", "Lkw/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Lc5/q$a;", "metadata", "<init>", "(Lkw/B;Lkw/l;Ljava/lang/String;Ljava/io/Closeable;Lc5/q$a;)V", "", "c", "()V", "Lkw/g;", "b", "()Lkw/g;", "close", "a", "Lkw/B;", "getFile$coil_base_release", "()Lkw/B;", "Lkw/l;", "g", "()Lkw/l;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/io/Closeable;", "e", "Lc5/q$a;", "()Lc5/q$a;", "", "f", "Z", "isClosed", "Lkw/g;", "source", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15335l fileSystem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Closeable closeable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q.a metadata;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15330g source;

    public p(B b10, AbstractC15335l abstractC15335l, String str, Closeable closeable, q.a aVar) {
        super(null);
        this.file = b10;
        this.fileSystem = abstractC15335l;
        this.diskCacheKey = str;
        this.closeable = closeable;
        this.metadata = aVar;
    }

    @Override // c5.q
    public synchronized InterfaceC15330g b() {
        c();
        InterfaceC15330g interfaceC15330g = this.source;
        if (interfaceC15330g != null) {
            return interfaceC15330g;
        }
        InterfaceC15330g interfaceC15330gD = w.d(getFileSystem().D(this.file));
        this.source = interfaceC15330gD;
        return interfaceC15330gD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.isClosed = true;
            InterfaceC15330g interfaceC15330g = this.source;
            if (interfaceC15330g != null) {
                C16458j.d(interfaceC15330g);
            }
            Closeable closeable = this.closeable;
            if (closeable != null) {
                C16458j.d(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void c() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // c5.q
    /* renamed from: a, reason: from getter */
    public q.a getMetadata() {
        return this.metadata;
    }

    /* renamed from: d, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: g, reason: from getter */
    public AbstractC15335l getFileSystem() {
        return this.fileSystem;
    }
}
