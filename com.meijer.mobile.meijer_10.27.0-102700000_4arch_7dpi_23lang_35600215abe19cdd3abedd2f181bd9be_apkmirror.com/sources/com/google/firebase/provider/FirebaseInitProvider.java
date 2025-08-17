package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import com.google.firebase.f;
import com.google.firebase.n;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private static n f89141a = n.e();

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f89142b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            f89142b.set(true);
            if (f.q(getContext()) == null) {
                FS.log_i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                FS.log_i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            f89142b.set(false);
            return false;
        } catch (Throwable th2) {
            f89142b.set(false);
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static void a(ProviderInfo providerInfo) {
        r.m(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static n b() {
        return f89141a;
    }

    public static boolean c() {
        return f89142b.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }
}
