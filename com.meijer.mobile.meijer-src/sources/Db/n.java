package Db;

import android.content.SharedPreferences;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import xb.C18150d;

/* loaded from: classes4.dex */
public class n extends j {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f6097d = C13785b.a(n.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6098b;

    /* renamed from: c, reason: collision with root package name */
    private final C18150d f6099c = new C18150d();

    protected String f(String str, String str2) {
        return str2;
    }

    protected String g(String str, String str2) {
        return str2;
    }

    @Override // Db.j
    public final <T> T c(String str, Class<T> cls) {
        String strF = f(str, this.f6098b.getString(str, null));
        if (strF == null) {
            return null;
        }
        try {
            T t10 = (T) this.f6099c.c(cls, strF);
            d(str, t10);
            return t10;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Db.j
    public final void e(String str, Object obj) throws IOException {
        synchronized (this.f6098b) {
            try {
                SharedPreferences.Editor editorEdit = this.f6098b.edit();
                try {
                    editorEdit.putString(str, g(str, this.f6099c.h(obj)));
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
        this.f6098b = sharedPreferences;
    }
}
