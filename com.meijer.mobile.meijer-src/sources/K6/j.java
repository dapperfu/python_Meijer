package K6;

import gw.C14416e;
import gw.C14419h;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import z6.C18453b;
import z6.C18455d;
import z6.InterfaceC18449A;
import z6.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0002\t&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u0017*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b*\u00020\fH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u000fJ%\u0010\u001f\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001f\u0010\u000fJ-\u0010\"\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0084@¢\u0006\u0004\b$\u0010\nJ\u0010\u0010%\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LK6/j;", "", "LK6/f;", "webSocketConnection", "LK6/j$b;", "listener", "<init>", "(LK6/f;LK6/j$b;)V", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "messageMap", "d", "(Ljava/util/Map;)V", "Lz6/A$a;", "D", "Lz6/d;", "request", "k", "(Lz6/d;)V", "l", "Lgw/h;", "m", "(Ljava/util/Map;)Lgw/h;", "o", "(Ljava/util/Map;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/util/Map;", "i", "j", "LK6/i;", "frameType", "h", "(Ljava/util/Map;LK6/i;)V", "e", "f", "a", "()V", "LK6/f;", "getWebSocketConnection", "()LK6/f;", "LK6/j$b;", "c", "()LK6/j$b;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f webSocketConnection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"LK6/j$a;", "", "LK6/f;", "webSocketConnection", "LK6/j$b;", "listener", "Lmv/O;", "scope", "LK6/j;", "a", "(LK6/f;LK6/j$b;Lmv/O;)LK6/j;", "", "getName", "()Ljava/lang/String;", "name", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        j a(f webSocketConnection, b listener, InterfaceC15783O scope);

        String getName();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"LK6/j$b;", "", "", PreferencesHelper.PREF_ID, "", "payload", "", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "a", "(Ljava/lang/String;)V", "d", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(String id2);

        void b(String id2, Map<String, ? extends Object> payload);

        void c(String id2, Map<String, ? extends Object> payload);

        void d(Map<String, ? extends Object> payload);

        void e(Throwable cause);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {130}, m = "receiveMessageMap")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f16405a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16406b;

        /* renamed from: d, reason: collision with root package name */
        int f16408d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16406b = obj;
            this.f16408d |= Integer.MIN_VALUE;
            return j.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {143}, m = "run$suspendImpl")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f16409a;

        /* renamed from: b, reason: collision with root package name */
        Object f16410b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16411c;

        /* renamed from: e, reason: collision with root package name */
        int f16413e;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16411c = obj;
            this.f16413e |= Integer.MIN_VALUE;
            return j.g(j.this, this);
        }
    }

    public abstract Object b(Continuation<? super Unit> continuation);

    public abstract void d(Map<String, ? extends Object> messageMap);

    public abstract <D extends InterfaceC18449A.a> void k(C18455d<D> request);

    public abstract <D extends InterfaceC18449A.a> void l(C18455d<D> request);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f16399a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f16400b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(f webSocketConnection, b listener) {
        Intrinsics.j(webSocketConnection, "webSocketConnection");
        Intrinsics.j(listener, "listener");
        this.webSocketConnection = webSocketConnection;
        this.listener = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004b -> B:23:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(K6.j r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            boolean r0 = r5 instanceof K6.j.e
            if (r0 == 0) goto L13
            r0 = r5
            K6.j$e r0 = (K6.j.e) r0
            int r1 = r0.f16413e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16413e = r1
            goto L18
        L13:
            K6.j$e r0 = new K6.j$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16411c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f16413e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f16410b
            K6.j r4 = (K6.j) r4
            java.lang.Object r2 = r0.f16409a
            K6.j r2 = (K6.j) r2
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            goto L4c
        L31:
            r4 = move-exception
            goto L56
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r5)
        L3e:
            r0.f16409a = r4     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            r0.f16410b = r4     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            r0.f16413e = r3     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r2 = r4
        L4c:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            r4.d(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            r4 = r2
            goto L3e
        L53:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L56:
            K6.j$b r5 = r2.listener
            r5.e(r4)
            kotlin.Unit r4 = kotlin.Unit.f143329a
            return r4
        L5e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.j.g(K6.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a() {
        this.webSocketConnection.close();
    }

    /* renamed from: c, reason: from getter */
    protected final b getListener() {
        return this.listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0045 -> B:19:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object e(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof K6.j.d
            if (r0 == 0) goto L13
            r0 = r5
            K6.j$d r0 = (K6.j.d) r0
            int r1 = r0.f16408d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16408d = r1
            goto L18
        L13:
            K6.j$d r0 = new K6.j$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16406b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f16408d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f16405a
            K6.j r2 = (K6.j) r2
            kotlin.ResultKt.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
        L38:
            K6.f r5 = r4.webSocketConnection
            r0.f16405a = r4
            r0.f16408d = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r2 = r4
        L46:
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map r5 = r2.n(r5)
            if (r5 == 0) goto L38
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.j.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    protected final void h(Map<String, ? extends Object> messageMap, i frameType) {
        Intrinsics.j(messageMap, "messageMap");
        Intrinsics.j(frameType, "frameType");
        int i10 = c.$EnumSwitchMapping$0[frameType.ordinal()];
        if (i10 == 1) {
            j(messageMap);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i(messageMap);
        }
    }

    protected final void i(Map<String, ? extends Object> messageMap) {
        Intrinsics.j(messageMap, "messageMap");
        this.webSocketConnection.b(m(messageMap));
    }

    protected final void j(Map<String, ? extends Object> messageMap) {
        Intrinsics.j(messageMap, "messageMap");
        this.webSocketConnection.a(o(messageMap));
    }

    protected final C14419h m(Map<String, ? extends Object> map) throws IOException {
        Intrinsics.j(map, "<this>");
        C14416e c14416e = new C14416e();
        D6.b.a(new D6.c(c14416e, null), map);
        return c14416e.P2();
    }

    protected final Map<String, Object> n(String str) {
        Intrinsics.j(str, "<this>");
        try {
            Object objB = C18453b.f172414g.b(new D6.d(new C14416e().G0(str)), p.f172485i);
            if (objB instanceof Map) {
                return (Map) objB;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    protected final String o(Map<String, ? extends Object> map) throws IOException {
        Intrinsics.j(map, "<this>");
        C14416e c14416e = new C14416e();
        D6.b.a(new D6.c(c14416e, null), map);
        return c14416e.n3();
    }

    public Object f(Continuation<? super Unit> continuation) {
        return g(this, continuation);
    }
}
