package kotlin;

import H1.w;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC18269l;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b)\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b+\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b,\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b3\u0010\"¨\u00064"}, d2 = {"Lx0/P1;", "", "Landroidx/compose/ui/text/z;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;)V", "Ly1/l;", "defaultFontFamily", "(Ly1/l;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/z;", "getH1", "()Landroidx/compose/ui/text/z;", "b", "getH2", "c", "getH3", "d", "getH4", "e", "getH5", "f", "g", "h", "i", "j", "k", "l", "m", "getOverline", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.P1, reason: from toString */
/* loaded from: classes.dex */
public final class Typography {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h3;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h4;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h5;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h6;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle2;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body2;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle button;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle caption;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle overline;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.e(this.h1, typography.h1) && Intrinsics.e(this.h2, typography.h2) && Intrinsics.e(this.h3, typography.h3) && Intrinsics.e(this.h4, typography.h4) && Intrinsics.e(this.h5, typography.h5) && Intrinsics.e(this.h6, typography.h6) && Intrinsics.e(this.subtitle1, typography.subtitle1) && Intrinsics.e(this.subtitle2, typography.subtitle2) && Intrinsics.e(this.body1, typography.body1) && Intrinsics.e(this.body2, typography.body2) && Intrinsics.e(this.button, typography.button) && Intrinsics.e(this.caption, typography.caption) && Intrinsics.e(this.overline, typography.overline);
    }

    /* renamed from: a, reason: from getter */
    public final TextStyle getBody1() {
        return this.body1;
    }

    /* renamed from: b, reason: from getter */
    public final TextStyle getBody2() {
        return this.body2;
    }

    /* renamed from: c, reason: from getter */
    public final TextStyle getButton() {
        return this.button;
    }

    /* renamed from: d, reason: from getter */
    public final TextStyle getCaption() {
        return this.caption;
    }

    /* renamed from: e, reason: from getter */
    public final TextStyle getH6() {
        return this.h6;
    }

    /* renamed from: f, reason: from getter */
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    /* renamed from: g, reason: from getter */
    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(AbstractC18269l abstractC18269l, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        TextStyle textStyleC;
        TextStyle textStyleC2;
        TextStyle textStyleC3;
        TextStyle textStyleC4;
        TextStyle textStyleC5;
        TextStyle textStyleC6;
        TextStyle textStyleC7;
        TextStyle textStyleC8;
        TextStyle textStyleC9;
        TextStyle textStyleC10;
        TextStyle textStyleC11;
        TextStyle textStyleC12;
        TextStyle textStyleC13;
        AbstractC18269l abstractC18269lB = (i10 & 1) != 0 ? AbstractC18269l.INSTANCE.b() : abstractC18269l;
        if ((i10 & 2) != 0) {
            textStyleC = TextStyle.c(Q1.b(), 0L, w.i(96), FontWeight.INSTANCE.c(), null, null, null, null, w.g(-1.5d), null, null, null, 0L, null, null, null, 0, 0, w.i(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC = textStyle;
        }
        if ((i10 & 4) != 0) {
            textStyleC2 = TextStyle.c(Q1.b(), 0L, w.i(60), FontWeight.INSTANCE.c(), null, null, null, null, w.g(-0.5d), null, null, null, 0L, null, null, null, 0, 0, w.i(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC2 = textStyle2;
        }
        if ((i10 & 8) != 0) {
            textStyleC3 = TextStyle.c(Q1.b(), 0L, w.i(48), FontWeight.INSTANCE.e(), null, null, null, null, w.i(0), null, null, null, 0L, null, null, null, 0, 0, w.i(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC3 = textStyle3;
        }
        if ((i10 & 16) != 0) {
            textStyleC4 = TextStyle.c(Q1.b(), 0L, w.i(34), FontWeight.INSTANCE.e(), null, null, null, null, w.g(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.i(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC4 = textStyle4;
        }
        if ((i10 & 32) != 0) {
            textStyleC5 = TextStyle.c(Q1.b(), 0L, w.i(24), FontWeight.INSTANCE.e(), null, null, null, null, w.i(0), null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC5 = textStyle5;
        }
        if ((i10 & 64) != 0) {
            textStyleC6 = TextStyle.c(Q1.b(), 0L, w.i(20), FontWeight.INSTANCE.d(), null, null, null, null, w.g(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC6 = textStyle6;
        }
        if ((i10 & 128) != 0) {
            textStyleC7 = TextStyle.c(Q1.b(), 0L, w.i(16), FontWeight.INSTANCE.e(), null, null, null, null, w.g(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC7 = textStyle7;
        }
        if ((i10 & 256) != 0) {
            textStyleC8 = TextStyle.c(Q1.b(), 0L, w.i(14), FontWeight.INSTANCE.d(), null, null, null, null, w.g(0.1d), null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC8 = textStyle8;
        }
        if ((i10 & 512) != 0) {
            textStyleC9 = TextStyle.c(Q1.b(), 0L, w.i(16), FontWeight.INSTANCE.e(), null, null, null, null, w.g(0.5d), null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC9 = textStyle9;
        }
        if ((i10 & 1024) != 0) {
            textStyleC10 = TextStyle.c(Q1.b(), 0L, w.i(14), FontWeight.INSTANCE.e(), null, null, null, null, w.g(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.i(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC10 = textStyle10;
        }
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            textStyleC11 = TextStyle.c(Q1.b(), 0L, w.i(14), FontWeight.INSTANCE.d(), null, null, null, null, w.g(1.25d), null, null, null, 0L, null, null, null, 0, 0, w.i(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC11 = textStyle11;
        }
        if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            textStyleC12 = TextStyle.c(Q1.b(), 0L, w.i(12), FontWeight.INSTANCE.e(), null, null, null, null, w.g(0.4d), null, null, null, 0L, null, null, null, 0, 0, w.i(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC12 = textStyle12;
        }
        if ((i10 & 8192) != 0) {
            textStyleC13 = TextStyle.c(Q1.b(), 0L, w.i(10), FontWeight.INSTANCE.e(), null, null, null, null, w.g(1.5d), null, null, null, 0L, null, null, null, 0, 0, w.i(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC13 = textStyle13;
        }
        this(abstractC18269lB, textStyleC, textStyleC2, textStyleC3, textStyleC4, textStyleC5, textStyleC6, textStyleC7, textStyleC8, textStyleC9, textStyleC10, textStyleC11, textStyleC12, textStyleC13);
    }

    public Typography(AbstractC18269l abstractC18269l, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(Q1.d(textStyle, abstractC18269l), Q1.d(textStyle2, abstractC18269l), Q1.d(textStyle3, abstractC18269l), Q1.d(textStyle4, abstractC18269l), Q1.d(textStyle5, abstractC18269l), Q1.d(textStyle6, abstractC18269l), Q1.d(textStyle7, abstractC18269l), Q1.d(textStyle8, abstractC18269l), Q1.d(textStyle9, abstractC18269l), Q1.d(textStyle10, abstractC18269l), Q1.d(textStyle11, abstractC18269l), Q1.d(textStyle12, abstractC18269l), Q1.d(textStyle13, abstractC18269l));
    }
}
