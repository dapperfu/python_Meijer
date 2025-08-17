package jb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f139557a;

    /* renamed from: b, reason: collision with root package name */
    private final String f139558b;

    /* renamed from: c, reason: collision with root package name */
    private c<T> f139559c;

    @Override // jb.d
    public final C14879a<T> a(String str) {
        return d(f().getString(str, null));
    }

    @Override // jb.d
    public final void b() {
        SharedPreferences.Editor editorE = e();
        editorE.clear();
        editorE.commit();
    }

    private C14879a<T> d(String str) {
        if (str != null) {
            return this.f139559c.b(str);
        }
        return null;
    }

    private SharedPreferences f() {
        return this.f139557a.getSharedPreferences(this.f139558b, 0);
    }

    public <X> f(Context context, String str, Class<T> cls) {
        this.f139557a = context;
        this.f139558b = str;
        this.f139559c = new c<>(cls);
    }

    private SharedPreferences.Editor e() {
        return f().edit();
    }

    @Override // jb.d
    public final Collection<C14879a<T>> c() {
        Map<String, ?> all = f().getAll();
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next()));
        }
        return arrayList;
    }

    @Override // jb.d
    public final void a(String str, C14879a<T> c14879a) {
        c14879a.m(str);
        String strA = this.f139559c.a(c14879a);
        SharedPreferences.Editor editorE = e();
        editorE.putString(str, strA);
        editorE.commit();
    }

    @Override // jb.d
    public final void b(String str) {
        SharedPreferences.Editor editorE = e();
        editorE.remove(str);
        editorE.commit();
    }

    @Override // jb.d
    public final int a() {
        Map<String, ?> all = f().getAll();
        if (all == null || all.values() == null) {
            return 0;
        }
        return all.values().size();
    }
}
