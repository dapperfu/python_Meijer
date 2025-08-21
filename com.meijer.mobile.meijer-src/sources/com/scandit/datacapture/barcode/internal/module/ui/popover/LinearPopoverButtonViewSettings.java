package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class LinearPopoverButtonViewSettings {

    /* renamed from: k, reason: collision with root package name */
    private static final Typeface f124311k = Typeface.DEFAULT;

    /* renamed from: l, reason: collision with root package name */
    private static final Lazy f124312l = LazyKt.b(C13388h.f124346a);

    /* renamed from: a, reason: collision with root package name */
    private final int f124313a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f124314b;

    /* renamed from: c, reason: collision with root package name */
    private final String f124315c;

    /* renamed from: d, reason: collision with root package name */
    private final String f124316d;

    /* renamed from: e, reason: collision with root package name */
    private final float f124317e;

    /* renamed from: f, reason: collision with root package name */
    private final int f124318f;

    /* renamed from: g, reason: collision with root package name */
    private final Typeface f124319g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f124320h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f124321i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f124322j;

    public LinearPopoverButtonViewSettings(int i10, Drawable drawable, String title, String str, float f10, int i11, Typeface typeface, boolean z10, boolean z11, int i12) {
        f10 = (i12 & 16) != 0 ? 10.0f : f10;
        i11 = (i12 & 32) != 0 ? ((Number) f124312l.getValue()).intValue() : i11;
        if ((i12 & 64) != 0) {
            typeface = f124311k;
            Intrinsics.i(typeface, "DEFAULT_TYPE_FACE");
        }
        z10 = (i12 & 256) != 0 ? true : z10;
        z11 = (i12 & 512) != 0 ? true : z11;
        Intrinsics.j(title, "title");
        Intrinsics.j(typeface, "typeface");
        this.f124313a = i10;
        this.f124314b = drawable;
        this.f124315c = title;
        this.f124316d = str;
        this.f124317e = f10;
        this.f124318f = i11;
        this.f124319g = typeface;
        this.f124320h = null;
        this.f124321i = z10;
        this.f124322j = z11;
    }

    public final Integer a() {
        return this.f124320h;
    }

    public final String b() {
        return this.f124316d;
    }

    public final boolean c() {
        return this.f124321i;
    }

    public final Drawable d() {
        return this.f124314b;
    }

    public final int e() {
        return this.f124313a;
    }

    public final int f() {
        return this.f124318f;
    }

    public final float g() {
        return this.f124317e;
    }

    public final String h() {
        return this.f124315c;
    }

    public final Typeface i() {
        return this.f124319g;
    }

    public final boolean j() {
        return this.f124322j;
    }
}
