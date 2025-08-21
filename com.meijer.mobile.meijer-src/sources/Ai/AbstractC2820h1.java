package Ai;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qi.C16673d;
import ri.C16913e;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BC\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J9\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ9\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0014J%\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00062\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b'\u00100R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b+\u00102R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R$\u0010<\u001a\u0004\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*\"\u0004\b?\u0010&R$\u0010G\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR$\u0010R\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR$\u0010Z\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010B\u001a\u0004\bX\u0010D\"\u0004\bY\u0010FR$\u0010]\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010B\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR*\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010^\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR*\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR\"\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010m\u001a\u0004\bn\u0010oR \u0010v\u001a\u00020q8\u0016X\u0097D¢\u0006\u0012\n\u0004\b_\u0010X\u0012\u0004\bt\u0010u\u001a\u0004\br\u0010sR$\u0010z\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010M\u001a\u0004\bx\u0010O\"\u0004\by\u0010QR$\u0010~\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010M\u001a\u0004\b|\u0010O\"\u0004\b}\u0010Q¨\u0006\u007f"}, d2 = {"LAi/h1;", "", "CURRENT", "PREVIOUS", "LAi/g1;", "Lkotlin/Function2;", "", "onValueChange", "value", "Lki/q1$f;", "template", "LKi/M;", "localThemeScope", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lki/q1$f;LKi/M;Landroidx/compose/ui/Modifier;)V", "Lki/q1$j;", "", "d", "(Lki/q1$j;Ljava/lang/String;)V", "i", "Lki/q1$h$b;", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lkotlin/Function0;", "onClick", "g", "(Lki/q1$h$b;LKi/C;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "q0", "n", "f", "Lki/q1$i;", "content", "e", "(Lki/q1$i;Lkotlin/jvm/functions/Function2;)V", "D", "(Lkotlin/jvm/functions/Function2;)V", "b", "Lkotlin/jvm/functions/Function2;", "C", "()Lkotlin/jvm/functions/Function2;", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Lki/q1$f;", "()Lki/q1$f;", "LKi/M;", "()LKi/M;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Lri/e;", "Lri/e;", "P", "()Lri/e;", "A0", "(Lri/e;)V", "infoBlockScope", "h", "o", "z0", "endContent", "Lsi/p;", "Lsi/p;", "j", "()Lsi/p;", "B0", "(Lsi/p;)V", "label", "getDescription", "y0", "description", "Lqi/d;", "k", "Lqi/d;", "r", "()Lqi/d;", "C0", "(Lqi/d;)V", "labelIcon", "l", "c0", "D0", "leadingIcon", "m", "I", "H0", "placeHolder", "r0", "I0", "wordCount", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "G0", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "p", "v0", "F0", "onLeadingIconClick", "q", "t0", "E0", "onLabelIconClick", "", "Ljava/util/List;", "e0", "()Ljava/util/List;", "dropdownItems", "", "getIndexSelected", "()I", "getIndexSelected$annotations", "()V", "indexSelected", "t", "U", "setArrowDownIcon", "arrowDownIcon", "u", "b0", "setArrowUpIcon", "arrowUpIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ai.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC2820h1<CURRENT, PREVIOUS> implements Ji.h, InterfaceC2817g1<CURRENT, PREVIOUS> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<CURRENT, PREVIOUS, Unit> onValueChange;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CURRENT value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q1.f template;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C16913e infoBlockScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Composer, ? super Integer, Unit> endContent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private si.p label;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private si.p description;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C16673d labelIcon;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C16673d leadingIcon;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private si.p placeHolder;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private si.p wordCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onTrailingIconClick;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLeadingIconClick;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLabelIconClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<String> dropdownItems;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int indexSelected;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private C16673d arrowDownIcon;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C16673d arrowUpIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2820h1(Function2<? super CURRENT, ? super PREVIOUS, Unit> onValueChange, CURRENT value, q1.f template, LocalThemeScope localThemeScope, Modifier modifier) {
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(value, "value");
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(modifier, "modifier");
        this.onValueChange = onValueChange;
        this.value = value;
        this.template = template;
        this.localThemeScope = localThemeScope;
        this.modifier = modifier;
        this.indexSelected = -1;
    }

    public void A0(C16913e c16913e) {
        this.infoBlockScope = c16913e;
    }

    public void B0(si.p pVar) {
        this.label = pVar;
    }

    @Override // Ai.InterfaceC2817g1
    public Function2<CURRENT, PREVIOUS, Unit> C() {
        return this.onValueChange;
    }

    public void C0(C16673d c16673d) {
        this.labelIcon = c16673d;
    }

    public void D0(C16673d c16673d) {
        this.leadingIcon = c16673d;
    }

    public void E0(Function0<Unit> function0) {
        this.onLabelIconClick = function0;
    }

    public void F0(Function0<Unit> function0) {
        this.onLeadingIconClick = function0;
    }

    public void G0(Function0<Unit> function0) {
        this.onTrailingIconClick = function0;
    }

    public void H0(si.p pVar) {
        this.placeHolder = pVar;
    }

    /* renamed from: I, reason: from getter */
    public si.p getPlaceHolder() {
        return this.placeHolder;
    }

    public void I0(si.p pVar) {
        this.wordCount = pVar;
    }

    /* renamed from: P, reason: from getter */
    public C16913e getInfoBlockScope() {
        return this.infoBlockScope;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: U, reason: from getter */
    public C16673d getArrowDownIcon() {
        return this.arrowDownIcon;
    }

    /* renamed from: b, reason: from getter */
    public q1.f getTemplate() {
        return this.template;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: b0, reason: from getter */
    public C16673d getArrowUpIcon() {
        return this.arrowUpIcon;
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    /* renamed from: c0, reason: from getter */
    public C16673d getLeadingIcon() {
        return this.leadingIcon;
    }

    public void d(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        B0(new si.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    public void e(q1.InfoBlock template, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(content, "content");
        A0(new C16913e(template, getLocalThemeScope(), content));
    }

    @Override // Ai.InterfaceC2817g1
    public List<String> e0() {
        return this.dropdownItems;
    }

    public void f(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        y0(new si.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    public void g(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        C0(new C16673d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        E0(onClick);
    }

    public si.p getDescription() {
        return this.description;
    }

    @Override // Ai.InterfaceC2817g1
    public CURRENT getValue() {
        return this.value;
    }

    public void i(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        H0(new si.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    /* renamed from: j, reason: from getter */
    public si.p getLabel() {
        return this.label;
    }

    public void n(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        D0(new C16673d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        F0(onClick);
    }

    @Override // Ai.InterfaceC2817g1
    public Function2<Composer, Integer, Unit> o() {
        return this.endContent;
    }

    public void q0(q1.h.DrawableIcon template, Ki.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        n0(new C16673d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        G0(onClick);
    }

    /* renamed from: r, reason: from getter */
    public C16673d getLabelIcon() {
        return this.labelIcon;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: r0, reason: from getter */
    public si.p getWordCount() {
        return this.wordCount;
    }

    public Function0<Unit> s() {
        return this.onTrailingIconClick;
    }

    public Function0<Unit> t0() {
        return this.onLabelIconClick;
    }

    public Function0<Unit> v0() {
        return this.onLeadingIconClick;
    }

    public void y0(si.p pVar) {
        this.description = pVar;
    }

    public void z0(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.endContent = function2;
    }

    public void D(Function2<? super Composer, ? super Integer, Unit> content) {
        z0(content);
    }

    public /* synthetic */ AbstractC2820h1(Function2 function2, Object obj, q1.f fVar, LocalThemeScope localThemeScope, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, obj, fVar, localThemeScope, (i10 & 16) != 0 ? Modifier.INSTANCE : modifier);
    }
}
