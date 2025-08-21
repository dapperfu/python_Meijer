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
import b.InterfaceC6299a;
import b.InterfaceC6300b;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6300b f47366a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f47367b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f47368c;

    class a extends InterfaceC6299a.AbstractBinderC1180a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f47369a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f47370b;

        /* renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0976a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47372a;

            RunnableC0976a(Bundle bundle) {
                this.f47372a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.j(this.f47372a);
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47374a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47375b;

            b(int i10, Bundle bundle) {
                this.f47374a = i10;
                this.f47375b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.g(this.f47374a, this.f47375b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0977c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47377a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47378b;

            RunnableC0977c(String str, Bundle bundle) {
                this.f47377a = str;
                this.f47378b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.a(this.f47377a, this.f47378b);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47380a;

            d(Bundle bundle) {
                this.f47380a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.e(this.f47380a);
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47382a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f47383b;

            e(String str, Bundle bundle) {
                this.f47382a = str;
                this.f47383b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.h(this.f47382a, this.f47383b);
            }
        }

        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47385a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f47386b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f47387c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f47388d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f47385a = i10;
                this.f47386b = uri;
                this.f47387c = z10;
                this.f47388d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.i(this.f47385a, this.f47386b, this.f47387c, this.f47388d);
            }
        }

        class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47390a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47391b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f47392c;

            g(int i10, int i11, Bundle bundle) {
                this.f47390a = i10;
                this.f47391b = i11;
                this.f47392c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.d(this.f47390a, this.f47391b, this.f47392c);
            }
        }

        class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47394a;

            h(Bundle bundle) {
                this.f47394a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.k(this.f47394a);
            }
        }

        class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47396a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47397b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f47398c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f47399d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f47400e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f47401f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f47396a = i10;
                this.f47397b = i11;
                this.f47398c = i12;
                this.f47399d = i13;
                this.f47400e = i14;
                this.f47401f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.c(this.f47396a, this.f47397b, this.f47398c, this.f47399d, this.f47400e, this.f47401f);
            }
        }

        class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f47403a;

            j(Bundle bundle) {
                this.f47403a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f47370b.f(this.f47403a);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f47370b = bVar;
        }

        @Override // b.InterfaceC6299a
        public void J1(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // b.InterfaceC6299a
        public void K7(int i10, int i11, Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new g(i10, i11, bundle));
        }

        @Override // b.InterfaceC6299a
        public void W8(String str, Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new e(str, bundle));
        }

        @Override // b.InterfaceC6299a
        public void b4(String str, Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new RunnableC0977c(str, bundle));
        }

        @Override // b.InterfaceC6299a
        public Bundle i2(String str, Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f47370b;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // b.InterfaceC6299a
        public void i9(Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new d(bundle));
        }

        @Override // b.InterfaceC6299a
        public void m9(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new f(i10, uri, z10, bundle));
        }

        @Override // b.InterfaceC6299a
        public void p4(Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new h(bundle));
        }

        @Override // b.InterfaceC6299a
        public void p7(Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new j(bundle));
        }

        @Override // b.InterfaceC6299a
        public void r8(int i10, Bundle bundle) {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new b(i10, bundle));
        }

        @Override // b.InterfaceC6299a
        public void y7(Bundle bundle) throws RemoteException {
            if (this.f47370b == null) {
                return;
            }
            this.f47369a.post(new RunnableC0976a(bundle));
        }
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    private InterfaceC6299a.AbstractBinderC1180a b(b bVar) {
        return new a(bVar);
    }

    public boolean g(long j10) {
        try {
            return this.f47366a.i7(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    c(InterfaceC6300b interfaceC6300b, ComponentName componentName, Context context) {
        this.f47366a = interfaceC6300b;
        this.f47367b = componentName;
        this.f47368c = context;
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
        boolean zV7;
        InterfaceC6299a.AbstractBinderC1180a abstractBinderC1180aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zV7 = this.f47366a.k4(abstractBinderC1180aB, bundle);
            } else {
                zV7 = this.f47366a.v7(abstractBinderC1180aB);
            }
            if (!zV7) {
                return null;
            }
            return new f(this.f47366a, abstractBinderC1180aB, this.f47367b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
