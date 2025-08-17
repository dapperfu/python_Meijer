package net.zetetic.database.sqlcipher;

import A4.d;

/* loaded from: classes13.dex */
public class SupportOpenHelperFactory implements d.c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f151406a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabaseHook f151407b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f151408c;

    /* renamed from: d, reason: collision with root package name */
    private final int f151409d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10) {
        this(bArr, sQLiteDatabaseHook, z10, -1);
    }

    @Override // A4.d.c
    public d a(d.b bVar) {
        int i10 = this.f151409d;
        return i10 == -1 ? new SupportHelper(bVar, this.f151406a, this.f151407b, this.f151408c) : new SupportHelper(bVar, this.f151406a, this.f151407b, this.f151408c, i10);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10, int i10) {
        this.f151406a = bArr;
        this.f151407b = sQLiteDatabaseHook;
        this.f151408c = z10;
        this.f151409d = i10;
    }
}
