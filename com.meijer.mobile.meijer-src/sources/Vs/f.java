package Vs;

import B2.InterfaceC2911h;
import F2.f;
import android.content.Context;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LVs/f;", "", "Lct/b;", "aesEncryptionHandler", "<init>", "(Lct/b;)V", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PreferencesHelper.PREF_ID, "LF2/f;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "a", "Lct/b;", "Landroid/content/Context;", "LB2/h;", "b", "Lkotlin/properties/ReadOnlyProperty;", "i", "(Landroid/content/Context;)LB2/h;", "dataStore", "c", "Lkotlin/Lazy;", "h", "()Landroid/content/Context;", "context", "d", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ct.b aesEncryptionHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy context;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f40285e = {Reflection.k(new PropertyReference2Impl(f.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final f.a<String> f40286f = F2.i.g("encryptedDefaultCredentialId");

    /* renamed from: g, reason: collision with root package name */
    private static final Lazy<f> f40287g = LazyKt.b(new Function0() { // from class: Vs.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.k();
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LVs/f$a;", "", "<init>", "()V", "LVs/f;", "instance$delegate", "Lkotlin/Lazy;", "a", "()LVs/f;", "instance", "", "PREFERENCE_NAME", "Ljava/lang/String;", "LF2/f$a;", "PREFERENCE_KEY", "LF2/f$a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final f a() {
            return (f) f.f40287g.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultCredentialIdDataStore$clearDefaultCredentialId$2", f = "DefaultCredentialIdDataStore.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f40291a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40292b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f40292b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((b) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f40291a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f40292b).h(f.f40286f);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultCredentialIdDataStore", f = "DefaultCredentialIdDataStore.kt", l = {42, 43}, m = "getDefaultCredentialId")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40293a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40294b;

        /* renamed from: d, reason: collision with root package name */
        int f40296d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40294b = obj;
            this.f40296d |= Integer.MIN_VALUE;
            return f.this.j(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultCredentialIdDataStore$setDefaultCredentialId$2", f = "DefaultCredentialIdDataStore.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f40297a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40298b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f40300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f40300d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = f.this.new d(this.f40300d, continuation);
            dVar.f40298b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f40297a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f40298b).i(f.f40286f, f.this.aesEncryptionHandler.e(this.f40300d));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(ct.b aesEncryptionHandler) {
        Intrinsics.j(aesEncryptionHandler, "aesEncryptionHandler");
        this.aesEncryptionHandler = aesEncryptionHandler;
        this.dataStore = E2.a.b("com.okta.authfoundation.credential.defaultCredentialIdDataStore", null, null, null, 14, null);
        this.context = LazyKt.b(new Function0() { // from class: Vs.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context g() {
        return Ss.a.f35759a.a();
    }

    private final Context h() {
        return (Context) this.context.getValue();
    }

    private final InterfaceC2911h<F2.f> i(Context context) {
        return (InterfaceC2911h) this.dataStore.getValue(context, f40285e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final f k() {
        return new f(new ct.b(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Vs.f.c
            if (r0 == 0) goto L13
            r0 = r6
            Vs.f$c r0 = (Vs.f.c) r0
            int r1 = r0.f40296d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40296d = r1
            goto L18
        L13:
            Vs.f$c r0 = new Vs.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40294b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40296d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f40293a
            Vs.f r0 = (Vs.f) r0
            kotlin.ResultKt.b(r6)
            goto L69
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.f40293a
            Vs.f r2 = (Vs.f) r2
            kotlin.ResultKt.b(r6)
            goto L51
        L40:
            kotlin.ResultKt.b(r6)
            Qs.a r6 = Qs.C5105a.f31426a
            r0.f40293a = r5
            r0.f40296d = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L50
            goto L67
        L50:
            r2 = r5
        L51:
            android.content.Context r6 = r2.h()
            B2.h r6 = r2.i(r6)
            pv.f r6 = r6.getData()
            r0.f40293a = r2
            r0.f40296d = r3
            java.lang.Object r6 = pv.C16563h.C(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            r0 = r2
        L69:
            F2.f r6 = (F2.f) r6
            r1 = 0
            if (r6 == 0) goto L77
            F2.f$a<java.lang.String> r2 = Vs.f.f40286f
            java.lang.Object r6 = r6.b(r2)
            java.lang.String r6 = (java.lang.String) r6
            goto L78
        L77:
            r6 = r1
        L78:
            if (r6 == 0) goto L8a
            ct.b r0 = r0.aesEncryptionHandler
            java.lang.Object r6 = r0.c(r6)
            boolean r0 = kotlin.Result.g(r6)
            if (r0 == 0) goto L87
            goto L88
        L87:
            r1 = r6
        L88:
            java.lang.String r1 = (java.lang.String) r1
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.f.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(Continuation<? super F2.f> continuation) {
        return F2.j.a(i(h()), new b(null), continuation);
    }

    public final Object l(String str, Continuation<? super F2.f> continuation) {
        return F2.j.a(i(h()), new d(str, null), continuation);
    }
}
