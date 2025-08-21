package lb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f149571a;

    /* renamed from: b, reason: collision with root package name */
    private final String f149572b;

    /* renamed from: c, reason: collision with root package name */
    private c<T> f149573c;

    @Override // lb.d
    public final C15478a<T> a(String str) {
        return d(f().getString(str, null));
    }

    @Override // lb.d
    public final void b() {
        SharedPreferences.Editor editorE = e();
        editorE.clear();
        editorE.commit();
    }

    private C15478a<T> d(String str) {
        if (str != null) {
            return this.f149573c.b(str);
        }
        return null;
    }

    private SharedPreferences f() {
        return this.f149571a.getSharedPreferences(this.f149572b, 0);
    }

    public <X> f(Context context, String str, Class<T> cls) {
        this.f149571a = context;
        this.f149572b = str;
        this.f149573c = new c<>(cls);
    }

    private SharedPreferences.Editor e() {
        return f().edit();
    }

    @Override // lb.d
    public final Collection<C15478a<T>> c() {
        Map<String, ?> all = f().getAll();
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next()));
        }
        return arrayList;
    }

    @Override // lb.d
    public final void a(String str, C15478a<T> c15478a) {
        c15478a.m(str);
        String strA = this.f149573c.a(c15478a);
        SharedPreferences.Editor editorE = e();
        editorE.putString(str, strA);
        editorE.commit();
    }

    @Override // lb.d
    public final void b(String str) {
        SharedPreferences.Editor editorE = e();
        editorE.remove(str);
        editorE.commit();
    }

    @Override // lb.d
    public final int a() {
        Map<String, ?> all = f().getAll();
        if (all == null || all.values() == null) {
            return 0;
        }
        return all.values().size();
    }
}
