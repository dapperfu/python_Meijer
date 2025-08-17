package Qa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public class f extends d {
    public int a(String str, int i10) {
        Context contextA;
        if (!TextUtils.isEmpty(str) && (contextA = ((b) c.c(b.class)).a()) != null) {
            Resources resources = contextA.getResources();
            String lowerCase = str.toLowerCase(Locale.getDefault());
            if (lowerCase.contains(".")) {
                lowerCase = lowerCase.substring(0, lowerCase.indexOf("."));
            }
            int identifier = resources.getIdentifier(lowerCase, "drawable", contextA.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
        }
        return i10;
    }
}
