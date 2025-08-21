package a5;

import a5.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d5.C13621e;
import e5.InterfaceC13772a;
import g5.C14327a;
import g5.b;
import g5.c;
import g5.e;
import g5.f;
import g5.j;
import g5.k;
import g5.l;
import h5.C14467a;
import h5.InterfaceC14468b;
import i5.C14686a;
import i5.C14688c;
import j5.C14942a;
import j5.C14943b;
import j5.C14944c;
import j5.C14946e;
import j5.C14947f;
import j5.C14948g;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.InterfaceC15089c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15670i;
import m5.C15664c;
import m5.C15667f;
import m5.C15669h;
import m5.C15672k;
import m5.C15676o;
import m5.InterfaceC15666e;
import mv.C15784P;
import mv.C15800f0;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15780L;
import mv.InterfaceC15783O;
import mv.W;
import mv.X0;
import n5.Size;
import o5.InterfaceC16074d;
import okhttp3.HttpUrl;
import okhttp3.d;
import r5.C16844h;
import r5.C16846j;
import r5.C16852p;
import r5.ComponentCallbacks2C16857u;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 i2\u00020\u0001:\u00015Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020'2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020$2\u0006\u00102\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\b?\u0010>R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010WR\u001a\u0010Z\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010G\u001a\u0004\bY\u0010IR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010`R\u001d\u0010e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b@\u0010b*\u0004\bc\u0010dR\u001d\u0010h\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b5\u0010f*\u0004\bg\u0010d¨\u0006j"}, d2 = {"La5/k;", "La5/h;", "Landroid/content/Context;", "context", "Lm5/c;", "defaults", "Lkotlin/Lazy;", "Lk5/c;", "memoryCacheLazy", "Le5/a;", "diskCacheLazy", "Lokhttp3/d$a;", "callFactoryLazy", "La5/c$c;", "eventListenerFactory", "La5/b;", "componentRegistry", "Lr5/p;", "options", "Lr5/s;", "logger", "<init>", "(Landroid/content/Context;Lm5/c;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;La5/c$c;La5/b;Lr5/p;Lr5/s;)V", "Lm5/h;", "initialRequest", "", "type", "Lm5/i;", "h", "(Lm5/h;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm5/p;", "result", "Lo5/c;", "target", "La5/c;", "eventListener", "", "n", "(Lm5/p;Lo5/c;La5/c;)V", "Lm5/f;", "m", "(Lm5/f;Lo5/c;La5/c;)V", "request", "l", "(Lm5/h;La5/c;)V", "Lm5/e;", "d", "(Lm5/h;)Lm5/e;", "c", "(Lm5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "level", "o", "(I)V", "a", "Landroid/content/Context;", "i", "()Landroid/content/Context;", "b", "Lm5/c;", "()Lm5/c;", "Lkotlin/Lazy;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "e", "getCallFactoryLazy", "f", "La5/c$c;", "getEventListenerFactory", "()La5/c$c;", "g", "La5/b;", "getComponentRegistry", "()La5/b;", "Lr5/p;", "k", "()Lr5/p;", "Lr5/s;", "j", "()Lr5/s;", "Lmv/O;", "Lmv/O;", "scope", "Lr5/u;", "Lr5/u;", "systemCallbacks", "Lm5/o;", "Lm5/o;", "requestService", "getComponents", "components", "", "Lh5/b;", "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shutdown", "()Lk5/c;", "getMemoryCache$delegate", "(La5/k;)Ljava/lang/Object;", "memoryCache", "()Le5/a;", "getDiskCache$delegate", "diskCache", "p", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15664c defaults;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<InterfaceC15089c> memoryCacheLazy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy<InterfaceC13772a> diskCacheLazy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<d.a> callFactoryLazy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.InterfaceC0941c eventListenerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a5.b componentRegistry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C16852p options;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16855s logger;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope = C15784P.a(X0.b(null, 1, null).n0(C15800f0.c().X0()).n0(new g(InterfaceC15780L.INSTANCE, this)));

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16857u systemCallbacks;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C15676o requestService;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a5.b components;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC14468b> interceptors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean shutdown;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/i;", "<anonymous>", "(Lmv/O;)Lm5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {113}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AbstractC15670i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45200a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15669h f45202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C15669h c15669h, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f45202c = c15669h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new b(this.f45202c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AbstractC15670i> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC16855s logger;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45200a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k kVar = k.this;
                C15669h c15669h = this.f45202c;
                this.f45200a = 1;
                obj = kVar.h(c15669h, 0, this);
                if (obj == objF) {
                    return objF;
                }
            }
            k kVar2 = k.this;
            AbstractC15670i abstractC15670i = (AbstractC15670i) obj;
            if ((abstractC15670i instanceof C15667f) && (logger = kVar2.getLogger()) != null) {
                C16844h.a(logger, "RealImageLoader", ((C15667f) abstractC15670i).getThrowable());
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/i;", "<anonymous>", "(Lmv/O;)Lm5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {138}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AbstractC15670i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45203a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f45204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15669h f45205c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f45206d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/i;", "<anonymous>", "(Lmv/O;)Lm5/i;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AbstractC15670i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f45207a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f45208b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C15669h f45209c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, C15669h c15669h, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f45208b = kVar;
                this.f45209c = c15669h;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f45208b, this.f45209c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AbstractC15670i> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f45207a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                k kVar = this.f45208b;
                C15669h c15669h = this.f45209c;
                this.f45207a = 1;
                Object objH = kVar.h(c15669h, 1, this);
                if (objH == objF) {
                    return objF;
                }
                return objH;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C15669h c15669h, k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f45205c = c15669h;
            this.f45206d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f45205c, this.f45206d, continuation);
            cVar.f45204b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AbstractC15670i> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45203a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            W<? extends AbstractC15670i> wB = C15809k.b((InterfaceC15783O) this.f45204b, C15800f0.c().X0(), null, new a(this.f45206d, this.f45205c, null), 2, null);
            C16846j.m(((InterfaceC16074d) this.f45205c.getTarget()).getView()).b(wB);
            this.f45203a = 1;
            Object objH = wB.H(this);
            if (objH == objF) {
                return objF;
            }
            return objH;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/i;", "<anonymous>", "(Lmv/O;)Lm5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$execute$3", f = "RealImageLoader.kt", l = {143}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AbstractC15670i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45210a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15669h f45212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C15669h c15669h, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f45212c = c15669h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new d(this.f45212c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AbstractC15670i> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45210a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            k kVar = k.this;
            C15669h c15669h = this.f45212c;
            this.f45210a = 1;
            Object objH = kVar.h(c15669h, 1, this);
            if (objH == objF) {
                return objF;
            }
            return objH;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {171, 183, 187}, m = "executeMain")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f45213a;

        /* renamed from: b, reason: collision with root package name */
        Object f45214b;

        /* renamed from: c, reason: collision with root package name */
        Object f45215c;

        /* renamed from: d, reason: collision with root package name */
        Object f45216d;

        /* renamed from: e, reason: collision with root package name */
        Object f45217e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45218f;

        /* renamed from: h, reason: collision with root package name */
        int f45220h;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45218f = obj;
            this.f45220h |= Integer.MIN_VALUE;
            return k.this.h(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/i;", "<anonymous>", "(Lmv/O;)Lm5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {196}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AbstractC15670i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15669h f45222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f45223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Size f45224d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a5.c f45225e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f45226f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C15669h c15669h, k kVar, Size size, a5.c cVar, Bitmap bitmap, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f45222b = c15669h;
            this.f45223c = kVar;
            this.f45224d = size;
            this.f45225e = cVar;
            this.f45226f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f45222b, this.f45223c, this.f45224d, this.f45225e, this.f45226f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AbstractC15670i> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45221a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C15669h c15669h = this.f45222b;
            List list = this.f45223c.interceptors;
            C15669h c15669h2 = this.f45222b;
            Size size = this.f45224d;
            a5.c cVar = this.f45225e;
            if (this.f45226f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h5.c cVar2 = new h5.c(c15669h, list, 0, c15669h2, size, cVar, z10);
            C15669h c15669h3 = this.f45222b;
            this.f45221a = 1;
            Object objF2 = cVar2.f(c15669h3, this);
            if (objF2 == objF) {
                return objF;
            }
            return objF2;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"a5/k$g", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends AbstractCoroutineContextElement implements InterfaceC15780L {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f45227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC15780L.Companion companion, k kVar) {
            super(companion);
            this.f45227b = kVar;
        }

        @Override // mv.InterfaceC15780L
        public void m0(CoroutineContext context, Throwable exception) {
            InterfaceC16855s logger = this.f45227b.getLogger();
            if (logger != null) {
                C16844h.a(logger, "RealImageLoader", exception);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(1:(7:13|114|14|76|(1:78)(2:79|(1:81)(2:84|85))|82|83)(2:18|19))(13:20|107|21|22|23|103|69|70|112|71|72|(5:75|76|(0)(0)|82|83)|74)|109|92|(3:94|95|96)(2:99|100))(4:26|105|27|41))(4:32|115|33|(2:35|(3:37|(2:40|41)|74)(1:44))(2:90|91))|110|45|(11:47|(1:49)(1:52)|(1:54)|(1:57)(1:58)|59|(1:61)|62|(1:64)|65|(9:68|23|103|69|70|112|71|72|(0))|74)|55|(0)(0)|59|(0)|62|(0)|65|(0)|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7 A[Catch: all -> 0x01d5, TRY_ENTER, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(m5.C15669h r20, int r21, kotlin.coroutines.Continuation<? super m5.AbstractC15670i> r22) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.k.h(m5.h, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void l(C15669h request, a5.c eventListener) {
        InterfaceC16855s interfaceC16855s = this.logger;
        if (interfaceC16855s != null && interfaceC16855s.getLevel() <= 4) {
            interfaceC16855s.a("RealImageLoader", 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.c(request);
        C15669h.b listener = request.getListener();
        if (listener != null) {
            listener.c(request);
        }
    }

    @Override // a5.h
    public InterfaceC13772a a() {
        return this.diskCacheLazy.getValue();
    }

    @Override // a5.h
    /* renamed from: b, reason: from getter */
    public C15664c getDefaults() {
        return this.defaults;
    }

    @Override // a5.h
    public InterfaceC15666e d(C15669h request) {
        W<? extends AbstractC15670i> wB = C15809k.b(this.scope, null, null, new b(request, null), 3, null);
        return request.getTarget() instanceof InterfaceC16074d ? C16846j.m(((InterfaceC16074d) request.getTarget()).getView()).b(wB) : new C15672k(wB);
    }

    @Override // a5.h
    public InterfaceC15089c e() {
        return this.memoryCacheLazy.getValue();
    }

    @Override // a5.h
    public a5.b getComponents() {
        return this.components;
    }

    /* renamed from: i, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: j, reason: from getter */
    public final InterfaceC16855s getLogger() {
        return this.logger;
    }

    /* renamed from: k, reason: from getter */
    public final C16852p getOptions() {
        return this.options;
    }

    public final void o(int level) {
        InterfaceC15089c value;
        Lazy<InterfaceC15089c> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.a(level);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, C15664c c15664c, Lazy<? extends InterfaceC15089c> lazy, Lazy<? extends InterfaceC13772a> lazy2, Lazy<? extends d.a> lazy3, c.InterfaceC0941c interfaceC0941c, a5.b bVar, C16852p c16852p, InterfaceC16855s interfaceC16855s) {
        this.context = context;
        this.defaults = c15664c;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = interfaceC0941c;
        this.componentRegistry = bVar;
        this.options = c16852p;
        this.logger = interfaceC16855s;
        ComponentCallbacks2C16857u componentCallbacks2C16857u = new ComponentCallbacks2C16857u(this);
        this.systemCallbacks = componentCallbacks2C16857u;
        C15676o c15676o = new C15676o(this, componentCallbacks2C16857u, interfaceC16855s);
        this.requestService = c15676o;
        this.components = bVar.h().d(new C14944c(), HttpUrl.class).d(new C14948g(), String.class).d(new C14943b(), Uri.class).d(new C14947f(), Uri.class).d(new C14946e(), Integer.class).d(new C14942a(), byte[].class).c(new C14688c(), Uri.class).c(new C14686a(c16852p.getAddLastModifiedToFileCacheKey()), File.class).b(new k.b(lazy3, lazy2, c16852p.getRespectCacheHeaders()), Uri.class).b(new j.a(), File.class).b(new C14327a.C2117a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new C13621e.c(c16852p.getBitmapFactoryMaxParallelism(), c16852p.getBitmapFactoryExifOrientationPolicy())).e();
        this.interceptors = CollectionsKt.Q0(getComponents().c(), new C14467a(this, componentCallbacks2C16857u, c15676o, interfaceC16855s));
        this.shutdown = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(m5.C15667f r7, o5.InterfaceC16073c r8, a5.c r9) {
        /*
            r6 = this;
            m5.h r0 = r7.getRequest()
            r5.s r1 = r6.logger
            if (r1 == 0) goto L36
            int r2 = r1.getLevel()
            r3 = 4
            if (r2 > r3) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r2.append(r4)
            java.lang.Object r4 = r0.getData()
            r2.append(r4)
            java.lang.String r4 = " - "
            r2.append(r4)
            java.lang.Throwable r4 = r7.getThrowable()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r5, r3, r2, r4)
        L36:
            boolean r1 = r8 instanceof q5.InterfaceC16607d
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            m5.h r1 = r7.getRequest()
            q5.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            q5.d r2 = (q5.InterfaceC16607d) r2
            q5.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof q5.C16605b
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.c(r1)
            goto L69
        L58:
            m5.h r8 = r7.getRequest()
            r9.r(r8, r1)
            r1.a()
            m5.h r8 = r7.getRequest()
            r9.m(r8, r1)
        L69:
            r9.a(r0, r7)
            m5.h$b r8 = r0.getListener()
            if (r8 == 0) goto L75
            r8.a(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.k.m(m5.f, o5.c, a5.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(m5.C15677p r7, o5.InterfaceC16073c r8, a5.c r9) {
        /*
            r6 = this;
            m5.h r0 = r7.getRequest()
            d5.g r1 = r7.getDataSource()
            r5.s r2 = r6.logger
            if (r2 == 0) goto L41
            int r3 = r2.getLevel()
            r4 = 4
            if (r3 > r4) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r5.C16846j.g(r1)
            r3.append(r5)
            java.lang.String r5 = " Successful ("
            r3.append(r5)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            java.lang.String r1 = ") - "
            r3.append(r1)
            java.lang.Object r1 = r0.getData()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.a(r5, r4, r1, r3)
        L41:
            boolean r1 = r8 instanceof q5.InterfaceC16607d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            m5.h r1 = r7.getRequest()
            q5.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            q5.d r2 = (q5.InterfaceC16607d) r2
            q5.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof q5.C16605b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.a(r1)
            goto L74
        L63:
            m5.h r8 = r7.getRequest()
            r9.r(r8, r1)
            r1.a()
            m5.h r8 = r7.getRequest()
            r9.m(r8, r1)
        L74:
            r9.d(r0, r7)
            m5.h$b r8 = r0.getListener()
            if (r8 == 0) goto L80
            r8.d(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.k.n(m5.p, o5.c, a5.c):void");
    }

    @Override // a5.h
    public Object c(C15669h c15669h, Continuation<? super AbstractC15670i> continuation) {
        if (c15669h.getTarget() instanceof InterfaceC16074d) {
            return C15784P.g(new c(c15669h, this, null), continuation);
        }
        return C15805i.g(C15800f0.c().X0(), new d(c15669h, null), continuation);
    }
}
