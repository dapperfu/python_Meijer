package Am;

import Am.C2894i0;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.OrderTypeHeaderDataDecorator;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;", "orderTypeHeaderDataDecorator", "", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/S;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "title", "Lkotlin/Function0;", "onEdit", "", "isEditIconVisible", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lak/a;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "f", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Am.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2894i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Am.i0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderTypeHeaderDataDecorator f958c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Am.i0$a$a, reason: collision with other inner class name */
        static final class C0023a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f959a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderTypeHeaderDataDecorator f960b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Am.i0$a$a$a, reason: collision with other inner class name */
            static final class C0024a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f961a;

                C0024a(L1.h hVar) {
                    this.f961a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), this.f961a.getStart(), 0.0f, 0.0f, 6, null);
                    constrainAs.r(L1.v.INSTANCE.a());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Am.i0$a$a$b */
            static final class b implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final b f962a = new b();

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }

                b() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Am.i0$a$a$c */
            public static final class c extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f963f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(L1.A a10) {
                    super(1);
                    this.f963f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f963f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Am.i0$a$a$d */
            public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f964f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f965g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f966h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f967i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ OrderTypeHeaderDataDecorator f968j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator) {
                    super(2);
                    this.f965g = nVar;
                    this.f966h = function0;
                    this.f967i = localThemeScope;
                    this.f968j = orderTypeHeaderDataDecorator;
                    this.f964f = i10;
                }

                public final void a(Composer composer, int i10) {
                    int i11;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f965g.getHelpersHashCode();
                    this.f965g.i();
                    L1.n nVar = this.f965g;
                    composer.startReplaceGroup(565048401);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    LocalThemeScope localThemeScope = this.f967i;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarC);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0024a(hVarC);
                        composer.t(objB);
                    }
                    composer.P();
                    C2894i0.f(localThemeScope, nVar.k(companion, hVarA, (Function1) objB), this.f968j, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 0);
                    OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator = this.f968j;
                    if (orderTypeHeaderDataDecorator == null || !orderTypeHeaderDataDecorator.getIsBunchaOrder()) {
                        OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator2 = this.f968j;
                        i11 = Intrinsics.e(orderTypeHeaderDataDecorator2 != null ? orderTypeHeaderDataDecorator2.getType() : null, "pickup") ? com.meijer.mobile.meijer.S.f98728i0 : com.meijer.mobile.meijer.S.f98729j;
                    } else {
                        i11 = com.meijer.mobile.meijer.S.f98723g;
                    }
                    Z0.c cVarC = C16190d.c(i11, composer, 0);
                    String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99992c3, composer, 0);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == Composer.INSTANCE.a()) {
                        objB2 = b.f962a;
                        composer.t(objB2);
                    }
                    composer.P();
                    C13457y.a(cVarC, strC, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.D(nVar.k(companion, hVarC, (Function1) objB2), null, false, 3, null), H1.h.p(BinsView.TOTE_HEIGHT_DP)), H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                    composer.P();
                    if (this.f965g.getHelpersHashCode() != helpersHashCode) {
                        this.f966h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0023a(LocalThemeScope localThemeScope, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator) {
                this.f959a = localThemeScope;
                this.f960b = orderTypeHeaderDataDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1726488462, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.OrderTypeDetailCardSection.<anonymous>.<anonymous> (OrderTypeDetailCardSection.kt:77)");
                }
                LocalThemeScope localThemeScope = this.f959a;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null);
                OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator = this.f960b;
                AbstractC5607a abstractC5607aD = Intrinsics.e(orderTypeHeaderDataDecorator != null ? orderTypeHeaderDataDecorator.getType() : null, "pickup") ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99930Z0, new Object[0]) : AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99892X0, new Object[0]);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function0() { // from class: Am.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2894i0.a.C0023a.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C2894i0.j(localThemeScope, modifierM, abstractC5607aD, (Function0) objB, false, composer, (AbstractC5607a.f45514b << 6) | LocalThemeScope.f15770g | 27696, 0);
                float f10 = 16;
                C17917Z.a(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.i(companion, H1.h.p(1)), H1.h.p(f10), 0.0f, 2, null), this.f959a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(companion, this.f959a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(24), 2, null);
                LocalThemeScope localThemeScope2 = this.f959a;
                OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator2 = this.f960b;
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objB2 = composer.B();
                if (objB2 == companion2.a()) {
                    objB2 = new L1.A();
                    composer.t(objB2);
                }
                composer.U();
                L1.A a10 = (L1.A) objB2;
                composer.startReplaceableGroup(-3687241);
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new L1.n();
                    composer.t(objB3);
                }
                composer.U();
                L1.n nVar = (L1.n) objB3;
                composer.startReplaceableGroup(-3687241);
                Object objB4 = composer.B();
                if (objB4 == companion2.a()) {
                    objB4 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB4);
                }
                composer.U();
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB4, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16705m.d(modifierM2, false, new c(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new d(nVar, 0, pairH.b(), localThemeScope2, orderTypeHeaderDataDecorator2)), pairH.a(), composer, 48, 0);
                composer.U();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                b(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator) {
            this.f956a = localThemeScope;
            this.f957b = modifier;
            this.f958c = orderTypeHeaderDataDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-257861208, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.OrderTypeDetailCardSection.<anonymous> (OrderTypeDetailCardSection.kt:70)");
            }
            C16088n.e(this.f956a, new q1.Column(androidx.compose.foundation.b.d(this.f957b, this.f956a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), null, null, 6, null), ComposableLambdaKt.c(-1726488462, true, new C0023a(this.f956a, this.f958c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final com.meijer.mobile.meijer.activity.checkout.contactinformation.OrderTypeHeaderDataDecorator r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.C2894i0.f(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.contactinformation.S, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, orderTypeHeaderDataDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final com.meijer.mobile.meijer.activity.checkout.contactinformation.OrderTypeHeaderDataDecorator r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.C2894i0.h(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.contactinformation.S, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, orderTypeHeaderDataDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final ak.AbstractC5607a r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, final boolean r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.C2894i0.j(Ji.M, androidx.compose.ui.Modifier, ak.a, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, AbstractC5607a abstractC5607a, Function0 function0, boolean z10, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, abstractC5607a, function0, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
