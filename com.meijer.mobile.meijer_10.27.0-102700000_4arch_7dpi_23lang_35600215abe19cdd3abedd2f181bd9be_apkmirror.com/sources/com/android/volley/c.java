package com.android.volley;

/* loaded from: classes4.dex */
public class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private int f62896a;

    /* renamed from: b, reason: collision with root package name */
    private int f62897b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62898c;

    /* renamed from: d, reason: collision with root package name */
    private final float f62899d;

    public c() {
        this(2500, 1, 1.0f);
    }

    public c(int i10, int i11, float f10) {
        this.f62896a = i10;
        this.f62898c = i11;
        this.f62899d = f10;
    }

    @Override // com.android.volley.m
    public int a() {
        return this.f62897b;
    }

    @Override // com.android.volley.m
    public void b(VolleyError volleyError) throws VolleyError {
        this.f62897b++;
        int i10 = this.f62896a;
        this.f62896a = i10 + ((int) (i10 * this.f62899d));
        if (!d()) {
            throw volleyError;
        }
    }

    @Override // com.android.volley.m
    public int c() {
        return this.f62896a;
    }

    protected boolean d() {
        return this.f62897b <= this.f62898c;
    }
}
