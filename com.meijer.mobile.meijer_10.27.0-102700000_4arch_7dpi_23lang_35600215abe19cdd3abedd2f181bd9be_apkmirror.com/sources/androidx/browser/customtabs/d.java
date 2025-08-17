package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f47181a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f47182b;

    /* renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    public static final class C0965d {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f47185c;

        /* renamed from: d, reason: collision with root package name */
        private ActivityOptions f47186d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f47187e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f47188f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f47189g;

        /* renamed from: j, reason: collision with root package name */
        private boolean f47192j;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f47183a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0962a f47184b = new a.C0962a();

        /* renamed from: h, reason: collision with root package name */
        private int f47190h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f47191i = true;

        public C0965d() {
        }

        private void f(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f47183a.putExtras(bundle);
        }

        private void g() {
            if (this.f47186d == null) {
                this.f47186d = a.a();
            }
            c.a(this.f47186d, this.f47192j);
        }

        public d a() {
            if (!this.f47183a.hasExtra("android.support.customtabs.extra.SESSION")) {
                f(null, null);
            }
            ArrayList<Bundle> arrayList = this.f47185c;
            if (arrayList != null) {
                this.f47183a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f47187e;
            if (arrayList2 != null) {
                this.f47183a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f47183a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f47191i);
            this.f47183a.putExtras(this.f47184b.a().a());
            Bundle bundle = this.f47189g;
            if (bundle != null) {
                this.f47183a.putExtras(bundle);
            }
            if (this.f47188f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f47188f);
                this.f47183a.putExtras(bundle2);
            }
            this.f47183a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f47190h);
            int i10 = Build.VERSION.SDK_INT;
            b();
            if (i10 >= 34) {
                g();
            }
            ActivityOptions activityOptions = this.f47186d;
            return new d(this.f47183a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0965d e(f fVar) {
            this.f47183a.setPackage(fVar.e().getPackageName());
            f(fVar.d(), fVar.f());
            return this;
        }

        private void b() {
            Bundle bundle;
            String strA = b.a();
            if (!TextUtils.isEmpty(strA)) {
                if (this.f47183a.hasExtra("com.android.browser.headers")) {
                    bundle = this.f47183a.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", strA);
                    this.f47183a.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        public C0965d c(androidx.browser.customtabs.a aVar) {
            this.f47189g = aVar.a();
            return this;
        }

        public C0965d d(Context context, int i10, int i11) {
            this.f47183a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.d.b(context, i10, i11).e());
            return this;
        }

        public C0965d h(Context context, int i10, int i11) {
            this.f47186d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public C0965d(f fVar) {
            if (fVar != null) {
                e(fVar);
            }
        }
    }

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public void a(Context context, Uri uri) {
        this.f47181a.setData(uri);
        Z1.b.o(context, this.f47181a, this.f47182b);
    }

    d(Intent intent, Bundle bundle) {
        this.f47181a = intent;
        this.f47182b = bundle;
    }
}
