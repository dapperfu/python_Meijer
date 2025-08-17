package g5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.EnumC6361g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import f5.m;
import g5.InterfaceC14199b;
import j5.C14858d;
import j5.InterfaceC14857c;
import java.util.List;
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
import l5.C15372h;
import l5.C15376l;
import l5.C15379o;
import l5.C15380p;
import o5.InterfaceC15996a;
import q5.C16449a;
import q5.C16458j;
import q5.C16461m;
import q5.ComponentCallbacks2C16469u;
import q5.InterfaceC16467s;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u00022,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J0\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lg5/a;", "Lg5/b;", "LZ4/h;", "imageLoader", "Lq5/u;", "systemCallbacks", "Ll5/o;", "requestService", "Lq5/s;", "logger", "<init>", "(LZ4/h;Lq5/u;Ll5/o;Lq5/s;)V", "Ll5/h;", "request", "", "mappedData", "Ll5/l;", "_options", "LZ4/c;", "eventListener", "Lg5/a$b;", "j", "(Ll5/h;Ljava/lang/Object;Ll5/l;LZ4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ4/b;", "components", "options", "Lf5/h;", "k", "(LZ4/b;Ll5/h;Ljava/lang/Object;Ll5/l;LZ4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf5/m;", "fetchResult", "i", "(Lf5/m;LZ4/b;Ll5/h;Ljava/lang/Object;Ll5/l;LZ4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "Lo5/a;", "transformations", "Landroid/graphics/Bitmap;", "h", "(Landroid/graphics/drawable/Drawable;Ll5/l;Ljava/util/List;)Landroid/graphics/Bitmap;", "Lg5/b$a;", "chain", "Ll5/i;", "a", "(Lg5/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "l", "(Lg5/a$b;Ll5/h;Ll5/l;LZ4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ4/h;", "b", "Lq5/u;", "c", "Ll5/o;", "d", "Lq5/s;", "Lj5/d;", "e", "Lj5/d;", "memoryCacheService", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14198a implements InterfaceC14199b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z4.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16469u systemCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15379o requestService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16467s logger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C14858d memoryCacheService;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg5/a$b;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lc5/g;", "dataSource", "", "diskCacheKey", "<init>", "(Landroid/graphics/drawable/Drawable;ZLc5/g;Ljava/lang/String;)V", "a", "(Landroid/graphics/drawable/Drawable;ZLc5/g;Ljava/lang/String;)Lg5/a$b;", "Landroid/graphics/drawable/Drawable;", "e", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "f", "()Z", "c", "Lc5/g;", "()Lc5/g;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g5.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Drawable drawable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isSampled;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final EnumC6361g dataSource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String diskCacheKey;

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, EnumC6361g enumC6361g, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.drawable;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.isSampled;
            }
            if ((i10 & 4) != 0) {
                enumC6361g = bVar.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = bVar.diskCacheKey;
            }
            return bVar.a(drawable, z10, enumC6361g, str);
        }

        public final b a(Drawable drawable, boolean isSampled, EnumC6361g dataSource, String diskCacheKey) {
            return new b(drawable, isSampled, dataSource, diskCacheKey);
        }

        /* renamed from: c, reason: from getter */
        public final EnumC6361g getDataSource() {
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

        public b(Drawable drawable, boolean z10, EnumC6361g enumC6361g, String str) {
            this.drawable = drawable;
            this.isSampled = z10;
            this.dataSource = enumC6361g;
            this.diskCacheKey = str;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION}, m = "decode")
    /* renamed from: g5.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132752a;

        /* renamed from: b, reason: collision with root package name */
        Object f132753b;

        /* renamed from: c, reason: collision with root package name */
        Object f132754c;

        /* renamed from: d, reason: collision with root package name */
        Object f132755d;

        /* renamed from: e, reason: collision with root package name */
        Object f132756e;

        /* renamed from: f, reason: collision with root package name */
        Object f132757f;

        /* renamed from: g, reason: collision with root package name */
        Object f132758g;

        /* renamed from: h, reason: collision with root package name */
        Object f132759h;

        /* renamed from: i, reason: collision with root package name */
        int f132760i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f132761j;

        /* renamed from: l, reason: collision with root package name */
        int f132763l;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132761j = obj;
            this.f132763l |= Integer.MIN_VALUE;
            return C14198a.this.i(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    /* renamed from: g5.a$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132764a;

        /* renamed from: b, reason: collision with root package name */
        Object f132765b;

        /* renamed from: c, reason: collision with root package name */
        Object f132766c;

        /* renamed from: d, reason: collision with root package name */
        Object f132767d;

        /* renamed from: e, reason: collision with root package name */
        Object f132768e;

        /* renamed from: f, reason: collision with root package name */
        Object f132769f;

        /* renamed from: g, reason: collision with root package name */
        Object f132770g;

        /* renamed from: h, reason: collision with root package name */
        Object f132771h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f132772i;

        /* renamed from: k, reason: collision with root package name */
        int f132774k;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132772i = obj;
            this.f132774k |= Integer.MIN_VALUE;
            return C14198a.this.j(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lg5/a$b;", "<anonymous>", "(Lqv/O;)Lg5/a$b;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    /* renamed from: g5.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f132775a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<f5.h> f132777c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Z4.b> f132778d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15372h f132779e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f132780f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C15376l> f132781g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Z4.c f132782h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref.ObjectRef<f5.h> objectRef, Ref.ObjectRef<Z4.b> objectRef2, C15372h c15372h, Object obj, Ref.ObjectRef<C15376l> objectRef3, Z4.c cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f132777c = objectRef;
            this.f132778d = objectRef2;
            this.f132779e = c15372h;
            this.f132780f = obj;
            this.f132781g = objectRef3;
            this.f132782h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14198a.this.new e(this.f132777c, this.f132778d, this.f132779e, this.f132780f, this.f132781g, this.f132782h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super b> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f132775a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C14198a c14198a = C14198a.this;
            m mVar = (m) this.f132777c.f142835a;
            Z4.b bVar = this.f132778d.f142835a;
            C15372h c15372h = this.f132779e;
            Object obj2 = this.f132780f;
            C15376l c15376l = this.f132781g.f142835a;
            Z4.c cVar = this.f132782h;
            this.f132775a = 1;
            Object objI = c14198a.i(mVar, bVar, c15372h, obj2, c15376l, cVar, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    /* renamed from: g5.a$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132783a;

        /* renamed from: b, reason: collision with root package name */
        Object f132784b;

        /* renamed from: c, reason: collision with root package name */
        Object f132785c;

        /* renamed from: d, reason: collision with root package name */
        Object f132786d;

        /* renamed from: e, reason: collision with root package name */
        Object f132787e;

        /* renamed from: f, reason: collision with root package name */
        Object f132788f;

        /* renamed from: g, reason: collision with root package name */
        Object f132789g;

        /* renamed from: h, reason: collision with root package name */
        int f132790h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f132791i;

        /* renamed from: k, reason: collision with root package name */
        int f132793k;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132791i = obj;
            this.f132793k |= Integer.MIN_VALUE;
            return C14198a.this.k(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    /* renamed from: g5.a$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132794a;

        /* renamed from: b, reason: collision with root package name */
        Object f132795b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f132796c;

        /* renamed from: e, reason: collision with root package name */
        int f132798e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132796c = obj;
            this.f132798e |= Integer.MIN_VALUE;
            return C14198a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ll5/p;", "<anonymous>", "(Lqv/O;)Ll5/p;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: g5.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super C15380p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f132799a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15372h f132801c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f132802d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15376l f132803e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z4.c f132804f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14857c.Key f132805g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14199b.a f132806h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C15372h c15372h, Object obj, C15376l c15376l, Z4.c cVar, InterfaceC14857c.Key key, InterfaceC14199b.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f132801c = c15372h;
            this.f132802d = obj;
            this.f132803e = c15376l;
            this.f132804f = cVar;
            this.f132805g = key;
            this.f132806h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14198a.this.new h(this.f132801c, this.f132802d, this.f132803e, this.f132804f, this.f132805g, this.f132806h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super C15380p> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objJ;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f132799a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    objJ = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14198a c14198a = C14198a.this;
                C15372h c15372h = this.f132801c;
                Object obj2 = this.f132802d;
                C15376l c15376l = this.f132803e;
                Z4.c cVar = this.f132804f;
                this.f132799a = 1;
                objJ = c14198a.j(c15372h, obj2, c15376l, cVar, this);
                if (objJ == objF) {
                    return objF;
                }
            }
            b bVar = (b) objJ;
            C14198a.this.systemCallbacks.c();
            boolean zH = C14198a.this.memoryCacheService.h(this.f132805g, this.f132801c, bVar);
            Drawable drawable = bVar.getDrawable();
            C15372h c15372h2 = this.f132801c;
            EnumC6361g dataSource = bVar.getDataSource();
            InterfaceC14857c.Key key = this.f132805g;
            if (!zH) {
                key = null;
            }
            return new C15380p(drawable, c15372h2, dataSource, key, bVar.getDiskCacheKey(), bVar.getIsSampled(), C16458j.u(this.f132806h));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lg5/a$b;", "<anonymous>", "(Lqv/O;)Lg5/a$b;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: g5.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132807a;

        /* renamed from: b, reason: collision with root package name */
        Object f132808b;

        /* renamed from: c, reason: collision with root package name */
        int f132809c;

        /* renamed from: d, reason: collision with root package name */
        int f132810d;

        /* renamed from: e, reason: collision with root package name */
        int f132811e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f132812f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f132814h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C15376l f132815i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC15996a> f132816j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Z4.c f132817k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C15372h f132818l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(b bVar, C15376l c15376l, List<? extends InterfaceC15996a> list, Z4.c cVar, C15372h c15372h, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f132814h = bVar;
            this.f132815i = c15376l;
            this.f132816j = list;
            this.f132817k = cVar;
            this.f132818l = c15372h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = C14198a.this.new i(this.f132814h, this.f132815i, this.f132816j, this.f132817k, this.f132818l, continuation);
            iVar.f132812f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super b> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r10.f132811e
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r10.f132810d
                int r3 = r10.f132809c
                java.lang.Object r4 = r10.f132808b
                l5.l r4 = (l5.C15376l) r4
                java.lang.Object r5 = r10.f132807a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f132812f
                qv.O r6 = (qv.InterfaceC16622O) r6
                kotlin.ResultKt.b(r11)
                goto L76
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f132812f
                qv.O r11 = (qv.InterfaceC16622O) r11
                g5.a r1 = g5.C14198a.this
                g5.a$b r3 = r10.f132814h
                android.graphics.drawable.Drawable r3 = r3.getDrawable()
                l5.l r4 = r10.f132815i
                java.util.List<o5.a> r5 = r10.f132816j
                android.graphics.Bitmap r1 = g5.C14198a.b(r1, r3, r4, r5)
                Z4.c r3 = r10.f132817k
                l5.h r4 = r10.f132818l
                r3.j(r4, r1)
                java.util.List<o5.a> r3 = r10.f132816j
                l5.l r4 = r10.f132815i
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
                o5.a r7 = (o5.InterfaceC15996a) r7
                m5.i r8 = r4.getSize()
                r10.f132812f = r6
                r10.f132807a = r5
                r10.f132808b = r4
                r10.f132809c = r3
                r10.f132810d = r1
                r10.f132811e = r2
                java.lang.Object r11 = r7.b(r11, r8, r10)
                if (r11 != r0) goto L76
                return r0
            L76:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                qv.C16623P.h(r6)
                int r3 = r3 + r2
                goto L57
            L7d:
                Z4.c r0 = r10.f132817k
                l5.h r1 = r10.f132818l
                r0.l(r1, r11)
                g5.a$b r2 = r10.f132814h
                l5.h r0 = r10.f132818l
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                g5.a$b r11 = g5.C14198a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: g5.C14198a.i.invokeSuspend(java.lang.Object):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r2v11, types: [T, l5.l] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, Z4.b] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, Z4.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(l5.C15372h r24, java.lang.Object r25, l5.C15376l r26, Z4.c r27, kotlin.coroutines.Continuation<? super g5.C14198a.b> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C14198a.j(l5.h, java.lang.Object, l5.l, Z4.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap h(Drawable drawable, C15376l options, List<? extends InterfaceC15996a> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configC = C16449a.c(bitmap);
            if (ArraysKt.Y(C16458j.p(), configC)) {
                return bitmap;
            }
            InterfaceC16467s interfaceC16467s = this.logger;
            if (interfaceC16467s != null && interfaceC16467s.getLevel() <= 4) {
                interfaceC16467s.a("EngineInterceptor", 4, "Converting bitmap with config " + configC + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            InterfaceC16467s interfaceC16467s2 = this.logger;
            if (interfaceC16467s2 != null && interfaceC16467s2.getLevel() <= 4) {
                interfaceC16467s2.a("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return C16461m.f156792a.a(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
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
    public final java.lang.Object i(f5.m r8, Z4.b r9, l5.C15372h r10, java.lang.Object r11, l5.C15376l r12, Z4.c r13, kotlin.coroutines.Continuation<? super g5.C14198a.b> r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C14198a.i(f5.m, Z4.b, l5.h, java.lang.Object, l5.l, Z4.c, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object k(Z4.b r8, l5.C15372h r9, java.lang.Object r10, l5.C15376l r11, Z4.c r12, kotlin.coroutines.Continuation<? super f5.h> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C14198a.k(Z4.b, l5.h, java.lang.Object, l5.l, Z4.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g5.InterfaceC14199b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(g5.InterfaceC14199b.a r14, kotlin.coroutines.Continuation<? super l5.AbstractC15373i> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g5.C14198a.g
            if (r0 == 0) goto L13
            r0 = r15
            g5.a$g r0 = (g5.C14198a.g) r0
            int r1 = r0.f132798e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132798e = r1
            goto L18
        L13:
            g5.a$g r0 = new g5.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f132796c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f132798e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.f132795b
            g5.b$a r14 = (g5.InterfaceC14199b.a) r14
            java.lang.Object r0 = r0.f132794a
            r1 = r0
            g5.a r1 = (g5.C14198a) r1
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
            l5.h r6 = r14.getRequest()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r15 = r6.getData()     // Catch: java.lang.Throwable -> La9
            m5.i r2 = r14.getSize()     // Catch: java.lang.Throwable -> La9
            Z4.c r9 = q5.C16458j.h(r14)     // Catch: java.lang.Throwable -> La9
            l5.o r4 = r13.requestService     // Catch: java.lang.Throwable -> La9
            l5.l r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> La9
            m5.h r4 = r8.getScale()     // Catch: java.lang.Throwable -> La9
            r9.h(r6, r15)     // Catch: java.lang.Throwable -> La9
            Z4.h r5 = r13.imageLoader     // Catch: java.lang.Throwable -> La9
            Z4.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> La9
            r9.e(r6, r7)     // Catch: java.lang.Throwable -> La9
            j5.d r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> La9
            j5.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L80
            j5.d r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L7b
            j5.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L7b
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
            j5.d r0 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L7b
            l5.p r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L7b
            return r14
        L8a:
            qv.K r15 = r6.getFetcherDispatcher()     // Catch: java.lang.Throwable -> La9
            g5.a$h r4 = new g5.a$h     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            r0.f132794a = r5     // Catch: java.lang.Throwable -> La4
            r0.f132795b = r11     // Catch: java.lang.Throwable -> La4
            r0.f132798e = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = qv.C16644i.g(r15, r4, r0)     // Catch: java.lang.Throwable -> La4
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
            l5.o r0 = r1.requestService
            l5.h r14 = r14.getRequest()
            l5.f r14 = r0.a(r14, r15)
            return r14
        Lbd:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C14198a.a(g5.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public C14198a(Z4.h hVar, ComponentCallbacks2C16469u componentCallbacks2C16469u, C15379o c15379o, InterfaceC16467s interfaceC16467s) {
        this.imageLoader = hVar;
        this.systemCallbacks = componentCallbacks2C16469u;
        this.requestService = c15379o;
        this.logger = interfaceC16467s;
        this.memoryCacheService = new C14858d(hVar, c15379o, interfaceC16467s);
    }

    public final Object l(b bVar, C15372h c15372h, C15376l c15376l, Z4.c cVar, Continuation<? super b> continuation) {
        List<InterfaceC15996a> listO = c15372h.O();
        if (listO.isEmpty()) {
            return bVar;
        }
        if (!(bVar.getDrawable() instanceof BitmapDrawable) && !c15372h.getAllowConversionToBitmap()) {
            InterfaceC16467s interfaceC16467s = this.logger;
            if (interfaceC16467s != null && interfaceC16467s.getLevel() <= 4) {
                interfaceC16467s.a("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.getDrawable().getClass().getCanonicalName() + '.', null);
            }
            return bVar;
        }
        return C16644i.g(c15372h.getTransformationDispatcher(), new i(bVar, c15376l, listO, cVar, c15372h, null), continuation);
    }
}
