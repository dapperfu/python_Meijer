package Bb;

import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class c extends n {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f2122f = C6381b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final Lb.i f2123e;

    @Override // Bb.n
    protected final String f(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return new String(this.f2123e.d(Lb.i.b(str2)), "UTF8");
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Bb.n
    protected final String g(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            return null;
        }
        try {
            return Lb.i.e(this.f2123e.c(str2.getBytes("UTF8")));
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public c(String str, SharedPreferences sharedPreferences) throws Exception {
        super(sharedPreferences);
        this.f2123e = new Lb.i(str);
    }
}
