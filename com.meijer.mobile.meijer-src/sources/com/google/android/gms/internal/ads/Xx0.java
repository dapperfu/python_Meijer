package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class Xx0 extends AbstractC7650ay0 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f72282a;

    @Override // com.google.android.gms.internal.ads.AbstractC7650ay0
    public final void a(String str) {
        this.f72282a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }

    public Xx0(String str) {
        this.f72282a = Logger.getLogger(str);
    }
}
