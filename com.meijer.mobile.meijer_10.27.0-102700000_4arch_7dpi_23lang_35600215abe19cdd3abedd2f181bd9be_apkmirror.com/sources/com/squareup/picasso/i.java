package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import ku.InterfaceC15321a;

/* loaded from: classes11.dex */
public class i implements InterfaceC15321a {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap<String, Bitmap> f126527a;

    /* renamed from: b, reason: collision with root package name */
    private final int f126528b;

    /* renamed from: c, reason: collision with root package name */
    private int f126529c;

    /* renamed from: d, reason: collision with root package name */
    private int f126530d;

    /* renamed from: e, reason: collision with root package name */
    private int f126531e;

    /* renamed from: f, reason: collision with root package name */
    private int f126532f;

    /* renamed from: g, reason: collision with root package name */
    private int f126533g;

    public i(Context context) {
        this(v.b(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f126529c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f126527a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f126529c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r4 = move-exception
            goto L74
        L14:
            int r0 = r3.f126529c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L53
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f126527a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f126527a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f126527a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = r3.f126529c     // Catch: java.lang.Throwable -> L12
            int r0 = com.squareup.picasso.v.g(r0)     // Catch: java.lang.Throwable -> L12
            int r1 = r1 - r0
            r3.f126529c = r1     // Catch: java.lang.Throwable -> L12
            int r0 = r3.f126531e     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f126531e = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.i.d(int):void");
    }

    @Override // ku.InterfaceC15321a
    public final synchronized int b() {
        return this.f126528b;
    }

    @Override // ku.InterfaceC15321a
    public final synchronized int size() {
        return this.f126529c;
    }

    public i(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f126528b = i10;
        this.f126527a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Override // ku.InterfaceC15321a
    public Bitmap a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmap = this.f126527a.get(str);
                if (bitmap != null) {
                    this.f126532f++;
                    return bitmap;
                }
                this.f126533g++;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ku.InterfaceC15321a
    public void c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            try {
                this.f126530d++;
                this.f126529c += v.g(bitmap);
                Bitmap bitmapPut = this.f126527a.put(str, bitmap);
                if (bitmapPut != null) {
                    this.f126529c -= v.g(bitmapPut);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d(this.f126528b);
    }
}
