package p6;

import o6.C16000d;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f155552a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.h f155553b;

    /* renamed from: c, reason: collision with root package name */
    private final C16000d f155554c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f155555d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public a a() {
        return this.f155552a;
    }

    public o6.h b() {
        return this.f155553b;
    }

    public C16000d c() {
        return this.f155554c;
    }

    public boolean d() {
        return this.f155555d;
    }

    public i(a aVar, o6.h hVar, C16000d c16000d, boolean z10) {
        this.f155552a = aVar;
        this.f155553b = hVar;
        this.f155554c = c16000d;
        this.f155555d = z10;
    }
}
