package com.google.maps.android.ui;

import Md.C4188n;
import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes7.dex */
public class AnimationUtil {

    interface LatLngInterpolator {

        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f10, LatLng latLng, LatLng latLng2) {
                double d10 = latLng2.f84814a;
                double d11 = latLng.f84814a;
                double d12 = f10;
                double d13 = ((d10 - d11) * d12) + d11;
                double dSignum = latLng2.f84815b - latLng.f84815b;
                if (Math.abs(dSignum) > 180.0d) {
                    dSignum -= Math.signum(dSignum) * 360.0d;
                }
                return new LatLng(d13, (dSignum * d12) + latLng.f84815b);
            }
        }

        LatLng interpolate(float f10, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(C4188n c4188n, LatLng latLng) {
        animateMarkerTo(c4188n, latLng, 2000L);
    }

    public static void animateMarkerTo(final C4188n c4188n, final LatLng latLng, final long j10) {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng latLngB = c4188n.b();
        final Handler handler = new Handler();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        handler.post(new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1
            long elapsed;

            /* renamed from: t, reason: collision with root package name */
            float f90387t;

            /* renamed from: v, reason: collision with root package name */
            float f90388v;

            @Override // java.lang.Runnable
            public void run() {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                this.elapsed = jUptimeMillis2;
                float f10 = jUptimeMillis2 / j10;
                this.f90387t = f10;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f10);
                this.f90388v = interpolation;
                c4188n.n(linear.interpolate(interpolation, latLngB, latLng));
                if (this.f90387t < 1.0f) {
                    handler.postDelayed(this, 16L);
                }
            }
        });
    }
}
