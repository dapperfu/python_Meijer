package Rq;

import Bm.A0;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import dk.C13698b;
import j0.C14890K;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.P0;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010\u0015\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001d²\u0006\u000e\u0010\u0017\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "paymentOption", "", "isEditMode", "Lkotlin/Function1;", "", "", "onCVVNumberEntered", "displayError", "selectedCardCvv", "isEbtCard", "Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "cardDetail", "isListScreen", "isPaymentAdded", "Lbk/a;", "expiryOrBalance", "onCVVConfirmClicked", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;ZLkotlin/jvm/functions/Function1;ZLjava/lang/String;ZLcom/meijer/mobile/meijer/activity/checkout/payment/a;ZZLbk/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isConfirmCVVEnabled", "isPrimary", "isSelected", "isExpired", "errorMessage", "cardCvv", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Rq.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5306i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f33870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f33870f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f33870f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rq.i$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33871f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f33872g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f33873h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33874i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ CardDetailDecorator f33875j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f33876k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaymentOptionDecorator f33877l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f33878m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f33879n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f33880o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f33881p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f33882q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f33883r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f33884s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f33885t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f33886u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, CardDetailDecorator cardDetailDecorator, AbstractC6392a abstractC6392a, PaymentOptionDecorator paymentOptionDecorator, boolean z10, boolean z11, boolean z12, String str, boolean z13, Function1 function1, boolean z14, Function1 function12, InterfaceC5872l0 interfaceC5872l0) {
            super(2);
            this.f33872g = nVar;
            this.f33873h = function0;
            this.f33874i = localThemeScope;
            this.f33875j = cardDetailDecorator;
            this.f33876k = abstractC6392a;
            this.f33877l = paymentOptionDecorator;
            this.f33878m = z10;
            this.f33879n = z11;
            this.f33880o = z12;
            this.f33881p = str;
            this.f33882q = z13;
            this.f33883r = function1;
            this.f33884s = z14;
            this.f33885t = function12;
            this.f33886u = interfaceC5872l0;
            this.f33871f = i10;
        }

        public final void a(Composer composer, int i10) {
            Modifier.Companion companion;
            int i11;
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f33872g.getHelpersHashCode();
            this.f33872g.i();
            L1.n nVar = this.f33872g;
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
            Modifier modifierI = androidx.compose.foundation.layout.J.i(companion2, this.f33874i.getAdsSpacing().getFive().getDp());
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = c.f33887a;
                composer2.t(objB);
            }
            composer2.P();
            C14890K.a(nVar.k(modifierI, hVarA, (Function1) objB), composer2, 0);
            LocalThemeScope localThemeScope = this.f33874i;
            C.g cardIcon = this.f33875j.getCardIcon();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, this.f33874i.getAdsSpacing().getFive().getDp(), 0.0f, 11, null);
            composer2.startReplaceGroup(5004770);
            boolean zV = composer2.V(hVarA);
            Object objB2 = composer2.B();
            if (zV || objB2 == companion3.a()) {
                objB2 = new f(hVarA);
                composer2.t(objB2);
            }
            composer2.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(modifierM, hVarC, (Function1) objB2), 62, null);
            int i12 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer2, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f33874i;
            Ki.I seven = localThemeScope2.getAdsTypography().getHeadings().getSeven();
            Ki.T adsColorText01 = this.f33874i.getAdsColors().getAdsColorText01();
            composer2.startReplaceGroup(5004770);
            boolean zV2 = composer2.V(hVarC);
            Object objB3 = composer2.B();
            if (zV2 || objB3 == companion3.a()) {
                objB3 = new g(hVarC);
                composer2.t(objB3);
            }
            composer2.P();
            q1.Label label = new q1.Label(nVar.k(companion2, hVarD, (Function1) objB3), adsColorText01, null, null, 0, false, 0, seven, null, 380, null);
            AbstractC6392a cardNumber = this.f33875j.getCardNumber();
            int i13 = AbstractC6392a.f60445b;
            String strA = C13698b.a(cardNumber, composer2, i13);
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strA, null, composer2, i12 | (i14 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f33874i;
            Ki.I one = localThemeScope3.getAdsTypography().getBodyCompact().getOne();
            Ki.T adsColorText02 = this.f33874i.getAdsColors().getAdsColorText02();
            composer2.startReplaceGroup(5004770);
            boolean zV3 = composer2.V(hVarD);
            Object objB4 = composer2.B();
            if (zV3 || objB4 == companion3.a()) {
                objB4 = new h(hVarD);
                composer2.t(objB4);
            }
            composer2.P();
            si.j.h(localThemeScope3, new q1.Label(nVar.k(companion2, hVarE, (Function1) objB4), adsColorText02, null, null, 0, false, 0, one, null, 380, null), C13698b.a(this.f33876k, composer2, i13), null, composer2, i12 | (i14 << 3), 4);
            LocalThemeScope localThemeScope4 = this.f33874i;
            Ki.I one2 = localThemeScope4.getAdsTypography().getBodyCompact().getOne();
            Ki.T adsColorText012 = this.f33874i.getAdsColors().getAdsColorText01();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f33874i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            composer2.startReplaceGroup(5004770);
            boolean zV4 = composer2.V(hVarE);
            Object objB5 = composer2.B();
            if (zV4 || objB5 == companion3.a()) {
                objB5 = new C0757i(hVarE);
                composer2.t(objB5);
            }
            composer2.P();
            si.j.h(localThemeScope4, new q1.Label(nVar.k(modifierM2, hVarF, (Function1) objB5), adsColorText012, null, null, 0, false, 0, one2, null, 380, null), this.f33875j.getCardHolderName(), null, composer2, i12 | (i14 << 3), 4);
            composer2.startReplaceGroup(-1619768528);
            PaymentOptionDecorator paymentOptionDecorator = this.f33877l;
            if (paymentOptionDecorator == null || !paymentOptionDecorator.getIsSelected() || this.f33878m || this.f33879n) {
                companion = companion2;
                i11 = 3;
            } else {
                LocalThemeScope localThemeScope5 = this.f33874i;
                Ki.I two = localThemeScope5.getAdsTypography().getBodyCompact().getTwo();
                Ki.T adsColorText013 = this.f33874i.getAdsColors().getAdsColorText01();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f33874i.getAdsSpacing().getFour().getDp(), 0.0f, this.f33874i.getAdsSpacing().getThree().getDp(), 5, null);
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
                si.j.h(localThemeScope5, new q1.Label(nVar.k(modifierM3, hVarG, (Function1) objB6), adsColorText013, null, null, 0, false, 0, two, null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f101064me, composer2, 0), null, composer2, i12 | (i14 << 3), 4);
            }
            composer2.P();
            composer2.startReplaceGroup(-1619743933);
            if (!this.f33880o && this.f33877l != null && !this.f33878m && !this.f33879n) {
                composer2.startReplaceGroup(5004770);
                boolean zV6 = composer2.V(hVarG);
                Object objB7 = composer2.B();
                if (zV6 || objB7 == companion3.a()) {
                    objB7 = new k(hVarG);
                    composer2.t(objB7);
                }
                composer2.P();
                Modifier modifierK = nVar.k(companion, hVarH, (Function1) objB7);
                boolean isSelected = this.f33877l.getIsSelected();
                boolean isExpired = this.f33877l.getIsExpired();
                int validCvvLength = this.f33877l.getValidCvvLength();
                LocalThemeScope localThemeScope6 = this.f33874i;
                String str = this.f33881p;
                boolean z10 = this.f33882q;
                composer2.startReplaceGroup(-1746271574);
                boolean zV7 = composer2.V(this.f33883r) | composer2.D(this.f33877l);
                Object objB8 = composer2.B();
                if (zV7 || objB8 == companion3.a()) {
                    objB8 = new l(this.f33883r, this.f33877l, this.f33886u);
                    composer2.t(objB8);
                }
                composer2.P();
                int i15 = i11;
                A0.b(localThemeScope6, modifierK, isSelected, isExpired, str, validCvvLength, z10, (Function1) objB8, this.f33884s, composer2, i12, 0);
                C16194s0 c16194s0 = C16194s0.f154251a;
                boolean zF = C5306i.f(this.f33886u);
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.J.H(companion, null, false, i15, null), "button", "confirm cvv");
                composer2.startReplaceGroup(-1633490746);
                boolean zV8 = composer2.V(hVarH) | composer2.D(this.f33874i);
                Object objB9 = composer2.B();
                if (zV8 || objB9 == companion3.a()) {
                    objB9 = new m(hVarH, this.f33874i);
                    composer2.t(objB9);
                }
                composer2.P();
                Modifier modifierK2 = nVar.k(modifierFsAttribute, hVarI, (Function1) objB9);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101111p1, composer2, 0);
                LocalThemeScope localThemeScope7 = this.f33874i;
                composer2.startReplaceGroup(-1633490746);
                boolean zV9 = composer2.V(this.f33885t) | composer2.V(this.f33881p);
                Object objB10 = composer2.B();
                if (zV9 || objB10 == companion3.a()) {
                    objB10 = new d(this.f33885t, this.f33881p);
                    composer2.t(objB10);
                }
                composer2.P();
                P0.k(localThemeScope7, c16194s0, strC, (Function0) objB10, modifierK2, null, false, 0L, zF, composer, (C16194s0.f154252b << i15) | i12, 112);
                composer2 = composer;
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(companion, this.f33874i.getAdsSpacing().getFive().getDp());
                composer2.startReplaceGroup(5004770);
                boolean zV10 = composer2.V(hVarI);
                Object objB11 = composer2.B();
                if (zV10 || objB11 == companion3.a()) {
                    objB11 = new e(hVarI);
                    composer2.t(objB11);
                }
                composer2.P();
                C14890K.a(nVar.k(modifierZ, hVarJ, (Function1) objB11), composer2, 0);
            }
            composer2.P();
            composer2.P();
            if (this.f33872g.getHelpersHashCode() != helpersHashCode) {
                this.f33873h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33887a = new c();

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

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$d */
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f33888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33889b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super String, Unit> function1, String str) {
            this.f33888a = function1;
            this.f33889b = str;
        }

        public final void a() {
            this.f33888a.invoke(this.f33889b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$e */
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33890a;

        e(L1.h hVar) {
            this.f33890a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33890a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33890a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$f */
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33891a;

        f(L1.h hVar) {
            this.f33891a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33891a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$g */
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33892a;

        g(L1.h hVar) {
            this.f33892a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33892a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33892a.getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f33892a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$h */
    static final class h implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33893a;

        h(L1.h hVar) {
            this.f33893a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33893a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33893a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$i, reason: collision with other inner class name */
    static final class C0757i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33894a;

        C0757i(L1.h hVar) {
            this.f33894a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33894a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33894a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$j */
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33895a;

        j(L1.h hVar) {
            this.f33895a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33895a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33895a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$k */
    static final class k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33896a;

        k(L1.h hVar) {
            this.f33896a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33896a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33896a.getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$l */
    static final class l implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f33897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PaymentOptionDecorator f33898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f33899c;

        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super String, Unit> function1, PaymentOptionDecorator paymentOptionDecorator, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f33897a = function1;
            this.f33898b = paymentOptionDecorator;
            this.f33899c = interfaceC5872l0;
        }

        public final void a(String cvv) {
            Intrinsics.j(cvv, "cvv");
            this.f33897a.invoke(cvv);
            if (cvv.length() == this.f33898b.getValidCvvLength()) {
                C5306i.g(this.f33899c, true);
            } else {
                C5306i.g(this.f33899c, false);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.i$m */
    static final class m implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f33900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33901b;

        m(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f33900a = hVar;
            this.f33901b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f33900a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f33900a.getEnd(), this.f33901b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), this.f33900a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
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
    public static final void c(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator r34, final boolean r35, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r36, final boolean r37, final java.lang.String r38, final boolean r39, final com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator r40, final boolean r41, final boolean r42, final bk.AbstractC6392a r43, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.C5306i.c(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.payment.q0, boolean, kotlin.jvm.functions.Function1, boolean, java.lang.String, boolean, com.meijer.mobile.meijer.activity.checkout.payment.a, boolean, boolean, bk.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, PaymentOptionDecorator paymentOptionDecorator, boolean z10, Function1 function1, boolean z11, String str, boolean z12, CardDetailDecorator cardDetailDecorator, boolean z13, boolean z14, AbstractC6392a abstractC6392a, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, paymentOptionDecorator, z10, function1, z11, str, z12, cardDetailDecorator, z13, z14, abstractC6392a, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
