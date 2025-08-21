package ws;

import Ai.C2832m0;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.text.input.KeyboardType;
import bk.AbstractC6392a;
import java.io.IOException;
import java.util.List;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.InterfaceC15160b0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.InterfaceC15433c;
import p1.C16338g;
import r1.C16819m;
import ws.C17916E;
import xs.EnumC18220b;
import xs.TipSuggestionButtonDecorator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001ag\u0010\u000f\u001a\u00020\f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0013\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018\u001aY\u0010\u0019\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006!²\u0006\u000e\u0010\u001b\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "Lxs/c;", "decorator", "Landroidx/compose/ui/Modifier;", "modifier", "", "savedCustomTipAmount", "", "shouldShowNoTipError", "Lkotlin/Function1;", "Lxs/b;", "", "onTipOptionSelected", "onCustomTipChanged", "w", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;DZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "cardWidth", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Lxs/c;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tipOption", "", "G", "(Lxs/b;)Ljava/lang/String;", "h", "(LKi/M;Landroidx/compose/ui/Modifier;DZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tipAmountInputString", "enableAddButton", "isBelowMinimumTip", "isAboveMaximumTip", "selectedTipOption", "customTipAmount", "rateandtip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ws.E, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17916E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ws.E$a */
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f167481a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f167482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f167483c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167484d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f167485e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f167486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f167487g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f167488h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f167489i;

        a(boolean z10, double d10, Modifier modifier, LocalThemeScope localThemeScope, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
            this.f167481a = z10;
            this.f167482b = d10;
            this.f167483c = modifier;
            this.f167484d = localThemeScope;
            this.f167485e = interfaceC5914o;
            this.f167486f = interfaceC5872l0;
            this.f167487g = interfaceC5872l02;
            this.f167488h = interfaceC5872l03;
            this.f167489i = interfaceC5872l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(Modifier modifier, LocalThemeScope localThemeScope, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, J.i(C16819m.d(modifier, false, new Function1() { // from class: ws.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17916E.a.g(interfaceC5872l0, (r1.u) obj);
                }
            }, 1, null), localThemeScope.getAdsSpacing().getTen().getDp()), false, null, localThemeScope.getAdsTypography().getBody().getOne(), new C17917a(null, 0, 3, null), new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5835z(new Function1() { // from class: ws.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17916E.a.k(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3974, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.x0(semantics, C17916E.i(interfaceC5872l0));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04, String value) throws IOException {
            Intrinsics.j(value, "value");
            StringBuilder sb2 = new StringBuilder();
            int length = value.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = value.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            C17916E.j(interfaceC5872l0, StringsKt.F1(sb2.toString(), '0'));
            Double dT = StringsKt.t(C17916E.i(interfaceC5872l0));
            if (dT != null) {
                double dDoubleValue = dT.doubleValue();
                C17916E.p(interfaceC5872l02, dDoubleValue > 10000.0d);
                C17916E.n(interfaceC5872l03, dDoubleValue < 100.0d);
            }
            if (!C17916E.o(interfaceC5872l02) && !C17916E.m(interfaceC5872l03)) {
                z10 = true;
            }
            C17916E.l(interfaceC5872l04, z10);
            return Unit.f143329a;
        }

        public final void e(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(947475233, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputTextSpc.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TipShopperSelectionSpc.kt:245)");
            }
            Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
            String strI = C17916E.i(this.f167486f);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = C17916E.i(this.f167486f).length() == 0 && this.f167481a;
            boolean z11 = this.f167482b >= 1000.0d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f167483c) | composer.D(this.f167484d) | composer.D(this.f167485e);
            final Modifier modifier = this.f167483c;
            final LocalThemeScope localThemeScope = this.f167484d;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f167486f;
            final InterfaceC5914o interfaceC5914o = this.f167485e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ws.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17916E.a.f(modifier, localThemeScope, interfaceC5872l0, interfaceC5914o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, z11, false, (Function1) objB, 4, null);
            LocalThemeScope localThemeScope2 = this.f167484d;
            composer.startReplaceGroup(-1224400529);
            final InterfaceC5872l0<String> interfaceC5872l02 = this.f167486f;
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f167487g;
            final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f167488h;
            final InterfaceC5872l0<Boolean> interfaceC5872l05 = this.f167489i;
            Object objB2 = composer.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: ws.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17916E.a.l(interfaceC5872l02, interfaceC5872l03, interfaceC5872l04, interfaceC5872l05, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2832m0.i(localThemeScope2, strI, textInputF, modifierH, (Function1) objB2, null, composer, LocalThemeScope.f17314g | 27648 | (q1.f.TextInput.f142293m << 6), 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            e(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ws.E$b */
    static final class b implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167490a;

        b(LocalThemeScope localThemeScope) {
            this.f167490a = localThemeScope;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(597114160, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputTextSpc.<anonymous>.<anonymous>.<anonymous> (TipShopperSelectionSpc.kt:300)");
            }
            Di.j.i(this.f167490a, null, C16338g.c(C17920d.f167511f, composer, 0), null, Assemble.getToastVariant().getError(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ws.E$c */
    static final class c implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167491a;

        c(LocalThemeScope localThemeScope) {
            this.f167491a = localThemeScope;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-327749273, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputTextSpc.<anonymous>.<anonymous>.<anonymous> (TipShopperSelectionSpc.kt:310)");
            }
            Di.j.i(this.f167491a, null, C16338g.c(C17920d.f167510e, composer, 0), null, Assemble.getToastVariant().getError(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: ws.E$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f167492f = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: ws.E$e */
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f167493f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f167494g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, List list) {
            super(1);
            this.f167493f = function1;
            this.f167494g = list;
        }

        public final Object a(int i10) {
            return this.f167493f.invoke(this.f167494g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: ws.E$f */
    public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f167495f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167496g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f167497h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f167498i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, float f10, Function1 function1) {
            super(4);
            this.f167495f = list;
            this.f167496g = localThemeScope;
            this.f167497h = f10;
            this.f167498i = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) this.f167495f.get(i10);
            composer.startReplaceGroup(1649302034);
            C17916E.s(this.f167496g, null, tipSuggestionButtonDecorator, this.f167497h, this.f167498i, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r48, androidx.compose.ui.Modifier r49, double r50, boolean r52, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r53, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C17916E.h(Ki.M, androidx.compose.ui.Modifier, double, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final xs.TipSuggestionButtonDecorator r33, final float r34, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C17916E.s(Ki.M, androidx.compose.ui.Modifier, xs.c, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ws.E$g */
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC18220b.values().length];
            try {
                iArr[EnumC18220b.f170994f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18220b.f170995g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18220b.f170996h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18220b.f170997i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18220b.f170998j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC18220b.f170999k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC18220b.f171000l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC18220b.f171001m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String G(EnumC18220b tipOption) {
        Intrinsics.j(tipOption, "tipOption");
        switch (g.$EnumSwitchMapping$0[tipOption.ordinal()]) {
            case 1:
                return "$5 pretip";
            case 2:
                return "$10 pretip";
            case 3:
                return "$15 pretip";
            case 4:
                return "10% pretip";
            case 5:
                return "15% pretip";
            case 6:
                return "20% pretip";
            case 7:
                return "other pretip";
            case 8:
                return "tip later pretip";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, double d10, boolean z10, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, d10, z10, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(TipSuggestionButtonDecorator tipSuggestionButtonDecorator, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.t0(semantics, tipSuggestionButtonDecorator.getIsSelected());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, Modifier modifier, TipSuggestionButtonDecorator tipSuggestionButtonDecorator, float f10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, tipSuggestionButtonDecorator, f10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ki.LocalThemeScope r29, final java.util.List<xs.TipSuggestionButtonDecorator> r30, androidx.compose.ui.Modifier r31, double r32, boolean r34, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C17916E.w(Ki.M, java.util.List, androidx.compose.ui.Modifier, double, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(List list, LocalThemeScope localThemeScope, float f10, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new e(d.f167492f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, localThemeScope, f10, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, List list, Modifier modifier, double d10, boolean z10, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, list, modifier, d10, z10, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, Function1 function12, InterfaceC5872l0 interfaceC5872l0) throws IOException {
        double dDoubleValue;
        String strI = i(interfaceC5872l0);
        StringBuilder sb2 = new StringBuilder();
        int length = strI.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strI.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        j(interfaceC5872l0, StringsKt.F1(sb2.toString(), '0'));
        function1.invoke(EnumC18220b.f171000l);
        Double dT = StringsKt.t(i(interfaceC5872l0));
        if (dT != null) {
            dDoubleValue = dT.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        function12.invoke(Double.valueOf(dDoubleValue));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
        function1.invoke(tipSuggestionButtonDecorator.getTipOption());
        return Unit.f143329a;
    }
}
