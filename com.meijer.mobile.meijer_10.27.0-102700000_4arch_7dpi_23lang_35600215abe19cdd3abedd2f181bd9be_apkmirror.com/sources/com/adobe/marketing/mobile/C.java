package com.adobe.marketing.mobile;

import android.app.Application;
import android.os.Build;
import android.os.UserManager;
import androidx.view.C5992H;
import androidx.view.InterfaceC6030s;
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
import qv.AbstractC16618K;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16619L;
import qv.InterfaceC16622O;
import qv.X0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001\u0011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\u00102\u0018\u0010\u0019\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010\u0017\u0018\u00010\u00162\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/adobe/marketing/mobile/C;", "", "Lqv/O;", "scope", "Lqv/K;", "mainDispatcher", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/adobe/marketing/mobile/n;", "extensionDiscovery", "Lkotlin/Function1;", "Landroid/app/Application;", "", "isUserUnlocked", "<init>", "(Lqv/O;Lqv/K;Landroidx/lifecycle/s;Lcom/adobe/marketing/mobile/n;Lkotlin/jvm/functions/Function1;)V", "", "b", "()V", "application", "d", "(Landroid/app/Application;)V", "", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/l;", "extensions", "Lcom/adobe/marketing/mobile/a;", "completionCallback", "c", "(Ljava/util/List;Lcom/adobe/marketing/mobile/a;)V", "a", "Lqv/O;", "Lqv/K;", "Landroidx/lifecycle/s;", "Lcom/adobe/marketing/mobile/n;", "e", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "setApplicationCalled", "g", "initializeCalled", "LAv/a;", "h", "LAv/a;", "mutex", "i", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: j, reason: collision with root package name */
    private static final InterfaceC16619L f61983j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function1<Application, Boolean> f61984k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static C f61985l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K mainDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6030s lifecycleOwner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6455n extensionDiscovery;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Application, Boolean> isUserUnlocked;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean setApplicationCalled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean initializeCalled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Application;", "application", "", "a", "(Landroid/app/Application;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function1<Application, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f61994f = new a();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2", f = "MobileCoreInitializer.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f61995a;

        /* renamed from: b, reason: collision with root package name */
        Object f61996b;

        /* renamed from: c, reason: collision with root package name */
        Object f61997c;

        /* renamed from: d, reason: collision with root package name */
        int f61998d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set<Class<? extends AbstractC6453l>> f62000f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6418a<?> f62001g;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6418a<?> f62002f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6418a<?> interfaceC6418a) {
                super(0);
                this.f62002f = interfaceC6418a;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC6418a<?> interfaceC6418a = this.f62002f;
                if (interfaceC6418a != null) {
                    interfaceC6418a.a(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Set<Class<? extends AbstractC6453l>> set, InterfaceC6418a<?> interfaceC6418a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f62000f = set;
            this.f62001g = interfaceC6418a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new c(this.f62000f, this.f62001g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set<Class<? extends AbstractC6453l>> set;
            Av.a aVar;
            InterfaceC6418a<?> interfaceC6418a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61998d;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC6418a = (InterfaceC6418a) this.f61997c;
                    set = (Set) this.f61996b;
                    aVar = (Av.a) this.f61995a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Av.a aVar2 = C.this.mutex;
                set = this.f62000f;
                InterfaceC6418a<?> interfaceC6418a2 = this.f62001g;
                this.f61995a = aVar2;
                this.f61996b = set;
                this.f61997c = interfaceC6418a2;
                this.f61998d = 1;
                if (aVar2.g(null, this) == objF) {
                    return objF;
                }
                aVar = aVar2;
                interfaceC6418a = interfaceC6418a2;
            }
            try {
                I5.q.INSTANCE.a().c0(set, new a(interfaceC6418a));
                Unit unit = Unit.f142422a;
                aVar.h(null);
                return Unit.f142422a;
            } catch (Throwable th2) {
                aVar.h(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1", f = "MobileCoreInitializer.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62003a;

        /* renamed from: b, reason: collision with root package name */
        int f62004b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Av.a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f62004b;
            if (i10 == 0) {
                ResultKt.b(obj);
                Av.a aVar2 = C.this.mutex;
                this.f62003a = aVar2;
                this.f62004b = 1;
                if (aVar2.g(null, this) == objF) {
                    return objF;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (Av.a) this.f62003a;
                ResultKt.b(obj);
            }
            try {
                try {
                    new K5.b().f();
                } catch (Exception e10) {
                    Q5.t.b("MobileCore", "MobileCoreInitializer", "Migration from V4 SDK failed with error - " + e10.getLocalizedMessage(), new Object[0]);
                }
                try {
                    K5.c.f16305a.a();
                } catch (Exception e11) {
                    Q5.t.b("MobileCore", "MobileCoreInitializer", "Unable to clean the V5 legacy data due to an error - " + e11.getLocalizedMessage(), new Object[0]);
                }
                I5.q.INSTANCE.a().W();
                Unit unit = Unit.f142422a;
                aVar.h(null);
                return Unit.f142422a;
            } catch (Throwable th2) {
                aVar.h(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adobe/marketing/mobile/C$e", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lqv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "l0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class e extends AbstractCoroutineContextElement implements InterfaceC16619L {
        @Override // qv.InterfaceC16619L
        public void l0(CoroutineContext context, Throwable exception) {
            Q5.t.f("MobileCore", "MobileCoreInitializer", "Caught exception - " + exception.getMessage(), new Object[0]);
        }

        public e(InterfaceC16619L.Companion companion) {
            super(companion);
        }
    }

    static {
        e eVar = new e(InterfaceC16619L.INSTANCE);
        f61983j = eVar;
        a aVar = a.f61994f;
        f61984k = aVar;
        f61985l = new C(C16623P.a(C16639f0.b().m0(X0.b(null, 1, null)).m0(eVar)), C16639f0.c().Y0(), C5992H.INSTANCE.a(), new C6455n(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(InterfaceC16622O scope, AbstractC16618K mainDispatcher, InterfaceC6030s lifecycleOwner, C6455n extensionDiscovery, Function1<? super Application, Boolean> isUserUnlocked) {
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
        this.mutex = Av.g.b(false, 1, null);
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

    public final void c(List<? extends Class<? extends AbstractC6453l>> extensions, InterfaceC6418a<?> completionCallback) {
        List listP0;
        if (!this.setApplicationCalled.get()) {
            Q5.t.b("MobileCore", "MobileCoreInitializer", "Failed to registerExtensions - setApplication not called", new Object[0]);
            return;
        }
        Set setG = SetsKt.g(ConfigurationExtension.class);
        if (extensions != null && (listP0 = CollectionsKt.p0(extensions)) != null) {
            setG.addAll(listP0);
        }
        C16648k.d(this.scope, null, null, new c(setG, completionCallback, null), 3, null);
    }

    public final void d(Application application) {
        Intrinsics.j(application, "application");
        if (!this.isUserUnlocked.invoke(application).booleanValue()) {
            Q5.t.b("MobileCore", "MobileCoreInitializer", "setApplication failed - device is in direct boot mode, SDK will not be initialized.", new Object[0]);
            return;
        }
        b();
        if (this.setApplicationCalled.getAndSet(true)) {
            Q5.t.a("MobileCore", "MobileCoreInitializer", "setApplication failed - ignoring as setApplication was already called.", new Object[0]);
            return;
        }
        Q5.K.f().a().f(application);
        T5.a.f34817a.a(new s());
        C16648k.d(this.scope, null, null, new d(null), 3, null);
    }
}
