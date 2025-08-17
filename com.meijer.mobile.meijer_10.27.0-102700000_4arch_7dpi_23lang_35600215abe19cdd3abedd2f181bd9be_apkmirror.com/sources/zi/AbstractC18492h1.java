package zi;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pi.C16309d;
import qi.C16532e;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BC\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J9\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ9\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0014J%\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00062\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b'\u00100R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b+\u00102R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b4\u00105R$\u0010<\u001a\u0004\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*\"\u0004\b?\u0010&R$\u0010G\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR$\u0010R\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR$\u0010Z\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010B\u001a\u0004\bX\u0010D\"\u0004\bY\u0010FR$\u0010]\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010B\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR*\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR*\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010_\u001a\u0004\bi\u0010a\"\u0004\bj\u0010cR\"\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010m\u001a\u0004\bn\u0010oR \u0010x\u001a\u00020q8\u0016X\u0097D¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010w\u001a\u0004\bt\u0010uR$\u0010|\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010M\u001a\u0004\bz\u0010O\"\u0004\b{\u0010QR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b}\u0010M\u001a\u0004\b~\u0010O\"\u0004\b\u007f\u0010Q¨\u0006\u0081\u0001"}, d2 = {"Lzi/h1;", "", "CURRENT", "PREVIOUS", "Lzi/g1;", "Lkotlin/Function2;", "", "onValueChange", "value", "Lji/q1$f;", "template", "LJi/M;", "localThemeScope", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lji/q1$f;LJi/M;Landroidx/compose/ui/Modifier;)V", "Lji/q1$j;", "", "d", "(Lji/q1$j;Ljava/lang/String;)V", "i", "Lji/q1$h$b;", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lkotlin/Function0;", "onClick", "g", "(Lji/q1$h$b;LJi/C;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "t0", "f0", "e", "Lji/q1$i;", "content", "f", "(Lji/q1$i;Lkotlin/jvm/functions/Function2;)V", "C", "(Lkotlin/jvm/functions/Function2;)V", "b", "Lkotlin/jvm/functions/Function2;", "A", "()Lkotlin/jvm/functions/Function2;", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Lji/q1$f;", "()Lji/q1$f;", "LJi/M;", "()LJi/M;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Lqi/e;", "Lqi/e;", "L", "()Lqi/e;", "A0", "(Lqi/e;)V", "infoBlockScope", "h", "n", "z0", "endContent", "Lri/p;", "Lri/p;", "j", "()Lri/p;", "B0", "(Lri/p;)V", "label", "getDescription", "y0", "description", "Lpi/d;", "k", "Lpi/d;", "q", "()Lpi/d;", "C0", "(Lpi/d;)V", "labelIcon", "l", "W", "D0", "leadingIcon", "m", "G", "H0", "placeHolder", "q0", "I0", "wordCount", "o", "Lkotlin/jvm/functions/Function0;", "r", "()Lkotlin/jvm/functions/Function0;", "G0", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "p", "v0", "F0", "onLeadingIconClick", "s0", "E0", "onLabelIconClick", "", "Ljava/util/List;", "Z", "()Ljava/util/List;", "dropdownItems", "", "s", "I", "getIndexSelected", "()I", "getIndexSelected$annotations", "()V", "indexSelected", "t", "R", "setArrowDownIcon", "arrowDownIcon", "u", "V", "setArrowUpIcon", "arrowUpIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zi.h1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC18492h1<CURRENT, PREVIOUS> implements Ii.h, InterfaceC18489g1<CURRENT, PREVIOUS> {

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
    private C16532e infoBlockScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Composer, ? super Integer, Unit> endContent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ri.p label;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ri.p description;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C16309d labelIcon;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C16309d leadingIcon;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ri.p placeHolder;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ri.p wordCount;

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
    private C16309d arrowDownIcon;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C16309d arrowUpIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC18492h1(Function2<? super CURRENT, ? super PREVIOUS, Unit> onValueChange, CURRENT value, q1.f template, LocalThemeScope localThemeScope, Modifier modifier) {
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

    @Override // zi.InterfaceC18489g1
    public Function2<CURRENT, PREVIOUS, Unit> A() {
        return this.onValueChange;
    }

    public void A0(C16532e c16532e) {
        this.infoBlockScope = c16532e;
    }

    public void B0(ri.p pVar) {
        this.label = pVar;
    }

    public void C0(C16309d c16309d) {
        this.labelIcon = c16309d;
    }

    public void D0(C16309d c16309d) {
        this.leadingIcon = c16309d;
    }

    public void E0(Function0<Unit> function0) {
        this.onLabelIconClick = function0;
    }

    public void F0(Function0<Unit> function0) {
        this.onLeadingIconClick = function0;
    }

    /* renamed from: G, reason: from getter */
    public ri.p getPlaceHolder() {
        return this.placeHolder;
    }

    public void G0(Function0<Unit> function0) {
        this.onTrailingIconClick = function0;
    }

    public void H0(ri.p pVar) {
        this.placeHolder = pVar;
    }

    public void I0(ri.p pVar) {
        this.wordCount = pVar;
    }

    /* renamed from: L, reason: from getter */
    public C16532e getInfoBlockScope() {
        return this.infoBlockScope;
    }

    /* renamed from: R, reason: from getter */
    public C16309d getArrowDownIcon() {
        return this.arrowDownIcon;
    }

    /* renamed from: V, reason: from getter */
    public C16309d getArrowUpIcon() {
        return this.arrowUpIcon;
    }

    /* renamed from: W, reason: from getter */
    public C16309d getLeadingIcon() {
        return this.leadingIcon;
    }

    public List<String> Z() {
        return this.dropdownItems;
    }

    /* renamed from: b, reason: from getter */
    public q1.f getTemplate() {
        return this.template;
    }

    @Override // Ii.h
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    public void d(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        B0(new ri.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    public void e(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        y0(new ri.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    public void f(q1.InfoBlock template, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(content, "content");
        A0(new C16532e(template, getLocalThemeScope(), content));
    }

    public void f0(q1.h.DrawableIcon template, Ji.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        D0(new C16309d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        F0(onClick);
    }

    public void g(q1.h.DrawableIcon template, Ji.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        C0(new C16309d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        E0(onClick);
    }

    public ri.p getDescription() {
        return this.description;
    }

    @Override // zi.InterfaceC18489g1
    public CURRENT getValue() {
        return this.value;
    }

    public void i(q1.Label template, String value) {
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        H0(new ri.p(template, getLocalThemeScope(), value, null, null, null, 56, null));
    }

    /* renamed from: j, reason: from getter */
    public ri.p getLabel() {
        return this.label;
    }

    @Override // zi.InterfaceC18489g1
    public Function2<Composer, Integer, Unit> n() {
        return this.endContent;
    }

    /* renamed from: q, reason: from getter */
    public C16309d getLabelIcon() {
        return this.labelIcon;
    }

    @Override // zi.InterfaceC18489g1
    /* renamed from: q0, reason: from getter */
    public ri.p getWordCount() {
        return this.wordCount;
    }

    public Function0<Unit> r() {
        return this.onTrailingIconClick;
    }

    public Function0<Unit> s0() {
        return this.onLabelIconClick;
    }

    public void t0(q1.h.DrawableIcon template, Ji.C icon, String contentDescription, Function0<Unit> onClick) {
        Intrinsics.j(template, "template");
        Intrinsics.j(icon, "icon");
        M(new C16309d(getLocalThemeScope(), q1.h.DrawableIcon.y(template, icon, null, null, null, 0.0f, null, null, 126, null), contentDescription));
        G0(onClick);
    }

    public Function0<Unit> v0() {
        return this.onLeadingIconClick;
    }

    public void y0(ri.p pVar) {
        this.description = pVar;
    }

    public void z0(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.endContent = function2;
    }

    public void C(Function2<? super Composer, ? super Integer, Unit> content) {
        z0(content);
    }

    public /* synthetic */ AbstractC18492h1(Function2 function2, Object obj, q1.f fVar, LocalThemeScope localThemeScope, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, obj, fVar, localThemeScope, (i10 & 16) != 0 ? Modifier.INSTANCE : modifier);
    }
}
