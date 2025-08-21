package il;

import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.CartModification;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fj.EntryChange;
import java.util.List;
import java.util.NoSuchElementException;
import kj.C15213c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import sj.C17078b;
import uk.c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0083@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0081@¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lil/w;", "", "Lsj/b;", "cartDataSource", "LTq/j;", "storeProvider", "Lil/C;", "cartProvider", "<init>", "(Lsj/b;LTq/j;Lil/C;)V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "quantity", "Luk/c;", "Lfj/j;", "k", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "calculateLightningCart", "n", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnk/i;", "productQuantity", "l", "(Lnk/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(IDZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnk/f;", "productIdentity", "p", "(Lnk/f;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lsj/b;", "b", "LTq/j;", "c", "Lil/C;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17078b cartDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14768C cartProvider;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {103, HttpResponseStatus.INFORMATIONAL_CONTINUE, 129}, m = "addProduct")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f138172a;

        /* renamed from: b, reason: collision with root package name */
        Object f138173b;

        /* renamed from: c, reason: collision with root package name */
        Object f138174c;

        /* renamed from: d, reason: collision with root package name */
        Object f138175d;

        /* renamed from: e, reason: collision with root package name */
        double f138176e;

        /* renamed from: f, reason: collision with root package name */
        double f138177f;

        /* renamed from: g, reason: collision with root package name */
        int f138178g;

        /* renamed from: h, reason: collision with root package name */
        int f138179h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f138180i;

        /* renamed from: k, reason: collision with root package name */
        int f138182k;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138180i = obj;
            this.f138182k |= Integer.MIN_VALUE;
            return w.this.k(null, 0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {275, 277, HttpResponseStatus.SUCCESS_UNKNOWN}, m = "removeEntry")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f138183a;

        /* renamed from: b, reason: collision with root package name */
        int f138184b;

        /* renamed from: c, reason: collision with root package name */
        int f138185c;

        /* renamed from: d, reason: collision with root package name */
        int f138186d;

        /* renamed from: e, reason: collision with root package name */
        int f138187e;

        /* renamed from: f, reason: collision with root package name */
        boolean f138188f;

        /* renamed from: g, reason: collision with root package name */
        Object f138189g;

        /* renamed from: h, reason: collision with root package name */
        Object f138190h;

        /* renamed from: i, reason: collision with root package name */
        Object f138191i;

        /* renamed from: j, reason: collision with root package name */
        Object f138192j;

        /* renamed from: k, reason: collision with root package name */
        Object f138193k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f138194l;

        /* renamed from: n, reason: collision with root package name */
        int f138196n;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138194l = obj;
            this.f138196n |= Integer.MIN_VALUE;
            return w.this.n(0, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cart f138197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ uk.c<? extends EntryJson> f138198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f138199c;

        c(Cart cart, uk.c<? extends EntryJson> cVar, w wVar) {
            this.f138197a = cart;
            this.f138198b = cVar;
            this.f138199c = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryChange invoke(EntryJson entryJson) {
            return fj.k.a(C15213c.b(x.a(this.f138197a, this.f138198b.a(), 0.0d)), this.f138199c.storeProvider.g());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 313, 324}, m = "removeProduct$digitalshopping_release")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f138200a;

        /* renamed from: b, reason: collision with root package name */
        Object f138201b;

        /* renamed from: c, reason: collision with root package name */
        Object f138202c;

        /* renamed from: d, reason: collision with root package name */
        Object f138203d;

        /* renamed from: e, reason: collision with root package name */
        boolean f138204e;

        /* renamed from: f, reason: collision with root package name */
        int f138205f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138206g;

        /* renamed from: i, reason: collision with root package name */
        int f138208i;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138206g = obj;
            this.f138208i |= Integer.MIN_VALUE;
            return w.this.p(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {189, 190, 222}, m = "setItemQuantity$digitalshopping_release")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f138209a;

        /* renamed from: b, reason: collision with root package name */
        int f138210b;

        /* renamed from: c, reason: collision with root package name */
        int f138211c;

        /* renamed from: d, reason: collision with root package name */
        double f138212d;

        /* renamed from: e, reason: collision with root package name */
        boolean f138213e;

        /* renamed from: f, reason: collision with root package name */
        Object f138214f;

        /* renamed from: g, reason: collision with root package name */
        Object f138215g;

        /* renamed from: h, reason: collision with root package name */
        Object f138216h;

        /* renamed from: i, reason: collision with root package name */
        Object f138217i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f138218j;

        /* renamed from: l, reason: collision with root package name */
        int f138220l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138218j = obj;
            this.f138220l |= Integer.MIN_VALUE;
            return w.this.u(0, 0.0d, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f implements InterfaceC16561f<uk.c<Cart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f138221a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f138222a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository$validCartResource$$inlined$filter$1$2", f = "LegacyCartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: il.w$f$a$a, reason: collision with other inner class name */
            public static final class C2184a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f138223a;

                /* renamed from: b, reason: collision with root package name */
                int f138224b;

                /* renamed from: c, reason: collision with root package name */
                Object f138225c;

                /* renamed from: d, reason: collision with root package name */
                Object f138226d;

                /* renamed from: f, reason: collision with root package name */
                Object f138228f;

                /* renamed from: g, reason: collision with root package name */
                Object f138229g;

                /* renamed from: h, reason: collision with root package name */
                int f138230h;

                public C2184a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f138223a = obj;
                    this.f138224b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f138222a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof il.w.f.a.C2184a
                    if (r0 == 0) goto L13
                    r0 = r6
                    il.w$f$a$a r0 = (il.w.f.a.C2184a) r0
                    int r1 = r0.f138224b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f138224b = r1
                    goto L18
                L13:
                    il.w$f$a$a r0 = new il.w$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f138223a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f138224b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f138229g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f138226d
                    il.w$f$a$a r5 = (il.w.f.a.C2184a) r5
                    kotlin.ResultKt.b(r6)
                    goto L59
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f138222a
                    r2 = r5
                    uk.c r2 = (uk.c) r2
                    boolean r2 = r2 instanceof uk.c.Success
                    if (r2 == 0) goto L59
                    r0.f138225c = r5
                    r0.f138226d = r0
                    r0.f138228f = r5
                    r0.f138229g = r6
                    r2 = 0
                    r0.f138230h = r2
                    r0.f138224b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: il.w.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC16561f interfaceC16561f) {
            this.f138221a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super uk.c<Cart>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f138221a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g implements InterfaceC16561f<uk.c<Cart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f138231a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f138232a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository$validCartResource$$inlined$map$1$2", f = "LegacyCartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: il.w$g$a$a, reason: collision with other inner class name */
            public static final class C2185a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f138233a;

                /* renamed from: b, reason: collision with root package name */
                int f138234b;

                /* renamed from: c, reason: collision with root package name */
                Object f138235c;

                /* renamed from: e, reason: collision with root package name */
                Object f138237e;

                /* renamed from: f, reason: collision with root package name */
                Object f138238f;

                /* renamed from: g, reason: collision with root package name */
                Object f138239g;

                /* renamed from: h, reason: collision with root package name */
                int f138240h;

                public C2185a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f138233a = obj;
                    this.f138234b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f138232a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.w.g.a.C2185a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.w$g$a$a r0 = (il.w.g.a.C2185a) r0
                    int r1 = r0.f138234b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f138234b = r1
                    goto L18
                L13:
                    il.w$g$a$a r0 = new il.w$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f138233a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f138234b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f138239g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f138237e
                    il.w$g$a$a r6 = (il.w.g.a.C2185a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5a
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f138232a
                    r2 = r6
                    uk.c r2 = (uk.c) r2
                    r4 = 0
                    uk.c r2 = uk.e.c(r2, r4, r3, r4)
                    r0.f138235c = r6
                    r0.f138237e = r0
                    r0.f138238f = r6
                    r0.f138239g = r7
                    r6 = 0
                    r0.f138240h = r6
                    r0.f138234b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5a
                    return r1
                L5a:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.w.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC16561f interfaceC16561f) {
            this.f138231a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super uk.c<Cart>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f138231a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    public w(C17078b cartDataSource, Tq.j storeProvider, C14768C cartProvider) {
        Intrinsics.j(cartDataSource, "cartDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(cartProvider, "cartProvider");
        this.cartDataSource = cartDataSource;
        this.storeProvider = storeProvider;
        this.cartProvider = cartProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r27, double r28, kotlin.coroutines.Continuation<? super uk.c<fj.EntryChange>> r30) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il.w.k(java.lang.String, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange m(CartModification cartModification) {
        if (cartModification != null) {
            return C15213c.b(cartModification);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:75)|(1:(1:(1:(5:14|15|61|65|66)(2:19|20))(9:21|71|22|36|37|41|(7:69|43|48|(2:67|51)|55|(3:57|(2:60|61)|59)|64)(6:47|48|(0)|55|(0)|64)|65|66))(1:26))(3:27|(1:30)|59)|31|73|32|(7:35|36|37|41|(0)(0)|65|66)|59|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r5 = r6;
        r6 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb A[PHI: r0
      0x00fb: PHI (r0v33 java.lang.Object) = (r0v18 java.lang.Object), (r0v20 java.lang.Object) binds: [B:42:0x00dc, B:46:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #4 {all -> 0x003f, blocks: (B:15:0x003a, B:61:0x0146, B:57:0x0122), top: B:75:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r17, boolean r18, kotlin.coroutines.Continuation<? super uk.c<fj.EntryChange>> r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il.w.n(int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object q(w wVar, nk.f fVar, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wVar.p(fVar, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange s(CartModification cartModification) {
        if (cartModification != null) {
            return C15213c.b(cartModification);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange t(w wVar, EntryChange entryChange) {
        if (entryChange != null) {
            return fj.k.a(entryChange, wVar.storeProvider.g());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange v(CartModification cartModification) {
        if (cartModification != null) {
            return C15213c.b(cartModification);
        }
        return null;
    }

    private final Object w(Continuation<? super uk.c<Cart>> continuation) {
        return C16563h.A(new f(new g(this.cartProvider.q())), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(nk.f r73, boolean r74, kotlin.coroutines.Continuation<? super uk.c<fj.EntryChange>> r75) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il.w.p(nk.f, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r25, double r26, boolean r28, kotlin.coroutines.Continuation<? super uk.c<fj.EntryChange>> r29) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il.w.u(int, double, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryJson o(uk.c cVar, int i10) {
        List<EntryJson> listM;
        Cart cart = (Cart) cVar.a();
        if (cart != null) {
            listM = cart.v();
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        for (EntryJson entryJson : listM) {
            if (entryJson.getEntryNumber() == i10) {
                return entryJson;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartModification r(Cart cart, c.Success success, EntryJson entryJson) {
        return x.a(cart, (EntryJson) success.a(), 0.0d);
    }

    @Deprecated
    public final Object l(nk.i iVar, Continuation<? super uk.c<EntryChange>> continuation) {
        return k(iVar.g2(), iVar.getQuantity(), continuation);
    }
}
