package q6;

import p6.C16409d;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f157956a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.h f157957b;

    /* renamed from: c, reason: collision with root package name */
    private final C16409d f157958c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f157959d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public a a() {
        return this.f157956a;
    }

    public p6.h b() {
        return this.f157957b;
    }

    public C16409d c() {
        return this.f157958c;
    }

    public boolean d() {
        return this.f157959d;
    }

    public i(a aVar, p6.h hVar, C16409d c16409d, boolean z10) {
        this.f157956a = aVar;
        this.f157957b = hVar;
        this.f157958c = c16409d;
        this.f157959d = z10;
    }
}
