package dk;

import F1.k;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", PreferencesHelper.PREF_ID, "Landroidx/compose/ui/text/AnnotatedString;", "a", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "", "text", "b", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dk.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13697a {
    private static final AnnotatedString b(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, charSequence.length(), UnderlineSpan.class);
        Intrinsics.i(spans, "getSpans(...)");
        ArrayList arrayList2 = new ArrayList(spans.length);
        for (Object obj : spans) {
            UnderlineSpan underlineSpan = (UnderlineSpan) obj;
            arrayList2.add(new AnnotatedString.Range(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null), spanned.getSpanStart(underlineSpan), spanned.getSpanEnd(underlineSpan)));
        }
        arrayList.addAll(arrayList2);
        Object[] spans2 = spanned.getSpans(0, charSequence.length(), StyleSpan.class);
        Intrinsics.i(spans2, "getSpans(...)");
        ArrayList arrayList3 = new ArrayList(spans2.length);
        for (Object obj2 : spans2) {
            StyleSpan styleSpan = (StyleSpan) obj2;
            arrayList3.add(new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.INSTANCE.f(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan)));
        }
        arrayList.addAll(arrayList3);
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final AnnotatedString a(int i10, Composer composer, int i11) throws Resources.NotFoundException {
        boolean z10;
        composer.startReplaceGroup(-484254905);
        if (ComposerKt.M()) {
            ComposerKt.U(-484254905, i11, -1, "com.meijer.mobile.core.i18n.compose.annotatedStringResource (BoldTextComposableUtils.kt:28)");
        }
        Resources resources = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources();
        composer.startReplaceGroup(5004770);
        if ((((i11 & 14) ^ 6) > 4 && composer.d(i10)) || (i11 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            CharSequence text = resources.getText(i10);
            Intrinsics.i(text, "getText(...)");
            objB = b(text);
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
}
