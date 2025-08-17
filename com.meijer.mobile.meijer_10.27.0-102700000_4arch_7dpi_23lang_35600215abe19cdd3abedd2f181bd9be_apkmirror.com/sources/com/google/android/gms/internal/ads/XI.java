package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class XI implements InterfaceC6930Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceViewOnClickListenerC9915xJ f71313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f71314b;

    XI(InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ, ViewGroup viewGroup) {
        this.f71313a = interfaceViewOnClickListenerC9915xJ;
        this.f71314b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final void a(MotionEvent motionEvent) {
        this.f71313a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final JSONObject zza() {
        return this.f71313a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final JSONObject zzb() {
        return this.f71313a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final void zzc() {
        AbstractC7917eh0 abstractC7917eh0 = UI.f70573o;
        Map mapZzm = this.f71313a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = abstractC7917eh0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzm.get((String) abstractC7917eh0.get(i10));
            i10++;
            if (obj != null) {
                this.f71313a.onClick(this.f71314b);
                return;
            }
        }
    }
}
