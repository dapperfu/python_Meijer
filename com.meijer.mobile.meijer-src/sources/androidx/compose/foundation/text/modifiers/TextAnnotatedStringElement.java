package androidx.compose.foundation.text.modifiers;

import F1.t;
import V0.InterfaceC5502x0;
import androidx.compose.foundation.text.L;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u1.Placeholder;
import u1.TextLayoutResult;
import v0.C17581g;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00106R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/text/modifiers/b;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Lv0/g;", "selectionController", "LV0/x0;", "color", "Landroidx/compose/foundation/text/L;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ly1/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lv0/g;LV0/x0;Landroidx/compose/foundation/text/L;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "n", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Landroidx/compose/ui/text/AnnotatedString;", "c", "Landroidx/compose/ui/text/z;", "d", "Ly1/l$b;", "e", "Lkotlin/jvm/functions/Function1;", "f", "I", "g", "Z", "h", "i", "j", "Ljava/util/List;", "l", "Lv0/g;", "m", "LV0/x0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends Y<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<TextLayoutResult, Unit> onTextLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C17581g selectionController;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5502x0 color;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1<b.TextSubstitutionValue, Unit> onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, c17581g, interfaceC5502x0, l10, function13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return Intrinsics.e(this.color, textAnnotatedStringElement.color) && Intrinsics.e(this.text, textAnnotatedStringElement.text) && Intrinsics.e(this.style, textAnnotatedStringElement.style) && Intrinsics.e(this.placeholders, textAnnotatedStringElement.placeholders) && Intrinsics.e(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && t.g(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && Intrinsics.e(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1<? super b.TextSubstitutionValue, Unit> function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = function1;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = c17581g;
        this.color = interfaceC5502x0;
        this.onShowTranslation = function13;
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1<TextLayoutResult, Unit> function1 = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + t.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<Rect>, Unit> function12 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        C17581g c17581g = this.selectionController;
        int iHashCode5 = (iHashCode4 + (c17581g != null ? c17581g.hashCode() : 0)) * 31;
        InterfaceC5502x0 interfaceC5502x0 = this.color;
        int iHashCode6 = (iHashCode5 + (interfaceC5502x0 != null ? interfaceC5502x0.hashCode() : 0)) * 31;
        Function1<b.TextSubstitutionValue, Unit> function13 = this.onShowTranslation;
        return iHashCode6 + (function13 != null ? function13.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b getNode() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, this.onShowTranslation, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(b node) {
        node.R2(node.e3(this.color, this.style), node.g3(this.text), node.f3(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, null), node.d3(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }
}
