package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8802lo {

    /* renamed from: a, reason: collision with root package name */
    private final int f77476a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77477b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77478c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77479d;

    /* renamed from: e, reason: collision with root package name */
    private int f77480e;

    /* renamed from: f, reason: collision with root package name */
    private int f77481f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f77482g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC8042eh0 f77483h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC8042eh0 f77484i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC8042eh0 f77485j;

    /* renamed from: k, reason: collision with root package name */
    private final int f77486k;

    /* renamed from: l, reason: collision with root package name */
    private final int f77487l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC8042eh0 f77488m;

    /* renamed from: n, reason: collision with root package name */
    private final C7064Ln f77489n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC8042eh0 f77490o;

    /* renamed from: p, reason: collision with root package name */
    private int f77491p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap f77492q;

    /* renamed from: r, reason: collision with root package name */
    private final HashSet f77493r;

    @Deprecated
    public C8802lo() {
        this.f77476a = a.e.API_PRIORITY_OTHER;
        this.f77477b = a.e.API_PRIORITY_OTHER;
        this.f77478c = a.e.API_PRIORITY_OTHER;
        this.f77479d = a.e.API_PRIORITY_OTHER;
        this.f77480e = a.e.API_PRIORITY_OTHER;
        this.f77481f = a.e.API_PRIORITY_OTHER;
        this.f77482g = true;
        this.f77483h = AbstractC8042eh0.t();
        this.f77484i = AbstractC8042eh0.t();
        this.f77485j = AbstractC8042eh0.t();
        this.f77486k = a.e.API_PRIORITY_OTHER;
        this.f77487l = a.e.API_PRIORITY_OTHER;
        this.f77488m = AbstractC8042eh0.t();
        this.f77489n = C7064Ln.f69267b;
        this.f77490o = AbstractC8042eh0.t();
        this.f77491p = 0;
        this.f77492q = new HashMap();
        this.f77493r = new HashSet();
    }

    public final C8802lo f(int i10, int i11, boolean z10) {
        this.f77480e = i10;
        this.f77481f = i11;
        this.f77482g = true;
        return this;
    }

    public final C8802lo e(Context context) {
        CaptioningManager captioningManager;
        if ((OV.f69931a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f77491p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f77490o = AbstractC8042eh0.u(locale.toLanguageTag());
            }
        }
        return this;
    }

    protected C8802lo(C7098Mo c7098Mo) {
        this.f77476a = a.e.API_PRIORITY_OTHER;
        this.f77477b = a.e.API_PRIORITY_OTHER;
        this.f77478c = a.e.API_PRIORITY_OTHER;
        this.f77479d = a.e.API_PRIORITY_OTHER;
        this.f77480e = c7098Mo.f69563i;
        this.f77481f = c7098Mo.f69564j;
        this.f77482g = c7098Mo.f69565k;
        this.f77483h = c7098Mo.f69566l;
        this.f77484i = c7098Mo.f69567m;
        this.f77485j = c7098Mo.f69569o;
        this.f77486k = a.e.API_PRIORITY_OTHER;
        this.f77487l = a.e.API_PRIORITY_OTHER;
        this.f77488m = c7098Mo.f69573s;
        this.f77489n = c7098Mo.f69574t;
        this.f77490o = c7098Mo.f69575u;
        this.f77491p = c7098Mo.f69576v;
        this.f77493r = new HashSet(c7098Mo.f69554C);
        this.f77492q = new HashMap(c7098Mo.f69553B);
    }
}
