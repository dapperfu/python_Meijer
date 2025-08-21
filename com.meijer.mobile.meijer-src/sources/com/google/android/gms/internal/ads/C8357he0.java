package com.google.android.gms.internal.ads;

import android.os.IBinder;
import fsimpl.C14170dq;

/* renamed from: com.google.android.gms.internal.ads.he0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8357he0 extends AbstractC7085Me0 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f75594a;

    /* renamed from: b, reason: collision with root package name */
    private String f75595b;

    /* renamed from: c, reason: collision with root package name */
    private int f75596c;

    /* renamed from: d, reason: collision with root package name */
    private float f75597d;

    /* renamed from: e, reason: collision with root package name */
    private int f75598e;

    /* renamed from: f, reason: collision with root package name */
    private String f75599f;

    /* renamed from: g, reason: collision with root package name */
    private byte f75600g;

    C8357he0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 a(String str) {
        this.f75599f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 b(String str) {
        this.f75595b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 c(int i10) {
        this.f75600g = (byte) (this.f75600g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 d(int i10) {
        this.f75596c = i10;
        this.f75600g = (byte) (this.f75600g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 e(float f10) {
        this.f75597d = f10;
        this.f75600g = (byte) (this.f75600g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 f(int i10) {
        this.f75600g = (byte) (this.f75600g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 h(int i10) {
        this.f75598e = i10;
        this.f75600g = (byte) (this.f75600g | C14170dq.SCREEN);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7085Me0 g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f75594a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7085Me0
    public final AbstractC7119Ne0 i() {
        IBinder iBinder;
        if (this.f75600g == 31 && (iBinder = this.f75594a) != null) {
            return new C8569je0(iBinder, this.f75595b, this.f75596c, this.f75597d, 0, 0, null, this.f75598e, null, this.f75599f, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f75594a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f75600g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f75600g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f75600g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f75600g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f75600g & C14170dq.SCREEN) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
