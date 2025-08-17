package z6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y6.w;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0012B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lz6/i;", "", "Lz6/h;", "method", "", "url", "", "Lz6/f;", "headers", "Lz6/e;", "body", "Ly6/w;", "executionContext", "<init>", "(Lz6/h;Ljava/lang/String;Ljava/util/List;Lz6/e;Ly6/w;)V", "Lz6/i$a;", "e", "(Lz6/h;Ljava/lang/String;)Lz6/i$a;", "a", "Lz6/h;", "c", "()Lz6/h;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "Lz6/e;", "()Lz6/e;", "Ly6/w;", "getExecutionContext", "()Ly6/w;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18399i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC18398h method;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18395e body;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w executionContext;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"Lz6/i$a;", "", "Lz6/h;", "method", "", "url", "<init>", "(Lz6/h;Ljava/lang/String;)V", "Lz6/e;", "body", "d", "(Lz6/e;)Lz6/i$a;", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lz6/i$a;", "", "Lz6/f;", "headers", "c", "(Ljava/util/List;)Lz6/i$a;", "Ly6/w;", "executionContext", "a", "(Ly6/w;)Lz6/i$a;", "Lz6/i;", "e", "()Lz6/i;", "Lz6/h;", "Ljava/lang/String;", "Lz6/e;", "", "Ljava/util/List;", "Ly6/w;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC18398h method;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private InterfaceC18395e body;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private w executionContext;

        public a(EnumC18398h method, String url) {
            Intrinsics.j(method, "method");
            Intrinsics.j(url, "url");
            this.method = method;
            this.url = url;
            this.headers = new ArrayList();
            this.executionContext = w.f170323b;
        }

        public final a a(w executionContext) {
            Intrinsics.j(executionContext, "executionContext");
            this.executionContext = this.executionContext.f(executionContext);
            return this;
        }

        public final a b(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.headers.add(new HttpHeader(name, value));
            return this;
        }

        public final a c(List<HttpHeader> headers) {
            Intrinsics.j(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final a d(InterfaceC18395e body) {
            Intrinsics.j(body, "body");
            this.body = body;
            return this;
        }

        public final C18399i e() {
            return new C18399i(this.method, this.url, this.headers, this.body, this.executionContext, null);
        }
    }

    public /* synthetic */ C18399i(EnumC18398h enumC18398h, String str, List list, InterfaceC18395e interfaceC18395e, w wVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC18398h, str, list, interfaceC18395e, wVar);
    }

    private C18399i(EnumC18398h enumC18398h, String str, List<HttpHeader> list, InterfaceC18395e interfaceC18395e, w wVar) {
        this.method = enumC18398h;
        this.url = str;
        this.headers = list;
        this.body = interfaceC18395e;
        this.executionContext = wVar;
    }

    public static /* synthetic */ a f(C18399i c18399i, EnumC18398h enumC18398h, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC18398h = c18399i.method;
        }
        if ((i10 & 2) != 0) {
            str = c18399i.url;
        }
        return c18399i.e(enumC18398h, str);
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC18395e getBody() {
        return this.body;
    }

    public final List<HttpHeader> b() {
        return this.headers;
    }

    /* renamed from: c, reason: from getter */
    public final EnumC18398h getMethod() {
        return this.method;
    }

    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @JvmOverloads
    public final a e(EnumC18398h method, String url) {
        Intrinsics.j(method, "method");
        Intrinsics.j(url, "url");
        a aVar = new a(method, url);
        InterfaceC18395e interfaceC18395e = this.body;
        if (interfaceC18395e != null) {
            aVar.d(interfaceC18395e);
        }
        aVar.c(this.headers);
        aVar.a(this.executionContext);
        return aVar;
    }
}
