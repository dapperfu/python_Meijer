package mg;

import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import jg.ApplicationInfo;
import jg.X;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.json.JSONObject;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)¨\u0006,"}, d2 = {"Lmg/d;", "Lmg/o;", "Ljg/X;", "timeProvider", "LLf/e;", "firebaseInstallationsApi", "Ljg/b;", "appInfo", "Lmg/a;", "configsFetcher", "Lmg/l;", "settingsCache", "<init>", "(Ljg/X;LLf/e;Ljg/b;Lmg/a;Lmg/l;)V", "", "s", "i", "(Ljava/lang/String;)Ljava/lang/String;", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljg/X;", "b", "LLf/e;", "c", "Ljg/b;", "Lmg/a;", "e", "Lmg/l;", "Lwv/a;", "f", "Lwv/a;", "fetchInProgress", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "g", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mg.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15716d implements o {

    /* renamed from: g, reason: collision with root package name */
    private static final a f151000g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final int f151001h;

    /* renamed from: i, reason: collision with root package name */
    private static final Regex f151002i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lf.e firebaseInstallationsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15713a configsFetcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l settingsCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a fetchInProgress;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmg/d$a;", "", "<init>", "()V", "", "defaultCacheDuration", "I", "a", "()I", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: mg.d$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        public final int a() {
            return C15716d.f151001h;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    /* renamed from: mg.d$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151009a;

        /* renamed from: b, reason: collision with root package name */
        Object f151010b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f151011c;

        /* renamed from: e, reason: collision with root package name */
        int f151013e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151011c = obj;
            this.f151013e |= Integer.MIN_VALUE;
            return C15716d.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: mg.d$c */
    static final class c extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151014a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f151015b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C15716d.this.new c(continuation);
            cVar.f151015b = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f0 A[RETURN] */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Boolean] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C15716d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
            return ((c) create(jSONObject, continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "msg", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mg.d$d, reason: collision with other inner class name */
    static final class C2324d extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151017a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f151018b;

        C2324d(Continuation<? super C2324d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2324d c2324d = new C2324d(continuation);
            c2324d.f151018b = obj;
            return c2324d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C2324d) create(str, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f151017a == 0) {
                ResultKt.b(obj);
                FS.log_e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f151018b));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f151001h = (int) Duration.I(DurationKt.s(24, DurationUnit.f148419g));
        f151002i = new Regex(q2.f93563c);
    }

    public C15716d(X timeProvider, Lf.e firebaseInstallationsApi, ApplicationInfo appInfo, InterfaceC15713a configsFetcher, l settingsCache) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.j(appInfo, "appInfo");
        Intrinsics.j(configsFetcher, "configsFetcher");
        Intrinsics.j(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = wv.g.b(false, 1, null);
    }

    private final String i(String s10) {
        return f151002i.k(s10, "");
    }

    @Override // mg.o
    public Boolean a() {
        return this.settingsCache.c();
    }

    @Override // mg.o
    public Duration b() {
        Integer numE = this.settingsCache.e();
        if (numE == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.o(DurationKt.s(numE.intValue(), DurationUnit.f148417e));
    }

    @Override // mg.o
    public Double c() {
        return this.settingsCache.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C15716d.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
