package com.google.android.gms.internal.ads;

import Pc.C4560c;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6609Bx implements InterfaceC7273Vk {

    /* renamed from: a, reason: collision with root package name */
    private final Context f65625a;

    /* renamed from: b, reason: collision with root package name */
    private final C9399sb f65626b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f65627c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7273Vk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(C6711Ex c6711Ex) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C9720vb c9720vb = c6711Ex.f66685f;
        if (c9720vb == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f65626b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = c9720vb.f79081a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f65626b.b()).put("activeViewJSON", this.f65626b.d()).put("timestamp", c6711Ex.f66683d).put("adFormat", this.f65626b.a()).put("hashCode", this.f65626b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", c6711Ex.f66681b).put("isNative", this.f65626b.e()).put("isScreenOn", this.f65627c.isInteractive()).put("appMuted", Lc.v.v().e()).put("appVolume", Lc.v.v().a()).put("deviceVolume", C4560c.b(this.f65625a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f65625a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c9720vb.f79082b).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", c9720vb.f79083c.top).put("bottom", c9720vb.f79083c.bottom).put("left", c9720vb.f79083c.left).put("right", c9720vb.f79083c.right)).put("adBox", new JSONObject().put("top", c9720vb.f79084d.top).put("bottom", c9720vb.f79084d.bottom).put("left", c9720vb.f79084d.left).put("right", c9720vb.f79084d.right)).put("globalVisibleBox", new JSONObject().put("top", c9720vb.f79085e.top).put("bottom", c9720vb.f79085e.bottom).put("left", c9720vb.f79085e.left).put("right", c9720vb.f79085e.right)).put("globalVisibleBoxVisible", c9720vb.f79086f).put("localVisibleBox", new JSONObject().put("top", c9720vb.f79087g.top).put("bottom", c9720vb.f79087g.bottom).put("left", c9720vb.f79087g.left).put("right", c9720vb.f79087g.right)).put("localVisibleBoxVisible", c9720vb.f79088h).put("hitBox", new JSONObject().put("top", c9720vb.f79089i.top).put("bottom", c9720vb.f79089i.bottom).put("left", c9720vb.f79089i.left).put("right", c9720vb.f79089i.right)).put("screenDensity", this.f65625a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c6711Ex.f66680a);
            if (((Boolean) Mc.A.c().a(C8659lf.f76587y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c9720vb.f79091k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c6711Ex.f66684e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    public C6609Bx(Context context, C9399sb c9399sb) {
        this.f65625a = context;
        this.f65626b = c9399sb;
        this.f65627c = (PowerManager) context.getSystemService("power");
    }
}
