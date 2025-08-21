package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.C13452v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C13452v f125679a;

    public j(String message) {
        Intrinsics.j(message, "message");
        C13452v error = new C13452v(message);
        Intrinsics.j(error, "error");
        this.f125679a = error;
    }

    public final String toString() {
        return "Block{error=" + this.f125679a.getMessage() + '}';
    }
}
