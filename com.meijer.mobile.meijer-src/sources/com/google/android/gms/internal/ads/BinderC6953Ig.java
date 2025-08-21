package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6953Ig extends AbstractBinderC7190Pg {

    /* renamed from: i, reason: collision with root package name */
    private static final int f68500i;

    /* renamed from: j, reason: collision with root package name */
    static final int f68501j;

    /* renamed from: k, reason: collision with root package name */
    static final int f68502k;

    /* renamed from: a, reason: collision with root package name */
    private final String f68503a;

    /* renamed from: b, reason: collision with root package name */
    private final List f68504b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f68505c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int f68506d;

    /* renamed from: e, reason: collision with root package name */
    private final int f68507e;

    /* renamed from: f, reason: collision with root package name */
    private final int f68508f;

    /* renamed from: g, reason: collision with root package name */
    private final int f68509g;

    /* renamed from: h, reason: collision with root package name */
    private final int f68510h;

    public final List C9() {
        return this.f68504b;
    }

    public final int zzb() {
        return this.f68509g;
    }

    public final int zzc() {
        return this.f68510h;
    }

    public final int zzd() {
        return this.f68506d;
    }

    public final int zze() {
        return this.f68507e;
    }

    public final int zzf() {
        return this.f68508f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7224Qg
    public final String zzg() {
        return this.f68503a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7224Qg
    public final List zzh() {
        return this.f68505c;
    }

    static {
        int iRgb = Color.rgb(12, 174, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT);
        f68500i = iRgb;
        f68501j = Color.rgb(HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT);
        f68502k = iRgb;
    }

    public BinderC6953Ig(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.f68503a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            BinderC7021Kg binderC7021Kg = (BinderC7021Kg) list.get(i12);
            this.f68504b.add(binderC7021Kg);
            this.f68505c.add(binderC7021Kg);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = f68501j;
        }
        this.f68506d = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = f68502k;
        }
        this.f68507e = iIntValue2;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 12;
        }
        this.f68508f = iIntValue3;
        this.f68509g = i10;
        this.f68510h = i11;
    }
}
