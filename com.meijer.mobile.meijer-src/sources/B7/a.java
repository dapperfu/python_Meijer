package B7;

import A7.b;
import H7.c;
import I7.f;
import Y7.EndPointInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import m8.r;
import mv.C15800f0;
import mv.InterfaceC15783O;
import okhttp3.d;
import x7.InterfaceC18129b;
import y7.InterfaceC18294a;
import z7.InterfaceC18459b;
import z7.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"LB7/a;", "", "Lokhttp3/d$a;", "httpFactory", "Ly7/a;", "timeProvider", "", "version", "LY7/d;", "dataBaseDataSource", "LY7/a;", "activeEndpoint", "LA7/b;", "serverDataListener", "Lmv/O;", "externalScope", "Lx7/b;", "connectivityChecker", "<init>", "(Lokhttp3/d$a;Ly7/a;Ljava/lang/String;LY7/d;LY7/a;LA7/b;Lmv/O;Lx7/b;)V", "Lz7/b;", "a", "()Lz7/b;", "Lokhttp3/d$a;", "b", "Ly7/a;", "c", "Ljava/lang/String;", "d", "LY7/d;", "e", "LY7/a;", "f", "LA7/b;", "g", "Lmv/O;", "h", "Lx7/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a httpFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y7.d dataBaseDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndpoint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b serverDataListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O externalScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18129b connectivityChecker;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B7.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0058a extends FunctionReferenceImpl implements Function0<Long> {
        C0058a(Object obj) {
            super(0, obj, InterfaceC18294a.class, "millisSinceEpoch", "millisSinceEpoch()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(((InterfaceC18294a) this.receiver).a());
        }
    }

    public a(d.a aVar, InterfaceC18294a timeProvider, String version, Y7.d dataBaseDataSource, EndPointInfo activeEndpoint, b serverDataListener, InterfaceC15783O externalScope, InterfaceC18129b connectivityChecker) {
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

    public final InterfaceC18459b a() {
        d.a aVarA = this.httpFactory;
        if (aVarA == null) {
            aVarA = E7.b.f7037a.a().a();
        }
        F7.d dVar = new F7.d(aVarA, new H7.b(this.version), new c(this.version, new C0058a(this.timeProvider), true), new I7.a(new r(this.activeEndpoint.getApplicationId()), new f()), this.connectivityChecker);
        i iVar = new i(this.dataBaseDataSource, this.timeProvider);
        return new z7.c(dVar, C15800f0.b(), new J7.b(this.activeEndpoint, this.dataBaseDataSource, D7.b.INSTANCE.a(1), this.timeProvider), iVar, this.serverDataListener, this.externalScope);
    }
}
