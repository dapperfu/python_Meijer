package Bi;

import Ai.AbstractC2820h1;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16673d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BG\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001c¨\u0006&"}, d2 = {"LBi/p0;", "LAi/h1;", "", "", "LBi/n0;", "Lkotlin/Function2;", "", "onValueChange", "Lki/q1$f$b;", "template", "value", "LKi/M;", "localThemeScope", "", "items", "<init>", "(Lkotlin/jvm/functions/Function2;Lki/q1$f$b;Ljava/lang/String;LKi/M;Ljava/util/List;)V", "v", "Ljava/util/List;", "e0", "()Ljava/util/List;", "dropdownItems", "Lqi/d;", "w", "Lqi/d;", "B", "()Lqi/d;", "n0", "(Lqi/d;)V", "trailingIcon", "x", "U", "setArrowDownIcon", "arrowDownIcon", "y", "b0", "setArrowUpIcon", "arrowUpIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class p0 extends AbstractC2820h1<String, Integer> implements n0 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final List<String> dropdownItems;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C16673d trailingIcon;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C16673d arrowDownIcon;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C16673d arrowUpIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(final Function2<? super String, ? super Integer, Unit> onValueChange, q1.f.Dropdown template, String value, LocalThemeScope localThemeScope, List<String> items) {
        super(new Function2() { // from class: Bi.o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return p0.K0(onValueChange, (String) obj, ((Integer) obj2).intValue());
            }
        }, value, template, localThemeScope, null, 16, null);
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(items, "items");
        this.dropdownItems = items;
        C.f.a aVar = C.f.a.f17048e;
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 24;
        this.trailingIcon = new C16673d(localThemeScope, new q1.h.DrawableIcon(aVar, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.o(companion, H1.h.p(f10)), 62, null), null, 4, null);
        Modifier modifierO = androidx.compose.foundation.layout.J.o(companion, H1.h.p(f10));
        q1.f.a state = template.getState();
        q1.f.a.C2254a c2254a = q1.f.a.C2254a.f142244a;
        this.arrowDownIcon = new C16673d(localThemeScope, new q1.h.DrawableIcon(aVar, null, null, null, 0.0f, Intrinsics.e(state, c2254a) ? localThemeScope.getAdsColors().getAdsColorsDisabled() : localThemeScope.getAdsColors().getAdsColorIconSubtle(), modifierO, 30, null), null, 4, null);
        this.arrowUpIcon = new C16673d(localThemeScope, new q1.h.DrawableIcon(C.f.k.f17061e, null, null, null, 0.0f, Intrinsics.e(template.getState(), c2254a) ? localThemeScope.getAdsColors().getAdsColorsDisabled() : localThemeScope.getAdsColors().getAdsColorIconSubtle(), androidx.compose.foundation.layout.J.o(companion, H1.h.p(f10)), 30, null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(Function2 function2, String text, int i10) {
        Intrinsics.j(text, "text");
        function2.invoke(text, Integer.valueOf(i10));
        return Unit.f143329a;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: B, reason: from getter */
    public C16673d getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: U, reason: from getter */
    public C16673d getArrowDownIcon() {
        return this.arrowDownIcon;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: b0, reason: from getter */
    public C16673d getArrowUpIcon() {
        return this.arrowUpIcon;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    public List<String> e0() {
        return this.dropdownItems;
    }

    @Override // Ai.InterfaceC2817g1
    public void n0(C16673d c16673d) {
        this.trailingIcon = c16673d;
    }
}
