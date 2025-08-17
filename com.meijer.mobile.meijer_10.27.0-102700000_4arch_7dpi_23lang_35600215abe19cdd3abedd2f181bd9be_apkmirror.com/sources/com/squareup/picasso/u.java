package com.squareup.picasso;

import android.content.Context;

/* loaded from: classes11.dex */
public class u implements Downloader {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f126606b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f126607c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f126608a;

    static class a extends ThreadLocal<StringBuilder> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }

        a() {
        }
    }

    public u(Context context) {
        this.f126608a = context.getApplicationContext();
    }
}
