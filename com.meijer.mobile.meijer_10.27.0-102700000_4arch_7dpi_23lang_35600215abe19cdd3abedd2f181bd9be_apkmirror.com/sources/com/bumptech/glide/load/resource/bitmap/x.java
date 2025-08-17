package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f64100e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f64101f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f64102g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile x f64103h;

    /* renamed from: b, reason: collision with root package name */
    private int f64105b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64106c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f64107d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f64104a = 20000;

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f64105b + 1;
            this.f64105b = i10;
            if (i10 >= 50) {
                this.f64105b = 0;
                int length = f64102g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f64106c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    FS.log_w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f64106c;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                FS.log_v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f64101f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                FS.log_v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                FS.log_v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                FS.log_v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                FS.log_v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            FS.log_v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f64100e = i10 < 29;
        f64101f = i10 >= 28;
        f64102g = new File("/proc/self/fd");
    }

    private boolean a() {
        return f64100e && !this.f64107d.get();
    }

    public static x b() {
        if (f64103h == null) {
            synchronized (x.class) {
                try {
                    if (f64103h == null) {
                        f64103h = new x();
                    }
                } finally {
                }
            }
        }
        return f64103h;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    x() {
    }

    private int c() {
        if (e()) {
            return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        }
        return this.f64104a;
    }

    @TargetApi(26)
    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        p7.l.a();
        this.f64107d.set(true);
    }
}
