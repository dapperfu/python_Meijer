package J2;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14536a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f14537b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f14538c;

    public static Editable.Factory getInstance() {
        if (f14537b == null) {
            synchronized (f14536a) {
                try {
                    if (f14537b == null) {
                        f14537b = new b();
                    }
                } finally {
                }
            }
        }
        return f14537b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f14538c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f14538c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
