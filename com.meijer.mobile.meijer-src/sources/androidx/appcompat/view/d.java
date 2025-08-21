package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import i.C14586i;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f46289f;

    /* renamed from: a, reason: collision with root package name */
    private int f46290a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f46291b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f46292c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f46293d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f46294e;

    public d() {
        super(null);
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public d(Context context, int i10) {
        super(context);
        this.f46290a = i10;
    }

    private Resources b() {
        if (this.f46294e == null) {
            Configuration configuration = this.f46293d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f46294e = super.getResources();
            } else {
                this.f46294e = createConfigurationContext(this.f46293d).getResources();
            }
        }
        return this.f46294e;
    }

    private void d() {
        boolean z10 = this.f46291b == null;
        if (z10) {
            this.f46291b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46291b.setTo(theme);
            }
        }
        f(this.f46291b, this.f46290a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f46289f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f46289f = configuration2;
        }
        return configuration.equals(f46289f);
    }

    public void a(Configuration configuration) {
        if (this.f46294e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f46293d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f46293d = new Configuration(configuration);
    }

    public int c() {
        return this.f46290a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46292c == null) {
            this.f46292c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46292c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46291b;
        if (theme != null) {
            return theme;
        }
        if (this.f46290a == 0) {
            this.f46290a = C14586i.f136442g;
        }
        d();
        return this.f46291b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f46290a != i10) {
            this.f46290a = i10;
            d();
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f46291b = theme;
    }
}
