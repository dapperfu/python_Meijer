package com.google.android.gms.internal.ads;

import android.os.IBinder;
import fsimpl.C14045dq;

/* renamed from: com.google.android.gms.internal.ads.he0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8232he0 extends AbstractC6960Me0 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f74754a;

    /* renamed from: b, reason: collision with root package name */
    private String f74755b;

    /* renamed from: c, reason: collision with root package name */
    private int f74756c;

    /* renamed from: d, reason: collision with root package name */
    private float f74757d;

    /* renamed from: e, reason: collision with root package name */
    private int f74758e;

    /* renamed from: f, reason: collision with root package name */
    private String f74759f;

    /* renamed from: g, reason: collision with root package name */
    private byte f74760g;

    C8232he0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 a(String str) {
        this.f74759f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 b(String str) {
        this.f74755b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 c(int i10) {
        this.f74760g = (byte) (this.f74760g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 d(int i10) {
        this.f74756c = i10;
        this.f74760g = (byte) (this.f74760g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 e(float f10) {
        this.f74757d = f10;
        this.f74760g = (byte) (this.f74760g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 f(int i10) {
        this.f74760g = (byte) (this.f74760g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 h(int i10) {
        this.f74758e = i10;
        this.f74760g = (byte) (this.f74760g | C14045dq.SCREEN);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6960Me0 g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f74754a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6960Me0
    public final AbstractC6994Ne0 i() {
        IBinder iBinder;
        if (this.f74760g == 31 && (iBinder = this.f74754a) != null) {
            return new C8444je0(iBinder, this.f74755b, this.f74756c, this.f74757d, 0, 0, null, this.f74758e, null, this.f74759f, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f74754a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f74760g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f74760g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f74760g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f74760g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f74760g & C14045dq.SCREEN) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
