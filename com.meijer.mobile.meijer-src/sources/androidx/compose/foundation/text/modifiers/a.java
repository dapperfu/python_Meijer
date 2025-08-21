package androidx.compose.foundation.text.modifiers;

import F1.t;
import V0.InterfaceC5502x0;
import X0.c;
import androidx.compose.foundation.text.L;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.r;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.G;
import androidx.compose.ui.node.InterfaceC5965t;
import androidx.compose.ui.node.InterfaceC5967v;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import i0.C14592e;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.Placeholder;
import u1.TextLayoutResult;
import v0.C17581g;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\r*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J&\u00103\u001a\u000202*\u00020-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00109J#\u0010<\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J#\u0010=\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u00109J°\u0001\u0010?\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Lv0/g;", "selectionController", "LV0/x0;", "overrideColor", "Landroidx/compose/foundation/text/L;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ly1/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lv0/g;LV0/x0;Landroidx/compose/foundation/text/L;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "LX0/c;", "I", "(LX0/c;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "width", "F", "N", "r", "color", "Q2", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ljava/util/List;IIZLy1/l$b;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv0/g;LV0/x0;Landroidx/compose/foundation/text/L;)V", "q", "Lv0/g;", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/text/modifiers/b;", "s", "Landroidx/compose/foundation/text/modifiers/b;", "textAnnotatedStringNode", "o2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a extends AbstractC5959m implements D, InterfaceC5965t, InterfaceC5967v {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private C17581g selectionController;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1<? super b.TextSubstitutionValue, Unit> onShowTranslation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b textAnnotatedStringNode;

    public /* synthetic */ a(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, c17581g, interfaceC5502x0, l10, function13);
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public /* synthetic */ a(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1 function13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? t.INSTANCE.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function12, (i13 & 1024) != 0 ? null : c17581g, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? null : interfaceC5502x0, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : l10, (i13 & 8192) != 0 ? null : function13, null);
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return this.textAnnotatedStringNode.a3(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(c cVar) {
        this.textAnnotatedStringNode.S2(cVar);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return this.textAnnotatedStringNode.b3(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return this.textAnnotatedStringNode.Y2(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC5967v
    public void O(LayoutCoordinates coordinates) {
        C17581g c17581g = this.selectionController;
        if (c17581g != null) {
            c17581g.g(coordinates);
        }
    }

    public final void Q2(AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, AbstractC18269l.b fontFamilyResolver, int overflow, Function1<? super TextLayoutResult, Unit> onTextLayout, Function1<? super List<Rect>, Unit> onPlaceholderLayout, C17581g selectionController, InterfaceC5502x0 color, L autoSize) {
        b bVar = this.textAnnotatedStringNode;
        bVar.R2(bVar.e3(color, style), this.textAnnotatedStringNode.g3(text), this.textAnnotatedStringNode.f3(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow, autoSize), this.textAnnotatedStringNode.d3(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        G.b(this);
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        return this.textAnnotatedStringNode.Z2(k10, i10, j10);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return this.textAnnotatedStringNode.X2(interfaceC5933s, rVar, i10);
    }

    private a(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1<? super b.TextSubstitutionValue, Unit> function13) {
        this.selectionController = c17581g;
        this.onShowTranslation = function13;
        this.textAnnotatedStringNode = (b) K2(new b(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, this.selectionController, interfaceC5502x0, l10, this.onShowTranslation, null));
        if (this.selectionController != null) {
            return;
        }
        C14592e.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }
}
