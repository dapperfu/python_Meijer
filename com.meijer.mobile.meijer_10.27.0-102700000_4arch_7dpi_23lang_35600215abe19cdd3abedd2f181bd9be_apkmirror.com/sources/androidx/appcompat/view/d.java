package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import i.C14583i;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f46065f;

    /* renamed from: a, reason: collision with root package name */
    private int f46066a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f46067b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f46068c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f46069d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f46070e;

    public d() {
        super(null);
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public d(Context context, int i10) {
        super(context);
        this.f46066a = i10;
    }

    private Resources b() {
        if (this.f46070e == null) {
            Configuration configuration = this.f46069d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f46070e = super.getResources();
            } else {
                this.f46070e = createConfigurationContext(this.f46069d).getResources();
            }
        }
        return this.f46070e;
    }

    private void d() {
        boolean z10 = this.f46067b == null;
        if (z10) {
            this.f46067b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46067b.setTo(theme);
            }
        }
        f(this.f46067b, this.f46066a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f46065f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f46065f = configuration2;
        }
        return configuration.equals(f46065f);
    }

    public void a(Configuration configuration) {
        if (this.f46070e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f46069d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f46069d = new Configuration(configuration);
    }

    public int c() {
        return this.f46066a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46068c == null) {
            this.f46068c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46068c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46067b;
        if (theme != null) {
            return theme;
        }
        if (this.f46066a == 0) {
            this.f46066a = C14583i.f136685g;
        }
        d();
        return this.f46067b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f46066a != i10) {
            this.f46066a = i10;
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
        this.f46067b = theme;
    }
}
