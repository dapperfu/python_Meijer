package com.meijer.mobile.meijer.activity.checkout.payment;

import Mn.AbstractC4241i;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.SaveChangesDialogFragment;
import com.meijer.mobile.meijer.activity.checkout.payment.k0;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import je.C14886b;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17153g;
import uh.AccountCreditCard;
import uh.EnumC17263e;
import wk.C17829a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0019\u0010\u0005R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentUpdateCardActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "LAj/b;", "<init>", "()V", "Landroid/widget/AutoCompleteTextView;", "editText", "", "value", "", "N1", "(Landroid/widget/AutoCompleteTextView;Ljava/lang/String;)V", "Landroid/widget/ArrayAdapter;", "J1", "()Landroid/widget/ArrayAdapter;", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "save", "W", "(Z)V", "onBackPressed", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0;", "s", "Lkotlin/Lazy;", "K1", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/k0;", "viewModel", "LMn/i;", "t", "LMn/i;", "binding", "Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "u", "Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "saveChangesDialogFragment", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "w", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CheckoutPaymentUpdateCardActivity extends Hilt_CheckoutPaymentUpdateCardActivity implements u0, Aj.b {

    /* renamed from: x, reason: collision with root package name */
    public static final int f103654x = 8;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4241i binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private SaveChangesDialogFragment saveChangesDialogFragment;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(k0.class), new e(this), new d(this), new f(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy toolbar = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CheckoutPaymentUpdateCardActivity.O1(this.f103878a);
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$onCreate$6", f = "CheckoutPaymentUpdateCardActivity.kt", l = {125}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103662a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$onCreate$6$1", f = "CheckoutPaymentUpdateCardActivity.kt", l = {126}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103664a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentUpdateCardActivity f103665b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$c$a$a, reason: collision with other inner class name */
            static final class C1490a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentUpdateCardActivity f103666a;

                @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$c$a$a$a, reason: collision with other inner class name */
                public static final class C1491a implements TextWatcher {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AutoCompleteTextView f103667a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CheckoutPaymentUpdateCardActivity f103668b;

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                    }

                    public C1491a(AutoCompleteTextView autoCompleteTextView, CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
                        this.f103667a = autoCompleteTextView;
                        this.f103668b = checkoutPaymentUpdateCardActivity;
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s10) {
                        this.f103667a.clearFocus();
                        this.f103668b.K1().y(new k0.c.SetExpirationMonth(String.valueOf(s10)));
                    }
                }

                @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$c$a$a$b */
                public static final class b implements TextWatcher {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AutoCompleteTextView f103669a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CheckoutPaymentUpdateCardActivity f103670b;

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                    }

                    public b(AutoCompleteTextView autoCompleteTextView, CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
                        this.f103669a = autoCompleteTextView;
                        this.f103670b = checkoutPaymentUpdateCardActivity;
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s10) {
                        this.f103669a.clearFocus();
                        this.f103670b.K1().y(new k0.c.SetExpirationYear(String.valueOf(s10)));
                    }
                }

                C1490a(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
                    this.f103666a = checkoutPaymentUpdateCardActivity;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object emit(k0.CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState, Continuation<? super Unit> continuation) {
                    EnumC17263e cardType;
                    AbstractC4241i abstractC4241i = this.f103666a.binding;
                    AbstractC4241i abstractC4241i2 = null;
                    if (abstractC4241i == null) {
                        Intrinsics.y("binding");
                        abstractC4241i = null;
                    }
                    ImageView imageView = abstractC4241i.f20673H;
                    AccountCreditCard accountCreditCard = checkoutPaymentUpdateCardViewState.getAccountCreditCard();
                    Integer numD = (accountCreditCard == null || (cardType = accountCreditCard.getCardType()) == null) ? null : Boxing.d(cardType.b());
                    Intrinsics.g(numD);
                    FS.Resources_setImageResource(imageView, numD.intValue());
                    AbstractC4241i abstractC4241i3 = this.f103666a.binding;
                    if (abstractC4241i3 == null) {
                        Intrinsics.y("binding");
                        abstractC4241i3 = null;
                    }
                    MaterialTextView paymentCardTypeAndLastFourDigits = abstractC4241i3.f20674I;
                    Intrinsics.i(paymentCardTypeAndLastFourDigits, "paymentCardTypeAndLastFourDigits");
                    bk.d.g(paymentCardTypeAndLastFourDigits, checkoutPaymentUpdateCardViewState.getPaymentCardTypeAndLastFourDigits());
                    AbstractC4241i abstractC4241i4 = this.f103666a.binding;
                    if (abstractC4241i4 == null) {
                        Intrinsics.y("binding");
                        abstractC4241i4 = null;
                    }
                    AutoCompleteTextView autoCompleteTextView = abstractC4241i4.f20668C;
                    CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity = this.f103666a;
                    autoCompleteTextView.setAdapter(checkoutPaymentUpdateCardActivity.J1());
                    Intrinsics.g(autoCompleteTextView);
                    String expirationMonth = checkoutPaymentUpdateCardViewState.getExpirationMonth();
                    if (expirationMonth == null) {
                        expirationMonth = "";
                    }
                    checkoutPaymentUpdateCardActivity.N1(autoCompleteTextView, expirationMonth);
                    autoCompleteTextView.setAdapter(checkoutPaymentUpdateCardActivity.J1());
                    autoCompleteTextView.addTextChangedListener(new C1491a(autoCompleteTextView, checkoutPaymentUpdateCardActivity));
                    AbstractC4241i abstractC4241i5 = this.f103666a.binding;
                    if (abstractC4241i5 == null) {
                        Intrinsics.y("binding");
                        abstractC4241i5 = null;
                    }
                    AutoCompleteTextView autoCompleteTextView2 = abstractC4241i5.f20670E;
                    CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity2 = this.f103666a;
                    String expirationYear = checkoutPaymentUpdateCardViewState.getExpirationYear();
                    autoCompleteTextView2.setText(expirationYear != null ? expirationYear : "");
                    autoCompleteTextView2.setAdapter(checkoutPaymentUpdateCardActivity2.L1());
                    Intrinsics.g(autoCompleteTextView2);
                    autoCompleteTextView2.addTextChangedListener(new b(autoCompleteTextView2, checkoutPaymentUpdateCardActivity2));
                    AbstractC4241i abstractC4241i6 = this.f103666a.binding;
                    if (abstractC4241i6 == null) {
                        Intrinsics.y("binding");
                        abstractC4241i6 = null;
                    }
                    MaterialButton materialButton = abstractC4241i6.f20677L;
                    final CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity3 = this.f103666a;
                    materialButton.setEnabled(!checkoutPaymentUpdateCardViewState.getIsPaymentOptionExpired());
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.g0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CheckoutPaymentUpdateCardActivity.c.a.C1490a.g(checkoutPaymentUpdateCardActivity3, view);
                        }
                    });
                    AbstractC4241i abstractC4241i7 = this.f103666a.binding;
                    if (abstractC4241i7 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4241i2 = abstractC4241i7;
                    }
                    abstractC4241i2.f20675J.U(checkoutPaymentUpdateCardViewState.getLoadingState().getLoadingMessage(), checkoutPaymentUpdateCardViewState.getLoadingState().getIsLoading());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void g(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity, View view) {
                    checkoutPaymentUpdateCardActivity.K1().y(k0.c.d.f104016a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103665b = checkoutPaymentUpdateCardActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f103665b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103664a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    tv.P<k0.CheckoutPaymentUpdateCardViewState> pV = this.f103665b.K1().v();
                    C1490a c1490a = new C1490a(this.f103665b);
                    this.f103664a = 1;
                    if (pV.collect(c1490a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckoutPaymentUpdateCardActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103662a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity = CheckoutPaymentUpdateCardActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                a aVar = new a(checkoutPaymentUpdateCardActivity, null);
                this.f103662a = 1;
                if (C5994J.b(checkoutPaymentUpdateCardActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103671f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f103671f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f103671f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103672f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f103672f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f103672f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f103673f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103674g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f103673f = function0;
            this.f103674g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f103673f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f103674g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;", "events", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity$onCreate$3", f = "CheckoutPaymentUpdateCardActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<k0.e, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103659a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f103660b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = CheckoutPaymentUpdateCardActivity.this.new b(continuation);
            bVar.f103660b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0.e eVar, Continuation<? super Unit> continuation) {
            return ((b) create(eVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            checkoutPaymentUpdateCardActivity.K1().y(k0.c.d.f104016a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103659a == 0) {
                ResultKt.b(obj);
                k0.e eVar = (k0.e) this.f103660b;
                if (eVar instanceof k0.e.a) {
                    CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity = CheckoutPaymentUpdateCardActivity.this;
                    checkoutPaymentUpdateCardActivity.setResult(-1, checkoutPaymentUpdateCardActivity.getIntent());
                    CheckoutPaymentUpdateCardActivity.this.finish();
                } else if (eVar instanceof k0.e.ShowPaymentErrorDialog) {
                    k0.e.ShowPaymentErrorDialog showPaymentErrorDialog = (k0.e.ShowPaymentErrorDialog) eVar;
                    C14886b cancelable = new C14886b(CheckoutPaymentUpdateCardActivity.this).setTitle(showPaymentErrorDialog.getTitle()).setMessage(showPaymentErrorDialog.getMessage()).setCancelable(false);
                    int buttonText = showPaymentErrorDialog.getButtonText();
                    final CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity2 = CheckoutPaymentUpdateCardActivity.this;
                    cancelable.setPositiveButton(buttonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.f0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CheckoutPaymentUpdateCardActivity.b.k(checkoutPaymentUpdateCardActivity2, dialogInterface, i10);
                        }
                    }).show();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayAdapter<String> J1() {
        return new ArrayAdapter<>(this, Bj.m.f2954x, getResources().getStringArray(yr.O.f170955a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 K1() {
        return (k0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialToolbar O1(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
        AbstractC4241i abstractC4241i = checkoutPaymentUpdateCardActivity.binding;
        if (abstractC4241i == null) {
            Intrinsics.y("binding");
            abstractC4241i = null;
        }
        return abstractC4241i.f20676K;
    }

    @Override // com.meijer.mobile.meijer.activity.checkout.payment.u0
    public void W(boolean save) {
        SaveChangesDialogFragment saveChangesDialogFragment = this.saveChangesDialogFragment;
        if (saveChangesDialogFragment == null) {
            Intrinsics.y("saveChangesDialogFragment");
            saveChangesDialogFragment = null;
        }
        saveChangesDialogFragment.dismiss();
        if (save) {
            K1().y(k0.c.d.f104016a);
        } else {
            startActivity(CheckoutPaymentOptionsActivity.Companion.b(CheckoutPaymentOptionsActivity.INSTANCE, this, false, 2, null));
            finish();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        SaveChangesDialogFragment saveChangesDialogFragment = null;
        SaveChangesDialogFragment saveChangesDialogFragmentB = SaveChangesDialogFragment.Companion.b(SaveChangesDialogFragment.INSTANCE, null, 1, null);
        this.saveChangesDialogFragment = saveChangesDialogFragmentB;
        saveChangesDialogFragmentB.H0(this);
        C17829a c17829a = C17829a.f166179a;
        SaveChangesDialogFragment saveChangesDialogFragment2 = this.saveChangesDialogFragment;
        if (saveChangesDialogFragment2 == null) {
            Intrinsics.y("saveChangesDialogFragment");
        } else {
            saveChangesDialogFragment = saveChangesDialogFragment2;
        }
        c17829a.a(saveChangesDialogFragment, this, "save_changes_dialog_fragment_tag");
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        AbstractC4241i abstractC4241iK0 = AbstractC4241i.K0(getLayoutInflater());
        this.binding = abstractC4241iK0;
        if (abstractC4241iK0 == null) {
            Intrinsics.y("binding");
            abstractC4241iK0 = null;
        }
        setContentView(Zr.a.j(abstractC4241iK0.getRoot(), false, 1, null));
        AbstractC4241i abstractC4241i = this.binding;
        if (abstractC4241i == null) {
            Intrinsics.y("binding");
            abstractC4241i = null;
        }
        MaterialTextView materialTextView = abstractC4241i.f20674I;
        AbstractC4241i abstractC4241i2 = this.binding;
        if (abstractC4241i2 == null) {
            Intrinsics.y("binding");
            abstractC4241i2 = null;
        }
        EnhancedTextInputLayoutView enhancedTextInputLayoutView = abstractC4241i2.f20669D;
        AbstractC4241i abstractC4241i3 = this.binding;
        if (abstractC4241i3 == null) {
            Intrinsics.y("binding");
            abstractC4241i3 = null;
        }
        AutoCompleteTextView autoCompleteTextView = abstractC4241i3.f20668C;
        AbstractC4241i abstractC4241i4 = this.binding;
        if (abstractC4241i4 == null) {
            Intrinsics.y("binding");
            abstractC4241i4 = null;
        }
        EnhancedTextInputLayoutView enhancedTextInputLayoutView2 = abstractC4241i4.f20671F;
        AbstractC4241i abstractC4241i5 = this.binding;
        if (abstractC4241i5 == null) {
            Intrinsics.y("binding");
            abstractC4241i5 = null;
        }
        Iterator it = CollectionsKt.p(materialTextView, enhancedTextInputLayoutView, autoCompleteTextView, enhancedTextInputLayoutView2, abstractC4241i5.f20670E).iterator();
        while (it.hasNext()) {
            Zr.a.g((View) it.next(), false, 1, null);
        }
        getLifecycle().a(K1());
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutPaymentUpdateCardActivity.M1(this.f103880a);
            }
        }, 3, null);
        k0 k0VarK1 = K1();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.ACCOUNT_CREDIT_CARD", AccountCreditCard.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.ACCOUNT_CREDIT_CARD");
            if (!(parcelableExtra instanceof AccountCreditCard)) {
                parcelableExtra = null;
            }
            parcelable = (AccountCreditCard) parcelableExtra;
        }
        k0VarK1.y(new k0.c.SetAccountCreditCard((AccountCreditCard) parcelable));
        C17154h.J(C17154h.O(K1().getEvents(), new b(null)), C6031t.a(this));
        AbstractC4241i abstractC4241i6 = this.binding;
        if (abstractC4241i6 == null) {
            Intrinsics.y("binding");
            abstractC4241i6 = null;
        }
        EnhancedTextInputLayoutView enhancedTextInputLayoutView3 = abstractC4241i6.f20669D;
        EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView3, -1, Z1.b.d(enhancedTextInputLayoutView3.getContext(), Bj.g.f2622i), Z1.b.e(enhancedTextInputLayoutView3.getContext(), Bj.i.f2709Y), null, null, 24, null);
        AbstractC4241i abstractC4241i7 = this.binding;
        if (abstractC4241i7 == null) {
            Intrinsics.y("binding");
            abstractC4241i7 = null;
        }
        EnhancedTextInputLayoutView enhancedTextInputLayoutView4 = abstractC4241i7.f20671F;
        EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView4, -1, Z1.b.d(enhancedTextInputLayoutView4.getContext(), Bj.g.f2622i), Z1.b.e(enhancedTextInputLayoutView4.getContext(), Bj.i.f2709Y), null, null, 24, null);
        C16648k.d(C6031t.a(this), null, null, new c(null), 3, null);
    }

    @Override // Aj.b
    public Toolbar v() {
        Object value = this.toolbar.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (Toolbar) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayAdapter<String> L1() {
        int year = LocalDate.now().getYear();
        ArrayList arrayList = new ArrayList(100);
        for (int i10 = 0; i10 < 101; i10++) {
            arrayList.add(String.valueOf(year));
            year++;
        }
        return new ArrayAdapter<>(this, Bj.m.f2954x, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
        checkoutPaymentUpdateCardActivity.onBackPressed();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(AutoCompleteTextView editText, String value) {
        int count = editText.getAdapter().getCount();
        for (int i10 = 0; i10 < count; i10++) {
            if (StringsKt.U(editText.getAdapter().getItem(i10).toString(), value, true)) {
                editText.setText(editText.getAdapter().getItem(i10).toString());
                return;
            }
        }
    }
}
