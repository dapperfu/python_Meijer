package Ai;

import Ki.LocalThemeScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import ki.q1;
import kotlin.Deprecated;
import kotlin.FontWeight;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16673d;
import ri.C16913e;
import z1.InterfaceC18417E;
import z1.TransformedText;

@Deprecated
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002BA\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001b\u0010\b\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00103\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u0010;\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R$\u0010B\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\b<\u00108\"\u0004\bA\u0010:R$\u0010F\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R*\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR*\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010L¨\u0006V"}, d2 = {"LAi/C1;", "LAi/y1;", "LAi/h1;", "", "Lkotlin/Function2;", "", "onValueChange", "Lki/q1$f$c;", "template", "value", "maxValue", "LKi/M;", "localThemeScope", "<init>", "(Lkotlin/jvm/functions/Function2;Lki/q1$f$c;Ljava/lang/Number;Ljava/lang/Number;LKi/M;)V", "Lki/q1$h$b;", "Lkotlin/Function0;", "onClick", "N", "(Lki/q1$h$b;Lkotlin/jvm/functions/Function0;)V", "m0", "v", "Lkotlin/Lazy;", "N0", "()Lki/q1$f$c;", "w", "Ljava/lang/Number;", "getCount", "()Ljava/lang/Number;", "setCount", "(Ljava/lang/Number;)V", "count", "Lri/e;", "x", "Lri/e;", "P", "()Lri/e;", "A0", "(Lri/e;)V", "infoBlockScope", "Lsi/p;", "y", "Lsi/p;", "j", "()Lsi/p;", "B0", "(Lsi/p;)V", "label", "z", "getDescription", "y0", "description", "Lqi/d;", "A", "Lqi/d;", "r", "()Lqi/d;", "C0", "(Lqi/d;)V", "labelIcon", "B", "c0", "D0", "leadingIcon", "C", "n0", "trailingIcon", "D", "I", "H0", "placeHolder", "E", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "G0", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "F", "v0", "F0", "onLeadingIconClick", "G", "t0", "E0", "onLabelIconClick", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class C1 extends AbstractC2820h1<Number, Number> implements y1 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private C16673d labelIcon;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private C16673d leadingIcon;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private C16673d trailingIcon;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private si.p placeHolder;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onTrailingIconClick;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLeadingIconClick;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLabelIconClick;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy template;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Number count;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C16913e infoBlockScope;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private si.p label;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private si.p description;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(Number number, Number number2, Function2 function2, Number current, Number previous) {
        Intrinsics.j(current, "current");
        Intrinsics.j(previous, "previous");
        if (number instanceof Integer) {
            if (current.intValue() > number2.intValue() && number.intValue() > 0) {
                function2.invoke(number2, previous);
            } else if (Intrinsics.e(number, 0) && Intrinsics.e(previous, 0) && current.intValue() % 10 == 0) {
                function2.invoke(Integer.valueOf(current.intValue() / 10), previous);
            } else {
                function2.invoke(current, previous);
            }
        } else if (number instanceof Double) {
            if (current.doubleValue() > number2.doubleValue() && number.doubleValue() > 0.0d) {
                function2.invoke(number2, previous);
            } else if (number.doubleValue() == 0.0d && Intrinsics.e(previous, Double.valueOf(0.0d)) && current.doubleValue() % 10.0d == 0.0d) {
                function2.invoke(Double.valueOf(current.doubleValue() / 10), previous);
            } else {
                function2.invoke(current, previous);
            }
        }
        return Unit.f143329a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(final Function2<? super Number, ? super Number, Unit> onValueChange, final q1.f.QuantityInput template, final Number value, final Number maxValue, LocalThemeScope localThemeScope) {
        super(new Function2() { // from class: Ai.z1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C1.M0(value, maxValue, onValueChange, (Number) obj, (Number) obj2);
            }
        }, value, template, localThemeScope, null, 16, null);
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        Intrinsics.j(maxValue, "maxValue");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = LazyKt.b(new Function0() { // from class: Ai.A1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1.O0(template, value);
            }
        });
        this.count = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.QuantityInput O0(final q1.f.QuantityInput quantityInput, final Number number) {
        return quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : null, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : new z1.W() { // from class: Ai.B1
            @Override // z1.W
            public final TransformedText a(AnnotatedString annotatedString) {
                return C1.P0(number, quantityInput, annotatedString);
            }
        }, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText P0(Number number, q1.f.QuantityInput quantityInput, AnnotatedString it) {
        Intrinsics.j(it, "it");
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        if (number.intValue() >= 0) {
            int iN = bVar.n(TextStyle.c(quantityInput.getTextStyle().getStyle(), 0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744443, null).getSpanStyle());
            try {
                bVar.g(it.getText());
                Unit unit = Unit.f143329a;
            } finally {
                bVar.k(iN);
            }
        }
        return new TransformedText(bVar.q(), InterfaceC18417E.INSTANCE.a());
    }

    @Override // Ai.AbstractC2820h1
    public void A0(C16913e c16913e) {
        this.infoBlockScope = c16913e;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: B, reason: from getter */
    public C16673d getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // Ai.AbstractC2820h1
    public void B0(si.p pVar) {
        this.label = pVar;
    }

    @Override // Ai.AbstractC2820h1
    public void C0(C16673d c16673d) {
        this.labelIcon = c16673d;
    }

    @Override // Ai.AbstractC2820h1
    public void D0(C16673d c16673d) {
        this.leadingIcon = c16673d;
    }

    @Override // Ai.AbstractC2820h1
    public void E0(Function0<Unit> function0) {
        this.onLabelIconClick = function0;
    }

    @Override // Ai.AbstractC2820h1
    public void F0(Function0<Unit> function0) {
        this.onLeadingIconClick = function0;
    }

    @Override // Ai.AbstractC2820h1
    public void G0(Function0<Unit> function0) {
        this.onTrailingIconClick = function0;
    }

    @Override // Ai.AbstractC2820h1
    public void H0(si.p pVar) {
        this.placeHolder = pVar;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: I, reason: from getter */
    public si.p getPlaceHolder() {
        return this.placeHolder;
    }

    @Override // Ai.y1
    public void N(q1.h.DrawableIcon template, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        D0(new C16673d(getLocalThemeScope(), template, null, 4, null));
        F0(onClick);
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public q1.f.QuantityInput getTemplate() {
        return (q1.f.QuantityInput) this.template.getValue();
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: P, reason: from getter */
    public C16913e getInfoBlockScope() {
        return this.infoBlockScope;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: c0, reason: from getter */
    public C16673d getLeadingIcon() {
        return this.leadingIcon;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    public si.p getDescription() {
        return this.description;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: j, reason: from getter */
    public si.p getLabel() {
        return this.label;
    }

    @Override // Ai.y1
    public void m0(q1.h.DrawableIcon template, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        n0(new C16673d(getLocalThemeScope(), template, null, 4, null));
        G0(onClick);
    }

    @Override // Ai.InterfaceC2817g1
    public void n0(C16673d c16673d) {
        this.trailingIcon = c16673d;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    /* renamed from: r, reason: from getter */
    public C16673d getLabelIcon() {
        return this.labelIcon;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    public Function0<Unit> s() {
        return this.onTrailingIconClick;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    public Function0<Unit> t0() {
        return this.onLabelIconClick;
    }

    @Override // Ai.AbstractC2820h1, Ai.InterfaceC2817g1
    public Function0<Unit> v0() {
        return this.onLeadingIconClick;
    }

    @Override // Ai.AbstractC2820h1
    public void y0(si.p pVar) {
        this.description = pVar;
    }
}
