package Z4;

import Z4.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c5.C6359e;
import d5.InterfaceC13485a;
import f5.C13844a;
import f5.b;
import f5.c;
import f5.e;
import f5.f;
import f5.j;
import f5.k;
import f5.l;
import g5.C14198a;
import g5.InterfaceC14199b;
import h5.C14377a;
import h5.C14379c;
import i5.C14683a;
import i5.C14684b;
import i5.C14685c;
import i5.C14687e;
import i5.C14688f;
import i5.C14689g;
import j5.InterfaceC14857c;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
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
import l5.AbstractC15373i;
import l5.C15367c;
import l5.C15370f;
import l5.C15372h;
import l5.C15375k;
import l5.C15379o;
import l5.InterfaceC15369e;
import m5.Size;
import n5.InterfaceC15780d;
import okhttp3.HttpUrl;
import okhttp3.d;
import q5.C16456h;
import q5.C16458j;
import q5.C16464p;
import q5.ComponentCallbacks2C16469u;
import q5.InterfaceC16467s;
import qv.C16623P;
import qv.C16639f0;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16619L;
import qv.InterfaceC16622O;
import qv.W;
import qv.X0;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 i2\u00020\u0001:\u00015Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020'2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020$2\u0006\u00102\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b?\u0010>R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010WR\u001a\u0010Z\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010G\u001a\u0004\bY\u0010IR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010`R\u001d\u0010e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b@\u0010b*\u0004\bc\u0010dR\u001d\u0010h\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b5\u0010f*\u0004\bg\u0010d¨\u0006j"}, d2 = {"LZ4/k;", "LZ4/h;", "Landroid/content/Context;", "context", "Ll5/c;", "defaults", "Lkotlin/Lazy;", "Lj5/c;", "memoryCacheLazy", "Ld5/a;", "diskCacheLazy", "Lokhttp3/d$a;", "callFactoryLazy", "LZ4/c$c;", "eventListenerFactory", "LZ4/b;", "componentRegistry", "Lq5/p;", "options", "Lq5/s;", "logger", "<init>", "(Landroid/content/Context;Ll5/c;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;LZ4/c$c;LZ4/b;Lq5/p;Lq5/s;)V", "Ll5/h;", "initialRequest", "", "type", "Ll5/i;", "h", "(Ll5/h;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll5/p;", "result", "Ln5/c;", "target", "LZ4/c;", "eventListener", "", "n", "(Ll5/p;Ln5/c;LZ4/c;)V", "Ll5/f;", "m", "(Ll5/f;Ln5/c;LZ4/c;)V", "request", "l", "(Ll5/h;LZ4/c;)V", "Ll5/e;", "b", "(Ll5/h;)Ll5/e;", "c", "(Ll5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "level", "o", "(I)V", "a", "Landroid/content/Context;", "i", "()Landroid/content/Context;", "Ll5/c;", "d", "()Ll5/c;", "Lkotlin/Lazy;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "e", "getCallFactoryLazy", "f", "LZ4/c$c;", "getEventListenerFactory", "()LZ4/c$c;", "g", "LZ4/b;", "getComponentRegistry", "()LZ4/b;", "Lq5/p;", "k", "()Lq5/p;", "Lq5/s;", "j", "()Lq5/s;", "Lqv/O;", "Lqv/O;", "scope", "Lq5/u;", "Lq5/u;", "systemCallbacks", "Ll5/o;", "Ll5/o;", "requestService", "getComponents", "components", "", "Lg5/b;", "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shutdown", "()Lj5/c;", "getMemoryCache$delegate", "(LZ4/k;)Ljava/lang/Object;", "memoryCache", "()Ld5/a;", "getDiskCache$delegate", "diskCache", "p", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15367c defaults;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<InterfaceC14857c> memoryCacheLazy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy<InterfaceC13485a> diskCacheLazy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<d.a> callFactoryLazy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.InterfaceC0896c eventListenerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z4.b componentRegistry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C16464p options;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16467s logger;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope = C16623P.a(X0.b(null, 1, null).m0(C16639f0.c().Y0()).m0(new g(InterfaceC16619L.INSTANCE, this)));

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16469u systemCallbacks;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C15379o requestService;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Z4.b components;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC14199b> interceptors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean shutdown;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/i;", "<anonymous>", "(Lqv/O;)Ll5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {113}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AbstractC15373i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42329a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15372h f42331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C15372h c15372h, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f42331c = c15372h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new b(this.f42331c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AbstractC15373i> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC16467s logger;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42329a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k kVar = k.this;
                C15372h c15372h = this.f42331c;
                this.f42329a = 1;
                obj = kVar.h(c15372h, 0, this);
                if (obj == objF) {
                    return objF;
                }
            }
            k kVar2 = k.this;
            AbstractC15373i abstractC15373i = (AbstractC15373i) obj;
            if ((abstractC15373i instanceof C15370f) && (logger = kVar2.getLogger()) != null) {
                C16456h.a(logger, "RealImageLoader", ((C15370f) abstractC15373i).getThrowable());
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/i;", "<anonymous>", "(Lqv/O;)Ll5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {138}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AbstractC15373i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42332a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15372h f42334c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f42335d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/i;", "<anonymous>", "(Lqv/O;)Ll5/i;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AbstractC15373i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f42336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f42337b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C15372h f42338c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, C15372h c15372h, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f42337b = kVar;
                this.f42338c = c15372h;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f42337b, this.f42338c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AbstractC15373i> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f42336a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                k kVar = this.f42337b;
                C15372h c15372h = this.f42338c;
                this.f42336a = 1;
                Object objH = kVar.h(c15372h, 1, this);
                if (objH == objF) {
                    return objF;
                }
                return objH;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C15372h c15372h, k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f42334c = c15372h;
            this.f42335d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f42334c, this.f42335d, continuation);
            cVar.f42333b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AbstractC15373i> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42332a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            W<? extends AbstractC15373i> wB = C16648k.b((InterfaceC16622O) this.f42333b, C16639f0.c().Y0(), null, new a(this.f42335d, this.f42334c, null), 2, null);
            C16458j.m(((InterfaceC15780d) this.f42334c.getTarget()).getView()).b(wB);
            this.f42332a = 1;
            Object objB = wB.B(this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/i;", "<anonymous>", "(Lqv/O;)Ll5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$execute$3", f = "RealImageLoader.kt", l = {143}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AbstractC15373i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42339a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15372h f42341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C15372h c15372h, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f42341c = c15372h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new d(this.f42341c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AbstractC15373i> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42339a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            k kVar = k.this;
            C15372h c15372h = this.f42341c;
            this.f42339a = 1;
            Object objH = kVar.h(c15372h, 1, this);
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
        Object f42342a;

        /* renamed from: b, reason: collision with root package name */
        Object f42343b;

        /* renamed from: c, reason: collision with root package name */
        Object f42344c;

        /* renamed from: d, reason: collision with root package name */
        Object f42345d;

        /* renamed from: e, reason: collision with root package name */
        Object f42346e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42347f;

        /* renamed from: h, reason: collision with root package name */
        int f42349h;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42347f = obj;
            this.f42349h |= Integer.MIN_VALUE;
            return k.this.h(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/i;", "<anonymous>", "(Lqv/O;)Ll5/i;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {196}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AbstractC15373i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15372h f42351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f42352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Size f42353d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z4.c f42354e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f42355f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C15372h c15372h, k kVar, Size size, Z4.c cVar, Bitmap bitmap, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f42351b = c15372h;
            this.f42352c = kVar;
            this.f42353d = size;
            this.f42354e = cVar;
            this.f42355f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f42351b, this.f42352c, this.f42353d, this.f42354e, this.f42355f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AbstractC15373i> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42350a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C15372h c15372h = this.f42351b;
            List list = this.f42352c.interceptors;
            C15372h c15372h2 = this.f42351b;
            Size size = this.f42353d;
            Z4.c cVar = this.f42354e;
            if (this.f42355f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g5.c cVar2 = new g5.c(c15372h, list, 0, c15372h2, size, cVar, z10);
            C15372h c15372h3 = this.f42351b;
            this.f42350a = 1;
            Object objF2 = cVar2.f(c15372h3, this);
            if (objF2 == objF) {
                return objF;
            }
            return objF2;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Z4/k$g", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lqv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "l0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends AbstractCoroutineContextElement implements InterfaceC16619L {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f42356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC16619L.Companion companion, k kVar) {
            super(companion);
            this.f42356b = kVar;
        }

        @Override // qv.InterfaceC16619L
        public void l0(CoroutineContext context, Throwable exception) {
            InterfaceC16467s logger = this.f42356b.getLogger();
            if (logger != null) {
                C16456h.a(logger, "RealImageLoader", exception);
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
    public final java.lang.Object h(l5.C15372h r20, int r21, kotlin.coroutines.Continuation<? super l5.AbstractC15373i> r22) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.h(l5.h, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void l(C15372h request, Z4.c eventListener) {
        InterfaceC16467s interfaceC16467s = this.logger;
        if (interfaceC16467s != null && interfaceC16467s.getLevel() <= 4) {
            interfaceC16467s.a("RealImageLoader", 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.a(request);
        C15372h.b listener = request.getListener();
        if (listener != null) {
            listener.a(request);
        }
    }

    @Override // Z4.h
    public InterfaceC13485a a() {
        return this.diskCacheLazy.getValue();
    }

    @Override // Z4.h
    public InterfaceC15369e b(C15372h request) {
        W<? extends AbstractC15373i> wB = C16648k.b(this.scope, null, null, new b(request, null), 3, null);
        return request.getTarget() instanceof InterfaceC15780d ? C16458j.m(((InterfaceC15780d) request.getTarget()).getView()).b(wB) : new C15375k(wB);
    }

    @Override // Z4.h
    /* renamed from: d, reason: from getter */
    public C15367c getDefaults() {
        return this.defaults;
    }

    @Override // Z4.h
    public InterfaceC14857c e() {
        return this.memoryCacheLazy.getValue();
    }

    @Override // Z4.h
    public Z4.b getComponents() {
        return this.components;
    }

    /* renamed from: i, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: j, reason: from getter */
    public final InterfaceC16467s getLogger() {
        return this.logger;
    }

    /* renamed from: k, reason: from getter */
    public final C16464p getOptions() {
        return this.options;
    }

    public final void o(int level) {
        InterfaceC14857c value;
        Lazy<InterfaceC14857c> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.a(level);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, C15367c c15367c, Lazy<? extends InterfaceC14857c> lazy, Lazy<? extends InterfaceC13485a> lazy2, Lazy<? extends d.a> lazy3, c.InterfaceC0896c interfaceC0896c, Z4.b bVar, C16464p c16464p, InterfaceC16467s interfaceC16467s) {
        this.context = context;
        this.defaults = c15367c;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = interfaceC0896c;
        this.componentRegistry = bVar;
        this.options = c16464p;
        this.logger = interfaceC16467s;
        ComponentCallbacks2C16469u componentCallbacks2C16469u = new ComponentCallbacks2C16469u(this);
        this.systemCallbacks = componentCallbacks2C16469u;
        C15379o c15379o = new C15379o(this, componentCallbacks2C16469u, interfaceC16467s);
        this.requestService = c15379o;
        this.components = bVar.h().d(new C14685c(), HttpUrl.class).d(new C14689g(), String.class).d(new C14684b(), Uri.class).d(new C14688f(), Uri.class).d(new C14687e(), Integer.class).d(new C14683a(), byte[].class).c(new C14379c(), Uri.class).c(new C14377a(c16464p.getAddLastModifiedToFileCacheKey()), File.class).b(new k.b(lazy3, lazy2, c16464p.getRespectCacheHeaders()), Uri.class).b(new j.a(), File.class).b(new C13844a.C2078a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new C6359e.c(c16464p.getBitmapFactoryMaxParallelism(), c16464p.getBitmapFactoryExifOrientationPolicy())).e();
        this.interceptors = CollectionsKt.Q0(getComponents().c(), new C14198a(this, componentCallbacks2C16469u, c15379o, interfaceC16467s));
        this.shutdown = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(l5.C15370f r7, n5.InterfaceC15779c r8, Z4.c r9) {
        /*
            r6 = this;
            l5.h r0 = r7.getRequest()
            q5.s r1 = r6.logger
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
            boolean r1 = r8 instanceof p5.InterfaceC16262d
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            l5.h r1 = r7.getRequest()
            p5.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            p5.d r2 = (p5.InterfaceC16262d) r2
            p5.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof p5.C16260b
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.c(r1)
            goto L69
        L58:
            l5.h r8 = r7.getRequest()
            r9.m(r8, r1)
            r1.a()
            l5.h r8 = r7.getRequest()
            r9.o(r8, r1)
        L69:
            r9.c(r0, r7)
            l5.h$b r8 = r0.getListener()
            if (r8 == 0) goto L75
            r8.c(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.m(l5.f, n5.c, Z4.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(l5.C15380p r7, n5.InterfaceC15779c r8, Z4.c r9) {
        /*
            r6 = this;
            l5.h r0 = r7.getRequest()
            c5.g r1 = r7.getDataSource()
            q5.s r2 = r6.logger
            if (r2 == 0) goto L41
            int r3 = r2.getLevel()
            r4 = 4
            if (r3 > r4) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = q5.C16458j.g(r1)
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
            boolean r1 = r8 instanceof p5.InterfaceC16262d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            l5.h r1 = r7.getRequest()
            p5.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            p5.d r2 = (p5.InterfaceC16262d) r2
            p5.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof p5.C16260b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.a(r1)
            goto L74
        L63:
            l5.h r8 = r7.getRequest()
            r9.m(r8, r1)
            r1.a()
            l5.h r8 = r7.getRequest()
            r9.o(r8, r1)
        L74:
            r9.b(r0, r7)
            l5.h$b r8 = r0.getListener()
            if (r8 == 0) goto L80
            r8.b(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.k.n(l5.p, n5.c, Z4.c):void");
    }

    @Override // Z4.h
    public Object c(C15372h c15372h, Continuation<? super AbstractC15373i> continuation) {
        if (c15372h.getTarget() instanceof InterfaceC15780d) {
            return C16623P.g(new c(c15372h, this, null), continuation);
        }
        return C16644i.g(C16639f0.c().Y0(), new d(c15372h, null), continuation);
    }
}
