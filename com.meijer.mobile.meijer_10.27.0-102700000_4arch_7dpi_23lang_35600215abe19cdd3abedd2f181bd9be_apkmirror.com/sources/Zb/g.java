package Zb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class g<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private String f42590a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f42591b;

    /* renamed from: c, reason: collision with root package name */
    private Lock f42592c = new ReentrantLock();

    @Override // Zb.f
    public final void a(String str, T t10) {
        this.f42592c.lock();
        try {
            SharedPreferences.Editor editorEdit = this.f42591b.edit();
            if (t10.getClass() == String.class || t10.getClass() == Long.class || t10.getClass() == Double.class || t10.getClass() == Boolean.class || t10.getClass() == Integer.class) {
                editorEdit.putString(str, t10.toString());
            } else {
                editorEdit.putString(str, Sb.b.b(t10));
            }
            editorEdit.commit();
        } catch (Exception unused) {
        }
        this.f42592c.unlock();
    }

    @Override // Zb.f
    public final T b(String str, Class<T> cls) {
        this.f42592c.lock();
        String string = this.f42591b.getString(str, "does_not_exist");
        this.f42592c.unlock();
        if ("does_not_exist".equals(string)) {
            return null;
        }
        return (T) d(cls, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static T d(Class<T> cls, String str) {
        if (cls == String.class) {
            return str;
        }
        try {
            return cls == Long.class ? (T) new Long(Long.parseLong(str)) : cls == Double.class ? (T) new Double(Double.parseDouble(str)) : cls == Boolean.class ? (T) new Boolean(Boolean.parseBoolean(str)) : cls == Integer.class ? (T) new Integer(Integer.parseInt(str)) : (T) Sb.b.a(str, cls);
        } catch (Exception unused) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSON_PARSE_ERROR);
        }
    }

    @Override // Zb.f
    public final List<T> c(Class<T> cls) {
        Collection<?> collectionValues = this.f42591b.getAll().values();
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collectionValues.iterator();
        while (it.hasNext()) {
            Object objD = d(cls, (String) it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public g(String str) {
        this.f42590a = str;
        this.f42591b = Ub.a.f35865b.f35866a.getSharedPreferences(str, 0);
    }

    @Override // Zb.f
    public final int b() {
        return this.f42591b.getAll().size();
    }

    @Override // Zb.f
    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f42591b.edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    @Override // Zb.f
    public final void a() {
        this.f42592c.lock();
        SharedPreferences.Editor editorEdit = this.f42591b.edit();
        editorEdit.clear();
        editorEdit.commit();
        this.f42592c.unlock();
    }
}
