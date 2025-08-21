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
    private final AtomicBoolean f82629a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f82630b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f82631c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f82632d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f82633e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f82634f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f82635g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f82636h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f82637i = new String[0];

    final /* synthetic */ AtomicBoolean b() {
        return this.f82629a;
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
                if (this.f82630b == null) {
                    this.f82629a.set(false);
                    this.f82630b = new HashMap(16, 1.0f);
                    this.f82635g = new Object();
                    contentResolver.registerContentObserver(E3.f82593a, true, new H3(this, null));
                } else if (this.f82629a.getAndSet(false)) {
                    this.f82630b.clear();
                    this.f82631c.clear();
                    this.f82632d.clear();
                    this.f82633e.clear();
                    this.f82634f.clear();
                    this.f82635g = new Object();
                    this.f82636h = false;
                }
                Object obj = this.f82635g;
                if (this.f82630b.containsKey(str)) {
                    String str4 = (String) this.f82630b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = E3.f82593a;
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
                                        if (obj == this.f82635g) {
                                            this.f82630b.put(str, string);
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
