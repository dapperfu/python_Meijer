package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f89721a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89722b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89723c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f89725e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f89724d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f89726f = false;

    private boolean c(boolean z10) {
        if (z10 && !this.f89726f) {
            j();
        }
        return z10;
    }

    static a0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        a0Var.e();
        return a0Var;
    }

    private void e() {
        synchronized (this.f89724d) {
            try {
                this.f89724d.clear();
                String string = this.f89721a.getString(this.f89722b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f89723c)) {
                    String[] strArrSplit = string.split(this.f89723c, -1);
                    if (strArrSplit.length == 0) {
                        FS.log_e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f89724d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f89724d) {
            this.f89721a.edit().putString(this.f89722b, h()).commit();
        }
    }

    private void j() {
        this.f89725e.execute(new Runnable() { // from class: com.google.firebase.messaging.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f89699a.i();
            }
        });
    }

    public String f() {
        String strPeek;
        synchronized (this.f89724d) {
            strPeek = this.f89724d.peek();
        }
        return strPeek;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f89724d) {
            zC = c(this.f89724d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f89724d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f89723c);
        }
        return sb2.toString();
    }

    private a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f89721a = sharedPreferences;
        this.f89722b = str;
        this.f89723c = str2;
        this.f89725e = executor;
    }

    public boolean b(String str) {
        boolean zC;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f89723c)) {
            synchronized (this.f89724d) {
                zC = c(this.f89724d.add(str));
            }
            return zC;
        }
        return false;
    }
}
