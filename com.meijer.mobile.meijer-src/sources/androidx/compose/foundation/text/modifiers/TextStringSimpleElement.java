package androidx.compose.foundation.text.modifiers;

import F1.t;
import V0.InterfaceC5502x0;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v0.C17585k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/Y;", "Lv0/k;", "", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "LV0/x0;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ly1/l$b;IZIILV0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Lv0/k;", "node", "", "n", "(Lv0/k;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/String;", "c", "Landroidx/compose/ui/text/z;", "d", "Ly1/l$b;", "e", "I", "f", "Z", "g", "h", "i", "LV0/x0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends Y<C17585k> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5502x0 color;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, AbstractC18269l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC5502x0 interfaceC5502x0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i10, z10, i11, i12, interfaceC5502x0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return Intrinsics.e(this.color, textStringSimpleElement.color) && Intrinsics.e(this.text, textStringSimpleElement.text) && Intrinsics.e(this.style, textStringSimpleElement.style) && Intrinsics.e(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && t.g(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, AbstractC18269l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC5502x0 interfaceC5502x0) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.color = interfaceC5502x0;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + t.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        InterfaceC5502x0 interfaceC5502x0 = this.color;
        return iHashCode + (interfaceC5502x0 != null ? interfaceC5502x0.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C17585k b() {
        return new C17585k(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(C17585k node) {
        node.S2(node.Y2(this.color, this.style), node.a3(this.text), node.Z2(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }
}
