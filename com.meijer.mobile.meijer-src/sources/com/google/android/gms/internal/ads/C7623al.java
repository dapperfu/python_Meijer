package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.al, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7623al {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f73325a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7464Xk f73326b = new C7530Zk();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC7365Uk f73327c = new InterfaceC7365Uk() { // from class: com.google.android.gms.internal.ads.Yk
        @Override // com.google.android.gms.internal.ads.InterfaceC7365Uk
        public final Object a(JSONObject jSONObject) {
            return C7623al.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f73325a));
    }
}
