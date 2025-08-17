package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.fullstory.FS;
import java.util.List;

/* loaded from: classes7.dex */
class I {

    /* renamed from: a, reason: collision with root package name */
    private final Context f88803a;

    /* renamed from: b, reason: collision with root package name */
    private String f88804b;

    /* renamed from: c, reason: collision with root package name */
    private String f88805c;

    /* renamed from: d, reason: collision with root package name */
    private int f88806d;

    /* renamed from: e, reason: collision with root package name */
    private int f88807e = 0;

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f88803a.getPackageName());
        if (packageInfoF != null) {
            this.f88804b = Integer.toString(packageInfoF.versionCode);
            this.f88805c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f88804b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f88804b;
    }

    synchronized String b() {
        try {
            if (this.f88805c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f88805c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f88806d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f88806d = packageInfoF.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f88806d;
    }

    synchronized int e() {
        int i10 = this.f88807e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f88803a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            FS.log_e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.n.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f88807e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f88807e = 2;
            return 2;
        }
        FS.log_w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.n.g()) {
            this.f88807e = 2;
        } else {
            this.f88807e = 1;
        }
        return this.f88807e;
    }

    private PackageInfo f(String str) {
        try {
            return this.f88803a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    I(Context context) {
        this.f88803a = context;
    }

    static String c(com.google.firebase.f fVar) {
        String strD = fVar.n().d();
        if (strD != null) {
            return strD;
        }
        String strC = fVar.n().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
