package z6;

import com.apollographql.apollo.exception.ApolloException;
import com.google.maps.android.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import z6.InterfaceC18449A;
import z6.InterfaceC18449A.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0019Bm\b\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lz6/e;", "Lz6/A$a;", "D", "", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Lz6/A;", "operation", "data", "", "Lz6/s;", "errors", "Lcom/apollographql/apollo/exception/ApolloException;", "exception", "", "", "extensions", "Lz6/w;", "executionContext", "", "isLast", "<init>", "(Ljava/util/UUID;Lz6/A;Lz6/A$a;Ljava/util/List;Lcom/apollographql/apollo/exception/ApolloException;Ljava/util/Map;Lz6/w;Z)V", "Lz6/e$a;", "a", "()Lz6/e$a;", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "b", "Lz6/A;", "c", "Lz6/A$a;", "d", "Ljava/util/List;", "e", "Lcom/apollographql/apollo/exception/ApolloException;", "f", "Ljava/util/Map;", "g", "Lz6/w;", "h", "Z", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18456e<D extends InterfaceC18449A.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final UUID requestUuid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC18449A<D> operation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final D data;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final List<Error> errors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final ApolloException exception;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Map<String, Object> extensions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final w executionContext;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean isLast;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B_\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001a\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010+R\u0018\u0010\t\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00101¨\u00062"}, d2 = {"Lz6/e$a;", "Lz6/A$a;", "D", "", "Lz6/A;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "data", "", "Lz6/s;", "errors", "", "", "extensions", "Lcom/apollographql/apollo/exception/ApolloException;", "exception", "<init>", "(Lz6/A;Ljava/util/UUID;Lz6/A$a;Ljava/util/List;Ljava/util/Map;Lcom/apollographql/apollo/exception/ApolloException;)V", "(Lz6/A;Ljava/util/UUID;)V", "Lz6/w;", "executionContext", "a", "(Lz6/w;)Lz6/e$a;", "c", "(Lz6/A$a;)Lz6/e$a;", "d", "(Ljava/util/List;)Lz6/e$a;", "e", "(Lcom/apollographql/apollo/exception/ApolloException;)Lz6/e$a;", "f", "(Ljava/util/Map;)Lz6/e$a;", "h", "(Ljava/util/UUID;)Lz6/e$a;", "", "isLast", "g", "(Z)Lz6/e$a;", "Lz6/e;", "b", "()Lz6/e;", "Lz6/A;", "Ljava/util/UUID;", "Lz6/A$a;", "Ljava/util/List;", "Ljava/util/Map;", "Lcom/apollographql/apollo/exception/ApolloException;", "Lz6/w;", "Z", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.e$a */
    public static final class a<D extends InterfaceC18449A.a> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC18449A<D> operation;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private UUID requestUuid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private D data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private List<Error> errors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Map<String, ? extends Object> extensions;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private ApolloException exception;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private w executionContext;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isLast;

        public a(InterfaceC18449A<D> operation, UUID requestUuid, D d10, List<Error> list, Map<String, ? extends Object> map, ApolloException apolloException) {
            Intrinsics.j(operation, "operation");
            Intrinsics.j(requestUuid, "requestUuid");
            this.operation = operation;
            this.requestUuid = requestUuid;
            this.data = d10;
            this.errors = list;
            this.extensions = map;
            this.exception = apolloException;
            this.executionContext = w.f172509b;
        }

        public final a<D> a(w executionContext) {
            Intrinsics.j(executionContext, "executionContext");
            this.executionContext = this.executionContext.f(executionContext);
            return this;
        }

        public final C18456e<D> b() {
            InterfaceC18449A<D> interfaceC18449A = this.operation;
            UUID uuid = this.requestUuid;
            D d10 = this.data;
            w wVar = this.executionContext;
            Map<String, ? extends Object> mapK = this.extensions;
            if (mapK == null) {
                mapK = MapsKt.k();
            }
            return new C18456e<>(uuid, interfaceC18449A, d10, this.errors, this.exception, mapK, wVar, this.isLast, null);
        }

        public final a<D> c(D data) {
            this.data = data;
            return this;
        }

        public final a<D> d(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public final a<D> e(ApolloException exception) {
            this.exception = exception;
            return this;
        }

        public final a<D> f(Map<String, ? extends Object> extensions) {
            this.extensions = extensions;
            return this;
        }

        public final a<D> g(boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        public final a<D> h(UUID requestUuid) {
            Intrinsics.j(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC18449A<D> operation, UUID requestUuid) {
            this(operation, requestUuid, null, null, null, null);
            Intrinsics.j(operation, "operation");
            Intrinsics.j(requestUuid, "requestUuid");
        }
    }

    public /* synthetic */ C18456e(UUID uuid, InterfaceC18449A interfaceC18449A, InterfaceC18449A.a aVar, List list, ApolloException apolloException, Map map, w wVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, interfaceC18449A, aVar, list, apolloException, map, wVar, z10);
    }

    private C18456e(UUID uuid, InterfaceC18449A<D> interfaceC18449A, D d10, List<Error> list, ApolloException apolloException, Map<String, ? extends Object> map, w wVar, boolean z10) {
        this.requestUuid = uuid;
        this.operation = interfaceC18449A;
        this.data = d10;
        this.errors = list;
        this.exception = apolloException;
        this.extensions = map;
        this.executionContext = wVar;
        this.isLast = z10;
    }

    public final a<D> a() {
        return new a(this.operation, this.requestUuid, this.data, this.errors, this.extensions, this.exception).a(this.executionContext).g(this.isLast);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ApolloResponse(operationName=");
        sb2.append(this.operation.name());
        sb2.append(", data=");
        D d10 = this.data;
        String strU = BuildConfig.TRAVIS;
        if (d10 == null) {
            str = BuildConfig.TRAVIS;
        } else {
            str = this.operation.name() + ".Data";
        }
        sb2.append(str);
        sb2.append(", errors=");
        List<Error> list = this.errors;
        sb2.append(list != null ? Integer.valueOf(list.size()) : BuildConfig.TRAVIS);
        sb2.append(", exception=");
        ApolloException apolloException = this.exception;
        if (apolloException != null && (strU = Reflection.b(apolloException.getClass()).u()) == null) {
            strU = "true";
        }
        sb2.append(strU);
        sb2.append(')');
        return sb2.toString();
    }
}
