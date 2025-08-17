package li;

import Ji.LocalThemeScope;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14802K;
import j0.C14811c;
import j0.C14815g;
import j0.InterfaceC14812d;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.C17893M0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import l0.w;
import ri.j;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001aú\u0001\u0010\u001c\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a`\u0010 \u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b \u0010!\u001a?\u0010\"\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0003¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b$\u0010%\u001aO\u0010&\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0003¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010(\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lx0/M0;", "sheetState", "", "headingText", "descriptionText", "primaryButtonText", "secondaryButtonText", "Lkotlin/Function0;", "", "onPrimaryAction", "onSecondaryAction", "onBackPressed", "onClosePressed", "", "showScrim", "LH1/h;", "horizontalMargin", "bottomMargin", "maxHeight", "Lkotlin/Function1;", "Lj0/d;", "Lkotlin/ExtensionFunctionType;", "customContent", "sheetGesturesEnabled", "content", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lx0/M0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZFFFLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Lj0/f;", "sheetContent", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Lx0/M0;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "s", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "n", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "q", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "l", "(LJi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: li.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15417h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: li.h$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f148927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f148928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f148929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f148930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f148931e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f148932f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f148933g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14812d, Composer, Integer, Unit> f148934h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f148935i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f148936j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f148937k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f148938l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f148939m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: li.h$a$a, reason: collision with other inner class name */
        static final class C2287a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14812d, Composer, Integer, Unit> f148940a;

            /* JADX WARN: Multi-variable type inference failed */
            C2287a(Function3<? super InterfaceC14812d, ? super Composer, ? super Integer, Unit> function3) {
                this.f148940a = function3;
            }

            public final void a(InterfaceC14812d BoxWithConstraints, Composer composer, int i10) {
                Intrinsics.j(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(BoxWithConstraints) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2108766742, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.bottomsheet.AcresBottomSheet.<anonymous>.<anonymous>.<anonymous> (Bottomsheet.kt:143)");
                }
                this.f148940a.invoke(BoxWithConstraints, composer, Integer.valueOf(i10 & 14));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
                a(interfaceC14812d, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(float f10, float f11, String str, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, String str2, Function3<? super InterfaceC14812d, ? super Composer, ? super Integer, Unit> function3, float f12, String str3, String str4, Function0<Unit> function03, Function0<Unit> function04) {
            this.f148927a = f10;
            this.f148928b = f11;
            this.f148929c = str;
            this.f148930d = localThemeScope;
            this.f148931e = function0;
            this.f148932f = function02;
            this.f148933g = str2;
            this.f148934h = function3;
            this.f148935i = f12;
            this.f148936j = str3;
            this.f148937k = str4;
            this.f148938l = function03;
            this.f148939m = function04;
        }

        public final void a(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            String str;
            Composer composer2 = composer;
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-275210391, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.bottomsheet.AcresBottomSheet.<anonymous> (Bottomsheet.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(D.m(J.j(J.h(companion, 0.0f, 1, null), H1.h.p(0), this.f148927a), 0.0f, 0.0f, 0.0f, this.f148928b, 7, null), C5346q0.INSTANCE.k(), null, 2, null);
            String str2 = this.f148929c;
            LocalThemeScope localThemeScope = this.f148930d;
            Function0<Unit> function0 = this.f148931e;
            Function0<Unit> function02 = this.f148932f;
            String str3 = this.f148933g;
            Function3<InterfaceC14812d, Composer, Integer, Unit> function3 = this.f148934h;
            float f10 = this.f148935i;
            String str4 = this.f148936j;
            String str5 = this.f148937k;
            Function0<Unit> function03 = this.f148938l;
            Function0<Unit> function04 = this.f148939m;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer2, 0);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.h()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            composer2.startReplaceGroup(868311674);
            if (str2 != null) {
                str = str4;
                C15417h.s(localThemeScope, str2, function0, function02, composer2, 0, 0);
            } else {
                str = str4;
            }
            composer2.P();
            composer2.startReplaceGroup(868321892);
            if (str3 != null) {
                C15417h.n(localThemeScope, c14815g.a(companion, 0.35f, false), str3, composer, 0, 0);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(868331743);
            if (function3 != null) {
                C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
                C14811c.a(c14815g.a(J.h(D.k(companion, f10, 0.0f, 2, null), 0.0f, 1, null), 0.65f, false), null, false, ComposableLambdaKt.c(-2108766742, true, new C2287a(function3), composer2, 54), composer2, 3072, 6);
            }
            composer2.P();
            composer2.startReplaceGroup(868348056);
            if (str != null || str5 != null) {
                C15417h.q(localThemeScope, str, str5, function03, function04, composer2, 0, 0);
            }
            composer.P();
            composer.v();
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
    /* renamed from: li.h$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f148941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f148942b;

        b(LocalThemeScope localThemeScope, String str) {
            this.f148941a = localThemeScope;
            this.f148942b = str;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-876000183, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.bottomsheet.DescriptionSection.<anonymous>.<anonymous>.<anonymous> (Bottomsheet.kt:278)");
            }
            j.h(this.f148941a, new q1.Label(Modifier.INSTANCE, null, null, null, 0, false, 0, this.f148941a.getAdsTypography().getBody().getTwo(), null, 382, null), this.f148942b, null, composer, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final kotlin.C17893M0 r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, boolean r50, float r51, float r52, float r53, kotlin.jvm.functions.Function3<? super j0.InterfaceC14812d, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, boolean r55, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.j(Ji.M, androidx.compose.ui.Modifier, x0.M0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, float, float, float, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final kotlin.C17893M0 r27, boolean r28, boolean r29, final kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.h(Ji.M, androidx.compose.ui.Modifier, x0.M0, boolean, boolean, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, C17893M0 c17893m0, boolean z10, boolean z11, Function3 function3, Function2 function2, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, c17893m0, z10, z11, function3, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, C17893M0 c17893m0, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z10, float f10, float f11, float f12, Function3 function3, boolean z11, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, modifier, c17893m0, str, str2, str3, str4, function0, function02, function03, function04, z10, f10, f11, f12, function3, z11, function2, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r22, java.lang.String r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.l(Ji.M, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final java.lang.String r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.n(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, String str, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-876000183, true, new b(localThemeScope, str)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r23, java.lang.String r24, java.lang.String r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.q(Ji.M, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, String str, String str2, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, str, str2, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0274  */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r36, final java.lang.String r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C15417h.s(Ji.M, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, String str, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, str, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
