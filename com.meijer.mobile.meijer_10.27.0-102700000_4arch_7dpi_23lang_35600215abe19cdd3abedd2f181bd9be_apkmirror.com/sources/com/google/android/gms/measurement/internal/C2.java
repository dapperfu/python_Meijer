package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    final String f84944a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84945b;

    /* renamed from: c, reason: collision with root package name */
    private final String f84946c;

    /* renamed from: d, reason: collision with root package name */
    private final long f84947d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f84948e;

    private final void c() {
        E2 e22 = this.f84948e;
        e22.f();
        long jA = e22.f84868a.zzaZ().a();
        SharedPreferences.Editor editorEdit = e22.n().edit();
        editorEdit.remove(this.f84945b);
        editorEdit.remove(this.f84946c);
        editorEdit.putLong(this.f84944a, jA);
        editorEdit.apply();
    }

    private final long d() {
        return this.f84948e.n().getLong(this.f84944a, 0L);
    }

    public final void a(String str, long j10) {
        E2 e22 = this.f84948e;
        e22.f();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesN = e22.n();
        String str2 = this.f84945b;
        long j11 = sharedPreferencesN.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = e22.n().edit();
            editorEdit.putString(this.f84946c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = e22.f84868a.A().o0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = e22.n().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f84946c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair b() {
        long jAbs;
        E2 e22 = this.f84948e;
        e22.f();
        e22.f();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - e22.f84868a.zzaZ().a());
        }
        long j10 = this.f84947d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = e22.n().getString(this.f84946c, null);
        long j11 = e22.n().getLong(this.f84945b, 0L);
        c();
        return (string == null || j11 <= 0) ? E2.f84970A : new Pair(string, Long.valueOf(j11));
    }

    /* synthetic */ C2(E2 e22, String str, long j10, byte[] bArr) {
        boolean z10;
        Objects.requireNonNull(e22);
        this.f84948e = e22;
        com.google.android.gms.common.internal.r.f("health_monitor");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.a(z10);
        this.f84944a = "health_monitor:start";
        this.f84945b = "health_monitor:count";
        this.f84946c = "health_monitor:value";
        this.f84947d = j10;
    }
}
