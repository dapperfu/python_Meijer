package m2;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class b {

    static class a {
        static Spanned a(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }
    }

    public static Spanned a(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.a(str, i10, imageGetter, tagHandler);
    }
}
