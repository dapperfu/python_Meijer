package androidx.room;

import A4.d;
import androidx.room.AbstractC6115a;
import androidx.room.G;
import androidx.room.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s4.C16871h;
import s4.InterfaceC16865b;
import t4.C17059a;
import t4.C17060b;
import t4.C17061c;
import z4.InterfaceC18380b;
import z4.InterfaceC18381c;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0002>?B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Landroidx/room/z;", "Landroidx/room/a;", "Landroidx/room/e;", "config", "Landroidx/room/K;", "openDelegate", "<init>", "(Landroidx/room/e;Landroidx/room/K;)V", "Lkotlin/Function1;", "LA4/d;", "supportOpenHelperFactory", "(Landroidx/room/e;Lkotlin/jvm/functions/Function1;)V", "", "H", "()V", "LA4/c;", "onOpen", "I", "(Landroidx/room/e;Lkotlin/jvm/functions/Function1;)Landroidx/room/e;", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/X;", "Lkotlin/coroutines/Continuation;", "", "block", "K", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "F", "J", "()Z", "d", "Landroidx/room/e;", "o", "()Landroidx/room/e;", "configuration", "e", "Landroidx/room/K;", "r", "()Landroidx/room/K;", "", "Landroidx/room/G$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "callbacks", "Ls4/b;", "g", "Ls4/b;", "connectionPool", "h", "LA4/c;", "supportDatabase", "G", "()LA4/d;", "supportOpenHelper", "b", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6139z extends AbstractC6115a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6119e configuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final K openDelegate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<G.b> callbacks;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16865b connectionPool;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private A4.c supportDatabase;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/room/z$a;", "Landroidx/room/K;", "<init>", "()V", "Lz4/b;", "connection", "", "f", "(Lz4/b;)V", "i", "Landroidx/room/K$a;", "j", "(Lz4/b;)Landroidx/room/K$a;", "h", "g", "a", "b", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.z$a */
    private static final class a extends K {
        public a() {
            super(-1, "", "");
        }

        @Override // androidx.room.K
        public void a(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public void b(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public void f(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public void g(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public void h(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public void i(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.K
        public K.a j(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/z$b;", "LA4/d$a;", "", "version", "<init>", "(Landroidx/room/z;I)V", "LA4/c;", "db", "", "d", "(LA4/c;)V", "oldVersion", "newVersion", "g", "(LA4/c;II)V", "e", "f", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.z$b */
    public final class b extends d.a {
        public b(int i10) {
            super(i10);
        }

        @Override // A4.d.a
        public void d(A4.c db2) {
            Intrinsics.j(db2, "db");
            C6139z.this.x(new C17059a(db2));
        }

        @Override // A4.d.a
        public void e(A4.c db2, int oldVersion, int newVersion) {
            Intrinsics.j(db2, "db");
            g(db2, oldVersion, newVersion);
        }

        @Override // A4.d.a
        public void f(A4.c db2) {
            Intrinsics.j(db2, "db");
            C6139z.this.z(new C17059a(db2));
            C6139z.this.supportDatabase = db2;
        }

        @Override // A4.d.a
        public void g(A4.c db2, int oldVersion, int newVersion) {
            Intrinsics.j(db2, "db");
            C6139z.this.y(new C17059a(db2), oldVersion, newVersion);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/room/z$c", "Landroidx/room/G$b;", "LA4/c;", "db", "", "e", "(LA4/c;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.z$c */
    public static final class c extends G.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<A4.c, Unit> f58661a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super A4.c, Unit> function1) {
            this.f58661a = function1;
        }

        @Override // androidx.room.G.b
        public void e(A4.c db2) {
            Intrinsics.j(db2, "db");
            this.f58661a.invoke(db2);
        }
    }

    public C6139z(C6119e config, K openDelegate) {
        Intrinsics.j(config, "config");
        Intrinsics.j(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<G.b> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.m() : list;
        InterfaceC18381c interfaceC18381c = config.sqliteDriver;
        if (interfaceC18381c != null) {
            this.connectionPool = config.name == null ? C16871h.b(new AbstractC6115a.b(this, interfaceC18381c), ":memory:") : C16871h.a(new AbstractC6115a.b(this, interfaceC18381c), config.name, p(config.journalMode), q(config.journalMode));
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.connectionPool = new C17060b(new C17061c(config.sqliteOpenHelperFactory.a(d.b.INSTANCE.a(config.context).d(config.name).c(new b(openDelegate.getVersion())).b())));
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(C6139z c6139z, A4.c db2) {
        Intrinsics.j(db2, "db");
        c6139z.supportDatabase = db2;
        return Unit.f142422a;
    }

    private final C6119e I(C6119e c6119e, Function1<? super A4.c, Unit> function1) {
        List<G.b> listM = c6119e.callbacks;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return C6119e.b(c6119e, null, null, null, null, CollectionsKt.Q0(listM, new c(function1)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    @Override // androidx.room.AbstractC6115a
    public String A(String fileName) {
        Intrinsics.j(fileName, "fileName");
        if (Intrinsics.e(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.g(absolutePath);
        return absolutePath;
    }

    public final void F() {
        this.connectionPool.close();
    }

    public final A4.d G() {
        C17061c supportDriver;
        InterfaceC16865b interfaceC16865b = this.connectionPool;
        C17060b c17060b = interfaceC16865b instanceof C17060b ? (C17060b) interfaceC16865b : null;
        if (c17060b == null || (supportDriver = c17060b.getSupportDriver()) == null) {
            return null;
        }
        return supportDriver.getOpenHelper();
    }

    public final boolean J() {
        A4.c cVar = this.supportDatabase;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    public <R> Object K(boolean z10, Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return this.connectionPool.o0(z10, function2, continuation);
    }

    @Override // androidx.room.AbstractC6115a
    protected List<G.b> n() {
        return this.callbacks;
    }

    @Override // androidx.room.AbstractC6115a
    /* renamed from: o, reason: from getter */
    protected C6119e getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.AbstractC6115a
    /* renamed from: r, reason: from getter */
    protected K getOpenDelegate() {
        return this.openDelegate;
    }

    private final void H() {
        boolean z10;
        if (getConfiguration().journalMode == G.d.f58358c) {
            z10 = true;
        } else {
            z10 = false;
        }
        A4.d dVarG = G();
        if (dVarG != null) {
            dVarG.setWriteAheadLoggingEnabled(z10);
        }
    }

    public C6139z(C6119e config, Function1<? super C6119e, ? extends A4.d> supportOpenHelperFactory) {
        Intrinsics.j(config, "config");
        Intrinsics.j(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new a();
        List<G.b> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.m() : list;
        this.connectionPool = new C17060b(new C17061c(supportOpenHelperFactory.invoke(I(config, new Function1() { // from class: androidx.room.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6139z.D(this.f58654a, (A4.c) obj);
            }
        }))));
        H();
    }
}
