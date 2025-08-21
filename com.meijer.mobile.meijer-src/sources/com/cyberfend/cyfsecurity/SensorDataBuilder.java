package com.cyberfend.cyfsecurity;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class SensorDataBuilder {

    /* renamed from: a, reason: collision with root package name */
    private static final SensorDataBuilder f65004a = new SensorDataBuilder();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f65005b;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SensorDataBuilder.f65005b) {
                return;
            }
            SensorDataBuilder.this.initializeKeyN();
        }
    }

    SensorDataBuilder() {
    }

    public final native synchronized String buildN(ArrayList<Pair<String, String>> arrayList);

    public final native synchronized void initializeKeyN();

    static {
        f65005b = false;
        try {
            System.loadLibrary("akamaibmp");
        } catch (Exception unused) {
            f65005b = true;
        } catch (UnsatisfiedLinkError unused2) {
            f65005b = true;
        }
    }

    public static SensorDataBuilder a() {
        return f65004a;
    }
}
