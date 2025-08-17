package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.InterfaceC18141k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u1.Placeholder;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b-\u0010=R\u001d\u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b%\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/text/v;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "", "maxLines", "", "softWrap", "LF1/t;", "overflow", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Ly1/k$b;", "resourceLoader", "Ly1/l$b;", "fontFamilyResolver", "LH1/b;", "constraints", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ljava/util/List;IZILH1/d;LH1/t;Ly1/k$b;Ly1/l$b;J)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ljava/util/List;IZILH1/d;LH1/t;Ly1/l$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "j", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Landroidx/compose/ui/text/z;", "i", "()Landroidx/compose/ui/text/z;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "I", "e", "Z", "h", "()Z", "f", "LH1/d;", "()LH1/d;", "LH1/t;", "()LH1/t;", "Ly1/l$b;", "()Ly1/l$b;", "J", "()J", "k", "Ly1/k$b;", "_developerSuppliedResourceLoader", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.v, reason: from toString */
/* loaded from: classes.dex */
public final class TextLayoutInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final H1.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final H1.t layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18142l.b fontFamilyResolver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC18141k.b _developerSuppliedResourceLoader;

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle zVar, List list, int i10, boolean z10, int i11, H1.d dVar, H1.t tVar, AbstractC18142l.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, zVar, list, i10, z10, i11, dVar, tVar, bVar, j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return Intrinsics.e(this.text, textLayoutInput.text) && Intrinsics.e(this.style, textLayoutInput.style) && Intrinsics.e(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && F1.t.g(this.overflow, textLayoutInput.overflow) && Intrinsics.e(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && Intrinsics.e(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && H1.b.f(this.constraints, textLayoutInput.constraints);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle zVar, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, H1.d dVar, H1.t tVar, InterfaceC18141k.b bVar, AbstractC18142l.b bVar2, long j10) {
        this.text = annotatedString;
        this.style = zVar;
        this.placeholders = list;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.density = dVar;
        this.layoutDirection = tVar;
        this.fontFamilyResolver = bVar2;
        this.constraints = j10;
        this._developerSuppliedResourceLoader = bVar;
    }

    /* renamed from: a, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: b, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC18142l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: d, reason: from getter */
    public final H1.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: f, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + F1.t.h(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + H1.b.o(this.constraints);
    }

    /* renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: j, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) F1.t.i(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) H1.b.q(this.constraints)) + ')';
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle zVar, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, H1.d dVar, H1.t tVar, AbstractC18142l.b bVar, long j10) {
        this(annotatedString, zVar, list, i10, z10, i11, dVar, tVar, (InterfaceC18141k.b) null, bVar, j10);
    }
}
