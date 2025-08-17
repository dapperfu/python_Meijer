package Bb;

import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonWriteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private C6380a f2155a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f2156b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f2157c;

    /* renamed from: d, reason: collision with root package name */
    private i f2158d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, a> f2159e;

    class a extends g<k> {

        /* renamed from: Bb.o$a$a, reason: collision with other inner class name */
        final class RunnableC0043a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f2161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f2162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f2163c;

            RunnableC0043a(k kVar, String str, Object obj) {
                this.f2161a = kVar;
                this.f2162b = str;
                this.f2163c = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f2161a.a(this.f2162b, this.f2163c);
                } catch (Exception e10) {
                    this.f2161a.getClass();
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

    @Override // Bb.l
    public final Integer a(String str) {
        if (this.f2156b.contains(str)) {
            return Integer.valueOf(this.f2156b.getInt(str, 1));
        }
        return null;
    }

    @Override // Bb.l
    public final Long b(String str) {
        if (this.f2156b.contains(str)) {
            return Long.valueOf(this.f2156b.getLong(str, 1L));
        }
        return null;
    }

    @Override // Bb.l
    public final boolean c(String str, Long l10) {
        if (!k(l10, this.f2156b.contains(str) ? Long.valueOf(this.f2156b.getLong(str, -1L)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
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

    @Override // Bb.l
    public final boolean d(String str, Float f10) {
        if (!k(f10, this.f2156b.contains(str) ? Float.valueOf(this.f2156b.getFloat(str, -1.0f)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
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
        this.f2155a = C6381b.a(o.class.getName());
        this.f2159e = new HashMap();
        this.f2156b = sharedPreferences;
        this.f2157c = executor;
        this.f2158d = iVar;
    }

    private void l(String str, Object obj) {
        synchronized (this.f2159e) {
            try {
                a aVar = this.f2159e.get(str);
                if (aVar != null) {
                    Iterator<k> it = aVar.iterator();
                    while (it.hasNext()) {
                        o.this.f2157c.execute(aVar.new RunnableC0043a(it.next(), str, obj));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Bb.l
    public final void e(k kVar, String... strArr) {
        synchronized (this.f2159e) {
            try {
                for (String str : strArr) {
                    a aVar = this.f2159e.get(str);
                    if (aVar == null) {
                        aVar = new a();
                        this.f2159e.put(str, aVar);
                    }
                    aVar.a(kVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Bb.l
    public final boolean f(String str, Boolean bool) {
        if (!k(bool, this.f2156b.contains(str) ? Boolean.valueOf(this.f2156b.getBoolean(str, false)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
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

    @Override // Bb.l
    public final boolean g(String str, String str2) {
        if (!k(str2, this.f2156b.contains(str) ? this.f2156b.getString(str, null) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
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

    @Override // Bb.l
    public final Boolean h(String str, Boolean bool) {
        return !this.f2156b.contains(str) ? bool : Boolean.valueOf(this.f2156b.getBoolean(str, true));
    }

    @Override // Bb.l
    public final String i(String str, String str2) {
        return this.f2156b.getString(str, str2);
    }

    @Override // Bb.l
    public final boolean j(String str, Integer num) {
        if (!k(num, this.f2156b.contains(str) ? Integer.valueOf(this.f2156b.getInt(str, -1)) : null)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
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

    @Override // Bb.l
    public final boolean a(String str, Object obj) {
        try {
            String strB = this.f2158d.b(obj);
            if (!k(strB, this.f2156b.getString(str, null))) {
                return false;
            }
            SharedPreferences.Editor editorEdit = this.f2156b.edit();
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

    @Override // Bb.l
    public final <T> T b(String str, Class<T> cls) {
        String string = this.f2156b.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (T) this.f2158d.a(string, cls);
        } catch (Exception e10) {
            cls.getName();
            throw new RuntimeException("Object mapping failed when reading " + cls.getName() + " from '" + str + "'", e10);
        }
    }

    @Override // Bb.l
    public final Float c(String str) {
        if (this.f2156b.contains(str)) {
            return Float.valueOf(this.f2156b.getFloat(str, 1.0f));
        }
        return null;
    }

    @Override // Bb.l
    public final boolean d(String str) {
        SharedPreferences.Editor editorEdit = this.f2156b.edit();
        editorEdit.remove(str);
        return editorEdit.commit();
    }
}
