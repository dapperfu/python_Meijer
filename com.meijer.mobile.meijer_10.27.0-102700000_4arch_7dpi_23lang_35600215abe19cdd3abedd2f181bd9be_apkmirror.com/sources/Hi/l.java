package Hi;

import H1.v;
import Ji.LocalThemeScope;
import Ji.T;
import ji.q1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pi.C16309d;
import ri.InterfaceC16791b;
import ri.m;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"LHi/l;", "LHi/i;", "LHi/a;", "Lri/c;", "LJi/T;", "backgroundColor", "Lji/q1$r;", "template", "LJi/M;", "localThemeScope", "", "text", "Lkotlin/Function0;", "", "onClick", "<init>", "(LJi/T;Lji/q1$r;LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lji/q1$h;", "X", "(Lji/q1$h;)V", "Lji/q1$j;", "Lkotlin/Function1;", "Lu1/v;", "onTextLayout", "m", "(Lji/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "LJi/M;", "c", "()LJi/M;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "d", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "Lri/m;", "e", "Lkotlin/Lazy;", "E", "()Lri/m;", "labelProvider", "f", "Lji/q1$h;", "_iconTemplate", "LV0/q0;", "g", "J", "r0", "()J", "LH1/v;", "h", "LH1/v;", "getLineHeight-U3a4LBI", "()LH1/v;", "C0", "(LH1/v;)V", "lineHeight", "Lpi/d;", "i", "s", "()Lpi/d;", "iconScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l implements i, a, ri.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy labelProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private q1.h _iconTemplate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private v lineHeight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy iconScope;

    public l(T backgroundColor, q1.Tag tag, LocalThemeScope localThemeScope, String str, Function0<Unit> function0) {
        l lVar;
        Intrinsics.j(backgroundColor, "backgroundColor");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.localThemeScope = localThemeScope;
        this.text = str;
        this.onClick = function0;
        this.labelProvider = LazyKt.b(new Function0() { // from class: Hi.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.B0(this.f12648a);
            }
        });
        this.backgroundColor = backgroundColor.getColor();
        if (tag != null) {
            this._iconTemplate = tag.getIcon();
            lVar = this;
            InterfaceC16791b.o(lVar, tag.getLabel(), str == null ? "" : str, null, 4, null);
        } else {
            lVar = this;
        }
        lVar.iconScope = LazyKt.b(new Function0() { // from class: Hi.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.A0(this.f12649a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16309d A0(l lVar) {
        LocalThemeScope localThemeScope = lVar.getLocalThemeScope();
        q1.h hVar = lVar._iconTemplate;
        if (hVar == null) {
            Intrinsics.y("_iconTemplate");
            hVar = null;
        }
        return new C16309d(localThemeScope, hVar, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m B0(l lVar) {
        return new m(lVar.getLocalThemeScope());
    }

    public void C0(v vVar) {
        this.lineHeight = vVar;
    }

    @Override // ri.q
    public m E() {
        return (m) this.labelProvider.getValue();
    }

    @Override // Hi.i
    public void X(q1.h template) {
        Intrinsics.j(template, "template");
        this._iconTemplate = template;
    }

    @Override // Ii.h
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // Hi.a
    public Function0<Unit> l() {
        return this.onClick;
    }

    @Override // ri.InterfaceC16791b, ri.c
    public void m(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout) {
        Intrinsics.j(template, "template");
        Intrinsics.j(text, "text");
        Intrinsics.j(onTextLayout, "onTextLayout");
        C0(v.b(template.getStyle().getStyle().s()));
        super.m(template, text, onTextLayout);
    }

    @Override // Hi.a
    /* renamed from: r0, reason: from getter */
    public long getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // Hi.a
    public C16309d s() {
        return (C16309d) this.iconScope.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(T t10, q1.Tag tag, LocalThemeScope localThemeScope, String str, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Function0 function02;
        String str2;
        tag = (i10 & 2) != 0 ? null : tag;
        if ((i10 & 8) != 0) {
            function02 = function0;
            str2 = null;
        } else {
            function02 = function0;
            str2 = str;
        }
        this(t10, tag, localThemeScope, str2, function02);
    }
}
