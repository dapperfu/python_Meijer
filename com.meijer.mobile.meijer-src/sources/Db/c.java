package Db;

import android.content.SharedPreferences;
import eb.C13784a;
import eb.C13785b;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class c extends n {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f6067f = C13785b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final Nb.i f6068e;

    @Override // Db.n
    protected final String f(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return new String(this.f6068e.d(Nb.i.b(str2)), "UTF8");
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Db.n
    protected final String g(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            return null;
        }
        try {
            return Nb.i.e(this.f6068e.c(str2.getBytes("UTF8")));
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public c(String str, SharedPreferences sharedPreferences) throws Exception {
        super(sharedPreferences);
        this.f6068e = new Nb.i(str);
    }
}
