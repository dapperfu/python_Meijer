package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6828Ig extends AbstractBinderC7065Pg {

    /* renamed from: i, reason: collision with root package name */
    private static final int f67660i;

    /* renamed from: j, reason: collision with root package name */
    static final int f67661j;

    /* renamed from: k, reason: collision with root package name */
    static final int f67662k;

    /* renamed from: a, reason: collision with root package name */
    private final String f67663a;

    /* renamed from: b, reason: collision with root package name */
    private final List f67664b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f67665c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int f67666d;

    /* renamed from: e, reason: collision with root package name */
    private final int f67667e;

    /* renamed from: f, reason: collision with root package name */
    private final int f67668f;

    /* renamed from: g, reason: collision with root package name */
    private final int f67669g;

    /* renamed from: h, reason: collision with root package name */
    private final int f67670h;

    public final List C9() {
        return this.f67664b;
    }

    public final int zzb() {
        return this.f67669g;
    }

    public final int zzc() {
        return this.f67670h;
    }

    public final int zzd() {
        return this.f67666d;
    }

    public final int zze() {
        return this.f67667e;
    }

    public final int zzf() {
        return this.f67668f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7099Qg
    public final String zzg() {
        return this.f67663a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7099Qg
    public final List zzh() {
        return this.f67665c;
    }

    static {
        int iRgb = Color.rgb(12, 174, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT);
        f67660i = iRgb;
        f67661j = Color.rgb(HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT);
        f67662k = iRgb;
    }

    public BinderC6828Ig(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.f67663a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            BinderC6896Kg binderC6896Kg = (BinderC6896Kg) list.get(i12);
            this.f67664b.add(binderC6896Kg);
            this.f67665c.add(binderC6896Kg);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = f67661j;
        }
        this.f67666d = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = f67662k;
        }
        this.f67667e = iIntValue2;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 12;
        }
        this.f67668f = iIntValue3;
        this.f67669g = i10;
        this.f67670h = i11;
    }
}
