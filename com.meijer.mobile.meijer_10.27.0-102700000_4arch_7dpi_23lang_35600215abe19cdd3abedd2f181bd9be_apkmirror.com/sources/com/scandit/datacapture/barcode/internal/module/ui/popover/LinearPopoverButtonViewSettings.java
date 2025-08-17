package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class LinearPopoverButtonViewSettings {

    /* renamed from: k, reason: collision with root package name */
    private static final Typeface f123359k = Typeface.DEFAULT;

    /* renamed from: l, reason: collision with root package name */
    private static final Lazy f123360l = LazyKt.b(C13255h.f123394a);

    /* renamed from: a, reason: collision with root package name */
    private final int f123361a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f123362b;

    /* renamed from: c, reason: collision with root package name */
    private final String f123363c;

    /* renamed from: d, reason: collision with root package name */
    private final String f123364d;

    /* renamed from: e, reason: collision with root package name */
    private final float f123365e;

    /* renamed from: f, reason: collision with root package name */
    private final int f123366f;

    /* renamed from: g, reason: collision with root package name */
    private final Typeface f123367g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f123368h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f123369i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f123370j;

    public LinearPopoverButtonViewSettings(int i10, Drawable drawable, String title, String str, float f10, int i11, Typeface typeface, boolean z10, boolean z11, int i12) {
        f10 = (i12 & 16) != 0 ? 10.0f : f10;
        i11 = (i12 & 32) != 0 ? ((Number) f123360l.getValue()).intValue() : i11;
        if ((i12 & 64) != 0) {
            typeface = f123359k;
            Intrinsics.i(typeface, "DEFAULT_TYPE_FACE");
        }
        z10 = (i12 & 256) != 0 ? true : z10;
        z11 = (i12 & 512) != 0 ? true : z11;
        Intrinsics.j(title, "title");
        Intrinsics.j(typeface, "typeface");
        this.f123361a = i10;
        this.f123362b = drawable;
        this.f123363c = title;
        this.f123364d = str;
        this.f123365e = f10;
        this.f123366f = i11;
        this.f123367g = typeface;
        this.f123368h = null;
        this.f123369i = z10;
        this.f123370j = z11;
    }

    public final Integer a() {
        return this.f123368h;
    }

    public final String b() {
        return this.f123364d;
    }

    public final boolean c() {
        return this.f123369i;
    }

    public final Drawable d() {
        return this.f123362b;
    }

    public final int e() {
        return this.f123361a;
    }

    public final int f() {
        return this.f123366f;
    }

    public final float g() {
        return this.f123365e;
    }

    public final String h() {
        return this.f123363c;
    }

    public final Typeface i() {
        return this.f123367g;
    }

    public final boolean j() {
        return this.f123370j;
    }
}
