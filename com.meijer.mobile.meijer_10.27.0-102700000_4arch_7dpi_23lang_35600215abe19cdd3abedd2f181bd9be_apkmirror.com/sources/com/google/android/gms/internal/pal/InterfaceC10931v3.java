package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.pal.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC10931v3 {
    String a(Context context);

    @Deprecated
    String b(Context context, byte[] bArr);

    String c(Context context, View view, Activity activity);

    String d(Context context, String str, View view, Activity activity);

    void e(View view);

    void f(MotionEvent motionEvent);
}
