package com.google.firebase.remoteconfig.internal;

/* loaded from: classes8.dex */
public class w implements fg.j {

    /* renamed from: a, reason: collision with root package name */
    private final String f90175a;

    /* renamed from: b, reason: collision with root package name */
    private final int f90176b;

    private void b() {
        if (this.f90175a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // fg.j
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f90176b == 0) {
            return false;
        }
        String strA = a();
        if (o.f90111f.matcher(strA).matches()) {
            return true;
        }
        if (o.f90112g.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "boolean"));
    }

    @Override // fg.j
    public String asString() {
        if (this.f90176b == 0) {
            return "";
        }
        b();
        return this.f90175a;
    }

    @Override // fg.j
    public int g() {
        return this.f90176b;
    }

    @Override // fg.j
    public long h() {
        if (this.f90176b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "long"), e10);
        }
    }

    @Override // fg.j
    public double i() {
        if (this.f90176b == 0) {
            return 0.0d;
        }
        String strA = a();
        try {
            return Double.valueOf(strA).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "double"), e10);
        }
    }

    w(String str, int i10) {
        this.f90175a = str;
        this.f90176b = i10;
    }

    private String a() {
        return asString().trim();
    }
}
