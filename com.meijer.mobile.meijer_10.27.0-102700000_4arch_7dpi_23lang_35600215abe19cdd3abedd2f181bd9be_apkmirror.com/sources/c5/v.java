package c5;

import c5.q;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.AbstractC15335l;
import kw.B;
import kw.InterfaceC15330g;
import kw.w;
import q5.C16458j;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f¨\u0006!"}, d2 = {"Lc5/v;", "Lc5/q;", "Lkw/g;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "Lc5/q$a;", "metadata", "<init>", "(Lkw/g;Lkotlin/jvm/functions/Function0;Lc5/q$a;)V", "", "c", "()V", "b", "()Lkw/g;", "close", "a", "Lc5/q$a;", "()Lc5/q$a;", "", "Z", "isClosed", "Lkw/g;", "d", "Lkotlin/jvm/functions/Function0;", "Lkw/B;", "e", "Lkw/B;", "file", "Lkw/l;", "()Lkw/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q.a metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15330g source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends File> cacheDirectoryFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private B file;

    public v(InterfaceC15330g interfaceC15330g, Function0<? extends File> function0, q.a aVar) {
        super(null);
        this.metadata = aVar;
        this.source = interfaceC15330g;
        this.cacheDirectoryFactory = function0;
    }

    @Override // c5.q
    public synchronized InterfaceC15330g b() {
        c();
        InterfaceC15330g interfaceC15330g = this.source;
        if (interfaceC15330g != null) {
            return interfaceC15330g;
        }
        AbstractC15335l abstractC15335lD = d();
        B b10 = this.file;
        Intrinsics.g(b10);
        InterfaceC15330g interfaceC15330gD = w.d(abstractC15335lD.D(b10));
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
            B b10 = this.file;
            if (b10 != null) {
                d().j(b10);
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

    public AbstractC15335l d() {
        return AbstractC15335l.f148118b;
    }
}
