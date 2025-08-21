package yi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import j0.InterfaceC14888I;
import ki.InterfaceC15157a;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import li.j;
import li.l;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0017¨\u0006/"}, d2 = {"Lyi/g;", "Lyi/a;", "Lyi/e;", "", "selectedIndex", "", "singleSelection", "isExpanded", "Lkotlin/Function1;", "", "onClick", "LKi/M;", "localThemeScope", "<init>", "(IZZLkotlin/jvm/functions/Function1;LKi/M;)V", "Lki/q1$a;", "template", "Lli/l;", "Lkotlin/ExtensionFunctionType;", "content", "X", "(Lki/q1$a;Lkotlin/jvm/functions/Function1;)V", "b", "I", "A0", "()I", "c", "Z", "B0", "()Z", "d", "C0", "e", "Lkotlin/jvm/functions/Function1;", "z0", "()Lkotlin/jvm/functions/Function1;", "f", "LKi/M;", "()LKi/M;", "Lli/j;", "g", "Lli/j;", "o0", "()Lli/j;", "itemProvider", "h", "count", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements InterfaceC18317a, e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int selectedIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean singleSelection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isExpanded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Unit> onClick;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j itemProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int count;

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0014\u001a\u00020\b2,\u0010\u0013\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0002\b\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"yi/g$a", "Lli/l;", "Lki/q1$j;", "template", "", "text", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "Z", "(Lki/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lj0/I;", "", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/ExtensionFunctionType;", "block", "h0", "(Lkotlin/jvm/functions/Function4;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ li.b f171466b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f171467c;

        a(li.b bVar, g gVar) {
            this.f171466b = bVar;
            this.f171467c = gVar;
        }

        @Override // li.l
        public void Z(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout) {
            Intrinsics.j(template, "template");
            Intrinsics.j(text, "text");
            Intrinsics.j(onTextLayout, "onTextLayout");
            this.f171466b.Z(template, text, onTextLayout);
        }

        @Override // li.l
        public void h0(Function4<? super InterfaceC14888I, ? super Integer, ? super Composer, ? super Integer, Unit> block) {
            Intrinsics.j(block, "block");
            this.f171466b.h0(block);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(int i10, boolean z10, boolean z11, Function1<? super Integer, Unit> onClick, LocalThemeScope localThemeScope) {
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.selectedIndex = i10;
        this.singleSelection = z10;
        this.isExpanded = z11;
        this.onClick = onClick;
        this.localThemeScope = localThemeScope;
        this.itemProvider = new j(getSelectedIndex(), new li.b(getIsExpanded(), getSingleSelection(), 0, getLocalThemeScope(), InterfaceC15157a.C2247a.f141997a.a(getLocalThemeScope())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(g gVar, q1.Accordion accordion, Function1 function1, li.b receive, int i10) {
        Intrinsics.j(receive, "$this$receive");
        receive.H0(gVar.z0());
        receive.I0(accordion);
        function1.invoke(new a(receive, gVar));
        return Unit.f143329a;
    }

    /* renamed from: A0, reason: from getter */
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* renamed from: B0, reason: from getter */
    public boolean getSingleSelection() {
        return this.singleSelection;
    }

    /* renamed from: C0, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    @Override // yi.e
    public void X(final q1.Accordion template, final Function1<? super l, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(content, "content");
        getItemProvider().m(Integer.valueOf(this.count), new Function2() { // from class: yi.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.D0(this.f171456a, template, content, (li.b) obj, ((Integer) obj2).intValue());
            }
        });
        this.count++;
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // yi.InterfaceC18317a
    /* renamed from: o0, reason: from getter */
    public j getItemProvider() {
        return this.itemProvider;
    }

    public Function1<Integer, Unit> z0() {
        return this.onClick;
    }
}
