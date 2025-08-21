package H9;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f13447a;

    @Override // H9.h
    public String a(String str) {
        I9.b.c(str, "Key must not be null!");
        return this.f13447a.getString(str, null);
    }

    @Override // H9.h
    public void putInt(String str, int i10) {
        I9.b.c(str, "Key must not be null!");
        this.f13447a.edit().putInt(str, i10).commit();
    }

    @Override // H9.h
    public void putString(String str, String str2) {
        I9.b.c(str, "Key must not be null!");
        I9.b.c(str2, "Value must not be null!");
        this.f13447a.edit().putString(str, str2).commit();
    }

    @Override // H9.h
    public void remove(String str) {
        I9.b.c(str, "Key must not be null!");
        this.f13447a.edit().remove(str).commit();
    }

    public d(SharedPreferences sharedPreferences) {
        I9.b.c(sharedPreferences, "Prefs must not be null!");
        this.f13447a = sharedPreferences;
    }
}
