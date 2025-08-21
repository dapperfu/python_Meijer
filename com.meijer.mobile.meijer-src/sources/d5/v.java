package d5;

import d5.q;
import gw.AbstractC14423l;
import gw.B;
import gw.InterfaceC14418g;
import gw.w;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r5.C16846j;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f¨\u0006!"}, d2 = {"Ld5/v;", "Ld5/q;", "Lgw/g;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "Ld5/q$a;", "metadata", "<init>", "(Lgw/g;Lkotlin/jvm/functions/Function0;Ld5/q$a;)V", "", "c", "()V", "b", "()Lgw/g;", "close", "a", "Ld5/q$a;", "()Ld5/q$a;", "", "Z", "isClosed", "Lgw/g;", "d", "Lkotlin/jvm/functions/Function0;", "Lgw/B;", "e", "Lgw/B;", "file", "Lgw/l;", "()Lgw/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q.a metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14418g source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends File> cacheDirectoryFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private B file;

    public v(InterfaceC14418g interfaceC14418g, Function0<? extends File> function0, q.a aVar) {
        super(null);
        this.metadata = aVar;
        this.source = interfaceC14418g;
        this.cacheDirectoryFactory = function0;
    }

    @Override // d5.q
    public synchronized InterfaceC14418g b() {
        c();
        InterfaceC14418g interfaceC14418g = this.source;
        if (interfaceC14418g != null) {
            return interfaceC14418g;
        }
        AbstractC14423l abstractC14423lD = d();
        B b10 = this.file;
        Intrinsics.g(b10);
        InterfaceC14418g interfaceC14418gC = w.c(abstractC14423lD.D(b10));
        this.source = interfaceC14418gC;
        return interfaceC14418gC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.isClosed = true;
            InterfaceC14418g interfaceC14418g = this.source;
            if (interfaceC14418g != null) {
                C16846j.d(interfaceC14418g);
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

    @Override // d5.q
    /* renamed from: a, reason: from getter */
    public q.a getMetadata() {
        return this.metadata;
    }

    public AbstractC14423l d() {
        return AbstractC14423l.f134581b;
    }
}
