package bc;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6353g<T> implements InterfaceC6352f<T> {

    /* renamed from: a, reason: collision with root package name */
    private String f60257a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f60258b;

    /* renamed from: c, reason: collision with root package name */
    private Lock f60259c = new ReentrantLock();

    @Override // bc.InterfaceC6352f
    public final void a(String str, T t10) {
        this.f60259c.lock();
        try {
            SharedPreferences.Editor editorEdit = this.f60258b.edit();
            if (t10.getClass() == String.class || t10.getClass() == Long.class || t10.getClass() == Double.class || t10.getClass() == Boolean.class || t10.getClass() == Integer.class) {
                editorEdit.putString(str, t10.toString());
            } else {
                editorEdit.putString(str, Ub.b.b(t10));
            }
            editorEdit.commit();
        } catch (Exception unused) {
        }
        this.f60259c.unlock();
    }

    @Override // bc.InterfaceC6352f
    public final T b(String str, Class<T> cls) {
        this.f60259c.lock();
        String string = this.f60258b.getString(str, "does_not_exist");
        this.f60259c.unlock();
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
            return cls == Long.class ? (T) new Long(Long.parseLong(str)) : cls == Double.class ? (T) new Double(Double.parseDouble(str)) : cls == Boolean.class ? (T) new Boolean(Boolean.parseBoolean(str)) : cls == Integer.class ? (T) new Integer(Integer.parseInt(str)) : (T) Ub.b.a(str, cls);
        } catch (Exception unused) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSON_PARSE_ERROR);
        }
    }

    @Override // bc.InterfaceC6352f
    public final List<T> c(Class<T> cls) {
        Collection<?> collectionValues = this.f60258b.getAll().values();
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

    public C6353g(String str) {
        this.f60257a = str;
        this.f60258b = Wb.a.f40890b.f40891a.getSharedPreferences(str, 0);
    }

    @Override // bc.InterfaceC6352f
    public final int b() {
        return this.f60258b.getAll().size();
    }

    @Override // bc.InterfaceC6352f
    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f60258b.edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    @Override // bc.InterfaceC6352f
    public final void a() {
        this.f60259c.lock();
        SharedPreferences.Editor editorEdit = this.f60258b.edit();
        editorEdit.clear();
        editorEdit.commit();
        this.f60259c.unlock();
    }
}
