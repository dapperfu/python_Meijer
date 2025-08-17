package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class I3 implements F3 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f81789a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f81790b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f81791c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f81792d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f81793e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f81794f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f81795g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f81796h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f81797i = new String[0];

    final /* synthetic */ AtomicBoolean b() {
        return this.f81789a;
    }

    @Override // com.google.android.gms.internal.measurement.F3
    public final String a(ContentResolver contentResolver, String str, String str2) throws zzjk {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f81790b == null) {
                    this.f81789a.set(false);
                    this.f81790b = new HashMap(16, 1.0f);
                    this.f81795g = new Object();
                    contentResolver.registerContentObserver(E3.f81753a, true, new H3(this, null));
                } else if (this.f81789a.getAndSet(false)) {
                    this.f81790b.clear();
                    this.f81791c.clear();
                    this.f81792d.clear();
                    this.f81793e.clear();
                    this.f81794f.clear();
                    this.f81795g = new Object();
                    this.f81796h = false;
                }
                Object obj = this.f81795g;
                if (this.f81790b.containsKey(str)) {
                    String str4 = (String) this.f81790b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = E3.f81753a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new zzjk("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new zzjk("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f81795g) {
                                            this.f81790b.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new zzjk("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th2) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                } catch (zzjk unused) {
                    return null;
                }
            } finally {
            }
        }
    }
}
