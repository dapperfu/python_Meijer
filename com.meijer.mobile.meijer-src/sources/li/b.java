package li;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import java.util.Map;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import si.p;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010 \u001a\u00020\u00102,\u0010\u001f\u001a(\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RH\u00109\u001a(\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010!R.\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lli/b;", "Lli/l;", "", "", "isSelected", "singleSelection", "", "index", "LKi/M;", "localThemeScope", "Lki/q1$a;", "template", "<init>", "(ZZILKi/M;Lki/q1$a;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lki/q1$j;", "", "text", "Lu1/v;", "onTextLayout", "Z", "(Lki/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lj0/I;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "block", "h0", "(Lkotlin/jvm/functions/Function4;)V", "b", "F0", "()Z", "c", "C0", "d", "I", "A0", "()I", "e", "LKi/M;", "()LKi/M;", "f", "Lki/q1$a;", "D0", "()Lki/q1$a;", "I0", "(Lki/q1$a;)V", "g", "Lkotlin/jvm/functions/Function4;", "z0", "()Lkotlin/jvm/functions/Function4;", "setContent", "content", "h", "Lkotlin/jvm/functions/Function1;", "B0", "()Lkotlin/jvm/functions/Function1;", "H0", "(Lkotlin/jvm/functions/Function1;)V", "onSelect", "Lsi/p;", "i", "Lsi/p;", "E0", "()Lsi/p;", "setTitleLabel", "(Lsi/p;)V", "titleLabel", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b implements l, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSelected;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean singleSelection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private q1.Accordion template;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function4<? super InterfaceC14888I, ? super Integer, ? super Composer, ? super Integer, Unit> content;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Integer, Unit> onSelect;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private p titleLabel;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {
        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(126075133, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItemImpl.getComposer.<anonymous> (AccordionItem.kt:120)");
            }
            f.e(b.this, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public b(boolean z10, boolean z11, int i10, LocalThemeScope localThemeScope, q1.Accordion template) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(template, "template");
        this.isSelected = z10;
        this.singleSelection = z11;
        this.index = i10;
        this.localThemeScope = localThemeScope;
        this.template = template;
        this.content = m.f149691a.a();
        this.onSelect = new Function1() { // from class: li.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.G0(((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(int i10) {
        return Unit.f143329a;
    }

    /* renamed from: A0, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Function1<Integer, Unit> B0() {
        return this.onSelect;
    }

    /* renamed from: C0, reason: from getter */
    public final boolean getSingleSelection() {
        return this.singleSelection;
    }

    /* renamed from: D0, reason: from getter */
    public q1.Accordion getTemplate() {
        return this.template;
    }

    /* renamed from: E0, reason: from getter */
    public final p getTitleLabel() {
        return this.titleLabel;
    }

    /* renamed from: F0, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void H0(Function1<? super Integer, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onSelect = function1;
    }

    public void I0(q1.Accordion accordion) {
        Intrinsics.j(accordion, "<set-?>");
        this.template = accordion;
    }

    @Override // li.l
    public void Z(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout) {
        Intrinsics.j(template, "template");
        Intrinsics.j(text, "text");
        Intrinsics.j(onTextLayout, "onTextLayout");
        Function1 function1 = null;
        Map map = null;
        this.titleLabel = new p(q1.Label.y(template, template.getModifier().then(androidx.compose.foundation.b.d(Modifier.INSTANCE, getLocalThemeScope().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), getLocalThemeScope(), text, null, function1, map, 56, null);
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(126075133, true, new a());
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // li.l
    public void h0(Function4<? super InterfaceC14888I, ? super Integer, ? super Composer, ? super Integer, Unit> block) {
        Intrinsics.j(block, "block");
        this.content = block;
    }

    public final Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> z0() {
        return this.content;
    }
}
