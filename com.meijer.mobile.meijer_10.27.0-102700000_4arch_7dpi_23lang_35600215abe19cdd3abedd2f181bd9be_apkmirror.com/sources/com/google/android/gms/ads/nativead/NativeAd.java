package com.google.android.gms.ads.nativead;

import Ec.p;
import android.os.Bundle;

/* loaded from: classes4.dex */
public abstract class NativeAd {

    public static abstract class a {
    }

    public static abstract class b {
    }

    public interface c {
        void a(NativeAd nativeAd);
    }

    public abstract String a();

    public abstract String b();

    public abstract p c();

    protected abstract Object d();

    protected abstract void recordEvent(Bundle bundle);
}
