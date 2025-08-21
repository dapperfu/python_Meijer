package Ai;

import Ki.LocalThemeScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import ki.q1;
import kotlin.FontWeight;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16673d;
import ri.C16913e;
import z1.InterfaceC18417E;
import z1.TransformedText;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002BB\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001b\u0010\u000b\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010.\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00106\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010:\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R$\u0010=\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R$\u0010A\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'\"\u0004\b@\u0010)R*\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR*\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010C\u001a\u0004\bN\u0010E\"\u0004\bO\u0010G¨\u0006Q"}, d2 = {"LAi/x1;", "LAi/y1;", "LAi/h1;", "", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "proposed", "onKeyboardInputChange", "Lki/q1$f$c;", "template", "displayValue", "LKi/M;", "localThemeScope", "<init>", "(Lkotlin/jvm/functions/Function1;Lki/q1$f$c;Ljava/lang/String;LKi/M;)V", "Lki/q1$h$b;", "Lkotlin/Function0;", "onClick", "N", "(Lki/q1$h$b;Lkotlin/jvm/functions/Function0;)V", "m0", "v", "Lkotlin/Lazy;", "N0", "()Lki/q1$f$c;", "Lri/e;", "w", "Lri/e;", "P", "()Lri/e;", "A0", "(Lri/e;)V", "infoBlockScope", "Lsi/p;", "x", "Lsi/p;", "j", "()Lsi/p;", "B0", "(Lsi/p;)V", "label", "y", "getDescription", "y0", "description", "Lqi/d;", "z", "Lqi/d;", "r", "()Lqi/d;", "C0", "(Lqi/d;)V", "labelIcon", "A", "c0", "D0", "leadingIcon", "B", "n0", "trailingIcon", "C", "I", "H0", "placeHolder", "D", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "G0", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "E", "v0", "F0", "onLeadingIconClick", "F", "t0", "E0", "onLabelIconClick", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class x1 extends AbstractC2820h1<String, Unit> implements y1 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private C16673d leadingIcon;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private C16673d trailingIcon;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private si.p placeHolder;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onTrailingIconClick;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLeadingIconClick;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLabelIconClick;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy template;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C16913e infoBlockScope;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private si.p label;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private si.p description;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C16673d labelIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(final Function1<? super String, Unit> onKeyboardInputChange, final q1.f.QuantityInput template, String displayValue, LocalThemeScope localThemeScope) {
        super(new Function2() { // from class: Ai.u1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x1.M0(onKeyboardInputChange, (String) obj, (Unit) obj2);
            }
        }, displayValue, template, localThemeScope, null, 16, null);
        Intrinsics.j(onKeyboardInputChange, "onKeyboardInputChange");
        Intrinsics.j(template, "template");
        Intrinsics.j(displayValue, "displayValue");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = LazyKt.b(new Function0() { // from class: Ai.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x1.O0(template);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(Function1 function1, String proposed, Unit unit) {
        Intrinsics.j(proposed, "proposed");
        Intrinsics.j(unit, "<unused var>");
        function1.invoke(proposed);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.QuantityInput O0(final q1.f.QuantityInput quantityInput) {
        return quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : null, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : new z1.W() { // from class: Ai.w1
            @Override // z1.W
            public final TransformedText a(AnnotatedString annotatedString) {
                return x1.P0(quantityInput, annotatedString);
            }
        }, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText P0(q1.f.QuantityInput quantityInput, AnnotatedString it) {
        Intrinsics.j(it, "it");
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        int iN = bVar.n(TextStyle.c(quantityInput.getTextStyle().getStyle(), 0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744443, null).getSpanStyle());
        try {
            bVar.g(it.getText());
            Unit unit = Unit.f143329a;
            bVar.k(iN);
            return new TransformedText(bVar.q(), InterfaceC18417E.INSTANCE.a());
        } catch (Throwable th2) {
            bVar.k(iN);
            throw th2;
        }
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
