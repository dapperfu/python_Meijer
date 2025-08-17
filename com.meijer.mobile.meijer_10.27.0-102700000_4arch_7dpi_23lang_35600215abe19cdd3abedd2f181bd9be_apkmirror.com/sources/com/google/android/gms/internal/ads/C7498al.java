package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.al, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7498al {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f72485a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7339Xk f72486b = new C7405Zk();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC7240Uk f72487c = new InterfaceC7240Uk() { // from class: com.google.android.gms.internal.ads.Yk
        @Override // com.google.android.gms.internal.ads.InterfaceC7240Uk
        public final Object a(JSONObject jSONObject) {
            return C7498al.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f72485a));
    }
}
