package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class JO {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67902a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f67903b;

    /* renamed from: e, reason: collision with root package name */
    private String f67906e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f67904c = ((Integer) Mc.A.c().a(C8659lf.f76273b9)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f67905d = ((Integer) Mc.A.c().a(C8659lf.f76287c9)).intValue();

    public final JSONObject a() throws JSONException {
        String strV;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f67902a;
            String str = this.f67903b.packageName;
            HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
            jSONObject.put("name", C16519f.a(context).d(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f67903b.packageName);
        Lc.v.t();
        Drawable drawable = null;
        try {
            strV = Pc.D0.V(this.f67902a);
        } catch (RemoteException unused2) {
            strV = null;
        }
        jSONObject.put("adMobAppId", strV);
        if (this.f67906e.isEmpty()) {
            try {
                drawable = C16519f.a(this.f67902a).e(this.f67903b.packageName).f153139b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f67904c, this.f67905d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f67904c, this.f67905d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f67906e = strEncodeToString;
        }
        if (!this.f67906e.isEmpty()) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, this.f67906e);
            jSONObject.put("iconWidthPx", this.f67904c);
            jSONObject.put("iconHeightPx", this.f67905d);
        }
        return jSONObject;
    }

    public JO(Context context) {
        this.f67902a = context;
        this.f67903b = context.getApplicationInfo();
    }
}
