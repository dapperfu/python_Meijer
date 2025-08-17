package com.meijer.mobile.mperks.ux.rewardDetail;

import Co.ProductFullDetails;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bo.RewardDetail;
import com.meijer.mobile.mperks.ux.rewardDetail.AbstractC12677a;
import com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity;
import com.meijer.mobile.mperks.ux.rewardDetail.y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13589e;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mk.l;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\u00020\b*\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\b*\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\u0003R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/RewardsDetailsActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "", "H1", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "", "previousTrackAction", "I1", "(LCo/h;Ljava/lang/String;)V", "LJi/M;", "", "messageResId", "actionResId", "K1", "(LJi/M;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J1", "(LJi/M;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "titleResId", "", "requireAcknowledgement", "M1", "(IIZ)V", "rewardId", "rewardTitle", "G1", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y;", "D", "Lkotlin/Lazy;", "F1", "()Lcom/meijer/mobile/mperks/ux/rewardDetail/y;", "rewardsDetailsViewModel", "Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "rewardDetailViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RewardsDetailsActivity extends Hilt_RewardsDetailsActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy rewardsDetailsViewModel = new e0(Reflection.b(y.class), new e(this), new d(this), new f(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f114330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f114331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f114332d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$onCreate$1$1$1", f = "RewardsDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$a, reason: collision with other inner class name */
        static final class C1810a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114333a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f114334b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RewardsDetailsActivity f114335c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ RewardDetail f114336d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1810a(this.f114334b, this.f114335c, this.f114336d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1810a(boolean z10, RewardsDetailsActivity rewardsDetailsActivity, RewardDetail rewardDetail, Continuation<? super C1810a> continuation) {
                super(2, continuation);
                this.f114334b = z10;
                this.f114335c = rewardsDetailsActivity;
                this.f114336d = rewardDetail;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1810a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f114333a == 0) {
                    ResultKt.b(obj);
                    if (this.f114334b) {
                        this.f114335c.F1().K(new AbstractC12677a.GetProductsDetail(0, this.f114336d, 1, null));
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f114337a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RewardDetail f114338b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RewardsDetailsActivity f114339c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<RewardsDetailsViewState> f114340d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$b$a, reason: collision with other inner class name */
            /* synthetic */ class C1811a extends FunctionReferenceImpl implements Function2<ProductFullDetails, String, Unit> {
                C1811a(Object obj) {
                    super(2, obj, RewardsDetailsActivity.class, "onProductClicked", "onProductClicked(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Ljava/lang/String;)V", 0);
                }

                public final void a(ProductFullDetails p02, String str) {
                    Intrinsics.j(p02, "p0");
                    ((RewardsDetailsActivity) this.receiver).I1(p02, str);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, String str) {
                    a(productFullDetails, str);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$b$b, reason: collision with other inner class name */
            /* synthetic */ class C1812b extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
                C1812b(Object obj) {
                    super(2, obj, RewardsDetailsActivity.class, "onEntryUpdate", "onEntryUpdate(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
                }

                public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                    Intrinsics.j(p02, "p0");
                    Intrinsics.j(p12, "p1");
                    ((RewardsDetailsActivity) this.receiver).H1(p02, p12);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                    a(productFullDetails, aVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$onCreate$1$2$7$1", f = "RewardsDetailsActivity.kt", l = {}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f114341a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ RewardsDetailsActivity f114342b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114343c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$onCreate$1$2$7$1$1", f = "RewardsDetailsActivity.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$b$c$a, reason: collision with other inner class name */
                static final class C1813a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f114344a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ RewardsDetailsActivity f114345b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f114346c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$onCreate$1$2$7$1$1$1", f = "RewardsDetailsActivity.kt", l = {101}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$b$c$a$a, reason: collision with other inner class name */
                    static final class C1814a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f114347a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ RewardsDetailsActivity f114348b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f114349c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$a$b$c$a$a$a, reason: collision with other inner class name */
                        static final class C1815a<T> implements InterfaceC17153g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ RewardsDetailsActivity f114350a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f114351b;

                            C1815a(RewardsDetailsActivity rewardsDetailsActivity, LocalThemeScope localThemeScope) {
                                this.f114350a = rewardsDetailsActivity;
                                this.f114351b = localThemeScope;
                            }

                            @Override // tv.InterfaceC17153g
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Object emit(y.d dVar, Continuation<? super Unit> continuation) {
                                if (dVar instanceof y.d.UpdateCartSuccessEvent) {
                                    y.d.UpdateCartSuccessEvent updateCartSuccessEvent = (y.d.UpdateCartSuccessEvent) dVar;
                                    Object objK1 = this.f114350a.K1(this.f114351b, updateCartSuccessEvent.getMessageResId(), updateCartSuccessEvent.getActionResId(), continuation);
                                    return objK1 == IntrinsicsKt.f() ? objK1 : Unit.f142422a;
                                }
                                if (dVar instanceof y.d.UpdateCartFailedEvent) {
                                    Object objJ1 = this.f114350a.J1(this.f114351b, ((y.d.UpdateCartFailedEvent) dVar).getMessageResId(), continuation);
                                    return objJ1 == IntrinsicsKt.f() ? objJ1 : Unit.f142422a;
                                }
                                if (!(dVar instanceof y.d.SimpleOkAlertDialogEvent)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                y.d.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = (y.d.SimpleOkAlertDialogEvent) dVar;
                                this.f114350a.M1(simpleOkAlertDialogEvent.getMessageResId(), simpleOkAlertDialogEvent.getTitleResId(), simpleOkAlertDialogEvent.getRequireAcknowledgement());
                                return Unit.f142422a;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1814a(this.f114348b, this.f114349c, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1814a(RewardsDetailsActivity rewardsDetailsActivity, LocalThemeScope localThemeScope, Continuation<? super C1814a> continuation) {
                            super(2, continuation);
                            this.f114348b = rewardsDetailsActivity;
                            this.f114349c = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1814a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f114347a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                InterfaceC17144F<y.d> interfaceC17144FF = this.f114348b.F1().F();
                                C1815a c1815a = new C1815a(this.f114348b, this.f114349c);
                                this.f114347a = 1;
                                if (interfaceC17144FF.collect(c1815a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1813a(this.f114345b, this.f114346c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1813a(RewardsDetailsActivity rewardsDetailsActivity, LocalThemeScope localThemeScope, Continuation<? super C1813a> continuation) {
                        super(2, continuation);
                        this.f114345b = rewardsDetailsActivity;
                        this.f114346c = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1813a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f114344a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            RewardsDetailsActivity rewardsDetailsActivity = this.f114345b;
                            AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                            C1814a c1814a = new C1814a(rewardsDetailsActivity, this.f114346c, null);
                            this.f114344a = 1;
                            if (C5994J.b(rewardsDetailsActivity, bVar, c1814a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f114342b, this.f114343c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(RewardsDetailsActivity rewardsDetailsActivity, LocalThemeScope localThemeScope, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f114342b = rewardsDetailsActivity;
                    this.f114343c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f114341a == 0) {
                        ResultKt.b(obj);
                        C16648k.d(C6031t.a(this.f114342b), null, null, new C1813a(this.f114342b, this.f114343c, null), 3, null);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            b(String str, RewardDetail rewardDetail, RewardsDetailsActivity rewardsDetailsActivity, z1<RewardsDetailsViewState> z1Var) {
                this.f114337a = str;
                this.f114338b = rewardDetail;
                this.f114339c = rewardsDetailsActivity;
                this.f114340d = z1Var;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2003975851, i11, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.onCreate.<anonymous>.<anonymous> (RewardsDetailsActivity.kt:70)");
                }
                RewardsDetailsViewState rewardsDetailsViewStateC = a.c(this.f114340d);
                String str = this.f114337a;
                int i12 = i11;
                RewardDetail rewardDetail = this.f114338b;
                RewardsDetailsActivity rewardsDetailsActivity = this.f114339c;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(rewardsDetailsActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1811a(rewardsDetailsActivity);
                    composer.t(objB);
                }
                composer.P();
                Function2 function2 = (Function2) ((KFunction) objB);
                RewardsDetailsActivity rewardsDetailsActivity2 = this.f114339c;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(rewardsDetailsActivity2);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1812b(rewardsDetailsActivity2);
                    composer.t(objB2);
                }
                composer.P();
                Function2 function22 = (Function2) ((KFunction) objB2);
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(this.f114339c) | composer.D(this.f114338b);
                final RewardsDetailsActivity rewardsDetailsActivity3 = this.f114339c;
                final RewardDetail rewardDetail2 = this.f114338b;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardsDetailsActivity.a.b.f(rewardsDetailsActivity3, rewardDetail2);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function0 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD4 = composer.D(this.f114339c) | composer.D(this.f114338b);
                final RewardsDetailsActivity rewardsDetailsActivity4 = this.f114339c;
                final RewardDetail rewardDetail3 = this.f114338b;
                Object objB4 = composer.B();
                if (zD4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardsDetailsActivity.a.b.g(rewardsDetailsActivity4, rewardDetail3);
                        }
                    };
                    composer.t(objB4);
                }
                Function0 function02 = (Function0) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(this.f114339c);
                final RewardsDetailsActivity rewardsDetailsActivity5 = this.f114339c;
                Object objB5 = composer.B();
                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function0() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardsDetailsActivity.a.b.k(rewardsDetailsActivity5);
                        }
                    };
                    composer.t(objB5);
                }
                Function0 function03 = (Function0) objB5;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD6 = composer.D(this.f114339c);
                final RewardsDetailsActivity rewardsDetailsActivity6 = this.f114339c;
                Object objB6 = composer.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardsDetailsActivity.a.b.l(rewardsDetailsActivity6);
                        }
                    };
                    composer.t(objB6);
                }
                composer.P();
                int i13 = i12 & 14;
                w.t(AdsTheme, rewardsDetailsViewStateC, str, rewardDetail, function2, function22, function0, function02, function03, (Function0) objB6, null, null, composer, LocalThemeScope.f15770g | i13, 0, 1536);
                Boolean bool = Boolean.TRUE;
                composer.startReplaceGroup(-1633490746);
                boolean zD7 = composer.D(this.f114339c) | (i13 == 4 || ((i12 & 8) != 0 && composer.D(AdsTheme)));
                RewardsDetailsActivity rewardsDetailsActivity7 = this.f114339c;
                Object objB7 = composer.B();
                if (zD7 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new c(rewardsDetailsActivity7, AdsTheme, null);
                    composer.t(objB7);
                }
                composer.P();
                J.g(bool, (Function2) objB7, composer, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(RewardsDetailsActivity rewardsDetailsActivity, RewardDetail rewardDetail) {
                rewardsDetailsActivity.G1(String.valueOf(rewardDetail.getRewardId()), String.valueOf(rewardDetail.getName()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(RewardsDetailsActivity rewardsDetailsActivity, RewardDetail rewardDetail) {
                rewardsDetailsActivity.F1().K(new AbstractC12677a.GetProductsDetail(0, rewardDetail, 1, null));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(RewardsDetailsActivity rewardsDetailsActivity) {
                rewardsDetailsActivity.startActivity(rewardsDetailsActivity.r1().d());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(RewardsDetailsActivity rewardsDetailsActivity) {
                rewardsDetailsActivity.finish();
                return Unit.f142422a;
            }
        }

        a(boolean z10, RewardDetail rewardDetail, String str) {
            this.f114330b = z10;
            this.f114331c = rewardDetail;
            this.f114332d = str;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-490999716, i10, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.onCreate.<anonymous> (RewardsDetailsActivity.kt:59)");
            }
            z1 z1VarB = o1.b(RewardsDetailsActivity.this.F1().H(), null, composer, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(this.f114330b);
            composer.startReplaceGroup(-1746271574);
            boolean zA = composer.a(this.f114330b) | composer.D(RewardsDetailsActivity.this) | composer.D(this.f114331c);
            boolean z10 = this.f114330b;
            RewardsDetailsActivity rewardsDetailsActivity = RewardsDetailsActivity.this;
            RewardDetail rewardDetail = this.f114331c;
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new C1810a(z10, rewardsDetailsActivity, rewardDetail, null);
                composer.t(objB);
            }
            composer.P();
            J.g(boolValueOf, (Function2) objB, composer, 0);
            K.b(null, ComposableLambdaKt.c(2003975851, true, new b(this.f114332d, this.f114331c, RewardsDetailsActivity.this, z1VarB), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsDetailsViewState c(z1<RewardsDetailsViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity", f = "RewardsDetailsActivity.kt", l = {170, 170}, m = "showCartUpdateFailureMessage")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f114352a;

        /* renamed from: b, reason: collision with root package name */
        int f114353b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f114354c;

        /* renamed from: e, reason: collision with root package name */
        int f114356e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114354c = obj;
            this.f114356e |= Integer.MIN_VALUE;
            return RewardsDetailsActivity.this.J1(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity", f = "RewardsDetailsActivity.kt", l = {157, 157}, m = "showCartUpdateSuccessMessage")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f114357a;

        /* renamed from: b, reason: collision with root package name */
        int f114358b;

        /* renamed from: c, reason: collision with root package name */
        int f114359c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f114360d;

        /* renamed from: f, reason: collision with root package name */
        int f114362f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114360d = obj;
            this.f114362f |= Integer.MIN_VALUE;
            return RewardsDetailsActivity.this.K1(null, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114363f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f114363f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114363f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114364f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f114364f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f114364f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114365f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114366g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114365f = function0;
            this.f114366g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114365f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114366g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y F1() {
        return (y) this.rewardsDetailsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (Gi.i.i((Gi.i) r4, r6, null, r7, false, r9, null, null, null, r13, 234, null) == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J1(Ji.LocalThemeScope r18, int r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.b
            if (r3 == 0) goto L1a
            r3 = r2
            com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$b r3 = (com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.b) r3
            int r4 = r3.f114356e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f114356e = r4
        L18:
            r13 = r3
            goto L20
        L1a:
            com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$b r3 = new com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$b
            r3.<init>(r2)
            goto L18
        L20:
            java.lang.Object r2 = r13.f114354c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r13.f114356e
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L51
            if (r4 == r7) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r1 = r13.f114352a
            Ji.M r1 = (Ji.LocalThemeScope) r1
            kotlin.ResultKt.b(r2)
            goto L91
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            int r1 = r13.f114353b
            java.lang.Object r4 = r13.f114352a
            Ji.M r4 = (Ji.LocalThemeScope) r4
            kotlin.ResultKt.b(r2)
            r16 = r2
            r2 = r1
            r1 = r4
            r4 = r16
            goto L64
        L51:
            kotlin.ResultKt.b(r2)
            r13.f114352a = r1
            r2 = r19
            r13.f114353b = r2
            r13.f114356e = r7
            r4 = 0
            java.lang.Object r4 = Ji.LocalThemeScope.g(r1, r4, r13, r7, r6)
            if (r4 != r3) goto L64
            goto L90
        L64:
            Gi.i r4 = (Gi.i) r4
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r8 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)
            r8 = 0
            android.text.Spanned r6 = m2.b.a(r7, r8, r6, r6)
            java.lang.String r6 = r6.toString()
            Gi.e r7 = Gi.e.f11481a
            ji.q1$m$a$b r9 = ji.q1.m.a.b.f140113a
            r13.f114352a = r1
            r13.f114353b = r2
            r13.f114356e = r5
            r5 = r6
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 234(0xea, float:3.28E-43)
            r15 = 0
            java.lang.Object r1 = Gi.i.i(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r3) goto L91
        L90:
            return r3
        L91:
            kotlin.Unit r1 = kotlin.Unit.f142422a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.J1(Ji.M, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (Gi.i.i((Gi.i) r6, r7, r8, r7, false, r9, r10, null, null, r13, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_OK, null) == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K1(Ji.LocalThemeScope r18, int r19, int r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            boolean r3 = r2 instanceof com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.c
            if (r3 == 0) goto L1a
            r3 = r2
            com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$c r3 = (com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.c) r3
            int r4 = r3.f114362f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f114362f = r4
        L18:
            r13 = r3
            goto L20
        L1a:
            com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$c r3 = new com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity$c
            r3.<init>(r2)
            goto L18
        L20:
            java.lang.Object r2 = r13.f114360d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r13.f114362f
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L54
            if (r4 == r6) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r1 = r13.f114357a
            Ji.M r1 = (Ji.LocalThemeScope) r1
            kotlin.ResultKt.b(r2)
            goto Lad
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            int r1 = r13.f114359c
            int r4 = r13.f114358b
            java.lang.Object r6 = r13.f114357a
            Ji.M r6 = (Ji.LocalThemeScope) r6
            kotlin.ResultKt.b(r2)
            r16 = r4
            r4 = r1
            r1 = r6
            r6 = r2
            r2 = r16
            goto L6c
        L54:
            kotlin.ResultKt.b(r2)
            r13.f114357a = r1
            r2 = r19
            r13.f114358b = r2
            r4 = r20
            r13.f114359c = r4
            r13.f114362f = r6
            r7 = 0
            r8 = 0
            java.lang.Object r6 = Ji.LocalThemeScope.g(r1, r7, r13, r6, r8)
            if (r6 != r3) goto L6c
            goto Lac
        L6c:
            Gi.i r6 = (Gi.i) r6
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r8 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)
            java.lang.String r9 = r0.getString(r4)
            kotlin.jvm.internal.Intrinsics.i(r9, r8)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r9.toUpperCase(r8)
            java.lang.String r9 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.i(r8, r9)
            r9 = r7
            Gi.e r7 = Gi.e.f11481a
            r10 = r9
            ji.q1$m$a$d r9 = ji.q1.m.a.d.f140117a
            r11 = r10
            com.meijer.mobile.mperks.ux.rewardDetail.b r10 = new com.meijer.mobile.mperks.ux.rewardDetail.b
            r10.<init>()
            r13.f114357a = r1
            r13.f114358b = r2
            r13.f114359c = r4
            r13.f114362f = r5
            r4 = r6
            r6 = r8
            r8 = 0
            r5 = r11
            r11 = 0
            r12 = 0
            r14 = 200(0xc8, float:2.8E-43)
            r15 = 0
            java.lang.Object r1 = Gi.i.i(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r3) goto Lad
        Lac:
            return r3
        Lad:
            kotlin.Unit r1 = kotlin.Unit.f142422a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity.K1(Ji.M, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(int messageResId, int titleResId, boolean requireAcknowledgement) {
        Pj.j jVar = new Pj.j(this, messageResId, new Object[0]);
        if (requireAcknowledgement) {
            jVar.n();
        }
        jVar.r(titleResId, new Object[0]);
        jVar.g();
    }

    @Override // android.app.Activity
    protected void onPause() {
        Gi.i.INSTANCE.b();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(String rewardId, String rewardTitle) {
        startActivity(Al.g.k(r1(), new l.Reward(rewardId, rewardTitle), null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        F1().K(new AbstractC12677a.StepperChange(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(ProductFullDetails product, String previousTrackAction) {
        startActivity(r1().s(product, false, true, previousTrackAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L1(RewardsDetailsActivity rewardsDetailsActivity) {
        rewardsDetailsActivity.startActivity(rewardsDetailsActivity.r1().d());
        return true;
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        getLifecycle().a(F1());
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON", RewardDetail.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON");
            if (!(parcelableExtra instanceof RewardDetail)) {
                parcelableExtra = null;
            }
            obj = (RewardDetail) parcelableExtra;
        }
        Intrinsics.g(obj);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-490999716, true, new a(getIntent().getBooleanExtra("com.meijer.intent.extra.IS_SHOPPABLE_REWARD", false), (RewardDetail) obj, getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_NAVIGATED_FROM"))), 1, null);
    }
}
