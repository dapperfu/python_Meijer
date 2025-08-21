package mg;

import android.net.Uri;
import io.constructor.BuildConfig;
import java.net.URL;
import java.util.Map;
import jg.ApplicationInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.InterfaceC15783O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0015B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJl\u0010\u0015\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmg/e;", "Lmg/a;", "Ljg/b;", "appInfo", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "<init>", "(Ljg/b;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/net/URL;", "c", "()Ljava/net/URL;", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljg/b;", "b", "Lkotlin/coroutines/CoroutineContext;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: mg.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15717e implements InterfaceC15713a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext blockingDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: mg.e$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151022a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f151024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<JSONObject, Continuation<? super Unit>, Object> f151025d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> f151026e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f151024c = map;
            this.f151025d = function2;
            this.f151026e = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15717e.this.new b(this.f151024c, this.f151025d, this.f151026e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f151022a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.b(r8)
                goto Le7
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L23
                goto Le7
            L23:
                r8 = move-exception
                goto Ld2
            L26:
                kotlin.ResultKt.b(r8)
                mg.e r8 = mg.C15717e.this     // Catch: java.lang.Exception -> L23
                java.net.URL r8 = mg.C15717e.b(r8)     // Catch: java.lang.Exception -> L23
                java.net.URLConnection r8 = r8.openConnection()     // Catch: java.lang.Exception -> L23
                java.net.URLConnection r8 = com.fullstory.FS.urlconnection_wrapInstance(r8)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
                kotlin.jvm.internal.Intrinsics.h(r8, r1)     // Catch: java.lang.Exception -> L23
                javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "GET"
                r8.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "Accept"
                java.lang.String r5 = "application/json"
                r8.setRequestProperty(r1, r5)     // Catch: java.lang.Exception -> L23
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.f151024c     // Catch: java.lang.Exception -> L23
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
            L54:
                boolean r5 = r1.hasNext()     // Catch: java.lang.Exception -> L23
                if (r5 == 0) goto L70
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Exception -> L23
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> L23
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> L23
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
                java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L23
                r8.setRequestProperty(r6, r5)     // Catch: java.lang.Exception -> L23
                goto L54
            L70:
                int r1 = r8.getResponseCode()     // Catch: java.lang.Exception -> L23
                r5 = 200(0xc8, float:2.8E-43)
                if (r1 != r5) goto Lb6
                java.io.InputStream r8 = r8.getInputStream()     // Catch: java.lang.Exception -> L23
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
                r3.<init>(r8)     // Catch: java.lang.Exception -> L23
                r1.<init>(r3)     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r3.<init>()     // Catch: java.lang.Exception -> L23
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L23
                r5.<init>()     // Catch: java.lang.Exception -> L23
            L90:
                java.lang.String r6 = r1.readLine()     // Catch: java.lang.Exception -> L23
                r5.f143742a = r6     // Catch: java.lang.Exception -> L23
                if (r6 == 0) goto L9c
                r3.append(r6)     // Catch: java.lang.Exception -> L23
                goto L90
            L9c:
                r1.close()     // Catch: java.lang.Exception -> L23
                r8.close()     // Catch: java.lang.Exception -> L23
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L23
                r8.<init>(r1)     // Catch: java.lang.Exception -> L23
                kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.f151025d     // Catch: java.lang.Exception -> L23
                r7.f151022a = r4     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r1.invoke(r8, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le7
                goto Le6
            Lb6:
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r8 = r7.f151026e     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r4.<init>()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = "Bad response code: "
                r4.append(r5)     // Catch: java.lang.Exception -> L23
                r4.append(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
                r7.f151022a = r3     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r8.invoke(r1, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le7
                goto Le6
            Ld2:
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.f151026e
                java.lang.String r3 = r8.getMessage()
                if (r3 != 0) goto Lde
                java.lang.String r3 = r8.toString()
            Lde:
                r7.f151022a = r2
                java.lang.Object r8 = r1.invoke(r3, r7)
                if (r8 != r0) goto Le7
            Le6:
                return r0
            Le7:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C15717e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C15717e(ApplicationInfo appInfo, @cf.b CoroutineContext blockingDispatcher) {
        Intrinsics.j(appInfo, "appInfo");
        Intrinsics.j(blockingDispatcher, "blockingDispatcher");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(BuildConfig.SERVICE_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // mg.InterfaceC15713a
    public Object a(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.blockingDispatcher, new b(map, function2, function22, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }
}
