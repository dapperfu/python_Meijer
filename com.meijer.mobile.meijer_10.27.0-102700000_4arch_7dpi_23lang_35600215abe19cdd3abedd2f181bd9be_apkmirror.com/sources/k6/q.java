package k6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.t1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import g6.C14209i;
import g6.InterfaceC14200A;
import g6.u;
import g6.z;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import k6.InterfaceC15110m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16639f0;
import qv.C16644i;
import qv.C16658p;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008d\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022H\b\u0002\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aF\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a*\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b#\u0010$\u001a)\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*\u001a2\u0010+\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b+\u0010,\u001a1\u0010/\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100\u001a!\u00104\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u00108\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b8\u00107¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, d2 = {"Lk6/m;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "", "onRetry", "Lk6/k;", "r", "(Lk6/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lk6/k;", "Landroid/content/Context;", "context", "Lg6/i;", "m", "(Landroid/content/Context;Lk6/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/q;", "n", "(Landroid/content/Context;Lk6/m;Ljava/lang/String;Z)Lcom/airbnb/lottie/q;", "T", "h", "(Lcom/airbnb/lottie/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "l", "(Landroid/content/Context;Lg6/i;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg6/z;", "asset", "p", "(Landroid/content/Context;Lg6/z;Ljava/lang/String;)V", "o", "(Lg6/z;)V", "k", "(Landroid/content/Context;Lg6/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln6/c;", "font", "q", "(Landroid/content/Context;Ln6/c;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", "t", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "j", "(Ljava/lang/String;)Ljava/lang/String;", "i", "Lk6/l;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class q {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "c", "kotlin.jvm.PlatformType", "onResult", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<T> implements InterfaceC14200A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<T> f141581a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16654n<? super T> interfaceC16654n) {
            this.f141581a = interfaceC16654n;
        }

        @Override // g6.InterfaceC14200A
        public final void onResult(T t10) {
            if (this.f141581a.A()) {
                return;
            }
            this.f141581a.resumeWith(Result.b(t10));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "e", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b<T> implements InterfaceC14200A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<T> f141582a;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC16654n<? super T> interfaceC16654n) {
            this.f141582a = interfaceC16654n;
        }

        @Override // g6.InterfaceC14200A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th2) {
            if (this.f141582a.A()) {
                return;
            }
            InterfaceC16654n<T> interfaceC16654n = this.f141582a;
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.g(th2);
            interfaceC16654n.resumeWith(Result.b(ResultKt.a(th2)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14209i f141584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f141585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f141586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f141587e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C14209i c14209i, Context context, String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f141584b = c14209i;
            this.f141585c = context;
            this.f141586d = str;
            this.f141587e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f141584b, this.f141585c, this.f141586d, this.f141587e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f141583a == 0) {
                ResultKt.b(obj);
                for (n6.c cVar : this.f141584b.g().values()) {
                    Context context = this.f141585c;
                    Intrinsics.g(cVar);
                    q.q(context, cVar, this.f141586d, this.f141587e);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14209i f141589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f141590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f141591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C14209i c14209i, Context context, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f141589b = c14209i;
            this.f141590c = context;
            this.f141591d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f141589b, this.f141590c, this.f141591d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.f();
            if (this.f141588a == 0) {
                ResultKt.b(obj);
                for (z zVar : this.f141589b.j().values()) {
                    Intrinsics.g(zVar);
                    q.o(zVar);
                    q.p(this.f141590c, zVar, this.f141591d);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {128, 129, 130}, m = "lottieComposition")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f141592a;

        /* renamed from: b, reason: collision with root package name */
        Object f141593b;

        /* renamed from: c, reason: collision with root package name */
        Object f141594c;

        /* renamed from: d, reason: collision with root package name */
        Object f141595d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f141596e;

        /* renamed from: f, reason: collision with root package name */
        int f141597f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f141596e = obj;
            this.f141597f |= Integer.MIN_VALUE;
            return q.m(null, null, null, null, null, null, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141598a;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        public final Object d(int i10, Throwable th2, Continuation<? super Boolean> continuation) {
            return new f(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th2, Continuation<? super Boolean> continuation) {
            return d(num.intValue(), th2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f141598a == 0) {
                ResultKt.b(obj);
                return Boxing.a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {93, 95}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f141599a;

        /* renamed from: b, reason: collision with root package name */
        int f141600b;

        /* renamed from: c, reason: collision with root package name */
        int f141601c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> f141602d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f141603e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15110m f141604f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f141605g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f141606h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f141607i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f141608j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C15109l> f141609k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, InterfaceC15110m interfaceC15110m, String str, String str2, String str3, String str4, InterfaceC5730l0<C15109l> interfaceC5730l0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f141602d = function3;
            this.f141603e = context;
            this.f141604f = interfaceC15110m;
            this.f141605g = str;
            this.f141606h = str2;
            this.f141607i = str3;
            this.f141608j = str4;
            this.f141609k = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f141602d, this.f141603e, this.f141604f, this.f141605g, this.f141606h, this.f141607i, this.f141608j, this.f141609k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k6.q.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str) {
        if (str == null || StringsKt.r0(str)) {
            return null;
        }
        if (StringsKt.f0(str, '/', false, 2, null)) {
            return str;
        }
        return str + q2.f92724c;
    }

    private static final <T> Object h(com.airbnb.lottie.q<T> qVar, Continuation<? super T> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        qVar.d(new a(c16658p)).c(new b(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(android.content.Context r6, k6.InterfaceC15110m r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation<? super g6.C14209i> r12) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.q.m(android.content.Context, k6.m, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final com.airbnb.lottie.q<C14209i> n(Context context, InterfaceC15110m interfaceC15110m, String str, boolean z10) throws FileNotFoundException {
        if (interfaceC15110m instanceof InterfaceC15110m.e) {
            return Intrinsics.e(str, "__LottieInternalDefaultCacheKey__") ? u.D(context, ((InterfaceC15110m.e) interfaceC15110m).getResId()) : u.E(context, ((InterfaceC15110m.e) interfaceC15110m).getResId(), str);
        }
        if (interfaceC15110m instanceof InterfaceC15110m.f) {
            return Intrinsics.e(str, "__LottieInternalDefaultCacheKey__") ? u.H(context, ((InterfaceC15110m.f) interfaceC15110m).getUrl()) : u.I(context, ((InterfaceC15110m.f) interfaceC15110m).getUrl(), str);
        }
        if (interfaceC15110m instanceof InterfaceC15110m.c) {
            if (z10) {
                return null;
            }
            InterfaceC15110m.c cVar = (InterfaceC15110m.c) interfaceC15110m;
            FileInputStream fileInputStream = new FileInputStream(cVar.getFileName());
            if (Intrinsics.e(str, "__LottieInternalDefaultCacheKey__")) {
                str = cVar.getFileName();
            }
            return StringsKt.G(cVar.getFileName(), "zip", false, 2, null) ? u.K(new ZipInputStream(fileInputStream), str) : StringsKt.G(cVar.getFileName(), "tgs", false, 2, null) ? u.t(new GZIPInputStream(fileInputStream), str) : u.t(fileInputStream, str);
        }
        if (interfaceC15110m instanceof InterfaceC15110m.a) {
            return Intrinsics.e(str, "__LottieInternalDefaultCacheKey__") ? u.n(context, ((InterfaceC15110m.a) interfaceC15110m).getAssetName()) : u.o(context, ((InterfaceC15110m.a) interfaceC15110m).getAssetName(), str);
        }
        if (interfaceC15110m instanceof InterfaceC15110m.d) {
            if (Intrinsics.e(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((InterfaceC15110m.d) interfaceC15110m).getJsonString().hashCode());
            }
            return u.B(((InterfaceC15110m.d) interfaceC15110m).getJsonString(), str);
        }
        if (!(interfaceC15110m instanceof InterfaceC15110m.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15110m.b bVar = (InterfaceC15110m.b) interfaceC15110m;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(bVar.getUri());
        if (Intrinsics.e(str, "__LottieInternalDefaultCacheKey__")) {
            str = bVar.getUri().toString();
        }
        return u.r(context, inputStreamOpenInputStream, str);
    }

    @JvmOverloads
    public static final InterfaceC15108k r(InterfaceC15110m spec, String str, String str2, String str3, String str4, Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Composer composer, int i10, int i11) {
        Intrinsics.j(spec, "spec");
        composer.startReplaceableGroup(-1248473602);
        String str5 = (i11 & 2) != 0 ? null : str;
        String str6 = (i11 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i11 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i11 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> fVar = (i11 & 32) != 0 ? new f(null) : function3;
        if (ComposerKt.M()) {
            ComposerKt.U(-1248473602, i10, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:83)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.startReplaceableGroup(1388713953);
        int i12 = i10 & 14;
        int i13 = i12 ^ 6;
        boolean z10 = (i13 > 4 && composer.V(spec)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = t1.e(new C15109l(), null, 2, null);
            composer.t(objB);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
        composer.U();
        composer.startReplaceableGroup(1388714244);
        boolean z11 = ((i13 > 4 && composer.V(spec)) || (i10 & 6) == 4) | ((((57344 & i10) ^ 24576) > 16384 && composer.V(str8)) || (i10 & 24576) == 16384);
        Object objB2 = composer.B();
        if (z11 || objB2 == Composer.INSTANCE.a()) {
            objB2 = n(context, spec, str8, true);
            composer.t(objB2);
        }
        composer.U();
        J.f(spec, str8, new g(fVar, context, spec, str5, str6, str7, str8, interfaceC5730l0, null), composer, i12 | 512 | ((i10 >> 9) & 112));
        C15109l c15109lS = s(interfaceC5730l0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return c15109lS;
    }

    private static final Typeface t(Typeface typeface, String str) {
        int i10 = 0;
        boolean zC0 = StringsKt.c0(str, "Italic", false, 2, null);
        boolean zC02 = StringsKt.c0(str, "Bold", false, 2, null);
        if (zC0 && zC02) {
            i10 = 3;
        } else if (zC0) {
            i10 = 2;
        } else if (zC02) {
            i10 = 1;
        }
        return typeface.getStyle() == i10 ? typeface : FS.typefaceCreateDerived(typeface, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        if (StringsKt.r0(str) || StringsKt.W(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    private static final Object k(Context context, C14209i c14209i, String str, String str2, Continuation<? super Unit> continuation) {
        if (c14209i.g().isEmpty()) {
            return Unit.f142422a;
        }
        Object objG = C16644i.g(C16639f0.b(), new c(c14209i, context, str, str2, null), continuation);
        if (objG == IntrinsicsKt.f()) {
            return objG;
        }
        return Unit.f142422a;
    }

    private static final Object l(Context context, C14209i c14209i, String str, Continuation<? super Unit> continuation) {
        if (!c14209i.r()) {
            return Unit.f142422a;
        }
        Object objG = C16644i.g(C16639f0.b(), new d(c14209i, context, str, null), continuation);
        if (objG == IntrinsicsKt.f()) {
            return objG;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(z zVar) {
        if (zVar.b() == null) {
            String strC = zVar.c();
            Intrinsics.g(strC);
            if (StringsKt.W(strC, "data:", false, 2, null) && StringsKt.p0(strC, "base64,", 0, false, 6, null) > 0) {
                try {
                    String strSubstring = strC.substring(StringsKt.o0(strC, ',', 0, false, 6, null) + 1);
                    Intrinsics.i(strSubstring, "substring(...)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    zVar.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                } catch (IllegalArgumentException e10) {
                    u6.g.d("data URL did not have correct base64 format.", e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Context context, z zVar, String str) throws IOException {
        if (zVar.b() == null && str != null) {
            String strC = zVar.c();
            try {
                InputStream inputStreamOpen = context.getAssets().open(str + strC);
                Intrinsics.g(inputStreamOpen);
                Bitmap bitmapDecodeStream = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                } catch (IllegalArgumentException e10) {
                    u6.g.d("Unable to decode image.", e10);
                }
                if (bitmapDecodeStream != null) {
                    zVar.g(u6.q.m(bitmapDecodeStream, zVar.f(), zVar.d()));
                }
            } catch (IOException e11) {
                u6.g.d("Unable to open asset.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Context context, n6.c cVar, String str, String str2) {
        String str3 = str + cVar.a() + str2;
        try {
            Typeface typefaceTypefaceCreateFromAsset = FS.typefaceCreateFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.g(typefaceTypefaceCreateFromAsset);
                String strC = cVar.c();
                Intrinsics.i(strC, "getStyle(...)");
                cVar.e(t(typefaceTypefaceCreateFromAsset, strC));
            } catch (Exception e10) {
                u6.g.b("Failed to create " + cVar.a() + " typeface with style=" + cVar.c() + "!", e10);
            }
        } catch (Exception e11) {
            u6.g.b("Failed to find typeface in assets with path " + str3 + ".", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15109l s(InterfaceC5730l0<C15109l> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }
}
