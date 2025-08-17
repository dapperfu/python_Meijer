package z6;

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
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15329f;
import y6.C18176d;
import y6.InterfaceC18167A;
import y6.InterfaceC18172F;
import y6.p;
import z6.C18394d;
import z6.C18399i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lz6/d;", "Lz6/j;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "Ly6/A$a;", "D", "Ly6/d;", "apolloRequest", "Lz6/i;", "a", "(Ly6/d;)Lz6/i;", "Ljava/lang/String;", "b", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18394d implements InterfaceC18400j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f171605c = "X-APOLLO-OPERATION-ID";

    /* renamed from: d, reason: collision with root package name */
    private static final String f171606d = "X-APOLLO-OPERATION-NAME";

    /* renamed from: e, reason: collision with root package name */
    private static final String f171607e = "Apollo-Require-Preflight";

    /* renamed from: f, reason: collision with root package name */
    private static final String f171608f = "Accept";

    /* renamed from: g, reason: collision with root package name */
    private static final String f171609g = "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json";

    /* renamed from: h, reason: collision with root package name */
    private static final String f171610h = "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serverUrl;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jf\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00172\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!JS\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\u0006*\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b'\u0010(JP\u0010*\u001a\u00020)\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lz6/d$a;", "", "<init>", "()V", "Ly6/A$a;", "D", "", "serverUrl", "Ly6/A;", "operation", "Ly6/p;", "customScalarAdapters", "", "sendApqExtensions", "sendDocument", "sendEnhancedClientAwarenessExtensions", "h", "(Ljava/lang/String;Ly6/A;Ly6/p;ZZZ)Ljava/lang/String;", "LC6/g;", "writer", "query", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "extensionsWriter", "", "Ly6/F;", "l", "(LC6/g;Ly6/A;Ly6/p;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "m", "(LC6/g;Ly6/A;Ly6/p;ZZLjava/lang/String;)Ljava/util/Map;", "apqId", "n", "(Ljava/lang/String;ZZ)Lkotlin/jvm/functions/Function1;", "autoPersistQueries", "sendEnhancedClientAwareness", "j", "(Ly6/A;Ly6/p;ZZZ)Ljava/util/Map;", "parameters", "g", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lz6/e;", "i", "(Ly6/A;Ly6/p;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lz6/e;", "Ly6/d;", "apolloRequest", "k", "(Ly6/d;)Ljava/util/Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: z6.d$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"z6/d$a$a", "Lz6/e;", "Lkw/f;", "bufferedSink", "", "a", "(Lkw/f;)V", "", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "", "b", "J", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: z6.d$a$a, reason: collision with other inner class name */
        public static final class C2765a implements InterfaceC18395e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String contentType = "application/json";

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long contentLength;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C15331h f171614c;

            C2765a(C15331h c15331h) {
                this.f171614c = c15331h;
                this.contentLength = c15331h.V();
            }

            @Override // z6.InterfaceC18395e
            public void a(InterfaceC15329f bufferedSink) throws IOException {
                Intrinsics.j(bufferedSink, "bufferedSink");
                bufferedSink.Z2(this.f171614c);
            }

            @Override // z6.InterfaceC18395e
            public long getContentLength() {
                return this.contentLength;
            }

            @Override // z6.InterfaceC18395e
            public String getContentType() {
                return this.contentType;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18167A.a> String h(String serverUrl, InterfaceC18167A<D> operation, p customScalarAdapters, boolean sendApqExtensions, boolean sendDocument, boolean sendEnhancedClientAwarenessExtensions) {
            return g(serverUrl, j(operation, customScalarAdapters, sendApqExtensions, sendDocument, sendEnhancedClientAwarenessExtensions));
        }

        private Companion() {
        }

        private final <D extends InterfaceC18167A.a> Map<String, String> j(InterfaceC18167A<D> operation, p customScalarAdapters, boolean autoPersistQueries, boolean sendDocument, boolean sendEnhancedClientAwareness) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            C15328e c15328e = new C15328e();
            D6.a aVar = new D6.a(new C6.c(c15328e, null));
            aVar.s();
            operation.d(aVar, customScalarAdapters, false);
            aVar.F();
            if (!aVar.c().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", c15328e.n3());
            if (sendDocument) {
                linkedHashMap.put("query", operation.c());
            }
            C15328e c15328e2 = new C15328e();
            C6.c cVar = new C6.c(c15328e2, null);
            cVar.s();
            if (autoPersistQueries) {
                cVar.x1("persistedQuery");
                cVar.s();
                cVar.x1("version").W(1);
                cVar.x1("sha256Hash").f2(operation.b());
                cVar.F();
            }
            if (sendEnhancedClientAwareness) {
                cVar.x1("clientLibrary");
                cVar.s();
                cVar.x1("name").f2("apollo-kotlin");
                cVar.x1("version").f2("4.3.1");
                cVar.F();
            }
            cVar.F();
            String strN3 = c15328e2.n3();
            if (strN3.length() == 0) {
                return linkedHashMap;
            }
            linkedHashMap.put("extensions", strN3);
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Function1<C6.g, Unit> n(final String apqId, final boolean sendApqExtensions, final boolean sendEnhancedClientAwarenessExtensions) {
            return (sendApqExtensions || sendEnhancedClientAwarenessExtensions) ? new Function1() { // from class: z6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18394d.Companion.p(sendApqExtensions, sendEnhancedClientAwarenessExtensions, apqId, (C6.g) obj);
                }
            } : new Function1() { // from class: z6.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18394d.Companion.o((C6.g) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(C6.g gVar) {
            Intrinsics.j(gVar, "<this>");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(boolean z10, boolean z11, String str, C6.g gVar) throws IOException {
            Intrinsics.j(gVar, "<this>");
            gVar.x1("extensions");
            gVar.s();
            if (z10) {
                gVar.x1("persistedQuery");
                gVar.s();
                gVar.x1("version").W(1);
                gVar.x1("sha256Hash").f2(str);
                gVar.F();
            }
            if (z11) {
                gVar.x1("clientLibrary");
                gVar.s();
                gVar.x1("name").f2("apollo-kotlin");
                gVar.x1("version").f2("4.3.1");
                gVar.F();
            }
            gVar.F();
            return Unit.f142422a;
        }

        public final String g(String str, Map<String, String> parameters) {
            Intrinsics.j(str, "<this>");
            Intrinsics.j(parameters, "parameters");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            boolean zC0 = StringsKt.c0(str, "?", false, 2, null);
            Iterator<T> it = parameters.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (zC0) {
                    sb2.append('&');
                } else {
                    sb2.append('?');
                    zC0 = true;
                }
                sb2.append(A6.a.c((String) entry.getKey()));
                sb2.append('=');
                sb2.append(A6.a.c((String) entry.getValue()));
            }
            String string = sb2.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }

        public final <D extends InterfaceC18167A.a> InterfaceC18395e i(InterfaceC18167A<D> operation, p customScalarAdapters, String query, Function1<? super C6.g, Unit> extensionsWriter) throws IOException {
            Intrinsics.j(operation, "operation");
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            Intrinsics.j(extensionsWriter, "extensionsWriter");
            C15328e c15328e = new C15328e();
            Map mapL = C18394d.INSTANCE.l(new C6.c(c15328e, null), operation, customScalarAdapters, query, extensionsWriter);
            C15331h c15331hQ2 = c15328e.Q2();
            return mapL.isEmpty() ? new C2765a(c15331hQ2) : new m(mapL, c15331hQ2);
        }

        public final <D extends InterfaceC18167A.a> Map<String, Object> k(C18176d<D> apolloRequest) {
            Intrinsics.j(apolloRequest, "apolloRequest");
            InterfaceC18167A<D> interfaceC18167AG = apolloRequest.g();
            Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
            boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
            boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
            Boolean sendDocument = apolloRequest.getSendDocument();
            boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
            p pVar = (p) apolloRequest.getExecutionContext().c(p.INSTANCE);
            if (pVar == null) {
                pVar = p.f170299i;
            }
            p pVar2 = pVar;
            String strC = zBooleanValue2 ? interfaceC18167AG.c() : null;
            C6.i iVar = new C6.i();
            C18394d.INSTANCE.m(iVar, interfaceC18167AG, pVar2, zBooleanValue, sendEnhancedClientAwareness, strC);
            Object objC = iVar.c();
            Intrinsics.h(objC, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) objC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18167A.a> Map<String, InterfaceC18172F> l(C6.g writer, InterfaceC18167A<D> operation, p customScalarAdapters, String query, Function1<? super C6.g, Unit> extensionsWriter) throws IOException {
            writer.s();
            writer.x1("operationName");
            writer.f2(operation.name());
            writer.x1("variables");
            D6.a aVar = new D6.a(writer);
            aVar.s();
            operation.d(aVar, customScalarAdapters, false);
            aVar.F();
            Map<String, InterfaceC18172F> mapC = aVar.c();
            if (query != null) {
                writer.x1("query");
                writer.f2(query);
            }
            extensionsWriter.invoke(writer);
            writer.F();
            return mapC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC18167A.a> Map<String, InterfaceC18172F> m(C6.g writer, InterfaceC18167A<D> operation, p customScalarAdapters, boolean sendApqExtensions, boolean sendEnhancedClientAwarenessExtensions, String query) {
            return l(writer, operation, customScalarAdapters, query, n(operation.b(), sendApqExtensions, sendEnhancedClientAwarenessExtensions));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.d$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC18398h.values().length];
            try {
                iArr[EnumC18398h.f171617a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18398h.f171618b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C18394d(String serverUrl) {
        Intrinsics.j(serverUrl, "serverUrl");
        this.serverUrl = serverUrl;
    }

    @Override // z6.InterfaceC18400j
    public <D extends InterfaceC18167A.a> C18399i a(C18176d<D> apolloRequest) throws IOException {
        C18399i.a aVarB;
        Intrinsics.j(apolloRequest, "apolloRequest");
        InterfaceC18167A<D> interfaceC18167AG = apolloRequest.g();
        p pVar = (p) apolloRequest.getExecutionContext().c(p.INSTANCE);
        if (pVar == null) {
            pVar = p.f170299i;
        }
        p pVar2 = pVar;
        ArrayList arrayList = new ArrayList();
        apolloRequest.g();
        arrayList.add(new HttpHeader(f171608f, f171609g));
        if (apolloRequest.e() != null) {
            arrayList.addAll(apolloRequest.e());
        }
        Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
        boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
        Boolean sendDocument = apolloRequest.getSendDocument();
        boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
        boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
        EnumC18398h httpMethod = apolloRequest.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = EnumC18398h.f171618b;
        }
        int i10 = b.$EnumSwitchMapping$0[httpMethod.ordinal()];
        if (i10 == 1) {
            aVarB = new C18399i.a(EnumC18398h.f171617a, INSTANCE.h(this.serverUrl, interfaceC18167AG, pVar2, zBooleanValue, zBooleanValue2, sendEnhancedClientAwareness)).b(f171607e, "true");
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strC = zBooleanValue2 ? interfaceC18167AG.c() : null;
            Companion companion = INSTANCE;
            InterfaceC18395e interfaceC18395eI = companion.i(interfaceC18167AG, pVar2, strC, companion.n(interfaceC18167AG.b(), zBooleanValue, sendEnhancedClientAwareness));
            aVarB = new C18399i.a(EnumC18398h.f171618b, this.serverUrl).d(interfaceC18395eI);
            if (StringsKt.W(interfaceC18395eI.getContentType(), "multipart/form-data", false, 2, null)) {
                aVarB = aVarB.b(f171607e, "true");
            }
        }
        return aVarB.c(arrayList).a(apolloRequest.getExecutionContext()).e();
    }
}
