package lf;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import of.C16041i;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f148857a;

    /* renamed from: b, reason: collision with root package name */
    private b f148858b = null;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f148859a;

        /* renamed from: b, reason: collision with root package name */
        private final String f148860b;

        private b() throws Resources.NotFoundException {
            int iP = C16041i.p(f.this.f148857a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f148859a = null;
                    this.f148860b = null;
                    return;
                } else {
                    this.f148859a = "Flutter";
                    this.f148860b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f148859a = "Unity";
            String string = f.this.f148857a.getResources().getString(iP);
            this.f148860b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) throws IOException {
        if (this.f148857a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f148857a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f148858b == null) {
            this.f148858b = new b();
        }
        return this.f148858b;
    }

    public f(Context context) {
        this.f148857a = context;
    }

    public String d() {
        return f().f148859a;
    }

    public String e() {
        return f().f148860b;
    }
}
