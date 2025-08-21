package H9;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class n extends a<String, SharedPreferences> {

    /* renamed from: c, reason: collision with root package name */
    private final String f13475c;

    @Override // H9.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f13475c, null);
    }

    public n(m mVar, SharedPreferences sharedPreferences) {
        super(sharedPreferences);
        I9.b.c(mVar, "Key must not be null!");
        I9.b.c(sharedPreferences, "Store must not be null!");
        I9.b.c(mVar.getKey(), "Key.getKey() must not be null!");
        this.f13475c = mVar.getKey();
    }

    @Override // H9.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString(this.f13475c, str).apply();
    }

    @Override // H9.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove(this.f13475c).apply();
    }
}
