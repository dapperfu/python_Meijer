package com.meijer.mobile.singlepagecheckout;

import Ik.Validation;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import android.telephony.PhoneNumberUtils;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.text.AnnotatedString;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.entrynote.i;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
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
import oi.C16208z0;
import p1.C16338g;
import r1.C16819m;
import z1.TransformedText;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÃ\u0001\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u001b\u001a\u00020\n*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006#²\u0006\u000e\u0010\u001d\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isContactInfoProvided", "Landroidx/compose/ui/Modifier;", "modifier", "isEditMode", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "deliveryContactInfoViewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "onDeliveryAction", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "entryNoteViewState", "Lkotlin/Function0;", "onEditContactInfo", "", "onDeliveryInstructionsChange", "onUpdateDeliveryInstructions", "onDeleteDeliveryInstructions", "onTermsAndConditionClick", "content", "r", "(LKi/M;ZLandroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/runtime/l0;", "isChecked", "deliveryContactInformationViewState", "l", "(LKi/M;Landroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "emailAddressHasBeenFocusedOn", "phoneNumberHasBeenFocusedOn", "lastAction", "isShowFormInputScreen", "isAgreedToTerms", "isLoading", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class G {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeliveryContactInformationViewState f118678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f118679c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f118680d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f118681e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<H.g, Unit> f118682f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f118683g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f118684h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f118685i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f118686j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118687k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118688l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f118689m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ i.EntryNoteViewState f118690n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118691o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118692p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f118693q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f118694r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118695s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118696t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118697u;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1912a extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
            C1912a(Object obj) {
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
            final /* synthetic */ LocalThemeScope f118698a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeliveryContactInformationViewState f118699b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f118700c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f118701d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f118702e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$b$a, reason: collision with other inner class name */
            static final class C1913a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1913a f118703a = new C1913a();

                C1913a() {
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
            /* renamed from: com.meijer.mobile.singlepagecheckout.G$a$b$b, reason: collision with other inner class name */
            static final class C1914b implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C1914b f118704a = new C1914b();

                C1914b() {
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
                final /* synthetic */ L1.h f118705a;

                c(L1.h hVar) {
                    this.f118705a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f118705a.getBottom(), 0.0f, 0.0f, 6, null);
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
                final /* synthetic */ L1.A f118706f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(L1.A a10) {
                    super(1);
                    this.f118706f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f118706f);
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
                final /* synthetic */ int f118707f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f118708g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f118709h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118710i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationViewState f118711j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ String f118712k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f118713l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ String f118714m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, String str, Function0 function02, String str2) {
                    super(2);
                    this.f118708g = nVar;
                    this.f118709h = function0;
                    this.f118710i = localThemeScope;
                    this.f118711j = deliveryContactInformationViewState;
                    this.f118712k = str;
                    this.f118713l = function02;
                    this.f118714m = str2;
                    this.f118707f = i10;
                }

                public final void a(Composer composer, int i10) {
                    String strE;
                    String strE2;
                    Validation<String> validationQ;
                    Validation<String> validationN;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f118708g.getHelpersHashCode();
                    this.f118708g.i();
                    L1.n nVar = this.f118708g;
                    composer.startReplaceGroup(1106767241);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    L1.h hVarD = bVarM.d();
                    LocalThemeScope localThemeScope = this.f118710i;
                    Ki.I one = localThemeScope.getAdsTypography().getBody().getOne();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C1913a.f118703a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarA, (Function1) objB), 0.0f, this.f118710i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one, null, 382, null);
                    DeliveryContactInformationViewState deliveryContactInformationViewState = this.f118711j;
                    String str = ((deliveryContactInformationViewState == null || (validationN = deliveryContactInformationViewState.n()) == null || (strE = validationN.e()) == null) && (strE = this.f118712k) == null) ? "" : strE;
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C1914b.f118704a;
                        composer.t(objB2);
                    }
                    composer.P();
                    oi.P0.k(this.f118710i, C16208z0.f154285a, C16338g.c(com.meijer.mobile.meijer.Y.f100551M6, composer, 0), this.f118713l, FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB2), "Button", "edit contact info"), null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 240);
                    LocalThemeScope localThemeScope2 = this.f118710i;
                    Ki.I one2 = localThemeScope2.getAdsTypography().getBody().getOne();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV || objB3 == companion2.a()) {
                        objB3 = new c(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.H(nVar.k(companion, hVarD, (Function1) objB3), null, false, 3, null), 0.0f, this.f118710i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, one2, null, 382, null);
                    DeliveryContactInformationViewState deliveryContactInformationViewState2 = this.f118711j;
                    if ((deliveryContactInformationViewState2 == null || (validationQ = deliveryContactInformationViewState2.q()) == null || (strE2 = validationQ.e()) == null) && (strE2 = this.f118714m) == null) {
                        strE2 = "";
                    }
                    String number = PhoneNumberUtils.formatNumber(strE2, Locale.getDefault().getCountry());
                    Intrinsics.i(number, "formatNumber(...)");
                    si.j.h(localThemeScope2, label2, number, null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                    if (this.f118708g.getHelpersHashCode() != helpersHashCode) {
                        this.f118709h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, String str, Function0<Unit> function0, String str2) {
                this.f118698a = localThemeScope;
                this.f118699b = deliveryContactInformationViewState;
                this.f118700c = str;
                this.f118701d = function0;
                this.f118702e = str2;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-696587986, i10, -1, "com.meijer.mobile.singlepagecheckout.DeliveryContactInfoSectionCard.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInfoSectionCard.kt:220)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f118698a;
                DeliveryContactInformationViewState deliveryContactInformationViewState = this.f118699b;
                String str = this.f118700c;
                Function0<Unit> function0 = this.f118701d;
                String str2 = this.f118702e;
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
                androidx.compose.ui.layout.A.a(C16819m.d(modifierH, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 6, pairH.b(), localThemeScope, deliveryContactInformationViewState, str, function0, str2)), pairH.a(), composer, 48, 0);
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
        a(LocalThemeScope localThemeScope, DeliveryContactInformationViewState deliveryContactInformationViewState, boolean z10, boolean z11, androidx.compose.ui.focus.y yVar, Function1<? super H.g, Unit> function1, String str, androidx.compose.ui.focus.y yVar2, String str2, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<Boolean> interfaceC5872l0, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, i.EntryNoteViewState entryNoteViewState, InterfaceC5872l0<Boolean> interfaceC5872l02, Function0<Unit> function02, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, Function0<Unit> function03) {
            this.f118677a = localThemeScope;
            this.f118678b = deliveryContactInformationViewState;
            this.f118679c = z10;
            this.f118680d = z11;
            this.f118681e = yVar;
            this.f118682f = function1;
            this.f118683g = str;
            this.f118684h = yVar2;
            this.f118685i = str2;
            this.f118686j = interfaceC5914o;
            this.f118687k = interfaceC5872l0;
            this.f118688l = function0;
            this.f118689m = function2;
            this.f118690n = entryNoteViewState;
            this.f118691o = interfaceC5872l02;
            this.f118692p = function02;
            this.f118693q = function12;
            this.f118694r = function13;
            this.f118695s = interfaceC5872l03;
            this.f118696t = interfaceC5872l04;
            this.f118697u = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                G.u(interfaceC5872l0, true);
            } else if (G.t(interfaceC5872l0)) {
                function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5872l0), G.v(interfaceC5872l02)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String phoneNumberInput) {
            Intrinsics.j(phoneNumberInput, "phoneNumberInput");
            function1.invoke(new H.g.SetPhoneNumber(phoneNumberInput, ((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5872l0 interfaceC5872l0, i.EntryNoteViewState entryNoteViewState, Function0 function0) {
            interfaceC5872l0.setValue(Boolean.FALSE);
            if (entryNoteViewState.getInitialEntryNote().length() > 0) {
                function0.invoke();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(InterfaceC5872l0 interfaceC5872l0, Function1 function1, String note) {
            Intrinsics.j(note, "note");
            interfaceC5872l0.setValue(Boolean.FALSE);
            function1.invoke(note);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String emailInput) {
            Intrinsics.j(emailInput, "emailInput");
            function1.invoke(new H.g.SetEmailAddress(emailInput, ((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                G.w(interfaceC5872l0, true);
            } else if (G.v(interfaceC5872l0)) {
                function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5872l02), G.v(interfaceC5872l0)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(InterfaceC5914o interfaceC5914o, Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            function1.invoke(new H.g.ValidateEachField(G.t(interfaceC5872l0), G.v(interfaceC5872l02)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            o(composer, num.intValue());
            return Unit.f143329a;
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements z1.W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f118715a;

        b(Function1 function) {
            Intrinsics.j(function, "function");
            this.f118715a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z1.W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f118715a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f118715a.invoke(annotatedString);
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
    public static final void r(final Ki.LocalThemeScope r40, final boolean r41, androidx.compose.ui.Modifier r42, boolean r43, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r44, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r45, final com.meijer.mobile.meijer.activity.cart.entrynote.i.EntryNoteViewState r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.G.r(Ki.M, boolean, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.cart.entrynote.i$d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B() {
        return Unit.f143329a;
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
    public static final void l(final Ki.LocalThemeScope r18, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r19, androidx.compose.ui.Modifier r20, com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r21, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.contactinformation.H.g, kotlin.Unit> r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.G.l(Ki.M, androidx.compose.runtime.l0, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.contactinformation.O, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, InterfaceC5872l0 interfaceC5872l0, DeliveryContactInformationViewState deliveryContactInformationViewState) {
        function1.invoke(new H.g.SetOptIn(((Boolean) interfaceC5872l0.getValue()).booleanValue()));
        if (deliveryContactInformationViewState != null && !deliveryContactInformationViewState.getIsShowFormInputScreen()) {
            function1.invoke(H.g.j.f103247a);
            if (!((Boolean) interfaceC5872l0.getValue()).booleanValue()) {
                function1.invoke(H.g.a.f103236a);
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, Modifier modifier, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, interfaceC5872l0, modifier, deliveryContactInformationViewState, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(H.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, boolean z11, DeliveryContactInformationViewState deliveryContactInformationViewState, Function1 function1, i.EntryNoteViewState entryNoteViewState, Function0 function0, Function1 function12, Function1 function13, Function0 function02, Function0 function03, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        r(localThemeScope, z10, modifier, z11, deliveryContactInformationViewState, function1, entryNoteViewState, function0, function12, function13, function02, function03, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
