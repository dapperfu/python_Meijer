package com.google.firebase.remoteconfig.internal;

/* loaded from: classes7.dex */
public class w implements dg.j {

    /* renamed from: a, reason: collision with root package name */
    private final String f89333a;

    /* renamed from: b, reason: collision with root package name */
    private final int f89334b;

    private void b() {
        if (this.f89333a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // dg.j
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f89334b == 0) {
            return false;
        }
        String strA = a();
        if (o.f89269f.matcher(strA).matches()) {
            return true;
        }
        if (o.f89270g.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "boolean"));
    }

    @Override // dg.j
    public String asString() {
        if (this.f89334b == 0) {
            return "";
        }
        b();
        return this.f89333a;
    }

    @Override // dg.j
    public int g() {
        return this.f89334b;
    }

    @Override // dg.j
    public long h() {
        if (this.f89334b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "long"), e10);
        }
    }

    @Override // dg.j
    public double i() {
        if (this.f89334b == 0) {
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
        this.f89333a = str;
        this.f89334b = i10;
    }

    private String a() {
        return asString().trim();
    }
}
