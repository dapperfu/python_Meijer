package zm;

import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import L1.A;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import dk.C13698b;
import j0.C14890K;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16453n;
import qi.C16671b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardChargesDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardChargesDecorator", "Lkotlin/Function0;", "", "onAdjustAmountClicked", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "h", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "f", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zm.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C18534d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: zm.d$a */
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f172967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f172968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172969c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172970d;

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1883647563, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.CardChargesView.<anonymous> (CardChargesView.kt:38)");
            }
            EbtCardChargesDecorator ebtCardChargesDecorator = this.f172967a;
            composer.startReplaceGroup(-2004075051);
            if (ebtCardChargesDecorator != null) {
                LocalThemeScope localThemeScope = this.f172969c;
                Function0<Unit> function0 = this.f172970d;
                Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                int i11 = LocalThemeScope.f17314g | 48;
                int i12 = AbstractC6392a.f60445b;
                C18534d.h(localThemeScope, modifierH, ebtCardChargesDecorator, function0, composer, ((i12 | ((C.g.f17069d | i12) | i12)) << 6) | i11, 0);
                Unit unit = Unit.f143329a;
            }
            composer.P();
            CreditCardChargesDecorator creditCardChargesDecorator = this.f172968b;
            if (creditCardChargesDecorator != null) {
                LocalThemeScope localThemeScope2 = this.f172969c;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
                int i13 = LocalThemeScope.f17314g | 48;
                int i14 = AbstractC6392a.f60445b;
                C18534d.f(localThemeScope2, modifierH2, creditCardChargesDecorator, composer, ((i14 | (((C.g.f17069d | i14) | i14) | i14)) << 6) | i13, 0);
                C14890K.a(J.i(companion, H1.h.p(16)), composer, 6);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(EbtCardChargesDecorator ebtCardChargesDecorator, CreditCardChargesDecorator creditCardChargesDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f172967a = ebtCardChargesDecorator;
            this.f172968b = creditCardChargesDecorator;
            this.f172969c = localThemeScope;
            this.f172970d = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$b */
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f172971f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A a10) {
            super(1);
            this.f172971f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f172971f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: zm.d$c */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f172972f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f172973g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f172974h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f172975i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172976j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, CreditCardChargesDecorator creditCardChargesDecorator, LocalThemeScope localThemeScope) {
            super(2);
            this.f172973g = nVar;
            this.f172974h = function0;
            this.f172975i = creditCardChargesDecorator;
            this.f172976j = localThemeScope;
            this.f172972f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f172973g.getHelpersHashCode();
            this.f172973g.i();
            L1.n nVar = this.f172973g;
            composer.startReplaceGroup(63338159);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            C.g cardIcon = this.f172975i.getCardIcon();
            composer.startReplaceGroup(1803160293);
            if (cardIcon != null) {
                LocalThemeScope localThemeScope = this.f172976j;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C2789d.f172977a;
                    composer.t(objB);
                }
                composer.P();
                C16671b.b(localThemeScope, new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f172976j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f172976j);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new e(hVarA, this.f172976j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion2, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(-1072359576, true, new f(this.f172976j, this.f172975i), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            composer.P();
            if (this.f172973g.getHelpersHashCode() != helpersHashCode) {
                this.f172974h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$d, reason: collision with other inner class name */
    static final class C2789d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2789d f172977a = new C2789d();

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

        C2789d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$e */
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f172978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172979b;

        e(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f172978a = hVar;
            this.f172979b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f172978a.getEnd(), this.f172979b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$f */
    static final class f implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f172981b;

        f(LocalThemeScope localThemeScope, CreditCardChargesDecorator creditCardChargesDecorator) {
            this.f172980a = localThemeScope;
            this.f172981b = creditCardChargesDecorator;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1072359576, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.CreditCardChargesComponent.<anonymous>.<anonymous> (CardChargesView.kt:163)");
            }
            LocalThemeScope localThemeScope = this.f172980a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f172980a.getAdsTypography().getValues().getThree(), null, 383, null);
            AbstractC6392a amountToChargeCard = this.f172981b.getAmountToChargeCard();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(amountToChargeCard, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            si.j.h(this.f172980a, new q1.Label(null, null, null, null, 0, false, 0, this.f172980a.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C13698b.a(this.f172981b.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            AbstractC6392a ebtNote = this.f172981b.getEbtNote();
            if (ebtNote != null) {
                LocalThemeScope localThemeScope2 = this.f172980a;
                si.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 383, null), C13698b.a(ebtNote, composer, i11), null, composer, i12 | (i13 << 3), 4);
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$g */
    public static final class g extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f172982f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(A a10) {
            super(1);
            this.f172982f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f172982f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: zm.d$h */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f172983f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f172984g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f172985h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f172986i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172987j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f172988k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(L1.n nVar, int i10, Function0 function0, EbtCardChargesDecorator ebtCardChargesDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f172984g = nVar;
            this.f172985h = function0;
            this.f172986i = ebtCardChargesDecorator;
            this.f172987j = localThemeScope;
            this.f172988k = function02;
            this.f172983f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f172984g.getHelpersHashCode();
            this.f172984g.i();
            L1.n nVar = this.f172984g;
            composer.startReplaceGroup(-1444459783);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(-1154970941);
            C.g cardIcon = this.f172986i.getCardIcon();
            LocalThemeScope localThemeScope = this.f172987j;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = i.f172989a;
                composer.t(objB);
            }
            composer.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f172987j;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f172987j);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new j(hVarA, this.f172987j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(1735762412, true, new k(this.f172987j, this.f172986i), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
            LocalThemeScope localThemeScope3 = this.f172987j;
            I seven = localThemeScope3.getAdsTypography().getHeadings().getSeven();
            T adsColorLink = this.f172987j.getAdsColors().getAdsColorLink();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = l.f172994a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f172988k);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new m(this.f172988k);
                composer.t(objB4);
            }
            composer.P();
            si.j.h(localThemeScope3, new q1.Label(ClickableKt.d(modifierK, false, null, null, (Function0) objB4, 7, null), adsColorLink, null, null, 0, false, 0, seven, null, 380, null), C13698b.a(this.f172986i.getAdjustAmount(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.P();
            composer.P();
            if (this.f172984g.getHelpersHashCode() != helpersHashCode) {
                this.f172985h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$i */
    static final class i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f172989a = new i();

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

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$j */
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f172990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172991b;

        j(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f172990a = hVar;
            this.f172991b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f172990a.getEnd(), this.f172991b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: zm.d$k */
    static final class k implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f172993b;

        k(LocalThemeScope localThemeScope, EbtCardChargesDecorator ebtCardChargesDecorator) {
            this.f172992a = localThemeScope;
            this.f172993b = ebtCardChargesDecorator;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1735762412, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.EbtCardChargesComponent.<anonymous>.<anonymous>.<anonymous> (CardChargesView.kt:90)");
            }
            LocalThemeScope localThemeScope = this.f172992a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f172992a.getAdsTypography().getValues().getThree(), null, 383, null);
            AbstractC6392a amountToChargeCard = this.f172993b.getAmountToChargeCard();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(amountToChargeCard, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            si.j.h(this.f172992a, new q1.Label(null, null, null, null, 0, false, 0, this.f172992a.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C13698b.a(this.f172993b.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            si.j.h(this.f172992a, new q1.Label(null, null, null, null, 0, false, 0, this.f172992a.getAdsTypography().getBody().getTwo(), null, 383, null), C13698b.a(this.f172993b.getAvailableBalance(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            C17983Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), this.f172992a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$l */
    static final class l implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f172994a = new l();

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

        l() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zm.d$m */
    static final class m implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172995a;

        m(Function0<Unit> function0) {
            this.f172995a = function0;
        }

        public final void a() {
            this.f172995a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, Modifier modifier, final CreditCardChargesDecorator creditCardChargesDecorator, final EbtCardChargesDecorator ebtCardChargesDecorator, final Function0<Unit> onAdjustAmountClicked, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onAdjustAmountClicked, "onAdjustAmountClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(658875115);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(creditCardChargesDecorator) : composerStartRestartGroup.D(creditCardChargesDecorator) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(ebtCardChargesDecorator) : composerStartRestartGroup.D(ebtCardChargesDecorator) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onAdjustAmountClicked) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(658875115, i12, -1, "com.meijer.mobile.meijer.activity.cart.composables.CardChargesView (CardChargesView.kt:36)");
            }
            C16453n.e(localThemeScope, new q1.Column(modifier3, null, null, 6, null), ComposableLambdaKt.c(-1883647563, true, new a(ebtCardChargesDecorator, creditCardChargesDecorator, localThemeScope, onAdjustAmountClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zm.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C18534d.e(localThemeScope, modifier2, creditCardChargesDecorator, ebtCardChargesDecorator, onAdjustAmountClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, creditCardChargesDecorator, ebtCardChargesDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.C18534d.f(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.L1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, CreditCardChargesDecorator creditCardChargesDecorator, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, creditCardChargesDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.C18534d.h(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.N1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, EbtCardChargesDecorator ebtCardChargesDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, ebtCardChargesDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
