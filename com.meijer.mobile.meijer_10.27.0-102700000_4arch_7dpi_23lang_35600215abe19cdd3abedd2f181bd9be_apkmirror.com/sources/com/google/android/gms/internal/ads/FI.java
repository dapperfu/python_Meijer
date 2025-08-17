package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface FI {
    void A(Bundle bundle);

    void B(String str);

    void C(View view, Map map);

    void D(View view, MotionEvent motionEvent, View view2);

    void E(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10);

    void F(InterfaceC7101Qh interfaceC7101Qh);

    void G(Mc.D0 d02);

    void H(View view);

    void I(Mc.A0 a02);

    boolean J(Bundle bundle);

    void K(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void L(Bundle bundle);

    JSONObject M(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    JSONObject N(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean r();

    boolean x();

    void y(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void z(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType);

    int zza();

    void zzh();

    void zzi();

    void zzj();

    void zzq();

    void zzs();

    void zzw();
}
