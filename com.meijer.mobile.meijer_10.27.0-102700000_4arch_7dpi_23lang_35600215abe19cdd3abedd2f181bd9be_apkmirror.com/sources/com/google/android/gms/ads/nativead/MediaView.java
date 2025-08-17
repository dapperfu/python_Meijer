package com.google.android.gms.ads.nativead;

import Ec.i;
import Qc.p;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.InterfaceC9198qh;

/* loaded from: classes4.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private i f64653a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f64654b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f64655c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f64656d;

    /* renamed from: e, reason: collision with root package name */
    private c f64657e;

    /* renamed from: f, reason: collision with root package name */
    private d f64658f;

    protected final synchronized void a(c cVar) {
        this.f64657e = cVar;
        if (this.f64654b) {
            cVar.f64679a.b(this.f64653a);
        }
    }

    protected final synchronized void b(d dVar) {
        this.f64658f = dVar;
        if (this.f64656d) {
            dVar.f64680a.c(this.f64655c);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f64656d = true;
        this.f64655c = scaleType;
        d dVar = this.f64658f;
        if (dVar != null) {
            dVar.f64680a.c(scaleType);
        }
    }

    public void setMediaContent(i iVar) {
        boolean zE;
        this.f64654b = true;
        this.f64653a = iVar;
        c cVar = this.f64657e;
        if (cVar != null) {
            cVar.f64679a.b(iVar);
        }
        if (iVar == null) {
            return;
        }
        try {
            InterfaceC9198qh interfaceC9198qhZza = iVar.zza();
            if (interfaceC9198qhZza != null) {
                if (!iVar.a()) {
                    if (iVar.zzb()) {
                        zE = interfaceC9198qhZza.E(com.google.android.gms.dynamic.d.F2(this));
                    }
                    removeAllViews();
                }
                zE = interfaceC9198qhZza.D(com.google.android.gms.dynamic.d.F2(this));
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
        return this.f64653a;
    }

    public MediaView(Context context) {
        super(context);
    }
}
