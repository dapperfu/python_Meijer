package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: j, reason: collision with root package name */
    public final int f55755j;

    /* renamed from: k, reason: collision with root package name */
    public final String f55756k;

    /* renamed from: l, reason: collision with root package name */
    public final int f55757l;

    /* renamed from: m, reason: collision with root package name */
    public final a3.t f55758m;

    /* renamed from: n, reason: collision with root package name */
    public final int f55759n;

    /* renamed from: o, reason: collision with root package name */
    public final r.b f55760o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f55761p;

    private ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i10, Throwable th2, String str, int i11, String str2, int i12, a3.t tVar, int i13, boolean z10) {
        this(e(i10, str, str2, i12, tVar, i13), th2, i11, i10, str2, i12, tVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static ExoPlaybackException b(Throwable th2, String str, int i10, a3.t tVar, int i11, boolean z10, int i12) {
        if (tVar == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i12, str, i10, tVar, i11, z10);
    }

    public static ExoPlaybackException c(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    public static ExoPlaybackException d(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String e(int i10, String str, String str2, int i11, a3.t tVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + tVar + ", format_supported=" + d3.P.Z(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException a(r.b bVar) {
        return new ExoPlaybackException((String) d3.P.h(getMessage()), getCause(), this.f55558a, this.f55755j, this.f55756k, this.f55757l, this.f55758m, this.f55759n, bVar, this.f55559b, this.f55761p);
    }

    private ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, a3.t tVar, int i13, r.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        C13599a.a(!z10 || i11 == 1);
        C13599a.a(th2 != null || i11 == 3);
        this.f55755j = i11;
        this.f55756k = str2;
        this.f55757l = i12;
        this.f55758m = tVar;
        this.f55759n = i13;
        this.f55760o = bVar;
        this.f55761p = z10;
    }
}
