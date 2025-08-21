package ab;

import bb.C6346c;

/* renamed from: ab.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5677b extends g {

    /* renamed from: m, reason: collision with root package name */
    private long f45346m;

    public AbstractC5677b(C6346c c6346c, bb.e eVar, String str) {
        this(c6346c, eVar, str, 90000000L);
    }

    public AbstractC5677b(C6346c c6346c, bb.e eVar, String str, long j10) {
        super(c6346c, eVar, str);
        this.f45346m = j10;
    }

    @Override // ab.g
    public long z() {
        return this.f45346m;
    }

    @Override // ab.g
    protected final long A() {
        return z() / 12;
    }

    @Override // ab.AbstractC5678c
    public long o() {
        return Math.min(w(), z() / 25);
    }
}
