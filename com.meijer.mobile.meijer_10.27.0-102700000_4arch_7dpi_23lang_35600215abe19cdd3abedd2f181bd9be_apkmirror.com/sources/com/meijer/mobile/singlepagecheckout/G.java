package com.meijer.mobile.singlepagecheckout;

import Hk.Validation;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import android.telephony.PhoneNumberUtils;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.text.AnnotatedString;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.entrynote.i;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import j0.InterfaceC14814f;
import java.util.Locale;
import ji.q1;
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
import ni.C15874z0;
import p1.C16193g;
import r1.C16705m;
import z1.TransformedText;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÃ\u0001\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u001b\u001a\u00020\n*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006#²\u0006\u000e\u0010\u001d\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "isContactInfoProvided", "Landroidx/compose/ui/Modifier;", "modifier", "isEditMode", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "deliveryContactInfoViewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "onDeliveryAction", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "entryNoteViewState", "Lkotlin/Function0;", "onEditContactInfo", "", "onDeliveryInstructionsChange", "onUpdateDeliveryInstructions", "onDeleteDeliveryInstructions", "onTermsAndConditionClick", "content", "r", "(LJi/M;ZLandroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/runtime/l0;", "isChecked", "deliveryContactInformationViewState", "l", "(LJi/M;Landroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "emailAddressHasBeenFocusedOn", "phoneNumberHasBeenFocusedOn", "lastAction", "isShowFormInputScreen", "isAgreedToTerms", "isLoading", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class G {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f117693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f117694c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f117695d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f117696e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<H.g, Unit> f117697f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f117698g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f117699h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f117700i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f117701j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f117702k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117703l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f117704m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ i.EntryNoteViewState f117705n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f117706o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117707p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f117708q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f117709r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f117710s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f117711t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117712u;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1903a extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
            C1903a(Object obj) {
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
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117713a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeliveryContactInformationViewState f117714b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f117715c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f117716d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f117717e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$b$a, reason: collision with other inner class name */
            static final class C1904a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1904a f117718a = new C1904a();

                C1904a() {
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$b$b, reason: collision with other inner class name */
            static final class C1905b implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1905b f117719a = new C1905b();

                C1905b() {
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f117720a;

                c(L1.h hVar) {
                    this.f117720a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f117720a.getBottom(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class d extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f117721f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(L1.A a10) {
                    super(1);
                    this.f117721f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f117721f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f117722f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f117723g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f117724h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f117725i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationViewState f117726j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ String f117727k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f117728l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ String f117729m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, String str, Function0 function02, String str2) {
                    super(2);
                    this.f117723g = nVar;
                    this.f117724h = function0;
                    this.f117725i = localThemeScope;
                    this.f117726j = deliveryContactInformationViewState;
                    this.f117727k = str;
                    this.f117728l = function02;
                    this.f117729m = str2;
                    this.f117722f = i10;
                }

                public final void a(Composer composer, int i10) {
                    String strE;
                    String strE2;
                    Validation<String> validationP;
                    Validation<String> validationM;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f117723g.getHelpersHashCode();
                    this.f117723g.i();
                    L1.n nVar = this.f117723g;
                    composer.startReplaceGroup(1106767241);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    L1.h hVarD = bVarM.d();
                    LocalThemeScope localThemeScope = this.f117725i;
                    Ji.I one = localThemeScope.getAdsTypography().getBody().getOne();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C1904a.f117718a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarA, (Function1) objB), 0.0f, this.f117725i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one, null, 382, null);
                    DeliveryContactInformationViewState deliveryContactInformationViewState = this.f117726j;
                    String str = ((deliveryContactInformationViewState == null || (validationM = deliveryContactInformationViewState.m()) == null || (strE = validationM.e()) == null) && (strE = this.f117727k) == null) ? "" : strE;
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C1905b.f117719a;
                        composer.t(objB2);
                    }
                    composer.P();
                    ni.P0.k(this.f117725i, C15874z0.f151826a, C16193g.c(com.meijer.mobile.meijer.Y.f99632J6, composer, 0), this.f117728l, FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB2), "Button", "edit contact info"), null, false, 0L, false, composer, i11 | (C15874z0.f151827b << 3), 240);
                    LocalThemeScope localThemeScope2 = this.f117725i;
                    Ji.I one2 = localThemeScope2.getAdsTypography().getBody().getOne();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV || objB3 == companion2.a()) {
                        objB3 = new c(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.H(nVar.k(companion, hVarD, (Function1) objB3), null, false, 3, null), 0.0f, this.f117725i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one2, null, 382, null);
                    DeliveryContactInformationViewState deliveryContactInformationViewState2 = this.f117726j;
                    if ((deliveryContactInformationViewState2 == null || (validationP = deliveryContactInformationViewState2.p()) == null || (strE2 = validationP.e()) == null) && (strE2 = this.f117729m) == null) {
                        strE2 = "";
                    }
                    String number = PhoneNumberUtils.formatNumber(strE2, Locale.getDefault().getCountry());
                    Intrinsics.i(number, "formatNumber(...)");
                    ri.j.h(localThemeScope2, label2, number, null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                    if (this.f117723g.getHelpersHashCode() != helpersHashCode) {
                        this.f117724h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, String str, Function0<Unit> function0, String str2) {
                this.f117713a = localThemeScope;
                this.f117714b = deliveryContactInformationViewState;
                this.f117715c = str;
                this.f117716d = function0;
                this.f117717e = str2;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-696587986, i10, -1, "com.meijer.mobile.singlepagecheckout.DeliveryContactInfoSectionCard.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInfoSectionCard.kt:220)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f117713a;
                DeliveryContactInformationViewState deliveryContactInformationViewState = this.f117714b;
                String str = this.f117715c;
                Function0<Unit> function0 = this.f117716d;
                String str2 = this.f117717e;
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
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16705m.d(modifierH, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 6, pairH.b(), localThemeScope, deliveryContactInformationViewState, str, function0, str2)), pairH.a(), composer, 48, 0);
                composer.U();
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
        a(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, boolean z10, boolean z11, androidx.compose.ui.focus.y yVar, Function1<? super H.g, Unit> function1, String str, androidx.compose.ui.focus.y yVar2, String str2, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<Boolean> interfaceC5730l0, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, i.EntryNoteViewState entryNoteViewState, InterfaceC5730l0<Boolean> interfaceC5730l02, Function0<Unit> function02, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, Function0<Unit> function03) {
            this.f117692a = localThemeScope;
            this.f117693b = deliveryContactInformationViewState;
            this.f117694c = z10;
            this.f117695d = z11;
            this.f117696e = yVar;
            this.f117697f = function1;
            this.f117698g = str;
            this.f117699h = yVar2;
            this.f117700i = str2;
            this.f117701j = interfaceC5772o;
            this.f117702k = interfaceC5730l0;
            this.f117703l = function0;
            this.f117704m = function2;
            this.f117705n = entryNoteViewState;
            this.f117706o = interfaceC5730l02;
            this.f117707p = function02;
            this.f117708q = function12;
            this.f117709r = function13;
            this.f117710s = interfaceC5730l03;
            this.f117711t = interfaceC5730l04;
            this.f117712u = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                G.u(interfaceC5730l0, true);
            } else if (G.t(interfaceC5730l0)) {
                function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5730l0), G.v(interfaceC5730l02)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String phoneNumberInput) {
            Intrinsics.j(phoneNumberInput, "phoneNumberInput");
            function1.invoke(new H.g.SetPhoneNumber(phoneNumberInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5730l0 interfaceC5730l0, i.EntryNoteViewState entryNoteViewState, Function0 function0) {
            interfaceC5730l0.setValue(Boolean.FALSE);
            if (entryNoteViewState.getInitialEntryNote().length() > 0) {
                function0.invoke();
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String note) {
            Intrinsics.j(note, "note");
            interfaceC5730l0.setValue(Boolean.FALSE);
            function1.invoke(note);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, InterfaceC5730l0 interfaceC5730l0, String emailInput) {
            Intrinsics.j(emailInput, "emailInput");
            function1.invoke(new H.g.SetEmailAddress(emailInput, ((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                G.w(interfaceC5730l0, true);
            } else if (G.v(interfaceC5730l0)) {
                function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5730l02), G.v(interfaceC5730l0)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(InterfaceC5772o interfaceC5772o, Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5730l0), G.v(interfaceC5730l02)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            o(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x03ba  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x05c4  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02be  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02f0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x036b  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0388  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0393  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o(androidx.compose.runtime.Composer r66, int r67) {
            /*
                Method dump skipped, instructions count: 1536
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.G.a.o(androidx.compose.runtime.Composer, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements z1.W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f117730a;

        b(Function1 function) {
            Intrinsics.j(function, "function");
            this.f117730a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z1.W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f117730a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f117730a.invoke(annotatedString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ji.LocalThemeScope r40, final boolean r41, androidx.compose.ui.Modifier r42, boolean r43, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r44, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r45, final com.meijer.mobile.meijer.activity.cart.entrynote.i.EntryNoteViewState r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.G.r(Ji.M, boolean, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.cart.entrynote.i$d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B() {
        return Unit.f142422a;
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
    public static final void l(final Ji.LocalThemeScope r18, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r19, androidx.compose.ui.Modifier r20, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r21, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.G.l(Ji.M, androidx.compose.runtime.l0, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, InterfaceC5730l0 interfaceC5730l0, DeliveryContactInformationViewState deliveryContactInformationViewState) {
        function1.invoke(new H.g.SetOptIn(((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        if (deliveryContactInformationViewState != null && !deliveryContactInformationViewState.getIsShowFormInputScreen()) {
            function1.invoke(H.g.j.f102394a);
            if (!((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                function1.invoke(H.g.a.f102383a);
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, Modifier modifier, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, interfaceC5730l0, modifier, deliveryContactInformationViewState, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, boolean z11, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, i.EntryNoteViewState entryNoteViewState, Function0 function0, Function1 function12, Function1 function13, Function0 function02, Function0 function03, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        r(localThemeScope, z10, modifier, z11, deliveryContactInformationViewState, function1, entryNoteViewState, function0, function12, function13, function02, function03, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
