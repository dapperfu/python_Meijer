package com.google.android.gms.internal.ads;

import Rc.C5181c;
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
public final class C6734Bx implements InterfaceC7398Vk {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66465a;

    /* renamed from: b, reason: collision with root package name */
    private final C9524sb f66466b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f66467c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7398Vk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(C6836Ex c6836Ex) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C9845vb c9845vb = c6836Ex.f67525f;
        if (c9845vb == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f66466b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = c9845vb.f79921a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f66466b.b()).put("activeViewJSON", this.f66466b.d()).put("timestamp", c6836Ex.f67523d).put("adFormat", this.f66466b.a()).put("hashCode", this.f66466b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", c6836Ex.f67521b).put("isNative", this.f66466b.e()).put("isScreenOn", this.f66467c.isInteractive()).put("appMuted", Nc.v.v().e()).put("appVolume", Nc.v.v().a()).put("deviceVolume", C5181c.b(this.f66465a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f66465a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c9845vb.f79922b).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", c9845vb.f79923c.top).put("bottom", c9845vb.f79923c.bottom).put("left", c9845vb.f79923c.left).put("right", c9845vb.f79923c.right)).put("adBox", new JSONObject().put("top", c9845vb.f79924d.top).put("bottom", c9845vb.f79924d.bottom).put("left", c9845vb.f79924d.left).put("right", c9845vb.f79924d.right)).put("globalVisibleBox", new JSONObject().put("top", c9845vb.f79925e.top).put("bottom", c9845vb.f79925e.bottom).put("left", c9845vb.f79925e.left).put("right", c9845vb.f79925e.right)).put("globalVisibleBoxVisible", c9845vb.f79926f).put("localVisibleBox", new JSONObject().put("top", c9845vb.f79927g.top).put("bottom", c9845vb.f79927g.bottom).put("left", c9845vb.f79927g.left).put("right", c9845vb.f79927g.right)).put("localVisibleBoxVisible", c9845vb.f79928h).put("hitBox", new JSONObject().put("top", c9845vb.f79929i.top).put("bottom", c9845vb.f79929i.bottom).put("left", c9845vb.f79929i.left).put("right", c9845vb.f79929i.right)).put("screenDensity", this.f66465a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c6836Ex.f67520a);
            if (((Boolean) Oc.A.c().a(C8784lf.f77427y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c9845vb.f79931k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c6836Ex.f67524e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    public C6734Bx(Context context, C9524sb c9524sb) {
        this.f66465a = context;
        this.f66466b = c9524sb;
        this.f66467c = (PowerManager) context.getSystemService("power");
    }
}
