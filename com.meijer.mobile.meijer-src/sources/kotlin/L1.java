package kotlin;

import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.C6418E;
import kotlin.C6453j;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.n0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¨\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\u000b2`\u0010\u0016\u001a\\\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019²\u0006\f\u0010\u0011\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lx0/L1;", "", "<init>", "()V", "Lx0/A0;", "inputState", "LV0/q0;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "", "content", "a", "(Lx0/A0;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class L1 {

    /* renamed from: a, reason: collision with root package name */
    public static final L1 f168281a = new L1();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC17935A0 f168283g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168284h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168285i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<EnumC17935A0, Composer, Integer, C5489q0> f168286j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168287k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function6<Float, C5489q0, C5489q0, Float, Composer, Integer, Unit> f168288l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168289m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC17935A0 enumC17935A0, long j10, long j11, Function3<? super EnumC17935A0, ? super Composer, ? super Integer, C5489q0> function3, boolean z10, Function6<? super Float, ? super C5489q0, ? super C5489q0, ? super Float, ? super Composer, ? super Integer, Unit> function6, int i10) {
            super(2);
            this.f168283g = enumC17935A0;
            this.f168284h = j10;
            this.f168285i = j11;
            this.f168286j = function3;
            this.f168287k = z10;
            this.f168288l = function6;
            this.f168289m = i10;
        }

        public final void a(Composer composer, int i10) {
            L1.this.a(this.f168283g, this.f168284h, this.f168285i, this.f168286j, this.f168287k, this.f168288l, composer, J0.a(this.f168289m | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lx0/A0;", "Lc0/F;", "LV0/q0;", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function3<k0.b<EnumC17935A0>, Composer, Integer, InterfaceC6419F<C5489q0>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f168290f = new b();

        b() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<C5489q0> invoke(k0.b<EnumC17935A0> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<C5489q0> a(k0.b<EnumC17935A0> bVar, Composer composer, int i10) {
            composer.startReplaceGroup(-32667848);
            if (ComposerKt.M()) {
                ComposerKt.U(-32667848, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
            }
            n0 n0VarL = C6453j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lx0/A0;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function3<k0.b<EnumC17935A0>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f168291f = new c();

        c() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<EnumC17935A0> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<EnumC17935A0> bVar, Composer composer, int i10) {
            composer.startReplaceGroup(-611722692);
            if (ComposerKt.M()) {
                ComposerKt.U(-611722692, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
            }
            n0 n0VarL = C6453j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lx0/A0;", "Lc0/F;", "LV0/q0;", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function3<k0.b<EnumC17935A0>, Composer, Integer, InterfaceC6419F<C5489q0>> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f168292f = new d();

        d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<C5489q0> invoke(k0.b<EnumC17935A0> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<C5489q0> a(k0.b<EnumC17935A0> bVar, Composer composer, int i10) {
            composer.startReplaceGroup(-130058045);
            if (ComposerKt.M()) {
                ComposerKt.U(-130058045, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
            }
            n0 n0VarL = C6453j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return n0VarL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lx0/A0;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function3<k0.b<EnumC17935A0>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f168293f = new e();

        e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<EnumC17935A0> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<EnumC17935A0> bVar, Composer composer, int i10) {
            InterfaceC6419F<Float> interfaceC6419FK;
            composer.startReplaceGroup(-1079955085);
            if (ComposerKt.M()) {
                ComposerKt.U(-1079955085, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
            }
            EnumC17935A0 enumC17935A0 = EnumC17935A0.f167733a;
            EnumC17935A0 enumC17935A02 = EnumC17935A0.f167734b;
            if (bVar.c(enumC17935A0, enumC17935A02)) {
                interfaceC6419FK = C6453j.l(67, 0, C6418E.d(), 2, null);
            } else if (!bVar.c(enumC17935A02, enumC17935A0) && !bVar.c(EnumC17935A0.f167735c, enumC17935A02)) {
                interfaceC6419FK = C6453j.j(0.0f, 0.0f, null, 7, null);
            } else {
                interfaceC6419FK = C6453j.k(83, 67, C6418E.d());
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC6419FK;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17935A0.values().length];
            try {
                iArr[EnumC17935A0.f167733a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17935A0.f167734b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17935A0.f167735c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(kotlin.EnumC17935A0 r26, long r27, long r29, kotlin.jvm.functions.Function3<? super kotlin.EnumC17935A0, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, V0.C5489q0> r31, boolean r32, kotlin.jvm.functions.Function6<? super java.lang.Float, ? super V0.C5489q0, ? super V0.C5489q0, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.L1.a(x0.A0, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function6, androidx.compose.runtime.Composer, int):void");
    }

    private L1() {
    }

    private static final float b(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    private static final float c(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    private static final long d(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    private static final long e(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }
}
