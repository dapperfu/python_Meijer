package h9;

import java.util.Locale;

/* loaded from: classes4.dex */
public class e {
    public String a(Locale locale) {
        G9.b.c(locale, "Locale must not be null!");
        return locale.toLanguageTag();
    }
}
