package Db;

import android.content.SharedPreferences;
import eb.C13784a;
import eb.C13785b;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public abstract class d<K, T> extends p<K, T> {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f6069j = C13785b.a(d.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private final Nb.i f6070i;

    @Override // Db.p
    protected final String o(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return new String(this.f6070i.d(Nb.i.b(str2)), "UTF8");
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Db.p
    protected final String q(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            return null;
        }
        try {
            return Nb.i.e(this.f6070i.c(str2.getBytes("UTF8")));
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public d(String str, SharedPreferences sharedPreferences, Class<T> cls) throws Exception {
        super(sharedPreferences, cls);
        this.f6070i = new Nb.i(str);
    }
}
