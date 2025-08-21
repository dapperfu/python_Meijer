package com.android.volley;

/* loaded from: classes4.dex */
public class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private int f63735a;

    /* renamed from: b, reason: collision with root package name */
    private int f63736b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63737c;

    /* renamed from: d, reason: collision with root package name */
    private final float f63738d;

    public c() {
        this(2500, 1, 1.0f);
    }

    public c(int i10, int i11, float f10) {
        this.f63735a = i10;
        this.f63737c = i11;
        this.f63738d = f10;
    }

    @Override // com.android.volley.m
    public int a() {
        return this.f63736b;
    }

    @Override // com.android.volley.m
    public void b(VolleyError volleyError) throws VolleyError {
        this.f63736b++;
        int i10 = this.f63735a;
        this.f63735a = i10 + ((int) (i10 * this.f63738d));
        if (!d()) {
            throw volleyError;
        }
    }

    @Override // com.android.volley.m
    public int c() {
        return this.f63735a;
    }

    protected boolean d() {
        return this.f63736b <= this.f63737c;
    }
}
