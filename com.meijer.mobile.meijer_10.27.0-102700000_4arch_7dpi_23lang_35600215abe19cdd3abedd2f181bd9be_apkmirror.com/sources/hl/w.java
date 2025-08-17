package hl;

import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.CartModification;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.EntryChange;
import java.util.List;
import java.util.NoSuchElementException;
import jj.C14979c;
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
import rj.C16793b;
import tk.c;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0083@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0081@¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lhl/w;", "", "Lrj/b;", "cartDataSource", "LTq/j;", "storeProvider", "Lhl/C;", "cartProvider", "<init>", "(Lrj/b;LTq/j;Lhl/C;)V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "quantity", "Ltk/c;", "Lej/j;", "k", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "calculateLightningCart", "n", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/i;", "productQuantity", "l", "(Lmk/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(IDZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/f;", "productIdentity", "p", "(Lmk/f;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lrj/b;", "b", "LTq/j;", "c", "Lhl/C;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16793b cartDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14488C cartProvider;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {103, HttpResponseStatus.INFORMATIONAL_CONTINUE, 129}, m = "addProduct")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135532a;

        /* renamed from: b, reason: collision with root package name */
        Object f135533b;

        /* renamed from: c, reason: collision with root package name */
        Object f135534c;

        /* renamed from: d, reason: collision with root package name */
        Object f135535d;

        /* renamed from: e, reason: collision with root package name */
        double f135536e;

        /* renamed from: f, reason: collision with root package name */
        double f135537f;

        /* renamed from: g, reason: collision with root package name */
        int f135538g;

        /* renamed from: h, reason: collision with root package name */
        int f135539h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f135540i;

        /* renamed from: k, reason: collision with root package name */
        int f135542k;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135540i = obj;
            this.f135542k |= Integer.MIN_VALUE;
            return w.this.k(null, 0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {275, 277, HttpResponseStatus.SUCCESS_UNKNOWN}, m = "removeEntry")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f135543a;

        /* renamed from: b, reason: collision with root package name */
        int f135544b;

        /* renamed from: c, reason: collision with root package name */
        int f135545c;

        /* renamed from: d, reason: collision with root package name */
        int f135546d;

        /* renamed from: e, reason: collision with root package name */
        int f135547e;

        /* renamed from: f, reason: collision with root package name */
        boolean f135548f;

        /* renamed from: g, reason: collision with root package name */
        Object f135549g;

        /* renamed from: h, reason: collision with root package name */
        Object f135550h;

        /* renamed from: i, reason: collision with root package name */
        Object f135551i;

        /* renamed from: j, reason: collision with root package name */
        Object f135552j;

        /* renamed from: k, reason: collision with root package name */
        Object f135553k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f135554l;

        /* renamed from: n, reason: collision with root package name */
        int f135556n;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135554l = obj;
            this.f135556n |= Integer.MIN_VALUE;
            return w.this.n(0, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cart f135557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ tk.c<? extends EntryJson> f135558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f135559c;

        c(Cart cart, tk.c<? extends EntryJson> cVar, w wVar) {
            this.f135557a = cart;
            this.f135558b = cVar;
            this.f135559c = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryChange invoke(EntryJson entryJson) {
            return ej.k.a(C14979c.b(x.a(this.f135557a, this.f135558b.a(), 0.0d)), this.f135559c.storeProvider.g());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 313, 324}, m = "removeProduct$digitalshopping_release")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135560a;

        /* renamed from: b, reason: collision with root package name */
        Object f135561b;

        /* renamed from: c, reason: collision with root package name */
        Object f135562c;

        /* renamed from: d, reason: collision with root package name */
        Object f135563d;

        /* renamed from: e, reason: collision with root package name */
        boolean f135564e;

        /* renamed from: f, reason: collision with root package name */
        int f135565f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135566g;

        /* renamed from: i, reason: collision with root package name */
        int f135568i;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135566g = obj;
            this.f135568i |= Integer.MIN_VALUE;
            return w.this.p(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository", f = "LegacyCartEntriesRepository.kt", l = {189, 190, 222}, m = "setItemQuantity$digitalshopping_release")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f135569a;

        /* renamed from: b, reason: collision with root package name */
        int f135570b;

        /* renamed from: c, reason: collision with root package name */
        int f135571c;

        /* renamed from: d, reason: collision with root package name */
        double f135572d;

        /* renamed from: e, reason: collision with root package name */
        boolean f135573e;

        /* renamed from: f, reason: collision with root package name */
        Object f135574f;

        /* renamed from: g, reason: collision with root package name */
        Object f135575g;

        /* renamed from: h, reason: collision with root package name */
        Object f135576h;

        /* renamed from: i, reason: collision with root package name */
        Object f135577i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f135578j;

        /* renamed from: l, reason: collision with root package name */
        int f135580l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135578j = obj;
            this.f135580l |= Integer.MIN_VALUE;
            return w.this.u(0, 0.0d, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f implements InterfaceC17152f<tk.c<Cart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135581a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135582a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository$validCartResource$$inlined$filter$1$2", f = "LegacyCartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: hl.w$f$a$a, reason: collision with other inner class name */
            public static final class C2141a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135583a;

                /* renamed from: b, reason: collision with root package name */
                int f135584b;

                /* renamed from: c, reason: collision with root package name */
                Object f135585c;

                /* renamed from: d, reason: collision with root package name */
                Object f135586d;

                /* renamed from: f, reason: collision with root package name */
                Object f135588f;

                /* renamed from: g, reason: collision with root package name */
                Object f135589g;

                /* renamed from: h, reason: collision with root package name */
                int f135590h;

                public C2141a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135583a = obj;
                    this.f135584b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135582a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hl.w.f.a.C2141a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hl.w$f$a$a r0 = (hl.w.f.a.C2141a) r0
                    int r1 = r0.f135584b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135584b = r1
                    goto L18
                L13:
                    hl.w$f$a$a r0 = new hl.w$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135583a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135584b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f135589g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f135586d
                    hl.w$f$a$a r5 = (hl.w.f.a.C2141a) r5
                    kotlin.ResultKt.b(r6)
                    goto L59
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f135582a
                    r2 = r5
                    tk.c r2 = (tk.c) r2
                    boolean r2 = r2 instanceof tk.c.Success
                    if (r2 == 0) goto L59
                    r0.f135585c = r5
                    r0.f135586d = r0
                    r0.f135588f = r5
                    r0.f135589g = r6
                    r2 = 0
                    r0.f135590h = r2
                    r0.f135584b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.w.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC17152f interfaceC17152f) {
            this.f135581a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super tk.c<Cart>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135581a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g implements InterfaceC17152f<tk.c<Cart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135591a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135592a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.LegacyCartEntriesRepository$validCartResource$$inlined$map$1$2", f = "LegacyCartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: hl.w$g$a$a, reason: collision with other inner class name */
            public static final class C2142a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135593a;

                /* renamed from: b, reason: collision with root package name */
                int f135594b;

                /* renamed from: c, reason: collision with root package name */
                Object f135595c;

                /* renamed from: e, reason: collision with root package name */
                Object f135597e;

                /* renamed from: f, reason: collision with root package name */
                Object f135598f;

                /* renamed from: g, reason: collision with root package name */
                Object f135599g;

                /* renamed from: h, reason: collision with root package name */
                int f135600h;

                public C2142a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135593a = obj;
                    this.f135594b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135592a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.w.g.a.C2142a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.w$g$a$a r0 = (hl.w.g.a.C2142a) r0
                    int r1 = r0.f135594b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135594b = r1
                    goto L18
                L13:
                    hl.w$g$a$a r0 = new hl.w$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135593a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135594b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135599g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135597e
                    hl.w$g$a$a r6 = (hl.w.g.a.C2142a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5a
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135592a
                    r2 = r6
                    tk.c r2 = (tk.c) r2
                    r4 = 0
                    tk.c r2 = tk.e.c(r2, r4, r3, r4)
                    r0.f135595c = r6
                    r0.f135597e = r0
                    r0.f135598f = r6
                    r0.f135599g = r7
                    r6 = 0
                    r0.f135600h = r6
                    r0.f135594b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5a
                    return r1
                L5a:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.w.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC17152f interfaceC17152f) {
            this.f135591a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super tk.c<Cart>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135591a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    public w(C16793b cartDataSource, Tq.j storeProvider, C14488C cartProvider) {
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
    public final java.lang.Object k(java.lang.String r27, double r28, kotlin.coroutines.Continuation<? super tk.c<ej.EntryChange>> r30) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.w.k(java.lang.String, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange m(CartModification cartModification) {
        if (cartModification != null) {
            return C14979c.b(cartModification);
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
    public final java.lang.Object n(int r17, boolean r18, kotlin.coroutines.Continuation<? super tk.c<ej.EntryChange>> r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.w.n(int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object q(w wVar, mk.f fVar, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wVar.p(fVar, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange s(CartModification cartModification) {
        if (cartModification != null) {
            return C14979c.b(cartModification);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange t(w wVar, EntryChange entryChange) {
        if (entryChange != null) {
            return ej.k.a(entryChange, wVar.storeProvider.g());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange v(CartModification cartModification) {
        if (cartModification != null) {
            return C14979c.b(cartModification);
        }
        return null;
    }

    private final Object w(Continuation<? super tk.c<Cart>> continuation) {
        return C17154h.A(new f(new g(this.cartProvider.q())), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(mk.f r73, boolean r74, kotlin.coroutines.Continuation<? super tk.c<ej.EntryChange>> r75) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.w.p(mk.f, boolean, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object u(int r25, double r26, boolean r28, kotlin.coroutines.Continuation<? super tk.c<ej.EntryChange>> r29) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.w.u(int, double, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryJson o(tk.c cVar, int i10) {
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
    public final Object l(mk.i iVar, Continuation<? super tk.c<EntryChange>> continuation) {
        return k(iVar.h2(), iVar.getQuantity(), continuation);
    }
}
