package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.InterfaceC6160a;
import b.InterfaceC6161b;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6161b f47142a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f47143b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f47144c;

    class a extends InterfaceC6160a.AbstractBinderC1167a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f47145a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f47146b;

        /* renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0963a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47148a;

            RunnableC0963a(Bundle bundle) {
                this.f47148a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.j(this.f47148a);
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47150a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47151b;

            b(int i10, Bundle bundle) {
                this.f47150a = i10;
                this.f47151b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.g(this.f47150a, this.f47151b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0964c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47153a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47154b;

            RunnableC0964c(String str, Bundle bundle) {
                this.f47153a = str;
                this.f47154b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.a(this.f47153a, this.f47154b);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47156a;

            d(Bundle bundle) {
                this.f47156a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.e(this.f47156a);
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47158a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47159b;

            e(String str, Bundle bundle) {
                this.f47158a = str;
                this.f47159b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.h(this.f47158a, this.f47159b);
            }
        }

        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f47162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f47163c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f47164d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f47161a = i10;
                this.f47162b = uri;
                this.f47163c = z10;
                this.f47164d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.i(this.f47161a, this.f47162b, this.f47163c, this.f47164d);
            }
        }

        class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47166a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47167b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f47168c;

            g(int i10, int i11, Bundle bundle) {
                this.f47166a = i10;
                this.f47167b = i11;
                this.f47168c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.d(this.f47166a, this.f47167b, this.f47168c);
            }
        }

        class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47170a;

            h(Bundle bundle) {
                this.f47170a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.k(this.f47170a);
            }
        }

        class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47173b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f47174c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f47175d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f47176e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f47177f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f47172a = i10;
                this.f47173b = i11;
                this.f47174c = i12;
                this.f47175d = i13;
                this.f47176e = i14;
                this.f47177f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.c(this.f47172a, this.f47173b, this.f47174c, this.f47175d, this.f47176e, this.f47177f);
            }
        }

        class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47179a;

            j(Bundle bundle) {
                this.f47179a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47146b.f(this.f47179a);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f47146b = bVar;
        }

        @Override // b.InterfaceC6160a
        public void J7(int i10, int i11, Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new g(i10, i11, bundle));
        }

        @Override // b.InterfaceC6160a
        public void P3(String str, Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new RunnableC0964c(str, bundle));
        }

        @Override // b.InterfaceC6160a
        public void W8(String str, Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new e(str, bundle));
        }

        @Override // b.InterfaceC6160a
        public void Y3(Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new h(bundle));
        }

        @Override // b.InterfaceC6160a
        public void f7(Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new j(bundle));
        }

        @Override // b.InterfaceC6160a
        public Bundle g2(String str, Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f47146b;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // b.InterfaceC6160a
        public void h9(Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new d(bundle));
        }

        @Override // b.InterfaceC6160a
        public void l9(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new f(i10, uri, z10, bundle));
        }

        @Override // b.InterfaceC6160a
        public void s7(Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new RunnableC0963a(bundle));
        }

        @Override // b.InterfaceC6160a
        public void t8(int i10, Bundle bundle) {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new b(i10, bundle));
        }

        @Override // b.InterfaceC6160a
        public void z1(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
            if (this.f47146b == null) {
                return;
            }
            this.f47145a.post(new i(i10, i11, i12, i13, i14, bundle));
        }
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    private InterfaceC6160a.AbstractBinderC1167a b(b bVar) {
        return new a(bVar);
    }

    public boolean g(long j10) {
        try {
            return this.f47142a.X6(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    c(InterfaceC6161b interfaceC6161b, ComponentName componentName, Context context) {
        this.f47142a = interfaceC6161b;
        this.f47143b = componentName;
        this.f47144c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        List<String> arrayList;
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            FS.log_w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean zP7;
        InterfaceC6160a.AbstractBinderC1167a abstractBinderC1167aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zP7 = this.f47142a.V3(abstractBinderC1167aB, bundle);
            } else {
                zP7 = this.f47142a.p7(abstractBinderC1167aB);
            }
            if (!zP7) {
                return null;
            }
            return new f(this.f47142a, abstractBinderC1167aB, this.f47143b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
