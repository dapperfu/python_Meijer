package com.google.ads.interactivemedia.v3.impl;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import com.google.ads.interactivemedia.v3.internal.zzqm;
import com.google.ads.interactivemedia.v3.internal.zzrp;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class zzax extends ImageView implements View.OnClickListener {
    private final com.google.ads.interactivemedia.v3.impl.data.zzbe zza;
    private final zzbi zzb;
    private final String zzc;
    private final List zzd;
    private final zzgi zze;

    public static zzax zza(Context context, zzbi zzbiVar, com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, AbstractC5232j abstractC5232j, String str, List list, zzgi zzgiVar) {
        final zzax zzaxVar = new zzax(context, zzbiVar, zzbeVar, str, list, zzgiVar);
        zzaxVar.setOnClickListener(zzaxVar);
        abstractC5232j.c(new InterfaceC5227e() { // from class: com.google.ads.interactivemedia.v3.impl.zzaw
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j2) {
                if (abstractC5232j2.r()) {
                    this.zza.setImageBitmap((Bitmap) abstractC5232j2.n());
                } else {
                    zzfk.zzb("Image companion error", abstractC5232j2.m());
                }
            }
        });
        return zzaxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.zze.zzb(this.zza.clickThroughUrl())) {
            zzfk.zza("The click was ignored because no browser was available.");
            return;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((CompanionAdSlot.ClickListener) it.next()).onCompanionAdClick();
        }
    }

    private zzax(Context context, zzbi zzbiVar, com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, String str, List list, zzgi zzgiVar) {
        super(context);
        this.zzb = zzbiVar;
        this.zza = zzbeVar;
        this.zzc = str;
        this.zzd = list;
        this.zze = zzgiVar;
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        String strCompanionId = this.zza.companionId();
        if (!zzqm.zzc(strCompanionId)) {
            this.zzb.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.displayContainer, JavaScriptMessage.MsgType.companionView, this.zzc, zzrp.zze("companionId", strCompanionId)));
        }
    }
}
