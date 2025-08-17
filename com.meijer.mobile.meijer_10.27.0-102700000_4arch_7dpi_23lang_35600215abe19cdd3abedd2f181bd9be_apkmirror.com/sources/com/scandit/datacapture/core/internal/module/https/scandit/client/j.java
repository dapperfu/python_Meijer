package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.C13319v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C13319v f124727a;

    public j(String message) {
        Intrinsics.j(message, "message");
        C13319v error = new C13319v(message);
        Intrinsics.j(error, "error");
        this.f124727a = error;
    }

    public final String toString() {
        return "Block{error=" + this.f124727a.getMessage() + '}';
    }
}
