package Vs;

import Qs.p;
import Vs.q;
import androidx.biometric.e;
import com.medallia.digital.mobilesdk.l3;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.credential.RevokeAllException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16638f;
import qv.C16646j;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 C2\u00020\u0001:\u0003\"\u0011&B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\rJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\rJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086@¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R*\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010B\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010<\u0012\u0004\bA\u0010\u0012\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R<\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00108\"\u0004\bD\u0010:¨\u0006E"}, d2 = {"LVs/b;", "", "LVs/p;", "token", "Lcom/okta/authfoundation/client/h;", "client", "", "", "tags", "<init>", "(LVs/p;Lcom/okta/authfoundation/client/h;Ljava/util/Map;)V", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "m", "(LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()V", "d", "l", "n", "Lbt/b;", "i", "()Lbt/b;", "e", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/okta/authfoundation/client/h;", "f", "()Lcom/okta/authfoundation/client/h;", "b", "Ljava/lang/String;", "g", PreferencesHelper.PREF_ID, "Lct/e;", "Lct/e;", "refreshCoalescingOrchestrator", "Ltv/B;", "Ltv/B;", "tokenFlow", "value", "LVs/p;", "getToken", "()LVs/p;", "setToken$auth_foundation_release", "(LVs/p;)V", "Ljava/util/Map;", "get_tags$auth_foundation_release", "()Ljava/util/Map;", "set_tags$auth_foundation_release", "(Ljava/util/Map;)V", "_tags", "Z", "isDeleted$auth_foundation_release", "()Z", "setDeleted$auth_foundation_release", "(Z)V", "isDeleted$auth_foundation_release$annotations", "isDeleted", "h", "setTags", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.okta.authfoundation.client.h client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ct.e<OAuth2ClientResult<p>> refreshCoalescingOrchestrator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<p> tokenFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p token;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> _tags;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDeleted;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LVs/b$a;", "", "", "b", "()I", "userAuthenticationTimeout", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        /* renamed from: b */
        int getUserAuthenticationTimeout();
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR(\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"LVs/b$b;", "", "<init>", "()V", "LVs/c;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/b;", "d", "credential", "", "f", "(LVs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PreferencesHelper.PREF_ID, "Landroidx/biometric/e$d;", "promptInfo", "i", "(Ljava/lang/String;Landroidx/biometric/e$d;)LVs/b;", "k", "(Ljava/lang/String;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/p;", "token", "", "tags", "LVs/b$c;", "security", "g", "(LVs/p;Ljava/util/Map;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/f;", "e", "()LVs/f;", "defaultCredentialIdDataStore", "value", "c", "()LVs/b;", "setDefault", "(LVs/b;)V", "default", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Vs.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LVs/b;", "<anonymous>", "(Lqv/O;)LVs/b;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion$default$1", f = "Credential.kt", l = {157}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Vs.b$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f37781a;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super b> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f37781a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Vs.f fVarE = b.INSTANCE.e();
                    this.f37781a = 1;
                    obj = fVarE.j(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return Companion.j(b.INSTANCE, str, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion", f = "Credential.kt", l = {165, 165}, m = "getDefaultAsync")
        /* renamed from: Vs.b$b$b, reason: collision with other inner class name */
        static final class C0814b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37782a;

            /* renamed from: c, reason: collision with root package name */
            int f37784c;

            C0814b(Continuation<? super C0814b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f37782a = obj;
                this.f37784c |= Integer.MIN_VALUE;
                return Companion.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion", f = "Credential.kt", l = {174, 180}, m = "setDefaultAsync")
        /* renamed from: Vs.b$b$c */
        static final class c extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f37785a;

            /* renamed from: b, reason: collision with root package name */
            Object f37786b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37787c;

            /* renamed from: e, reason: collision with root package name */
            int f37789e;

            c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f37787c = obj;
                this.f37789e |= Integer.MIN_VALUE;
                return Companion.this.f(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion", f = "Credential.kt", l = {324, 324}, m = "storeAsync")
        /* renamed from: Vs.b$b$d */
        static final class d extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f37790a;

            /* renamed from: b, reason: collision with root package name */
            Object f37791b;

            /* renamed from: c, reason: collision with root package name */
            Object f37792c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f37793d;

            /* renamed from: f, reason: collision with root package name */
            int f37795f;

            d(Continuation<? super d> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f37793d = obj;
                this.f37795f |= Integer.MIN_VALUE;
                return Companion.this.g(null, null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LVs/b;", "<anonymous>", "(Lqv/O;)LVs/b;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion$with$1", f = "Credential.kt", l = {238}, m = "invokeSuspend")
        /* renamed from: Vs.b$b$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f37796a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f37797b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e.d f37798c;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVs/b;", "<anonymous>", "()LVs/b;"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion$with$1$1", f = "Credential.kt", l = {239, 239}, m = "invokeSuspend")
            /* renamed from: Vs.b$b$e$a */
            static final class a extends SuspendLambda implements Function1<Continuation<? super b>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f37799a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f37800b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ e.d f37801c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str, e.d dVar, Continuation<? super a> continuation) {
                    super(1, continuation);
                    this.f37800b = str;
                    this.f37801c = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new a(this.f37800b, this.f37801c, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation<? super b> continuation) {
                    return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f37799a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                ResultKt.b(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        Companion companion = b.INSTANCE;
                        this.f37799a = 1;
                        obj = companion.b(this);
                        if (obj != objF) {
                        }
                        return objF;
                    }
                    String str = this.f37800b;
                    e.d dVar = this.f37801c;
                    this.f37799a = 2;
                    Object objE = ((Vs.c) obj).e(str, dVar, this);
                    if (objE == objF) {
                        return objF;
                    }
                    return objE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, e.d dVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f37797b = str;
                this.f37798c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f37797b, this.f37798c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super b> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f37796a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                q.Companion aVar = q.INSTANCE;
                a aVar2 = new a(this.f37797b, this.f37798c, null);
                this.f37796a = 1;
                Object objC = aVar.c(aVar2, this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVs/b;", "<anonymous>", "()LVs/b;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$Companion$withAsync$2", f = "Credential.kt", l = {l3.f92484c, l3.f92484c}, m = "invokeSuspend")
        /* renamed from: Vs.b$b$f */
        static final class f extends SuspendLambda implements Function1<Continuation<? super b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f37802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f37803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e.d f37804c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str, e.d dVar, Continuation<? super f> continuation) {
                super(1, continuation);
                this.f37803b = str;
                this.f37804c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new f(this.f37803b, this.f37804c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super b> continuation) {
                return ((f) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f37802a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    Companion companion = b.INSTANCE;
                    this.f37802a = 1;
                    obj = companion.b(this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                String str = this.f37803b;
                e.d dVar = this.f37804c;
                this.f37802a = 2;
                Object objE = ((Vs.c) obj).e(str, dVar, this);
                if (objE == objF) {
                    return objF;
                }
                return objE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Vs.f e() {
            return Vs.f.INSTANCE.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object h(Companion companion, p pVar, Map map, c cVar, Continuation continuation, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = MapsKt.k();
            }
            if ((i10 & 4) != 0) {
                cVar = c.INSTANCE.b();
            }
            return companion.g(pVar, map, cVar, continuation);
        }

        public static /* synthetic */ b j(Companion companion, String str, e.d dVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                dVar = c.INSTANCE.a();
            }
            return companion.i(str, dVar);
        }

        public static /* synthetic */ Object l(Companion companion, String str, e.d dVar, Continuation continuation, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                dVar = c.INSTANCE.a();
            }
            return companion.k(str, dVar, continuation);
        }

        public final Object b(Continuation<? super Vs.c> continuation) {
            return Vs.c.f37831d.a(continuation);
        }

        public final b c() {
            return (b) C16646j.b(null, new a(null), 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r8 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object d(kotlin.coroutines.Continuation<? super Vs.b> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof Vs.b.Companion.C0814b
                if (r0 == 0) goto L14
                r0 = r8
                Vs.b$b$b r0 = (Vs.b.Companion.C0814b) r0
                int r1 = r0.f37784c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f37784c = r1
            L12:
                r4 = r0
                goto L1a
            L14:
                Vs.b$b$b r0 = new Vs.b$b$b
                r0.<init>(r8)
                goto L12
            L1a:
                java.lang.Object r8 = r4.f37782a
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f37784c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L36
                if (r1 != r2) goto L2e
                kotlin.ResultKt.b(r8)
                goto L5d
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L36:
                kotlin.ResultKt.b(r8)
                goto L4a
            L3a:
                kotlin.ResultKt.b(r8)
                Vs.f r8 = r7.e()
                r4.f37784c = r3
                java.lang.Object r8 = r8.j(r4)
                if (r8 != r0) goto L4a
                goto L5c
            L4a:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L60
                Vs.b$b r1 = Vs.b.INSTANCE
                r4.f37784c = r2
                r3 = 0
                r5 = 2
                r6 = 0
                r2 = r8
                java.lang.Object r8 = l(r1, r2, r3, r4, r5, r6)
                if (r8 != r0) goto L5d
            L5c:
                return r0
            L5d:
                Vs.b r8 = (Vs.b) r8
                return r8
            L60:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.b.Companion.d(kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r7.l(r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        
            if (r6.f(r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(Vs.b r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Vs.b.Companion.c
                if (r0 == 0) goto L13
                r0 = r7
                Vs.b$b$c r0 = (Vs.b.Companion.c) r0
                int r1 = r0.f37789e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37789e = r1
                goto L18
            L13:
                Vs.b$b$c r0 = new Vs.b$b$c
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37787c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f37789e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r7)
                goto L7f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f37786b
                Vs.b r6 = (Vs.b) r6
                java.lang.Object r0 = r0.f37785a
                Vs.b$b r0 = (Vs.b.Companion) r0
                kotlin.ResultKt.b(r7)
                goto L5c
            L40:
                kotlin.ResultKt.b(r7)
                if (r6 == 0) goto L6d
                Vs.b$b r7 = Vs.b.INSTANCE
                Vs.f r7 = r7.e()
                java.lang.String r2 = r6.getId()
                r0.f37785a = r5
                r0.f37786b = r6
                r0.f37789e = r4
                java.lang.Object r7 = r7.l(r2, r0)
                if (r7 != r1) goto L5c
                goto L7e
            L5c:
                Qs.p r7 = Qs.p.f31384a
                at.b r7 = r7.A()
                Ws.g r0 = new Ws.g
                r0.<init>(r6)
                r7.a(r0)
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            L6d:
                Vs.f r6 = r5.e()
                r7 = 0
                r0.f37785a = r7
                r0.f37786b = r7
                r0.f37789e = r3
                java.lang.Object r6 = r6.f(r0)
                if (r6 != r1) goto L7f
            L7e:
                return r1
            L7f:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.b.Companion.f(Vs.b, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object g(Vs.p r6, java.util.Map<java.lang.String, java.lang.String> r7, Vs.b.c r8, kotlin.coroutines.Continuation<? super Vs.b> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof Vs.b.Companion.d
                if (r0 == 0) goto L13
                r0 = r9
                Vs.b$b$d r0 = (Vs.b.Companion.d) r0
                int r1 = r0.f37795f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37795f = r1
                goto L18
            L13:
                Vs.b$b$d r0 = new Vs.b$b$d
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f37793d
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f37795f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r9)
                return r9
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f37792c
                r8 = r6
                Vs.b$c r8 = (Vs.b.c) r8
                java.lang.Object r6 = r0.f37791b
                r7 = r6
                java.util.Map r7 = (java.util.Map) r7
                java.lang.Object r6 = r0.f37790a
                Vs.p r6 = (Vs.p) r6
                kotlin.ResultKt.b(r9)
                goto L58
            L46:
                kotlin.ResultKt.b(r9)
                r0.f37790a = r6
                r0.f37791b = r7
                r0.f37792c = r8
                r0.f37795f = r4
                java.lang.Object r9 = r5.b(r0)
                if (r9 != r1) goto L58
                goto L69
            L58:
                Vs.c r9 = (Vs.c) r9
                r2 = 0
                r0.f37790a = r2
                r0.f37791b = r2
                r0.f37792c = r2
                r0.f37795f = r3
                java.lang.Object r6 = r9.d(r6, r7, r8, r0)
                if (r6 != r1) goto L6a
            L69:
                return r1
            L6a:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.b.Companion.g(Vs.p, java.util.Map, Vs.b$c, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final b i(String id2, e.d promptInfo) {
            Intrinsics.j(id2, "id");
            return (b) C16646j.b(null, new e(id2, promptInfo, null), 1, null);
        }

        public final Object k(String str, e.d dVar, Continuation<? super b> continuation) {
            return q.INSTANCE.b(new f(str, dVar, null), continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0004\u0006\u0003\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"LVs/b$c;", "", "", "a", "()Ljava/lang/String;", "keyAlias", "d", "b", "c", "LVs/b$c$a;", "LVs/b$c$b;", "LVs/b$c$d;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f37810a;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"LVs/b$c$a;", "LVs/b$c;", "LVs/b$a;", "", "userAuthenticationTimeout", "", "keyAlias", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/String;", "a", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.b$c$a, reason: from toString */
        public static final /* data */ class BiometricStrong implements c, a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int userAuthenticationTimeout;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String keyAlias;

            /* JADX WARN: Multi-variable type inference failed */
            public BiometricStrong() {
                this(0, null, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricStrong)) {
                    return false;
                }
                BiometricStrong biometricStrong = (BiometricStrong) other;
                return this.userAuthenticationTimeout == biometricStrong.userAuthenticationTimeout && Intrinsics.e(this.keyAlias, biometricStrong.keyAlias);
            }

            public BiometricStrong(int i10, String keyAlias) {
                Intrinsics.j(keyAlias, "keyAlias");
                this.userAuthenticationTimeout = i10;
                this.keyAlias = keyAlias;
                if (getUserAuthenticationTimeout() < 0) {
                    throw new IllegalArgumentException("userAuthenticationTimeout must be >= 0");
                }
            }

            @Override // Vs.b.c
            /* renamed from: a, reason: from getter */
            public String getKeyAlias() {
                return this.keyAlias;
            }

            @Override // Vs.b.a
            /* renamed from: b, reason: from getter */
            public int getUserAuthenticationTimeout() {
                return this.userAuthenticationTimeout;
            }

            public int hashCode() {
                return (Integer.hashCode(this.userAuthenticationTimeout) * 31) + this.keyAlias.hashCode();
            }

            public String toString() {
                return "BiometricStrong(userAuthenticationTimeout=" + this.userAuthenticationTimeout + ", keyAlias=" + this.keyAlias + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ BiometricStrong(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                i10 = (i11 & 1) != 0 ? 5 : i10;
                if ((i11 & 2) != 0) {
                    str = p.a.f31399a.b() + ".biometricStrong.timeout." + i10;
                }
                this(i10, str);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"LVs/b$c$b;", "LVs/b$c;", "LVs/b$a;", "", "userAuthenticationTimeout", "", "keyAlias", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/String;", "a", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.b$c$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class BiometricStrongOrDeviceCredential implements c, a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int userAuthenticationTimeout;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String keyAlias;

            /* JADX WARN: Multi-variable type inference failed */
            public BiometricStrongOrDeviceCredential() {
                this(0, null, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricStrongOrDeviceCredential)) {
                    return false;
                }
                BiometricStrongOrDeviceCredential biometricStrongOrDeviceCredential = (BiometricStrongOrDeviceCredential) other;
                return this.userAuthenticationTimeout == biometricStrongOrDeviceCredential.userAuthenticationTimeout && Intrinsics.e(this.keyAlias, biometricStrongOrDeviceCredential.keyAlias);
            }

            public BiometricStrongOrDeviceCredential(int i10, String keyAlias) {
                Intrinsics.j(keyAlias, "keyAlias");
                this.userAuthenticationTimeout = i10;
                this.keyAlias = keyAlias;
                if (getUserAuthenticationTimeout() < 0) {
                    throw new IllegalArgumentException("userAuthenticationTimeout must be >= 0");
                }
            }

            @Override // Vs.b.c
            /* renamed from: a, reason: from getter */
            public String getKeyAlias() {
                return this.keyAlias;
            }

            @Override // Vs.b.a
            /* renamed from: b, reason: from getter */
            public int getUserAuthenticationTimeout() {
                return this.userAuthenticationTimeout;
            }

            public int hashCode() {
                return (Integer.hashCode(this.userAuthenticationTimeout) * 31) + this.keyAlias.hashCode();
            }

            public String toString() {
                return "BiometricStrongOrDeviceCredential(userAuthenticationTimeout=" + this.userAuthenticationTimeout + ", keyAlias=" + this.keyAlias + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ BiometricStrongOrDeviceCredential(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                i10 = (i11 & 1) != 0 ? 5 : i10;
                if ((i11 & 2) != 0) {
                    str = p.a.f31399a.b() + ".biometricStrongOrDeviceCredential.timeout." + i10;
                }
                this(i10, str);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LVs/b$c$c;", "", "<init>", "()V", "LVs/b$c;", "b", "LVs/b$c;", "_standard", "Landroidx/biometric/e$d;", "c", "Landroidx/biometric/e$d;", "a", "()Landroidx/biometric/e$d;", "setPromptInfo", "(Landroidx/biometric/e$d;)V", "promptInfo", "value", "()LVs/b$c;", "setStandard", "(LVs/b$c;)V", "standard", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.b$c$c, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f37810a = new Companion();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static c _standard;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static e.d promptInfo;

            public final e.d a() {
                return promptInfo;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final c b() {
                c cVar = _standard;
                if (cVar != null) {
                    return cVar;
                }
                return new Default(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LVs/b$c$d;", "LVs/b$c;", "", "keyAlias", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.b$c$d, reason: from toString */
        public static final /* data */ class Default implements c {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String keyAlias;

            /* JADX WARN: Multi-variable type inference failed */
            public Default() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Default) && Intrinsics.e(this.keyAlias, ((Default) other).keyAlias);
            }

            public Default(String keyAlias) {
                Intrinsics.j(keyAlias, "keyAlias");
                this.keyAlias = keyAlias;
            }

            @Override // Vs.b.c
            /* renamed from: a, reason: from getter */
            public String getKeyAlias() {
                return this.keyAlias;
            }

            public int hashCode() {
                return this.keyAlias.hashCode();
            }

            public String toString() {
                return "Default(keyAlias=" + this.keyAlias + ")";
            }

            public /* synthetic */ Default(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? p.a.f31399a.b() : str);
            }
        }

        /* renamed from: a */
        String getKeyAlias();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$delete$1", f = "Credential.kt", l = {441}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37814a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f37814a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                b bVar = b.this;
                this.f37814a = 1;
                if (bVar.d(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.Credential", f = "Credential.kt", l = {453, 454, 457, 458, 458}, m = "deleteAsync")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37816a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37817b;

        /* renamed from: d, reason: collision with root package name */
        int f37819d;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37817b = obj;
            this.f37819d |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Continuation<? super OAuth2ClientResult<p>>, Object>, SuspendFunction {
        f(Object obj) {
            super(1, obj, b.class, "performRealRefresh", "performRealRefresh(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super OAuth2ClientResult<p>> continuation) {
            return ((b) this.receiver).j(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.Credential", f = "Credential.kt", l = {423}, m = "replaceToken$auth_foundation_release")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37820a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37821b;

        /* renamed from: d, reason: collision with root package name */
        int f37823d;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37821b = obj;
            this.f37823d |= Integer.MIN_VALUE;
            return b.this.m(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "", "<anonymous>", "(Lqv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$revokeAllTokens$4", f = "Credential.kt", l = {507}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OAuth2ClientResult<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37824a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<i, p> f37826c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f37827d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqv/O;", "Lkotlin/Pair;", "LVs/i;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<anonymous>", "(Lqv/O;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.credential.Credential$revokeAllTokens$4$exceptionPairs$1$1", f = "Credential.kt", l = {HttpResponseStatus.ERROR_BAD_GATEWAY}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Pair<? extends i, ? extends Exception>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f37828a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f37829b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<i, p> f37830c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, Map.Entry<? extends i, p> entry, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f37829b = bVar;
                this.f37830c = entry;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f37829b, this.f37830c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Pair<? extends i, ? extends Exception>> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                OAuth2ClientResult.Error error;
                Exception exception;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f37828a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    com.okta.authfoundation.client.h client = this.f37829b.getClient();
                    i key = this.f37830c.getKey();
                    p value = this.f37830c.getValue();
                    this.f37828a = 1;
                    obj = client.q(key, value, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                if (obj instanceof OAuth2ClientResult.Error) {
                    error = (OAuth2ClientResult.Error) obj;
                } else {
                    error = null;
                }
                if (error == null || (exception = error.getException()) == null) {
                    return null;
                }
                return TuplesKt.a(this.f37830c.getKey(), exception);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Map<i, p> map, b bVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f37826c = map;
            this.f37827d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f37826c, this.f37827d, continuation);
            hVar.f37825b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OAuth2ClientResult<Unit>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f37824a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f37825b;
                Map<i, p> map = this.f37826c;
                b bVar = this.f37827d;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator<Map.Entry<i, p>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(C16648k.b(interfaceC16622O, null, null, new a(bVar, it.next(), null), 3, null));
                }
                this.f37824a = 1;
                obj = C16638f.a(arrayList, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Map mapY = MapsKt.y(CollectionsKt.p0((Iterable) obj));
            if (mapY.isEmpty()) {
                return new OAuth2ClientResult.a(Unit.f142422a);
            }
            return new OAuth2ClientResult.Error(new RevokeAllException(mapY));
        }
    }

    public b(p token, com.okta.authfoundation.client.h client, Map<String, String> tags) {
        Intrinsics.j(token, "token");
        Intrinsics.j(client, "client");
        Intrinsics.j(tags, "tags");
        this.client = client;
        this.id = token.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        this.refreshCoalescingOrchestrator = new ct.e<>(new f(this), new Function1() { // from class: Vs.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(b.k((OAuth2ClientResult) obj));
            }
        }, null, 4, null);
        this.tokenFlow = S.a(token);
        this.token = token;
        this._tags = tags;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(OAuth2ClientResult it) {
        Intrinsics.j(it, "it");
        return false;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.e(this.id, bVar.id) && Intrinsics.e(this.token, bVar.token) && Intrinsics.e(h(), bVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(Continuation<? super OAuth2ClientResult<p>> continuation) {
        return this.client.p(this.token, continuation);
    }

    public final void c() throws InterruptedException {
        C16646j.b(null, new d(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r2
      0x00a8: PHI (r2v4 Vs.b) = (r2v3 Vs.b), (r2v11 Vs.b) binds: [B:36:0x00a5, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[PHI: r2 r10
      0x00b5: PHI (r2v5 Vs.b) = (r2v4 Vs.b), (r2v13 Vs.b) binds: [B:39:0x00b2, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r10v16 java.lang.Object) = (r10v15 java.lang.Object), (r10v1 java.lang.Object) binds: [B:39:0x00b2, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.b.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String e() {
        String accessToken = this.token.getAccessToken();
        if (this.token.getIssuedAt() + this.token.getExpiresIn() > this.client.getConfiguration().getClock().a()) {
            return accessToken;
        }
        return null;
    }

    /* renamed from: f, reason: from getter */
    public final com.okta.authfoundation.client.h getClient() {
        return this.client;
    }

    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, String> h() {
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(this._tags);
        Intrinsics.i(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.token, h());
    }

    public final bt.b i() {
        String idToken = this.token.getIdToken();
        if (idToken == null) {
            return null;
        }
        try {
            return new bt.d(this.client.getConfiguration().getJson(), this.client.getConfiguration().getComputeDispatcher()).a(idToken);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object l(Continuation<? super OAuth2ClientResult<p>> continuation) {
        return this.refreshCoalescingOrchestrator.l(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(Vs.p r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Vs.b.g
            if (r0 == 0) goto L13
            r0 = r12
            Vs.b$g r0 = (Vs.b.g) r0
            int r1 = r0.f37823d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37823d = r1
            goto L18
        L13:
            Vs.b$g r0 = new Vs.b$g
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f37821b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37823d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f37820a
            Vs.b r11 = (Vs.b) r11
            kotlin.ResultKt.b(r12)
            goto L83
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r12)
            boolean r12 = r10.isDeleted
            if (r12 == 0) goto L51
            com.okta.authfoundation.client.h r11 = r10.client
            com.okta.authfoundation.client.j r11 = r11.getConfiguration()
            at.b r11 = r11.getEventCoordinator()
            Ws.e r12 = new Ws.e
            r12.<init>(r10)
            r11.a(r12)
            kotlin.Unit r11 = kotlin.Unit.f142422a
            return r11
        L51:
            java.lang.String r12 = r11.getRefreshToken()
            if (r12 != 0) goto L5d
            Vs.p r12 = r10.token
            java.lang.String r12 = r12.getRefreshToken()
        L5d:
            r6 = r12
            java.lang.String r12 = r11.getDeviceSecret()
            if (r12 != 0) goto L6a
            Vs.p r12 = r10.token
            java.lang.String r12 = r12.getDeviceSecret()
        L6a:
            r7 = r12
            r8 = 1
            r9 = 0
            r5 = 0
            r4 = r11
            Vs.p r11 = Vs.p.c(r4, r5, r6, r7, r8, r9)
            r10.token = r11
            tv.B<Vs.p> r11 = r10.tokenFlow
            r0.f37820a = r10
            r0.f37823d = r3
            java.lang.Object r11 = r11.emit(r4, r0)
            if (r11 != r1) goto L82
            return r1
        L82:
            r11 = r10
        L83:
            com.okta.authfoundation.client.h r12 = r11.client
            com.okta.authfoundation.client.j r12 = r12.getConfiguration()
            at.b r12 = r12.getEventCoordinator()
            Ws.f r0 = new Ws.f
            Vs.p r1 = r11.token
            java.util.Map r2 = r11.h()
            r0.<init>(r11, r1, r2)
            r12.a(r0)
            kotlin.Unit r11 = kotlin.Unit.f142422a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.b.m(Vs.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object n(Continuation<? super OAuth2ClientResult<Unit>> continuation) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(i.f37901a, this.token);
        if (this.token.getRefreshToken() != null) {
            linkedHashMap.put(i.f37902b, this.token);
        }
        if (this.token.getDeviceSecret() != null) {
            linkedHashMap.put(i.f37903c, this.token);
        }
        return C16623P.g(new h(linkedHashMap, this, null), continuation);
    }

    public /* synthetic */ b(p pVar, com.okta.authfoundation.client.h hVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i10 & 2) != 0 ? com.okta.authfoundation.client.h.INSTANCE.b(pVar.getOidcConfiguration()) : hVar, (i10 & 4) != 0 ? MapsKt.k() : map);
    }
}
