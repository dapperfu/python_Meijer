package com.adobe.marketing.mobile;

import android.app.Application;
import android.os.Build;
import android.os.UserManager;
import androidx.view.C6134H;
import androidx.view.InterfaceC6172s;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15780L;
import mv.InterfaceC15783O;
import mv.X0;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001\u0011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\u00102\u0018\u0010\u0019\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010\u0017\u0018\u00010\u00162\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/adobe/marketing/mobile/C;", "", "Lmv/O;", "scope", "Lmv/K;", "mainDispatcher", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/adobe/marketing/mobile/n;", "extensionDiscovery", "Lkotlin/Function1;", "Landroid/app/Application;", "", "isUserUnlocked", "<init>", "(Lmv/O;Lmv/K;Landroidx/lifecycle/s;Lcom/adobe/marketing/mobile/n;Lkotlin/jvm/functions/Function1;)V", "", "b", "()V", "application", "d", "(Landroid/app/Application;)V", "", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/l;", "extensions", "Lcom/adobe/marketing/mobile/a;", "completionCallback", "c", "(Ljava/util/List;Lcom/adobe/marketing/mobile/a;)V", "a", "Lmv/O;", "Lmv/K;", "Landroidx/lifecycle/s;", "Lcom/adobe/marketing/mobile/n;", "e", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "setApplicationCalled", "g", "initializeCalled", "Lwv/a;", "h", "Lwv/a;", "mutex", "i", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: j, reason: collision with root package name */
    private static final InterfaceC15780L f62822j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function1<Application, Boolean> f62823k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static C f62824l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K mainDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6172s lifecycleOwner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6580n extensionDiscovery;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Application, Boolean> isUserUnlocked;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean setApplicationCalled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean initializeCalled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Application;", "application", "", "a", "(Landroid/app/Application;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function1<Application, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f62833f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Application application) {
            Intrinsics.j(application, "application");
            Object systemService = application.getSystemService("user");
            UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
            return Boolean.valueOf(userManager != null ? userManager.isUserUnlocked() : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2", f = "MobileCoreInitializer.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62834a;

        /* renamed from: b, reason: collision with root package name */
        Object f62835b;

        /* renamed from: c, reason: collision with root package name */
        Object f62836c;

        /* renamed from: d, reason: collision with root package name */
        int f62837d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set<Class<? extends AbstractC6578l>> f62839f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6543a<?> f62840g;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6543a<?> f62841f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6543a<?> interfaceC6543a) {
                super(0);
                this.f62841f = interfaceC6543a;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC6543a<?> interfaceC6543a = this.f62841f;
                if (interfaceC6543a != null) {
                    interfaceC6543a.a(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Set<Class<? extends AbstractC6578l>> set, InterfaceC6543a<?> interfaceC6543a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f62839f = set;
            this.f62840g = interfaceC6543a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new c(this.f62839f, this.f62840g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set<Class<? extends AbstractC6578l>> set;
            InterfaceC17929a interfaceC17929a;
            InterfaceC6543a<?> interfaceC6543a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f62837d;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC6543a = (InterfaceC6543a) this.f62836c;
                    set = (Set) this.f62835b;
                    interfaceC17929a = (InterfaceC17929a) this.f62834a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17929a interfaceC17929a2 = C.this.mutex;
                set = this.f62839f;
                InterfaceC6543a<?> interfaceC6543a2 = this.f62840g;
                this.f62834a = interfaceC17929a2;
                this.f62835b = set;
                this.f62836c = interfaceC6543a2;
                this.f62837d = 1;
                if (interfaceC17929a2.g(null, this) == objF) {
                    return objF;
                }
                interfaceC17929a = interfaceC17929a2;
                interfaceC6543a = interfaceC6543a2;
            }
            try {
                J5.q.INSTANCE.a().c0(set, new a(interfaceC6543a));
                Unit unit = Unit.f143329a;
                interfaceC17929a.h(null);
                return Unit.f143329a;
            } catch (Throwable th2) {
                interfaceC17929a.h(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1", f = "MobileCoreInitializer.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62842a;

        /* renamed from: b, reason: collision with root package name */
        int f62843b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC17929a interfaceC17929a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f62843b;
            if (i10 == 0) {
                ResultKt.b(obj);
                InterfaceC17929a interfaceC17929a2 = C.this.mutex;
                this.f62842a = interfaceC17929a2;
                this.f62843b = 1;
                if (interfaceC17929a2.g(null, this) == objF) {
                    return objF;
                }
                interfaceC17929a = interfaceC17929a2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC17929a = (InterfaceC17929a) this.f62842a;
                ResultKt.b(obj);
            }
            try {
                try {
                    new L5.b().f();
                } catch (Exception e10) {
                    R5.t.b("MobileCore", "MobileCoreInitializer", "Migration from V4 SDK failed with error - " + e10.getLocalizedMessage(), new Object[0]);
                }
                try {
                    L5.c.f18026a.a();
                } catch (Exception e11) {
                    R5.t.b("MobileCore", "MobileCoreInitializer", "Unable to clean the V5 legacy data due to an error - " + e11.getLocalizedMessage(), new Object[0]);
                }
                J5.q.INSTANCE.a().W();
                Unit unit = Unit.f143329a;
                interfaceC17929a.h(null);
                return Unit.f143329a;
            } catch (Throwable th2) {
                interfaceC17929a.h(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adobe/marketing/mobile/C$e", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class e extends AbstractCoroutineContextElement implements InterfaceC15780L {
        @Override // mv.InterfaceC15780L
        public void m0(CoroutineContext context, Throwable exception) {
            R5.t.f("MobileCore", "MobileCoreInitializer", "Caught exception - " + exception.getMessage(), new Object[0]);
        }

        public e(InterfaceC15780L.Companion companion) {
            super(companion);
        }
    }

    static {
        e eVar = new e(InterfaceC15780L.INSTANCE);
        f62822j = eVar;
        a aVar = a.f62833f;
        f62823k = aVar;
        f62824l = new C(C15784P.a(C15800f0.b().n0(X0.b(null, 1, null)).n0(eVar)), C15800f0.c().X0(), C6134H.INSTANCE.a(), new C6580n(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(InterfaceC15783O scope, AbstractC15779K mainDispatcher, InterfaceC6172s lifecycleOwner, C6580n extensionDiscovery, Function1<? super Application, Boolean> isUserUnlocked) {
        Intrinsics.j(scope, "scope");
        Intrinsics.j(mainDispatcher, "mainDispatcher");
        Intrinsics.j(lifecycleOwner, "lifecycleOwner");
        Intrinsics.j(extensionDiscovery, "extensionDiscovery");
        Intrinsics.j(isUserUnlocked, "isUserUnlocked");
        this.scope = scope;
        this.mainDispatcher = mainDispatcher;
        this.lifecycleOwner = lifecycleOwner;
        this.extensionDiscovery = extensionDiscovery;
        this.isUserUnlocked = isUserUnlocked;
        this.setApplicationCalled = new AtomicBoolean(false);
        this.initializeCalled = new AtomicBoolean(false);
        this.mutex = wv.g.b(false, 1, null);
    }

    private final void b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26 || i10 == 27) {
            try {
                new Date().toString();
            } catch (AssertionError | Exception unused) {
            }
        }
    }

    public final void c(List<? extends Class<? extends AbstractC6578l>> extensions, InterfaceC6543a<?> completionCallback) {
        List listP0;
        if (!this.setApplicationCalled.get()) {
            R5.t.b("MobileCore", "MobileCoreInitializer", "Failed to registerExtensions - setApplication not called", new Object[0]);
            return;
        }
        Set setG = SetsKt.g(ConfigurationExtension.class);
        if (extensions != null && (listP0 = CollectionsKt.p0(extensions)) != null) {
            setG.addAll(listP0);
        }
        C15809k.d(this.scope, null, null, new c(setG, completionCallback, null), 3, null);
    }

    public final void d(Application application) {
        Intrinsics.j(application, "application");
        if (!this.isUserUnlocked.invoke(application).booleanValue()) {
            R5.t.b("MobileCore", "MobileCoreInitializer", "setApplication failed - device is in direct boot mode, SDK will not be initialized.", new Object[0]);
            return;
        }
        b();
        if (this.setApplicationCalled.getAndSet(true)) {
            R5.t.a("MobileCore", "MobileCoreInitializer", "setApplication failed - ignoring as setApplication was already called.", new Object[0]);
            return;
        }
        R5.K.f().a().f(application);
        U5.a.f37108a.a(new s());
        C15809k.d(this.scope, null, null, new d(null), 3, null);
    }
}
