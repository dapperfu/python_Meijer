package ws;

import Ai.C2832m0;
import Ai.H1;
import Ki.LocalThemeScope;
import android.content.Context;
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
import dk.C13698b;
import java.io.IOException;
import java.util.List;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.InterfaceC15433c;
import p1.C16338g;
import r1.C16819m;
import ws.s;
import xs.EnumC18220b;
import xs.TipSuggestionButtonDecorator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ao\u0010\u0010\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001a²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lxs/c;", "decorator", "Lxs/b;", "selectedOption", "", "savedCustomTipAmount", "", "shouldShowNoTipError", "Lkotlin/Function1;", "", "onTipOptionSelected", "onCustomTipChanged", "o", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lxs/b;DZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "k", "(LKi/M;Landroidx/compose/ui/Modifier;Lxs/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "g", "(LKi/M;Landroidx/compose/ui/Modifier;DZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "tipAmountInputString", "customTipAmount", "selectedTipOption", "rateandtip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f167585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f167587c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f167588d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f167589e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f167590f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f167591g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f167592h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ws.s$a$a, reason: collision with other inner class name */
        static final class C2672a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167593a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f167594b;

            C2672a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f167593a = localThemeScope;
                this.f167594b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1116228872, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputText.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TipShopperSelection.kt:220)");
                }
                si.j.h(this.f167593a, this.f167594b.getLabels().getInfoBlockMessage(), C16338g.c(C17920d.f167512g, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167595a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f167596b;

            b(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f167595a = localThemeScope;
                this.f167596b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1946635777, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputText.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TipShopperSelection.kt:229)");
                }
                si.j.h(this.f167595a, this.f167596b.getLabels().getInfoBlockMessage(), C16338g.c(C17920d.f167510e, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Context context, LocalThemeScope localThemeScope, boolean z10, double d10, Modifier modifier, InterfaceC5914o interfaceC5914o, Function1<? super Double, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
            this.f167585a = context;
            this.f167586b = localThemeScope;
            this.f167587c = z10;
            this.f167588d = d10;
            this.f167589e = modifier;
            this.f167590f = interfaceC5914o;
            this.f167591g = function1;
            this.f167592h = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(Modifier modifier, LocalThemeScope localThemeScope, final String str, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, C16819m.c(modifier, true, new Function1() { // from class: ws.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.a.k(str, (r1.u) obj);
                }
            }), false, null, localThemeScope.getAdsTypography().getBody().getOne(), new C17917a(null, 0, 3, null), new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5835z(new Function1() { // from class: ws.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.a.l(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3974, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String value) throws IOException {
            Intrinsics.j(value, "value");
            StringBuilder sb2 = new StringBuilder();
            int length = value.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = value.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            s.i(interfaceC5872l0, StringsKt.F1(sb2.toString(), '0'));
            Double dT = StringsKt.t(s.h(interfaceC5872l0));
            function1.invoke(Double.valueOf(dT != null ? dT.doubleValue() : 0.0d));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(boolean z10, InterfaceC15153W interfaceC15153W, double d10, InterfaceC5872l0 interfaceC5872l0, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            if (s.h(interfaceC5872l0).length() == 0 && z10) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1116228872, true, new C2672a(localThemeScope, interfaceC15153W)));
            }
            if (d10 >= 1000.0d) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-1946635777, true, new b(localThemeScope, interfaceC15153W)));
            }
            return Unit.f143329a;
        }

        public final void f(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(402578334, i10, -1, "com.meijer.mobile.ui.rateandtip.CustomTipInputText.<anonymous> (TipShopperSelection.kt:187)");
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i11 = C17920d.f167507b;
            TipSuggestionButtonDecorator.Companion companion2 = TipSuggestionButtonDecorator.INSTANCE;
            Double dT = StringsKt.t(s.h(this.f167592h));
            final String strA = C13698b.a(companion.d(i11, companion2.a(dT != null ? dT.doubleValue() : 0.0d, this.f167585a)), composer, AbstractC6392a.f60445b);
            LocalThemeScope localThemeScope = this.f167586b;
            String strH = s.h(this.f167592h);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = s.h(this.f167592h).length() == 0 && this.f167587c;
            boolean z11 = this.f167588d >= 1000.0d;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f167589e) | composer.V(strA) | composer.D(this.f167590f) | composer.D(this.f167586b);
            final Modifier modifier = this.f167589e;
            final LocalThemeScope localThemeScope2 = this.f167586b;
            final InterfaceC5914o interfaceC5914o = this.f167590f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ws.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.a.g(modifier, localThemeScope2, strA, interfaceC5914o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, z11, false, (Function1) objB, 4, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f167591g);
            final Function1<Double, Unit> function1 = this.f167591g;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f167592h;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: ws.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.a.o(function1, interfaceC5872l0, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(this.f167587c) | composer.D(Assemble) | composer.D(this.f167586b) | composer.g(this.f167588d);
            final boolean z12 = this.f167587c;
            final double d10 = this.f167588d;
            final InterfaceC5872l0<String> interfaceC5872l02 = this.f167592h;
            final LocalThemeScope localThemeScope3 = this.f167586b;
            Object objB3 = composer.B();
            if (zA || objB3 == Composer.INSTANCE.a()) {
                Object obj = new Function1() { // from class: ws.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s.a.p(z12, Assemble, d10, interfaceC5872l02, localThemeScope3, (H1) obj2);
                    }
                };
                composer.t(obj);
                objB3 = obj;
            }
            composer.P();
            C2832m0.i(localThemeScope, strH, textInputF, null, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            f(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f167597f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f167598f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f167599g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f167598f = function1;
            this.f167599g = list;
        }

        public final Object a(int i10) {
            return this.f167598f.invoke(this.f167599g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f167600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167601g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f167602h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f167600f = list;
            this.f167601g = localThemeScope;
            this.f167602h = function1;
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
            TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) this.f167600f.get(i10);
            composer.startReplaceGroup(203648865);
            s.k(this.f167601g, null, tipSuggestionButtonDecorator, this.f167602h, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 1);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, double r34, boolean r36, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.s.g(Ki.M, androidx.compose.ui.Modifier, double, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, double d10, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, d10, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final xs.TipSuggestionButtonDecorator r32, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.s.k(Ki.M, androidx.compose.ui.Modifier, xs.c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, TipSuggestionButtonDecorator tipSuggestionButtonDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, tipSuggestionButtonDecorator, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(TipSuggestionButtonDecorator tipSuggestionButtonDecorator, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.t0(semantics, tipSuggestionButtonDecorator.getIsSelected());
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final java.util.List<xs.TipSuggestionButtonDecorator> r28, final xs.EnumC18220b r29, double r30, boolean r32, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r33, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.s.o(Ki.M, androidx.compose.ui.Modifier, java.util.List, xs.b, double, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new c(b.f167597f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, List list, EnumC18220b enumC18220b, double d10, boolean z10, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, list, enumC18220b, d10, z10, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
        function1.invoke(tipSuggestionButtonDecorator.getTipOption());
        return Unit.f143329a;
    }
}
