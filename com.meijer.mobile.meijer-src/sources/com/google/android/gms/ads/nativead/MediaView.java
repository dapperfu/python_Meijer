package com.google.android.gms.ads.nativead;

import Gc.i;
import Sc.p;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.InterfaceC9323qh;

/* loaded from: classes4.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private i f65493a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f65494b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f65495c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f65496d;

    /* renamed from: e, reason: collision with root package name */
    private c f65497e;

    /* renamed from: f, reason: collision with root package name */
    private d f65498f;

    protected final synchronized void a(c cVar) {
        this.f65497e = cVar;
        if (this.f65494b) {
            cVar.f65519a.b(this.f65493a);
        }
    }

    protected final synchronized void b(d dVar) {
        this.f65498f = dVar;
        if (this.f65496d) {
            dVar.f65520a.c(this.f65495c);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f65496d = true;
        this.f65495c = scaleType;
        d dVar = this.f65498f;
        if (dVar != null) {
            dVar.f65520a.c(scaleType);
        }
    }

    public void setMediaContent(i iVar) {
        boolean zE;
        this.f65494b = true;
        this.f65493a = iVar;
        c cVar = this.f65497e;
        if (cVar != null) {
            cVar.f65519a.b(iVar);
        }
        if (iVar == null) {
            return;
        }
        try {
            InterfaceC9323qh interfaceC9323qhZza = iVar.zza();
            if (interfaceC9323qhZza != null) {
                if (!iVar.a()) {
                    if (iVar.zzb()) {
                        zE = interfaceC9323qhZza.E(com.google.android.gms.dynamic.d.I2(this));
                    }
                    removeAllViews();
                }
                zE = interfaceC9323qhZza.D(com.google.android.gms.dynamic.d.I2(this));
                if (zE) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            p.e("", e10);
        }
    }

    public i getMediaContent() {
        return this.f65493a;
    }

    public MediaView(Context context) {
        super(context);
    }
}
