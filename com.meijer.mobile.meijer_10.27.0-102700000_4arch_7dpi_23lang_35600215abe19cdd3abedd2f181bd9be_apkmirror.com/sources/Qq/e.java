package Qq;

import Ji.I;
import Ji.LocalThemeScope;
import Ji.Q;
import P0.e;
import Qq.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.L0;
import ji.q1;
import kotlin.C17871B0;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ni.A0;
import ni.C15864u0;
import ni.P0;
import oi.C16088n;
import p1.C16193g;
import qi.C16531d;
import ws.C17855a;
import xk.C18066d;
import zi.C18504m0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\n\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001b²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function0;", "", "onClose", "onCheckBalance", "Lkotlin/Function1;", "", "onSaveChanges", "c", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "enableSaveChangesButton", "onSaveChangesClicked", "m", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "desiredAmount", "Lak/a;", "errorMessage", "displayInputField", "isSaveButtonEnabled", "lastAction", "isEnableSave", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f31256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f31257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f31259e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31260f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f31261g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f31262h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f31263i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f31264j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qq.e$a$a, reason: collision with other inner class name */
        static final class C0704a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31265a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31266b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f31267c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$a$a, reason: collision with other inner class name */
            static final class C0705a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31268a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f31269b;

                C0705a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                    this.f31268a = localThemeScope;
                    this.f31269b = adjustEbtPaymentDecorator;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1942340908, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:95)");
                    }
                    LocalThemeScope localThemeScope = this.f31268a;
                    q1.Label label = new q1.Label(null, this.f31268a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                    String strC = C16193g.c(Y.f99725O4, composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f31268a;
                    q1.Label label2 = new q1.Label(null, this.f31268a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                    AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31269b;
                    ri.j.h(localThemeScope2, label2, C6408b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null, composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope3 = this.f31268a;
                    ri.j.h(localThemeScope3, new q1.Label(null, this.f31268a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C16193g.c(Y.f99858V4, composer, 0), null, composer, i11 | (i12 << 3), 4);
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

            /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(j0.InterfaceC14800I r14, androidx.compose.runtime.Composer r15, int r16) {
                /*
                    r13 = this;
                    r10 = r15
                    r0 = r16
                    java.lang.String r1 = "$this$AdsRow"
                    kotlin.jvm.internal.Intrinsics.j(r14, r1)
                    r1 = r0 & 17
                    r2 = 16
                    if (r1 != r2) goto L19
                    boolean r1 = r15.j()
                    if (r1 != 0) goto L15
                    goto L19
                L15:
                    r15.K()
                    return
                L19:
                    boolean r1 = androidx.compose.runtime.ComposerKt.M()
                    if (r1 == 0) goto L28
                    r1 = -1
                    java.lang.String r2 = "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:94)"
                    r3 = -1650808522(0xffffffff9d9aa936, float:-4.093842E-21)
                    androidx.compose.runtime.ComposerKt.U(r3, r0, r1, r2)
                L28:
                    Ji.M r0 = r13.f31265a
                    ji.q1$e r1 = new ji.q1$e
                    r5 = 7
                    r6 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r1.<init>(r2, r3, r4, r5, r6)
                    Qq.e$a$a$a r2 = new Qq.e$a$a$a
                    Ji.M r3 = r13.f31265a
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31266b
                    r2.<init>(r3, r4)
                    r3 = 54
                    r4 = 1942340908(0x73c5c52c, float:3.133794E31)
                    r5 = 1
                    androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r4, r5, r2, r15, r3)
                    int r3 = Ji.LocalThemeScope.f15770g
                    r4 = r3 | 384(0x180, float:5.38E-43)
                    int r6 = ji.q1.Column.f139985d
                    int r6 = r6 << 3
                    r4 = r4 | r6
                    oi.C16088n.e(r0, r1, r2, r15, r4)
                    ni.A0 r1 = ni.A0.f151413a
                    int r0 = com.meijer.mobile.meijer.Y.f99687M4
                    r2 = 0
                    java.lang.String r0 = p1.C16193g.c(r0, r15, r2)
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31266b
                    r6 = 0
                    if (r4 == 0) goto L66
                    ak.a r4 = r4.getCurrentEbtCardBalance()
                    goto L67
                L66:
                    r4 = r6
                L67:
                    boolean r4 = ak.C5608b.a(r4)
                    if (r4 != 0) goto L89
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31266b
                    if (r4 == 0) goto L75
                    ak.a r6 = r4.getCurrentEbtCardBalance()
                L75:
                    ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                    int r7 = com.meijer.mobile.meijer.Y.f99896X4
                    java.lang.Object[] r8 = new java.lang.Object[r2]
                    ak.a r4 = r4.d(r7, r8)
                    boolean r4 = kotlin.jvm.internal.Intrinsics.e(r6, r4)
                    if (r4 == 0) goto L86
                    goto L89
                L86:
                    r9 = r2
                L87:
                    r2 = r0
                    goto L8b
                L89:
                    r9 = r5
                    goto L87
                L8b:
                    Ji.M r0 = r13.f31265a
                    r4 = 5004770(0x4c5de2, float:7.013177E-39)
                    r15.startReplaceGroup(r4)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r13.f31267c
                    boolean r4 = r15.V(r4)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r13.f31267c
                    java.lang.Object r6 = r15.B()
                    if (r4 != 0) goto La9
                    androidx.compose.runtime.Composer$a r4 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto Lb1
                La9:
                    Qq.d r6 = new Qq.d
                    r6.<init>()
                    r15.t(r6)
                Lb1:
                    kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                    r15.P()
                    int r4 = ni.A0.f151414b
                    int r4 = r4 << 3
                    r11 = r3 | r4
                    r12 = 120(0x78, float:1.68E-43)
                    r4 = 0
                    r5 = 0
                    r3 = r6
                    r6 = 0
                    r7 = 0
                    ni.P0.k(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
                    boolean r0 = androidx.compose.runtime.ComposerKt.M()
                    if (r0 == 0) goto Ld0
                    androidx.compose.runtime.ComposerKt.T()
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Qq.e.a.C0704a.b(j0.I, androidx.compose.runtime.Composer, int):void");
            }

            C0704a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0) {
                this.f31265a = localThemeScope;
                this.f31266b = adjustEbtPaymentDecorator;
                this.f31267c = function0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31271b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f31272c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$b$a, reason: collision with other inner class name */
            static final class C0706a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31273a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f31274b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f31275c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qq.e$a$b$a$a, reason: collision with other inner class name */
                static final class C0707a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f31276a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f31277b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f31278c;

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                        e.l(interfaceC5730l0, true);
                        return Unit.f142422a;
                    }

                    C0707a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        this.f31276a = localThemeScope;
                        this.f31277b = adjustEbtPaymentDecorator;
                        this.f31278c = interfaceC5730l0;
                    }

                    public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                        AbstractC5607a currentEbtCardBalance;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-777939357, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:186)");
                        }
                        LocalThemeScope localThemeScope = this.f31276a;
                        q1.Label label = new q1.Label(null, this.f31276a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31277b;
                        String strA = C6408b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEbtApprovedAmount() : null, composer, AbstractC5607a.f45514b);
                        int i11 = LocalThemeScope.f15770g;
                        ri.j.h(localThemeScope, label, strA, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                        if (!e.k(this.f31278c)) {
                            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f31277b;
                            boolean z10 = (adjustEbtPaymentDecorator2 == null || (currentEbtCardBalance = adjustEbtPaymentDecorator2.getCurrentEbtCardBalance()) == null || !(Intrinsics.e(currentEbtCardBalance, AbstractC5607a.INSTANCE.d(Y.f99896X4, new Object[0])) ^ true)) ? false : true;
                            A0 a02 = A0.f151413a;
                            String strC = C16193g.c(Y.f99668L4, composer, 0);
                            LocalThemeScope localThemeScope2 = this.f31276a;
                            composer.startReplaceGroup(5004770);
                            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f31278c;
                            Object objB = composer.B();
                            if (objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: Qq.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return e.a.b.C0706a.C0707a.c(interfaceC5730l0);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            P0.k(localThemeScope2, a02, strC, (Function0) objB, null, null, false, 0L, z10, composer, i11 | 3072 | (A0.f151414b << 3), BinsView.TOTE_HEIGHT_DP);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        b(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C0706a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f31273a = localThemeScope;
                    this.f31274b = adjustEbtPaymentDecorator;
                    this.f31275c = interfaceC5730l0;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1211112797, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:170)");
                    }
                    LocalThemeScope localThemeScope = this.f31273a;
                    q1.Label label = new q1.Label(null, this.f31273a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                    String strC = C16193g.c(Y.f99706N4, composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                    C16088n.i(this.f31273a, new q1.Row(J.h(Modifier.INSTANCE, 0.0f, 1, null), C5658d.f48555a.e(), P0.e.INSTANCE.i()), ComposableLambdaKt.c(-777939357, true, new C0707a(this.f31273a, this.f31274b, this.f31275c), composer, 54), composer, i11 | 384 | (q1.Row.f140137d << 3));
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

            b(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f31270a = localThemeScope;
                this.f31271b = adjustEbtPaymentDecorator;
                this.f31272c = interfaceC5730l0;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1074009043, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:169)");
                }
                C16088n.e(this.f31270a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(-1211112797, true, new C0706a(this.f31270a, this.f31271b, this.f31272c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31279a;

            c(LocalThemeScope localThemeScope) {
                this.f31279a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(322959697, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:225)");
                }
                LocalThemeScope localThemeScope = this.f31279a;
                q1.Label label = new q1.Label(null, this.f31279a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 381, null);
                String strC = C16193g.c(Y.f99763Q4, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f31279a;
                I one = localThemeScope2.getAdsTypography().getDetail().getOne();
                ri.j.h(localThemeScope2, new q1.Label(D.m(Modifier.INSTANCE, this.f31279a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31279a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, one, null, 380, null), C16193g.c(Y.f99820T4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f31281b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31282c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f31283d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f31284e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f31285f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$d$a, reason: collision with other inner class name */
            static final class C0708a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31286a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f31287b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC5607a f31288c;

                C0708a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                    this.f31286a = localThemeScope;
                    this.f31287b = interfaceC14919W;
                    this.f31288c = abstractC5607a;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1502246721, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:295)");
                    }
                    ri.j.h(this.f31286a, this.f31287b.getLabels().getInfoBlockMessage(), C6408b.a(this.f31288c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final int p() {
                return 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int q() {
                return 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int r() {
                return 0;
            }

            d(LocalThemeScope localThemeScope, InterfaceC5772o interfaceC5772o, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<AbstractC5607a> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                this.f31280a = localThemeScope;
                this.f31281b = interfaceC5772o;
                this.f31282c = adjustEbtPaymentDecorator;
                this.f31283d = interfaceC5730l0;
                this.f31284e = interfaceC5730l02;
                this.f31285f = interfaceC5730l03;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q1.f.TextInput k(LocalThemeScope localThemeScope, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
                Intrinsics.j(template, "template");
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.b(), 0, null, null, null, 123, null);
                C5693z c5693z = new C5693z(new Function1() { // from class: Qq.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.a.d.l(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                }, null, null, null, null, null, 62, null);
                return q1.f.TextInput.y(template, null, false, null, localThemeScope.getAdsTypography().getBodyCompact().getOne(), new C17855a(null, 0, 3, null), keyboardOptions, c5693z, false, 0, null, null, null, 3975, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, String amount) {
                String str;
                Double maxEbtPaymentAllowed;
                Intrinsics.j(amount, "amount");
                AbstractC5607a minEbtAmountErrorMessage = null;
                if (amount.length() == 0 || StringsKt.W(amount, ".", false, 2, null)) {
                    e.h(interfaceC5730l0, "");
                    e.f(interfaceC5730l02, false);
                    str = amount;
                } else {
                    str = amount;
                    e.h(interfaceC5730l0, StringsKt.Q(str, ".", "", false, 4, null));
                    e.f(interfaceC5730l02, true);
                }
                if (e.d(interfaceC5730l0).length() != 0 && C18066d.b(StringsKt.v(e.d(interfaceC5730l0)), new Function0() { // from class: Qq.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(e.a.d.p());
                    }
                }) >= 1) {
                    if (C18066d.b(StringsKt.v(str), new Function0() { // from class: Qq.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(e.a.d.q());
                        }
                    }) > C18066d.b((adjustEbtPaymentDecorator == null || (maxEbtPaymentAllowed = adjustEbtPaymentDecorator.getMaxEbtPaymentAllowed()) == null) ? null : Integer.valueOf((int) (maxEbtPaymentAllowed.doubleValue() * 100)), new Function0() { // from class: Qq.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(e.a.d.r());
                        }
                    }) && adjustEbtPaymentDecorator != null) {
                        minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMaxEbtAmountErrorMessage();
                    }
                } else if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                e.j(interfaceC5730l03, minEbtAmountErrorMessage);
                return Unit.f142422a;
            }

            public final void g(InterfaceC14919W Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-445166906, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:243)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = C17871B0.d(D.k(J.h(companion, 0.0f, 1, null), this.f31280a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null));
                String strD = e.d(this.f31283d);
                DefaultTextInputs inputFields = Assemble.getInputFields();
                boolean z10 = e.i(this.f31284e) != null;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f31281b) | composer.D(this.f31280a);
                final LocalThemeScope localThemeScope = this.f31280a;
                final InterfaceC5772o interfaceC5772o = this.f31281b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Qq.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e.a.d.k(localThemeScope, interfaceC5772o, (q1.f.TextInput) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
                LocalThemeScope localThemeScope2 = this.f31280a;
                composer.startReplaceGroup(-1224400529);
                boolean zD2 = composer.D(this.f31282c);
                final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31282c;
                final InterfaceC5730l0<String> interfaceC5730l0 = this.f31283d;
                final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f31285f;
                final InterfaceC5730l0<AbstractC5607a> interfaceC5730l03 = this.f31284e;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Qq.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e.a.d.o(adjustEbtPaymentDecorator, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                Function1 function1 = (Function1) objB2;
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                C18504m0.i(localThemeScope2, strD, textInputF, modifierD, function1, null, composer, i11 | (q1.f.TextInput.f140038m << 6), 16);
                AbstractC5607a abstractC5607aI = e.i(this.f31284e);
                if (abstractC5607aI != null) {
                    LocalThemeScope localThemeScope3 = this.f31280a;
                    C16531d.e(localThemeScope3, q1.InfoBlock.y(Assemble.getInfoBlocks().getErrorBlock(), D.m(companion, localThemeScope3.getAdsSpacing().getFive().getDp(), localThemeScope3.getAdsSpacing().getTwo().getDp(), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, 2, null), ComposableLambdaKt.c(1502246721, true, new C0708a(localThemeScope3, Assemble, abstractC5607aI), composer, 54), composer, i11 | 384 | (q1.InfoBlock.f140077c << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
                g(interfaceC14919W, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1<? super Double, Unit> function1, Function0<Unit> function0, InterfaceC5772o interfaceC5772o, Function0<Unit> function02, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<AbstractC5607a> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
            this.f31255a = localThemeScope;
            this.f31256b = adjustEbtPaymentDecorator;
            this.f31257c = function1;
            this.f31258d = function0;
            this.f31259e = interfaceC5772o;
            this.f31260f = function02;
            this.f31261g = interfaceC5730l0;
            this.f31262h = interfaceC5730l02;
            this.f31263i = interfaceC5730l03;
            this.f31264j = interfaceC5730l04;
        }

        public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Modifier.Companion companion;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-114145930, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous> (AdjustEbtPaymentContentSpc.kt:81)");
            }
            LocalThemeScope localThemeScope = this.f31255a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM = D.m(J.h(companion2, 0.0f, 1, null), this.f31255a.getAdsSpacing().getFive().getDp(), this.f31255a.getAdsSpacing().getFive().getDp(), this.f31255a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
            e.Companion companion3 = P0.e.INSTANCE;
            e.c cVarI = companion3.i();
            C5658d c5658d = C5658d.f48555a;
            q1.Row row = new q1.Row(modifierM, c5658d.e(), cVarI);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1650808522, true, new C0704a(this.f31255a, this.f31256b, this.f31260f), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Row.f140137d;
            C16088n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
            C17917Z.a(D.i(companion2, this.f31255a.getAdsSpacing().getFive().getDp()), this.f31255a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope2 = this.f31255a;
            q1.Label label = new q1.Label(D.m(companion2, this.f31255a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31255a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getValues().getThree(), null, 380, null);
            String strC = C16193g.c(Y.f99744P4, composer, 0);
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composer, i11 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f31255a;
            q1.Label label2 = new q1.Label(D.m(companion2, this.f31255a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31255a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 380, null);
            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31256b;
            ri.j.h(localThemeScope3, label2, C6408b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEligibleEbtItemTotal() : null, composer, AbstractC5607a.f45514b), null, composer, i11 | (i13 << 3), 4);
            C17917Z.a(D.i(companion2, this.f31255a.getAdsSpacing().getFive().getDp()), this.f31255a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            C16088n.i(this.f31255a, new q1.Row(D.k(J.h(companion2, 0.0f, 1, null), this.f31255a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), c5658d.e(), companion3.i()), ComposableLambdaKt.c(-1074009043, true, new b(this.f31255a, this.f31256b, this.f31261g), composer, 54), composer, i11 | 384 | (i12 << 3));
            composer.startReplaceGroup(1975086793);
            if (e.k(this.f31261g)) {
                companion = companion2;
                C16088n.i(this.f31255a, new q1.Row(D.m(companion2, this.f31255a.getAdsSpacing().getFive().getDp(), this.f31255a.getAdsSpacing().getThree().getDp(), 0.0f, this.f31255a.getAdsSpacing().getThree().getDp(), 4, null), null, companion3.i(), 2, null), ComposableLambdaKt.c(322959697, true, new c(this.f31255a), composer, 54), composer, i11 | 384 | (i12 << 3));
                LocalThemeScope localThemeScope4 = this.f31255a;
                Q.e(localThemeScope4, L0.f139675a, ComposableLambdaKt.c(-445166906, true, new d(localThemeScope4, this.f31259e, this.f31256b, this.f31262h, this.f31263i, this.f31264j), composer, 54), composer, i11 | 384 | (L0.f139676b << 3));
            } else {
                companion = companion2;
            }
            composer.P();
            LocalThemeScope localThemeScope5 = this.f31255a;
            boolean z10 = e.i(this.f31263i) == null && e.e(this.f31264j);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f31256b) | composer.V(this.f31257c) | composer.V(this.f31258d) | composer.D(this.f31259e);
            final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f31256b;
            final Function1<Double, Unit> function1 = this.f31257c;
            final Function0<Unit> function0 = this.f31258d;
            final InterfaceC5772o interfaceC5772o = this.f31259e;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f31262h;
            final InterfaceC5730l0<AbstractC5607a> interfaceC5730l02 = this.f31263i;
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f31261g;
            final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f31264j;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qq.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a.c(adjustEbtPaymentDecorator2, function1, function0, interfaceC5772o, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            e.m(localThemeScope5, companion, z10, (Function0) objB, composer, i11 | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function0 function0, InterfaceC5772o interfaceC5772o, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04) {
            double dDoubleValue;
            Double dT = StringsKt.t(e.d(interfaceC5730l0));
            if (dT != null) {
                dDoubleValue = dT.doubleValue() / 100;
            } else {
                dDoubleValue = 0.0d;
            }
            AbstractC5607a minEbtAmountErrorMessage = null;
            if (dDoubleValue < 0.01d) {
                if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                e.j(interfaceC5730l02, minEbtAmountErrorMessage);
            } else {
                function1.invoke(Double.valueOf(dDoubleValue));
                function0.invoke();
                e.l(interfaceC5730l03, false);
                e.f(interfaceC5730l04, false);
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31290b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31291c;

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z10) {
            this.f31289a = localThemeScope;
            this.f31290b = function0;
            this.f31291c = z10;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-53933627, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.ButtonSection.<anonymous> (AdjustEbtPaymentContentSpc.kt:330)");
            }
            long color = this.f31289a.getAdsColors().getAdsColorUIDivider().getColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            C17917Z.a(D.k(companion, 0.0f, this.f31289a.getAdsSpacing().getFive().getDp(), 1, null), color, 0.0f, 0.0f, composer, 0, 12);
            Modifier modifierK = D.k(J.h(companion, 0.0f, 1, null), this.f31289a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            P0.k(this.f31289a, C15864u0.f151801a, C16193g.c(Y.f99839U4, composer, 0), this.f31290b, modifierK, null, false, 0L, this.f31291c, composer, LocalThemeScope.f15770g | (C15864u0.f151802b << 3), 112);
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

    public static final void c(LocalThemeScope localThemeScope, final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, final Function0<Unit> onClose, final Function0<Unit> onCheckBalance, final Function1<? super Double, Unit> onSaveChanges, Composer composer, final int i10) {
        int i11;
        AbstractC5607a currentEbtCardBalance;
        Double initialEbtPaymentAmount;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(onClose, "onClose");
        Intrinsics.j(onCheckBalance, "onCheckBalance");
        Intrinsics.j(onSaveChanges, "onSaveChanges");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1637299328);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(adjustEbtPaymentDecorator) : composerStartRestartGroup.D(adjustEbtPaymentDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClose) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onCheckBalance) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onSaveChanges) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1637299328, i12, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc (AdjustEbtPaymentContentSpc.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                String string = (adjustEbtPaymentDecorator == null || (initialEbtPaymentAmount = adjustEbtPaymentDecorator.getInitialEbtPaymentAmount()) == null) ? null : Integer.valueOf((int) (initialEbtPaymentAmount.doubleValue() * 100)).toString();
                if (string == null) {
                    string = "";
                }
                objB = t1.e(string, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB3;
            composerStartRestartGroup.P();
            InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composerStartRestartGroup.o(C5892t0.h());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                boolean z10 = false;
                if (adjustEbtPaymentDecorator != null && (currentEbtCardBalance = adjustEbtPaymentDecorator.getCurrentEbtCardBalance()) != null && (!Intrinsics.e(currentEbtCardBalance, AbstractC5607a.INSTANCE.d(Y.f99896X4, new Object[0])))) {
                    z10 = true;
                }
                objB4 = t1.e(Boolean.valueOf(z10), null, 2, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            C16088n.e(localThemeScope2, new q1.Column(D.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(-114145930, true, new a(localThemeScope2, adjustEbtPaymentDecorator, onSaveChanges, onClose, interfaceC5772o, onCheckBalance, interfaceC5730l03, interfaceC5730l0, interfaceC5730l02, (InterfaceC5730l0) objB4), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qq.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(localThemeScope2, adjustEbtPaymentDecorator, onClose, onCheckBalance, onSaveChanges, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0 function0, Function0 function02, Function1 function1, int i10, Composer composer, int i11) {
        c(localThemeScope, adjustEbtPaymentDecorator, function0, function02, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, boolean r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qq.e.m(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a i(InterfaceC5730l0<AbstractC5607a> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5730l0<AbstractC5607a> interfaceC5730l0, AbstractC5607a abstractC5607a) {
        interfaceC5730l0.setValue(abstractC5607a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
