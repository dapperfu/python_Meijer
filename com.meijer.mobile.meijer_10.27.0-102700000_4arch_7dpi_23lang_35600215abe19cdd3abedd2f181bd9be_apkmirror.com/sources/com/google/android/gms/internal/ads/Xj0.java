package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public interface Xj0 extends ExecutorService {
    com.google.common.util.concurrent.q i0(Callable callable);

    com.google.common.util.concurrent.q zza(Runnable runnable);
}
