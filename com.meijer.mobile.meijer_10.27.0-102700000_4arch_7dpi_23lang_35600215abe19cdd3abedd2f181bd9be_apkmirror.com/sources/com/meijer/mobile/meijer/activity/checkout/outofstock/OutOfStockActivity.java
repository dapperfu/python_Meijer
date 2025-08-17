package com.meijer.mobile.meijer.activity.checkout.outofstock;

import Al.t;
import Ao.W;
import Mn.C;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.F;
import androidx.view.I;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity;
import com.meijer.mobile.meijer.activity.checkout.outofstock.a;
import com.meijer.mobile.meijer.activity.checkout.outofstock.l;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.AbstractC14481h;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17135b;
import tv.InterfaceC17153g;
import tv.P;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010-¨\u00061"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/OutOfStockActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Lg/a;", "result", "", "R1", "(Lg/a;)V", "", "cartId", "", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "itemStates", "X1", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LMn/C;", "s", "LMn/C;", "binding", "t", "Ljava/lang/String;", "u", "cartItemCount", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j;", "v", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j;", "adapter", "Lg/c;", "Landroid/content/Intent;", "w", "Lg/c;", "substitutionResultLauncher", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "x", "Lkotlin/Lazy;", "Q1", "()Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "outOfStockViewModel", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "y", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OutOfStockActivity extends Hilt_OutOfStockActivity implements Aj.b {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f103464z = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private C binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String cartItemCount;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private j adapter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new f());

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy outOfStockViewModel = new e0(Reflection.b(o.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/OutOfStockActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lvs/b;", "Lkotlin/collections/ArrayList;", "outOfStockList", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/util/ArrayList;)Landroid/content/Intent;", "", "TRACK_STATE", "Ljava/lang/String;", "SEARCH_NEW_ITEMS_TRACK_ACTION", "BACK_TRACK_ACTION", "SECTION", "OUT_OF_STOCK_LIST", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, ArrayList<CartProductListDecorator> outOfStockList) {
            Intrinsics.j(context, "context");
            Intrinsics.j(outOfStockList, "outOfStockList");
            Intent intentPutExtra = new Intent(context, (Class<?>) OutOfStockActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.outofstock", outOfStockList);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity$onCreate$6", f = "OutOfStockActivity.kt", l = {103}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103471a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity$onCreate$6$1", f = "OutOfStockActivity.kt", l = {104}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OutOfStockActivity f103474b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity$b$a$a, reason: collision with other inner class name */
            static final class C1475a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OutOfStockActivity f103475a;

                C1475a(OutOfStockActivity outOfStockActivity) {
                    this.f103475a = outOfStockActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(OutOfStockActivity outOfStockActivity, TrackingData track) {
                    Intrinsics.j(track, "$this$track");
                    track.h("cartID", outOfStockActivity.cartId);
                    track.h("Cart Items Count", outOfStockActivity.cartItemCount);
                    return Unit.f142422a;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object emit(l lVar, Continuation<? super Unit> continuation) {
                    j jVar = null;
                    C c10 = null;
                    androidx.recyclerview.widget.q qVar = null;
                    if (lVar instanceof l.c) {
                        C c11 = this.f103475a.binding;
                        if (c11 == null) {
                            Intrinsics.y("binding");
                        } else {
                            c10 = c11;
                        }
                        c10.f19933I.X(true, true);
                    } else if (lVar instanceof l.a) {
                        this.f103475a.finish();
                        OutOfStockActivity outOfStockActivity = this.f103475a;
                        outOfStockActivity.startActivity(FulfillmentSlotsActivity.Companion.b(FulfillmentSlotsActivity.INSTANCE, outOfStockActivity, null, 2, null));
                    } else if (lVar instanceof l.b) {
                        l.b bVar = (l.b) lVar;
                        if (bVar instanceof l.b.OutOfStockAdapterState) {
                            C c12 = this.f103475a.binding;
                            if (c12 == null) {
                                Intrinsics.y("binding");
                                c12 = null;
                            }
                            c12.f19933I.X(false, true);
                            j jVar2 = this.f103475a.adapter;
                            if (jVar2 == null) {
                                Intrinsics.y("adapter");
                            } else {
                                qVar = jVar2;
                            }
                            l.b.OutOfStockAdapterState outOfStockAdapterState = (l.b.OutOfStockAdapterState) lVar;
                            qVar.submitList(outOfStockAdapterState.b());
                            this.f103475a.X1(outOfStockAdapterState.getCartId(), outOfStockAdapterState.b());
                        } else {
                            if (!(bVar instanceof l.b.OutOfStockItemState)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j jVar3 = this.f103475a.adapter;
                            if (jVar3 == null) {
                                Intrinsics.y("adapter");
                            } else {
                                jVar = jVar3;
                            }
                            jVar.submitList(CollectionsKt.e(lVar));
                        }
                    } else {
                        if (!(lVar instanceof l.OpenFindSubstitution)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC14261a analyticsEngine = this.f103475a.getAnalyticsEngine();
                        AbstractC14481h.Action actionA = C14476c.a("Items Out of Stock: Search New Item");
                        final OutOfStockActivity outOfStockActivity2 = this.f103475a;
                        analyticsEngine.h(actionA, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OutOfStockActivity.b.a.C1475a.g(outOfStockActivity2, (TrackingData) obj);
                            }
                        });
                        this.f103475a.substitutionResultLauncher.a(t.e(t.f694a, this.f103475a, ((l.OpenFindSubstitution) lVar).getItemToSubstitute().f(), Pp.c.f28364b, null, "Meijer:CartPage", 8, null));
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OutOfStockActivity outOfStockActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103474b = outOfStockActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f103474b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103473a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    P<l> pW = this.f103474b.Q1().w();
                    C1475a c1475a = new C1475a(this.f103474b);
                    this.f103473a = 1;
                    if (pW.collect(c1475a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OutOfStockActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103471a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                OutOfStockActivity outOfStockActivity = OutOfStockActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                a aVar = new a(outOfStockActivity, null);
                this.f103471a = 1;
                if (C5994J.b(outOfStockActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103476f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f103476f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f103476f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103477f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f103477f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f103477f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f103478f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103479g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f103478f = function0;
            this.f103479g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f103478f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f103479g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f implements InterfaceC14146b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OutOfStockActivity.this, OutOfStockActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            OutOfStockActivity.this.R1(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o Q1() {
        return (o) this.outOfStockViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(OutOfStockActivity outOfStockActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("cartID", outOfStockActivity.cartId);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(final OutOfStockActivity outOfStockActivity, F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        outOfStockActivity.getAnalyticsEngine().h(C14476c.a("Items Out of Stock: Back"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OutOfStockActivity.V1(this.f103488a, (TrackingData) obj);
            }
        });
        outOfStockActivity.finishAfterTransition();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(OutOfStockActivity outOfStockActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("cartID", outOfStockActivity.cartId);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(final String cartId, List<l.b.OutOfStockItemState> itemStates) {
        this.cartItemCount = String.valueOf(itemStates.size());
        this.cartId = cartId;
        List<l.b.OutOfStockItemState> list = itemStates;
        final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (l.b.OutOfStockItemState outOfStockItemState : list) {
            arrayList.add(new W.Details(outOfStockItemState.getFullDetails().getCode(), null, null, Double.valueOf(Double.parseDouble(outOfStockItemState.getOldQuantity())), Double.valueOf(outOfStockItemState.getFullDetails().getPrice().getValue()), null, null, Boolean.valueOf(outOfStockItemState.getFullDetails().getIsAlcohol()), null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -66714, 16383, null));
        }
        getAnalyticsEngine().h(C14476c.h("Items Out of Stock"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OutOfStockActivity.Y1(cartId, this, arrayList, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(String str, OutOfStockActivity outOfStockActivity, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("cart");
        track.h("cartID", str);
        track.h("Cart Items Count", outOfStockActivity.cartItemCount);
        track.e(W.j(list));
        return Unit.f142422a;
    }

    @Override // Aj.b
    public Toolbar v() {
        C c10 = this.binding;
        if (c10 == null) {
            Intrinsics.y("binding");
            c10 = null;
        }
        MaterialToolbar toolbar = c10.f19934J;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(C14145a result) {
        if (result.getResultCode() == 8675309) {
            setResult(8675309);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(final OutOfStockActivity outOfStockActivity) {
        outOfStockActivity.getAnalyticsEngine().h(C14476c.a("Items Out of Stock: Back"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OutOfStockActivity.T1(this.f103487a, (TrackingData) obj);
            }
        });
        if (!outOfStockActivity.onNavigateUp()) {
            outOfStockActivity.finishAfterTransition();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(OutOfStockActivity outOfStockActivity, View view) {
        o oVarQ1 = outOfStockActivity.Q1();
        j jVar = outOfStockActivity.adapter;
        if (jVar == null) {
            Intrinsics.y("adapter");
            jVar = null;
        }
        List<l.b.OutOfStockItemState> currentList = jVar.getCurrentList();
        Intrinsics.i(currentList, "getCurrentList(...)");
        List<l.b.OutOfStockItemState> list = currentList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l.b.OutOfStockItemState) it.next()).getCode());
        }
        oVarQ1.x(new a.Dismiss(arrayList));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList parcelableArrayListExtra;
        super.onCreate(savedInstanceState);
        C cK0 = C.K0(getLayoutInflater());
        this.binding = cK0;
        if (cK0 == null) {
            Intrinsics.y("binding");
            cK0 = null;
        }
        setContentView(Zr.a.j(cK0.getRoot(), false, 1, null));
        T0(C17135b.f162034m0);
        Drawable navigationIcon = v().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setVisible(false, false);
        }
        this.adapter = new j(Q1());
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OutOfStockActivity.S1(this.f103484a);
            }
        }, 3, null);
        I.a(getOnBackPressedDispatcher(), this, true, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OutOfStockActivity.U1(this.f103485a, (F) obj);
            }
        });
        C c10 = this.binding;
        if (c10 == null) {
            Intrinsics.y("binding");
            c10 = null;
        }
        RecyclerView recyclerView = c10.f19932H;
        j jVar = this.adapter;
        if (jVar == null) {
            Intrinsics.y("adapter");
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        C c11 = this.binding;
        if (c11 == null) {
            Intrinsics.y("binding");
            c11 = null;
        }
        c11.f19927C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutOfStockActivity.W1(this.f103486a, view);
            }
        });
        C c12 = this.binding;
        if (c12 == null) {
            Intrinsics.y("binding");
            c12 = null;
        }
        c12.f19930F.setText(C17135b.f162024h0);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.mobile.meijer.activity.checkout.outofstock", CartProductListDecorator.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.mobile.meijer.activity.checkout.outofstock");
        }
        if (parcelableArrayListExtra != null) {
            Q1().x(new a.b(parcelableArrayListExtra));
        }
        C16648k.d(C6031t.a(this), null, null, new b(null), 3, null);
    }
}
