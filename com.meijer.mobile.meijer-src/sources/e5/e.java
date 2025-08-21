package e5;

import e5.InterfaceC13772a;
import e5.c;
import gw.AbstractC14423l;
import gw.B;
import gw.C14419h;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0003\u001a\u0011\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Le5/e;", "Le5/a;", "", "maxSize", "Lgw/B;", "directory", "Lgw/l;", "fileSystem", "Lmv/K;", "cleanupDispatcher", "<init>", "(JLgw/B;Lgw/l;Lmv/K;)V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "key", "Le5/a$c;", "b", "(Ljava/lang/String;)Le5/a$c;", "Le5/a$b;", "a", "(Ljava/lang/String;)Le5/a$b;", "J", "d", "()J", "Lgw/B;", "c", "()Lgw/B;", "Lgw/l;", "getFileSystem", "()Lgw/l;", "Le5/c;", "Le5/c;", "cache", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e implements InterfaceC13772a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B directory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14423l fileSystem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e5.c cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Le5/e$b;", "Le5/a$b;", "Le5/c$b;", "Le5/c;", "editor", "<init>", "(Le5/c$b;)V", "Le5/e$c;", "b", "()Le5/e$c;", "", "abort", "()V", "a", "Le5/c$b;", "Lgw/B;", "k", "()Lgw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b implements InterfaceC13772a.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c.b editor;

        @Override // e5.InterfaceC13772a.b
        public void abort() {
            this.editor.a();
        }

        @Override // e5.InterfaceC13772a.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            c.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // e5.InterfaceC13772a.b
        public B getData() {
            return this.editor.f(1);
        }

        @Override // e5.InterfaceC13772a.b
        public B k() {
            return this.editor.f(0);
        }

        public b(c.b bVar) {
            this.editor = bVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Le5/e$c;", "Le5/a$c;", "Le5/c$d;", "Le5/c;", "snapshot", "<init>", "(Le5/c$d;)V", "", "close", "()V", "Le5/e$b;", "a", "()Le5/e$b;", "Le5/c$d;", "Lgw/B;", "k", "()Lgw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c implements InterfaceC13772a.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c.d snapshot;

        @Override // e5.InterfaceC13772a.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b x2() {
            c.b bVarA = this.snapshot.a();
            if (bVarA != null) {
                return new b(bVarA);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // e5.InterfaceC13772a.c
        public B getData() {
            return this.snapshot.b(1);
        }

        @Override // e5.InterfaceC13772a.c
        public B k() {
            return this.snapshot.b(0);
        }

        public c(c.d dVar) {
            this.snapshot = dVar;
        }
    }

    private final String e(String str) {
        return C14419h.INSTANCE.d(str).U().E();
    }

    @Override // e5.InterfaceC13772a
    public InterfaceC13772a.b a(String key) {
        c.b bVarH = this.cache.H(e(key));
        if (bVarH != null) {
            return new b(bVarH);
        }
        return null;
    }

    @Override // e5.InterfaceC13772a
    public InterfaceC13772a.c b(String key) {
        c.d dVarJ = this.cache.J(e(key));
        if (dVarJ != null) {
            return new c(dVarJ);
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public B getDirectory() {
        return this.directory;
    }

    /* renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // e5.InterfaceC13772a
    public AbstractC14423l getFileSystem() {
        return this.fileSystem;
    }

    public e(long j10, B b10, AbstractC14423l abstractC14423l, AbstractC15779K abstractC15779K) {
        this.maxSize = j10;
        this.directory = b10;
        this.fileSystem = abstractC14423l;
        this.cache = new e5.c(getFileSystem(), getDirectory(), abstractC15779K, getMaxSize(), 1, 2);
    }
}
