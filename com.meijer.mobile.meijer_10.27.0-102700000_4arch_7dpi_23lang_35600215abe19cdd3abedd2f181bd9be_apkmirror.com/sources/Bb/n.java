package Bb;

import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonWriteException;
import java.io.IOException;
import vb.C17538d;

/* loaded from: classes4.dex */
public class n extends j {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f2152d = C6381b.a(n.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2153b;

    /* renamed from: c, reason: collision with root package name */
    private final C17538d f2154c = new C17538d();

    protected String f(String str, String str2) {
        return str2;
    }

    protected String g(String str, String str2) {
        return str2;
    }

    @Override // Bb.j
    public final <T> T c(String str, Class<T> cls) {
        String strF = f(str, this.f2153b.getString(str, null));
        if (strF == null) {
            return null;
        }
        try {
            T t10 = (T) this.f2154c.c(cls, strF);
            d(str, t10);
            return t10;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Bb.j
    public final void e(String str, Object obj) throws IOException {
        synchronized (this.f2153b) {
            try {
                SharedPreferences.Editor editorEdit = this.f2153b.edit();
                try {
                    editorEdit.putString(str, g(str, this.f2154c.h(obj)));
                    editorEdit.commit();
                } catch (JsonWriteException e10) {
                    e10.getMessage();
                    throw new IOException("Json Mapping failed - " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f2153b = sharedPreferences;
    }
}
