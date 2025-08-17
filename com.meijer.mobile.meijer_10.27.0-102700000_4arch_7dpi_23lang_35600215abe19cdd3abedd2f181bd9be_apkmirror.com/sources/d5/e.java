package d5;

import d5.InterfaceC13485a;
import d5.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.AbstractC15335l;
import kw.B;
import kw.C15331h;
import qv.AbstractC16618K;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0003\u001a\u0011\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Ld5/e;", "Ld5/a;", "", "maxSize", "Lkw/B;", "directory", "Lkw/l;", "fileSystem", "Lqv/K;", "cleanupDispatcher", "<init>", "(JLkw/B;Lkw/l;Lqv/K;)V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "key", "Ld5/a$c;", "b", "(Ljava/lang/String;)Ld5/a$c;", "Ld5/a$b;", "a", "(Ljava/lang/String;)Ld5/a$b;", "J", "d", "()J", "Lkw/B;", "c", "()Lkw/B;", "Lkw/l;", "getFileSystem", "()Lkw/l;", "Ld5/c;", "Ld5/c;", "cache", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e implements InterfaceC13485a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B directory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15335l fileSystem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d5.c cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Ld5/e$b;", "Ld5/a$b;", "Ld5/c$b;", "Ld5/c;", "editor", "<init>", "(Ld5/c$b;)V", "Ld5/e$c;", "b", "()Ld5/e$c;", "", "abort", "()V", "a", "Ld5/c$b;", "Lkw/B;", "k", "()Lkw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b implements InterfaceC13485a.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c.b editor;

        @Override // d5.InterfaceC13485a.b
        public void abort() {
            this.editor.a();
        }

        @Override // d5.InterfaceC13485a.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            c.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // d5.InterfaceC13485a.b
        public B getData() {
            return this.editor.f(1);
        }

        @Override // d5.InterfaceC13485a.b
        public B k() {
            return this.editor.f(0);
        }

        public b(c.b bVar) {
            this.editor = bVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Ld5/e$c;", "Ld5/a$c;", "Ld5/c$d;", "Ld5/c;", "snapshot", "<init>", "(Ld5/c$d;)V", "", "close", "()V", "Ld5/e$b;", "a", "()Ld5/e$b;", "Ld5/c$d;", "Lkw/B;", "k", "()Lkw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c implements InterfaceC13485a.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c.d snapshot;

        @Override // d5.InterfaceC13485a.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b y2() {
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

        @Override // d5.InterfaceC13485a.c
        public B getData() {
            return this.snapshot.b(1);
        }

        @Override // d5.InterfaceC13485a.c
        public B k() {
            return this.snapshot.b(0);
        }

        public c(c.d dVar) {
            this.snapshot = dVar;
        }
    }

    private final String e(String str) {
        return C15331h.INSTANCE.d(str).U().E();
    }

    @Override // d5.InterfaceC13485a
    public InterfaceC13485a.b a(String key) {
        c.b bVarH = this.cache.H(e(key));
        if (bVarH != null) {
            return new b(bVarH);
        }
        return null;
    }

    @Override // d5.InterfaceC13485a
    public InterfaceC13485a.c b(String key) {
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

    @Override // d5.InterfaceC13485a
    public AbstractC15335l getFileSystem() {
        return this.fileSystem;
    }

    public e(long j10, B b10, AbstractC15335l abstractC15335l, AbstractC16618K abstractC16618K) {
        this.maxSize = j10;
        this.directory = b10;
        this.fileSystem = abstractC15335l;
        this.cache = new d5.c(getFileSystem(), getDirectory(), abstractC16618K, getMaxSize(), 1, 2);
    }
}
