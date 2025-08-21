package J2;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15383a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f15384b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f15385c;

    public static Editable.Factory getInstance() {
        if (f15384b == null) {
            synchronized (f15383a) {
                try {
                    if (f15384b == null) {
                        f15384b = new b();
                    }
                } finally {
                }
            }
        }
        return f15384b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f15385c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f15385c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
