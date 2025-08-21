package h5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d5.EnumC13623g;
import g5.m;
import h5.InterfaceC14468b;
import java.util.List;
import k5.C15090d;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import m5.C15673l;
import m5.C15676o;
import m5.C15677p;
import mv.C15805i;
import mv.InterfaceC15783O;
import p5.InterfaceC16405a;
import r5.C16837a;
import r5.C16846j;
import r5.C16849m;
import r5.ComponentCallbacks2C16857u;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u00022,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J0\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lh5/a;", "Lh5/b;", "La5/h;", "imageLoader", "Lr5/u;", "systemCallbacks", "Lm5/o;", "requestService", "Lr5/s;", "logger", "<init>", "(La5/h;Lr5/u;Lm5/o;Lr5/s;)V", "Lm5/h;", "request", "", "mappedData", "Lm5/l;", "_options", "La5/c;", "eventListener", "Lh5/a$b;", "j", "(Lm5/h;Ljava/lang/Object;Lm5/l;La5/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "La5/b;", "components", "options", "Lg5/h;", "k", "(La5/b;Lm5/h;Ljava/lang/Object;Lm5/l;La5/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg5/m;", "fetchResult", "i", "(Lg5/m;La5/b;Lm5/h;Ljava/lang/Object;Lm5/l;La5/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "Lp5/a;", "transformations", "Landroid/graphics/Bitmap;", "h", "(Landroid/graphics/drawable/Drawable;Lm5/l;Ljava/util/List;)Landroid/graphics/Bitmap;", "Lh5/b$a;", "chain", "Lm5/i;", "a", "(Lh5/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "l", "(Lh5/a$b;Lm5/h;Lm5/l;La5/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "La5/h;", "b", "Lr5/u;", "c", "Lm5/o;", "d", "Lr5/s;", "Lk5/d;", "e", "Lk5/d;", "memoryCacheService", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14467a implements InterfaceC14468b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a5.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16857u systemCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15676o requestService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16855s logger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C15090d memoryCacheService;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh5/a$b;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Ld5/g;", "dataSource", "", "diskCacheKey", "<init>", "(Landroid/graphics/drawable/Drawable;ZLd5/g;Ljava/lang/String;)V", "a", "(Landroid/graphics/drawable/Drawable;ZLd5/g;Ljava/lang/String;)Lh5/a$b;", "Landroid/graphics/drawable/Drawable;", "e", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "f", "()Z", "c", "Ld5/g;", "()Ld5/g;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: h5.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Drawable drawable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isSampled;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final EnumC13623g dataSource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String diskCacheKey;

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, EnumC13623g enumC13623g, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.drawable;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.isSampled;
            }
            if ((i10 & 4) != 0) {
                enumC13623g = bVar.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = bVar.diskCacheKey;
            }
            return bVar.a(drawable, z10, enumC13623g, str);
        }

        public final b a(Drawable drawable, boolean isSampled, EnumC13623g dataSource, String diskCacheKey) {
            return new b(drawable, isSampled, dataSource, diskCacheKey);
        }

        /* renamed from: c, reason: from getter */
        public final EnumC13623g getDataSource() {
            return this.dataSource;
        }

        /* renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        /* renamed from: e, reason: from getter */
        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public b(Drawable drawable, boolean z10, EnumC13623g enumC13623g, String str) {
            this.drawable = drawable;
            this.isSampled = z10;
            this.dataSource = enumC13623g;
            this.diskCacheKey = str;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION}, m = "decode")
    /* renamed from: h5.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f134928a;

        /* renamed from: b, reason: collision with root package name */
        Object f134929b;

        /* renamed from: c, reason: collision with root package name */
        Object f134930c;

        /* renamed from: d, reason: collision with root package name */
        Object f134931d;

        /* renamed from: e, reason: collision with root package name */
        Object f134932e;

        /* renamed from: f, reason: collision with root package name */
        Object f134933f;

        /* renamed from: g, reason: collision with root package name */
        Object f134934g;

        /* renamed from: h, reason: collision with root package name */
        Object f134935h;

        /* renamed from: i, reason: collision with root package name */
        int f134936i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f134937j;

        /* renamed from: l, reason: collision with root package name */
        int f134939l;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f134937j = obj;
            this.f134939l |= Integer.MIN_VALUE;
            return C14467a.this.i(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    /* renamed from: h5.a$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f134940a;

        /* renamed from: b, reason: collision with root package name */
        Object f134941b;

        /* renamed from: c, reason: collision with root package name */
        Object f134942c;

        /* renamed from: d, reason: collision with root package name */
        Object f134943d;

        /* renamed from: e, reason: collision with root package name */
        Object f134944e;

        /* renamed from: f, reason: collision with root package name */
        Object f134945f;

        /* renamed from: g, reason: collision with root package name */
        Object f134946g;

        /* renamed from: h, reason: collision with root package name */
        Object f134947h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f134948i;

        /* renamed from: k, reason: collision with root package name */
        int f134950k;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f134948i = obj;
            this.f134950k |= Integer.MIN_VALUE;
            return C14467a.this.j(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lh5/a$b;", "<anonymous>", "(Lmv/O;)Lh5/a$b;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    /* renamed from: h5.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134951a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<g5.h> f134953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<a5.b> f134954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15669h f134955e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f134956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C15673l> f134957g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a5.c f134958h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref.ObjectRef<g5.h> objectRef, Ref.ObjectRef<a5.b> objectRef2, C15669h c15669h, Object obj, Ref.ObjectRef<C15673l> objectRef3, a5.c cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f134953c = objectRef;
            this.f134954d = objectRef2;
            this.f134955e = c15669h;
            this.f134956f = obj;
            this.f134957g = objectRef3;
            this.f134958h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14467a.this.new e(this.f134953c, this.f134954d, this.f134955e, this.f134956f, this.f134957g, this.f134958h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super b> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134951a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C14467a c14467a = C14467a.this;
            m mVar = (m) this.f134953c.f143742a;
            a5.b bVar = this.f134954d.f143742a;
            C15669h c15669h = this.f134955e;
            Object obj2 = this.f134956f;
            C15673l c15673l = this.f134957g.f143742a;
            a5.c cVar = this.f134958h;
            this.f134951a = 1;
            Object objI = c14467a.i(mVar, bVar, c15669h, obj2, c15673l, cVar, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    /* renamed from: h5.a$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f134959a;

        /* renamed from: b, reason: collision with root package name */
        Object f134960b;

        /* renamed from: c, reason: collision with root package name */
        Object f134961c;

        /* renamed from: d, reason: collision with root package name */
        Object f134962d;

        /* renamed from: e, reason: collision with root package name */
        Object f134963e;

        /* renamed from: f, reason: collision with root package name */
        Object f134964f;

        /* renamed from: g, reason: collision with root package name */
        Object f134965g;

        /* renamed from: h, reason: collision with root package name */
        int f134966h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f134967i;

        /* renamed from: k, reason: collision with root package name */
        int f134969k;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f134967i = obj;
            this.f134969k |= Integer.MIN_VALUE;
            return C14467a.this.k(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    /* renamed from: h5.a$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f134970a;

        /* renamed from: b, reason: collision with root package name */
        Object f134971b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f134972c;

        /* renamed from: e, reason: collision with root package name */
        int f134974e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f134972c = obj;
            this.f134974e |= Integer.MIN_VALUE;
            return C14467a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lm5/p;", "<anonymous>", "(Lmv/O;)Lm5/p;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: h5.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super C15677p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134975a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15669h f134977c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f134978d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15673l f134979e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a5.c f134980f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC15089c.Key f134981g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14468b.a f134982h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C15669h c15669h, Object obj, C15673l c15673l, a5.c cVar, InterfaceC15089c.Key key, InterfaceC14468b.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f134977c = c15669h;
            this.f134978d = obj;
            this.f134979e = c15673l;
            this.f134980f = cVar;
            this.f134981g = key;
            this.f134982h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14467a.this.new h(this.f134977c, this.f134978d, this.f134979e, this.f134980f, this.f134981g, this.f134982h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super C15677p> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objJ;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134975a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    objJ = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14467a c14467a = C14467a.this;
                C15669h c15669h = this.f134977c;
                Object obj2 = this.f134978d;
                C15673l c15673l = this.f134979e;
                a5.c cVar = this.f134980f;
                this.f134975a = 1;
                objJ = c14467a.j(c15669h, obj2, c15673l, cVar, this);
                if (objJ == objF) {
                    return objF;
                }
            }
            b bVar = (b) objJ;
            C14467a.this.systemCallbacks.c();
            boolean zH = C14467a.this.memoryCacheService.h(this.f134981g, this.f134977c, bVar);
            Drawable drawable = bVar.getDrawable();
            C15669h c15669h2 = this.f134977c;
            EnumC13623g dataSource = bVar.getDataSource();
            InterfaceC15089c.Key key = this.f134981g;
            if (!zH) {
                key = null;
            }
            return new C15677p(drawable, c15669h2, dataSource, key, bVar.getDiskCacheKey(), bVar.getIsSampled(), C16846j.u(this.f134982h));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lh5/a$b;", "<anonymous>", "(Lmv/O;)Lh5/a$b;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: h5.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f134983a;

        /* renamed from: b, reason: collision with root package name */
        Object f134984b;

        /* renamed from: c, reason: collision with root package name */
        int f134985c;

        /* renamed from: d, reason: collision with root package name */
        int f134986d;

        /* renamed from: e, reason: collision with root package name */
        int f134987e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f134988f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f134990h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C15673l f134991i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC16405a> f134992j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ a5.c f134993k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C15669h f134994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(b bVar, C15673l c15673l, List<? extends InterfaceC16405a> list, a5.c cVar, C15669h c15669h, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f134990h = bVar;
            this.f134991i = c15673l;
            this.f134992j = list;
            this.f134993k = cVar;
            this.f134994l = c15669h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = C14467a.this.new i(this.f134990h, this.f134991i, this.f134992j, this.f134993k, this.f134994l, continuation);
            iVar.f134988f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super b> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0073 -> B:13:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f134987e
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r10.f134986d
                int r3 = r10.f134985c
                java.lang.Object r4 = r10.f134984b
                m5.l r4 = (m5.C15673l) r4
                java.lang.Object r5 = r10.f134983a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f134988f
                mv.O r6 = (mv.InterfaceC15783O) r6
                kotlin.ResultKt.b(r11)
                goto L76
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f134988f
                mv.O r11 = (mv.InterfaceC15783O) r11
                h5.a r1 = h5.C14467a.this
                h5.a$b r3 = r10.f134990h
                android.graphics.drawable.Drawable r3 = r3.getDrawable()
                m5.l r4 = r10.f134991i
                java.util.List<p5.a> r5 = r10.f134992j
                android.graphics.Bitmap r1 = h5.C14467a.b(r1, r3, r4, r5)
                a5.c r3 = r10.f134993k
                m5.h r4 = r10.f134994l
                r3.o(r4, r1)
                java.util.List<p5.a> r3 = r10.f134992j
                m5.l r4 = r10.f134991i
                r5 = r3
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
                r9 = r6
                r6 = r11
                r11 = r1
                r1 = r5
                r5 = r3
                r3 = r9
            L57:
                if (r3 >= r1) goto L7d
                java.lang.Object r7 = r5.get(r3)
                p5.a r7 = (p5.InterfaceC16405a) r7
                n5.i r8 = r4.getSize()
                r10.f134988f = r6
                r10.f134983a = r5
                r10.f134984b = r4
                r10.f134985c = r3
                r10.f134986d = r1
                r10.f134987e = r2
                java.lang.Object r11 = r7.b(r11, r8, r10)
                if (r11 != r0) goto L76
                return r0
            L76:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                mv.C15784P.h(r6)
                int r3 = r3 + r2
                goto L57
            L7d:
                a5.c r0 = r10.f134993k
                m5.h r1 = r10.f134994l
                r0.e(r1, r11)
                h5.a$b r2 = r10.f134990h
                m5.h r0 = r10.f134994l
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                h5.a$b r11 = h5.C14467a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: h5.C14467a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d3, code lost:
    
        if (r0 == r9) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, m5.l] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, a5.b] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, a5.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(m5.C15669h r24, java.lang.Object r25, m5.C15673l r26, a5.c r27, kotlin.coroutines.Continuation<? super h5.C14467a.b> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C14467a.j(m5.h, java.lang.Object, m5.l, a5.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap h(Drawable drawable, C15673l options, List<? extends InterfaceC16405a> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configC = C16837a.c(bitmap);
            if (ArraysKt.Y(C16846j.p(), configC)) {
                return bitmap;
            }
            InterfaceC16855s interfaceC16855s = this.logger;
            if (interfaceC16855s != null && interfaceC16855s.getLevel() <= 4) {
                interfaceC16855s.a("EngineInterceptor", 4, "Converting bitmap with config " + configC + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            InterfaceC16855s interfaceC16855s2 = this.logger;
            if (interfaceC16855s2 != null && interfaceC16855s2.getLevel() <= 4) {
                interfaceC16855s2.a("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return C16849m.f159240a.a(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(g5.m r8, a5.b r9, m5.C15669h r10, java.lang.Object r11, m5.C15673l r12, a5.c r13, kotlin.coroutines.Continuation<? super h5.C14467a.b> r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C14467a.i(g5.m, a5.b, m5.h, java.lang.Object, m5.l, a5.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a5.b r8, m5.C15669h r9, java.lang.Object r10, m5.C15673l r11, a5.c r12, kotlin.coroutines.Continuation<? super g5.h> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C14467a.k(a5.b, m5.h, java.lang.Object, m5.l, a5.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // h5.InterfaceC14468b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(h5.InterfaceC14468b.a r14, kotlin.coroutines.Continuation<? super m5.AbstractC15670i> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof h5.C14467a.g
            if (r0 == 0) goto L13
            r0 = r15
            h5.a$g r0 = (h5.C14467a.g) r0
            int r1 = r0.f134974e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134974e = r1
            goto L18
        L13:
            h5.a$g r0 = new h5.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f134972c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f134974e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.f134971b
            h5.b$a r14 = (h5.InterfaceC14468b.a) r14
            java.lang.Object r0 = r0.f134970a
            r1 = r0
            h5.a r1 = (h5.C14467a) r1
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Throwable -> L32
            return r15
        L32:
            r0 = move-exception
            r15 = r0
            r5 = r13
            goto Lae
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            kotlin.ResultKt.b(r15)
            m5.h r6 = r14.getRequest()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r15 = r6.getData()     // Catch: java.lang.Throwable -> La9
            n5.i r2 = r14.getSize()     // Catch: java.lang.Throwable -> La9
            a5.c r9 = r5.C16846j.h(r14)     // Catch: java.lang.Throwable -> La9
            m5.o r4 = r13.requestService     // Catch: java.lang.Throwable -> La9
            m5.l r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> La9
            n5.h r4 = r8.getScale()     // Catch: java.lang.Throwable -> La9
            r9.i(r6, r15)     // Catch: java.lang.Throwable -> La9
            a5.h r5 = r13.imageLoader     // Catch: java.lang.Throwable -> La9
            a5.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> La9
            r9.q(r6, r7)     // Catch: java.lang.Throwable -> La9
            k5.d r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> La9
            k5.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L80
            k5.d r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L7b
            k5.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r15 = r0
            r1 = r13
            r5 = r1
            goto Lae
        L80:
            r15 = 0
        L81:
            if (r15 == 0) goto L8a
            k5.d r0 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L7b
            m5.p r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L7b
            return r14
        L8a:
            mv.K r15 = r6.getFetcherDispatcher()     // Catch: java.lang.Throwable -> La9
            h5.a$h r4 = new h5.a$h     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            r0.f134970a = r5     // Catch: java.lang.Throwable -> La4
            r0.f134971b = r11     // Catch: java.lang.Throwable -> La4
            r0.f134974e = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = mv.C15805i.g(r15, r4, r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto La3
            return r1
        La3:
            return r14
        La4:
            r0 = move-exception
            r15 = r0
            r1 = r5
            r14 = r11
            goto Lae
        La9:
            r0 = move-exception
            r5 = r13
            r11 = r14
            r15 = r0
            r1 = r5
        Lae:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbd
            m5.o r0 = r1.requestService
            m5.h r14 = r14.getRequest()
            m5.f r14 = r0.a(r14, r15)
            return r14
        Lbd:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C14467a.a(h5.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public C14467a(a5.h hVar, ComponentCallbacks2C16857u componentCallbacks2C16857u, C15676o c15676o, InterfaceC16855s interfaceC16855s) {
        this.imageLoader = hVar;
        this.systemCallbacks = componentCallbacks2C16857u;
        this.requestService = c15676o;
        this.logger = interfaceC16855s;
        this.memoryCacheService = new C15090d(hVar, c15676o, interfaceC16855s);
    }

    public final Object l(b bVar, C15669h c15669h, C15673l c15673l, a5.c cVar, Continuation<? super b> continuation) {
        List<InterfaceC16405a> listO = c15669h.O();
        if (listO.isEmpty()) {
            return bVar;
        }
        if (!(bVar.getDrawable() instanceof BitmapDrawable) && !c15669h.getAllowConversionToBitmap()) {
            InterfaceC16855s interfaceC16855s = this.logger;
            if (interfaceC16855s != null && interfaceC16855s.getLevel() <= 4) {
                interfaceC16855s.a("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.getDrawable().getClass().getCanonicalName() + '.', null);
            }
            return bVar;
        }
        return C15805i.g(c15669h.getTransformationDispatcher(), new i(bVar, c15673l, listO, cVar, c15669h, null), continuation);
    }
}
