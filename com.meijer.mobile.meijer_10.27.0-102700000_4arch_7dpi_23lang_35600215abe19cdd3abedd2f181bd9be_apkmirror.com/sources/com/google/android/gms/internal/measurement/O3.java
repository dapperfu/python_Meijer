package com.google.android.gms.internal.measurement;

import Z.C5503a;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* loaded from: classes6.dex */
public final class O3 implements S3 {

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f81937i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f81938j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f81939a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f81940b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f81941c;

    /* renamed from: g, reason: collision with root package name */
    private volatile Map f81945g;

    /* renamed from: d, reason: collision with root package name */
    private ContentObserver f81942d = null;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f81943e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f81944f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final List f81946h = new ArrayList();

    public static O3 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        O3 o32 = (O3) f81937i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.N3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return O3.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!o32.f81943e) {
                return o32;
            }
            synchronized (o32) {
                try {
                    if (o32.f81943e) {
                        L3 l32 = new L3(o32, null);
                        o32.f81939a.registerContentObserver(o32.f81940b, false, l32);
                        o32.f81942d = l32;
                        o32.f81943e = false;
                    }
                } finally {
                }
            }
            return o32;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void f() {
        Iterator it = f81937i.values().iterator();
        while (it.hasNext()) {
            O3 o32 = (O3) it.next();
            synchronized (o32) {
                try {
                    if (o32.f81943e) {
                        o32.f81943e = false;
                    } else {
                        ContentObserver contentObserver = o32.f81942d;
                        if (contentObserver != null) {
                            o32.f81939a.unregisterContentObserver(contentObserver);
                            o32.f81942d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ O3 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new O3(contentResolver, uri, runnable);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f81945g;
        if (map2 == null) {
            synchronized (this.f81944f) {
                map2 = this.f81945g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) S3.b(new R3() { // from class: com.google.android.gms.internal.measurement.M3
                                @Override // com.google.android.gms.internal.measurement.R3
                                public final /* synthetic */ Object zza() {
                                    return this.f81832a.h();
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        FS.log_w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        map = Collections.EMPTY_MAP;
                    }
                    this.f81945g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f81944f) {
            this.f81945g = null;
            this.f81941c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f81946h.iterator();
                while (it.hasNext()) {
                    ((P3) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f81939a;
        Uri uri = this.f81940b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                FS.log_w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f81938j, null, null, null);
            try {
                if (cursorQuery == null) {
                    FS.log_w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map c5503a = count <= 256 ? new C5503a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c5503a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c5503a;
                }
                FS.log_w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e10) {
            FS.log_w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    private O3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Be.p.q(contentResolver);
        Be.p.q(uri);
        this.f81939a = contentResolver;
        this.f81940b = uri;
        this.f81941c = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) d().get(str);
    }
}
