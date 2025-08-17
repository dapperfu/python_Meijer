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
public class C8677lo {

    /* renamed from: a, reason: collision with root package name */
    private final int f76636a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76637b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76638c;

    /* renamed from: d, reason: collision with root package name */
    private final int f76639d;

    /* renamed from: e, reason: collision with root package name */
    private int f76640e;

    /* renamed from: f, reason: collision with root package name */
    private int f76641f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f76642g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC7917eh0 f76643h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC7917eh0 f76644i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC7917eh0 f76645j;

    /* renamed from: k, reason: collision with root package name */
    private final int f76646k;

    /* renamed from: l, reason: collision with root package name */
    private final int f76647l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC7917eh0 f76648m;

    /* renamed from: n, reason: collision with root package name */
    private final C6939Ln f76649n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC7917eh0 f76650o;

    /* renamed from: p, reason: collision with root package name */
    private int f76651p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap f76652q;

    /* renamed from: r, reason: collision with root package name */
    private final HashSet f76653r;

    @Deprecated
    public C8677lo() {
        this.f76636a = a.e.API_PRIORITY_OTHER;
        this.f76637b = a.e.API_PRIORITY_OTHER;
        this.f76638c = a.e.API_PRIORITY_OTHER;
        this.f76639d = a.e.API_PRIORITY_OTHER;
        this.f76640e = a.e.API_PRIORITY_OTHER;
        this.f76641f = a.e.API_PRIORITY_OTHER;
        this.f76642g = true;
        this.f76643h = AbstractC7917eh0.t();
        this.f76644i = AbstractC7917eh0.t();
        this.f76645j = AbstractC7917eh0.t();
        this.f76646k = a.e.API_PRIORITY_OTHER;
        this.f76647l = a.e.API_PRIORITY_OTHER;
        this.f76648m = AbstractC7917eh0.t();
        this.f76649n = C6939Ln.f68427b;
        this.f76650o = AbstractC7917eh0.t();
        this.f76651p = 0;
        this.f76652q = new HashMap();
        this.f76653r = new HashSet();
    }

    public final C8677lo f(int i10, int i11, boolean z10) {
        this.f76640e = i10;
        this.f76641f = i11;
        this.f76642g = true;
        return this;
    }

    public final C8677lo e(Context context) {
        CaptioningManager captioningManager;
        if ((OV.f69091a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f76651p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f76650o = AbstractC7917eh0.u(locale.toLanguageTag());
            }
        }
        return this;
    }

    protected C8677lo(C6973Mo c6973Mo) {
        this.f76636a = a.e.API_PRIORITY_OTHER;
        this.f76637b = a.e.API_PRIORITY_OTHER;
        this.f76638c = a.e.API_PRIORITY_OTHER;
        this.f76639d = a.e.API_PRIORITY_OTHER;
        this.f76640e = c6973Mo.f68723i;
        this.f76641f = c6973Mo.f68724j;
        this.f76642g = c6973Mo.f68725k;
        this.f76643h = c6973Mo.f68726l;
        this.f76644i = c6973Mo.f68727m;
        this.f76645j = c6973Mo.f68729o;
        this.f76646k = a.e.API_PRIORITY_OTHER;
        this.f76647l = a.e.API_PRIORITY_OTHER;
        this.f76648m = c6973Mo.f68733s;
        this.f76649n = c6973Mo.f68734t;
        this.f76650o = c6973Mo.f68735u;
        this.f76651p = c6973Mo.f68736v;
        this.f76653r = new HashSet(c6973Mo.f68714C);
        this.f76652q = new HashMap(c6973Mo.f68713B);
    }
}
