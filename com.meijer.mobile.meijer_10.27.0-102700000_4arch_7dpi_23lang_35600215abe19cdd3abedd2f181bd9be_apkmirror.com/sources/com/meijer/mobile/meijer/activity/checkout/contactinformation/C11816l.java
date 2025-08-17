package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Am.C2894i0;
import Am.U;
import Hk.Validation;
import Hk.c;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import android.telephony.PhoneNumberUtils;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.C11816l;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import j0.C14815g;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty0;
import oi.C16088n;
import p1.C16193g;
import qv.InterfaceC16622O;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u001aY\u0010\r\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u00020\t*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001ac\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\u0004\u0018\u00010\u001d*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f\"\u0018\u0010%\u001a\u00020\u0003*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isEditMode", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "onAction", "Lkotlin/Function0;", "onEditIconClicked", "s", "(LJi/M;Landroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/l0;", "isChecked", "k", "(LJi/M;Landroidx/compose/runtime/l0;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "o", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/l0;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "w", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/Q;", "D", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/Q;", "a", "Z", "isSetInitialContactInformation", "", "B", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)Ljava/lang/Integer;", "emailError", "C", "phoneNumberError", "A", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)Z", "checkBoxError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11816l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f102482a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInfoScreenKt$AgreementSection$3$1", f = "DeliveryContactInfoScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102483a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f102484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f102485c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1445a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[H.i.values().length];
                try {
                    iArr[H.i.f102402c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DeliveryContactInformationViewState deliveryContactInformationViewState, androidx.compose.ui.focus.y yVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f102484b = deliveryContactInformationViewState;
            this.f102485c = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f102484b, this.f102485c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            H.i iVar;
            int i10;
            List<H.i> listL;
            IntrinsicsKt.f();
            if (this.f102483a == 0) {
                ResultKt.b(obj);
                DeliveryContactInformationViewState deliveryContactInformationViewState = this.f102484b;
                if (deliveryContactInformationViewState != null && (listL = deliveryContactInformationViewState.l()) != null) {
                    iVar = (H.i) CollectionsKt.u0(listL);
                } else {
                    iVar = null;
                }
                if (iVar == null) {
                    i10 = -1;
                } else {
                    i10 = C1445a.$EnumSwitchMapping$0[iVar.ordinal()];
                }
                if (i10 == 1) {
                    Boxing.a(androidx.compose.ui.focus.y.h(this.f102485c, 0, 1, null));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f102488c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f102489d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f102490e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<H.g, Unit> f102491f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f102492g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102493h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f102494i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f102495j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f102496k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102497l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102498m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$b$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
            a(Object obj) {
                super(1, obj, Ih.H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransformedText invoke(AnnotatedString p02) {
                Intrinsics.j(p02, "p0");
                return ((Ih.H) this.receiver).a(p02);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$b$b, reason: collision with other inner class name */
        static final class C1446b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102499a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeliveryContactInformationViewState f102500b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f102501c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f102502d;

            C1446b(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, String str, String str2) {
                this.f102499a = localThemeScope;
                this.f102500b = deliveryContactInformationViewState;
                this.f102501c = str;
                this.f102502d = str2;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                String strE;
                String strE2;
                Validation<String> validationP;
                Validation<String> validationM;
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1547643954, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationNewScreen.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInfoScreen.kt:296)");
                }
                LocalThemeScope localThemeScope = this.f102499a;
                Modifier.Companion companion = Modifier.INSTANCE;
                AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
                AbstractC5607a abstractC5607aD = companion2.d(Y.f99475B1, new Object[0]);
                int i11 = AbstractC5607a.f45514b;
                String strA = C6408b.a(abstractC5607aD, composer, i11);
                DeliveryContactInformationViewState deliveryContactInformationViewState = this.f102500b;
                String str = ((deliveryContactInformationViewState == null || (validationM = deliveryContactInformationViewState.m()) == null || (strE = validationM.e()) == null) && (strE = this.f102501c) == null) ? "" : strE;
                int i12 = LocalThemeScope.f15770g;
                Am.E.b(localThemeScope, companion, strA, str, composer, i12 | 48, 0);
                LocalThemeScope localThemeScope2 = this.f102499a;
                String strA2 = C6408b.a(companion2.d(Y.f99513D1, new Object[0]), composer, i11);
                DeliveryContactInformationViewState deliveryContactInformationViewState2 = this.f102500b;
                String number = PhoneNumberUtils.formatNumber(((deliveryContactInformationViewState2 == null || (validationP = deliveryContactInformationViewState2.p()) == null || (strE2 = validationP.e()) == null) && (strE2 = this.f102502d) == null) ? "" : strE2, Locale.getDefault().getCountry());
                Intrinsics.i(number, "formatNumber(...)");
                Am.E.b(localThemeScope2, companion, strA2, number, composer, i12 | 48, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z10, DeliveryContactInformationViewState deliveryContactInformationViewState, androidx.compose.ui.focus.y yVar, Function1<? super H.g, Unit> function1, String str, InterfaceC5730l0<Boolean> interfaceC5730l0, androidx.compose.ui.focus.y yVar2, String str2, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f102486a = localThemeScope;
            this.f102487b = function0;
            this.f102488c = z10;
            this.f102489d = deliveryContactInformationViewState;
            this.f102490e = yVar;
            this.f102491f = function1;
            this.f102492g = str;
            this.f102493h = interfaceC5730l0;
            this.f102494i = yVar2;
            this.f102495j = str2;
            this.f102496k = interfaceC5772o;
            this.f102497l = interfaceC5730l02;
            this.f102498m = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                function1.invoke(new H.g.ValidateEachField(((Boolean) interfaceC5730l0.getValue()).booleanValue(), ((Boolean) interfaceC5730l02.getValue()).booleanValue()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String phoneNumberInput) {
            Intrinsics.j(phoneNumberInput, "phoneNumberInput");
            function1.invoke(new H.g.SetPhoneNumber(phoneNumberInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String emailInput) {
            Intrinsics.j(emailInput, "emailInput");
            function1.invoke(new H.g.SetEmailAddress(emailInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                function1.invoke(new H.g.ValidateEachField(((Boolean) interfaceC5730l02.getValue()).booleanValue(), ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5772o interfaceC5772o, Function1 function1, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            function1.invoke(new H.g.ValidateEachField(true, true));
            return Unit.f142422a;
        }

        public final void f(Composer composer, int i10) {
            InterfaceC5730l0<Boolean> interfaceC5730l0;
            boolean z10;
            Function1<H.g, Unit> function1;
            DeliveryContactInformationViewState deliveryContactInformationViewState;
            LocalThemeScope localThemeScope;
            int i11;
            InterfaceC5730l0<Boolean> interfaceC5730l02;
            InterfaceC5730l0<Boolean> interfaceC5730l03;
            String str;
            Validation<String> validationP;
            String strE;
            Validation<String> validationM;
            String strE2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1781122354, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationNewScreen.<anonymous> (DeliveryContactInfoScreen.kt:175)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f102486a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            LocalThemeScope localThemeScope2 = this.f102486a;
            Function0<Unit> function0 = this.f102487b;
            boolean z11 = this.f102488c;
            DeliveryContactInformationViewState deliveryContactInformationViewState2 = this.f102489d;
            androidx.compose.ui.focus.y yVar = this.f102490e;
            final Function1<H.g, Unit> function12 = this.f102491f;
            String str2 = this.f102492g;
            InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f102493h;
            androidx.compose.ui.focus.y yVar2 = this.f102494i;
            String str3 = this.f102495j;
            final InterfaceC5772o interfaceC5772o = this.f102496k;
            final InterfaceC5730l0<Boolean> interfaceC5730l05 = this.f102497l;
            final InterfaceC5730l0<Boolean> interfaceC5730l06 = this.f102498m;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
            AbstractC5607a abstractC5607aD = companion3.d(Y.f99456A1, new Object[0]);
            if (!z11 && (deliveryContactInformationViewState2 == null || !deliveryContactInformationViewState2.getIsShowFormInputScreen())) {
                interfaceC5730l0 = interfaceC5730l04;
                z10 = true;
            } else {
                interfaceC5730l0 = interfaceC5730l04;
                z10 = false;
            }
            int i12 = LocalThemeScope.f15770g;
            int i13 = AbstractC5607a.f45514b;
            final InterfaceC5730l0<Boolean> interfaceC5730l07 = interfaceC5730l0;
            C2894i0.j(localThemeScope2, companion, abstractC5607aD, function0, z10, composer, i12 | 48 | (i13 << 6), 0);
            ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp(), 0.0f, localThemeScope2.getAdsSpacing().getThree().getDp(), 4, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 382, null), C6408b.a(companion3.d(Y.f99948a, new Object[0]), composer, i13), null, composer, i12 | (q1.Label.f140080j << 3), 4);
            C17917Z.a(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.i(companion, H1.h.p(1)), localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            Composer composer2 = composer;
            if ((deliveryContactInformationViewState2 == null || !deliveryContactInformationViewState2.getIsShowFormInputScreen()) && !z11) {
                function1 = function12;
                deliveryContactInformationViewState = deliveryContactInformationViewState2;
                localThemeScope = localThemeScope2;
                i11 = i12;
                interfaceC5730l02 = interfaceC5730l07;
                composer2.startReplaceGroup(-1964521983);
                C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), null, null, 6, null), ComposableLambdaKt.c(-1547643954, true, new C1446b(localThemeScope, deliveryContactInformationViewState, str2, str3), composer2, 54), composer2, i11 | 384 | (q1.Column.f139985d << 3));
                composer2.P();
            } else {
                composer2.startReplaceGroup(-1969020920);
                Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(androidx.compose.ui.focus.A.a(companion, yVar), localThemeScope2.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), localThemeScope2.getAdsSpacing().getFive().getDp());
                composer2.startReplaceGroup(-1746271574);
                boolean zV = composer2.V(function12);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11816l.b.g(interfaceC5730l05, function12, interfaceC5730l06, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                Modifier modifierA = C5761d.a(modifierI, (Function1) objB);
                String strC = C16193g.c(Y.f99627J1, composer2, 0);
                String strC2 = C16193g.c(Y.f99570G1, composer2, 0);
                if (deliveryContactInformationViewState2 == null || (validationM = deliveryContactInformationViewState2.m()) == null || (strE2 = validationM.e()) == null) {
                    interfaceC5730l03 = interfaceC5730l05;
                    str = str2;
                } else {
                    str = strE2;
                    interfaceC5730l03 = interfaceC5730l05;
                }
                KeyboardOptions.Companion companion4 = KeyboardOptions.INSTANCE;
                KeyboardOptions keyboardOptionsA = companion4.a();
                KeyboardType.Companion companion5 = KeyboardType.INSTANCE;
                int iC = companion5.c();
                a.Companion companion6 = androidx.compose.ui.text.input.a.INSTANCE;
                KeyboardOptions keyboardOptionsC = KeyboardOptions.c(keyboardOptionsA, 0, null, iC, companion6.d(), null, null, null, 115, null);
                Integer numB = deliveryContactInformationViewState2 != null ? C11816l.B(deliveryContactInformationViewState2) : null;
                composer2.startReplaceGroup(2014746198);
                String strC3 = numB == null ? null : C16193g.c(numB.intValue(), composer2, 0);
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zV2 = composer2.V(function12) | composer2.V(interfaceC5730l07);
                Object objB2 = composer2.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11816l.b.l(function12, interfaceC5730l07, (String) obj);
                        }
                    };
                    composer2.t(objB2);
                }
                Function1 function13 = (Function1) objB2;
                composer2.P();
                final InterfaceC5730l0<Boolean> interfaceC5730l08 = interfaceC5730l03;
                i11 = i12;
                localThemeScope = localThemeScope2;
                U.c(localThemeScope, modifierA, strC, null, strC2, keyboardOptionsC, null, null, str, strC3, null, function13, composer2, i11, 0, 612);
                Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.ui.focus.A.a(companion, yVar2), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                composer2.startReplaceGroup(-1746271574);
                boolean zV3 = composer2.V(function12);
                Object objB3 = composer2.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11816l.b.o(interfaceC5730l06, function12, interfaceC5730l08, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer2.t(objB3);
                }
                composer2.P();
                Modifier modifierA2 = C5761d.a(modifierK, (Function1) objB3);
                String strC4 = C16193g.c(Y.f99684M1, composer2, 0);
                String strC5 = C16193g.c(Y.f99703N1, composer2, 0);
                String str4 = (deliveryContactInformationViewState2 == null || (validationP = deliveryContactInformationViewState2.p()) == null || (strE = validationP.e()) == null) ? str3 : strE;
                KeyboardOptions keyboardOptionsC2 = KeyboardOptions.c(companion4.a(), 0, null, companion5.g(), companion6.b(), null, null, null, 115, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(interfaceC5772o) | composer2.V(function12);
                Object objB4 = composer2.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11816l.b.p(interfaceC5772o, function12, (InterfaceC5692y) obj);
                        }
                    };
                    composer2.t(objB4);
                }
                composer2.P();
                C5693z c5693z = new C5693z((Function1) objB4, null, null, null, null, null, 62, null);
                Ih.H h10 = Ih.H.f13923a;
                composer2.startReplaceGroup(5004770);
                boolean zD2 = composer2.D(h10);
                Object objB5 = composer2.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new a(h10);
                    composer2.t(objB5);
                }
                composer2.P();
                C1447l c1447l = new C1447l((Function1) ((KFunction) objB5));
                Integer numC = deliveryContactInformationViewState2 != null ? C11816l.C(deliveryContactInformationViewState2) : null;
                composer2.startReplaceGroup(2014824982);
                String strC6 = numC != null ? C16193g.c(numC.intValue(), composer2, 0) : null;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zV4 = composer2.V(function12) | composer2.V(interfaceC5730l07);
                Object objB6 = composer2.B();
                if (zV4 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11816l.b.k(function12, interfaceC5730l07, (String) obj);
                        }
                    };
                    composer2.t(objB6);
                }
                composer2.P();
                interfaceC5730l02 = interfaceC5730l07;
                function1 = function12;
                U.c(localThemeScope, modifierA2, strC4, null, strC5, keyboardOptionsC2, c5693z, c1447l, str4, strC6, null, (Function1) objB6, composer2, i11, 0, 516);
                composer2 = composer2;
                composer2.P();
                deliveryContactInformationViewState = deliveryContactInformationViewState2;
            }
            C11816l.k(localThemeScope, interfaceC5730l02, deliveryContactInformationViewState, function1, composer2, i11, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            f(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f102503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f102504b;

        c(boolean z10, DeliveryContactInformationViewState deliveryContactInformationViewState) {
            this.f102503a = z10;
            this.f102504b = deliveryContactInformationViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(44066933, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInfoScreen.<anonymous> (DeliveryContactInfoScreen.kt:84)");
            }
            boolean z10 = this.f102503a;
            DeliveryContactInformationViewState deliveryContactInformationViewState = this.f102504b;
            Am.A.c(z10, deliveryContactInformationViewState != null ? deliveryContactInformationViewState.getCheckoutFlowState() : null, false, composer, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f102507c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f102508d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<H.g, Unit> f102509e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102510f;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1<? super H.g, Unit> function1, Function0<Unit> function0) {
            this.f102505a = localThemeScope;
            this.f102506b = interfaceC5730l0;
            this.f102507c = z10;
            this.f102508d = deliveryContactInformationViewState;
            this.f102509e = function1;
            this.f102510f = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-792728010, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInfoScreen.<anonymous> (DeliveryContactInfoScreen.kt:87)");
            }
            C11816l.o(this.f102505a, Modifier.INSTANCE, this.f102506b, this.f102507c, this.f102508d, this.f102509e, this.f102510f, composer, LocalThemeScope.f15770g | 432, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$e */
    static final class e implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102511a;

        e(LocalThemeScope localThemeScope) {
            this.f102511a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1381059481, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.LoadingState.<anonymous> (DeliveryContactInfoScreen.kt:326)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f102511a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.l$l, reason: collision with other inner class name */
    static final class C1447l implements W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f102512a;

        C1447l(Function1 function) {
            Intrinsics.j(function, "function");
            this.f102512a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f102512a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f102512a.invoke(annotatedString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A(com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            Hk.b r0 = r9.j()
            boolean r1 = r0.getIsValid()
            r2 = 0
            if (r1 != 0) goto L11
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L3e
            java.util.List r1 = r0.c()
            Hk.c$c r3 = new Hk.c$c
            com.meijer.mobile.meijer.activity.checkout.contactinformation.l$f r4 = new com.meijer.mobile.meijer.activity.checkout.contactinformation.l$f
            com.meijer.mobile.meijer.activity.checkout.contactinformation.l$g r5 = new com.meijer.mobile.meijer.activity.checkout.contactinformation.l$g
            r5.<init>(r9)
            r4.<init>(r5)
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            if (r0 == 0) goto L3e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L3f
        L3e:
            r0 = r2
        L3f:
            java.util.List r9 = r9.l()
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f102402c
            boolean r9 = r9.contains(r1)
            if (r9 == 0) goto L4c
            r2 = r0
        L4c:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.C11816l.A(com.meijer.mobile.meijer.activity.checkout.contactinformation.O):boolean");
    }

    public static final Integer B(DeliveryContactInformationViewState deliveryContactInformationViewState) {
        Integer numValueOf;
        Intrinsics.j(deliveryContactInformationViewState, "<this>");
        Validation<String> validationM = deliveryContactInformationViewState.m();
        if (validationM.getIsValid()) {
            validationM = null;
        }
        if (validationM != null) {
            if (!validationM.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(deliveryContactInformationViewState) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.l.i
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((DeliveryContactInformationViewState) this.receiver).m();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.l.h
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationM = null;
            }
            numValueOf = Integer.valueOf(validationM != null ? Y.f100409x1 : Y.f100409x1);
        } else {
            numValueOf = null;
        }
        if (deliveryContactInformationViewState.l().contains(H.i.f102400a)) {
            return numValueOf;
        }
        return null;
    }

    public static final Integer C(DeliveryContactInformationViewState deliveryContactInformationViewState) {
        Integer numValueOf;
        Intrinsics.j(deliveryContactInformationViewState, "<this>");
        Validation<String> validationP = deliveryContactInformationViewState.p();
        if (validationP.getIsValid()) {
            validationP = null;
        }
        if (validationP != null) {
            if (!validationP.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(deliveryContactInformationViewState) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.l.k
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((DeliveryContactInformationViewState) this.receiver).p();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.l.j
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationP = null;
            }
            numValueOf = Integer.valueOf(validationP != null ? Y.f100449z1 : Y.f100449z1);
        } else {
            numValueOf = null;
        }
        if (deliveryContactInformationViewState.l().contains(H.i.f102401b)) {
            return numValueOf;
        }
        return null;
    }

    public static final InitialContactInfo D(DeliveryContactInformationViewState deliveryContactInformationViewState) {
        if (f102482a || deliveryContactInformationViewState == null) {
            return new InitialContactInfo(null, null, 3, null);
        }
        f102482a = true;
        return new InitialContactInfo(deliveryContactInformationViewState.m().e(), deliveryContactInformationViewState.p().e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r17, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r18, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r19, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.C11816l.k(Ji.M, androidx.compose.runtime.l0, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1) {
        function1.invoke(H.g.d.f102386a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, interfaceC5730l0, deliveryContactInformationViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
        function1.invoke(new H.g.SetOptIn(((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function1.invoke(new H.g.ValidateEachField(true, true));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r35, final androidx.compose.ui.Modifier r36, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r37, final boolean r38, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r39, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.C11816l.o(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.l0, boolean, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, InterfaceC5730l0 interfaceC5730l0, boolean z10, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, interfaceC5730l0, z10, deliveryContactInformationViewState, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, boolean r21, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r22, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.C11816l.s(Ji.M, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, z10, deliveryContactInformationViewState, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, deliveryContactInformationViewState, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void w(final LocalThemeScope localThemeScope, final DeliveryContactInformationViewState deliveryContactInformationViewState, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1226097571);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(deliveryContactInformationViewState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                deliveryContactInformationViewState = null;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1226097571, i12, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.LoadingState (DeliveryContactInfoScreen.kt:323)");
            }
            boolean z10 = false;
            if (deliveryContactInformationViewState != null && deliveryContactInformationViewState.getIsLoading()) {
                z10 = true;
            }
            if (z10) {
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1381059481, true, new e(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C11816l.x(localThemeScope, deliveryContactInformationViewState, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
