package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10408c {

    /* renamed from: h, reason: collision with root package name */
    private static final ConcurrentHashMap<Uri, C10408c> f82224h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f82225i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f82226a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f82227b;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map<String, String> f82230e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f82229d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f82231f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final List<InterfaceC10414e> f82232g = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ContentObserver f82228c = new C10411d(this, null);

    private C10408c(ContentResolver contentResolver, Uri uri) {
        this.f82226a = contentResolver;
        this.f82227b = uri;
    }

    public static C10408c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, C10408c> concurrentHashMap = f82224h;
        C10408c c10408c = concurrentHashMap.get(uri);
        if (c10408c != null) {
            return c10408c;
        }
        C10408c c10408c2 = new C10408c(contentResolver, uri);
        C10408c c10408cPutIfAbsent = concurrentHashMap.putIfAbsent(uri, c10408c2);
        if (c10408cPutIfAbsent != null) {
            return c10408cPutIfAbsent;
        }
        c10408c2.f82226a.registerContentObserver(c10408c2.f82227b, false, c10408c2.f82228c);
        return c10408c2;
    }

    private final Map<String, String> e() {
        try {
            HashMap map = new HashMap();
            Cursor cursorQuery = this.f82226a.query(this.f82227b, f82225i, null, null, null);
            if (cursorQuery == null) {
                return map;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } finally {
                    cursorQuery.close();
                }
            }
            return map;
        } catch (SQLiteException | SecurityException unused) {
            FS.log_e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        synchronized (this.f82231f) {
            try {
                Iterator<InterfaceC10414e> it = this.f82232g.iterator();
                while (it.hasNext()) {
                    it.next().zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> c() {
        Map<String, String> mapE = AbstractC10417f.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f82230e;
        if (mapE == null) {
            synchronized (this.f82229d) {
                try {
                    mapE = this.f82230e;
                    if (mapE == null) {
                        mapE = e();
                        this.f82230e = mapE;
                    }
                } finally {
                }
            }
        }
        return mapE != null ? mapE : Collections.EMPTY_MAP;
    }

    public final void d() {
        synchronized (this.f82229d) {
            this.f82230e = null;
        }
    }
}
