package com.meijer.mobile.singlepagecheckout;

import Ik.Validation;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import android.telephony.PhoneNumberUtils;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.InitialPickupPerson;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState;
import com.meijer.mobile.singlepagecheckout.C0;
import j0.C14903g;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.q1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import oi.C16208z0;
import p1.C16338g;
import pi.C16453n;
import r1.C16819m;
import z1.TransformedText;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a]\u0010\u0014\u001a\u00020\n*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001d²\u0006\u000e\u0010\u0016\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isEditMode", "isContactInfoProvided", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "pickupPersonViewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "onPickUpAction", "Lkotlin/Function0;", "onEdit", "onTermsAndConditionClick", "content", "p", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/l0;", "isChecked", "j", "(LKi/M;Landroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "emailAddressHasBeenFocusedOn", "phoneNumberHasBeenFocusedOn", "", "lastAction", "isShowFormInputScreen", "isAgreedToTerms", "isLoading", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class C0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PickupPersonViewState f118630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f118631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f118632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f118633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<C12057p.g, Unit> f118634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InitialPickupPerson f118635g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f118636h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f118637i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118638j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118639k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f118640l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118641m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118642n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118643o;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.C0$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1909a extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
            C1909a(Object obj) {
                super(1, obj, Jh.H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransformedText invoke(AnnotatedString p02) {
                Intrinsics.j(p02, "p0");
                return ((Jh.H) this.receiver).a(p02);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PickupPersonViewState f118645b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InitialPickupPerson f118646c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f118647d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.C0$a$b$a, reason: collision with other inner class name */
            static final class C1910a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1910a f118648a = new C1910a();

                C1910a() {
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.C0$a$b$b, reason: collision with other inner class name */
            static final class C1911b implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1911b f118649a = new C1911b();

                C1911b() {
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f118650a;

                c(L1.h hVar) {
                    this.f118650a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f118650a.getBottom(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class d extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f118651f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(L1.A a10) {
                    super(1);
                    this.f118651f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f118651f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f118652f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f118653g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f118654h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118655i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ PickupPersonViewState f118656j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InitialPickupPerson f118657k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f118658l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, InitialPickupPerson initialPickupPerson, Function0 function02) {
                    super(2);
                    this.f118653g = nVar;
                    this.f118654h = function0;
                    this.f118655i = localThemeScope;
                    this.f118656j = pickupPersonViewState;
                    this.f118657k = initialPickupPerson;
                    this.f118658l = function02;
                    this.f118652f = i10;
                }

                public final void a(Composer composer, int i10) {
                    String email;
                    String phoneNumber;
                    Validation<String> validationQ;
                    Validation<String> validationJ;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f118653g.getHelpersHashCode();
                    this.f118653g.i();
                    L1.n nVar = this.f118653g;
                    composer.startReplaceGroup(271442518);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    L1.h hVarD = bVarM.d();
                    LocalThemeScope localThemeScope = this.f118655i;
                    Ki.I one = localThemeScope.getAdsTypography().getBody().getOne();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C1910a.f118648a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarA, (Function1) objB), 0.0f, this.f118655i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one, null, 382, null);
                    PickupPersonViewState pickupPersonViewState = this.f118656j;
                    String str = ((pickupPersonViewState == null || (validationJ = pickupPersonViewState.j()) == null || (email = validationJ.e()) == null) && (email = this.f118657k.getEmail()) == null) ? "" : email;
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C1911b.f118649a;
                        composer.t(objB2);
                    }
                    composer.P();
                    oi.P0.k(this.f118655i, C16208z0.f154285a, C16338g.c(com.meijer.mobile.meijer.Y.f100551M6, composer, 0), this.f118658l, FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB2), "Button", "edit contact info"), null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 240);
                    LocalThemeScope localThemeScope2 = this.f118655i;
                    Ki.I one2 = localThemeScope2.getAdsTypography().getBody().getOne();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV || objB3 == companion2.a()) {
                        objB3 = new c(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.H(nVar.k(companion, hVarD, (Function1) objB3), null, false, 3, null), 0.0f, this.f118655i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one2, null, 382, null);
                    PickupPersonViewState pickupPersonViewState2 = this.f118656j;
                    if ((pickupPersonViewState2 == null || (validationQ = pickupPersonViewState2.q()) == null || (phoneNumber = validationQ.e()) == null) && (phoneNumber = this.f118657k.getPhoneNumber()) == null) {
                        phoneNumber = "";
                    }
                    String number = PhoneNumberUtils.formatNumber(phoneNumber, Locale.getDefault().getCountry());
                    Intrinsics.i(number, "formatNumber(...)");
                    si.j.h(localThemeScope2, label2, number, null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                    if (this.f118653g.getHelpersHashCode() != helpersHashCode) {
                        this.f118654h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, InitialPickupPerson initialPickupPerson, Function0<Unit> function0) {
                this.f118644a = localThemeScope;
                this.f118645b = pickupPersonViewState;
                this.f118646c = initialPickupPerson;
                this.f118647d = function0;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1784175797, i10, -1, "com.meijer.mobile.singlepagecheckout.PickUpContactInfoSectionCard.<anonymous>.<anonymous>.<anonymous> (PickUpContactInfoSectionCard.kt:216)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f118644a;
                PickupPersonViewState pickupPersonViewState = this.f118645b;
                InitialPickupPerson initialPickupPerson = this.f118646c;
                Function0<Unit> function0 = this.f118647d;
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new L1.A();
                    composer.t(objB);
                }
                composer.U();
                L1.A a10 = (L1.A) objB;
                composer.startReplaceableGroup(-3687241);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new L1.n();
                    composer.t(objB2);
                }
                composer.U();
                L1.n nVar = (L1.n) objB2;
                composer.startReplaceableGroup(-3687241);
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                composer.U();
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16819m.d(modifierH, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 6, pairH.b(), localThemeScope, pickupPersonViewState, initialPickupPerson, function0)), pairH.a(), composer, 48, 0);
                composer.U();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, PickupPersonViewState pickupPersonViewState, boolean z10, boolean z11, androidx.compose.ui.focus.y yVar, Function1<? super C12057p.g, Unit> function1, InitialPickupPerson initialPickupPerson, androidx.compose.ui.focus.y yVar2, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<Boolean> interfaceC5872l0, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, Function0<Unit> function02) {
            this.f118629a = localThemeScope;
            this.f118630b = pickupPersonViewState;
            this.f118631c = z10;
            this.f118632d = z11;
            this.f118633e = yVar;
            this.f118634f = function1;
            this.f118635g = initialPickupPerson;
            this.f118636h = yVar2;
            this.f118637i = interfaceC5914o;
            this.f118638j = interfaceC5872l0;
            this.f118639k = function0;
            this.f118640l = function2;
            this.f118641m = interfaceC5872l02;
            this.f118642n = interfaceC5872l03;
            this.f118643o = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                C0.s(interfaceC5872l0, true);
            } else if (C0.r(interfaceC5872l0)) {
                function1.invoke(new C12057p.g.ValidateAllField(C0.r(interfaceC5872l0), C0.t(interfaceC5872l02)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String phoneNumberInput) {
            Intrinsics.j(phoneNumberInput, "phoneNumberInput");
            function1.invoke(new C12057p.g.SetPhoneNumber(phoneNumberInput, ((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String emailInput) {
            Intrinsics.j(emailInput, "emailInput");
            function1.invoke(new C12057p.g.SetEmailAddress(emailInput, ((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                C0.u(interfaceC5872l0, true);
            } else if (C0.t(interfaceC5872l0)) {
                function1.invoke(new C12057p.g.ValidateAllField(C0.r(interfaceC5872l02), C0.t(interfaceC5872l0)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(InterfaceC5914o interfaceC5914o, Function1 function1, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            function1.invoke(new C12057p.g.ValidateAllField(true, true));
            return Unit.f143329a;
        }

        public final void g(Composer composer, int i10) {
            Composer composer2;
            PickupPersonViewState pickupPersonViewState;
            Function1<C12057p.g, Unit> function1;
            Function2<Composer, Integer, Unit> function2;
            InterfaceC5872l0<Boolean> interfaceC5872l0;
            int i11;
            int i12;
            int i13;
            String email;
            final InterfaceC5872l0<Boolean> interfaceC5872l02;
            String phoneNumber;
            final InterfaceC5872l0<Boolean> interfaceC5872l03;
            Validation<String> validationQ;
            Validation<String> validationJ;
            Composer composer3 = composer;
            if ((i10 & 3) == 2 && composer3.j()) {
                composer3.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1086916925, i10, -1, "com.meijer.mobile.singlepagecheckout.PickUpContactInfoSectionCard.<anonymous> (PickUpContactInfoSectionCard.kt:107)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f118629a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            PickupPersonViewState pickupPersonViewState2 = this.f118630b;
            LocalThemeScope localThemeScope = this.f118629a;
            boolean z10 = this.f118631c;
            boolean z11 = this.f118632d;
            androidx.compose.ui.focus.y yVar = this.f118633e;
            final Function1<C12057p.g, Unit> function12 = this.f118634f;
            InitialPickupPerson initialPickupPerson = this.f118635g;
            androidx.compose.ui.focus.y yVar2 = this.f118636h;
            final InterfaceC5914o interfaceC5914o = this.f118637i;
            InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f118638j;
            final Function0<Unit> function0 = this.f118639k;
            Function2<Composer, Integer, Unit> function22 = this.f118640l;
            final InterfaceC5872l0<Boolean> interfaceC5872l05 = this.f118641m;
            final InterfaceC5872l0<Boolean> interfaceC5872l06 = this.f118642n;
            Function0<Unit> function02 = this.f118643o;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer3, 0);
            int iA = C5859f.a(composer3, 0);
            InterfaceC5884s interfaceC5884sR = composer3.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer3, modifierD);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer3.k() == null) {
                C5859f.c();
            }
            composer3.F();
            if (composer3.getInserting()) {
                composer3.I(function0A);
            } else {
                composer3.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer3);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            if (pickupPersonViewState2 == null || !pickupPersonViewState2.getIsLoading()) {
                composer3.startReplaceGroup(1370198712);
                int i14 = LocalThemeScope.f17314g;
                Bm.C.b(localThemeScope, null, z10, composer3, i14, 1);
                boolean z12 = (pickupPersonViewState2 != null && pickupPersonViewState2.getIsShowFormInputScreen()) || z11;
                if (z12) {
                    composer3.startReplaceGroup(1370374048);
                    Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.ui.focus.A.a(companion, yVar), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp());
                    composer3.startReplaceGroup(-1746271574);
                    boolean zV = composer3.V(function12);
                    Object objB = composer3.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.w0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C0.a.k(function12, interfaceC5872l05, interfaceC5872l06, (androidx.compose.ui.focus.E) obj);
                            }
                        };
                        composer3.t(objB);
                    }
                    composer3.P();
                    Modifier modifierA = C5903d.a(modifierL, (Function1) objB);
                    String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100489J1, composer3, 0);
                    String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100432G1, composer3, 0);
                    if (pickupPersonViewState2 == null || (validationJ = pickupPersonViewState2.j()) == null || (email = validationJ.e()) == null) {
                        email = initialPickupPerson.getEmail();
                    }
                    KeyboardOptions.Companion companion3 = KeyboardOptions.INSTANCE;
                    KeyboardOptions keyboardOptionsA = companion3.a();
                    KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
                    int iC = companion4.c();
                    a.Companion companion5 = androidx.compose.ui.text.input.a.INSTANCE;
                    KeyboardOptions keyboardOptionsC = KeyboardOptions.c(keyboardOptionsA, 0, null, iC, companion5.d(), null, null, null, 115, null);
                    Integer numC = pickupPersonViewState2 != null ? com.meijer.mobile.meijer.activity.checkout.pickupperson.C.C(pickupPersonViewState2) : null;
                    composer3.startReplaceGroup(-371378111);
                    String strC3 = numC == null ? null : C16338g.c(numC.intValue(), composer3, 0);
                    composer3.P();
                    composer3.startReplaceGroup(-1633490746);
                    boolean zV2 = composer3.V(function12);
                    Object objB2 = composer3.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        interfaceC5872l02 = interfaceC5872l04;
                        objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.x0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C0.a.p(function12, interfaceC5872l02, (String) obj);
                            }
                        };
                        composer3.t(objB2);
                    } else {
                        interfaceC5872l02 = interfaceC5872l04;
                    }
                    composer3.P();
                    InterfaceC5872l0<Boolean> interfaceC5872l07 = interfaceC5872l02;
                    function2 = function22;
                    i13 = i14;
                    Bm.U.c(localThemeScope, modifierA, strC, null, strC2, keyboardOptionsC, null, null, email, strC3, null, (Function1) objB2, composer, i13, 0, 612);
                    Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.ui.focus.A.a(companion, yVar2), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                    composer.startReplaceGroup(-1746271574);
                    boolean zV3 = composer.V(function12);
                    Object objB3 = composer.B();
                    if (zV3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.y0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C0.a.q(function12, interfaceC5872l06, interfaceC5872l05, (androidx.compose.ui.focus.E) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    Modifier modifierA2 = C5903d.a(modifierK, (Function1) objB3);
                    String strC4 = C16338g.c(com.meijer.mobile.meijer.Y.f100546M1, composer, 0);
                    String strC5 = C16338g.c(com.meijer.mobile.meijer.Y.f100565N1, composer, 0);
                    if (pickupPersonViewState2 == null || (validationQ = pickupPersonViewState2.q()) == null || (phoneNumber = validationQ.e()) == null) {
                        phoneNumber = initialPickupPerson.getPhoneNumber();
                    }
                    String str = phoneNumber;
                    KeyboardOptions keyboardOptionsC2 = KeyboardOptions.c(companion3.a(), 0, null, companion4.g(), companion5.b(), null, null, null, 115, null);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(interfaceC5914o) | composer.V(function12);
                    Object objB4 = composer.B();
                    if (zD || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C0.a.r(interfaceC5914o, function12, (InterfaceC5834y) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    C5835z c5835z = new C5835z((Function1) objB4, null, null, null, null, null, 62, null);
                    Jh.H h10 = Jh.H.f15755a;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(h10);
                    Object objB5 = composer.B();
                    if (zD2 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new C1909a(h10);
                        composer.t(objB5);
                    }
                    composer.P();
                    b bVar = new b((Function1) ((KFunction) objB5));
                    Integer numF = pickupPersonViewState2 != null ? com.meijer.mobile.meijer.activity.checkout.pickupperson.C.F(pickupPersonViewState2) : null;
                    composer.startReplaceGroup(-371292671);
                    String strC6 = numF != null ? C16338g.c(numF.intValue(), composer, 0) : null;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV4 = composer.V(function12);
                    Object objB6 = composer.B();
                    if (zV4 || objB6 == Composer.INSTANCE.a()) {
                        interfaceC5872l03 = interfaceC5872l07;
                        objB6 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.A0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C0.a.l(function12, interfaceC5872l03, (String) obj);
                            }
                        };
                        composer.t(objB6);
                    } else {
                        interfaceC5872l03 = interfaceC5872l07;
                    }
                    composer.P();
                    interfaceC5872l0 = interfaceC5872l03;
                    function1 = function12;
                    Bm.U.c(localThemeScope, modifierA2, strC4, null, strC5, keyboardOptionsC2, c5835z, bVar, str, strC6, null, (Function1) objB6, composer, i13, 0, 516);
                    composer2 = composer;
                    composer2.P();
                    i11 = 0;
                    pickupPersonViewState = pickupPersonViewState2;
                    i12 = 5004770;
                } else {
                    composer2 = composer3;
                    pickupPersonViewState = pickupPersonViewState2;
                    function1 = function12;
                    function2 = function22;
                    interfaceC5872l0 = interfaceC5872l04;
                    i11 = 0;
                    i12 = 5004770;
                    i13 = i14;
                    composer2.startReplaceGroup(1375334606);
                    C16453n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null), null, null, 6, null), ComposableLambdaKt.c(1784175797, true, new b(localThemeScope, pickupPersonViewState, initialPickupPerson, function02), composer2, 54), composer2, i13 | 384 | (q1.Column.f142240d << 3));
                    composer2.P();
                }
                composer2.startReplaceGroup(i12);
                boolean zV5 = composer2.V(function0);
                Object objB7 = composer2.B();
                if (zV5 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.B0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C0.a.o(function0);
                        }
                    };
                    composer2.t(objB7);
                }
                composer2.P();
                C0.j(localThemeScope, interfaceC5872l0, null, pickupPersonViewState, function1, (Function0) objB7, composer2, i13 | 48, 2);
                composer3 = composer2;
                if (z12) {
                    function2.invoke(composer3, Integer.valueOf(i11));
                }
                composer3.P();
            } else {
                composer3.startReplaceGroup(1369864842);
                H2.b(localThemeScope, null, composer3, LocalThemeScope.f17314g, 1);
                composer3.P();
            }
            composer3.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            g(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements z1.W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f118659a;

        b(Function1 function) {
            Intrinsics.j(function, "function");
            this.f118659a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z1.W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f118659a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f118659a.invoke(annotatedString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r18, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r19, androidx.compose.ui.Modifier r20, com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r21, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p.g, kotlin.Unit> r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C0.j(Ki.M, androidx.compose.runtime.l0, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.pickupperson.N, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C12057p.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, InterfaceC5872l0 interfaceC5872l0, PickupPersonViewState pickupPersonViewState) {
        function1.invoke(new C12057p.g.SetOptIn(((Boolean) interfaceC5872l0.getValue()).booleanValue()));
        if (pickupPersonViewState != null && !pickupPersonViewState.getIsShowFormInputScreen()) {
            function1.invoke(C12057p.g.n.f105164a);
            if (!((Boolean) interfaceC5872l0.getValue()).booleanValue()) {
                function1.invoke(C12057p.g.a.f105142a);
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, Modifier modifier, PickupPersonViewState pickupPersonViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, interfaceC5872l0, modifier, pickupPersonViewState, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, boolean r31, final boolean r32, com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r33, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p.g, kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C0.p(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, com.meijer.mobile.meijer.activity.checkout.pickupperson.N, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(C12057p.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, PickupPersonViewState pickupPersonViewState, Function1 function1, Function0 function0, Function0 function02, Function2 function2, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, z10, z11, pickupPersonViewState, function1, function0, function02, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
