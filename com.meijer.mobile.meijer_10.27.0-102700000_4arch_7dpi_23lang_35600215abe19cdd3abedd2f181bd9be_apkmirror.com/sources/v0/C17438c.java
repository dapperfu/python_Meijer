package v0;

import F1.t;
import H1.t;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.m;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17208B;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lv0/c;", "", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/text/z;", "inputTextStyle", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "<init>", "(LH1/t;Landroidx/compose/ui/text/z;LH1/d;Ly1/l$b;)V", "LH1/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "LH1/t;", "g", "()LH1/t;", "b", "Landroidx/compose/ui/text/z;", "f", "()Landroidx/compose/ui/text/z;", "LH1/d;", "d", "()LH1/d;", "Ly1/l$b;", "e", "()Ly1/l$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17438c {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f164233i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static C17438c f164234j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle inputTextStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18142l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle resolvedStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float lineHeightCache = Float.NaN;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float oneLineHeightCache = Float.NaN;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lv0/c$a;", "", "<init>", "()V", "Lv0/c;", "minMaxUtil", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/text/z;", "paramStyle", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "a", "(Lv0/c;LH1/t;Landroidx/compose/ui/text/z;LH1/d;Ly1/l$b;)Lv0/c;", "last", "Lv0/c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: v0.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C17438c a(C17438c minMaxUtil, t layoutDirection, TextStyle paramStyle, H1.d density, AbstractC18142l.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && Intrinsics.e(C17208B.d(paramStyle, layoutDirection), minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            C17438c c17438c = C17438c.f164234j;
            if (c17438c != null && layoutDirection == c17438c.getLayoutDirection() && Intrinsics.e(C17208B.d(paramStyle, layoutDirection), c17438c.getInputTextStyle()) && density.getDensity() == c17438c.getDensity().getDensity() && fontFamilyResolver == c17438c.getFontFamilyResolver()) {
                return c17438c;
            }
            C17438c c17438c2 = new C17438c(layoutDirection, C17208B.d(paramStyle, layoutDirection), H1.f.a(density.getDensity(), density.getFontScale()), fontFamilyResolver);
            C17438c.f164234j = c17438c2;
            return c17438c2;
        }
    }

    public final long c(long inConstraints, int minLines) {
        float f10 = this.oneLineHeightCache;
        float f11 = this.lineHeightCache;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = C17439d.f164242a;
            TextStyle textStyle = this.resolvedStyle;
            long jB = H1.c.b(0, 0, 0, 0, 15, null);
            H1.d dVar = this.density;
            AbstractC18142l.b bVar = this.fontFamilyResolver;
            t.Companion companion = F1.t.INSTANCE;
            float height = m.a(str, textStyle, jB, dVar, bVar, (64 & 32) != 0 ? CollectionsKt.m() : null, (64 & 64) != 0 ? CollectionsKt.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? F1.t.INSTANCE.a() : companion.a()).getHeight();
            float height2 = m.a(C17439d.f164243b, this.resolvedStyle, H1.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? CollectionsKt.m() : null, (64 & 64) != 0 ? CollectionsKt.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? F1.t.INSTANCE.a() : companion.a()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f11 = height2;
            f10 = height;
        }
        return H1.c.a(H1.b.n(inConstraints), H1.b.l(inConstraints), minLines != 1 ? RangesKt.k(RangesKt.f(Math.round(f10 + (f11 * (minLines - 1))), 0), H1.b.k(inConstraints)) : H1.b.m(inConstraints), H1.b.k(inConstraints));
    }

    /* renamed from: d, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC18142l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: f, reason: from getter */
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    /* renamed from: g, reason: from getter */
    public final H1.t getLayoutDirection() {
        return this.layoutDirection;
    }

    public C17438c(H1.t tVar, TextStyle textStyle, H1.d dVar, AbstractC18142l.b bVar) {
        this.layoutDirection = tVar;
        this.inputTextStyle = textStyle;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = C17208B.d(textStyle, tVar);
    }
}
