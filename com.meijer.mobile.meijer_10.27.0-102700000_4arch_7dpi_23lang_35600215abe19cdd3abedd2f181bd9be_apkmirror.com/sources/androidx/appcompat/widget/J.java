package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class J extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f46678c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<J>> f46679d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f46680a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f46681b;

    private static boolean a(Context context) {
        return ((context instanceof J) || (context.getResources() instanceof L) || (context.getResources() instanceof X) || !X.c()) ? false : true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f46680a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f46680a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46681b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f46681b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }

    private J(Context context) {
        super(context);
        if (X.c()) {
            X x10 = new X(this, context.getResources());
            this.f46680a = x10;
            Resources.Theme themeNewTheme = x10.newTheme();
            this.f46681b = themeNewTheme;
            themeNewTheme.setTo(context.getTheme());
            return;
        }
        this.f46680a = new L(this, context.getResources());
        this.f46681b = null;
    }

    public static Context b(Context context) {
        J j10;
        if (a(context)) {
            synchronized (f46678c) {
                try {
                    ArrayList<WeakReference<J>> arrayList = f46679d;
                    if (arrayList == null) {
                        f46679d = new ArrayList<>();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference<J> weakReference = f46679d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                f46679d.remove(size);
                            }
                        }
                        for (int size2 = f46679d.size() - 1; size2 >= 0; size2--) {
                            WeakReference<J> weakReference2 = f46679d.get(size2);
                            if (weakReference2 != null) {
                                j10 = weakReference2.get();
                            } else {
                                j10 = null;
                            }
                            if (j10 != null && j10.getBaseContext() == context) {
                                return j10;
                            }
                        }
                    }
                    J j11 = new J(context);
                    f46679d.add(new WeakReference<>(j11));
                    return j11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return context;
    }
}
