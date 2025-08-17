package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Am.C2894i0;
import Am.U;
import Hk.Validation;
import Hk.c;
import Ji.LocalThemeScope;
import Ji.Q;
import ak.AbstractC5607a;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
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
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p;
import j0.C14815g;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17985y;
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
import r0.C16692i;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u001aI\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aC\u0010\u0011\u001a\u00020\t*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\t*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010 \u001a\u0004\u0018\u00010\u001b*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\"\u001a\u0010\"\u001a\u0004\u0018\u00010\u001b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001d\"\u001a\u0010$\u001a\u0004\u0018\u00010\u001b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001d\"\u0018\u0010'\u001a\u00020\u0003*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u001a\u0010)\u001a\u00020\u0003*\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isEditMode", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "onAction", "t", "(LJi/M;Landroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "q", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/l0;", "isChecked", "l", "(LJi/M;Landroidx/compose/runtime/l0;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/a;", "G", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/a;", "a", "Z", "isSetInitialPickupPerson", "", "D", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)Ljava/lang/Integer;", "firstNameError", "E", "lastNameError", "C", "emailError", "F", "phoneNumberError", "A", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)Z", "checkBoxError", "B", "checkedState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f104096a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104097a;

        a(LocalThemeScope localThemeScope) {
            this.f104097a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-969645042, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.LoadingState.<anonymous> (PickupPersonScreen.kt:433)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f104097a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonScreenKt$PickupPersonAgreementSection$4$1", f = "PickupPersonScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f104099b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f104100c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C11932p.i.values().length];
                try {
                    iArr[C11932p.i.f104318e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PickupPersonViewState pickupPersonViewState, androidx.compose.ui.focus.y yVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f104099b = pickupPersonViewState;
            this.f104100c = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f104099b, this.f104100c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C11932p.i iVar;
            int i10;
            List<C11932p.i> listQ;
            IntrinsicsKt.f();
            if (this.f104098a == 0) {
                ResultKt.b(obj);
                PickupPersonViewState pickupPersonViewState = this.f104099b;
                if (pickupPersonViewState != null && (listQ = pickupPersonViewState.q()) != null) {
                    iVar = (C11932p.i) CollectionsKt.u0(listQ);
                } else {
                    iVar = null;
                }
                if (iVar == null) {
                    i10 = -1;
                } else {
                    i10 = a.$EnumSwitchMapping$0[iVar.ordinal()];
                }
                if (i10 == 1) {
                    Boxing.a(androidx.compose.ui.focus.y.h(this.f104100c, 0, 1, null));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonScreenKt$PickupPersonAgreementSection$5$1", f = "PickupPersonScreen.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104101a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f104102b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C11932p.g, Unit> f104103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(PickupPersonViewState pickupPersonViewState, Function1<? super C11932p.g, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f104102b = pickupPersonViewState;
            this.f104103c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f104102b, this.f104103c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f104101a == 0) {
                ResultKt.b(obj);
                PickupPersonViewState pickupPersonViewState = this.f104102b;
                if (pickupPersonViewState != null && pickupPersonViewState.getIsEditMode()) {
                    this.f104103c.invoke(new C11932p.g.SetOptIn(true));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f104105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f104106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C11932p.g, Unit> f104107d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f104108e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f104109f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InitialPickupPerson f104110g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f104111h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f104112i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f104113j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f104114k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104115l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104116m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104117n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104118o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104119p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104120a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<C11932p.g, Unit> f104121b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f104122c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PickupPersonViewState f104123d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f104124e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InitialPickupPerson f104125f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f104126g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f104127h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.y f104128i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f104129j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104130k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104131l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104132m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104133n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104134o;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.C$d$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1499a extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
                C1499a(Object obj) {
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
            static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104135a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PickupPersonViewState f104136b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InitialPickupPerson f104137c;

                b(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, InitialPickupPerson initialPickupPerson) {
                    this.f104135a = localThemeScope;
                    this.f104136b = pickupPersonViewState;
                    this.f104137c = initialPickupPerson;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    String email;
                    String phoneNumber;
                    Validation<String> validationP;
                    Validation<String> validationI;
                    Validation<String> validationM;
                    Validation<String> validationJ;
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1625303743, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormFieldsSectionNewUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonScreen.kt:351)");
                    }
                    LocalThemeScope localThemeScope = this.f104135a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
                    AbstractC5607a abstractC5607aD = companion2.d(Y.f99494C1, new Object[0]);
                    int i11 = AbstractC5607a.f45514b;
                    String strA = C6408b.a(abstractC5607aD, composer, i11);
                    StringBuilder sb2 = new StringBuilder();
                    PickupPersonViewState pickupPersonViewState = this.f104136b;
                    String strE = null;
                    sb2.append((pickupPersonViewState == null || (validationJ = pickupPersonViewState.j()) == null) ? null : validationJ.e());
                    sb2.append(' ');
                    PickupPersonViewState pickupPersonViewState2 = this.f104136b;
                    if (pickupPersonViewState2 != null && (validationM = pickupPersonViewState2.m()) != null) {
                        strE = validationM.e();
                    }
                    sb2.append(strE);
                    String string = sb2.toString();
                    int i12 = LocalThemeScope.f15770g;
                    Am.E.b(localThemeScope, companion, strA, string, composer, i12 | 48, 0);
                    LocalThemeScope localThemeScope2 = this.f104135a;
                    String strA2 = C6408b.a(companion2.d(Y.f99475B1, new Object[0]), composer, i11);
                    PickupPersonViewState pickupPersonViewState3 = this.f104136b;
                    Am.E.b(localThemeScope2, companion, strA2, ((pickupPersonViewState3 == null || (validationI = pickupPersonViewState3.i()) == null || (email = validationI.e()) == null) && (email = this.f104137c.getEmail()) == null) ? "" : email, composer, i12 | 48, 0);
                    LocalThemeScope localThemeScope3 = this.f104135a;
                    String strA3 = C6408b.a(companion2.d(Y.f99513D1, new Object[0]), composer, i11);
                    PickupPersonViewState pickupPersonViewState4 = this.f104136b;
                    String number = PhoneNumberUtils.formatNumber(((pickupPersonViewState4 == null || (validationP = pickupPersonViewState4.p()) == null || (phoneNumber = validationP.e()) == null) && (phoneNumber = this.f104137c.getPhoneNumber()) == null) ? "" : phoneNumber, Locale.getDefault().getCountry());
                    Intrinsics.i(number, "formatNumber(...)");
                    Am.E.b(localThemeScope3, companion, strA3, number, composer, i12 | 48, 0);
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
            a(LocalThemeScope localThemeScope, Function1<? super C11932p.g, Unit> function1, boolean z10, PickupPersonViewState pickupPersonViewState, androidx.compose.ui.focus.y yVar, InitialPickupPerson initialPickupPerson, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05) {
                this.f104120a = localThemeScope;
                this.f104121b = function1;
                this.f104122c = z10;
                this.f104123d = pickupPersonViewState;
                this.f104124e = yVar;
                this.f104125f = initialPickupPerson;
                this.f104126g = yVar2;
                this.f104127h = yVar3;
                this.f104128i = yVar4;
                this.f104129j = interfaceC5772o;
                this.f104130k = interfaceC5730l0;
                this.f104131l = interfaceC5730l02;
                this.f104132m = interfaceC5730l03;
                this.f104133n = interfaceC5730l04;
                this.f104134o = interfaceC5730l05;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(Function1 function1) {
                function1.invoke(C11932p.g.c.f104290a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String lastNameInput) {
                Intrinsics.j(lastNameInput, "lastNameInput");
                function1.invoke(new C11932p.g.SetLastName(lastNameInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, androidx.compose.ui.focus.E onFocusChanged) {
                Intrinsics.j(onFocusChanged, "onFocusChanged");
                if (onFocusChanged.a()) {
                    interfaceC5730l0.setValue(Boolean.TRUE);
                } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                    function1.invoke(new C11932p.g.ValidateEachField(((Boolean) interfaceC5730l02.getValue()).booleanValue(), ((Boolean) interfaceC5730l03.getValue()).booleanValue(), ((Boolean) interfaceC5730l0.getValue()).booleanValue(), ((Boolean) interfaceC5730l04.getValue()).booleanValue()));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String emailInput) {
                Intrinsics.j(emailInput, "emailInput");
                function1.invoke(new C11932p.g.SetEmailAddress(emailInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, androidx.compose.ui.focus.E onFocusChanged) {
                Intrinsics.j(onFocusChanged, "onFocusChanged");
                if (onFocusChanged.a()) {
                    interfaceC5730l0.setValue(Boolean.TRUE);
                } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                    function1.invoke(new C11932p.g.ValidateEachField(((Boolean) interfaceC5730l02.getValue()).booleanValue(), ((Boolean) interfaceC5730l03.getValue()).booleanValue(), ((Boolean) interfaceC5730l04.getValue()).booleanValue(), ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(InterfaceC5772o interfaceC5772o, Function1 function1, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                function1.invoke(new C11932p.g.ValidateEachField(true, true, true, true));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String phoneNumberInput) {
                Intrinsics.j(phoneNumberInput, "phoneNumberInput");
                function1.invoke(new C11932p.g.SetPhoneNumber(phoneNumberInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, androidx.compose.ui.focus.E onFocusChanged) {
                Intrinsics.j(onFocusChanged, "onFocusChanged");
                if (onFocusChanged.a()) {
                    interfaceC5730l0.setValue(Boolean.TRUE);
                } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                    function1.invoke(new C11932p.g.ValidateEachField(((Boolean) interfaceC5730l0.getValue()).booleanValue(), ((Boolean) interfaceC5730l02.getValue()).booleanValue(), ((Boolean) interfaceC5730l03.getValue()).booleanValue(), ((Boolean) interfaceC5730l04.getValue()).booleanValue()));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String firstNameInput) {
                Intrinsics.j(firstNameInput, "firstNameInput");
                function1.invoke(new C11932p.g.SetFirstName(firstNameInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, androidx.compose.ui.focus.E onFocusChanged) {
                Intrinsics.j(onFocusChanged, "onFocusChanged");
                if (onFocusChanged.a()) {
                    interfaceC5730l0.setValue(Boolean.TRUE);
                } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                    function1.invoke(new C11932p.g.ValidateEachField(((Boolean) interfaceC5730l02.getValue()).booleanValue(), ((Boolean) interfaceC5730l0.getValue()).booleanValue(), ((Boolean) interfaceC5730l03.getValue()).booleanValue(), ((Boolean) interfaceC5730l04.getValue()).booleanValue()));
                }
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                p(composer, num.intValue());
                return Unit.f142422a;
            }

            public final void p(Composer composer, int i10) {
                androidx.compose.ui.focus.y yVar;
                boolean z10;
                Composer composer2;
                LocalThemeScope localThemeScope;
                Function1<C11932p.g, Unit> function1;
                int i11;
                PickupPersonViewState pickupPersonViewState;
                Object obj;
                InterfaceC5730l0<Boolean> interfaceC5730l0;
                final Function1<C11932p.g, Unit> function12;
                String firstName;
                final InterfaceC5730l0<Boolean> interfaceC5730l02;
                Object obj2;
                final Function1<C11932p.g, Unit> function13;
                String lastName;
                final InterfaceC5730l0<Boolean> interfaceC5730l03;
                Object obj3;
                final Function1<C11932p.g, Unit> function14;
                String email;
                final InterfaceC5730l0<Boolean> interfaceC5730l04;
                final Function1<C11932p.g, Unit> function15;
                String phoneNumber;
                final InterfaceC5730l0<Boolean> interfaceC5730l05;
                Validation<String> validationP;
                Validation<String> validationI;
                Validation<String> validationM;
                Validation<String> validationJ;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1915367259, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormFieldsSectionNewUI.<anonymous>.<anonymous> (PickupPersonScreen.kt:143)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f104120a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                LocalThemeScope localThemeScope2 = this.f104120a;
                final Function1<C11932p.g, Unit> function16 = this.f104121b;
                boolean z11 = this.f104122c;
                PickupPersonViewState pickupPersonViewState2 = this.f104123d;
                androidx.compose.ui.focus.y yVar2 = this.f104124e;
                InitialPickupPerson initialPickupPerson = this.f104125f;
                androidx.compose.ui.focus.y yVar3 = this.f104126g;
                androidx.compose.ui.focus.y yVar4 = this.f104127h;
                androidx.compose.ui.focus.y yVar5 = this.f104128i;
                final InterfaceC5772o interfaceC5772o = this.f104129j;
                InterfaceC5730l0<Boolean> interfaceC5730l06 = this.f104130k;
                final InterfaceC5730l0<Boolean> interfaceC5730l07 = this.f104131l;
                final InterfaceC5730l0<Boolean> interfaceC5730l08 = this.f104132m;
                final InterfaceC5730l0<Boolean> interfaceC5730l09 = this.f104133n;
                final InterfaceC5730l0<Boolean> interfaceC5730l010 = this.f104134o;
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
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function16);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.d.a.q(function16);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                if (z11) {
                    yVar = yVar4;
                    z10 = false;
                } else if (pickupPersonViewState2 == null || !pickupPersonViewState2.getIsShowFormInputScreen()) {
                    yVar = yVar4;
                    z10 = true;
                } else {
                    yVar = yVar4;
                    z10 = false;
                }
                int i12 = LocalThemeScope.f15770g;
                int i13 = AbstractC5607a.f45514b;
                InterfaceC5730l0<Boolean> interfaceC5730l011 = interfaceC5730l06;
                C2894i0.j(localThemeScope2, companion, abstractC5607aD, function0, z10, composer, i12 | 48 | (i13 << 6), 0);
                androidx.compose.ui.focus.y yVar6 = yVar;
                ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp(), 0.0f, localThemeScope2.getAdsSpacing().getThree().getDp(), 4, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 382, null), C6408b.a(companion3.d(Y.f99948a, new Object[0]), composer, i13), null, composer, i12 | (q1.Label.f140080j << 3), 4);
                C17917Z.a(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.i(companion, H1.h.p(1)), localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                if ((pickupPersonViewState2 == null || !pickupPersonViewState2.getIsShowFormInputScreen()) && !z11) {
                    composer2 = composer;
                    localThemeScope = localThemeScope2;
                    function1 = function16;
                    i11 = i12;
                    composer2.startReplaceGroup(605087466);
                    pickupPersonViewState = pickupPersonViewState2;
                    C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), null, null, 6, null), ComposableLambdaKt.c(-1625303743, true, new b(localThemeScope, pickupPersonViewState, initialPickupPerson), composer2, 54), composer2, i11 | 384 | (q1.Column.f139985d << 3));
                    composer2.P();
                } else {
                    composer.startReplaceGroup(595303370);
                    Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.ui.focus.A.a(companion, yVar2), localThemeScope2.getAdsSpacing().getFive().getDp());
                    composer.startReplaceGroup(-1224400529);
                    boolean zV2 = composer.V(function16);
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        obj = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.E
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.x(interfaceC5730l07, function16, interfaceC5730l08, interfaceC5730l09, interfaceC5730l010, (androidx.compose.ui.focus.E) obj4);
                            }
                        };
                        interfaceC5730l0 = interfaceC5730l07;
                        function12 = function16;
                        composer.t(obj);
                    } else {
                        obj = objB2;
                        function12 = function16;
                        interfaceC5730l0 = interfaceC5730l07;
                    }
                    composer.P();
                    Modifier modifierA = C5761d.a(modifierI, (Function1) obj);
                    String strC = C16193g.c(Y.f99694Mb, composer, 0);
                    String strC2 = C16193g.c(Y.f99675Lb, composer, 0);
                    if (pickupPersonViewState2 == null || (validationJ = pickupPersonViewState2.j()) == null || (firstName = validationJ.e()) == null) {
                        firstName = initialPickupPerson.getFirstName();
                    }
                    KeyboardOptions.Companion companion4 = KeyboardOptions.INSTANCE;
                    KeyboardOptions keyboardOptionsA = companion4.a();
                    KeyboardType.Companion companion5 = KeyboardType.INSTANCE;
                    int iH = companion5.h();
                    a.Companion companion6 = androidx.compose.ui.text.input.a.INSTANCE;
                    KeyboardOptions keyboardOptionsC = KeyboardOptions.c(keyboardOptionsA, 0, null, iH, companion6.d(), null, null, null, 115, null);
                    Integer numD = pickupPersonViewState2 != null ? C.D(pickupPersonViewState2) : null;
                    composer.startReplaceGroup(1681826633);
                    String strC3 = numD == null ? null : C16193g.c(numD.intValue(), composer, 0);
                    composer.P();
                    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(25);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV3 = composer.V(function12);
                    Object objB3 = composer.B();
                    if (zV3 || objB3 == Composer.INSTANCE.a()) {
                        interfaceC5730l02 = interfaceC5730l011;
                        objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.F
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.y(function12, interfaceC5730l02, (String) obj4);
                            }
                        };
                        composer.t(objB3);
                    } else {
                        interfaceC5730l02 = interfaceC5730l011;
                    }
                    composer.P();
                    final Function1<C11932p.g, Unit> function17 = function12;
                    composer2 = composer;
                    localThemeScope = localThemeScope2;
                    InterfaceC5730l0<Boolean> interfaceC5730l012 = interfaceC5730l02;
                    U.c(localThemeScope, modifierA, strC, null, strC2, keyboardOptionsC, null, null, firstName, strC3, lengthFilter, (Function1) objB3, composer2, i12, 0, 100);
                    Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.ui.focus.A.a(companion, yVar3), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zV4 = composer2.V(function17);
                    Object objB4 = composer2.B();
                    if (zV4 || objB4 == Composer.INSTANCE.a()) {
                        final InterfaceC5730l0<Boolean> interfaceC5730l013 = interfaceC5730l0;
                        obj2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.G
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.z(interfaceC5730l08, function17, interfaceC5730l013, interfaceC5730l09, interfaceC5730l010, (androidx.compose.ui.focus.E) obj4);
                            }
                        };
                        function13 = function17;
                        composer2.t(obj2);
                    } else {
                        obj2 = objB4;
                        function13 = function17;
                    }
                    composer2.P();
                    Modifier modifierA2 = C5761d.a(modifierK, (Function1) obj2);
                    String strC4 = C16193g.c(Y.f99732Ob, composer2, 0);
                    String strC5 = C16193g.c(Y.f99713Nb, composer2, 0);
                    if (pickupPersonViewState2 == null || (validationM = pickupPersonViewState2.m()) == null || (lastName = validationM.e()) == null) {
                        lastName = initialPickupPerson.getLastName();
                    }
                    KeyboardOptions keyboardOptionsC2 = KeyboardOptions.c(companion4.a(), 0, null, companion5.h(), companion6.d(), null, null, null, 115, null);
                    Integer numE = pickupPersonViewState2 != null ? C.E(pickupPersonViewState2) : null;
                    composer2.startReplaceGroup(1681901897);
                    String strC6 = numE == null ? null : C16193g.c(numE.intValue(), composer2, 0);
                    composer2.P();
                    InputFilter.LengthFilter lengthFilter2 = new InputFilter.LengthFilter(25);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV5 = composer2.V(function13);
                    Object objB5 = composer2.B();
                    if (zV5 || objB5 == Composer.INSTANCE.a()) {
                        interfaceC5730l03 = interfaceC5730l012;
                        objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.H
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.r(function13, interfaceC5730l03, (String) obj4);
                            }
                        };
                        composer2.t(objB5);
                    } else {
                        interfaceC5730l03 = interfaceC5730l012;
                    }
                    composer2.P();
                    final Function1<C11932p.g, Unit> function18 = function13;
                    i11 = i12;
                    InterfaceC5730l0<Boolean> interfaceC5730l014 = interfaceC5730l03;
                    U.c(localThemeScope, modifierA2, strC4, null, strC5, keyboardOptionsC2, null, null, lastName, strC6, lengthFilter2, (Function1) objB5, composer2, i11, 0, 100);
                    Modifier modifierI2 = androidx.compose.foundation.layout.D.i(androidx.compose.ui.focus.A.a(companion, yVar6), localThemeScope.getAdsSpacing().getFive().getDp());
                    composer2.startReplaceGroup(-1224400529);
                    boolean zV6 = composer2.V(function18);
                    Object objB6 = composer2.B();
                    if (zV6 || objB6 == Composer.INSTANCE.a()) {
                        final InterfaceC5730l0<Boolean> interfaceC5730l015 = interfaceC5730l0;
                        obj3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.I
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.s(interfaceC5730l09, function18, interfaceC5730l015, interfaceC5730l08, interfaceC5730l010, (androidx.compose.ui.focus.E) obj4);
                            }
                        };
                        function14 = function18;
                        composer2.t(obj3);
                    } else {
                        obj3 = objB6;
                        function14 = function18;
                    }
                    composer2.P();
                    Modifier modifierA3 = C5761d.a(modifierI2, (Function1) obj3);
                    String strC7 = C16193g.c(Y.f99627J1, composer2, 0);
                    String strC8 = C16193g.c(Y.f99570G1, composer2, 0);
                    if (pickupPersonViewState2 == null || (validationI = pickupPersonViewState2.i()) == null || (email = validationI.e()) == null) {
                        email = initialPickupPerson.getEmail();
                    }
                    KeyboardOptions keyboardOptionsC3 = KeyboardOptions.c(companion4.a(), 0, null, companion5.c(), companion6.d(), null, null, null, 115, null);
                    Integer numC = pickupPersonViewState2 != null ? C.C(pickupPersonViewState2) : null;
                    composer2.startReplaceGroup(1681977513);
                    String strC9 = numC == null ? null : C16193g.c(numC.intValue(), composer2, 0);
                    composer2.P();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV7 = composer2.V(function14);
                    Object objB7 = composer2.B();
                    if (zV7 || objB7 == Composer.INSTANCE.a()) {
                        interfaceC5730l04 = interfaceC5730l014;
                        objB7 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.J
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.t(function14, interfaceC5730l04, (String) obj4);
                            }
                        };
                        composer2.t(objB7);
                    } else {
                        interfaceC5730l04 = interfaceC5730l014;
                    }
                    composer2.P();
                    InterfaceC5730l0<Boolean> interfaceC5730l016 = interfaceC5730l04;
                    final Function1<C11932p.g, Unit> function19 = function14;
                    U.c(localThemeScope, modifierA3, strC7, null, strC8, keyboardOptionsC3, null, null, email, strC9, null, (Function1) objB7, composer2, i11, 0, 612);
                    Modifier modifierK2 = androidx.compose.foundation.layout.D.k(androidx.compose.ui.focus.A.a(companion, yVar5), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zV8 = composer2.V(function19);
                    Object objB8 = composer2.B();
                    if (zV8 || objB8 == Composer.INSTANCE.a()) {
                        final InterfaceC5730l0<Boolean> interfaceC5730l017 = interfaceC5730l0;
                        objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.K
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.u(interfaceC5730l010, function19, interfaceC5730l017, interfaceC5730l08, interfaceC5730l09, (androidx.compose.ui.focus.E) obj4);
                            }
                        };
                        function15 = function19;
                        composer2.t(objB8);
                    } else {
                        function15 = function19;
                    }
                    composer2.P();
                    Modifier modifierA4 = C5761d.a(modifierK2, (Function1) objB8);
                    String strC10 = C16193g.c(Y.f99684M1, composer2, 0);
                    String strC11 = C16193g.c(Y.f99703N1, composer2, 0);
                    if (pickupPersonViewState2 == null || (validationP = pickupPersonViewState2.p()) == null || (phoneNumber = validationP.e()) == null) {
                        phoneNumber = initialPickupPerson.getPhoneNumber();
                    }
                    String str = phoneNumber;
                    KeyboardOptions keyboardOptionsC4 = KeyboardOptions.c(companion4.a(), 0, null, companion5.g(), companion6.b(), null, null, null, 115, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD = composer2.D(interfaceC5772o) | composer2.V(function15);
                    Object objB9 = composer2.B();
                    if (zD || objB9 == Composer.INSTANCE.a()) {
                        objB9 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.L
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.v(interfaceC5772o, function15, (InterfaceC5692y) obj4);
                            }
                        };
                        composer2.t(objB9);
                    }
                    composer2.P();
                    C5693z c5693z = new C5693z((Function1) objB9, null, null, null, null, null, 62, null);
                    Ih.H h10 = Ih.H.f13923a;
                    composer2.startReplaceGroup(5004770);
                    boolean zD2 = composer2.D(h10);
                    Object objB10 = composer2.B();
                    if (zD2 || objB10 == Composer.INSTANCE.a()) {
                        objB10 = new C1499a(h10);
                        composer2.t(objB10);
                    }
                    composer2.P();
                    m mVar = new m((Function1) ((KFunction) objB10));
                    Integer numF = pickupPersonViewState2 != null ? C.F(pickupPersonViewState2) : null;
                    composer2.startReplaceGroup(1682072393);
                    String strC12 = numF != null ? C16193g.c(numF.intValue(), composer2, 0) : null;
                    composer2.P();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV9 = composer2.V(function15);
                    Object objB11 = composer2.B();
                    if (zV9 || objB11 == Composer.INSTANCE.a()) {
                        interfaceC5730l05 = interfaceC5730l016;
                        objB11 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.M
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return C.d.a.w(function15, interfaceC5730l05, (String) obj4);
                            }
                        };
                        composer2.t(objB11);
                    } else {
                        interfaceC5730l05 = interfaceC5730l016;
                    }
                    composer2.P();
                    interfaceC5730l011 = interfaceC5730l05;
                    function1 = function15;
                    U.c(localThemeScope, modifierA4, strC10, null, strC11, keyboardOptionsC4, c5693z, mVar, str, strC12, null, (Function1) objB11, composer2, i11, 0, 516);
                    composer2.P();
                    pickupPersonViewState = pickupPersonViewState2;
                }
                C.l(localThemeScope, interfaceC5730l011, pickupPersonViewState, function1, composer2, i11 | 48, 0);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, Modifier modifier, Function1<? super C11932p.g, Unit> function1, boolean z10, androidx.compose.ui.focus.y yVar, InitialPickupPerson initialPickupPerson, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05) {
            this.f104104a = localThemeScope;
            this.f104105b = pickupPersonViewState;
            this.f104106c = modifier;
            this.f104107d = function1;
            this.f104108e = z10;
            this.f104109f = yVar;
            this.f104110g = initialPickupPerson;
            this.f104111h = yVar2;
            this.f104112i = yVar3;
            this.f104113j = yVar4;
            this.f104114k = interfaceC5772o;
            this.f104115l = interfaceC5730l0;
            this.f104116m = interfaceC5730l02;
            this.f104117n = interfaceC5730l03;
            this.f104118o = interfaceC5730l04;
            this.f104119p = interfaceC5730l05;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-323932248, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormFieldsSectionNewUI.<anonymous> (PickupPersonScreen.kt:125)");
            }
            LocalThemeScope localThemeScope = this.f104104a;
            Modifier.Companion companion = Modifier.INSTANCE;
            PickupPersonViewState pickupPersonViewState = this.f104105b;
            C2894i0.h(localThemeScope, companion, pickupPersonViewState != null ? pickupPersonViewState.getOrderTypeHeaderDataDecorator() : null, composer, LocalThemeScope.f15770g | 48 | (AbstractC5607a.f45514b << 6), 0);
            C17985y.a(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(this.f104106c, this.f104104a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null), null, false, 3, null), this.f104104a.getAdsSpacing().getFive().getDp(), 0.0f, this.f104104a.getAdsSpacing().getFive().getDp(), this.f104104a.getAdsSpacing().getFive().getDp(), 2, null), C16692i.c(this.f104104a.getAdsCornerRadii().getRadius03().getDp()), 0L, 0L, null, H1.h.p(2), ComposableLambdaKt.c(-1915367259, true, new a(this.f104104a, this.f104107d, this.f104108e, this.f104105b, this.f104109f, this.f104110g, this.f104111h, this.f104112i, this.f104113j, this.f104114k, this.f104115l, this.f104116m, this.f104117n, this.f104118o, this.f104119p), composer, 54), composer, 1769472, 28);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f104138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f104139b;

        e(boolean z10, PickupPersonViewState pickupPersonViewState) {
            this.f104138a = z10;
            this.f104139b = pickupPersonViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1344711403, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonScreen.<anonymous> (PickupPersonScreen.kt:83)");
            }
            boolean z10 = this.f104138a;
            PickupPersonViewState pickupPersonViewState = this.f104139b;
            Am.A.c(z10, pickupPersonViewState != null ? pickupPersonViewState.getCheckoutFlowState() : null, false, composer, 0, 4);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f104141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f104142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C11932p.g, Unit> f104143d;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, boolean z10, Function1<? super C11932p.g, Unit> function1) {
            this.f104140a = localThemeScope;
            this.f104141b = pickupPersonViewState;
            this.f104142c = z10;
            this.f104143d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-660779476, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonScreen.<anonymous> (PickupPersonScreen.kt:86)");
            }
            C.q(this.f104140a, Modifier.INSTANCE, this.f104141b, this.f104142c, this.f104143d, composer, LocalThemeScope.f15770g | 48, 0);
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
    static final class m implements W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f104144a;

        m(Function1 function) {
            Intrinsics.j(function, "function");
            this.f104144a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f104144a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f104144a.invoke(annotatedString);
        }
    }

    public static final boolean B(PickupPersonViewState pickupPersonViewState) {
        Validation<Boolean> validationG;
        if (pickupPersonViewState == null || !pickupPersonViewState.getIsEditMode()) {
            return (pickupPersonViewState == null || (validationG = pickupPersonViewState.g()) == null || !validationG.e().booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A(com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            Hk.b r0 = r9.g()
            boolean r1 = r0.getIsValid()
            r2 = 0
            if (r1 != 0) goto L11
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L3f
            java.util.List r1 = r0.c()
            Hk.c$c r3 = new Hk.c$c
            com.meijer.mobile.meijer.activity.checkout.pickupperson.C$g r4 = new com.meijer.mobile.meijer.activity.checkout.pickupperson.C$g
            com.meijer.mobile.meijer.activity.checkout.pickupperson.C$h r5 = new com.meijer.mobile.meijer.activity.checkout.pickupperson.C$h
            r5.<init>(r9)
            r4.<init>(r5)
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "invalid boolean value"
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L39
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L40
        L3f:
            r0 = r2
        L40:
            java.util.List r9 = r9.q()
            com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i r1 = com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.i.f104318e
            boolean r9 = r9.contains(r1)
            if (r9 == 0) goto L4d
            r2 = r0
        L4d:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.A(com.meijer.mobile.meijer.activity.checkout.pickupperson.N):boolean");
    }

    public static final Integer C(PickupPersonViewState pickupPersonViewState) {
        Integer numValueOf;
        Intrinsics.j(pickupPersonViewState, "<this>");
        Validation<String> validationI = pickupPersonViewState.i();
        if (validationI.getIsValid()) {
            validationI = null;
        }
        if (validationI != null) {
            if (!validationI.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(pickupPersonViewState) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.j
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PickupPersonViewState) this.receiver).i();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.i
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, "Email field not valid", 2, null))) {
                validationI = null;
            }
            numValueOf = Integer.valueOf(validationI != null ? Y.f100409x1 : Y.f100409x1);
        } else {
            numValueOf = null;
        }
        if (pickupPersonViewState.q().contains(C11932p.i.f104316c)) {
            return numValueOf;
        }
        return null;
    }

    public static final Integer F(PickupPersonViewState pickupPersonViewState) {
        Integer numValueOf;
        Intrinsics.j(pickupPersonViewState, "<this>");
        Validation<String> validationP = pickupPersonViewState.p();
        if (validationP.getIsValid()) {
            validationP = null;
        }
        if (validationP != null) {
            if (!validationP.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(pickupPersonViewState) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.l
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PickupPersonViewState) this.receiver).p();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.k
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, "phone number not supported", 2, null))) {
                validationP = null;
            }
            numValueOf = Integer.valueOf(validationP != null ? Y.f100449z1 : Y.f100449z1);
        } else {
            numValueOf = null;
        }
        if (pickupPersonViewState.q().contains(C11932p.i.f104317d)) {
            return numValueOf;
        }
        return null;
    }

    public static final InitialPickupPerson G(PickupPersonViewState pickupPersonViewState) {
        if (f104096a || pickupPersonViewState == null) {
            return new InitialPickupPerson(null, null, null, null, 15, null);
        }
        f104096a = true;
        return new InitialPickupPerson(pickupPersonViewState.j().e(), pickupPersonViewState.m().e(), pickupPersonViewState.i().e(), pickupPersonViewState.p().e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, int i10, Composer composer, int i11) {
        j(localThemeScope, pickupPersonViewState, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r18, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r19, com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r20, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.g, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.l(Ji.M, androidx.compose.runtime.l0, com.meijer.mobile.meijer.activity.checkout.pickupperson.N, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C11932p.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
        function1.invoke(new C11932p.g.SetOptIn(((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function1.invoke(new C11932p.g.ValidateEachField(true, true, true, true));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(C11932p.g.n.f104310a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, PickupPersonViewState pickupPersonViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, interfaceC5730l0, pickupPersonViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(Ji.LocalThemeScope r33, final androidx.compose.ui.Modifier r34, com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r35, final boolean r36, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.g, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.q(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.pickupperson.N, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, PickupPersonViewState pickupPersonViewState, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, pickupPersonViewState, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(C11932p.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ji.LocalThemeScope r14, androidx.compose.ui.Modifier r15, boolean r16, com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r17, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.g, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C.t(Ji.M, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.pickupperson.N, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(C11932p.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, PickupPersonViewState pickupPersonViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, z10, pickupPersonViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer D(PickupPersonViewState pickupPersonViewState) {
        Integer numValueOf;
        Validation<String> validationJ = pickupPersonViewState.j();
        if (validationJ.getIsValid()) {
            validationJ = null;
        }
        if (validationJ != null) {
            numValueOf = Integer.valueOf(Y.f100429y1);
        } else {
            numValueOf = null;
        }
        if (!pickupPersonViewState.q().contains(C11932p.i.f104314a)) {
            return null;
        }
        return numValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer E(PickupPersonViewState pickupPersonViewState) {
        Integer numValueOf;
        Validation<String> validationM = pickupPersonViewState.m();
        if (validationM.getIsValid()) {
            validationM = null;
        }
        if (validationM != null) {
            numValueOf = Integer.valueOf(Y.f100429y1);
        } else {
            numValueOf = null;
        }
        if (!pickupPersonViewState.q().contains(C11932p.i.f104315b)) {
            return null;
        }
        return numValueOf;
    }

    private static final void j(final LocalThemeScope localThemeScope, final PickupPersonViewState pickupPersonViewState, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1898319320);
        if ((i10 & 6) == 0) {
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
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(pickupPersonViewState)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1898319320, i11, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.LoadingState (PickupPersonScreen.kt:430)");
            }
            boolean z10 = false;
            if (pickupPersonViewState != null && pickupPersonViewState.getIsLoading()) {
                z10 = true;
            }
            if (z10) {
                Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-969645042, true, new a(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.k(localThemeScope, pickupPersonViewState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
