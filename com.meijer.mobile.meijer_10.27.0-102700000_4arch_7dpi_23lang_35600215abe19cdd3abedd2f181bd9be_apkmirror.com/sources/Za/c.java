package Za;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f42571a;

    public final synchronized void c(String str, float f10) {
        SharedPreferences.Editor editorEdit = this.f42571a.edit();
        editorEdit.putFloat(str, f10);
        editorEdit.commit();
    }

    public final synchronized void d(String str, int i10) {
        SharedPreferences.Editor editorEdit = this.f42571a.edit();
        editorEdit.putInt(str, i10);
        editorEdit.commit();
    }

    public final synchronized void e(String str, long j10) {
        SharedPreferences.Editor editorEdit = this.f42571a.edit();
        editorEdit.putLong(str, j10);
        editorEdit.commit();
    }

    public final int a(String str) {
        return this.f42571a.getInt(str, 0);
    }

    public final long b(String str, long j10) {
        return this.f42571a.getLong(str, j10);
    }

    public c(SharedPreferences sharedPreferences) {
        this.f42571a = sharedPreferences;
    }
}
