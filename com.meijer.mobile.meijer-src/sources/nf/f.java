package nf;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import qf.C16649i;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f152428a;

    /* renamed from: b, reason: collision with root package name */
    private b f152429b = null;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f152430a;

        /* renamed from: b, reason: collision with root package name */
        private final String f152431b;

        private b() throws Resources.NotFoundException {
            int iP = C16649i.p(f.this.f152428a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f152430a = null;
                    this.f152431b = null;
                    return;
                } else {
                    this.f152430a = "Flutter";
                    this.f152431b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f152430a = "Unity";
            String string = f.this.f152428a.getResources().getString(iP);
            this.f152431b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) throws IOException {
        if (this.f152428a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f152428a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f152429b == null) {
            this.f152429b = new b();
        }
        return this.f152429b;
    }

    public f(Context context) {
        this.f152428a = context;
    }

    public String d() {
        return f().f152430a;
    }

    public String e() {
        return f().f152431b;
    }
}
