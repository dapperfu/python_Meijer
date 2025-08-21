package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class XI implements InterfaceC7055Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceViewOnClickListenerC10040xJ f72153a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f72154b;

    XI(InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ, ViewGroup viewGroup) {
        this.f72153a = interfaceViewOnClickListenerC10040xJ;
        this.f72154b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final void a(MotionEvent motionEvent) {
        this.f72153a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final JSONObject zza() {
        return this.f72153a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final JSONObject zzb() {
        return this.f72153a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final void zzc() {
        AbstractC8042eh0 abstractC8042eh0 = UI.f71413o;
        Map mapZzm = this.f72153a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = abstractC8042eh0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzm.get((String) abstractC8042eh0.get(i10));
            i10++;
            if (obj != null) {
                this.f72153a.onClick(this.f72154b);
                return;
            }
        }
    }
}
