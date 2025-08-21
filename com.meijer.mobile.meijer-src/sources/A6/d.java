package A6;

import A6.d;
import A6.i;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14417f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import z6.C18455d;
import z6.F;
import z6.InterfaceC18449A;
import z6.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"LA6/d;", "LA6/j;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "Lz6/A$a;", "D", "Lz6/d;", "apolloRequest", "LA6/i;", "a", "(Lz6/d;)LA6/i;", "Ljava/lang/String;", "b", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f138c = "X-APOLLO-OPERATION-ID";

    /* renamed from: d, reason: collision with root package name */
    private static final String f139d = "X-APOLLO-OPERATION-NAME";

    /* renamed from: e, reason: collision with root package name */
    private static final String f140e = "Apollo-Require-Preflight";

    /* renamed from: f, reason: collision with root package name */
    private static final String f141f = "Accept";

    /* renamed from: g, reason: collision with root package name */
    private static final String f142g = "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json";

    /* renamed from: h, reason: collision with root package name */
    private static final String f143h = "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serverUrl;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jf\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00172\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!JS\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\u0006*\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b'\u0010(JP\u0010*\u001a\u00020)\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"LA6/d$a;", "", "<init>", "()V", "Lz6/A$a;", "D", "", "serverUrl", "Lz6/A;", "operation", "Lz6/p;", "customScalarAdapters", "", "sendApqExtensions", "sendDocument", "sendEnhancedClientAwarenessExtensions", "h", "(Ljava/lang/String;Lz6/A;Lz6/p;ZZZ)Ljava/lang/String;", "LD6/g;", "writer", "query", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "extensionsWriter", "", "Lz6/F;", "l", "(LD6/g;Lz6/A;Lz6/p;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "m", "(LD6/g;Lz6/A;Lz6/p;ZZLjava/lang/String;)Ljava/util/Map;", "apqId", "n", "(Ljava/lang/String;ZZ)Lkotlin/jvm/functions/Function1;", "autoPersistQueries", "sendEnhancedClientAwareness", "j", "(Lz6/A;Lz6/p;ZZZ)Ljava/util/Map;", "parameters", "g", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "LA6/e;", "i", "(Lz6/A;Lz6/p;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LA6/e;", "Lz6/d;", "apolloRequest", "k", "(Lz6/d;)Ljava/util/Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: A6.d$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"A6/d$a$a", "LA6/e;", "Lgw/f;", "bufferedSink", "", "a", "(Lgw/f;)V", "", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "", "b", "J", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: A6.d$a$a, reason: collision with other inner class name */
        public static final class C0005a implements e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String contentType = "application/json";

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long contentLength;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14419h f147c;

            C0005a(C14419h c14419h) {
                this.f147c = c14419h;
                this.contentLength = c14419h.V();
            }

            @Override // A6.e
            public void a(InterfaceC14417f bufferedSink) throws IOException {
                Intrinsics.j(bufferedSink, "bufferedSink");
                bufferedSink.g1(this.f147c);
            }

            @Override // A6.e
            public long getContentLength() {
                return this.contentLength;
            }

            @Override // A6.e
            public String getContentType() {
                return this.contentType;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18449A.a> String h(String serverUrl, InterfaceC18449A<D> operation, p customScalarAdapters, boolean sendApqExtensions, boolean sendDocument, boolean sendEnhancedClientAwarenessExtensions) {
            return g(serverUrl, j(operation, customScalarAdapters, sendApqExtensions, sendDocument, sendEnhancedClientAwarenessExtensions));
        }

        private Companion() {
        }

        private final <D extends InterfaceC18449A.a> Map<String, String> j(InterfaceC18449A<D> operation, p customScalarAdapters, boolean autoPersistQueries, boolean sendDocument, boolean sendEnhancedClientAwareness) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            C14416e c14416e = new C14416e();
            E6.a aVar = new E6.a(new D6.c(c14416e, null));
            aVar.s();
            operation.d(aVar, customScalarAdapters, false);
            aVar.F();
            if (!aVar.c().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", c14416e.n3());
            if (sendDocument) {
                linkedHashMap.put("query", operation.c());
            }
            C14416e c14416e2 = new C14416e();
            D6.c cVar = new D6.c(c14416e2, null);
            cVar.s();
            if (autoPersistQueries) {
                cVar.v1("persistedQuery");
                cVar.s();
                cVar.v1("version").W(1);
                cVar.v1("sha256Hash").e2(operation.b());
                cVar.F();
            }
            if (sendEnhancedClientAwareness) {
                cVar.v1("clientLibrary");
                cVar.s();
                cVar.v1("name").e2("apollo-kotlin");
                cVar.v1("version").e2("4.3.1");
                cVar.F();
            }
            cVar.F();
            String strN3 = c14416e2.n3();
            if (strN3.length() == 0) {
                return linkedHashMap;
            }
            linkedHashMap.put("extensions", strN3);
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Function1<D6.g, Unit> n(final String apqId, final boolean sendApqExtensions, final boolean sendEnhancedClientAwarenessExtensions) {
            return (sendApqExtensions || sendEnhancedClientAwarenessExtensions) ? new Function1() { // from class: A6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.Companion.p(sendApqExtensions, sendEnhancedClientAwarenessExtensions, apqId, (D6.g) obj);
                }
            } : new Function1() { // from class: A6.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.Companion.o((D6.g) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(D6.g gVar) {
            Intrinsics.j(gVar, "<this>");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(boolean z10, boolean z11, String str, D6.g gVar) throws IOException {
            Intrinsics.j(gVar, "<this>");
            gVar.v1("extensions");
            gVar.s();
            if (z10) {
                gVar.v1("persistedQuery");
                gVar.s();
                gVar.v1("version").W(1);
                gVar.v1("sha256Hash").e2(str);
                gVar.F();
            }
            if (z11) {
                gVar.v1("clientLibrary");
                gVar.s();
                gVar.v1("name").e2("apollo-kotlin");
                gVar.v1("version").e2("4.3.1");
                gVar.F();
            }
            gVar.F();
            return Unit.f143329a;
        }

        public final String g(String str, Map<String, String> parameters) {
            Intrinsics.j(str, "<this>");
            Intrinsics.j(parameters, "parameters");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            boolean zD0 = StringsKt.d0(str, "?", false, 2, null);
            Iterator<T> it = parameters.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (zD0) {
                    sb2.append('&');
                } else {
                    sb2.append('?');
                    zD0 = true;
                }
                sb2.append(B6.a.c((String) entry.getKey()));
                sb2.append('=');
                sb2.append(B6.a.c((String) entry.getValue()));
            }
            String string = sb2.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }

        public final <D extends InterfaceC18449A.a> e i(InterfaceC18449A<D> operation, p customScalarAdapters, String query, Function1<? super D6.g, Unit> extensionsWriter) throws IOException {
            Intrinsics.j(operation, "operation");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(extensionsWriter, "extensionsWriter");
            C14416e c14416e = new C14416e();
            Map mapL = d.INSTANCE.l(new D6.c(c14416e, null), operation, customScalarAdapters, query, extensionsWriter);
            C14419h c14419hP2 = c14416e.P2();
            return mapL.isEmpty() ? new C0005a(c14419hP2) : new m(mapL, c14419hP2);
        }

        public final <D extends InterfaceC18449A.a> Map<String, Object> k(C18455d<D> apolloRequest) {
            Intrinsics.j(apolloRequest, "apolloRequest");
            InterfaceC18449A<D> interfaceC18449AG = apolloRequest.g();
            Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
            boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
            boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
            Boolean sendDocument = apolloRequest.getSendDocument();
            boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
            p pVar = (p) apolloRequest.getExecutionContext().c(p.INSTANCE);
            if (pVar == null) {
                pVar = p.f172485i;
            }
            p pVar2 = pVar;
            String strC = zBooleanValue2 ? interfaceC18449AG.c() : null;
            D6.i iVar = new D6.i();
            d.INSTANCE.m(iVar, interfaceC18449AG, pVar2, zBooleanValue, sendEnhancedClientAwareness, strC);
            Object objC = iVar.c();
            Intrinsics.h(objC, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) objC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18449A.a> Map<String, F> l(D6.g writer, InterfaceC18449A<D> operation, p customScalarAdapters, String query, Function1<? super D6.g, Unit> extensionsWriter) throws IOException {
            writer.s();
            writer.v1("operationName");
            writer.e2(operation.name());
            writer.v1("variables");
            E6.a aVar = new E6.a(writer);
            aVar.s();
            operation.d(aVar, customScalarAdapters, false);
            aVar.F();
            Map<String, F> mapC = aVar.c();
            if (query != null) {
                writer.v1("query");
                writer.e2(query);
            }
            extensionsWriter.invoke(writer);
            writer.F();
            return mapC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18449A.a> Map<String, F> m(D6.g writer, InterfaceC18449A<D> operation, p customScalarAdapters, boolean sendApqExtensions, boolean sendEnhancedClientAwarenessExtensions, String query) {
            return l(writer, operation, customScalarAdapters, query, n(operation.b(), sendApqExtensions, sendEnhancedClientAwarenessExtensions));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f150a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.f151b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(String serverUrl) {
        Intrinsics.j(serverUrl, "serverUrl");
        this.serverUrl = serverUrl;
    }

    @Override // A6.j
    public <D extends InterfaceC18449A.a> i a(C18455d<D> apolloRequest) throws IOException {
        i.a aVarB;
        Intrinsics.j(apolloRequest, "apolloRequest");
        InterfaceC18449A<D> interfaceC18449AG = apolloRequest.g();
        p pVar = (p) apolloRequest.getExecutionContext().c(p.INSTANCE);
        if (pVar == null) {
            pVar = p.f172485i;
        }
        p pVar2 = pVar;
        ArrayList arrayList = new ArrayList();
        apolloRequest.g();
        arrayList.add(new HttpHeader(f141f, f142g));
        if (apolloRequest.e() != null) {
            arrayList.addAll(apolloRequest.e());
        }
        Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
        boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
        Boolean sendDocument = apolloRequest.getSendDocument();
        boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
        boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
        h httpMethod = apolloRequest.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = h.f151b;
        }
        int i10 = b.$EnumSwitchMapping$0[httpMethod.ordinal()];
        if (i10 == 1) {
            aVarB = new i.a(h.f150a, INSTANCE.h(this.serverUrl, interfaceC18449AG, pVar2, zBooleanValue, zBooleanValue2, sendEnhancedClientAwareness)).b(f140e, "true");
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strC = zBooleanValue2 ? interfaceC18449AG.c() : null;
            Companion companion = INSTANCE;
            e eVarI = companion.i(interfaceC18449AG, pVar2, strC, companion.n(interfaceC18449AG.b(), zBooleanValue, sendEnhancedClientAwareness));
            aVarB = new i.a(h.f151b, this.serverUrl).d(eVarI);
            if (StringsKt.W(eVarI.getContentType(), "multipart/form-data", false, 2, null)) {
                aVarB = aVarB.b(f140e, "true");
            }
        }
        return aVarB.c(arrayList).a(apolloRequest.getExecutionContext()).e();
    }
}
