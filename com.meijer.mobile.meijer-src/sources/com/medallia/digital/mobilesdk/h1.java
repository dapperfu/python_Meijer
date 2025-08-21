package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
abstract class h1<T> {
    h1() {
    }

    protected void a(boolean z10, String str) {
        if (z10) {
            a4.c(d() + " : Failed to " + str);
        }
    }

    protected abstract boolean a(Object... objArr);

    protected abstract long b();

    protected abstract ContentValues b(T t10);

    protected abstract T b(Object... objArr);

    protected abstract ArrayList<T> c(Object... objArr);

    protected abstract HashMap<String, String> c();

    protected boolean c(T t10) {
        boolean z10 = f1.a().getWritableDatabase().insert(d(), null, b((h1<T>) t10)) != -1;
        try {
            a(!z10, "insert - " + t10.getClass().getSimpleName());
            return z10;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return z10;
        }
    }

    protected abstract String d();

    protected boolean d(T t10) {
        return true;
    }

    protected String e() {
        return null;
    }

    protected boolean a() {
        boolean z10 = f1.a().getWritableDatabase().delete(d(), "1", null) > 0;
        a(!z10, "delete all");
        return z10;
    }

    protected boolean a(T t10) {
        return true;
    }
}
