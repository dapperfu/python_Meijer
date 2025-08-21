package bb;

import android.content.SharedPreferences;

/* renamed from: bb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6346c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f60238a;

    public final synchronized void c(String str, float f10) {
        SharedPreferences.Editor editorEdit = this.f60238a.edit();
        editorEdit.putFloat(str, f10);
        editorEdit.commit();
    }

    public final synchronized void d(String str, int i10) {
        SharedPreferences.Editor editorEdit = this.f60238a.edit();
        editorEdit.putInt(str, i10);
        editorEdit.commit();
    }

    public final synchronized void e(String str, long j10) {
        SharedPreferences.Editor editorEdit = this.f60238a.edit();
        editorEdit.putLong(str, j10);
        editorEdit.commit();
    }

    public final int a(String str) {
        return this.f60238a.getInt(str, 0);
    }

    public final long b(String str, long j10) {
        return this.f60238a.getLong(str, j10);
    }

    public C6346c(SharedPreferences sharedPreferences) {
        this.f60238a = sharedPreferences;
    }
}
