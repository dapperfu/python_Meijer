package Un;

import Oa.b;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.adobe.marketing.mobile.u;
import com.adobe.marketing.mobile.v;
import com.google.firebase.messaging.S;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17153g;
import yo.MeijerUser;
import yo.k;
import za.C18412h;
import zh.n;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000  2\u00020\u0001:\u0001,BE\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0018J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b!\u0010\u0016J\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0018J\u0015\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00105¨\u00066"}, d2 = {"LUn/b;", "", "Lyo/k;", "userManager", "Lzh/n;", "fcmTokenHelper", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/app/NotificationManager;", "notificationManager", "Lqv/O;", "applicationScope", "LL8/d;", "emarsys", "LUn/f;", "notificationEventHandler", "<init>", "(Lyo/k;Lzh/n;Landroid/content/SharedPreferences;Landroid/app/NotificationManager;Lqv/O;LL8/d;LUn/f;)V", "Lyo/c;", "user", "", "j", "(Lyo/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "()V", "l", "(Lyo/c;)V", "d", "Lcom/google/firebase/messaging/S;", "remoteMessage", "f", "(Lcom/google/firebase/messaging/S;)V", "h", "n", "k", "", "pushToken", "m", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "", "g", "(Landroid/content/Context;Lcom/google/firebase/messaging/S;)Z", "a", "Lyo/k;", "b", "Lzh/n;", "c", "Landroid/content/SharedPreferences;", "Landroid/app/NotificationManager;", "Lqv/O;", "LL8/d;", "LUn/f;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n fcmTokenHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O applicationScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final L8.d emarsys;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f notificationEventHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"LUn/b$a;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "", "value", "c", "(Landroid/content/SharedPreferences;)Ljava/lang/String;", "d", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "emarsysUserApplication", "DATA_KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_EMARSYS_USER_APPLICATION", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Un.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString("com.meijer.mobile.messaging.emarsys.USER_APPLICATION", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(SharedPreferences sharedPreferences, String str) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("com.meijer.mobile.messaging.emarsys.USER_APPLICATION", str);
            editorEdit.apply();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Un.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0796b implements W9.a, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f36202a;

        C0796b(f fVar) {
            this.f36202a = fVar;
        }

        @Override // W9.a
        public final void a(Context p02, String p12, JSONObject jSONObject) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            this.f36202a.a(p02, p12, jSONObject);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W9.a) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(3, this.f36202a, f.class, "handleEvent", "handleEvent(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo/c;", "user", "", "<anonymous>", "(Lyo/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.messaging.emarsys.EmarsysManager$init$3", f = "EmarsysManager.kt", l = {91}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<MeijerUser, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f36203a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36204b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f36204b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
            return ((c) create(meijerUser, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f36203a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                MeijerUser meijerUser = (MeijerUser) this.f36204b;
                b bVar = b.this;
                this.f36204b = meijerUser;
                this.f36203a = 1;
                if (bVar.n(meijerUser, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lyo/c;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.messaging.emarsys.EmarsysManager$init$4", f = "EmarsysManager.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super MeijerUser>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f36206a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36207b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super MeijerUser> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f36207b = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f36206a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f36207b, "Error syncing Emarsys user data", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.messaging.emarsys.EmarsysManager", f = "EmarsysManager.kt", l = {141}, m = "register")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f36208a;

        /* renamed from: b, reason: collision with root package name */
        Object f36209b;

        /* renamed from: c, reason: collision with root package name */
        Object f36210c;

        /* renamed from: d, reason: collision with root package name */
        Object f36211d;

        /* renamed from: e, reason: collision with root package name */
        Object f36212e;

        /* renamed from: f, reason: collision with root package name */
        int f36213f;

        /* renamed from: g, reason: collision with root package name */
        int f36214g;

        /* renamed from: h, reason: collision with root package name */
        int f36215h;

        /* renamed from: i, reason: collision with root package name */
        int f36216i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f36217j;

        /* renamed from: l, reason: collision with root package name */
        int f36219l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36217j = obj;
            this.f36219l |= Integer.MIN_VALUE;
            return b.this.j(null, this);
        }
    }

    public b(k userManager, n fcmTokenHelper, SharedPreferences sharedPreferences, NotificationManager notificationManager, InterfaceC16622O applicationScope, L8.d emarsys, f notificationEventHandler) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(fcmTokenHelper, "fcmTokenHelper");
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        Intrinsics.j(applicationScope, "applicationScope");
        Intrinsics.j(emarsys, "emarsys");
        Intrinsics.j(notificationEventHandler, "notificationEventHandler");
        this.userManager = userManager;
        this.fcmTokenHelper = fcmTokenHelper;
        this.sharedPreferences = sharedPreferences;
        this.notificationManager = notificationManager;
        this.applicationScope = applicationScope;
        this.emarsys = emarsys;
        this.notificationEventHandler = notificationEventHandler;
    }

    private final void d() throws IllegalArgumentException {
        uw.a.INSTANCE.a("Clearing Emarsys Contact data", new Object[0]);
        L8.d.e(null, 1, null);
    }

    private final void e() {
        uw.a.INSTANCE.a("Clearing Emarsys push token", new Object[0]);
        L8.d.g().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(MeijerUser it) {
        Intrinsics.j(it, "it");
        return it.getExternalShopperId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(yo.MeijerUser r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Un.b.e
            if (r0 == 0) goto L13
            r0 = r8
            Un.b$e r0 = (Un.b.e) r0
            int r1 = r0.f36219l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36219l = r1
            goto L18
        L13:
            Un.b$e r0 = new Un.b$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36217j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f36219l
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r7 = r0.f36212e
            Un.b r7 = (Un.b) r7
            java.lang.Object r7 = r0.f36211d
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f36210c
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f36209b
            Un.b r7 = (Un.b) r7
            java.lang.Object r7 = r0.f36208a
            yo.c r7 = (yo.MeijerUser) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3e
            goto L97
        L3e:
            r7 = move-exception
            goto L9c
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L48:
            kotlin.ResultKt.b(r8)
            Un.b$a r8 = Un.b.INSTANCE
            android.content.SharedPreferences r2 = r6.sharedPreferences
            java.lang.String r2 = Un.b.Companion.a(r8, r2)
            if (r2 == 0) goto L66
            O8.b r5 = L8.d.f()
            java.lang.String r5 = r5.a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r5)
            if (r2 != 0) goto L66
            r6.k()
        L66:
            android.content.SharedPreferences r2 = r6.sharedPreferences
            O8.b r5 = L8.d.f()
            java.lang.String r5 = r5.a()
            Un.b.Companion.b(r8, r2, r5)
            r6.l(r7)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
            zh.n r8 = b(r6)     // Catch: java.lang.Exception -> L3e
            r0.f36208a = r7     // Catch: java.lang.Exception -> L3e
            r0.f36209b = r6     // Catch: java.lang.Exception -> L3e
            r0.f36210c = r0     // Catch: java.lang.Exception -> L3e
            r0.f36211d = r0     // Catch: java.lang.Exception -> L3e
            r0.f36212e = r6     // Catch: java.lang.Exception -> L3e
            r0.f36213f = r4     // Catch: java.lang.Exception -> L3e
            r0.f36214g = r4     // Catch: java.lang.Exception -> L3e
            r0.f36215h = r4     // Catch: java.lang.Exception -> L3e
            r0.f36216i = r4     // Catch: java.lang.Exception -> L3e
            r0.f36219l = r3     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Exception -> L3e
            if (r8 != r1) goto L97
            return r1
        L97:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3e
            goto Lad
        L9c:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            qv.E0.i(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        Lad:
            boolean r8 = kotlin.Result.h(r7)
            if (r8 == 0) goto Lb9
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r6.m(r8)
        Lb9:
            java.lang.Throwable r7 = kotlin.Result.e(r7)
            if (r7 == 0) goto Lc8
            uw.a$a r8 = uw.a.INSTANCE
            java.lang.String r0 = "Error getting FCM token"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r8.f(r7, r0, r1)
        Lc8:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Un.b.j(yo.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void l(MeijerUser user) throws IllegalArgumentException {
        uw.a.INSTANCE.a("Setting Emarsys Contact data", new Object[0]);
        L8.d.o(428, user.getExternalShopperId(), null, 4, null);
    }

    public final boolean g(Context context, S remoteMessage) {
        Intrinsics.j(context, "context");
        Intrinsics.j(remoteMessage, "remoteMessage");
        Map<String, String> mapB = remoteMessage.B();
        Intrinsics.i(mapB, "getData(...)");
        boolean zK = C18412h.k(mapB);
        if (Build.VERSION.SDK_INT >= 26 && zK) {
            f(remoteMessage);
        }
        return Pa.b.b(context, remoteMessage);
    }

    public final void k() throws IllegalArgumentException {
        INSTANCE.d(this.sharedPreferences, null);
        d();
        e();
    }

    public final void m(String pushToken) {
        Intrinsics.j(pushToken, "pushToken");
        uw.a.INSTANCE.a("Setting Emarsys push token", new Object[0]);
        b.a.a(L8.d.g(), pushToken, null, 2, null);
    }

    private final void f(S remoteMessage) {
        NotificationManager notificationManager;
        String str = remoteMessage.B().get("notification.channel_id");
        if (str != null && (notificationManager = this.notificationManager) != null) {
            v.a();
            notificationManager.createNotificationChannel(u.a(str, Fk.e.g(StringsKt.Q(str, "_", " ", false, 4, null)), 3));
        }
    }

    public final void h() {
        L8.d.g().a(new C0796b(this.notificationEventHandler));
        C17154h.J(C17154h.g(C17154h.O(C17154h.t(this.userManager.E(), new Function1() { // from class: Un.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.i((MeijerUser) obj);
            }
        }), new c(null)), new d(null)), this.applicationScope);
    }

    public final Object n(MeijerUser meijerUser, Continuation<? super Unit> continuation) throws IllegalArgumentException {
        if (!StringsKt.r0(meijerUser.getExternalShopperId())) {
            Object objJ = j(meijerUser, continuation);
            if (objJ == IntrinsicsKt.f()) {
                return objJ;
            }
            return Unit.f142422a;
        }
        k();
        return Unit.f142422a;
    }
}
