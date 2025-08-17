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
public final class C10283c {

    /* renamed from: h, reason: collision with root package name */
    private static final ConcurrentHashMap<Uri, C10283c> f81384h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f81385i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f81386a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f81387b;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map<String, String> f81390e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f81389d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f81391f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final List<InterfaceC10289e> f81392g = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ContentObserver f81388c = new C10286d(this, null);

    private C10283c(ContentResolver contentResolver, Uri uri) {
        this.f81386a = contentResolver;
        this.f81387b = uri;
    }

    public static C10283c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, C10283c> concurrentHashMap = f81384h;
        C10283c c10283c = concurrentHashMap.get(uri);
        if (c10283c != null) {
            return c10283c;
        }
        C10283c c10283c2 = new C10283c(contentResolver, uri);
        C10283c c10283cPutIfAbsent = concurrentHashMap.putIfAbsent(uri, c10283c2);
        if (c10283cPutIfAbsent != null) {
            return c10283cPutIfAbsent;
        }
        c10283c2.f81386a.registerContentObserver(c10283c2.f81387b, false, c10283c2.f81388c);
        return c10283c2;
    }

    private final Map<String, String> e() {
        try {
            HashMap map = new HashMap();
            Cursor cursorQuery = this.f81386a.query(this.f81387b, f81385i, null, null, null);
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
        synchronized (this.f81391f) {
            try {
                Iterator<InterfaceC10289e> it = this.f81392g.iterator();
                while (it.hasNext()) {
                    it.next().zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> c() {
        Map<String, String> mapE = AbstractC10292f.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f81390e;
        if (mapE == null) {
            synchronized (this.f81389d) {
                try {
                    mapE = this.f81390e;
                    if (mapE == null) {
                        mapE = e();
                        this.f81390e = mapE;
                    }
                } finally {
                }
            }
        }
        return mapE != null ? mapE : Collections.EMPTY_MAP;
    }

    public final void d() {
        synchronized (this.f81389d) {
            this.f81390e = null;
        }
    }
}
