package F9;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f10320a;

    @Override // F9.h
    public String a(String str) {
        G9.b.c(str, "Key must not be null!");
        return this.f10320a.getString(str, null);
    }

    @Override // F9.h
    public void putInt(String str, int i10) {
        G9.b.c(str, "Key must not be null!");
        this.f10320a.edit().putInt(str, i10).commit();
    }

    @Override // F9.h
    public void putString(String str, String str2) {
        G9.b.c(str, "Key must not be null!");
        G9.b.c(str2, "Value must not be null!");
        this.f10320a.edit().putString(str, str2).commit();
    }

    @Override // F9.h
    public void remove(String str) {
        G9.b.c(str, "Key must not be null!");
        this.f10320a.edit().remove(str).commit();
    }

    public d(SharedPreferences sharedPreferences) {
        G9.b.c(sharedPreferences, "Prefs must not be null!");
        this.f10320a = sharedPreferences;
    }
}
