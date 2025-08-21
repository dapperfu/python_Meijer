package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\n\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r8\u0006@BX\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0017\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/e0;", "", "LH1/t;", "layoutDirection", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/z;", "resolvedStyle", "typeface", "<init>", "(LH1/t;LH1/d;Ly1/l$b;Landroidx/compose/ui/text/z;Ljava/lang/Object;)V", "LH1/r;", "a", "()J", "", "c", "LH1/t;", "getLayoutDirection", "()LH1/t;", "setLayoutDirection", "(LH1/t;)V", "b", "LH1/d;", "getDensity", "()LH1/d;", "setDensity", "(LH1/d;)V", "Ly1/l$b;", "getFontFamilyResolver", "()Ly1/l$b;", "setFontFamilyResolver", "(Ly1/l$b;)V", "d", "Landroidx/compose/ui/text/z;", "getResolvedStyle", "()Landroidx/compose/ui/text/z;", "setResolvedStyle", "(Landroidx/compose/ui/text/z;)V", "e", "Ljava/lang/Object;", "getTypeface", "()Ljava/lang/Object;", "setTypeface", "(Ljava/lang/Object;)V", "<set-?>", "f", "J", "minSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private H1.t layoutDirection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC18269l.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextStyle resolvedStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object typeface;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minSize = a();

    private final long a() {
        return U.b(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    /* renamed from: b, reason: from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    public final void c(H1.t layoutDirection, H1.d density, AbstractC18269l.b fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        if (layoutDirection == this.layoutDirection && Intrinsics.e(density, this.density) && Intrinsics.e(fontFamilyResolver, this.fontFamilyResolver) && Intrinsics.e(resolvedStyle, this.resolvedStyle) && Intrinsics.e(typeface, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }

    public e0(H1.t tVar, H1.d dVar, AbstractC18269l.b bVar, TextStyle textStyle, Object obj) {
        this.layoutDirection = tVar;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }
}
