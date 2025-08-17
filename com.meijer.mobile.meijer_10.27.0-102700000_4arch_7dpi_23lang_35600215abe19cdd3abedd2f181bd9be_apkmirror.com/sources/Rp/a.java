package Rp;

import F1.k;
import H1.d;
import H1.h;
import H1.w;
import V0.C5349s0;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.AbstractC18142l;
import kotlin.C18153w;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lak/a;", "formattedString", "Landroidx/compose/ui/text/AnnotatedString;", "a", "(Lak/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "Landroid/content/res/Resources;", "b", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "", "text", "LH1/d;", "density", "c", "(Ljava/lang/CharSequence;LH1/d;)Landroidx/compose/ui/text/AnnotatedString;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a {
    public static final AnnotatedString a(AbstractC5607a formattedString, Composer composer, int i10) {
        Intrinsics.j(formattedString, "formattedString");
        composer.startReplaceGroup(1283476825);
        if (ComposerKt.M()) {
            ComposerKt.U(1283476825, i10, -1, "com.meijer.mobile.shopandscan.compose.annotatedStringHtmlFormatted (StyledText.kt:84)");
        }
        Resources resourcesB = b(composer, 0);
        d dVar = (d) composer.o(C5892t0.g());
        int iHashCode = formattedString.hashCode();
        composer.startReplaceGroup(5004770);
        boolean zD = composer.d(iHashCode);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            Spanned spannedFromHtml = Html.fromHtml(bk.d.b(resourcesB, formattedString));
            Intrinsics.g(spannedFromHtml);
            objB = c(spannedFromHtml, dVar);
            composer.t(objB);
        }
        AnnotatedString annotatedString = (AnnotatedString) objB;
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return annotatedString;
    }

    private static final AnnotatedString c(CharSequence charSequence, d dVar) {
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, 2, null);
        }
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(charSequence.toString());
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
        Intrinsics.i(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 0) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.e(), C18153w.c(C18153w.INSTANCE.b()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                } else if (style == 1) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.f(), C18153w.c(C18153w.INSTANCE.b()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                } else if (style == 2) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.e(), C18153w.c(C18153w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                } else if (style == 3) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.f(), C18153w.c(C18153w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                AbstractC18142l.Companion companion = AbstractC18142l.INSTANCE;
                bVar.a(new SpanStyle(0L, 0L, null, null, null, Intrinsics.e(family, companion.d().getName()) ? companion.d() : Intrinsics.e(family, companion.e().getName()) ? companion.e() : Intrinsics.e(family, companion.c().getName()) ? companion.c() : Intrinsics.e(family, companion.a().getName()) ? companion.a() : companion.b(), null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), spanStart, spanEnd);
            } else if (obj instanceof BulletSpan) {
                uw.a.INSTANCE.a("BulletSpan not supported yet", new Object[0]);
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null), spanStart, spanEnd);
            } else if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                boolean dip = absoluteSizeSpan.getDip();
                int size = absoluteSizeSpan.getSize();
                bVar.a(new SpanStyle(0L, dip ? dVar.o(h.p(size)) : dVar.w(size), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null), spanStart, spanEnd);
            } else if (obj instanceof RelativeSizeSpan) {
                bVar.a(new SpanStyle(0L, w.e(((RelativeSizeSpan) obj).getSizeChange()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null), spanStart, spanEnd);
            } else if (obj instanceof StrikethroughSpan) {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.b(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof UnderlineSpan) {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof SuperscriptSpan) {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, F1.a.d(F1.a.INSTANCE.c()), null, null, 0L, null, null, null, null, 65279, null), spanStart, spanEnd);
            } else if (obj instanceof SubscriptSpan) {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, F1.a.d(F1.a.INSTANCE.b()), null, null, 0L, null, null, null, null, 65279, null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                bVar.a(new SpanStyle(C5349s0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
            } else {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null), spanStart, spanEnd);
            }
        }
        return bVar.q();
    }

    private static final Resources b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(845928135, i10, -1, "com.meijer.mobile.shopandscan.compose.resources (StyledText.kt:97)");
        }
        composer.o(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources();
        Intrinsics.i(resources, "getResources(...)");
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return resources;
    }
}
