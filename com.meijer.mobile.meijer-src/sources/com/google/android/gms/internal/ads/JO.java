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
import sd.C17067f;

/* loaded from: classes6.dex */
public final class JO {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68742a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f68743b;

    /* renamed from: e, reason: collision with root package name */
    private String f68746e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f68744c = ((Integer) Oc.A.c().a(C8784lf.f77113b9)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f68745d = ((Integer) Oc.A.c().a(C8784lf.f77127c9)).intValue();

    public final JSONObject a() throws JSONException {
        String strV;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f68742a;
            String str = this.f68743b.packageName;
            HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
            jSONObject.put("name", C17067f.a(context).d(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f68743b.packageName);
        Nc.v.t();
        Drawable drawable = null;
        try {
            strV = Rc.D0.V(this.f68742a);
        } catch (RemoteException unused2) {
            strV = null;
        }
        jSONObject.put("adMobAppId", strV);
        if (this.f68746e.isEmpty()) {
            try {
                drawable = C17067f.a(this.f68742a).e(this.f68743b.packageName).f153584b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f68744c, this.f68745d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f68744c, this.f68745d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f68746e = strEncodeToString;
        }
        if (!this.f68746e.isEmpty()) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, this.f68746e);
            jSONObject.put("iconWidthPx", this.f68744c);
            jSONObject.put("iconHeightPx", this.f68745d);
        }
        return jSONObject;
    }

    public JO(Context context) {
        this.f68742a = context;
        this.f68743b = context.getApplicationInfo();
    }
}
