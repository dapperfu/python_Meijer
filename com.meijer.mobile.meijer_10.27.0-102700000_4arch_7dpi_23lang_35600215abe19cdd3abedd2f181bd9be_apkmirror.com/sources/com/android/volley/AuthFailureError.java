package com.android.volley;

import android.content.Intent;

/* loaded from: classes4.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: c, reason: collision with root package name */
    private Intent f62876c;

    public AuthFailureError() {
    }

    public AuthFailureError(h hVar) {
        super(hVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f62876c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
