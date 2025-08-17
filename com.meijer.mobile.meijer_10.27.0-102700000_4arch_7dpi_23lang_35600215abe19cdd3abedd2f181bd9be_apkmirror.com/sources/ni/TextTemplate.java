package ni;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import kotlin.AbstractC18142l;
import kotlin.C18153w;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b.\b\u0081\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b3\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b4\u0010<R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b=\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bA\u00102R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b-\u0010F\u001a\u0004\bG\u0010'R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\bE\u0010'R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0006¢\u0006\f\n\u0004\bJ\u0010L\u001a\u0004\bH\u0010MR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bN\u0010P¨\u0006Q"}, d2 = {"Lni/L1;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "color", "LH1/v;", "fontSize", "Ly1/w;", "fontStyle", "Ly1/B;", "fontWeight", "Ly1/l;", "fontFamily", "letterSpacing", "LF1/k;", "textDecoration", "LF1/j;", "textAlign", "lineHeight", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "Lkotlin/Function0;", "Landroidx/compose/ui/text/z;", "style", "<init>", "(Landroidx/compose/ui/Modifier;JJLy1/w;Ly1/B;Ly1/l;JLF1/k;LF1/j;JIZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "k", "()Landroidx/compose/ui/Modifier;", "b", "J", "c", "()J", "e", "d", "Ly1/w;", "f", "()Ly1/w;", "Ly1/B;", "g", "()Ly1/B;", "Ly1/l;", "()Ly1/l;", "h", "LF1/k;", "q", "()LF1/k;", "i", "LF1/j;", "p", "()LF1/j;", "j", "I", "m", "l", "Z", "n", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ni.L1, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class TextTemplate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Modifier modifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C18153w fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18142l fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final F1.k textDecoration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final F1.j textAlign;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<TextLayoutResult, Unit> onTextLayout;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Composer, Integer, TextStyle> style;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ni.L1$a */
    static final class a implements Function2<Composer, Integer, TextStyle> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151516a = new a();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }

        a() {
        }

        public final TextStyle a(Composer composer, int i10) {
            composer.startReplaceGroup(-1110821768);
            if (ComposerKt.M()) {
                ComposerKt.U(-1110821768, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.TextTemplate.<init>.<anonymous> (Buttons.kt:211)");
            }
            TextStyle textStyle = (TextStyle) composer.o(kotlin.N1.d());
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return textStyle;
        }
    }

    public /* synthetic */ TextTemplate(Modifier modifier, long j10, long j11, C18153w c18153w, FontWeight fontWeight, AbstractC18142l abstractC18142l, long j12, F1.k kVar, F1.j jVar, long j13, int i10, boolean z10, int i11, Function1 function1, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, j10, j11, c18153w, fontWeight, abstractC18142l, j12, kVar, jVar, j13, i10, z10, i11, function1, function2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextTemplate)) {
            return false;
        }
        TextTemplate textTemplate = (TextTemplate) other;
        return Intrinsics.e(this.modifier, textTemplate.modifier) && C5346q0.s(this.color, textTemplate.color) && H1.v.e(this.fontSize, textTemplate.fontSize) && Intrinsics.e(this.fontStyle, textTemplate.fontStyle) && Intrinsics.e(this.fontWeight, textTemplate.fontWeight) && Intrinsics.e(this.fontFamily, textTemplate.fontFamily) && H1.v.e(this.letterSpacing, textTemplate.letterSpacing) && Intrinsics.e(this.textDecoration, textTemplate.textDecoration) && Intrinsics.e(this.textAlign, textTemplate.textAlign) && H1.v.e(this.lineHeight, textTemplate.lineHeight) && F1.t.g(this.overflow, textTemplate.overflow) && this.softWrap == textTemplate.softWrap && this.maxLines == textTemplate.maxLines && Intrinsics.e(this.onTextLayout, textTemplate.onTextLayout) && Intrinsics.e(this.style, textTemplate.style);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextTemplate(Modifier modifier, long j10, long j11, C18153w c18153w, FontWeight fontWeight, AbstractC18142l abstractC18142l, long j12, F1.k kVar, F1.j jVar, long j13, int i10, boolean z10, int i11, Function1<? super TextLayoutResult, Unit> onTextLayout, Function2<? super Composer, ? super Integer, TextStyle> style) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onTextLayout, "onTextLayout");
        Intrinsics.j(style, "style");
        this.modifier = modifier;
        this.color = j10;
        this.fontSize = j11;
        this.fontStyle = c18153w;
        this.fontWeight = fontWeight;
        this.fontFamily = abstractC18142l;
        this.letterSpacing = j12;
        this.textDecoration = kVar;
        this.textAlign = jVar;
        this.lineHeight = j13;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.onTextLayout = onTextLayout;
        this.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(TextLayoutResult it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC18142l getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: e, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: f, reason: from getter */
    public final C18153w getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: g, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: h, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    public int hashCode() {
        int iHashCode = ((((this.modifier.hashCode() * 31) + C5346q0.y(this.color)) * 31) + H1.v.i(this.fontSize)) * 31;
        C18153w c18153w = this.fontStyle;
        int iG = (iHashCode + (c18153w == null ? 0 : C18153w.g(c18153w.getValue()))) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode2 = (iG + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        AbstractC18142l abstractC18142l = this.fontFamily;
        int iHashCode3 = (((iHashCode2 + (abstractC18142l == null ? 0 : abstractC18142l.hashCode())) * 31) + H1.v.i(this.letterSpacing)) * 31;
        F1.k kVar = this.textDecoration;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        F1.j jVar = this.textAlign;
        return ((((((((((((iHashCode4 + (jVar != null ? F1.j.l(jVar.getValue()) : 0)) * 31) + H1.v.i(this.lineHeight)) * 31) + F1.t.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.onTextLayout.hashCode()) * 31) + this.style.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: j, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: k, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Function1<TextLayoutResult, Unit> l() {
        return this.onTextLayout;
    }

    /* renamed from: m, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final Function2<Composer, Integer, TextStyle> o() {
        return this.style;
    }

    /* renamed from: p, reason: from getter */
    public final F1.j getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: q, reason: from getter */
    public final F1.k getTextDecoration() {
        return this.textDecoration;
    }

    public String toString() {
        return "TextTemplate(modifier=" + this.modifier + ", color=" + ((Object) C5346q0.z(this.color)) + ", fontSize=" + ((Object) H1.v.j(this.fontSize)) + ", fontStyle=" + this.fontStyle + ", fontWeight=" + this.fontWeight + ", fontFamily=" + this.fontFamily + ", letterSpacing=" + ((Object) H1.v.j(this.letterSpacing)) + ", textDecoration=" + this.textDecoration + ", textAlign=" + this.textAlign + ", lineHeight=" + ((Object) H1.v.j(this.lineHeight)) + ", overflow=" + ((Object) F1.t.i(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", onTextLayout=" + this.onTextLayout + ", style=" + this.style + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextTemplate(Modifier modifier, long j10, long j11, C18153w c18153w, FontWeight fontWeight, AbstractC18142l abstractC18142l, long j12, F1.k kVar, F1.j jVar, long j13, int i10, boolean z10, int i11, Function1 function1, Function2 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Modifier modifier2 = (i12 & 1) != 0 ? Modifier.INSTANCE : modifier;
        long j14 = (i12 & 2) != 0 ? C5346q0.INSTANCE.j() : j10;
        long jA = (i12 & 4) != 0 ? H1.v.INSTANCE.a() : j11;
        C18153w c18153w2 = (i12 & 8) != 0 ? null : c18153w;
        FontWeight fontWeight2 = (i12 & 16) != 0 ? null : fontWeight;
        AbstractC18142l abstractC18142l2 = (i12 & 32) != 0 ? null : abstractC18142l;
        long jA2 = (i12 & 64) != 0 ? H1.v.INSTANCE.a() : j12;
        F1.k kVar2 = (i12 & 128) != 0 ? null : kVar;
        F1.j jVar2 = (i12 & 256) == 0 ? jVar : null;
        long jA3 = (i12 & 512) != 0 ? H1.v.INSTANCE.a() : j13;
        int iA = (i12 & 1024) != 0 ? F1.t.INSTANCE.a() : i10;
        Modifier modifier3 = modifier2;
        boolean z11 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? true : z10;
        FontWeight fontWeight3 = fontWeight2;
        AbstractC18142l abstractC18142l3 = abstractC18142l2;
        long j15 = jA2;
        F1.k kVar3 = kVar2;
        this(modifier3, j14, jA, c18153w2, fontWeight3, abstractC18142l3, j15, kVar3, jVar2, jA3, iA, z11, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a.e.API_PRIORITY_OTHER : i11, (i12 & 8192) != 0 ? new Function1() { // from class: ni.K1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextTemplate.b((TextLayoutResult) obj);
            }
        } : function1, (i12 & 16384) != 0 ? a.f151516a : function2, null);
    }
}
