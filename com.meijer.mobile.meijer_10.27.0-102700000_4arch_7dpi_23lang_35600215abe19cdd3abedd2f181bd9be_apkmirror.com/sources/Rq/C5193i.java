package Rq;

import Am.A0;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import j0.C14802K;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.P0;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010\u0015\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001d²\u0006\u000e\u0010\u0017\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "paymentOption", "", "isEditMode", "Lkotlin/Function1;", "", "", "onCVVNumberEntered", "displayError", "selectedCardCvv", "isEbtCard", "Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "cardDetail", "isListScreen", "isPaymentAdded", "Lak/a;", "expiryOrBalance", "onCVVConfirmClicked", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;ZLkotlin/jvm/functions/Function1;ZLjava/lang/String;ZLcom/meijer/mobile/meijer/activity/checkout/payment/a;ZZLak/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isConfirmCVVEnabled", "isPrimary", "isSelected", "isExpired", "errorMessage", "cardCvv", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Rq.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5193i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f32833f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f32833f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f32833f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rq.i$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32834f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f32835g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f32836h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32837i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ CardDetailDecorator f32838j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f32839k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaymentOptionDecorator f32840l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f32841m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f32842n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f32843o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f32844p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f32845q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f32846r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f32847s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f32848t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f32849u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, CardDetailDecorator cardDetailDecorator, AbstractC5607a abstractC5607a, PaymentOptionDecorator paymentOptionDecorator, boolean z10, boolean z11, boolean z12, String str, boolean z13, Function1 function1, boolean z14, Function1 function12, InterfaceC5730l0 interfaceC5730l0) {
            super(2);
            this.f32835g = nVar;
            this.f32836h = function0;
            this.f32837i = localThemeScope;
            this.f32838j = cardDetailDecorator;
            this.f32839k = abstractC5607a;
            this.f32840l = paymentOptionDecorator;
            this.f32841m = z10;
            this.f32842n = z11;
            this.f32843o = z12;
            this.f32844p = str;
            this.f32845q = z13;
            this.f32846r = function1;
            this.f32847s = z14;
            this.f32848t = function12;
            this.f32849u = interfaceC5730l0;
            this.f32834f = i10;
        }

        public final void a(Composer composer, int i10) {
            Modifier.Companion companion;
            int i11;
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f32835g.getHelpersHashCode();
            this.f32835g.i();
            L1.n nVar = this.f32835g;
            composer2.startReplaceGroup(1324709721);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            L1.h hVarH = bVarM.h();
            L1.h hVarI = bVarM.i();
            L1.h hVarJ = bVarM.j();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.J.i(companion2, this.f32837i.getAdsSpacing().getFive().getDp());
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = c.f32850a;
                composer2.t(objB);
            }
            composer2.P();
            C14802K.a(nVar.k(modifierI, hVarA, (Function1) objB), composer2, 0);
            LocalThemeScope localThemeScope = this.f32837i;
            C.g cardIcon = this.f32838j.getCardIcon();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, this.f32837i.getAdsSpacing().getFive().getDp(), 0.0f, 11, null);
            composer2.startReplaceGroup(5004770);
            boolean zV = composer2.V(hVarA);
            Object objB2 = composer2.B();
            if (zV || objB2 == companion3.a()) {
                objB2 = new f(hVarA);
                composer2.t(objB2);
            }
            composer2.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(modifierM, hVarC, (Function1) objB2), 62, null);
            int i12 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer2, i12 | (q1.h.DrawableIcon.f140067h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f32837i;
            Ji.I seven = localThemeScope2.getAdsTypography().getHeadings().getSeven();
            Ji.T adsColorText01 = this.f32837i.getAdsColors().getAdsColorText01();
            composer2.startReplaceGroup(5004770);
            boolean zV2 = composer2.V(hVarC);
            Object objB3 = composer2.B();
            if (zV2 || objB3 == companion3.a()) {
                objB3 = new g(hVarC);
                composer2.t(objB3);
            }
            composer2.P();
            q1.Label label = new q1.Label(nVar.k(companion2, hVarD, (Function1) objB3), adsColorText01, null, null, 0, false, 0, seven, null, 380, null);
            AbstractC5607a cardNumber = this.f32838j.getCardNumber();
            int i13 = AbstractC5607a.f45514b;
            String strA = C6408b.a(cardNumber, composer2, i13);
            int i14 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strA, null, composer2, i12 | (i14 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f32837i;
            Ji.I one = localThemeScope3.getAdsTypography().getBodyCompact().getOne();
            Ji.T adsColorText02 = this.f32837i.getAdsColors().getAdsColorText02();
            composer2.startReplaceGroup(5004770);
            boolean zV3 = composer2.V(hVarD);
            Object objB4 = composer2.B();
            if (zV3 || objB4 == companion3.a()) {
                objB4 = new h(hVarD);
                composer2.t(objB4);
            }
            composer2.P();
            ri.j.h(localThemeScope3, new q1.Label(nVar.k(companion2, hVarE, (Function1) objB4), adsColorText02, null, null, 0, false, 0, one, null, 380, null), C6408b.a(this.f32839k, composer2, i13), null, composer2, i12 | (i14 << 3), 4);
            LocalThemeScope localThemeScope4 = this.f32837i;
            Ji.I one2 = localThemeScope4.getAdsTypography().getBodyCompact().getOne();
            Ji.T adsColorText012 = this.f32837i.getAdsColors().getAdsColorText01();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f32837i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            composer2.startReplaceGroup(5004770);
            boolean zV4 = composer2.V(hVarE);
            Object objB5 = composer2.B();
            if (zV4 || objB5 == companion3.a()) {
                objB5 = new C0736i(hVarE);
                composer2.t(objB5);
            }
            composer2.P();
            ri.j.h(localThemeScope4, new q1.Label(nVar.k(modifierM2, hVarF, (Function1) objB5), adsColorText012, null, null, 0, false, 0, one2, null, 380, null), this.f32838j.getCardHolderName(), null, composer2, i12 | (i14 << 3), 4);
            composer2.startReplaceGroup(-1619768528);
            PaymentOptionDecorator paymentOptionDecorator = this.f32840l;
            if (paymentOptionDecorator == null || !paymentOptionDecorator.getIsSelected() || this.f32841m || this.f32842n) {
                companion = companion2;
                i11 = 3;
            } else {
                LocalThemeScope localThemeScope5 = this.f32837i;
                Ji.I two = localThemeScope5.getAdsTypography().getBodyCompact().getTwo();
                Ji.T adsColorText013 = this.f32837i.getAdsColors().getAdsColorText01();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f32837i.getAdsSpacing().getFour().getDp(), 0.0f, this.f32837i.getAdsSpacing().getThree().getDp(), 5, null);
                companion = companion2;
                composer2.startReplaceGroup(5004770);
                boolean zV5 = composer2.V(hVarF);
                Object objB6 = composer2.B();
                if (zV5 || objB6 == companion3.a()) {
                    objB6 = new j(hVarF);
                    composer2.t(objB6);
                }
                composer2.P();
                i11 = 3;
                ri.j.h(localThemeScope5, new q1.Label(nVar.k(modifierM3, hVarG, (Function1) objB6), adsColorText013, null, null, 0, false, 0, two, null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f100142je, composer2, 0), null, composer2, i12 | (i14 << 3), 4);
            }
            composer2.P();
            composer2.startReplaceGroup(-1619743933);
            if (!this.f32843o && this.f32840l != null && !this.f32841m && !this.f32842n) {
                composer2.startReplaceGroup(5004770);
                boolean zV6 = composer2.V(hVarG);
                Object objB7 = composer2.B();
                if (zV6 || objB7 == companion3.a()) {
                    objB7 = new k(hVarG);
                    composer2.t(objB7);
                }
                composer2.P();
                Modifier modifierK = nVar.k(companion, hVarH, (Function1) objB7);
                boolean isSelected = this.f32840l.getIsSelected();
                boolean isExpired = this.f32840l.getIsExpired();
                int validCvvLength = this.f32840l.getValidCvvLength();
                LocalThemeScope localThemeScope6 = this.f32837i;
                String str = this.f32844p;
                boolean z10 = this.f32845q;
                composer2.startReplaceGroup(-1746271574);
                boolean zV7 = composer2.V(this.f32846r) | composer2.D(this.f32840l);
                Object objB8 = composer2.B();
                if (zV7 || objB8 == companion3.a()) {
                    objB8 = new l(this.f32846r, this.f32840l, this.f32849u);
                    composer2.t(objB8);
                }
                composer2.P();
                int i15 = i11;
                A0.b(localThemeScope6, modifierK, isSelected, isExpired, str, validCvvLength, z10, (Function1) objB8, this.f32847s, composer2, i12, 0);
                C15860s0 c15860s0 = C15860s0.f151792a;
                boolean zF = C5193i.f(this.f32849u);
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.J.H(companion, null, false, i15, null), "button", "confirm cvv");
                composer2.startReplaceGroup(-1633490746);
                boolean zV8 = composer2.V(hVarH) | composer2.D(this.f32837i);
                Object objB9 = composer2.B();
                if (zV8 || objB9 == companion3.a()) {
                    objB9 = new m(hVarH, this.f32837i);
                    composer2.t(objB9);
                }
                composer2.P();
                Modifier modifierK2 = nVar.k(modifierFsAttribute, hVarI, (Function1) objB9);
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100249p1, composer2, 0);
                LocalThemeScope localThemeScope7 = this.f32837i;
                composer2.startReplaceGroup(-1633490746);
                boolean zV9 = composer2.V(this.f32848t) | composer2.V(this.f32844p);
                Object objB10 = composer2.B();
                if (zV9 || objB10 == companion3.a()) {
                    objB10 = new d(this.f32848t, this.f32844p);
                    composer2.t(objB10);
                }
                composer2.P();
                P0.k(localThemeScope7, c15860s0, strC, (Function0) objB10, modifierK2, null, false, 0L, zF, composer, (C15860s0.f151793b << i15) | i12, 112);
                composer2 = composer;
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(companion, this.f32837i.getAdsSpacing().getFive().getDp());
                composer2.startReplaceGroup(5004770);
                boolean zV10 = composer2.V(hVarI);
                Object objB11 = composer2.B();
                if (zV10 || objB11 == companion3.a()) {
                    objB11 = new e(hVarI);
                    composer2.t(objB11);
                }
                composer2.P();
                C14802K.a(nVar.k(modifierZ, hVarJ, (Function1) objB11), composer2, 0);
            }
            composer2.P();
            composer2.P();
            if (this.f32835g.getHelpersHashCode() != helpersHashCode) {
                this.f32836h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32850a = new c();

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

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$d */
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f32851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32852b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super String, Unit> function1, String str) {
            this.f32851a = function1;
            this.f32852b = str;
        }

        public final void a() {
            this.f32851a.invoke(this.f32852b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$e */
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32853a;

        e(L1.h hVar) {
            this.f32853a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32853a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32853a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$f */
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32854a;

        f(L1.h hVar) {
            this.f32854a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32854a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$g */
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32855a;

        g(L1.h hVar) {
            this.f32855a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32855a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32855a.getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f32855a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$h */
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32856a;

        h(L1.h hVar) {
            this.f32856a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32856a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32856a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$i, reason: collision with other inner class name */
    static final class C0736i implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32857a;

        C0736i(L1.h hVar) {
            this.f32857a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32857a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32857a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$j */
    static final class j implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32858a;

        j(L1.h hVar) {
            this.f32858a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32858a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32858a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$k */
    static final class k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32859a;

        k(L1.h hVar) {
            this.f32859a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32859a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32859a.getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$l */
    static final class l implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f32860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PaymentOptionDecorator f32861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f32862c;

        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super String, Unit> function1, PaymentOptionDecorator paymentOptionDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f32860a = function1;
            this.f32861b = paymentOptionDecorator;
            this.f32862c = interfaceC5730l0;
        }

        public final void a(String cvv) {
            Intrinsics.j(cvv, "cvv");
            this.f32860a.invoke(cvv);
            if (cvv.length() == this.f32861b.getValidCvvLength()) {
                C5193i.g(this.f32862c, true);
            } else {
                C5193i.g(this.f32862c, false);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$m */
    static final class m implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32864b;

        m(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f32863a = hVar;
            this.f32864b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f32863a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f32863a.getEnd(), this.f32864b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), this.f32863a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator r34, final boolean r35, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r36, final boolean r37, final java.lang.String r38, final boolean r39, final com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator r40, final boolean r41, final boolean r42, final ak.AbstractC5607a r43, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.C5193i.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.payment.q0, boolean, kotlin.jvm.functions.Function1, boolean, java.lang.String, boolean, com.meijer.mobile.meijer.activity.checkout.payment.a, boolean, boolean, ak.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, PaymentOptionDecorator paymentOptionDecorator, boolean z10, Function1 function1, boolean z11, String str, boolean z12, CardDetailDecorator cardDetailDecorator, boolean z13, boolean z14, AbstractC5607a abstractC5607a, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, paymentOptionDecorator, z10, function1, z11, str, z12, cardDetailDecorator, z13, z14, abstractC5607a, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
