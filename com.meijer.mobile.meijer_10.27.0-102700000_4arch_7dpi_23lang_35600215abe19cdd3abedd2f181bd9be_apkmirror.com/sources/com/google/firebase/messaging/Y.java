package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f88855a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88856b;

    /* renamed from: c, reason: collision with root package name */
    private final String f88857c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f88859e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f88858d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f88860f = false;

    private boolean b(boolean z10) {
        if (z10 && !this.f88860f) {
            i();
        }
        return z10;
    }

    static Y c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Y y10 = new Y(sharedPreferences, str, str2, executor);
        y10.d();
        return y10;
    }

    private void d() {
        synchronized (this.f88858d) {
            try {
                this.f88858d.clear();
                String string = this.f88855a.getString(this.f88856b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f88857c)) {
                    String[] strArrSplit = string.split(this.f88857c, -1);
                    if (strArrSplit.length == 0) {
                        FS.log_e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f88858d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f88858d) {
            this.f88855a.edit().putString(this.f88856b, g()).commit();
        }
    }

    private void i() {
        this.f88859e.execute(new Runnable() { // from class: com.google.firebase.messaging.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f88854a.h();
            }
        });
    }

    public String e() {
        String strPeek;
        synchronized (this.f88858d) {
            strPeek = this.f88858d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f88858d) {
            zB = b(this.f88858d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f88858d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f88857c);
        }
        return sb2.toString();
    }

    private Y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f88855a = sharedPreferences;
        this.f88856b = str;
        this.f88857c = str2;
        this.f88859e = executor;
    }
}
