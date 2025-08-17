package Vs;

import Iv.AbstractC3761b;
import Vs.h;
import Vs.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.a;
import at.C6154b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00132\u001e\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00110\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"LVs/n;", "LVs/h;", "LIv/b;", "json", "Lkotlin/coroutines/CoroutineContext;", "dispatcher", "Lat/b;", "eventCoordinator", "Landroid/content/Context;", "context", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "<init>", "(LIv/b;Lkotlin/coroutines/CoroutineContext;Lat/b;Landroid/content/Context;Landroid/security/keystore/KeyGenParameterSpec;)V", "Lkotlin/Function1;", "", "LVs/h$a;", "", "block", "", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LIv/b;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "Landroid/content/Context;", "applicationContext", "", "d", "Ljava/lang/Object;", "accessLock", "Landroid/content/SharedPreferences;", "e", "Lkotlin/Lazy;", "i", "()Landroid/content/SharedPreferences;", "sharedPreferences", "f", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class n implements h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3761b json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object accessLock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPreferences;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LVs/n$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "Landroid/content/SharedPreferences;", "a", "(Landroid/content/Context;Landroid/security/keystore/KeyGenParameterSpec;)Landroid/content/SharedPreferences;", "", "PREFERENCE_KEY", "Ljava/lang/String;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SharedPreferences a(Context applicationContext, KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
            Intrinsics.j(applicationContext, "applicationContext");
            Intrinsics.j(keyGenParameterSpec, "keyGenParameterSpec");
            String strC = androidx.security.crypto.e.c(keyGenParameterSpec);
            Intrinsics.i(strC, "getOrCreate(...)");
            SharedPreferences sharedPreferencesB = androidx.security.crypto.a.b("com.okta.authfoundation.storage", strC, applicationContext, a.d.AES256_SIV, a.e.AES256_GCM);
            Intrinsics.i(sharedPreferencesB, "create(...)");
            return sharedPreferencesB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.SharedPreferencesTokenStorage$accessStorage$2", f = "LegacyTokenStorage.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37970a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<List<h.a>, List<h.a>> f37972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super List<h.a>, ? extends List<h.a>> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37972c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new b(this.f37972c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Boolean> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<h.a> listB;
            Boolean boolA;
            IntrinsicsKt.f();
            if (this.f37970a == 0) {
                ResultKt.b(obj);
                Object obj2 = n.this.accessLock;
                n nVar = n.this;
                Function1<List<h.a>, List<h.a>> function1 = this.f37972c;
                synchronized (obj2) {
                    try {
                        String string = nVar.i().getString("com.okta.authfoundation.storage_entries", null);
                        if (string == null) {
                            listB = new ArrayList<>();
                        } else {
                            listB = ((o) nVar.json.b(o.INSTANCE.serializer(), string)).b();
                        }
                        List<h.a> listInvoke = function1.invoke(listB);
                        AbstractC3761b abstractC3761b = nVar.json;
                        o.Companion companion = o.INSTANCE;
                        String strC = abstractC3761b.c(companion.serializer(), companion.a(listInvoke));
                        SharedPreferences.Editor editorEdit = nVar.i().edit();
                        editorEdit.putString("com.okta.authfoundation.storage_entries", strC);
                        boolA = Boxing.a(editorEdit.commit());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return boolA;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.SharedPreferencesTokenStorage", f = "LegacyTokenStorage.kt", l = {157}, m = "entries")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37973a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37974b;

        /* renamed from: d, reason: collision with root package name */
        int f37976d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37974b = obj;
            this.f37976d |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(AbstractC3761b json, CoroutineContext dispatcher, final C6154b eventCoordinator, Context context, final KeyGenParameterSpec keyGenParameterSpec) {
        Intrinsics.j(json, "json");
        Intrinsics.j(dispatcher, "dispatcher");
        Intrinsics.j(eventCoordinator, "eventCoordinator");
        Intrinsics.j(context, "context");
        Intrinsics.j(keyGenParameterSpec, "keyGenParameterSpec");
        this.json = json;
        this.dispatcher = dispatcher;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.accessLock = new Object();
        this.sharedPreferences = LazyKt.b(new Function0() { // from class: Vs.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.j(this.f37961a, keyGenParameterSpec, eventCoordinator);
            }
        });
    }

    private final Object g(Function1<? super List<h.a>, ? extends List<h.a>> function1, Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(this.dispatcher, new b(function1, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List h(Ref.ObjectRef objectRef, List existingEntries) {
        Intrinsics.j(existingEntries, "existingEntries");
        objectRef.f142835a = existingEntries;
        return existingEntries;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences i() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences j(n nVar, KeyGenParameterSpec keyGenParameterSpec, C6154b c6154b) throws Exception {
        try {
            return INSTANCE.a(nVar.applicationContext, keyGenParameterSpec);
        } catch (Exception e10) {
            Ws.h hVar = new Ws.h(e10, true);
            c6154b.a(hVar);
            if (!hVar.getShouldClearStorageAndTryAgain()) {
                throw e10;
            }
            nVar.applicationContext.getSharedPreferences("com.okta.authfoundation.storage", 0).edit().clear().commit();
            return INSTANCE.a(nVar.applicationContext, keyGenParameterSpec);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
    @Override // Vs.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super java.util.List<Vs.h.a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Vs.n.c
            if (r0 == 0) goto L13
            r0 = r5
            Vs.n$c r0 = (Vs.n.c) r0
            int r1 = r0.f37976d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37976d = r1
            goto L18
        L13:
            Vs.n$c r0 = new Vs.n$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37974b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37976d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f37973a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.b(r5)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
            r5.f142835a = r2
            Vs.l r2 = new Vs.l
            r2.<init>()
            r0.f37973a = r5
            r0.f37976d = r3
            java.lang.Object r0 = r4.g(r2, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            r0 = r5
        L54:
            T r5 = r0.f142835a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.n.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
