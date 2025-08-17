package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8453jj implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75510a;

    public C8453jj(Context context) {
        this.f75510a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        Pc.p0.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            Lc.v.t();
            Pc.D0.t(this.f75510a, intent);
        } catch (RuntimeException e10) {
            Qc.p.h("Failed to open Share Sheet", e10);
            Lc.v.s().x(e10, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
