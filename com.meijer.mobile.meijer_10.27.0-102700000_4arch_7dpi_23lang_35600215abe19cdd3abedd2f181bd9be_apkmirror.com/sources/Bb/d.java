package Bb;

import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public abstract class d<K, T> extends p<K, T> {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f2124j = C6381b.a(d.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private final Lb.i f2125i;

    @Override // Bb.p
    protected final String o(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return new String(this.f2125i.d(Lb.i.b(str2)), "UTF8");
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Bb.p
    protected final String q(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            return null;
        }
        try {
            return Lb.i.e(this.f2125i.c(str2.getBytes("UTF8")));
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public d(String str, SharedPreferences sharedPreferences, Class<T> cls) throws Exception {
        super(sharedPreferences, cls);
        this.f2125i = new Lb.i(str);
    }
}
