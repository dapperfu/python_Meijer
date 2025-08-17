package j2;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14837e {

    /* renamed from: j2.e$a */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, i iVar) {
            configuration.setLocales((LocaleList) iVar.h());
        }
    }

    public static i a(Configuration configuration) {
        return i.i(a.a(configuration));
    }

    public static void b(Configuration configuration, i iVar) {
        a.b(configuration, iVar);
    }
}
