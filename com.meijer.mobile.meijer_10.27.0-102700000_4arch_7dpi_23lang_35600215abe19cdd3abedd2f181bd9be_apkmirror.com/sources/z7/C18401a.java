package z7;

import F7.c;
import G7.f;
import W7.EndPointInfo;
import k8.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.d;
import qv.C16639f0;
import qv.InterfaceC16622O;
import v7.InterfaceC17517b;
import w7.InterfaceC17801a;
import x7.b;
import x7.i;
import y7.InterfaceC18187b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lz7/a;", "", "Lokhttp3/d$a;", "httpFactory", "Lw7/a;", "timeProvider", "", "version", "LW7/d;", "dataBaseDataSource", "LW7/a;", "activeEndpoint", "Ly7/b;", "serverDataListener", "Lqv/O;", "externalScope", "Lv7/b;", "connectivityChecker", "<init>", "(Lokhttp3/d$a;Lw7/a;Ljava/lang/String;LW7/d;LW7/a;Ly7/b;Lqv/O;Lv7/b;)V", "Lx7/b;", "a", "()Lx7/b;", "Lokhttp3/d$a;", "b", "Lw7/a;", "c", "Ljava/lang/String;", "d", "LW7/d;", "e", "LW7/a;", "f", "Ly7/b;", "g", "Lqv/O;", "h", "Lv7/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18401a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a httpFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final W7.d dataBaseDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndpoint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18187b serverDataListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O externalScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17517b connectivityChecker;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z7.a$a, reason: collision with other inner class name */
    /* synthetic */ class C2766a extends FunctionReferenceImpl implements Function0<Long> {
        C2766a(Object obj) {
            super(0, obj, InterfaceC17801a.class, "millisSinceEpoch", "millisSinceEpoch()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(((InterfaceC17801a) this.receiver).a());
        }
    }

    public C18401a(d.a aVar, InterfaceC17801a timeProvider, String version, W7.d dataBaseDataSource, EndPointInfo activeEndpoint, InterfaceC18187b serverDataListener, InterfaceC16622O externalScope, InterfaceC17517b connectivityChecker) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(version, "version");
        Intrinsics.j(dataBaseDataSource, "dataBaseDataSource");
        Intrinsics.j(activeEndpoint, "activeEndpoint");
        Intrinsics.j(serverDataListener, "serverDataListener");
        Intrinsics.j(externalScope, "externalScope");
        Intrinsics.j(connectivityChecker, "connectivityChecker");
        this.httpFactory = aVar;
        this.timeProvider = timeProvider;
        this.version = version;
        this.dataBaseDataSource = dataBaseDataSource;
        this.activeEndpoint = activeEndpoint;
        this.serverDataListener = serverDataListener;
        this.externalScope = externalScope;
        this.connectivityChecker = connectivityChecker;
    }

    public final b a() {
        d.a aVarA = this.httpFactory;
        if (aVarA == null) {
            aVarA = C7.b.f3725a.a().a();
        }
        D7.d dVar = new D7.d(aVarA, new F7.b(this.version), new c(this.version, new C2766a(this.timeProvider), true), new G7.a(new r(this.activeEndpoint.getApplicationId()), new f()), this.connectivityChecker);
        i iVar = new i(this.dataBaseDataSource, this.timeProvider);
        return new x7.c(dVar, C16639f0.b(), new H7.b(this.activeEndpoint, this.dataBaseDataSource, B7.b.INSTANCE.a(1), this.timeProvider), iVar, this.serverDataListener, this.externalScope);
    }
}
