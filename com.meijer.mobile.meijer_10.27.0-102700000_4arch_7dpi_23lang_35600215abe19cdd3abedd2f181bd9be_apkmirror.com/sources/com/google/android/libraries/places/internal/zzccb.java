package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes6.dex */
public class zzccb {
    static {
        new zzcca();
    }

    public void zzb() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }
}
