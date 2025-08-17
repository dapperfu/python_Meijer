package F9;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class n extends a<String, SharedPreferences> {

    /* renamed from: c, reason: collision with root package name */
    private final String f10348c;

    @Override // F9.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f10348c, null);
    }

    public n(m mVar, SharedPreferences sharedPreferences) {
        super(sharedPreferences);
        G9.b.c(mVar, "Key must not be null!");
        G9.b.c(sharedPreferences, "Store must not be null!");
        G9.b.c(mVar.getKey(), "Key.getKey() must not be null!");
        this.f10348c = mVar.getKey();
    }

    @Override // F9.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString(this.f10348c, str).apply();
    }

    @Override // F9.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove(this.f10348c).apply();
    }
}
