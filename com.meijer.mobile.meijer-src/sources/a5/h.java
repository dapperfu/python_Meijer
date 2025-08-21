package a5;

import a5.c;
import a5.h;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import e5.InterfaceC13772a;
import k5.InterfaceC15089c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15670i;
import m5.C15664c;
import m5.C15669h;
import m5.EnumC15663b;
import m5.InterfaceC15666e;
import mv.AbstractC15779K;
import okhttp3.OkHttpClient;
import okhttp3.d;
import r5.C16845i;
import r5.C16852p;
import r5.C16856t;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"La5/h;", "", "Lm5/h;", "request", "Lm5/e;", "d", "(Lm5/h;)Lm5/e;", "Lm5/i;", "c", "(Lm5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm5/c;", "b", "()Lm5/c;", "defaults", "La5/b;", "getComponents", "()La5/b;", "components", "Lk5/c;", "e", "()Lk5/c;", "memoryCache", "Le5/a;", "a", "()Le5/a;", "diskCache", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h {

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010<R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010>¨\u0006?"}, d2 = {"La5/h$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "initializer", "o", "(Lkotlin/jvm/functions/Function0;)La5/h$a;", "Lokhttp3/d$a;", "h", "Lk5/c;", "m", "Le5/a;", "i", "", "enable", "p", "(Z)La5/h$a;", "Lmv/K;", "dispatcher", "k", "(Lmv/K;)La5/h$a;", "Lm5/b;", "policy", "n", "(Lm5/b;)La5/h$a;", "j", "Lr5/s;", "logger", "l", "(Lr5/s;)La5/h$a;", "La5/h;", "d", "()La5/h;", "a", "Landroid/content/Context;", "applicationContext", "Lm5/c;", "b", "Lm5/c;", "defaults", "Lkotlin/Lazy;", "c", "Lkotlin/Lazy;", "memoryCache", "diskCache", "e", "callFactory", "La5/c$c;", "f", "La5/c$c;", "eventListenerFactory", "La5/b;", "g", "La5/b;", "componentRegistry", "Lr5/p;", "Lr5/p;", "options", "Lr5/s;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context applicationContext;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private C15664c defaults = C16845i.b();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Lazy<? extends InterfaceC15089c> memoryCache = null;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Lazy<? extends InterfaceC13772a> diskCache = null;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Lazy<? extends d.a> callFactory = null;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private c.InterfaceC0941c eventListenerFactory = null;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b componentRegistry = null;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private C16852p options = new C16852p(false, false, false, 0, null, 31, null);

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16855s logger = null;

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC15089c e(a aVar) {
            return new InterfaceC15089c.a(aVar.applicationContext).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC13772a f(a aVar) {
            return C16856t.f159254a.a(aVar.applicationContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OkHttpClient g() {
            return new OkHttpClient();
        }

        public final h d() {
            Context context = this.applicationContext;
            C15664c c15664c = this.defaults;
            Lazy<? extends InterfaceC15089c> lazyB = this.memoryCache;
            if (lazyB == null) {
                lazyB = LazyKt.b(new Function0() { // from class: a5.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.e(this.f45173a);
                    }
                });
            }
            Lazy<? extends InterfaceC13772a> lazyB2 = this.diskCache;
            if (lazyB2 == null) {
                lazyB2 = LazyKt.b(new Function0() { // from class: a5.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.f(this.f45174a);
                    }
                });
            }
            Lazy<? extends d.a> lazyB3 = this.callFactory;
            if (lazyB3 == null) {
                lazyB3 = LazyKt.b(new Function0() { // from class: a5.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.g();
                    }
                });
            }
            c.InterfaceC0941c interfaceC0941c = this.eventListenerFactory;
            if (interfaceC0941c == null) {
                interfaceC0941c = c.InterfaceC0941c.f45171b;
            }
            b bVar = this.componentRegistry;
            if (bVar == null) {
                bVar = new b();
            }
            return new k(context, c15664c, lazyB, lazyB2, lazyB3, interfaceC0941c, bVar, this.options, this.logger);
        }

        public final a j(EnumC15663b policy) {
            C15664c c15664c = this.defaults;
            this.defaults = c15664c.a((24575 & 1) != 0 ? c15664c.interceptorDispatcher : null, (24575 & 2) != 0 ? c15664c.fetcherDispatcher : null, (24575 & 4) != 0 ? c15664c.decoderDispatcher : null, (24575 & 8) != 0 ? c15664c.transformationDispatcher : null, (24575 & 16) != 0 ? c15664c.transitionFactory : null, (24575 & 32) != 0 ? c15664c.precision : null, (24575 & 64) != 0 ? c15664c.bitmapConfig : null, (24575 & 128) != 0 ? c15664c.allowHardware : false, (24575 & 256) != 0 ? c15664c.allowRgb565 : false, (24575 & 512) != 0 ? c15664c.placeholder : null, (24575 & 1024) != 0 ? c15664c.error : null, (24575 & RecyclerView.m.FLAG_MOVED) != 0 ? c15664c.fallback : null, (24575 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? c15664c.memoryCachePolicy : null, (24575 & 8192) != 0 ? c15664c.diskCachePolicy : policy, (24575 & 16384) != 0 ? c15664c.networkCachePolicy : null);
            return this;
        }

        public final a k(AbstractC15779K dispatcher) {
            C15664c c15664c = this.defaults;
            this.defaults = c15664c.a((24575 & 1) != 0 ? c15664c.interceptorDispatcher : null, (24575 & 2) != 0 ? c15664c.fetcherDispatcher : dispatcher, (24575 & 4) != 0 ? c15664c.decoderDispatcher : dispatcher, (24575 & 8) != 0 ? c15664c.transformationDispatcher : dispatcher, (24575 & 16) != 0 ? c15664c.transitionFactory : null, (24575 & 32) != 0 ? c15664c.precision : null, (24575 & 64) != 0 ? c15664c.bitmapConfig : null, (24575 & 128) != 0 ? c15664c.allowHardware : false, (24575 & 256) != 0 ? c15664c.allowRgb565 : false, (24575 & 512) != 0 ? c15664c.placeholder : null, (24575 & 1024) != 0 ? c15664c.error : null, (24575 & RecyclerView.m.FLAG_MOVED) != 0 ? c15664c.fallback : null, (24575 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? c15664c.memoryCachePolicy : null, (24575 & 8192) != 0 ? c15664c.diskCachePolicy : null, (24575 & 16384) != 0 ? c15664c.networkCachePolicy : null);
            return this;
        }

        public final a l(InterfaceC16855s logger) {
            this.logger = logger;
            return this;
        }

        public final a n(EnumC15663b policy) {
            C15664c c15664c = this.defaults;
            this.defaults = c15664c.a((24575 & 1) != 0 ? c15664c.interceptorDispatcher : null, (24575 & 2) != 0 ? c15664c.fetcherDispatcher : null, (24575 & 4) != 0 ? c15664c.decoderDispatcher : null, (24575 & 8) != 0 ? c15664c.transformationDispatcher : null, (24575 & 16) != 0 ? c15664c.transitionFactory : null, (24575 & 32) != 0 ? c15664c.precision : null, (24575 & 64) != 0 ? c15664c.bitmapConfig : null, (24575 & 128) != 0 ? c15664c.allowHardware : false, (24575 & 256) != 0 ? c15664c.allowRgb565 : false, (24575 & 512) != 0 ? c15664c.placeholder : null, (24575 & 1024) != 0 ? c15664c.error : null, (24575 & RecyclerView.m.FLAG_MOVED) != 0 ? c15664c.fallback : null, (24575 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? c15664c.memoryCachePolicy : policy, (24575 & 8192) != 0 ? c15664c.diskCachePolicy : null, (24575 & 16384) != 0 ? c15664c.networkCachePolicy : null);
            return this;
        }

        public final a p(boolean enable) {
            this.options = C16852p.b(this.options, false, false, enable, 0, null, 27, null);
            return this;
        }

        public a(Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        public final a h(Function0<? extends d.a> initializer) {
            this.callFactory = LazyKt.b(initializer);
            return this;
        }

        public final a i(Function0<? extends InterfaceC13772a> initializer) {
            this.diskCache = LazyKt.b(initializer);
            return this;
        }

        public final a m(Function0<? extends InterfaceC15089c> initializer) {
            this.memoryCache = LazyKt.b(initializer);
            return this;
        }

        public final a o(Function0<? extends OkHttpClient> initializer) {
            return h(initializer);
        }
    }

    InterfaceC13772a a();

    /* renamed from: b */
    C15664c getDefaults();

    Object c(C15669h c15669h, Continuation<? super AbstractC15670i> continuation);

    InterfaceC15666e d(C15669h request);

    InterfaceC15089c e();

    b getComponents();
}
