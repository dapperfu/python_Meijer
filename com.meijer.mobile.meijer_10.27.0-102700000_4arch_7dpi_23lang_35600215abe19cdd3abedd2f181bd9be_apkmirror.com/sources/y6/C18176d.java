package y6;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y6.InterfaceC18167A;
import y6.InterfaceC18167A.a;
import z6.EnumC18398h;
import z6.HttpHeader;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b$\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001!B\u0093\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\b\b\u0001\u0010\u001e*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b%\u00105R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b!\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b8\u00105R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00103\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00105R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u00103\u0012\u0004\b<\u0010:\u001a\u0004\b,\u00105R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\b;\u0010>¨\u0006?"}, d2 = {"Ly6/d;", "Ly6/A$a;", "D", "", "Ly6/A;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Ly6/w;", "executionContext", "Lz6/h;", "httpMethod", "", "Lz6/f;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "ignoreApolloClientHttpHeaders", "retryOnError", "failFastIfOffline", "sendEnhancedClientAwareness", "<init>", "(Ly6/A;Ljava/util/UUID;Ly6/w;Lz6/h;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "Ly6/d$a;", "m", "()Ly6/d$a;", "E", "n", "(Ly6/A;)Ly6/d$a;", "a", "Ly6/A;", "g", "()Ly6/A;", "b", "Ljava/util/UUID;", "h", "()Ljava/util/UUID;", "c", "Ly6/w;", "()Ly6/w;", "d", "Lz6/h;", "f", "()Lz6/h;", "e", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "k", "i", "getIgnoreApolloClientHttpHeaders", "getRetryOnError$annotations", "()V", "l", "getFailFastIfOffline$annotations", "Z", "()Z", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18176d<D extends InterfaceC18167A.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18167A<D> operation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID requestUuid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w executionContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final EnumC18398h httpMethod;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> httpHeaders;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendApqExtensions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendDocument;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Boolean enableAutoPersistedQueries;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean canBeBatched;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Boolean ignoreApolloClientHttpHeaders;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Boolean retryOnError;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Boolean failFastIfOffline;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean sendEnhancedClientAwareness;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b&\u0010\u0014J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b(\u0010\u0014J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b*\u0010\u0014J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b,\u0010\u0014J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b.\u0010\u0014J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00028\u000102¢\u0006\u0004\b3\u00104R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u00107R4\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u000e\u0010 \u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b9\u0010:R$\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010;\u001a\u0004\b<\u0010=R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b?\u0010@R4\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR(\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bE\u0010FR(\u0010#\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR(\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bI\u0010FR(\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\bG\u0010FR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010FR.\u0010+\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010D\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010FR.\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00118\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010D\u0012\u0004\bO\u0010N\u001a\u0004\bJ\u0010FR$\u0010/\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010P\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Ly6/d$a;", "Ly6/A$a;", "D", "", "Ly6/A;", "operation", "<init>", "(Ly6/A;)V", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "t", "(Ljava/util/UUID;)Ly6/d$a;", "Ly6/w;", "executionContext", "e", "(Ly6/w;)Ly6/d$a;", "", "ignoreApolloClientHttpHeaders", "s", "(Ljava/lang/Boolean;)Ly6/d$a;", "Lz6/h;", "httpMethod", "r", "(Lz6/h;)Ly6/d$a;", "", "Lz6/f;", "httpHeaders", "q", "(Ljava/util/List;)Ly6/d$a;", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Ly6/d$a;", "sendApqExtensions", "v", "sendDocument", "w", "enableAutoPersistedQueries", "d", "canBeBatched", "c", "retryOnError", "u", "failFastIfOffline", "f", "sendEnhancedClientAwareness", "x", "(Z)Ly6/d$a;", "Ly6/d;", "b", "()Ly6/d;", "Ly6/A;", "getOperation", "()Ly6/A;", "Ljava/util/UUID;", "getRequestUuid", "()Ljava/util/UUID;", "Ly6/w;", "i", "()Ly6/w;", "Lz6/h;", "l", "()Lz6/h;", "Ljava/util/List;", "k", "()Ljava/util/List;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "g", "o", "p", "j", "m", "n", "getRetryOnError$annotations", "()V", "getFailFastIfOffline$annotations", "Z", "getSendEnhancedClientAwareness", "()Z", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: y6.d$a */
    public static final class a<D extends InterfaceC18167A.a> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC18167A<D> operation;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private UUID requestUuid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private w executionContext;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private EnumC18398h httpMethod;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> httpHeaders;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Boolean enableAutoPersistedQueries;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Boolean sendApqExtensions;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Boolean sendDocument;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Boolean canBeBatched;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Boolean ignoreApolloClientHttpHeaders;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Boolean retryOnError;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Boolean failFastIfOffline;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean sendEnhancedClientAwareness;

        public a(InterfaceC18167A<D> operation) {
            Intrinsics.j(operation, "operation");
            this.operation = operation;
            this.executionContext = w.f170323b;
            this.sendEnhancedClientAwareness = true;
        }

        public a<D> a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            List<HttpHeader> listK = k();
            if (listK == null) {
                listK = CollectionsKt.m();
            }
            this.httpHeaders = CollectionsKt.Q0(listK, new HttpHeader(name, value));
            return this;
        }

        public final C18176d<D> b() {
            InterfaceC18167A<D> interfaceC18167A = this.operation;
            UUID uuidRandomUUID = this.requestUuid;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
                Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
            }
            return new C18176d<>(interfaceC18167A, uuidRandomUUID, getExecutionContext(), getHttpMethod(), k(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), this.ignoreApolloClientHttpHeaders, this.retryOnError, this.failFastIfOffline, this.sendEnhancedClientAwareness, null);
        }

        public a<D> c(Boolean canBeBatched) {
            this.canBeBatched = canBeBatched;
            return this;
        }

        public a<D> d(Boolean enableAutoPersistedQueries) {
            this.enableAutoPersistedQueries = enableAutoPersistedQueries;
            return this;
        }

        public final a<D> e(w executionContext) {
            Intrinsics.j(executionContext, "executionContext");
            this.executionContext = executionContext;
            return this;
        }

        public final a<D> f(Boolean failFastIfOffline) {
            this.failFastIfOffline = failFastIfOffline;
            return this;
        }

        /* renamed from: g, reason: from getter */
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        /* renamed from: h, reason: from getter */
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        /* renamed from: i, reason: from getter */
        public w getExecutionContext() {
            return this.executionContext;
        }

        /* renamed from: j, reason: from getter */
        public final Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        public List<HttpHeader> k() {
            return this.httpHeaders;
        }

        /* renamed from: l, reason: from getter */
        public EnumC18398h getHttpMethod() {
            return this.httpMethod;
        }

        /* renamed from: m, reason: from getter */
        public final Boolean getIgnoreApolloClientHttpHeaders() {
            return this.ignoreApolloClientHttpHeaders;
        }

        /* renamed from: n, reason: from getter */
        public final Boolean getRetryOnError() {
            return this.retryOnError;
        }

        /* renamed from: o, reason: from getter */
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        /* renamed from: p, reason: from getter */
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        public a<D> q(List<HttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public a<D> r(EnumC18398h httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public final a<D> s(Boolean ignoreApolloClientHttpHeaders) {
            this.ignoreApolloClientHttpHeaders = ignoreApolloClientHttpHeaders;
            return this;
        }

        public final a<D> t(UUID requestUuid) {
            Intrinsics.j(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        public final a<D> u(Boolean retryOnError) {
            this.retryOnError = retryOnError;
            return this;
        }

        public a<D> v(Boolean sendApqExtensions) {
            this.sendApqExtensions = sendApqExtensions;
            return this;
        }

        public a<D> w(Boolean sendDocument) {
            this.sendDocument = sendDocument;
            return this;
        }

        public final a<D> x(boolean sendEnhancedClientAwareness) {
            this.sendEnhancedClientAwareness = sendEnhancedClientAwareness;
            return this;
        }
    }

    public /* synthetic */ C18176d(InterfaceC18167A interfaceC18167A, UUID uuid, w wVar, EnumC18398h enumC18398h, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18167A, uuid, wVar, enumC18398h, list, bool, bool2, bool3, bool4, bool5, bool6, bool7, z10);
    }

    private C18176d(InterfaceC18167A<D> interfaceC18167A, UUID uuid, w wVar, EnumC18398h enumC18398h, List<HttpHeader> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z10) {
        this.operation = interfaceC18167A;
        this.requestUuid = uuid;
        this.executionContext = wVar;
        this.httpMethod = enumC18398h;
        this.httpHeaders = list;
        this.sendApqExtensions = bool;
        this.sendDocument = bool2;
        this.enableAutoPersistedQueries = bool3;
        this.canBeBatched = bool4;
        this.ignoreApolloClientHttpHeaders = bool5;
        this.retryOnError = bool6;
        this.failFastIfOffline = bool7;
        this.sendEnhancedClientAwareness = z10;
    }

    /* renamed from: a, reason: from getter */
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    /* renamed from: b, reason: from getter */
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    /* renamed from: c, reason: from getter */
    public w getExecutionContext() {
        return this.executionContext;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getFailFastIfOffline() {
        return this.failFastIfOffline;
    }

    public List<HttpHeader> e() {
        return this.httpHeaders;
    }

    /* renamed from: f, reason: from getter */
    public EnumC18398h getHttpMethod() {
        return this.httpMethod;
    }

    public final InterfaceC18167A<D> g() {
        return this.operation;
    }

    /* renamed from: h, reason: from getter */
    public final UUID getRequestUuid() {
        return this.requestUuid;
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getRetryOnError() {
        return this.retryOnError;
    }

    /* renamed from: j, reason: from getter */
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    /* renamed from: k, reason: from getter */
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSendEnhancedClientAwareness() {
        return this.sendEnhancedClientAwareness;
    }

    public final a<D> m() {
        return (a<D>) n(this.operation);
    }

    public final <E extends InterfaceC18167A.a> a<E> n(InterfaceC18167A<E> operation) {
        Intrinsics.j(operation, "operation");
        return new a(operation).t(this.requestUuid).e(getExecutionContext()).r(getHttpMethod()).q(e()).v(getSendApqExtensions()).w(getSendDocument()).d(getEnableAutoPersistedQueries()).c(getCanBeBatched()).u(this.retryOnError).f(this.failFastIfOffline).s(this.ignoreApolloClientHttpHeaders).x(this.sendEnhancedClientAwareness);
    }
}
