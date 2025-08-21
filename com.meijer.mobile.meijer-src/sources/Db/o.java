package Db;

import android.content.SharedPreferences;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private C13784a f6100a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f6101b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f6102c;

    /* renamed from: d, reason: collision with root package name */
    private i f6103d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, a> f6104e;

    class a extends g<k> {

        /* renamed from: Db.o$a$a, reason: collision with other inner class name */
        final class RunnableC0112a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f6106a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6107b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f6108c;

            RunnableC0112a(k kVar, String str, Object obj) {
                this.f6106a = kVar;
                this.f6107b = str;
                this.f6108c = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f6106a.a(this.f6107b, this.f6108c);
                } catch (Exception e10) {
                    this.f6106a.getClass();
                    e10.getMessage();
                }
            }
        }

        a() {
        }
    }

    public o(SharedPreferences sharedPreferences, Executor executor) {
        this(sharedPreferences, executor, h.a());
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == obj2) {
            return false;
        }
        return obj == null || !obj.equals(obj2);
    }

    @Override // Db.l
    public final Integer a(String str) {
        if (this.f6101b.contains(str)) {
            return Integer.valueOf(this.f6101b.getInt(str, 1));
        }
        return null;
    }

    @Override // Db.l
    public final Long b(String str) {
        if (this.f6101b.contains(str)) {
            return Long.valueOf(this.f6101b.getLong(str, 1L));
        }
        return null;
    }

    @Override // Db.l
    public final boolean c(String str, Long l10) {
        if (!k(l10, this.f6101b.contains(str) ? Long.valueOf(this.f6101b.getLong(str, -1L)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        if (l10 == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putLong(str, l10.longValue());
        }
        boolean zCommit = editorEdit.commit();
        if (zCommit) {
            l(str, l10);
        }
        return zCommit;
    }

    @Override // Db.l
    public final boolean d(String str, Float f10) {
        if (!k(f10, this.f6101b.contains(str) ? Float.valueOf(this.f6101b.getFloat(str, -1.0f)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        if (f10 == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putFloat(str, f10.floatValue());
        }
        boolean zCommit = editorEdit.commit();
        if (zCommit) {
            l(str, f10);
        }
        return zCommit;
    }

    private o(SharedPreferences sharedPreferences, Executor executor, i iVar) {
        this.f6100a = C13785b.a(o.class.getName());
        this.f6104e = new HashMap();
        this.f6101b = sharedPreferences;
        this.f6102c = executor;
        this.f6103d = iVar;
    }

    private void l(String str, Object obj) {
        synchronized (this.f6104e) {
            try {
                a aVar = this.f6104e.get(str);
                if (aVar != null) {
                    Iterator<k> it = aVar.iterator();
                    while (it.hasNext()) {
                        o.this.f6102c.execute(aVar.new RunnableC0112a(it.next(), str, obj));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Db.l
    public final boolean e(String str, Boolean bool) {
        if (!k(bool, this.f6101b.contains(str) ? Boolean.valueOf(this.f6101b.getBoolean(str, false)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        if (bool == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putBoolean(str, bool.booleanValue());
        }
        boolean zCommit = editorEdit.commit();
        if (zCommit) {
            l(str, bool);
        }
        return zCommit;
    }

    @Override // Db.l
    public final boolean f(String str, String str2) {
        if (!k(str2, this.f6101b.contains(str) ? this.f6101b.getString(str, null) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        if (str2 == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putString(str, str2);
        }
        boolean zCommit = editorEdit.commit();
        if (zCommit) {
            l(str, str2);
        }
        return zCommit;
    }

    @Override // Db.l
    public final Boolean g(String str, Boolean bool) {
        return !this.f6101b.contains(str) ? bool : Boolean.valueOf(this.f6101b.getBoolean(str, true));
    }

    @Override // Db.l
    public final String h(String str, String str2) {
        return this.f6101b.getString(str, str2);
    }

    @Override // Db.l
    public final boolean i(String str, Integer num) {
        if (!k(num, this.f6101b.contains(str) ? Integer.valueOf(this.f6101b.getInt(str, -1)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        if (num == null) {
            editorEdit.remove(str);
        } else {
            editorEdit.putInt(str, num.intValue());
        }
        boolean zCommit = editorEdit.commit();
        if (zCommit) {
            l(str, num);
        }
        return zCommit;
    }

    @Override // Db.l
    public final void j(k kVar, String... strArr) {
        synchronized (this.f6104e) {
            try {
                for (String str : strArr) {
                    a aVar = this.f6104e.get(str);
                    if (aVar == null) {
                        aVar = new a();
                        this.f6104e.put(str, aVar);
                    }
                    aVar.a(kVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Db.l
    public final boolean a(String str, Object obj) {
        try {
            String strB = this.f6103d.b(obj);
            if (!k(strB, this.f6101b.getString(str, null))) {
                return false;
            }
            SharedPreferences.Editor editorEdit = this.f6101b.edit();
            editorEdit.putString(str, strB);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                l(str, obj);
            }
            return zCommit;
        } catch (JsonWriteException unused) {
            throw new RuntimeException("Object mapping failed when writing " + str);
        }
    }

    @Override // Db.l
    public final <T> T b(String str, Class<T> cls) {
        String string = this.f6101b.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (T) this.f6103d.a(string, cls);
        } catch (Exception e10) {
            cls.getName();
            throw new RuntimeException("Object mapping failed when reading " + cls.getName() + " from '" + str + "'", e10);
        }
    }

    @Override // Db.l
    public final Float c(String str) {
        if (this.f6101b.contains(str)) {
            return Float.valueOf(this.f6101b.getFloat(str, 1.0f));
        }
        return null;
    }

    @Override // Db.l
    public final boolean d(String str) {
        SharedPreferences.Editor editorEdit = this.f6101b.edit();
        editorEdit.remove(str);
        return editorEdit.commit();
    }
}
